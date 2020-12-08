public class NumberUtils {
    int numero;


    public boolean isPar(int numero){
        if(numero % 2 == 0){
            return true;
        }
        return false;
    }

    public boolean isPrime(int numero){
        for(int j = 2; j < numero; j++){
            if(numero % j == 0){
                return false;
            } 
        }
        return true;
    }

    public void printCount(int numero){
        for(int i = 0; i <= numero; i++){
            System.out.println(i);
        }
    }

    public void printReverseCount(int numero){
        for(int i = numero; i >= 0; i--){
            System.out.println(i);
        }
    }
    
}
