import java.util.List;
import java.util.Objects;

public class Parabola
{
    private final int a,b,c;

    public Parabola(int a,int b,int c)
    {
        this.a=a;
        this.b=b;
        this.c=c;
    }

    public Punct varf()
    {
        return new Punct(-b/(2*a),-b*b+4*a*c/4*a);
    }

    @Override
    public String toString()
    {
        return "f(x)=" + a + "x^2" + (b<0?"":"+") + b + "x" + (c<0?"":"+") + c;
    }

    public Punct mijloc_varfuri(Parabola temp)
    {
        return new Punct((this.varf().getX()+temp.varf().getX())/2,(this.varf().getY()+temp.varf().getY())/2);
    }
}
