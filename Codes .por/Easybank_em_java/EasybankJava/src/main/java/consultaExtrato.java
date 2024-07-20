import java.util.Scanner;

public class consultaExtrato {

	public static void consultaExtrato1() {
		double opcaoconsultaextrato;

		Clean.clearConsole();
		System.out.println("\nExtrato");
		System.out.println("----------------------");

		for (int x = 0; x < Global.quantidadetransf; x++) {
			if (Global.operacao_saida[x][0] > 0) {
				System.out.println("Pix efetuado :    R$ " + Global.operacao_saida[x][0] + " para a conta N° "
						+ Global.operacao_saida[x][1]);
			}
		}

		System.out.println("\nSaldo:      R$ " + Global.saldo);
		System.out.println("1) Voltar para página inicial");
		System.out.println("2) Encerrar o programa");
		System.out.print("\nEscolha uma opção: ");

		Scanner scanner = new Scanner(System.in);
		opcaoconsultaextrato = scanner.nextDouble();
		Clean.clearConsole();

		switch ((int) opcaoconsultaextrato) {
		case 1:
			telaInicial.telaInicial1();
			break;
		case 2:
			Clean.clearConsole();
			break;
		default:
			System.out.println("Opção Inválida !");
			break;
		}
		scanner.close();
	}

}
