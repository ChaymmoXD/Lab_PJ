package exercitiul1;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDate;
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
    public static void main(String[] args) {
//       List<Angajat>angajati1=new ArrayList<>();
//      angajati1.add(new Angajat("a","a", LocalDate.of(2023,02,22),3000));
//      angajati1.add(new Angajat("a","a", LocalDate.of(2023,05,22),3000));
//      angajati1.add(new Angajat("a","a", LocalDate.of(2023,11,22),3000));
//      angajati1.add(new Angajat("a","a", LocalDate.of(2023,02,22),3000));
//      angajati1.add(new Angajat("a","a", LocalDate.of(2023,02,22),3000));
//      scriere(angajati1);
        System.out.println("Afișarea listei de angajați: ");
        List<Angajat>angajati=citire();
        System.out.println(angajati);
        for(Angajat p:angajati){
            System.out.println(p);
        }
        angajati.add(new Angajat());
        scriere(angajati);
    }
}