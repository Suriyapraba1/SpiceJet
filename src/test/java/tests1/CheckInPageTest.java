package tests1;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckInPageTest extends BaseTest {

    @Test
    public void testCheckInPage(){
        checkInPage.setCheckInButton();
        checkInPage.setPnrNum("876543568");
        checkInPage.setEmailId("suriyaprabatester@gmail.com");
        checkInPage.setSearchButton();
        String str = driver.findElement(By.xpath("//div[@class='css-76zvg2 css-cens5h r-jwli3a']")).getText();
        System.out.println(str);
        Assert.assertEquals(str,"Unable to fetch your booking. Please check the inputs \n" +
                " you have provided and try again.");
    }
}
