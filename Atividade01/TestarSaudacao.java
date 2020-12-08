public class TestarSaudacao{
    public static void main(String[] Strings){
        Saudacao saudacao = new Saudacao();
        saudacao.texto = "Olá";
        saudacao.destinatario = "Kelvin!";
        System.out.println(saudacao.obterSaudacao());
    }

}