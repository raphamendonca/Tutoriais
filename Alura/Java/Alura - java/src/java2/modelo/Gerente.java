package java2.modelo;

public class Gerente extends Funcionario{

	public double getBonus(){
		return this.salario *0.3;
	}
	
	public void cobraEntrega(){
		System.out.println("Est� pronto? ");
	}
}
