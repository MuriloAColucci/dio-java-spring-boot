package one.digitalinnovation.gof.strategy;

public class Robo {
    private Comportamento comportamento;

    public void setComportamento(Comportamento stragety) {
        this.comportamento = stragety;
    }

    public void mover(){
        comportamento.mover();
    }
}
