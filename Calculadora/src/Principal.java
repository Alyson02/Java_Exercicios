import javax.swing.JOptionPane;

public class Principal {
	public static void main(String[] args) {
		Calculadora calc = new Calculadora();
		int op;
		
		JOptionPane.showMessageDialog(null, "Esse programa � destinado a estudos da programa��o\naqui voc� ver� uma calculadora simples em a��o");
		do {
			//calc.lerNumeros();
			op = Integer.parseInt(JOptionPane.showInputDialog("Selecione uma dessa op��es: \n1- Soma\n2- Sutra��o\n3- Multiplica��o\n4- Divis�o\n0- Sair"));   
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
					JOptionPane.showMessageDialog(null, "Cara, voc� n�o est� tentando dividir por zero, est�?!");
				break;
			case 0:
				JOptionPane.showMessageDialog(null, "Finalizando o programa...");
				break;
			default:
				JOptionPane.showMessageDialog(null, "Op��o inv�lida!");
			}
		}while(op != 0);
	}
}
