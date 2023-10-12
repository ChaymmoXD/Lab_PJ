package exercitiul1;

import java.io.*;
import java.util.Scanner;
import java.io.IOException;

public class MainApp
{
    public static void main(String[] args) throws FileNotFoundException {
        ex2();
    }

    public static void ex2()
    {
        String nume_fis= "src/exercitiul1/in.txt ";
        int  suma = 0, indice = 0, valoarea_minima = 10, valoarea_maxima = 0;
        try(BufferedReader reader = new BufferedReader(new FileReader(nume_fis)))
        {
            String line;
            while((line = reader.readLine()) != null)
            {
                try
                {
                    int number = Integer.parseInt(line);
                    suma = suma + number;
                    if(valoarea_minima > number)
                        valoarea_minima = number;
                    if(valoarea_maxima < number)
                        valoarea_maxima = number;
                    indice = indice + 1;
                    //System.out.println(number);
                }
                catch(NumberFormatException e)
                {}
            }
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Suma este "+suma);
        System.out.println("media aritmetica este "+((float)suma/indice));
        System.out.println("valoarea minima este "+valoarea_minima);
        System.out.println("valoarea maxima este "+valoarea_maxima);

        
    }

    public static void ex1()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("lungime=");
        int lungime = scanner.nextInt();
        System.out.println("latime=");
        int latime = scanner.nextInt();
        int perimetru = 2 * latime + 2 * lungime;
        System.out.println("Perimetrul este "+perimetru);
        int aria = latime * lungime;
        System.out.println("Aria este "+aria);
    }
}
