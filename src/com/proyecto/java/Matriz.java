package com.proyecto.java;

import javax.swing.JOptionPane;
public class Matriz {
	public void cuadroMagico(int num){
		if (num%2==0){
			JOptionPane.showMessageDialog(null, "Introduce un numero inpar");
		}else{
			cuadroMagicoInPar(num);
		}
	}
	public void cuadroMagicoInPar(int num){
		int cont, posL, posC;
		 int matriz[][] = new int[num][num];
	    int n = num;
	    int cuad = n*n;
	    
	    cont = 1;
	    posL = 1;     
	    posC = n/2+1; 
	    while ( cont<=cuad ) {
	    	int pos = ((posL-1)*n) + (posC-1);
		    matriz[((posL-1))][(posC-1)] = cont;
	        if ( cont%n == 0 ) { 
	            posL++; 
	        } else {
	            posL--;
	            if ( posL < 1 ) posL = n; 
	            posC++;
	            if ( posC > n ) posC = 1;
	        }
	        cont++;
	    }
	    String cadena="";
	    for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				cadena=cadena+""+matriz[i][j]+" ";
			}
			cadena=cadena+"\n";
		}
	    JOptionPane.showMessageDialog(null, cadena);
	}
	public void mulMatriz(int num1, int num2){
		int suma = 0;
		int A[][] = new int[num1][num1];
		int B[][] = new int[num2][num2];
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A.length; j++) {
			A[i][j]=Integer.parseInt(JOptionPane.showInputDialog("Introduce un valor de la primera matriz"));
		}
		}
		for (int i = 0; i < B.length; i++) {
			for (int j = 0; j < B.length; j++) {
			B[i][j]=Integer.parseInt(JOptionPane.showInputDialog("Introduce un valor de la segunda matriz"));
		}
		}
        int result[][] = new int[A.length][B.length];  
        for(int i = 0; i < A.length; i++){  
            for(int j = 0; j < B.length; j++){  
                suma = 0;  
                for(int k = 0; k < B.length; k++){  
                    suma += A[i][k] * B[k][j];  
                }  
                result[i][j] = suma;  
            }  
        }
        String cadena="";
        for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result.length; j++) {
			cadena=cadena+""+result[i][j]+" ";
			}
			cadena=cadena+"\n";
        }
        JOptionPane.showMessageDialog(null, cadena);
	}
}
