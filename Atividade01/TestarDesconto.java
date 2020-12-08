public class TestarDesconto {
    public static void main(String[] args){
        Desconto desconto = new Desconto();

        desconto.valorCalculado = desconto.calcula(120.00);

        System.out.println("Valor com desconto: " + desconto.valorCalculado);
    }
}
