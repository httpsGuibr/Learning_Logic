import java.util.Scanner;

public class redefinirSenha {
	public static void redefinirSenha1() {
		String redefinir;
		int senharedefinir, validarsenha;

		Scanner scanner = new Scanner(System.in);
		Clean.clearConsole();

		System.out.println("Deseja redefinir sua senha? Digite SIM ou NÃO.");
		redefinir = scanner.nextLine();

		if (redefinir.equalsIgnoreCase("sim") || redefinir.equalsIgnoreCase("s")) {
			System.out.println("Insira a senha que deseja utilizar nesta conta:");
			senharedefinir = scanner.nextInt();
			System.out.println("Confirme sua senha:");
			validarsenha = scanner.nextInt();
			Clean.clearConsole();

			if (senharedefinir == validarsenha) {
				captcha.captcha1();
				Util.wait(3000);
				Clean.clearConsole();
				contaExistente.contaExistente1();
			} else {
				System.out.println("Senha não confere, tente novamente.");
			}
		} else {
			System.out.println("Algo deu errado, tente novamente.");
		}
		scanner.close();
	}

}
