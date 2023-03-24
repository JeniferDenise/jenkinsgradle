package steps;


import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import org.junit.jupiter.api.BeforeEach;


public class Hooks {
    @BeforeAll
    public static void mensajeInicial() {
        System.out.println("Este es el tag Before de Cucumber");
    }

    @AfterAll
    public static void mensajeFinal() {
        System.out.println("Este es el tag After de Cucumber");
    }
}