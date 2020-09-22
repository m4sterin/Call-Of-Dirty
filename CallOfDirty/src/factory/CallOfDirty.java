package factory;

import strategy.*;

public class CallOfDirty {
    public static void main(String[] args) {
        ModoTiroFactory mt = new ModoTiroFactory();
        ModoAtirar modo;
        
        Personagem p1 = new Personagem("Xesque Man");
        modo = mt.criarModoTiro("m4a1");
        p1.setModo(modo);
        
        Personagem p2 = new Personagem("Trosoba");
        modo = mt.criarModoTiro("vog48");
        p2.setModo(modo);
        
        p1.atirar();
        p2.sofrerDano(10);
        
        p2.atirar();
        p1.sofrerDano(60);
        
        p1.atirar();
        p2.sofrerDano(30);
        
        p2.atirar();
        p1.sofrerDano(20);
        
        p1.atirar();
        p2.sofrerDano(40);
        
        p2.atirar();
        p1.sofrerDano(10);
        p2.andar();
        p2.usouKitMedico(50);
        p2.andar();
    }
}
