package br.com.test.ui;

import java.awt.font.TextAttribute;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JTextField;

final class JTextFieldExtension extends JTextField {
	
	private static final long serialVersionUID = 3183339743087080556L;

	JTextFieldExtension(String text) {
		super(text);
		this.setOpaque(false);
		this.setBorder(null);
		this.setEditable(false);
		Map<TextAttribute, Object> attributes = new HashMap<TextAttribute, Object>();
		attributes.put(TextAttribute.UNDERLINE,
				TextAttribute.UNDERLINE_ON);
		this.setFont(this.getFont().deriveFont(attributes));
	}
}