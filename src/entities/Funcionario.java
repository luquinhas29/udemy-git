package entities;

public class Funcionario {
	
	public String nome;
	public double salarioLiquido;
	public double imposto;
	
	public String toString() {
		return   nome
				+", $ "
				+String.format("%.2f",salarioLiquidoBruto() );
	}
	
	public double salarioLiquidoBruto() {
		return this.salarioLiquido - this.imposto;
	}
	
	public void aumentoSalario(double valor) {
		salarioLiquido += salarioLiquido * valor /100;
	}

}
