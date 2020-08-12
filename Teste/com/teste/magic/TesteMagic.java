package com.teste.magic;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.bruxo.number.CalculoMagic;
import com.bruxo.number.LuckNumber;


public class TesteMagic extends LuckNumber {
	
	
	@Test
	public void TesteIntervalo1() {
			List<int[]> intervalos = new ArrayList<>();
			int[] intervalo = {8, 27};
			intervalos.add(intervalo);
			
			int Retorno = 2;
			
			
			int retornoFeito = CalculoMagic.calculo(intervalos);
			
			assertEquals(Retorno, retornoFeito);			
	}
	@Test
	public void TesteIntervalo2() {
		List<int[]> intervalos = new ArrayList<>();
		int[] intervalo = {8, 27};
		int[] intervalo1 = {49, 49};
		intervalos.add(intervalo );
		intervalos.add(intervalo1 );
		
		int Retorno = 3;
			
			
			int retornoFeito = CalculoMagic.calculo(intervalos);
			
			assertEquals(Retorno, retornoFeito);			
	}

}
