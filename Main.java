package Command;

public class Main {
    public static void main(String[] args) {
        Luz luz = new Luz();
        Ventilador ventilador = new Ventilador();

        Comando comandoLuz = new ComandoLuz(luz);
        Comando comandoVentilador = new ComandoVentilador(ventilador);

        CentralControle central = new CentralControle();

        central.definirComando(comandoLuz);
        central.pressionarBotao();
        central.pressionarBotaoDesfazer();

        central.definirComando(comandoVentilador);
        central.pressionarBotao();
        central.pressionarBotaoDesfazer();
    }
}
