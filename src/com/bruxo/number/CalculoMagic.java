package com.bruxo.number;

import java.util.List;

public class CalculoMagic {

	public static int calculo(List<int[]> intervalos) {
		
		int resultado = 0;
	    for(int i = 0; i < intervalos.size(); i++){
            int[] intervalo = intervalos.get(i);
            for (int j = intervalo[0]; j <= intervalo[1]; j++) {
                double raiz = Math.sqrt(j);
                if(raiz % (int) raiz == 0){
                    boolean primo = true;
                    for (int k = 2; k < (int)raiz; k++) {
                        if(raiz % k == 0){
                            primo=false;
                        }
                    }
                    if(primo==true){
                        resultado++;
                        //System.out.println(j);
                    }
                }
            }
        }
		return resultado;
	}
}
