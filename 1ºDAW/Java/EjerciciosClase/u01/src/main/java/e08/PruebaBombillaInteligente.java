package e08;

public class PruebaBombillaInteligente {
    public static void main(String[] args) {
        BombillaInteligente led = new BombillaInteligente();
        BombillaInteligente phillips = new BombillaInteligente();
        led.encender();
        led.apagar();
        led.encender();
        led.apagar();
        led.encender();
        led.apagar();
        phillips.encender();
        phillips.apagar();
        led.obtieneNumVecesEncendida();
        phillips.obtieneNumVecesEncendida();
    }
}
