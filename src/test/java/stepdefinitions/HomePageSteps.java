package stepdefinitions;

import com.saucedemo.pages.DriverFactory;
import com.saucedemo.pages.HomePage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;

public class HomePageSteps {
    HomePage home = new HomePage(DriverFactory.getPage());

    @Then("User verify the first product name {string}")
    public void userVerifyTheFirstProductName(String expectedProductName) {
        String productName = home.getFirstProductName();
        System.out.println(productName);
        Assert.assertEquals(expectedProductName, productName);
    }

    @Then("User add product {string} to chart")
    public void userAddProductToChart(String productName) {
        home.addProductToChart(productName);
    }

    @Then("User add multiple products")
    public void userAddMultipleProducts(DataTable dataTable) {
        List<String> productList = dataTable.asList(String.class);
        System.out.println("Product List:"+productList);
        if (productList == null)
            System.err.println("Data table is empty");
        else {
            String header = productList.get(0);
            System.out.println("Header:"+header);
            for (int i=1; i<productList.size(); i++) { //skip header: element 0
                home.addProductToChart(productList.get(i));
            }
        }
    }
}
