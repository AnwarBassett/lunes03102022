package metodos;
import java.util.Scanner;
public class EjemploMetodos {
	public static void main(String[] args) {
		metodoA();
		metodoB(3.2,5.0,8);
		double a=9.3, b=7.5;
		int c=5;
		Scanner lec=new Scanner(System.in);
		
		metodoB(a,b,c);
		System.out.println("a=");
		a=lec.nextDouble();
		System.out.println("b=");
		b=lec.nextDouble();
		System.out.println("c=");
		c=lec.nextInt();
		metodoB(a,b,c);
		
		
		
	}
	private static void metodoA() {
		int valorA=7, valorB=8;
		System.out.println("La suma de "+valorA+" y "+valorB+" es "+(valorA+valorB));
	}
	private static void metodoB(double varA, double varB, int varC) {
		double resultado=(varA+varB)/(1+varC);
		System.out.println("El resultado es= "+resultado);
	}
}
