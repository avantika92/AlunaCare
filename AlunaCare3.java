import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
public class dashboard {

    //creating instance of web driver
    //navigating to dashboard url
    @Before
    public void beforeTest(){
            System.setProperty("webdriver.chrome.driver", "path of driver");
            WebDriver driver=new ChromeDriver();
            driver.manage().window().maximize();
            driver.get(dashboardpageurl);
    }

    //Test to verify the error message when no patient records are found & back button
    @Test
    public void noPatientFound() {
        WebElement textbox =driver.findElement(By.id("textbox"));
        WebElement findPatientSearch =driver.findElement(By.id("findPatient"));
        WebElement PatientFoundMessage =driver.findElement(By.id("patientFound"));
        WebElement BackButton =driver.findElement(By.id("backButton"));
        textbox.sendKeys(invalidIdentifier);
        findPatientSearch.click();
        Assert.assertEquals(PatientFoundMessage.getText(),"No patient matches the identifier");
        BackButton.click();
        String Actualtext = driver.findElement(By.linkText(home_page_link)).getText();
        Assert.assertEquals(Actualtext, dashboard_page_url );
    }


    //Test to verify the patient records withe success message when patient records are found
    @Test
    public void validPatientFound() {
        //read from JSon file which has patient test data
        String requestFormData=request.getParameter("Patient_test_data.json");
        JSONObject formData = JSONObject.fromObject(requestFormData);

        //find elements on UI & search for identifier
        WebElement textbox =driver.findElement(By.id("textbox"));
        WebElement findPatientSearch =driver.findElement(By.id("findPatient"));
        WebElement PatientFoundMessage =driver.findElement(By.id("patientFound"));
        WebElement PatientFoundName =driver.findElement(By.id("patientFoundName"));
        WebElement PatientFoundDOB =driver.findElement(By.id("patientFoundDOB"));
        WebElement PatientFoundGENDER =driver.findElement(By.id("patientFoundGender"));
        textbox.sendKeys(validIdentifier);
        findPatientSearch.click();

        //validate patient found record from test data JSON file saved as Patient_test_data.json
        Assert.assertEquals(PatientFoundMessage.getText(),"Patient Found")&&
        Assert.assertEquals(PatientFoundName.getText().requestFormData.get("NAMe"))&&
                Assert.assertEquals(PatientFoundDOB.getText(),requestFormData.get("DOB"))&&
                Assert.assertEquals(PatientFoundGender.gettext(),requestFormData.get("GENDER"))
    }
}