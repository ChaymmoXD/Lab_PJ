package problema2lab;

public class Motocicleta extends Vehicul{
    int viteza_maxima;

    public Motocicleta() {
    }

    public Motocicleta(String marca, float pret, int viteza_maxima) {
        super(marca, pret);
        this.viteza_maxima = viteza_maxima;
    }

    public int getViteza_maxima() {
        return viteza_maxima;
    }

    public void setViteza_maxima(int viteza_maxima) {
        this.viteza_maxima = viteza_maxima;
    }

    @Override
    public String toString() {
        return "Motocicleta{" +
                "viteza_maxima=" + viteza_maxima +
                '}';
    }
}
