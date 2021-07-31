import java.awt.JobAttributes;

import javax.swing.JOptionPane;

public class Calculadora {
	
	//atributos
	private double n1, n2, result;
	
	//Inicializando o atributo zerado
	public Calculadora() {
		
		this(0, 0, 0);
	}
	
	//Inicializando o atributo com parametro
	public Calculadora(double n1, double n2, double result) {
	
		this.n1 = n1;
		this.n2 = n2;
		this.result = result;
	}
	
	 	//geter e seter

	public double getN1() {
		return n1;
	}

	public void setN1(double n1) {
		this.n1 = n1;
	}

	public double getN2() {
		return n2;
	}

	public void setN2(double n2) {
		this.n2 = n2;
	}

	public double getResult() {
		return result;
	}

	public void setResult(double result) {
		this.result = result;
	}
	
	public void somar() {
		result = this.n1 + this.n2;
	}
	
	public void subtrair(double a, double b) {
		a = this.n1;
		b = this.n2;
		result = a - b;
	}
	
	public void multiplicar() {
		result = this.n1 * this.n2;
	}
	
	public boolean dividir(double a, double b) {
		a = this.n1;
		b = this.n2;
		
		result = a/b;
		
		if(a <1 || b <1)
			return false;
		else
			return true;
	}
	
	public void exibirResultado() {
		JOptionPane.showMessageDialog(null, "O resultado é: " + result);
	}
	
	public void lerNumeros() {
		n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite um número: "));
		n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite outro número: "));
	}
	
}
