package factory;
import strategy.*;
public class CallOfDirty {
    public static void main(String[] args) {
        Personagem p = new Personagem();
        ModoTiroFactory mt = new ModoTiroFactory();
        ModoAtirar modo = mt.criarModoTiro("m4a1");
        p.setModo(modo);
        p.atirar();

        modo = mt.criarModoTiro("vog48");
        p.setModo(modo);
        p.sofrerDano(60);
        p.atirar();
        p.andar();
    }
}
