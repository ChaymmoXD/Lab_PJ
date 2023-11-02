package problema;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainApp {


    public static void scriere(List<Angajat> lista) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            mapper.registerModule(new JavaTimeModule());
            mapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
            File file = new File("src/main/resources/angajati.json");
            mapper.writeValue(file, lista);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static List<Angajat> citire() {
        try {
            File file = new File("src/main/resources/angajati.json");
            ObjectMapper mapper = new ObjectMapper();
            mapper.registerModule(new JavaTimeModule());
            List<Angajat> angajati = mapper.readValue(file, new TypeReference<List<Angajat>>() {
            });
            return angajati;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;

    }
         /*   try

    {
        List<Angajat> angajati = mapper.readValue(new File("src/main/resources/angajati.json"), new TypeReference<List<Angajat>>() {
        });
        System.out.println("Lista de angajati: ");
        angajati.forEach(System.out::println);
    }*/

    public static void main(String[] args){
    List<Angajat>lista=citire();
    Scanner read=new Scanner(System.in);
    int optiune;
    do {
        System.out.println("0. Exit.");
        System.out.println("1. Afișarea listei de angajați folosind referințe la metode.");
        System.out.println("2.Afișarea angajaților care au salariul peste 2500 RON");
        System.out.println("3.Crearea unei liste cu angajații din luna aprilie, a anului trecut, care au funcție de\n" +
                "conducere (postul conține unul din cuvintele sef sau director).");
        System.out.println("Introduceti optiunea: ");
        optiune = read.nextInt();
        //optiune=scanner.nextIn();
        switch (optiune) {

            case 0:
                break;
            case 1:
                System.out.println("Lista de angajati: ");
                lista.stream()
                        .forEach(System.out::println);

                break;
            case 2:
                System.out.println("Angajatii ce au salariul peste 2500RON: ");
                lista.stream()
                        .filter(angajat->angajat.getSalariu()>2500)
                        .forEach(System.out::println);
                break;
            case 3:


        }
    }while(optiune!=0);


    }
}
