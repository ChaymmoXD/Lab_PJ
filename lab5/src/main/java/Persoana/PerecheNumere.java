package Persoana;
//variabile membre 2 intregi
//un constructor cu parametrii si unul fara, gettere si settere
//se va redefini metoda toString din cls Object
//se va creea o colectie de obiecte de tip list in care se vor adauga min 3 perechi de numere
public class PerecheNumere {
private Integer a;
private Integer b;
    public PerecheNumere() {

    }
    public PerecheNumere(Integer a, Integer b) {
        this.a = a;
        this.b = b;
    }

    public Integer getA() {
        return a;
    }

    public void setA(Integer a) {
        this.a = a;
    }

    public Integer getB() {
        return b;
    }

    public void setB(Integer b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "PerecheNumere{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
    private Integer CMMD() {
        int nr1=a;
        int nr2=b;
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
