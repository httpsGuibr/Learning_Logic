import java.util.Scanner;
import java.util.Random;

public class captcha {
	public static void captcha1() {
		int numerocaptcha, validanumerocaptcha;

		Scanner scanner = new Scanner(System.in);
		Random random = new Random();

		Clean.clearConsole();
		numerocaptcha = random.nextInt(7889) + 1000;

		System.out.println("Seu número é " + numerocaptcha + ".");
		Util.wait(1000);
		Clean.clearConsole();
		System.out.println("Seu número é -=-=-.");
		Util.wait(1000);
		Clean.clearConsole();
		System.out.println("Seu número é " + numerocaptcha + ".");
		Util.wait(1000);
		Clean.clearConsole();
		System.out.println("Seu número é -=-=-.");
		Util.wait(1000);
		Clean.clearConsole();
		System.out.println("Seu número é " + numerocaptcha + ".");
		Util.wait(1000);
		Clean.clearConsole();
		System.out.println("Seu número é -=-=-.");
		Util.wait(1000);
		Clean.clearConsole();
		System.out.println("Seu número é " + numerocaptcha + ".");
		Util.wait(1000);
		Clean.clearConsole();
		System.out.println("Seu número é -=-=-.");
		Util.wait(1000);
		Clean.clearConsole();
		System.out.println("Seu número é -=-=-.");
		Util.wait(100);
		System.out.println("Digite a verificação de 4 dígitos para prosseguir...");
		validanumerocaptcha = scanner.nextInt();

		if (validanumerocaptcha == numerocaptcha) {
			System.out.println("Sucesso! Vamos lhe redirecionar...");
			Util.wait(5000);
		} else {
			Clean.clearConsole();
			System.out.println("Tente novamente");
			Util.wait(300);
			Clean.clearConsole();
			System.out.println("Tente novamente.");
			Util.wait(300);
			Clean.clearConsole();
			System.out.println("Tente novamente..");
			Util.wait(300);
			Clean.clearConsole();
			System.out.println("Tente novamente...");
			Util.wait(300);
			Clean.clearConsole();
			System.out.println("Tente novamente....");
			Util.wait(300);
			Clean.clearConsole();
			captcha.captcha1();
		}
		scanner.close();

	}
}