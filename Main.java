public class Lampada {
    public static void main(String[] args) {
        Lampada lampada = new Lampada();

        lampada.acender();
        lampada.desligar();
        lampada.piscar();
    }
    private boolean ligada;

    public Lampada() {
        this.ligada = false;
    }

    public void acender() {
        this.ligada = true;
        System.out.println("A lâmpada foi acesa.");
    }

    public void desligar() {
        this.ligada = false;
        System.out.println("A lâmpada foi desligada.");
    }

    public void piscar() {
        if (this.ligada) {
            desligar();
        } else {
            acender();
        }
    }
}
