package tw.EEIT.tutor;

import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Brad25 extends JFrame {
	private int a = 0;
	public Brad25() {
		super("Brad25");

		setLayout(new BorderLayout());
		JPanel panel = new JPanel();
		add(panel, BorderLayout.CENTER);
		
		MyMouseListenter listenter = new MyMouseListenter();
		panel.addMouseListener(listenter);
		panel.addMouseMotionListener(listenter);
		
		setVisible(true);
		setSize(480, 480);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	
	public static void main(String[] args) {
		new Brad25();
	}
	private void m1() {System.out.println("m1():" + a);}
	
	class MyMouseListenter extends MouseAdapter {
		@Override
		public void mouseClicked(MouseEvent e) {
			a++;
			m1();
		}
		@Override
		public void mouseDragged(MouseEvent e) {
			System.out.println(e.getX() + "," + e.getY());
		}
	}
}







