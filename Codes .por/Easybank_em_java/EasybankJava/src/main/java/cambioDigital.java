import java.util.Random;
import java.util.Scanner;

public class cambioDigital {
	public static void cambioDigital1() {
		double opcaocambio, precoAtualusd, precoAtualeur, precoAtualdinar;
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();

		Clean.clearConsole();

		System.out.println("Opções de simulações de câmbios de moeda estrangeiras para o real (BRL)");
		System.out.println("_____________________________");
		System.out.println("------Tabela de valores------");
		System.out.println("_____________________________");

		System.out.println("\n1) Dólar (USD)");
		String Dolar = "Dólar (USD)";
		precoAtualusd = Math.round((5.38 * (random.nextDouble() * (0.2) + 0.8)) * 100.0) / 100.0;
		System.out.println("Valor atual: R$" + precoAtualusd + ".");

		System.out.println("\n2) Euro (EUR)");
		String Euro = "Euro (EUR)";
		precoAtualeur = Math.round((5.78 * (random.nextDouble() * (0.2) + 0.8)) * 100.0) / 100.0;
		System.out.println("Valor atual: R$" + precoAtualeur + ".");

		System.out.println("\n3) Dinar Kuwaitiano (KWD)");
		String Dinar = "Dinar Kuwaitiano (KWD)";
		precoAtualdinar = Math.round((17.55 * (random.nextDouble() * (0.2) + 0.8)) * 100.0) / 100.0;
		System.out.println("Valor atual: R$" + precoAtualdinar + ".\n");

		System.out.println("\n4) Simular compra de moedas estrangeiras.");
		System.out.println("5) Voltar a tela inicial  ");
		System.out.println("______________________________\n");
		System.out.println("\nDigite a opção na qual deseja prosseguir: ");
		opcaocambio = scanner.nextDouble();
		Clean.clearConsole();

		switch ((int) opcaocambio) {
		case 1:
			graficoParametrizado.graficoParametrizado1(Dolar, precoAtualusd, 1.2);
			break;
		case 2:
			graficoParametrizado.graficoParametrizado1(Euro, precoAtualeur, 1.2);
			break;
		case 3:
			graficoParametrizado.graficoParametrizado1(Dinar, precoAtualdinar, 1.2);
			break;
		case 4:
			compraMoeda.compraMoeda1();
			break;
		case 5:
			Clean.clearConsole();
			telaInicial.telaInicial1();
			break;
		default:
			System.out.println("Opção inválida, tente novamente");
			Util.wait(3000);
			Clean.clearConsole();
			cambioDigital.cambioDigital1();
			break;
		}
		scanner.close();
	}
}
