package Command;

public class CentralControle {
    private Comando comandoAtual;

    public void definirComando(Comando comando) {
        this.comandoAtual = comando;
    }

    public void pressionarBotao() {
        if (comandoAtual != null) {
            comandoAtual.executar();
        } else {
            System.out.println("Nenhum comando configurado.");
        }
    }

    public void pressionarBotaoDesfazer() {
        if (comandoAtual != null) {
            comandoAtual.desfazer();
        } else {
            System.out.println("Nenhum comando para desfazer.");
        }
    }
}
