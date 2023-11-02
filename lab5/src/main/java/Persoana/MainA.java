package Persoana;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MainA {
    public static void scriere(List<Persoana> lista) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            File file = new File("src/main/resources/persoane.json");
            mapper.writeValue(file, lista);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Persoana> citire() {
        try {
            File file = new File("src/main/resources/persoane.json");
            ObjectMapper mapper = new ObjectMapper();
            List<Persoana> persoane = mapper.readValue(file, new TypeReference<List<Persoana>>() {
            });
            return persoane;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new ArrayList<>();
    }

    public static void main(String[] args) {
        List<Persoana> persoane = citire();
        System.out.println(persoane);

        for (Persoana p : persoane) {
            System.out.println(p);
        }
        persoane.add(new Persoana("Maria", 33));
        scriere(persoane);

        List<PerecheNumere> listaPerechi = new ArrayList<>();

        listaPerechi.add(new PerecheNumere(12, 18));
        listaPerechi.add(new PerecheNumere(8, 24));
        listaPerechi.add(new PerecheNumere(15, 25));
    }
}
