import com.thoughtworks.gauge.Step;
import com.thoughtworks.gauge.Table;
import com.thoughtworks.gauge.TableRow;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.util.*;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class StepImplementation extends BaseTest {

    @Step("İzin reddet")
    public void permissionDenyButton() throws InterruptedException {
        Thread.sleep(3000);
        MobileElement el1 = (MobileElement) appiumDriver.findElementById("com.android.packageinstaller:id/permission_deny_button");
        el1.click();
        Thread.sleep(1500);
        MobileElement el2 = (MobileElement) appiumDriver.findElementById("com.turkishairlines.mobile:id/frPrivacy_btnAccept");
        el2.click();
        Thread.sleep(1500);
        MobileElement el3 = (MobileElement) appiumDriver.findElementById("com.turkishairlines.mobile:id/dgBase_btnPositive");
        el3.click();
        Thread.sleep(1500);
        System.out.println("Izin Kismi basari ile gecildi.");
    }

    @Step("<key> id li elemente tıkla <name>")
    public void clickBuyTicket(String key,String name) throws InterruptedException {
        Thread.sleep(1500);
        appiumDriver.findElement(By.id(key)).click();
        Thread.sleep(1500);
        System.out.println(name + " butonuna tiklandi!");
    }

    @Step("<key> id li elemente <text> değerini yaz <name>")
    public void setKeyById(String key, String text, String name) throws InterruptedException {
        Thread.sleep(1000);
        appiumDriver.findElement(By.id(key)).sendKeys(text);
        System.out.println(name +" Yazildi");
        Thread.sleep(1000);
    }

    @Step("<key> saniye bekle")
    public void waitForSeconds (int key) throws InterruptedException {
        Thread.sleep(key);
    }

    @Step("<key> xpath elementine tıkla <text>")
    public void selectSAW(String key, String text){

        appiumDriver.findElement(By.xpath(key)).click();
        System.out.println(text + " tiklandi.");
    }

    @Step("rezervasyon yap")
    public void clickSelected() throws InterruptedException {
        Thread.sleep(2000);
        Calendar calendar = Calendar.getInstance();
        Integer today = calendar.get(Calendar.DAY_OF_MONTH);
        if (today+2>31){
            today +=2 ;
            today = today%31;
        }
        today +=2;
        String sToday = today.toString();
        String key = "//*[@text='" + sToday + "']" ;
        appiumDriver.findElement(By.xpath(key)).click();
        System.out.println(sToday+ "'sine rezervasyon yapildi");
        Thread.sleep(4000);
    }

    @Step("Uçuşlar listelendi mi")
    public void isListEmpty() throws InterruptedException {
        Thread.sleep(1500);
        assertNotNull(appiumDriver.findElementsByXPath("//*[@resource-id=\"com.turkishairlines.mobile:id/itemFlightSearchParent_clPrice\"]").get(0));
        Thread.sleep(1000);
        System.out.println("Ucuslar Duzgun Listelendi");
    }


    @Step("Ekonomi Uçuş Seçildi")
    public void ucusSec() throws InterruptedException {
        appiumDriver.findElementsByXPath("//*[@resource-id=\"com.turkishairlines.mobile:id/itemFlightSearchParent_clPrice\"]").get(0).click();
        System.out.println("Ucus secildi");
        Thread.sleep(3000);
        appiumDriver.findElementsByXPath("//*[@resource-id=\"com.turkishairlines.mobile:id/brandItem\"]").get(0).click();

    }


}