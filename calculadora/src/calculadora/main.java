package calculadora;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculadora calc = new Calculadora();
		 calc.sumar(1, 2);
		System.out.println(calc.estado);
		 calc.restar(5, 1);
		System.out.println(calc.estado);
		calc.multiplicar(27, 116);
		System.out.println(calc.estado);
		 calc.dividir(6,4);
		System.out.println(calc.estado);
		 calc.potencia(2,3);
		System.out.println(calc.estado);
		calc.estado=0;
		calc.sumar(2, 3);
		calc.multiplicar(2);
		System.out.println(calc.estado);
	}

}
