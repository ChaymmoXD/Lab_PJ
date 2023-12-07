package problema2lab;

public class Tir extends Vehicul{
    int incarcatura_maxima;

    public Tir() {
    }

    public Tir(String marca, float pret, int incarcatura_maxima) {
        super(marca, pret);
        this.incarcatura_maxima = incarcatura_maxima;
    }

    public int getIncarcatura_maxima() {
        return incarcatura_maxima;
    }

    public void setIncarcatura_maxima(int incarcatura_maxima) {
        this.incarcatura_maxima = incarcatura_maxima;
    }

    @Override
    public String toString() {
        return "Tir{" +
                "incarcatura_maxima=" + incarcatura_maxima +
                '}';
    }
}
