package banco.teste;

public class TesteErro {

	public static void main(String[] args) {
		System.out.println("inicio do main");
		metodo1();
		System.out.println("fim do main");
	}

	static void metodo1() {
		System.out.println("inicio do metodo1");
		try {
			metodo2();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Indice é maior do que o numero de indices do array");
		}
		System.out.println("fim do metodo1");
	}

	static void metodo2() {
		System.out.println("inicio do metodo2");
		int[] array = new int[10];
		int j = 0;

		for (int i = 0; i <= 15; i++) {
			j = i;
			// try {
			array[i] = i;
			System.out.println(i);
			// } catch (ArrayIndexOutOfBoundsException e) {
			// System.out.println("Indice " + j + " é aior do que o numero de
			// indices do array");
			// }
		}

		System.out.println("fim do metodo2");
	}

}
