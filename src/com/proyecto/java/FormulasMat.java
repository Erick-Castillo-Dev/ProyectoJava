package com.proyecto.java;

public class FormulasMat {

	double x1,x2;
	double n=-1.0;
	
	public double formulaGeneralx1(double a,double b, double c){
		double raiz=(b*b)-(4.0*(a*c));
		System.out.println(raiz);
		double deno=2*a;
		System.out.println(deno);
		x1=((n*b)-Math.sqrt(raiz))/deno;
		System.out.println(x1);
		return x1;
	}
	public double formulaGeneralx2(double a,double b, double c){
		double raiz=(b*b)-(4.0*(a*c));
		System.out.println(raiz);
		double deno=2*a;
		System.out.println(deno);
		x2=((n*b)+Math.sqrt(raiz))/deno;
		System.out.println(x2);
		return x2;
	}
}
