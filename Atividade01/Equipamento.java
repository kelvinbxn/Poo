public class Equipamento {
    boolean ligado;



    public boolean liga(){
        if(ligado){
            return ligado;
        }
        else{
            return ligado = true;
        }
    }

    public boolean desliga(){
        if(ligado){
            return ligado;
        }
        else{
            return ligado = false;
        }
    }

    public boolean inverte(){
        if(ligado){
            return false;
        }
        else{
            return true;
        }
    }

    public boolean estaLigado(){
        if(ligado){
            return true;
        }
        else{
            return false;
        }
    }


}

