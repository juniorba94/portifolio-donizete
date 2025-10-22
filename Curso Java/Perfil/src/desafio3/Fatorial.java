package desafio3;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número para o fatorial: ");
        int numero = scanner.nextInt();
        int fatorial = 1;
        if(fatorial < 0){
            System.out.println("Não existe fatorial de números negativos");
        }

        for (int i = 1; i <= numero; i++){
            fatorial *= i;
        }

        System.out.println("O fatorial do número selecionado é: " + fatorial );
    }
}
