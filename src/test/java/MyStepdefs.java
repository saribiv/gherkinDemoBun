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



}