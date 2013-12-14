package com.proyecto.java;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class VentanaForm extends JFrame{
	
	private Ventana ven;
	private JTextField text1,text2,text3;
	private JLabel label1,label2,label3;
	private JButton formula;
	
	public VentanaForm(Ventana ven){
        super("Formulas matematicas");
		
		this.ven = ven;
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setLayout(new FlowLayout());
		this.setSize(400, 150);
		Dimension dimPantalla = Toolkit.getDefaultToolkit().getScreenSize();
	 	Dimension dimVentana = this.getSize();
	    this.setLocation((dimPantalla.width - dimVentana.width) / 2 , (dimPantalla.height - dimVentana.height) / 2 );
		this.setComponentes();
		this.setVisible(true);
		
	}

	private void setComponentes() {
		
		this.setLayout(new GridBagLayout());  
  		GridBagConstraints gbc = new  GridBagConstraints();
		
		label1 = new JLabel();
    	label1.setText("Número");
    	
    	gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.weightx = 1.0;
		gbc.weighty = 1.0;
		gbc.fill = GridBagConstraints.NONE;
		add(label1,gbc);
		
		label2 = new JLabel();
		label2.setText("Número");
		
		gbc.gridx = 1;
		gbc.gridy = 0;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.weightx = 1.0;
		gbc.weighty = 1.0;
		gbc.fill = GridBagConstraints.NONE;
		add(label2,gbc);
		
		label3 = new JLabel();
		label3.setText("Número");
  		
		gbc.gridx = 2;
		gbc.gridy = 0;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.weightx = 1.0;
		gbc.weighty = 1.0;
		gbc.fill = GridBagConstraints.NONE;
		add(label3,gbc);
		
  		text1 = new JTextField(10);
  		
  		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.weightx = 1.0;
		gbc.weighty = 1.0;
		gbc.fill = GridBagConstraints.NONE;
		add(text1,gbc);
		
		text2 = new JTextField(10);
  		
  		gbc.gridx = 1;
		gbc.gridy = 1;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.weightx = 1.0;
		gbc.weighty = 1.0;
		gbc.fill = GridBagConstraints.NONE;
		add(text2,gbc);
		
        text3 = new JTextField(10);
  		
  		gbc.gridx = 2;
		gbc.gridy = 1;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.weightx = 1.0;
		gbc.weighty = 1.0;
		gbc.fill = GridBagConstraints.NONE;
		add(text3,gbc);
		
		formula = new JButton("Formula general");
		
		gbc.gridx = 0;
		gbc.gridy = 2;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.weightx = 1.0;
		gbc.weighty = 1.0;
		gbc.fill = GridBagConstraints.NONE;
		add(formula,gbc);
		formula.addActionListener(ven);
	}
	
	public JButton getFormula() {
		return formula;
	}

	public void setFormula(JButton Formula) {
		this.formula = formula;
	}
	public JTextField getText1() {
		return text1;
	}

	public void setText1(JTextField text1) {
		this.text1 = text1;
	}
	public JTextField getText2() {
		return text2;
	}

	public void setText2(JTextField text2) {
		this.text2 = text2;
	}
	public JTextField getText3() {
		return text3;
	}

	public void setText3(JTextField text3) {
		this.text3 = text3;
	}

}
