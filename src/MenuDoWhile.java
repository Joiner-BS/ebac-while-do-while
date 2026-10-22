import java.util.Scanner;

public class MenuDoWhile {

    // Ponto de entrada do programa.
    public static void main(String[] args) {

        // Prepara a leitura das opções pelo teclado.
        Scanner scanner = new Scanner(System.in);

        // Guarda a opção escolhida pelo usuário.
        int opcao;

        // Exibe o menu pelo menos uma vez.
        do {
            System.out.println("1 - Continuar");
            System.out.println("2 - Sair");
            System.out.println("Escolha uma opção:");

            opcao = scanner.nextInt();

            // Consome a quebra de linha deixada pela leitura do número.
            scanner.nextLine();

        // Solicita e exibe o texto somente na opção Continuar.
            if (opcao == 1) {
                System.out.println("Digite uma palavra ou frase:");
                String frase = scanner.nextLine();

                System.out.println("Você digitou: " + frase);
            }


        } while (opcao != 2);

        // Exibe a despedida após a escolha da opção Sair.
        System.out.println(
                "Obrigado por utilizar o nosso sistema, espero que tenha gostado."
        );

        scanner.close();
    }
}