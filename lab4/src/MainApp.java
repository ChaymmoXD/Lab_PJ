import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class MainApp
{
    public static void main(String[] args) {
        List<Echipament> echipamente = null;
        Scanner scanner = null;
        try
        {
            scanner = new Scanner(new File("src/echipamente.txt"));
            String[] linie;
            while(scanner.hasNextLine())
            {
                linie = scanner.nextLine().split(";");
                int i;
                for(i=0;i< linie.length;i++)
                    System.out.print(linie[i] + " ; ");
                System.out.println("");
            }
        }
        catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
