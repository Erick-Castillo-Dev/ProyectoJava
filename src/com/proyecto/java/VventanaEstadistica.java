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

public class VventanaEstadistica extends JFrame implements ActionListener{
	
	Ventana ven;
	private JTextField text1;
	private JLabel label1;
	private JButton moda,mediana,media;
	private VventanaEstadistica vEsta;
	Estadistica es = new Estadistica();
	
	public VventanaEstadistica(Ventana ven){
        super("Estadistica");
		
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
    	label1.setText("Numero de elementos");
    	
    	gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.weightx = 1.0;
		gbc.weighty = 1.0;
		gbc.fill = GridBagConstraints.NONE;
		add(label1,gbc);
		
		text1 = new JTextField(20);
    	
    	gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.weightx = 1.0;
		gbc.weighty = 1.0;
		gbc.fill = GridBagConstraints.NONE;
		add(text1,gbc);
		
		moda = new JButton("Moda");
		
		gbc.gridx = 0;
		gbc.gridy = 2;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.weightx = 1.0;
		gbc.weighty = 1.0;
		gbc.fill = GridBagConstraints.NONE;
		add(moda,gbc);
		
		mediana = new JButton("Mediana");
		
		gbc.gridx = 1;
		gbc.gridy = 2;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.weightx = 1.0;
		gbc.weighty = 1.0;
		gbc.fill = GridBagConstraints.NONE;
		add(mediana,gbc);
		
		media = new JButton("Media");
		
		gbc.gridx = 2;
		gbc.gridy = 2;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.weightx = 1.0;
		gbc.weighty = 1.0;
		gbc.fill = GridBagConstraints.NONE;
		add(media,gbc);
		moda.addActionListener(this);
		mediana.addActionListener(this);
		media.addActionListener(this);
	}
	public JButton getModa() {
		return moda;
	}

	public void setModa(JButton moda) {
		this.moda = moda;
	}
	public JButton getMediana() {
		return mediana;
	}

	public void setMediana(JButton mediana) {
		this.mediana = mediana;
	}
	public JButton getMedia() {
		return media;
	}

	public void setMedia(JButton moda) {
		this.media = media;
	}
	public JTextField getText1() {
		return text1;
	}

	public void setText1(JTextField text1) {
		this.text1 = text1;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==moda){
			text1.setText(""+es.moda(Integer.parseInt(text1.getText())));
		}else if(e.getSource()==media){
			text1.setText(""+es.media(Integer.parseInt(text1.getText())));
		}else if(e.getSource()==mediana){
			text1.setText(""+es.mediana(Integer.parseInt(text1.getText())));
		}
		
	}
}
