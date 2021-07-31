import javax.swing.JOptionPane;

public class Principal {
	public static void main(String[] args) {
		Calculadora calc = new Calculadora();
		int op;
		
		JOptionPane.showMessageDialog(null, "Esse programa é destinado a estudos da programação\naqui você verá uma calculadora simples em ação");
		do {
			//calc.lerNumeros();
			op = Integer.parseInt(JOptionPane.showInputDialog("Selecione uma dessa opções: \n1- Soma\n2- Sutração\n3- Multiplicação\n4- Divisão\n0- Sair"));   
			switch(op) {
			case 1:
				calc.lerNumeros();
				calc.somar();
				calc.exibirResultado();
				break;
			case 2:
				calc.lerNumeros();
				calc.subtrair(calc.getN1(), calc.getN2());
				calc.exibirResultado();
				break;
			case 3:
				calc.lerNumeros();
				calc.multiplicar();
				calc.exibirResultado();
				break;
			case 4:
				calc.lerNumeros();
				if(calc.dividir(calc.getN1(), calc.getN2()) == true)
					calc.exibirResultado();
				else
					JOptionPane.showMessageDialog(null, "Cara, você não está tentando dividir por zero, está?!");
				break;
			case 0:
				JOptionPane.showMessageDialog(null, "Finalizando o programa...");
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opção inválida!");
			}
		}while(op != 0);
	}
}
