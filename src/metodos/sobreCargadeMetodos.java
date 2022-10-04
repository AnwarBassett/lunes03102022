package metodos;
import java.util.Scanner;
public class sobreCargadeMetodos {
	static Scanner lec=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Area Lateral: "+calcularAreaLateralPrisma());
		System.out.println("Area Lateral: "+calcularAreaLateralPrisma(5));
	}
	private static double calcularAreaLateralPrisma() {
		double l,h, AreaLateral;
		int n;
		System.out.println("n=");
		n=lec.nextInt();
		System.out.println("l=");
		l=lec.nextInt();
		System.out.println("h=");
		h=lec.nextInt();
		AreaLateral=n*l*h;
		return AreaLateral;
	}
	private static double calcularAreaLateralPrisma(int n) {
		double l,h, AreaLateral;
		System.out.println("l=");
		l=lec.nextInt();
		System.out.println("h=");
		h=lec.nextInt();
		AreaLateral=n*l*h;
		return AreaLateral;
	}
}
