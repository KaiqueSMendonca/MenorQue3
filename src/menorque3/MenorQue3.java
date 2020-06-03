package menorque3;
import java.util.Scanner;

public class MenorQue3 {


    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite um número: ");
        double num = entrada.nextDouble();
        
        if (num < 3)
            System.out.println("O número "+num+" é menor que 3");
        
    }
    
}
