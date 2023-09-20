import java.util.Scanner;

class Array {
    private int[] array;

    public Array(int tamanho) {
        array = new int[tamanho];
    }

    public void adicionarElemento(int posicao, int valor) {
        if (posicao >= 0 && posicao < array.length) {
            array[posicao] = valor;
        } else {
            System.out.println("Posição inválida.");
        }
    }

    public void listarElementos() {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Elemento na posição " + i + ": " + array[i]);
        }
    }
}

public class ArrayTeste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o tamanho do array: ");
        int tamanho = scanner.nextInt();

        Array meuArray = new Array(tamanho);

        int opcao;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Adicionar Elemento");
            System.out.println("2. Listar Elementos");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Informe a posição: ");
                    int posicao = scanner.nextInt();
                    System.out.print("Informe o valor: ");
                    int valor = scanner.nextInt();
                    meuArray.adicionarElemento(posicao, valor);
                    break;
                case 2:
                    meuArray.listarElementos();
                    break;
                case 3:
                    System.out.println("Encerrando o programa.");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 3);

        scanner.close();
    }
}
