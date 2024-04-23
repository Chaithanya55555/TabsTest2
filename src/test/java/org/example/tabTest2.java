package org.example;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class tabTest2 {
    public static void main(String[] args)throws Exception {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://qatabs.ccbp.tech/");
        //About
        WebElement aboutbutton = driver.findElement(By.cssSelector("button[id ^= 'about']"));
        aboutbutton.click();
        WebElement para = driver.findElement(By.cssSelector("p[id ^= 'about']"));
        String aboutPara = para.getText();
        String exceptedPara = "Varanasi is one of the oldest living cities in the world. Its Prominence in Hindu mythology is virtually unrevealed. Mark Twain, the English author and literature, who was enthralled by the legend and sanctity of Benaras, once wrote, \"Benaras is older than history, older than tradition, older even than legend and looks twice as old as all of them put together\".";
        if (aboutPara.equals(exceptedPara)){
            System.out.println("About Content Matched");
        }else {
            System.out.println("Mismatch in the 'About' Content");
        }
        //Time to visit
        Thread.sleep(1000);
        WebElement timeToVisit = driver.findElement(By.cssSelector("button[id ^= 'timeToVisit']"));
        timeToVisit.click();
        WebElement timeToVisitPara = driver.findElement(By.cssSelector("p[id ^= 'timeToVisit']"));
        String currentParaTime = timeToVisitPara.getText();
        String exceptedParaTime = "October to March is the best time to visit Varanasi because most of the fairs here are held during this time of the year. Festivities begin with Diwali and continue to Dev Diwali celebrated on the 15th day from Diwali. In between, there is also Annakut. During this time, the ghats are lit with lights and diyas. Earthen lamps adorn the staircase of the ghats and are also afloat in the river. Firecrackers burn through the night, and it's a sight no one should miss.";
        if (currentParaTime.equals(exceptedParaTime)){
            System.out.println("Time to visit content matched");
        }else {
            System.out.println("Mismatch in the 'Time to visit' Content");
        }
        //Attractions
        WebElement attractionButton = driver.findElement(By.cssSelector("button[id ^= 'attractions']"));
        attractionButton.click();
        WebElement attractionPara = driver.findElement(By.cssSelector("p[id ^= 'attractions']"));
        String currentAttractionPara = attractionPara.getText();
        String exceptedAttractionsPara = "When visiting Varanasi, one comes across plenty of ghats, but among them, Dashashwamedh Ghat is said to be one of the oldest and most important. This ghat, leading to the Ganges, is located close to the famous old Vishwanath temple in Kashi (today’s Banaras). Another famous attraction is River Ganges which is the holiest river by the Hindus and many more.";
        if (currentAttractionPara.equals(exceptedAttractionsPara)){
            System.out.println("Attractions content Matched");
        }else {
            System.out.println("Mismatch in the 'Attractions' content");
        }
        Thread.sleep(3000);
        //Quit the window
        driver.quit();
    }
}
