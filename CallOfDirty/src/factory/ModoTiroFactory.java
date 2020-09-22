package factory;

import strategy.*;

public class ModoTiroFactory {
     public ModoAtirar criarModoTiro(String arma){
        if(arma.equalsIgnoreCase("m4a1")){
            return new Automatico();
        }if(arma.equalsIgnoreCase("vog48")){
            return new Explosao();
        }if(arma.equalsIgnoreCase("vepr hunter")){
            return new SemiAutomatico();
        }else{
            return new Rajada();
        }
    }   
}
