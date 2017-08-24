package calculadora;

public class Calculadora {
	public double estado;
	
	public void sumar(int a, int b)
	{
		estado= a+b; 
	}
	 public void restar(int a, int b)
	 {
		 estado= a-b;
	 }
	 public void multiplicar(double a, double b)
	 {
		 estado=  a*b;
	 }
	 public void multiplicar( double b)
	 {
		 estado= estado*b;
	 }
	 public void dividir(double a, double b)
	 {
		 estado= a/b;
	 }
	 public void potencia(int base, int exponente)
	 {
		estado =  1;
		
		 for(int i=1; i< exponente; i++)
		 {
			 multiplicar(base,estado);
		 }
		 
	 }
}
