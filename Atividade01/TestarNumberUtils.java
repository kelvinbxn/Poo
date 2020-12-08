public class TestarNumberUtils {
    public static void main(String[] Strings){
        NumberUtils isPar = new NumberUtils();
        NumberUtils isPrime = new NumberUtils();
        NumberUtils printCount = new NumberUtils();
        NumberUtils printReverseCount = new NumberUtils();

        boolean par = isPar.isPar(13);
        boolean primo = isPrime.isPrime(13);
        
        if(par){
            System.out.println("É Par");
        }
        else{
            System.out.println("Não é Par");
        }

        if(primo){
            System.out.println("É Primo");
        }
        else{
            System.out.println("Não é Primo");
        }
        
        printCount.printCount(13);
        printReverseCount.printReverseCount(13);
    }
    
}
