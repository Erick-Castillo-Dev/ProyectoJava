package com.proyecto.java;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class VentanaArea extends JFrame implements ActionListener{
	
	private Ventana ven;
	private JTextField text1,text2,text3;
	private JLabel label1,label2,label3;
	private JButton btTriAre,btTriPe,btTriAre1,btTriPe1,btRecAre,btRecPe,btCirAre,btCirPe,btPenAre,btPenPe;
	AreasPerimetros a = new AreasPerimetros();
	
	public VentanaArea(Ventana ven){
        super("Areas y Perimetros");
		
		this.ven = ven;
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setLayout(new FlowLayout());
		this.setSize(600, 300);
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
    	label1.setText("Lado 1, Base, radio");
    	
    	gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.weightx = 1.0;
		gbc.weighty = 1.0;
		gbc.fill = GridBagConstraints.NONE;
		add(label1,gbc);
		
		label2 = new JLabel();
		label2.setText("Lado 2, Altura");
		
		gbc.gridx = 1;
		gbc.gridy = 0;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.weightx = 1.0;
		gbc.weighty = 1.0;
		gbc.fill = GridBagConstraints.NONE;
		add(label2,gbc);
		
		label3 = new JLabel();
		label3.setText("Lado 3, Apotema");
  		
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
		
		btTriAre = new JButton("Area Triangulo Diferentes");
  		
  		gbc.gridx = 0;
		gbc.gridy = 2;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.weightx = 1.0;
		gbc.weighty = 1.0;
		gbc.fill = GridBagConstraints.NONE;
		add(btTriAre,gbc);
		
		btTriPe = new JButton("Perimetro Triangulo Diferentes");
  		
  		gbc.gridx = 1;
		gbc.gridy = 2;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.weightx = 1.0;
		gbc.weighty = 1.0;
		gbc.fill = GridBagConstraints.NONE;
		add(btTriPe,gbc);
		
		btTriAre1 = new JButton("Perimetro Triangulo");
  		
  		gbc.gridx = 0;
		gbc.gridy = 3;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.weightx = 1.0;
		gbc.weighty = 1.0;
		gbc.fill = GridBagConstraints.NONE;
		add(btTriAre1,gbc);
		
		btTriPe1 = new JButton("Perimetro Triangulo");
  		
  		gbc.gridx = 1;
		gbc.gridy = 3;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.weightx = 1.0;
		gbc.weighty = 1.0;
		gbc.fill = GridBagConstraints.NONE;
		add(btTriPe1,gbc);
		
		btRecAre = new JButton("Area Rectangulo");
  		
  		gbc.gridx = 0;
		gbc.gridy = 4;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.weightx = 1.0;
		gbc.weighty = 1.0;
		gbc.fill = GridBagConstraints.NONE;
		add(btRecAre,gbc);
		
		btRecPe = new JButton("Perimetro Rectangulo");
  		
  		gbc.gridx = 1;
		gbc.gridy = 4;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.weightx = 1.0;
		gbc.weighty = 1.0;
		gbc.fill = GridBagConstraints.NONE;
		add(btRecPe,gbc);
		
		btCirAre = new JButton("Area circulo");
  		
  		gbc.gridx = 0;
		gbc.gridy = 5;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.weightx = 1.0;
		gbc.weighty = 1.0;
		gbc.fill = GridBagConstraints.NONE;
		add(btCirAre,gbc);
		
		btCirPe = new JButton("Perimetro Circulo");
  		
  		gbc.gridx = 1;
		gbc.gridy = 5;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.weightx = 1.0;
		gbc.weighty = 1.0;
		gbc.fill = GridBagConstraints.NONE;
		add(btCirPe,gbc);
		
		btPenAre = new JButton("Area Pentagono");
  		
  		gbc.gridx = 0;
		gbc.gridy = 6;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.weightx = 1.0;
		gbc.weighty = 1.0;
		gbc.fill = GridBagConstraints.NONE;
		add(btPenAre,gbc);
		
		btPenPe = new JButton("Perimetro Pentangono");
  		
  		gbc.gridx = 1;
		gbc.gridy = 6;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.weightx = 1.0;
		gbc.weighty = 1.0;
		gbc.fill = GridBagConstraints.NONE;
		add(btPenPe,gbc);
		btTriAre.addActionListener(this);
		btTriPe.addActionListener(this);
		btTriAre1.addActionListener(this);
		btTriPe1.addActionListener(this);
		btRecAre.addActionListener(this);
		btRecPe.addActionListener(this);
		btCirAre.addActionListener(this);
		btCirPe.addActionListener(this);
		btPenAre.addActionListener(this);
		btPenPe.addActionListener(this);
		
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
	public JButton getbtTriAre() {
		return btTriAre;
	}

	public void setbtTriAre(JButton btTriAre) {
		this.btTriAre = btTriAre;
	}
	public JButton getbtTriPe() {
		return btTriPe;
	}

	public void setbtTriPe(JButton btTriPe) {
		this.btTriPe = btTriPe;
	}
	public JButton getbtTriAre1() {
		return btTriAre1;
	}

	public void setbtTriAre1(JButton btTriAre1) {
		this.btTriAre1 = btTriAre1;
	}
	public JButton getbtTriPe1() {
		return btTriPe1;
	}

	public void setbtTriPe1(JButton btTriPe1) {
		this.btTriPe1 = btTriPe1;
	}
	public JButton getbtRecAre() {
		return btTriAre;
	}

	public void setbtRecAre(JButton btrecAre) {
		this.btRecAre = btRecAre;
	}
	public JButton getbtRecPe() {
		return btRecPe;
	}

	public void setbtRecPe(JButton btRecPe) {
		this.btRecPe = btRecPe;
	}
	public JButton getbtCirAre() {
		return btCirAre;
	}

	public void setbtCirAre(JButton btCirAre) {
		this.btCirAre = btCirAre;
	}
	public JButton getbtCirPe() {
		return btCirPe;
	}

	public void setbtCirPe(JButton btCirPe) {
		this.btCirPe = btCirPe;
	}
	public JButton getbtPenAre() {
		return btTriAre;
	}

	public void setbtPenAre(JButton btPenAre) {
		this.btPenAre = btPenAre;
	}
	public JButton getbtPenPe() {
		return btPenPe;
	}

	public void setbtPenPe(JButton btPenPe) {
		this.btPenPe = btPenPe;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btTriAre){
			text3.setText(""+a.areaTriLadi(Double.parseDouble(text1.getText()), Double.parseDouble(text2.getText())));
		}else if(e.getSource()==btTriPe){
			text3.setText(""+a.perimetroTriLadi(Double.parseDouble(text1.getText()), Double.parseDouble(text2.getText()), Double.parseDouble(text3.getText())));
		}else if(e.getSource()==btTriAre1){
			text3.setText(""+a.areaTri(Double.parseDouble(text1.getText()), Double.parseDouble(text2.getText())));
		}else if(e.getSource()==btTriPe1){
			text3.setText(""+a.perimetroTri(Double.parseDouble(text1.getText())));
		}else if(e.getSource()==btRecAre){
			text3.setText(""+a.areaRectangulo(Double.parseDouble(text1.getText()), Double.parseDouble(text2.getText())));
		}else if(e.getSource()==btRecPe){
			text3.setText(""+a.perimetroRectangulo(Double.parseDouble(text1.getText()), Double.parseDouble(text2.getText())));
		}else if(e.getSource()==btCirAre){
			text3.setText(""+a.areaCirculo(Double.parseDouble(text1.getText())));
		}else if(e.getSource()==btCirPe){
			text3.setText(""+a.perimetroCirculo(Double.parseDouble(text1.getText())));
		}else if(e.getSource()==btPenAre){
			text3.setText(""+a.areaPoligono(Double.parseDouble(text3.getText()), Double.parseDouble(text1.getText()), Double.parseDouble(text2.getText())));
		}else if(e.getSource()==btPenPe){
			text3.setText(""+a.perimetroPoligono(Integer.parseInt(text1.getText()), Double.parseDouble(text2.getText())));
		}
	}
}
