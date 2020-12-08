public class Soma {
    int x,b;
    
    public static void main(String[] Strings){
        Soma soma = new Soma();
        soma.x = 5;
        soma.b = 8;
        System.out.println(soma.calcularSoma()); 
    }

    int calcularSoma(){
        return x + b;
    }
}
