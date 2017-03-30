package eclipse;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.function.Function;

public class Principal {

	public static void main(String[] args) {

		Calendar dataNascimento = new GregorianCalendar(1985, 3, 18);
		Funcionario funcionario = new Funcionario("Jose", 25, dataNascimento);

		System.out.println(funcionario);
	}

}
