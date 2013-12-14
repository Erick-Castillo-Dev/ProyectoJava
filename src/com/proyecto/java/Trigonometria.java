package com.proyecto.java;

public class Trigonometria {
	double res=0.0;
	public double seno(double hipo, double op){
		res=op/hipo;
		return res;
	}
	
	public double coseno(double hipo, double ad){
		res=ad/hipo;
		return res;
	}
	
	public double tangente(double ad, double op){
		res=op/ad;
		return res;
	}
	
	public double cotangente(double ad, double op){
		res=1.0/(op/ad);
		return res;
	}
	
	public double secante(double hipo, double op){
		res=1.0/(op/hipo);
		return res;
	}
	
	public double cosecante(double hipo, double ad){
		res=1.0/(ad/hipo);
		return res;
	}
}
