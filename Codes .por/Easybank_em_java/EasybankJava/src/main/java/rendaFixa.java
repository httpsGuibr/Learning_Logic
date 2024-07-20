import java.util.Scanner;

public class rendaFixa {
	public static void rendaFixa1() {
		Scanner scanner = new Scanner(System.in);
		double opcao, valorinvestmens, opcao1, valorinvestmenspoup;
		Clean.clearConsole();
		System.out.println("1) Simular investimento na caixinha Easybank. ");
		System.out.println(
				"| Rendimento: 130% do CDI (O CDI é uma taxa emitida pelo governo)                                    | \n");
		System.out.println(
				"| Possível retirar á qualquer momento.                                                               | \n");
		System.out.println(
				"| A Caixinha do Easybank permite guardar dinheiro separado da conta principal, rendendo diariamente. | \n");
		System.out.println(
				"| É útil para organizar e crescer suas economias para objetivos específicos.                         | \n");
		System.out.println("2) Simular investimento na Poupança. ");
		System.out.println(
				"| Rendimento: 0,7% ao mês                                                                            | \n");
		System.out.println(
				"| Retire em dois dias úteis.                                                                         | \n");
		System.out.println(
				"| Poupança em 2024 é o cúmulo da ineficiência em 2024                                                | \n");
		System.out.println("\n3) Voltar para as opções de investimento.");
		System.out.println("4) Voltar para página inicial \n");

		System.out.println("\nDigite a opção na qual deseja prosseguir: ");
		opcao = scanner.nextDouble();

		switch ((int) opcao) {
		case 1:
			Clean.clearConsole();
			System.out.println("Insira o valor que deseja investir (em Reais): \n");
			valorinvestmens = scanner.nextDouble();
			System.out.println("O valor total ao final de 30 dias será de R$"
					+ (valorinvestmens + (valorinvestmens * (0.89 * 1.3) / 100)) + ".\n");
			System.out.println("O valor total ao final de 90 dias será de R$"
					+ (valorinvestmens + (valorinvestmens * 3 * (0.89 * 1.3) / 100)) + ".\n");
			System.out.println("O valor total ao final de 1 ano será de R$"
					+ (valorinvestmens + (valorinvestmens * 12 * (0.89 * 1.3) / 100)) + ".\n");

			System.out.println("\n1) Fazer uma nova simulação \n");
			System.out.println("2) Voltar para página inicial \n");
			System.out.println("3) Encerrar o programa ");
			System.out.println("\nEscolha uma opção: ");
			opcao1 = scanner.nextDouble();
			Clean.clearConsole();
			switch ((int) opcao1) {
			case 1:
				rendaFixa1();
				break;
			case 2:
				telaInicial.telaInicial1();
				break;
			case 3:
				Clean.clearConsole();
				break;
			default:
				System.out.println("Opção Inválida !");
				break;
			}
			break;
		case 2:
			Clean.clearConsole();
			System.out.println("Insira o valor que deseja investir (em Reais): \n");
			valorinvestmenspoup = scanner.nextDouble();
			System.out.println("O valor total ao final de 30 dias será de R$"
					+ (valorinvestmenspoup + (valorinvestmenspoup * ((0.0735 / 12)))) + ".\n");
			System.out.println("O valor total ao final de 90 dias será de R$"
					+ (valorinvestmenspoup + (valorinvestmenspoup * ((0.0735 / 12) * 3))) + ".\n");
			System.out.println("O valor total ao final de 1 ano será de R$"
					+ (valorinvestmenspoup + (valorinvestmenspoup * ((0.0735 / 12) * 12))) + ".\n");

			System.out.println("\n1) Fazer uma nova simulação \n");
			System.out.println("2) Voltar para página inicial \n");
			System.out.println("3) Encerrar o programa ");
			System.out.println("\nEscolha uma opção: ");
			opcao1 = scanner.nextDouble();
			Clean.clearConsole();
			switch ((int) opcao1) {
			case 1:
				rendaFixa1();
				break;
			case 2:
				telaInicial.telaInicial1();
				break;
			case 3:
				Clean.clearConsole();
				break;
			default:
				System.out.println("Opção Inválida !");
				break;
			}
			break;
		case 3:
			Clean.clearConsole();
			investir.investir1();
			break;
		case 4:
			Clean.clearConsole();
			telaInicial.telaInicial1();
			break;
		default:
			System.out.println("Opção inválida, tente novamente");
			Util.wait(3000);
			Clean.clearConsole();
			telaInicial.telaInicial1();
			break;
		}
		scanner.close();
	}

}
