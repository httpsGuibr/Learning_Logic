import java.util.Scanner;

public class simuImprest {

	public static void simuImprest1() {
		double valoremprestimo1, valoremprestimo2, valoremprestimo3, juroscaso1, juroscaso2, juroscaso3, montantecaso1,
				montantecaso2, montantecaso3;
		int meses, meses2, meses3, Opcao1, opcao1;

		Scanner scanner = new Scanner(System.in);

		Clean.clearConsole();

		System.out.println("| Bem vindo ao portal de simulações de empréstimos EasyBank                    |");
		System.out.println("| Aqui podemos simular empréstimos por meio das taxas de juros disponíveis.    |");
		System.out.println("| Apenas insira quanto deseja pegar emprestado e o tempo em que deseja pagar.  |");
		Util.wait(2000);

		System.out.println("\n1) APENAS NESTE MÊS DE DEZEMBRO, 5% AO MÊS, EM ATÉ 3 MESES. ");
		System.out.println("2) 10% ao mês, em até 6 meses. ");
		System.out.println("3) 12% ao mês, em até 24 meses.");
		System.out.println("4) Voltar a tela inicial.  ");
		System.out.print("Escolha uma das opções acima: ");
		Opcao1 = scanner.nextInt();

		switch (Opcao1) {
		case 1:
			System.out.println("Insira o valor que deseja pegar emprestado (em Reais): ");
			valoremprestimo1 = scanner.nextDouble();
			System.out.println("Em quanto tempo deseja quitar o empréstimo (em meses)? ");
			meses = scanner.nextInt();
			if (meses <= 3) {
				juroscaso1 = ((valoremprestimo1 * 0.05) * meses);
				montantecaso1 = (valoremprestimo1 + juroscaso1);
				System.out.println("O valor a ser pago ao final com juros é de R$" + montantecaso1 + ".");

				System.out.println("\n1) Fazer uma nova simulação ");
				System.out.println("2) Voltar para página inicial ");
				System.out.println("3) Encerrar o programa ");
				System.out.print("Escolha uma opção: ");
				opcao1 = scanner.nextInt();
				Clean.clearConsole();
				switch (opcao1) {
				case 1:
					simuImprest.simuImprest1();
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
			} else {
				System.out.println(
						"O empréstimo só pode ser realizado com prazo menor ou igual a 3 meses, tente novamente.");
				Util.wait(3000);
				Clean.clearConsole();
				simuImprest.simuImprest1();
			}
			break;
		case 2:
			System.out.println("Insira o valor que deseja pegar emprestado (em Reais): ");
			valoremprestimo2 = scanner.nextDouble();
			System.out.println("Em quanto tempo deseja quitar o empréstimo (em meses)? ");
			meses2 = scanner.nextInt();
			if (meses2 <= 6) {
				juroscaso2 = ((valoremprestimo2 * 0.1) * meses2);
				montantecaso2 = (valoremprestimo2 + juroscaso2);
				System.out.println("O valor a ser pago ao final com juros é de R$" + montantecaso2 + ".");

				System.out.println("\n1) Fazer uma nova simulação ");
				System.out.println("2) Voltar para página inicial ");
				System.out.println("3) Encerrar o programa ");
				System.out.print("Escolha uma opção: ");
				opcao1 = scanner.nextInt();
				Clean.clearConsole();
				switch (opcao1) {
				case 1:
					simuImprest.simuImprest1();
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
			} else {
				System.out.println(
						"O empréstimo só pode ser realizado com prazo menor ou igual a 6 meses, tente novamente.");
				Util.wait(3000);
				Clean.clearConsole();
				simuImprest.simuImprest1();
			}
			break;
		case 3:
			System.out.println("Insira o valor que deseja pegar emprestado (em Reais): ");
			valoremprestimo3 = scanner.nextDouble();
			System.out.println("Em quanto tempo deseja quitar o empréstimo (em meses)? ");
			meses3 = scanner.nextInt();
			if (meses3 <= 24) {
				juroscaso3 = ((valoremprestimo3 * 0.12) * meses3);
				montantecaso3 = (valoremprestimo3 + juroscaso3);
				System.out.println("O valor a ser pago ao final com juros é de R$" + montantecaso3 + ".");

				System.out.println("\n1) Fazer uma nova simulação ");
				System.out.println("2) Voltar para página inicial ");
				System.out.println("3) Encerrar o programa ");
				System.out.print("Escolha uma opção: ");
				opcao1 = scanner.nextInt();
				Clean.clearConsole();
				switch (opcao1) {
				case 1:
					simuImprest.simuImprest1();
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
			} else {
				System.out.println(
						"O empréstimo só pode ser realizado com prazo menor ou igual a 24 meses, tente novamente.");
				Util.wait(3000);
				Clean.clearConsole();
				simuImprest.simuImprest1();
			}
			break;
		case 4:
			Clean.clearConsole();
			telaInicial.telaInicial1();
			break;
		default:
			System.out.println("Opção Inválida !");
			break;
		}
		scanner.close();
	}
}
