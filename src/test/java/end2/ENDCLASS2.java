package end2;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import java.util.concurrent.TimeUnit;


public class ENDCLASS2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver(); // open the browser
		
		 driver.manage().window().maximize();
		   
	     driver.get("https://www.amazon.in");
	        

	     
	     AmazonHomePage homePage = new AmazonHomePage(driver);
	        homePage.signIn();
	        homePage.searchProduct("iPhone 13");
	        homePage.applyFilters();
	        homePage.addToWishlist();
	        boolean confirmationBoxDisplayed = homePage.isConfirmationBoxDisplayed();

	        // Output result
	        if (confirmationBoxDisplayed) {
	            System.out.println("Product added to wishlist successfully!");
	        } else {
	            System.out.println("Failed to add product to wishlist.");
	        }

	        // Close the browser
	        driver.quit();
	        driver.quit();
	    }
	}

	// Example Page Object Model class for Amazon homepage
	class AmazonHomePage {
	    private WebDriver driver;

	    public AmazonHomePage(WebDriver driver) {
	        this.driver = driver;
	    }

	    public void signIn() {
	    }

	    public void searchProduct(String productName) {
	        // Code to interact with search bar and search for the specified product
	    }

	    public void applyFilters() {
	        // Code to apply filters for the product search
	    }

	    public void addToWishlist() {
	        // Code to add the product to the wishlist
	    }

	    public boolean isConfirmationBoxDisplayed() {
	        // Code to verify if the confirmation box is displayed after adding to the wishlist
	        return driver.findElement(By.id("confirmation-box")).isDisplayed();
	    }
	
	     
	     


	}


