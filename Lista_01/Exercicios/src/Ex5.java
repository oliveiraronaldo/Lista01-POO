import java.util.Locale;
import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Preço unitário do produto: ");
        double preco = sc.nextDouble();
        System.out.print("Quantidade comprada: ");
        int quantidade = sc.nextInt();
        System.out.print("Dinheiro recebido: ");
        double dinheiro = sc.nextDouble();

        double troco = dinheiro - quantidade * preco;

        System.out.printf("TROCO = %.2f \n", troco);



        sc.close();
    }
}
