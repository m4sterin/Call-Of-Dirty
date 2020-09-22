package state;

public class Lento implements Estado {
    @Override
    public void andar() {
        System.out.println("Caminhando devagar");
    }  
}
