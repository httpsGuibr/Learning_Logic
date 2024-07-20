import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int opcaoEntrada;

		Util.preencherVetor(Global.operacao_saida);

		System.out.println("Bem vindo ao EasyBank!");
		System.out.println("Escolha uma opção para iniciar: ");
		System.out.println("1) Entrar em uma conta existente");
		System.out.println("2) Criar uma nova conta");
		System.out.print("Escolha uma opção: ");
		opcaoEntrada = scanner.nextInt();

		switch (opcaoEntrada) {
		case 1:
			contaExistente.contaExistente1();
			Clean.clearConsole();
			break;
		case 2:
			criarNovaConta.criarNovaConta1();
			Clean.clearConsole();
			break;
		default:
			System.out.println("Opção Inválida!");
		}

		scanner.close();
	}

}



