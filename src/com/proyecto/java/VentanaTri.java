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

public class VentanaTri extends JFrame{
	
	private Ventana ven;
	private JTextField hipo,cop,cay;
	private JLabel label1,label2,label3;
	private JButton seno,coseno,tangente,cotangente,secante,cosecante;
	
	public VentanaTri(Ventana ven){
        super("Trigonometria");
		
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
    	label1.setText("Hipotenusa");
    	
    	gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.weightx = 1.0;
		gbc.weighty = 1.0;
		gbc.fill = GridBagConstraints.NONE;
		add(label1,gbc);
		
		label2 = new JLabel();
		label2.setText("Cateto Opuesto");
		
		gbc.gridx = 1;
		gbc.gridy = 0;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.weightx = 1.0;
		gbc.weighty = 1.0;
		gbc.fill = GridBagConstraints.NONE;
		add(label2,gbc);
		
		label3 = new JLabel();
		label3.setText("Cateto Adyasente");
  		
		gbc.gridx = 2;
		gbc.gridy = 0;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.weightx = 1.0;
		gbc.weighty = 1.0;
		gbc.fill = GridBagConstraints.NONE;
		add(label3,gbc);
		
  		hipo = new JTextField(10);
  		
  		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.weightx = 1.0;
		gbc.weighty = 1.0;
		gbc.fill = GridBagConstraints.NONE;
		add(hipo,gbc);
		
		cop = new JTextField(10);
  		
  		gbc.gridx = 1;
		gbc.gridy = 1;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.weightx = 1.0;
		gbc.weighty = 1.0;
		gbc.fill = GridBagConstraints.NONE;
		add(cop,gbc);
		
        cay = new JTextField(10);
  		
  		gbc.gridx = 2;
		gbc.gridy = 1;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.weightx = 1.0;
		gbc.weighty = 1.0;
		gbc.fill = GridBagConstraints.NONE;
		add(cay,gbc);
		
		seno = new JButton("Seno");
		
		gbc.gridx = 0;
		gbc.gridy = 2;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.weightx = 1.0;
		gbc.weighty = 1.0;
		gbc.fill = GridBagConstraints.NONE;
		add(seno,gbc);
		
        coseno = new JButton("Coseno");
		
		gbc.gridx = 1;
		gbc.gridy = 2;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.weightx = 1.0;
		gbc.weighty = 1.0;
		gbc.fill = GridBagConstraints.NONE;
		add(coseno,gbc);
		
		tangente = new JButton("Tangente");
		
		gbc.gridx = 2;
		gbc.gridy = 2;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.weightx = 1.0;
		gbc.weighty = 1.0;
		gbc.fill = GridBagConstraints.NONE;
		add(tangente,gbc);
		
		cotangente = new JButton("Cotangente");
		
		gbc.gridx = 0;
		gbc.gridy = 3;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.weightx = 1.0;
		gbc.weighty = 1.0;
		gbc.fill = GridBagConstraints.NONE;
		add(cotangente,gbc);
		
		secante = new JButton("Secante");
		
		gbc.gridx = 1;
		gbc.gridy = 3;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.weightx = 1.0;
		gbc.weighty = 1.0;
		gbc.fill = GridBagConstraints.NONE;
		add(secante,gbc);
		
		cosecante = new JButton("Cosecante");
		
		gbc.gridx = 2;
		gbc.gridy = 3;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.weightx = 1.0;
		gbc.weighty = 1.0;
		gbc.fill = GridBagConstraints.NONE;
		add(cosecante,gbc);
		
		seno.addActionListener(ven);
		coseno.addActionListener(ven);
		tangente.addActionListener(ven);
		cotangente.addActionListener(ven);
		secante.addActionListener(ven);
		cosecante.addActionListener(ven);
	}
	public JTextField getHipo() {
		return hipo;
	}

	public void setHipo(JTextField hipo) {
		this.hipo = hipo;
	}
	public JTextField getCop() {
		return cop;
	}

	public void setCop(JTextField cop) {
		this.cop = cop;
	}
	public JTextField getCay() {
		return cay;
	}

	public void setCay(JTextField cay) {
		this.cay = cay;
	}
	public JButton getSeno() {
		return seno;
	}

	public void setSeno(JButton seno) {
		this.seno = seno;
	}
	public JButton getCoseno() {
		return coseno;
	}

	public void setCoseno(JButton coseno) {
		this.coseno = coseno;
	}
	public JButton getTangente() {
		return tangente;
	}

	public void setTangente(JButton tangente) {
		this.tangente = tangente;
	}
	public JButton getCotangente() {
		return cotangente;
	}

	public void setCotangente(JButton cotangente) {
		this.cotangente = cotangente;
	}
	public JButton getSecante() {
		return secante;
	}

	public void setSecante(JButton secante) {
		this.secante = secante;
	}
	public JButton getCosecante() {
		return cosecante;
	}

	public void setCosecante(JButton cosecante) {
		this.cosecante = cosecante;
	}

}
