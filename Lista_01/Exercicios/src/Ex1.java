import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a largura do terreno: ");
        double l = sc.nextDouble();

        System.out.println("Digite o comprimento do terreno: ");
        double c = sc.nextDouble();

        System.out.println("Digite o valor do metro quadrado: ");
        double v = sc.nextDouble();

        double area = l * c;
        double preco = area * v;
        
        System.out.printf("Área do terreno = %.2f \nPreço do terreno = %.2f \n", area, preco);


        sc.close();



    }
    
}
