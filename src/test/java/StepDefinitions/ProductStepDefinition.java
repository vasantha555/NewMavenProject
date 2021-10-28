package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class ProductStepDefinition {
    @And("Click on {string}")
    public void enterProduct(String shirt)
    {
     System.out.println("Inside product stepdefinition");

    }
    @Then("Product List should be opened")
    public void getProductList(String product)
    {

    }
}
