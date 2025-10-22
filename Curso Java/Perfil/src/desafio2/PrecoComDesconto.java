package desafio2;

public class PrecoComDesconto {
    public static void main(String[] args) {
        double precoOriginal = 1400.00;
        double percentualDesconto = 10;
        double valorDesconto = (percentualDesconto/ 100.00) * precoOriginal;
        double precoFinalComDesconto = precoOriginal - valorDesconto;


        System.out.println("Preço original: R$" + precoOriginal);
        System.out.println("Desconto: R$" + valorDesconto);
        System.out.println("Novo preço com desconto: R$" + precoFinalComDesconto);
    }
}
