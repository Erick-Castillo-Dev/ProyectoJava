package com.proyecto.java;

import javax.swing.JOptionPane;

public class Estadistica {

	public int moda(int num){
		int maximaVecesQueSeRepite = 0;
		int moda = 0;
		int m[] = new int[num];
		
		for (int i = 0; i < m.length; i++) {
			m[i]=Integer.parseInt(JOptionPane.showInputDialog("Introduce un valor"));
		}
		
		for(int i=0; i<m.length; i++){
			int vecesQueSeRepite = 0;
				for(int j=0; j<m.length; j++){
					if(m[i] == m[j])
						vecesQueSeRepite++;
					}
					if(vecesQueSeRepite > maximaVecesQueSeRepite){
						moda = m[i];
						maximaVecesQueSeRepite = vecesQueSeRepite;
				}
		}
		return moda;
	}
	
	public double media(int num){
		int m[] = new int[num];
		
		for (int i = 0; i < m.length; i++) {
			m[i]=Integer.parseInt(JOptionPane.showInputDialog("Introduce un valor"));
		}
		int suma=0;
		for (int i=0; i< m.length; i++){
		suma+=m[i];
		}
		double res=suma/num;
		return res;
	}
	
	public double mediana(int numero){
		double num=0.0;
		int m[] = new int[numero];
		for (int i = 0; i < m.length; i++) {
			m[i]=Integer.parseInt(JOptionPane.showInputDialog("Introduce un valor"));
		}
		int auxiliar;    
	      for(int i = 2; i < m.length; i++)  
	      {  
	        for(int j = 0;j < m.length-i;j++)  
	        {  
	          if(m[j] > m[j+1])  
	          {  
	            auxiliar = m[j];  
	            m[j] = m[j+1];  
	            m[j+1] = auxiliar;  
	          }     
	        }  
	      }
	    if(numero%2==0){
	    	num=m[numero/2]+m[(numero/2)+1];
	    }else{
	    	num=m[numero/2];
	    }
	    return num;
	}
}
