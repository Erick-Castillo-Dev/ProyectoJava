package com.proyecto.java;

public class OperacionesBasicas {
	public double res=0.0;
	
	public double sumar(double n1, double n2){
		res=0.0;
		res=n1+n2;
		return res;
	}
	
	public double restar(double n1, double n2){
		res=0.0;
		res=n1-n2;
		return res;
	}
	
	public double multiplicar(double n1, double n2){
		res=0.0;
		res=n1*n2;
		return res;
	}
	
	public double dividir(double n1, double n2){
		res=0.0;
		res=n1/n2;
		return res;
	}
	
	public double potencia(double x,double p){
		res=1.0;
		for(int i=0;i<p;i++){
			res=res*x;
		}
		return res;
	}
	
	public double raiz(double r){
		res=0.0;
		res=Math.sqrt(r);
		return res;
	}
	
	public double factorial(int x){
		res=1.0;
		for(int i= x;i>0;i--){
			res=res*i;
		}
		return res;
	}
}
