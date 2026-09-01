package edu.dosw.parcial;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    @Bean
    public CommandLineRunner run() {
        return args -> {
            System.out.println("\n==================================================");
            System.out.println("  🚀 DOSW - PARCIAL T1 INICIALIZADO CON ÉXITO    ");
            System.out.println("  Contexto de Spring cargado y listo para operar ");
            System.out.println("==================================================\n");
        };
    }
}