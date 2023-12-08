package tw.EEIT.classes;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Timer;
import java.util.TimerTask;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class GamePanel extends JPanel {
	private BallImg[] ballImg;
	private int viewW, viewH;
	private Timer timer;
	private LinkedList<BallTask> balls;

	public GamePanel() {
		setBackground(Color.YELLOW);

		try {
			ballImg = new BallImg[3];
			ballImg[0] = new BallImg(ImageIO.read(new File("dir1/ball0.png")));
			ballImg[1] = new BallImg(ImageIO.read(new File("dir1/ball1.png")));
			ballImg[2] = new BallImg(ImageIO.read(new File("dir1/ball2.png")));

//			ballX = ballY = 10;
//			dx = dy = 2;
		} catch (IOException e) {
			System.out.println(e);
			System.exit(0);
		}

		balls = new LinkedList<>();
		
		addMouseListener(new MyListenter());

		timer = new Timer();
//		timer.schedule(new BallTask(), 1 * 1000, 10);
		timer.schedule(new RefreshTask(), 0, 16);
	}

	private class MyListenter extends MouseAdapter {
		@Override
		public void mousePressed(MouseEvent e) {
			createball(e.getX(), e.getY());
		}
	}

	private void createball(int x, int y) {
		int ballIndex = (int) (Math.random() * 3);

		BallTask ball = new BallTask(x - (int) (ballImg[ballIndex].W / 2.0), y - (int) (ballImg[ballIndex].H / 2.0),
				(int) (Math.random() * 6), (int) (Math.random() * 6), ballIndex);
		timer.schedule(ball, 500, 30);
		balls.add(ball);
	}

	private class RefreshTask extends TimerTask {
		@Override
		public void run() {
			repaint();
		}
	}

	private class BallTask extends TimerTask {
		int x, y, dx, dy, ballIndex;

		BallTask(int x, int y, int dx, int dy, int ballIndex) {
			this.x = x;
			this.y = y;
			this.dx = dx;
			this.dy = dy;
			this.ballIndex = ballIndex;
		}

		@Override
		public void run() {
			if (x <= 0 || x + ballImg[ballIndex].W >= viewW) {
				dx *= -1;
			}
			if (y <= 0 || y + ballImg[ballIndex].H >= viewH) {
				dy *= -1;
			}
			x += dx;
			y += dy;
			// repaint();
		}
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		viewW = getWidth();
		viewH = getHeight();

		Graphics2D g2d = (Graphics2D) g;
		
		for (BallTask ball: balls) {
			g2d.drawImage(ballImg[ball.ballIndex].img, ball.x, ball.y, null);
		}
		
	}
}

class BallImg {
	BufferedImage img;
	int W, H;

	BallImg(BufferedImage img) {
		this.img = img;
		W = img.getWidth();
		H = img.getHeight();
	}
}
