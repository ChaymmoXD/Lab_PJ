import java.io.*;
import java.util.List;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        String nume_fis = new String("src/in.txt");
        Parabola p;
        try
        {
            Scanner scanner = new Scanner(new File(nume_fis));
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int z = scanner.nextInt();
            System.out.println(x +"," + y + ","+ z);
            p = new Parabola(x,y,z);
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(p.toString());
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();
        Parabola t = new Parabola(x,y,z);
        System.out.println(t.toString());
    }
}