package tw.EEIT.tutor;

import java.awt.BorderLayout;

import javax.swing.JFrame;

import tw.EEIT.classes.GamePanel;

public class MyGame extends JFrame {
	private GamePanel panel;

	public MyGame() {
		// super();
		super("遊戲");

		setLayout(new BorderLayout());
		panel = new GamePanel();
		add(panel, BorderLayout.CENTER);

		setSize(800, 600);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new MyGame();
	}

}
