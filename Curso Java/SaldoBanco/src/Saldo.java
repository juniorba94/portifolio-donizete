import java.util.Scanner;

public class Saldo {
    public static void main(String[] args) {

        String nome = "Donizete Batista Junior";
        String tipoConta = "Corrente";
        double saldo = 2500.00;
        int operacao = 0;

        Scanner scanner = new Scanner(System.in);


            System.out.println("**********************************");
            System.out.println("Dados iniciais do cliente: ");
            System.out.println("\nNome do cliente: " + nome);
            System.out.println("Tipo de conta: " + tipoConta);
            System.out.println("Saldo do cliente: "+ saldo);
            System.out.println("\n**********************************");


            String menu = """
                    ** Digite  sua opção ** 
                    1 - Consultar saldo
                    2 - Transferir valor 
                    3-  Receber valor 
                    4 - Sair 
                    
                    """;
        while(operacao != 4){
            System.out.println(menu);
            operacao = scanner.nextInt();
            if(operacao == 1){
                System.out.println("Saldo disponível é " + saldo);
            }
            else if(operacao == 2){
                System.out.println("Qual valor que você deseja transferir");
                double valor = scanner.nextDouble();
                if(valor > saldo){
                    System.out.println("Não há saldo para realizar a transferência");
                }else {
                    saldo -= valor;
                    System.out.println("Saldo atualizado é: " + saldo);
                }
            }
            else if(operacao == 3){
                System.out.println("Valor recebido: ");
                double valor = scanner.nextDouble();
                saldo += valor;
                System.out.println("Saldo atualizado é: " + saldo);
            } else if(operacao != 4){
                System.out.println("Operação inválida");
            }
        }
    }
}
