package br.com.faec;
/**
 * 
 * @author Clemerson Santos
 * @since 09-09-19
 * 
 */

public class Calculadora {
	int num1;
	int num2;
	Double resto = 0.0;
	Double calc= 0.0;
	
	Double obterResto(int num1, int num2) {
		
		resto = (double) (num1 % num2);
		
		return resto;
	}

	public static void main(String args[]) {
		Calculadora calc = new Calculadora();
		calc.num1 =10;
		calc.num2 =7;
		
		Double resto =calc.obterResto(calc.num1, calc.num2);
		System.out.println(resto);
			
	}

}
