import java.util.Random;
import java.util.Scanner;

public class graficoParametrizado {

	public static void graficoParametrizado1(String invest, double precoAt, double volume) {
		int[] valores = new int[40];
		int i, j, incremento, contador;
		char resposta;
		int valorInicial, valorFinal;

		Random random = new Random();
		try (Scanner scanner = new Scanner(System.in)) {
			for (i = 0; i < 40; i++) {
				valores[i] = 5;
			}

			boolean continuar = true;
			while (continuar) {
				valorInicial = valores[0];

				for (contador = 0; contador < 5; contador++) {
					Clean.clearConsole();

					for (i = 1; i < 40; i++) {
						incremento = random.nextInt(3) - 1;
						valores[i] = valores[i - 1] + incremento;

						if (valores[i] < 0) {
							valores[i] = 0;
						} else if (valores[i] > 10) {
							valores[i] = 10;
						}
					}

					for (i = 10; i >= 0; i--) {
						System.out.print("|");

						for (j = 0; j < 40; j++) {
							if (valores[j] == i) {
								System.out.print("-");
							} else {
								System.out.print(" ");
							}
						}
						System.out.println();
					}

					System.out.print(" ");
					for (j = 0; j < 45; j++) {
						System.out.print("_");
					}
					System.out.println();

					Util.wait(300);
				}

				valorFinal = valores[39];

				double variacaoPercentual = (((double) (valorFinal - valorInicial) / valorInicial) * 100);
				int volumeNegociacao = (int) (1587 + (valorFinal - 5) * 20);

				System.out.println("Preço Atual: R$" + precoAt);
				System.out.println("Variação atual (%): " + variacaoPercentual + "%");
				System.out.println("Volume de Negociação: " + volumeNegociacao);
				System.out.println("Gráfico do Ativo " + invest);

				System.out.print("Deseja rodar novamente? (1 para SIM / 2 para Não): ");
				resposta = scanner.next().charAt(0);

				if (resposta == '2') {
					continuar = false;
				}
			}
		}

		if (invest.equals("Dólar (USD)") || invest.equals("Euro (EUR)") || invest.equals("Dinar Kuwaitiano (KWD)")) {
			cambioDigital.cambioDigital1();
		} else if (invest.equals("Bitcoin") || invest.equals("Ethereum")) {
			Types.criptos();
		} else if (invest.equals("Itaú Unibanco, (ITUB4)") || invest.equals("Nubank, (NUBR33)")
				|| invest.equals("Bradesco, (BBDC4)") || invest.equals("Banco Inter, (INBR32)")
				|| invest.equals("Oracle, (ORCL34)")) {
			Types.acoes();
		} else if (invest.equals("Maxi Renda Fundo Invest Imobiliario FII (MXRF11)")
				|| invest.equals("Fator Verita Fundo de Investimento Imobiliario - FII (VRTA11)")
				|| invest.equals("CSHG Prime Offices (HGPO11)")) {
			Types.flls();
		} else {
			System.out.println("Opção inválida.");
		}

	}
}



