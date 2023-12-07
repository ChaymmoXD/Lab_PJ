package problema2lab;

public class Autoturism extends Vehicul{
    int volum;
    int greutate;

    public Autoturism() {
    }



    public Autoturism(String marca, float pret, int volum, int greutate) {
        super(marca, pret);
        this.volum = volum;
        this.greutate = greutate;
    }

    public int getVolum() {
        return volum;
    }

    public void setVolum(int volum) {
        this.volum = volum;
    }

    public int getGreutate() {
        return greutate;
    }

    public void setGreutate(int greutate) {
        this.greutate = greutate;
    }

    @Override
    public String toString() {
        return "Autoturism{" +
                "volum=" + volum +
                ", greutate=" + greutate +
                '}';
    }
}
