package state;

public class Normal implements Estado{
    @Override
    public void andar() {
        System.out.println("Caminhando normal");
    } 
}
