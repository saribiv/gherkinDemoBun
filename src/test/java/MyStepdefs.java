import cucumber.api.PendingException;
import cucumber.api.java.en.*;
import static org.junit.Assert.assertEquals;
public class MyStepdefs {


    @io.cucumber.java.en.Given("{int}")
    public void some(int arg0) {
        boolean i = false;
        if( (arg0 % 2)==0) {
            assertEquals(1, 1);
        } else {
            assertEquals(1, 2);
        }
    }

    @Given("<d>")
    public void d() {
        // Write code here that turns the phrase above into concrete actions
//        throw new cucumber.api.PendingException();
    }

    @When("<df>")
    public void df() {
        // Write code here that turns the phrase above into concrete actions
//        throw new cucumber.api.PendingException();
    }

    @Then("sdf")
    public void sdf() {
        // Write code here that turns the phrase above into concrete actions
//        throw new cucumber.api.PendingException();
    }

    @Given("numberOdd")
    public void numberodd() {
        // Write code here that turns the phrase above into concrete actions
      //  throw new cucumber.api.PendingException();
    }

    @Then("one")
    public void one() {
        // Write code here that turns the phrase above into concrete actions
        //throw new cucumber.api.PendingException();
    }

    @Given("numberEven")
    public void numbereven() {
        // Write code here that turns the phrase above into concrete actions
       // throw new cucumber.api.PendingException();
    }


    @Then("three")
    public void three() {
        // Write code here that turns the phrase above into concrete actions
      // throw new cucumber.api.PendingException();
    }

    @Then("two")
    public void two() {
        // Write code here that turns the phrase above into concrete actions
        // throw new cucumber.api.PendingException();
    }

    @Given("all")
    public void all() {
        // Write code here that turns the phrase above into concrete actions
      //  throw new cucumber.api.PendingException();
    }

    @Given("new given")
    public void new_given() {
        // Write code here that turns the phrase above into concrete actions
       // throw new cucumber.api.PendingException();
    }

    @When("new when")
    public void new_when() {
        // Write code here that turns the phrase above into concrete actions
       // throw new cucumber.api.PendingException();
    }

    @Then("new then")
    public void new_then() {
        // Write code here that turns the phrase above into concrete actions
      //  throw new cucumber.api.PendingException();
    }


    @io.cucumber.java.en.Then("four")
    public void four() {
        // Write code here that turns the phrase above into concrete actions
       // throw new PendingException();
    }
}