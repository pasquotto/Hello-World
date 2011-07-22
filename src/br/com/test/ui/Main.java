package br.com.test.ui;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;

public class Main extends JFrame {

	private static final long serialVersionUID = -7265255258335314486L;

	public Main(String tittle) {
		
		Container c = getFlowContainer();
		c.add(new JLabelExtension("texto do JLabel"));
		c.add(new JTextFieldExtension("Texto do JTextField"));

		this.open(tittle);
	}

	private Container getFlowContainer() {
		Container c = this.getContentPane();
		c.setLayout(new FlowLayout());
		return c;
	}

	private void open(String tittle) {
		this.setTitle(tittle);
		this.setSize(300, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new Main("Window tittle");
	}

}
