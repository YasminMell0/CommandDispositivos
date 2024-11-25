package Command;

public class ComandoVentilador implements Comando {
    private Ventilador ventilador;

    public ComandoVentilador(Ventilador ventilador) {
        this.ventilador = ventilador;
    }

    @Override
    public void executar() {
        ventilador.ligar();
    }

    @Override
    public void desfazer() {
        ventilador.desligar();
    }
}
