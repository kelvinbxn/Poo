public class Conta {
    double saldo;
    String agencia;

    Conta(String agencia, double valor){
        this.saldo = valor;
        this.agencia = agencia;
    }

    boolean sacar(double valor){
        if(saldo - valor < 0){
            return false;
        }
        else{
            saldo = saldo - valor;
            return true;
        }
    }

    void depositar(double valor){
        saldo = saldo + valor;
    }

    double consultaSaldo(){
        return saldo;
    }

    boolean transferir(Conta destino,double valor){
        if(this.sacar(valor) == false){
            return false;
        } 
        else{
            destino.depositar(valor);
            return true;
        }
    }
}
