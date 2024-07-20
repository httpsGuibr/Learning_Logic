import java.util.Scanner;

public class contaExistente {
	public static void contaExistente1() {
		int Nconta, Nagencia, Senhamain;
		Scanner scanner = new Scanner(System.in);

		Clean.clearConsole();

		System.out.println("Bem vindo ao EasyBank Internet Banking");
		System.out.print("Digite o número da sua conta (6 dígitos): ");
		Nconta = scanner.nextInt();

		if (Nconta == 123456 || Nconta == Global.numerorandomconta) {
			System.out.print("Digite o número da sua agência (4 dígitos): ");
			Nagencia = scanner.nextInt();

			if (Nagencia == 1234 || Nagencia == Global.numerorandomagencia) {
				System.out.print("Digite sua senha (4 dígitos): ");
				Senhamain = scanner.nextInt();

				if (Senhamain == 4321 || Senhamain == Global.senhacriarconta || Senhamain == Global.senharedefinir) {
					System.out.println("Senha correta!");
					System.out.println("Vamos lhe redirecionar à tela inicial em instantes");
					Util.wait(3000);
					System.out.println("Redirecionando...");
					Util.wait(3000);
					Clean.clearConsole();
					telaInicial.telaInicial1();
				} else {
					Clean.clearConsole();
					System.out.println("Senha inválida");
					System.out.println("Tente novamente");
					redefinirSenha.redefinirSenha1();
					Util.wait(3000);
					Clean.clearConsole();
					contaExistente.contaExistente1();
				}
			} else {
				Clean.clearConsole();
				System.out.println("Agência inválida");
				System.out.println("Tente novamente");
				Util.wait(3000);
				Clean.clearConsole();
				contaExistente.contaExistente1();
			}
		} else {
			Clean.clearConsole();
			System.out.println("Conta inválida");
			System.out.println("Tente novamente");
			Util.wait(3000);
			Clean.clearConsole();
			contaExistente.contaExistente1();
		}
		scanner.close();
	}
}