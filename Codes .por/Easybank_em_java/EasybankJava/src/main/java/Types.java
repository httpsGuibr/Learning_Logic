import java.util.Scanner;
import java.util.Random;

public class Types {
	public static void criptos() {
		double opcaocripto;
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		Clean.clearConsole();
		System.out.println("Escolha entre as seguintes opções de Criptomoedas:");
		System.out.println("1) Bitcoin (BTC)");
		String Bitcoin = "Bitcoin";
		double precoAtualbitar = 348312.23 * ((80 + (100 - 80) * random.nextDouble()) / 100);
		System.out.println("Valor atual: R$" + precoAtualbitar);
		System.out.println("2) Ethereum (ETH)");
		String Ethereum = "Ethereum";
		double precoAtualethar = 18863.35 * ((80 + (100 - 80) * random.nextDouble()) / 100);
		System.out.println("Valor atual: R$" + precoAtualethar);
		System.out.println("\nVocê pode comprar frações a partir de 1 real.");
		System.out.println("3) Voltar para as opções de investimento.\n");
		System.out.print("Digite a opção na qual deseja prosseguir: ");
		opcaocripto = scanner.nextDouble();

		switch ((int) opcaocripto) {
		case 1:
			graficoParametrizado.graficoParametrizado1(Bitcoin, precoAtualbitar, 1.2);
			break;
		case 2:
			graficoParametrizado.graficoParametrizado1(Ethereum, precoAtualethar, 1.2);
			break;
		case 3:
			rendaVariavel.rendaVariavel1();
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

	public static void acoes() {
		double opcaoacao;
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		Clean.clearConsole();
		System.out.println("Opções de ações disponíveis na bolsa de valores Brasileira atualmente:");
		System.out.println("_____________________________");
		System.out.println("\n1) Itaú Unibanco, (ITUB4)");
		String ITUB4 = "Itaú Unibanco, (ITUB4)";
		double precoAtualITUB4 = 32.12 * ((80 + (100 - 80) * random.nextDouble()) / 100);
		System.out.println("\n2) Nubank, (NUBR33)");
		String NUBR33 = "Nubank, (NUBR33)";
		double precoAtualNUBR33 = 3.14 * ((80 + (100 - 80) * random.nextDouble()) / 100);
		System.out.println("\n3) Bradesco, (BBDC4)");
		String BBDC4 = "Bradesco, (BBDC4)";
		double precoAtualBBDC4 = 12.40 * ((80 + (100 - 80) * random.nextDouble()) / 100);
		System.out.println("\n4) Banco Inter, (INBR32)");
		String INBR32 = "Banco Inter, (INBR32)";
		double precoAtualINBR32 = 31.43 * ((80 + (100 - 80) * random.nextDouble()) / 100);
		System.out.println("\n5) Oracle, (ORCL34)");
		String ORCL34 = "Oracle, (ORCL34)";
		double precoAtualORCL34 = 778.86 * ((80 + (100 - 80) * random.nextDouble()) / 100);
		System.out.println("\n6) Voltar para as opções de investimento.");
		System.out.println("______________________________\n");
		System.out.println("\nDigite o número correspondente à Ação para ver as informações dela.\n");
		opcaoacao = scanner.nextDouble();
		Clean.clearConsole();

		switch ((int) opcaoacao) {
		case 1:
			graficoParametrizado.graficoParametrizado1(ITUB4, precoAtualITUB4, 1.2);
			break;
		case 2:
			graficoParametrizado.graficoParametrizado1(NUBR33, precoAtualNUBR33, 1.2);
			break;
		case 3:
			graficoParametrizado.graficoParametrizado1(BBDC4, precoAtualBBDC4, 1.2);
			break;
		case 4:
			graficoParametrizado.graficoParametrizado1(INBR32, precoAtualINBR32, 1.2);
			break;
		case 5:
			graficoParametrizado.graficoParametrizado1(ORCL34, precoAtualORCL34, 1.2);
			break;
		case 6:
			rendaVariavel.rendaVariavel1();
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

	public static void flls() {
		double opcaofll;
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		Clean.clearConsole();
		System.out.println("Opções de fundos imobiliários disponíveis na bolsa de valores Brasileira atualmente:");
		System.out.println("_____________________________");
		System.out.println("\n1) Maxi Renda Fundo Invest Imobiliario FII (MXRF11)");
		String MXFR11 = "Maxi Renda Fundo Invest Imobiliario FII (MXRF11)";
		double precoAtualMXFR11 = 10.19 * ((80 + (100 - 80) * random.nextDouble()) / 100);
		System.out.println("\n2) Fator Verita Fundo de Investimento Imobiliario - FII (VRTA11)");
		String VRTA11 = "Fator Verita Fundo de Investimento Imobiliario - FII (VRTA11)";
		double precoAtualVRTA11 = 87.54 * ((80 + (100 - 80) * random.nextDouble()) / 100);
		System.out.println("\n3) CSHG Prime Offices (HGPO11)");
		String HGPO11 = "CSHG Prime Offices (HGPO11)";
		double precoAtualHGPO11 = 309.93 * ((80 + (100 - 80) * random.nextDouble()) / 100);
		System.out.println("\n4) Voltar para as opções de investimento.");
		System.out.println("______________________________\n");
		System.out.println("\nDigite o número correspondente à Ação para ver as informações dela.\n");
		opcaofll = scanner.nextDouble();
		Clean.clearConsole();

		switch ((int) opcaofll) {
		case 1:
			graficoParametrizado.graficoParametrizado1(MXFR11, precoAtualMXFR11, 1.2);
			break;
		case 2:
			graficoParametrizado.graficoParametrizado1(VRTA11, precoAtualVRTA11, 1.2);
			break;
		case 3:
			graficoParametrizado.graficoParametrizado1(HGPO11, precoAtualHGPO11, 1.2);
			break;
		case 4:
			rendaVariavel.rendaVariavel1();
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
