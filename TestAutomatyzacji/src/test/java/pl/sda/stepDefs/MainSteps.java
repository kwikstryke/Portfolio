package pl.sda.stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;

public class MainSteps {
    private int wynik;
    private  int a;
    private  int b;
    @Given("wartosci: {int}{int}")
    public void  dane(int a, int b){
        this.a = a;
        this.b = b;
    }

    @When("mnozenie wartosci {int}{int}")
    public void mnozenie (int a, int b) {
        int wynik = a*b;
    }
@When("dzielenie wartosci")
public void dzielenie() {
        wynik = a/b;
}
    @Then("weryfikacja mnozenia liczb{int}*{int} da wynik {int}")
    public int verify(int a, int b, int c) {
        int wynik = a*b;
        assertEquals(c, wynik);
return c;
    }

}
