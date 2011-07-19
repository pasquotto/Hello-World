package br.com.test.ui;

import java.awt.Container;
import java.awt.FlowLayout;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Main extends JFrame {

	private static final long serialVersionUID = -7265255258335314486L;

	public Main() {
		Container c = getFlowContainer();
		c.add(createLabel());
		c.add(createJTextField());

		open();
	}

	private JComponent createLabel() {
		JComponent lbl = new JLabelExtension("texto do JLabel");

		return lbl;
	}

	private JTextField createJTextField() {
		JTextField jt = new JTextFieldExtension("Texto do JTextField");
		return jt;
	}

	private Container getFlowContainer() {
		Container c = this.getContentPane();
		c.setLayout(new FlowLayout());
		return c;
	}

	private void open() {
		this.setSize(300, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new Main();
	}

}
