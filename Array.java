import java.util.Scanner;

public class ArrayTeste {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Digite um valor: ");

        
        int valor = scanner.nextInt();

        
        System.out.println("Você digitou: " + valor);

        
        scanner.close();
    }
}
