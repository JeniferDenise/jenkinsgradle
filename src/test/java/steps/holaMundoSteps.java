package steps;



//import io.cucumber.core.cli.Main;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Main;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;

public class holaMundoSteps {
    private static String nombre;
    private static String retorno;

    @Given("Entrego el {string}")
    public void entregoEl(String nombre) {
        this.nombre = nombre;
    }

    @When("ejecuto la clase")
    public void ejecutoLaClase() {
    retorno= Main.main(this.nombre);
    }

    @Then("se imprimie msj Hola mundo mas el {string}")
    public void seImprimieMsjHolaMundoMasEl(String arg0) {
        System.out.println("comparando resultados example: "+this.nombre);
    Assert.assertEquals("Hola mundo "+nombre,retorno);
    }
}
