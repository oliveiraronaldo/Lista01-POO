import java.util.Locale;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Dados da primeira pessoa:");
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("Idade: ");
        int idade = sc.nextInt();

        System.out.println("Dados da segunda pessoa: ");
        System.out.print("Nome: ");
        sc.nextLine();
        String segundoNome = sc.nextLine();
        System.out.print("Idade: ");
        int segundaIdade = sc.nextInt();

        double media = ((double)idade + (double)segundaIdade) / 2;

        System.out.printf("A idade média de %s e %s é de %.1f anos \n", nome, segundoNome, media);





        sc.close();
    }
    
}
