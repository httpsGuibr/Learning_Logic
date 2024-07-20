import java.util.Random;
import java.util.Scanner;

public class criarNovaConta {

	public static void criarNovaConta1() {

		Scanner scanner = new Scanner(System.in);
		Random random = new Random();

		Clean.clearConsole();

		System.out.println("Bem vindo ao EasyBank Internet Banking");
		System.out.println("Vamos começar...");
		Util.wait(3000);

		System.out.println("Insira seu nome completo: ");
		String nomecriarconta = scanner.nextLine();
		Clean.clearConsole();

		System.out.println("Qual o seu numero CPF? (Apenas números)");
		@SuppressWarnings("unused")
		double cpf = scanner.nextDouble();
		scanner.nextLine();
		System.out.println("Checando históricos...");
		Util.wait(3000);
		System.out.println("Dados encontrados...");
		Util.wait(1500);
		Clean.clearConsole();

		System.out.println("Qual o seu numero de telefone? (Apenas números)");
		@SuppressWarnings("unused")
		double ntelefone = scanner.nextDouble();
		scanner.nextLine();
		Clean.clearConsole();

		System.out.println("Insira um email para cadastro do login: (Ex. xxx@email.com)");
		@SuppressWarnings("unused")
		String email = scanner.next();
		scanner.nextLine();
		Clean.clearConsole();

		System.out.println("Insira a senha que deseja utilizar nesta conta:");
		Global.senhacriarconta = scanner.nextDouble();
		scanner.nextLine();
		System.out.println("Confirme sua senha:");
		Double validarsenha = scanner.nextDouble();
		scanner.nextLine();
		Clean.clearConsole();

		if (Global.senhacriarconta == validarsenha) {
			captcha.captcha1();
			Clean.clearConsole();

			System.out.println("Qual é sua ocupação profissional atual?");
			@SuppressWarnings("unused")
			String ocupacao = scanner.nextLine();
			System.out.println("Qual sua renda total atual? (Em Reais)");
			@SuppressWarnings("unused")
			Double rendatotal = scanner.nextDouble();
			Util.wait(1000);

			System.out.println("Enviando informações para análise...");
			Util.wait(3000);
			System.out.println("Obrigado pelas informações, vamos lhe redirecionar!");
			Util.wait(3000);
			Clean.clearConsole();

			System.out.println("Bem vindo ao EasyBank Internet Banking " + nomecriarconta + ".");
			Global.numerorandomconta = random.nextInt(90000) + 10000;
			Global.numerorandomagencia = random.nextInt(9000) + 1000;
			System.out.println("O número da sua conta é " + (int) Global.numerorandomconta + " e sua agência é "
					+ (int) Global.numerorandomagencia + ".");
			System.out.println("Aperte 1 para prosseguir.");
			Double prosseguir = scanner.nextDouble();

			if (prosseguir == 1) {
				Clean.clearConsole();
				System.out.println("Vamos lhe redirecionar à página inicial...");
				Util.wait(7000);
				Clean.clearConsole();
				Main.main(null);
			} else {
				System.out.println("Digite ENTER");
			}
		}

		else {
			System.out.println("Senha não confere, tente novamente.");
			criarNovaConta.criarNovaConta1();
		}
		scanner.close();
	}
}


