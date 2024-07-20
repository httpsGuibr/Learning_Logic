import java.util.Scanner;

public class rendaVariavel {
	public static void rendaVariavel1() {
		Scanner scanner = new Scanner(System.in);
		double opcao;

		Clean.clearConsole();
		System.out.println("1) Criptomoedas (NOVO)\n");
		System.out.println(
				"| São moedas digitais que existem apenas na internet.                                                  | \n");
		System.out.println(
				"| Você pode usá-las para comprar coisas ou investir.                                                   | \n");
		System.out.println(
				"| Elas funcionam sem um banco central, usando tecnologias modernas para registrar transações.          | \n");
		System.out.println(
				"| O valor é ditado pela sua circulação.                                                                | \n");
		System.out.println("2) Ações\n");
		System.out.println(
				"| Quando você compra uma ação, está comprando uma pequena parte de uma empresa.                        | \n");
		System.out.println(
				"| Se a empresa cresce e lucra, o valor das ações sobe, e você pode vender para ganhar dinheiro.        | \n");
		System.out.println(
				"| Se a empresa vai mal, o valor das ações cai.                                                         | \n");
		System.out.println(
				"| E se uma empresa lucra, pode dividir mais lucros, chamados 'dividendos'.                             | \n");
		System.out.println("3) Fundos Imobiliários\n");
		System.out.println(
				"| São investimentos em imóveis, como shopping centers ou escritórios.                                  | \n");
		System.out.println(
				"| Você compra uma pequena parcela chamada 'cota' desses fundos, e recebe uma parte do lucro gerado.    | \n\n");
		System.out.println("4) Voltar para as opções de investimento.");
		System.out.println("5) Voltar a tela inicial  \n");
		System.out.println("\nDigite a opção na qual deseja prosseguir: ");

		opcao = scanner.nextDouble();

		switch ((int) opcao) {
		case 1:
			Types.criptos();
			break;
		case 2:
			Types.acoes();
			break;
		case 3:
			Types.flls();
			break;
		case 4:
			Clean.clearConsole();
			investir.investir1();
			break;
		case 5:
			Clean.clearConsole();
			telaInicial.telaInicial1();
			break;
		default:
			System.out.println("Opção inválida, tente novamente");
			Util.wait(3000);
			Clean.clearConsole();
			rendaVariavel.rendaVariavel1();
			break;
		}
		scanner.close();
	}

}
