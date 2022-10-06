import java.util.Locale;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Base do retângulo: ");
        double b = sc.nextDouble();

        System.out.println("Altura do retângulo: ");
        double h = sc.nextDouble();

        double area = b * h;
        double perimetro = (b + h) * 2;
        double diagonal = Math.sqrt(Math.pow(b, 2) + Math.pow(h, 2));
        
        System.out.printf("Área = %.4f \nPerímetro = %.4f \nDiagonal = %.4f \n", area, perimetro, diagonal);
        

        sc.close();
    }
    
}
