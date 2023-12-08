package tw.EEIT.classes;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.LinkedList;

import javax.swing.JPanel;

public class MyPanelV2 extends JPanel {
	private LinkedList<LinkedList<Point>> lines;
	
	
	public MyPanelV2() {
		setBackground(Color.YELLOW);
		
		lines = new LinkedList<>();
		
		
		MyMouseListenter listenter = new MyMouseListenter();
		addMouseListener(listenter);
		addMouseMotionListener(listenter);
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
//		System.out.println("ok");
		
		// DebugGraphics Graphics2D 
		/*if (g instanceof Graphics2D) {
			System.out.println("ok");
		}else {
			System.out.println("xx");
		}*/
		
		Graphics2D g2d = (Graphics2D)g;
		
		g2d.setColor(Color.BLUE);
		g2d.setStroke(new BasicStroke(4));
		
		
		for ( LinkedList<Point> line : lines) {
				for (int i=1; i<line.size(); i++) {
					Point p0 = line.get(i-1);
					Point p1 = line.get(i);
				g2d.drawLine(p0.x, p0.y, p1.x, p1.y);
			}
		}
		
		
	}
	
	private class MyMouseListenter extends MouseAdapter {
		@Override
		public void mousePressed(MouseEvent e) {
			Point point = new Point();
			point.x = e.getX() ; point.y = e.getY();
			
			LinkedList<Point> line = new LinkedList<>();
			line.add(point);
			lines.add(line);
		}
		@Override
		public void mouseDragged(MouseEvent e) {
			Point point = new Point();
			point.x = e.getX() ; point.y = e.getY();
			lines.getLast().add(point);
			repaint();
		}
	}
	
	class Point {
		int x, y;
	}
}
