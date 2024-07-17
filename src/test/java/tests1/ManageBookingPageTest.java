package tests1;

import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests1.BaseTest;

import static tests1.BaseTest.driver;

public class ManageBookingPageTest extends BaseTest {

    @Test
    public void testManageBooking() throws InterruptedException {
        manageBookingPage.setManageBooking();
        manageBookingPage.setPNRNum("23456789");
        manageBookingPage.setEmailId("suriyaprabatester@gmail.com");
        manageBookingPage.setSearchButton();
        Thread.sleep(3000);
        String str = driver.findElement(By.xpath("//div[@class='css-76zvg2 css-cens5h r-jwli3a']")).getText();
        System.out.println(str);
        Assert.assertEquals(str, "Unable to fetch your booking. Please check the inputs \n" +
                " you have provided and try again.");
    }
}