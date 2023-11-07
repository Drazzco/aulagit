package pacote2;

public class Dado {

	public static void main(String[] args) {
		int dado6lados = (int)(Math.random() * 5381) + 1;
		System.out.println("Resultado: " + dado6lados);
		System.out.println("Resultado: " + Math.random());
	}

}
