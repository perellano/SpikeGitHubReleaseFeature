package ch.perellano.sample;

import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class StringCatapultTest {

    private static final String EXPECTED_MESSAGE = "Hi, how are you?";

    @Test
    public void validateHello(){
        String hello = StringCatapult.getHello();
        assertEquals(EXPECTED_MESSAGE, hello);
    }

    @Test
    @Ignore
    public void validateHelloInBrowser(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\perellano\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();

        driver.get("http://localhost:8080/Gradle___ch_perellano_sample___SpikeGitHubReleaseFeature_1_0_SNAPSHOT_war/index.jsp");
        WebElement element = driver.findElement(By.id("message"));
        assertEquals(EXPECTED_MESSAGE, element.getText());
        driver.close();
    }
}
