package tw.EEIT.tutor;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import tw.EEIT.classes.MyTable;

public class JDBC16 extends JFrame {
	private MyTable myTable;
	private JButton del;
	
	public JDBC16() {

		setLayout(new BorderLayout());
		
		del = new JButton("Del");
		
		myTable = new MyTable();
		JScrollPane jsp = new JScrollPane(myTable);
		add(jsp,BorderLayout.CENTER);
		
		JPanel top = new JPanel(new FlowLayout());
		top.add(del);
		add(top,BorderLayout.NORTH);
		
		del.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
					myTable.delData();
			}
		});

		setSize(800, 600);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new JDBC16();
	}

}
