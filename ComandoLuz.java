package Command;

public class ComandoLuz implements Comando {
    private Luz luz;

    public ComandoLuz(Luz luz) {
        this.luz = luz;
    }

    @Override
    public void executar() {
        luz.ligar();
    }

    @Override
    public void desfazer() {
        luz.desligar();
    }
}
