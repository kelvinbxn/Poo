public class TestarProduto{
    public static void main(String[] args) {
        Produto p1 = new Produto(123, 200, 30, "Arroz");
        Produto p2 = new Produto(124, 45, 30, "Feijão");

        p1.baixar(10);
        p1.baixar(500); // não tem como baixar mais doque a quantidade
        p1.repor(50);
        p1.reajuste(10);

        System.out.println(p1.toString());

        if(p1.equals(p2)){
            System.out.println("É o mesmo Produto!");
        }
        else{
            System.out.println("É outro Produto!");
        }
    }
}