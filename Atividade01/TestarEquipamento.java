public class TestarEquipamento {
    public static void main(String[] args) {
        Equipamento lampada1 = new Equipamento();
        Equipamento lampada2 = new Equipamento();

        lampada1.ligado = lampada1.liga();
        lampada2.ligado = lampada2.desliga();

        lampada1.ligado = lampada1.inverte();
        lampada2.ligado = lampada2.inverte();

        if(lampada1.estaLigado()){
            System.out.println("A Lampada 1 Está Ligada");
        }
        else{
            System.out.println("A Lampada 1 Está desligada");
        }

        if(lampada2.estaLigado()){
            System.out.println("A Lampada 2 Está Ligada");
        }
        else{
            System.out.println("A Lampada 2 Está Desligada");
        }
    }
}
