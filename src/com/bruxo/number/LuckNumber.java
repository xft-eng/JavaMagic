package com.bruxo.number;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LuckNumber {

		
		public static void main(String[] args){
	   
	        Scanner in = new Scanner(System.in);
	        List<int[]> intervalos = new ArrayList<>();
	        
	        System.out.print("Quantos intervalos deseja inserir? ");
	        int qtde = in.nextInt();
	        for (int i = 0; i < qtde; i++) {
	            int[] intervalo = new int[2];
	            intervalo[0] = in.nextInt();
	            intervalo[1] = in.nextInt();
	            intervalos.add(intervalo);
	        }
	 
	        System.out.println("Resultado: " + CalculoMagic.calculo(intervalos));
	        
	        in.close();
	}

}
