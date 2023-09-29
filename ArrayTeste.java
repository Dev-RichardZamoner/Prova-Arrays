import java.util.Scanner;

public class ArrayTeste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o tamanho do array: ");
        int capacidade = scanner.nextInt();
        Array vetor = new Array(capacidade);

        int opcao;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Adicionar Elemento");
            System.out.println("2. Remover Elemento");
            System.out.println("3. Alterar Elemento");
            System.out.println("4. Listar Elementos");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o elemento a ser adicionado: ");
                    int elementoAdicionar = scanner.nextInt();
                    vetor.adicionarElemento(elementoAdicionar);
                    break;
                case 2:
                    vetor.removerElemento();
                    break;
                case 3:
                    System.out.print("Digite a posição do elemento a ser alterado: ");
                    int posicao = scanner.nextInt();
                    System.out.print("Digite o novo elemento: ");
                    int novoElemento = scanner.nextInt();
                    vetor.alterarElemento(posicao, novoElemento);
                    break;
                case 4:
                    vetor.listarElementos();
                    break;
                case 5:
                    System.out.println("Encerrando a aplicação.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 5);

        scanner.close();
    }
}
