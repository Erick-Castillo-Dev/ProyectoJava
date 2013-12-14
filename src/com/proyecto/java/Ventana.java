package com.proyecto.java;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Ventana extends JFrame implements ActionListener{
	
	private JTextField text1,text2,text3;
	private JLabel label1,label2,label3;
	private JButton sum,res,mul,div,pot,raz,fac,mario;
	private JMenuBar menuBar;
    private JMenu actionMenu,actionMenu2,actionMenu3,actionMenu4,actionMenu5,actionMenu6;
    private JMenuItem salir,funTri,formu,area,esta,cuadro,matriz;
    private VentanaForm vFor;
    private VentanaTri vTri;
    private VentanaArea vArea;
    private VventanaEstadistica vEsta;
    OperacionesBasicas op = new OperacionesBasicas();
    FormulasMat fm = new FormulasMat();
    Trigonometria tri = new Trigonometria();
    Estadistica es = new Estadistica();
    AreasPerimetros a = new AreasPerimetros();
    Matriz ma = new Matriz();
    Runtime aplicacion = Runtime.getRuntime();
	
	public Ventana(){
		super("Ventana jeje :)");
		this.definirVentana();
		this.setLocationRelativeTo(null);
		this.setSize(450, 250);
	    Dimension dimPantalla = Toolkit.getDefaultToolkit().getScreenSize();
	 	Dimension dimVentana = this.getSize();
	    this.setLocation((dimPantalla.width - dimVentana.width) / 2 , (dimPantalla.height - dimVentana.height) / 2 ); 
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	private void definirVentana() {
		
		this.setLayout(new GridBagLayout());  
  		GridBagConstraints gbc = new  GridBagConstraints();
		
		menuBar = new JMenuBar();
    	this.setJMenuBar(menuBar);
    	actionMenu = new JMenu("Trigonometria");
    	menuBar.add(actionMenu);
    	actionMenu2 = new JMenu("Formulas");
    	menuBar.add(actionMenu2);
    	actionMenu4 = new JMenu("Areas y Perimetros");
    	menuBar.add(actionMenu4);
    	actionMenu5 = new JMenu("Estadistica");
    	menuBar.add(actionMenu5);
    	actionMenu6 = new JMenu("Otros");
    	menuBar.add(actionMenu6);
    	actionMenu3 = new JMenu("Salir");
    	menuBar.add(actionMenu3);
    	salir = new JMenuItem("Salir");
    	funTri = new JMenuItem("Trigonometria");
    	formu = new JMenuItem("Formulas Matematicas");
    	area = new JMenuItem("Areas y Perimetros");
    	esta = new JMenuItem("Estadistica");
    	cuadro = new JMenuItem("Cuadro mágico");
    	matriz = new JMenuItem("Multiplicacion de matricez");
    	actionMenu.add(funTri);
    	actionMenu2.add(formu);
    	actionMenu4.add(area);
    	actionMenu3.add(salir);
    	actionMenu5.add(esta);
    	actionMenu6.add(cuadro);
    	actionMenu6.add(matriz);
    	
    	label1 = new JLabel();
    	label1.setText("Primer Número");
    	
    	gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.weightx = 1.0;
		gbc.weighty = 1.0;
		gbc.fill = GridBagConstraints.NONE;
		add(label1,gbc);
		
		label2 = new JLabel();
		label2.setText("Segundo Número");
		
		gbc.gridx = 1;
		gbc.gridy = 0;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.weightx = 1.0;
		gbc.weighty = 1.0;
		gbc.fill = GridBagConstraints.NONE;
		add(label2,gbc);
		
		label3 = new JLabel();
		label3.setText("Resultado");
  		
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
		
		sum = new JButton("Suma");
		
		gbc.gridx = 0;
		gbc.gridy = 2;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.weightx = 1.0;
		gbc.weighty = 1.0;
		gbc.fill = GridBagConstraints.NONE;
		add(sum,gbc);
		
		res = new JButton("Restar");
		
		gbc.gridx = 1;
		gbc.gridy = 2;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.weightx = 1.0;
		gbc.weighty = 1.0;
		gbc.fill = GridBagConstraints.NONE;
		add(res,gbc);
		
		mul = new JButton("Multiplicar");
		
		gbc.gridx = 2;
		gbc.gridy = 2;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.weightx = 1.0;
		gbc.weighty = 1.0;
		gbc.fill = GridBagConstraints.NONE;
		add(mul,gbc);
		
		div = new JButton("Dividir");
		
		gbc.gridx = 0;
		gbc.gridy = 3;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.weightx = 1.0;
		gbc.weighty = 1.0;
		gbc.fill = GridBagConstraints.NONE;
		add(div,gbc);
		
		pot = new JButton("Potencia");
		
		gbc.gridx = 1;
		gbc.gridy = 3;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.weightx = 1.0;
		gbc.weighty = 1.0;
		gbc.fill = GridBagConstraints.NONE;
		add(pot,gbc);
		
		raz = new JButton("Raiz");
		
		gbc.gridx = 2;
		gbc.gridy = 3;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.weightx = 1.0;
		gbc.weighty = 1.0;
		gbc.fill = GridBagConstraints.NONE;
		add(raz,gbc);
		
		fac = new JButton("Factorial");
		
		gbc.gridx = 2;
		gbc.gridy = 4;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.weightx = 1.0;
		gbc.weighty = 1.0;
		gbc.fill = GridBagConstraints.NONE;
		add(fac,gbc);
		
       /* mario = new JButton("Mario Kart");
		
		gbc.gridx = 0;
		gbc.gridy = 4;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.weightx = 1.0;
		gbc.weighty = 1.0;
		gbc.fill = GridBagConstraints.NONE;
		add(mario,gbc);*/
		
		salir.addActionListener(this);
    	funTri.addActionListener(this);
    	formu.addActionListener(this);
    	area.addActionListener(this);
    	esta.addActionListener(this);
    	cuadro.addActionListener(this);
    	matriz.addActionListener(this);
    	
    	sum.addActionListener(this);
    	res.addActionListener(this);
    	mul.addActionListener(this);
    	div.addActionListener(this);
    	pot.addActionListener(this);
    	raz.addActionListener(this);
    	fac.addActionListener(this);
    	//mario.addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == funTri){
			vTri = new VentanaTri(this);
		}else if(e.getSource() == formu){
			vFor = new VentanaForm(this);
		}else if (e.getSource() == salir){
			System.exit(0);
		}else if(e.getSource()==cuadro){
			int numero = Integer.parseInt(JOptionPane.showInputDialog("Numero inpar de filas y columnas del cuadro mágico"));
			ma.cuadroMagico(numero);
		}else if(e.getSource()==matriz){
			ma.mulMatriz(Integer.parseInt(JOptionPane.showInputDialog("Numero de filas")), Integer.parseInt(JOptionPane.showInputDialog("Numero de columnas")));
		}else if(e.getSource()==esta){
			vEsta = new VventanaEstadistica(this);
		}else if(e.getSource()==sum){
			text3.setText(""+op.sumar(Double.parseDouble(text1.getText()), Double.parseDouble(text2.getText())));
		}else if(e.getSource()==res){
			text3.setText(""+op.restar(Double.parseDouble(text1.getText()), Double.parseDouble(text2.getText())));
		}else if(e.getSource()==mul){
			text3.setText(""+op.multiplicar(Double.parseDouble(text1.getText()), Double.parseDouble(text2.getText())));
		}else if(e.getSource()==div){
			text3.setText(""+op.dividir(Double.parseDouble(text1.getText()), Double.parseDouble(text2.getText())));
		}else if(e.getSource()==pot){
			text3.setText(""+op.potencia(Double.parseDouble(text1.getText()), Double.parseDouble(text2.getText())));
		}else if(e.getSource()==raz){
			text3.setText(""+op.raiz(Double.parseDouble(text1.getText())));
		}else if(e.getSource()==fac){
			text3.setText(""+op.factorial(Integer.parseInt(text1.getText())));
		}else if (e.getSource()==mario){ 
	        try{aplicacion.exec("C:/Mario.exe"); }
	        catch(Exception s){}
		}else if(e.getSource()==area){
			vArea = new VentanaArea(this);
		}else if(e.getSource()== vFor.getFormula()){
			double x1 = fm.formulaGeneralx1(Double.parseDouble(vFor.getText1().getText()),Double.parseDouble(vFor.getText2().getText()),Double.parseDouble(vFor.getText3().getText()));
			double x2 = fm.formulaGeneralx2(Double.parseDouble(vFor.getText1().getText()),Double.parseDouble(vFor.getText2().getText()),Double.parseDouble(vFor.getText3().getText()));
			vFor.getText1().setText(""+x1);
			vFor.getText2().setText(""+x1);
			vFor.getText3().setText("");
		}else if(e.getSource()==vTri.getSeno()){
			vTri.getHipo().setText(""+tri.seno(Double.parseDouble(vTri.getHipo().getText()), Double.parseDouble(vTri.getCop().getText())));
		}else if(e.getSource()==vTri.getCoseno()){
			vTri.getHipo().setText(""+tri.coseno(Double.parseDouble(vTri.getHipo().getText()), Double.parseDouble(vTri.getCay().getText())));
		}else if(e.getSource()==vTri.getTangente()){
			vTri.getHipo().setText(""+tri.tangente(Double.parseDouble(vTri.getCay().getText()), Double.parseDouble(vTri.getCop().getText())));
		}else if(e.getSource()==vTri.getTangente()){
			vTri.getHipo().setText(""+tri.cotangente(Double.parseDouble(vTri.getCay().getText()), Double.parseDouble(vTri.getCop().getText())));
		}else if(e.getSource()==vTri.getCotangente()){
			vTri.getHipo().setText(""+tri.seno(Double.parseDouble(vTri.getHipo().getText()), Double.parseDouble(vTri.getCop().getText())));
		}else if(e.getSource()==vTri.getSecante()){
			vTri.getHipo().setText(""+tri.coseno(Double.parseDouble(vTri.getHipo().getText()), Double.parseDouble(vTri.getCay().getText())));
		}
	}

}
