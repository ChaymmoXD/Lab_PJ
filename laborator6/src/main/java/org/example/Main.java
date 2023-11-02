package org.example;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        List<Angajat> angajati = new ArrayList<Angajat>();
        angajati = citire();
        scriere(angajati);

        angajati.forEach(System.out::println);
    }

    public static void scriere(List<Angajat> lista) {
        try {
            ObjectMapper mapper=new ObjectMapper();
            mapper.registerModule(new JavaTimeModule());
            mapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
            File file=new File("src/main/resources/angajati.json");
            mapper.writeValue(file,lista);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static List<Angajat> citire() {
        try {
            File file=new File("src/main/resources/angajati.json");
            ObjectMapper mapper=new ObjectMapper();
            mapper.registerModule(new JavaTimeModule());
            List<Angajat> angajati = mapper
                    .readValue(file, new TypeReference<List<Angajat>>(){});
            return angajati;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}