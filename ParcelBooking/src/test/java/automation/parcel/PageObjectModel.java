package automation.parcel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.page.objects.BookParcel;
import com.page.objects.ParcelPage;

public class PageObjectModel

{

	private static WebDriver driver = null;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:/Pranali/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://staging.parcelpoint.com.au/");

		ParcelPage.shop_Collect(driver).click();
		ParcelPage.postCode(driver).sendKeys("2150");
		ParcelPage.findParcel(driver).click();

		BookParcel.Location(driver).click();
		BookParcel.online_Store(driver).sendKeys("Amazon");
		BookParcel.order_Number(driver).sendKeys("3247979");

		BookParcel.contactDetails_Name(driver).sendKeys("Pranali");
		BookParcel.contactDetails_Email(driver).sendKeys(BookParcel.getEmail());
		BookParcel.contactDetails_Mobile(driver).sendKeys("0469818963");

		BookParcel.paymentDetails_Name(driver).sendKeys("Pranali Wagh");
		BookParcel.paymentDetails_Card(driver).sendKeys("5105105105105100");
		BookParcel.paymentDetails_ExpiryMonth(driver);
		BookParcel.paymentDetails_ExpiryYear(driver);
		BookParcel.paymentDetails_CVV(driver).sendKeys("777");
		BookParcel.book_Parcel(driver).click();

		// driver.quit();

	}

}