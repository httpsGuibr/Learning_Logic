import java.util.Scanner;

public class transfPix {
	public static void transfPix1() {
		double valorpix, chavenumerica;
		int opcaotransfpix;

		Scanner scanner = new Scanner(System.in);

		while (true) {
			Clean.clearConsole();
			System.out.println(
					"Para realizar a transferência, basta digitar o valor da transferência e a conta de destino.");
			System.out.println("\n--------------------------------\n");
			System.out.println("Saldo:      R$ " + Global.saldo);
			System.out.println("\n--------------------------------\n");

			System.out.print("\nQuanto deseja transferir? ");
			valorpix = scanner.nextDouble();

			System.out.print("Digite a chave numérica da conta: ");
			chavenumerica = scanner.nextDouble();

			double diferenca = Global.saldo - valorpix;

			if (diferenca < 0) {
				System.out.println("Não é possível enviar este valor!");
				System.out.println("Tente novamente com um valor menor!\n");
				Util.wait(3500);
				continue; 
			}

			Global.saldo -= valorpix;

			int posicao_vazia = 0;

			while (Global.operacao_saida[posicao_vazia][0] != 0) {
				posicao_vazia++;

				if (posicao_vazia >= 1000) {
					System.out.println("Limite de transferências atingido!");
					scanner.close();
					return;
				}
			}

			Global.operacao_saida[posicao_vazia][0] = valorpix;
			Global.operacao_saida[posicao_vazia][1] = chavenumerica;

			Global.quantidadetransf++;
			System.out.println("Pix efetuado!\n");

			System.out.println("1) Realizar outra transferência");
			System.out.println("2) Voltar para página inicial");
			System.out.println("3) Encerrar o programa");
			System.out.print("\nEscolha uma opção: ");
			opcaotransfpix = scanner.nextInt();
			Clean.clearConsole();

			switch (opcaotransfpix) {
			case 1:
				continue; 
			case 2:
				telaInicial.telaInicial1();
				scanner.close();
				return;
			case 3:
				scanner.close();
				return;
			default:
				System.out.println("Opção Inválida!");
				Util.wait(2000);
			}
		}
	}
}
