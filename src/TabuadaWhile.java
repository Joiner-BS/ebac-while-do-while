import java.util.Scanner;

public class TabuadaWhile {

    // Ponto de entrada do programa.
    public static void main(String[] args) {

        // Prepara a leitura dos dados pelo teclado.
        Scanner scanner = new Scanner(System.in);

        // Solicita o número cuja tabuada será calculada.
        System.out.println("Digite um número inteiro:");
        int numero = scanner.nextInt();

        // Confere o número recebido.
        System.out.println("Tabuada do número: " + numero);

        // Inicia o multiplicador em 1.
        int multiplicador = 1;

// Repete o cálculo até incluir o multiplicador 10.
        while (multiplicador <= 10) {
            int resultado = numero * multiplicador;

            // Exibe a multiplicação e seu resultado.
            System.out.println(numero + " x " + multiplicador + " = " + resultado);

            // Avança para o próximo multiplicador.
            multiplicador++;
        }

        // Fecha o leitor após a última entrada de dados.
        scanner.close();
    }
}