import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Insira o Raio");
        double raio = teclado.nextDouble();

        teclado.close();

        double area = Math.PI * Math.pow(raio, 2) ;

        System.out.printf("A área é : %.2f",area);
    }
}
