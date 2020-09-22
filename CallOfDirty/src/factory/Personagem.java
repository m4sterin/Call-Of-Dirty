package factory;

import strategy.*;
import state.*;

public class Personagem {
    ModoAtirar modo;
    Estado estadoAtual;
    private String nome = "player_000x";
    private int life = 100;
    
    public Personagem(String nome){
        this.nome = nome;
        this.estadoAtual = new Normal();
    }
    public void andar(){
        estadoAtual.andar();
    }
    public void atirar(){
        modo.atirar();
    }
    public ModoAtirar getModo() {
        return modo;
    }
    public void setModo(ModoAtirar modo) {
        this.modo = modo;
    }   
    public void usouKitMedico(int cura){
        this.life= this.life + cura;
        if (this.life > 60){
            this.estadoAtual = new Normal();
        }
    }
    public void sofrerDano(int dano){
        this.life= this.life - dano;
        if (this.life < 60){
            this.estadoAtual = new Lento();
        }
    }    
}
