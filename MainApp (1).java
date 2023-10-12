import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class MainApp
{
    public static void main(String[] args)
    {
        String nume_fis = "src/judete_in.txt";
        BufferedReader flux_in;
        String[] judete = new String[7];
        int n = 0;

        try
        {
            flux_in = new BufferedReader(new FileReader(nume_fis));
            String linie;

            while((linie = flux_in.readLine()) != null)
            {
                judete[n] = linie;
                n=n+1;
            }
        }
        catch (IOException e){
        }

        Arrays.sort(judete);
        afisare(judete);

        Scanner scanner = new Scanner(System.in);
        System.out.print("a=");
        String a=scanner.next();

        int poz=Arrays.binarySearch(judete, a);

        System.out.println("pozitia: " + (poz+1));
    }

    private static void afisare(String[] judete) {
        for(String str:judete)
            System.out.println(str);
    }
}

