package desafio3;

import java.util.Scanner;

public class PositivoNegativo {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = leitura.nextInt();

        if(numero > 0){
            System.out.println("Número positivo");
        } else{
            System.out.println("Número negativo");
        }
    }
}
