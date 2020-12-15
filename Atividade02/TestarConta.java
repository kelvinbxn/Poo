public class TestarConta {
    public static void main(String[] args) {
        Conta c1 = new Conta("1", 500);
        Conta c2 = new Conta("2", 700);

        c1.depositar(50);
        c2.transferir(c1, 70);

        System.out.println(c1.consultaSaldo());
        System.out.println(c2.consultaSaldo());
    }
}
