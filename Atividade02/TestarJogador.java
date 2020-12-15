public class TestarJogador {
    public static void main(String[] args) {
        Jogador j1 = new Jogador(7, 15, 100);
        Jogador j2 = new Jogador(5, 10, 90);

        j1.atacar(j2);
        j2.atacar(j1);

        if(j1.pontosAtuais > j2.pontosAtuais){
            System.out.println("O jogador 1 Tem mais Pontos!");
        }
        else if(j2.pontosAtuais > j1.pontosAtuais){
            System.out.println("O jogador 2 Tem mais Pontos!");
        }
        else{
            System.out.println("Os dois jogadores tem a mesma quantidade de Pontos!");
        }
    }
}
