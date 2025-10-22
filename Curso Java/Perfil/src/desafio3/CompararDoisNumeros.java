package desafio3;

import java.util.Scanner;

public class CompararDoisNumeros {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        int num1 = leitura.nextInt();
        System.out.println("Digite o segundo número:");
        int num2 = leitura.nextInt();

        if(num1 == num2){
            System.out.println("Os números são iguais");
        }
        else if(num1 > num2){
            System.out.println("O primeiro número é maior que o segundo");
        }
        else{
            System.out.println("O segundo número é maior que o primeiro");
        }
    }
}
