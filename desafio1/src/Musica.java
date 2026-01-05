public class Musica {
    String titulo;
    String artista;
    int anoLancamento;
    double somaDasAvaliacao;
    int numAvaliacoes;

    void exibirFichaTecnica(){
        System.out.println("Título da música: " + titulo);
        System.out.println("Artista: " + artista);
        System.out.println("Ano de Lançamento: " + anoLancamento);
    }

    void avaliaMusica(double nota){
        somaDasAvaliacao += nota;
        numAvaliacoes++;
    }
    double pegaMediaMusica(){
        double mediaMusica = somaDasAvaliacao/numAvaliacoes;
        return mediaMusica;
    }
}
