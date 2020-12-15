public class Jogador{
    int forca, nivel, pontosAtuais;

    Jogador(int forca, int nivel, int pontosAtuais){
        this.forca = forca;
        this.nivel = nivel;
        this.pontosAtuais = pontosAtuais;
    }

int totalAtaque(int forca, int nivel){
    return forca * nivel;
}

void atacar(Jogador outroJogador){
    outroJogador.pontosAtuais -= this.totalAtaque(forca, nivel);
}
}