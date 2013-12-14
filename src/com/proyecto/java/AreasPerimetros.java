package com.proyecto.java;

public class AreasPerimetros {
	double res=0.0;
	public double areaTriLadi(double base, double altura){
		res=(base*altura)/2;
		return res;
	}
	
	public double perimetroTriLadi(double l1, double l2, double l3){
		res=l1+l2+l3;
		return res;
	}
	
	public double areaTri(double base, double altura){
		res=(base*altura)/2;
		return res;
	}
	
	public double perimetroTri(double l){
		res=l*l*l;
		return res;
	}
	
	public double areaRectangulo(double base, double altura){
		res=base*altura;
		return res;
	}
	
	public double perimetroRectangulo(double lado1, double lado2){
		res=(2*lado1)+(2*lado2);
		return res;
	}
	
	public double areaCirculo(double radio){
		res=3.1416*(radio*radio);
		return res;
	}
	
	public double perimetroCirculo(double radio){
		res=(2*3.1416)*radio;
		return res;
	}
	
	public double areaPoligono(double apotema, double lados, double lado){
		res=((lados*lado)*apotema)/2;
		return res;
	}
	
	public double perimetroPoligono(int lados, double lado){
		res=lados*lado;
		return res;
	}
	
}
