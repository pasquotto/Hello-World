package br.com.test.ui;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.font.TextAttribute;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Main extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7265255258335314486L;

	public Main() {
		
		Container c = getFlowContainer();
		
		c.add(createLabel());
		c.add(createJTextField());
		
		System.out.println("test");
		System.out.println("test2");
		open();
	}

	private JComponent createLabel() {
		JComponent lbl = new JLabel("texto do JLabel");
		lbl.setOpaque(false);
		lbl.setBorder(null);
		Map<TextAttribute, Object> attributes = new HashMap<TextAttribute, Object>();
		attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
		lbl.setFont(lbl.getFont().deriveFont(attributes));
		//lbl.setEditable(false);
		return lbl;
	}

	private JTextField createJTextField() {
		JTextField jt = new JTextField("xxx");
		jt.setOpaque(false);
		jt.setBorder(null);
		jt.setEditable(false);
		//jt.setMinimumSize(new java.awt.Dimension(200, 24));
		//jt.setPreferredSize(new java.awt.Dimension(270, 24));
		Map<TextAttribute, Object> attributes = new HashMap<TextAttribute, Object>();
		attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
		jt.setFont(jt.getFont().deriveFont(attributes));
		
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
