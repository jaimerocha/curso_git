package presentation;

import service.CalculadoraService;

public class CalculadoraView {

	public static void main(String[] args) {
		
		CalculadoraService calc = new CalculadoraService();
		System.out.println(calc.sumar(2, 8));
		System.out.println(calc.multiplicar(5, 7));
		System.out.println(calc.restar(3, 7));
		System.out.println(calc.dividir(8, 3));
		System.out.println(calc.sumatorio(new int[] {7, 9, 2, 11}));
	}

}
