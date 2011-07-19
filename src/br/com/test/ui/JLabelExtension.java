package br.com.test.ui;

import java.awt.font.TextAttribute;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JLabel;

final class JLabelExtension extends JLabel {
	private static final long serialVersionUID = -5175562297033400074L;

	JLabelExtension(String text) {
		super(text);
		this.setOpaque(false);
		this.setBorder(null);
		Map<TextAttribute, Object> attributes = new HashMap<TextAttribute, Object>();
		attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
		this.setFont(this.getFont().deriveFont(attributes));
	}
}