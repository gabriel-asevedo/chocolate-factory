package entities;

public class Caldeira {

    private boolean vazio;
    private boolean fervido;

    private static Caldeira instancia;

    private Caldeira() {
        this.vazio = true;
        this.fervido = false;
    }

    public static Caldeira getInstancia() {
        if (instancia == null) {
            instancia = new Caldeira();
        }
        return instancia;
    }

    public void encher() {
        if (vazio) {
            this.vazio = false;
            this.fervido = false;
            System.out.println("Caldeira preenchida com chocolate e leite.");
        } else {
            System.out.println("Caldeira já está cheia.");
        }
    }

    public void ferver() {
        if (!vazio && !fervido) {
            this.fervido = true;
            System.out.println("Caldeira fervendo a mistura.");
        } else if (vazio) {
            System.out.println("Caldeira está vazia, não pode ferver.");
        } else {
            System.out.println("A mistura já foi fervida.");
        }
    }

    public void drenar() {
        if (!vazio && fervido) {
            this.vazio = true;
            System.out.println("Mistura drenada.");
        } else if (vazio) {
            System.out.println("Caldeira está vazia, nada para drenar.");
        } else {
            System.out.println("A mistura ainda não foi fervida.");
        }
    }

    public boolean isVazia() {
        return vazio;
    }

    public boolean isFervido() {
        return fervido;
    }
}