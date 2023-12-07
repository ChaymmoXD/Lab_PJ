package problema2lab;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        // Configurare prin xml
        ApplicationContext contextXml = new ClassPathXmlApplicationContext("beans_lab1.xml");

// Obținerea și afișarea bean-urilor
        Autoturism autoturismSetter = contextXml.getBean("autoturism1", Autoturism.class);
        Autoturism autoturismConstructor = contextXml.getBean("autoturism2", Autoturism.class);
        Motocicleta motocicleta = contextXml.getBean("motocicleta", Motocicleta.class);

        System.out.println(autoturismSetter.toString());
        System.out.println(autoturismConstructor.toString());
        System.out.println(motocicleta.toString());

// Configurare prin adnotări
        ApplicationContext contextAnnotations = new ClassPathXmlApplicationContext("beans_lab2.xml");

//// Obținerea și afișarea bean-ului
        Tir tirBean = contextAnnotations.getBean("tir", Tir.class);
        System.out.println(tirBean.toString());
    }
}