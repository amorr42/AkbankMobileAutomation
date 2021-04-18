package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pages.HomePage;
import static setups.DriverPool.getDriverInstance;

public class HomePageStep {

    HomePage homePage = new HomePage(getDriverInstance());

    
    @Given("^Open Play Store$")
    public void open_Play_Store() throws Throwable { 
        homePage.click_PlayStore();
        Thread.sleep(1000);
    }
    
    @And("^Click Searchbox$")
    public void Click_Searchbox() throws Throwable {
    	homePage.enter_SearchBox();
    	Thread.sleep(1000);
    }
    
    @And("^Send \"([^\"]*)\" search field$")
    public void send_search_field(String title) throws Throwable {
       homePage.send_SearchBox(title);
       Thread.sleep(1000);
    }
    
    @And("^Click Akbank App$")
    public void Click_Akbank_App() throws Throwable {
    	homePage.enter_AkbankApp();
    	Thread.sleep(1000);
    }
    
   
    @And("^Download Akbank App$")
    public void Download_Akbank_App() throws Throwable {
    	homePage.download_AkbankApp();
    	Thread.sleep(1000);
    }
    
    @And("^Verify Download Akbank App$")
    public void Verify_Download_Akbank_App() throws Throwable {
    	homePage.verifydownload_AkbankApp();
    	Thread.sleep(1000);
    }
    
    @And("^Click Settings$")
    public void Click_Settings() throws Throwable {
    	homePage.enter_Settings();
    	Thread.sleep(1000);
    }
    
    @And("^Click Security$")
    public void Click_Security() throws Throwable {
    	homePage.enter_Security();
    	Thread.sleep(1000);
    }
    
    @And("^Click Location$")
    public void Click_Location() throws Throwable {
    	homePage.enter_Location();
    	Thread.sleep(3000);
    }
    
    @And("^Permission On Location$")
    public void Permission_On_Location() throws Throwable {
    	homePage.switch_Location();
    	Thread.sleep(3000);
    }
    
    @And("^Open Akbank App$")
    public void Open_Akbank_App() throws Throwable {
    	homePage.open_AkbankApp();
    	Thread.sleep(1000);
    }
    
    @And("^Skip Intro$")
    public void Skip_Intro() throws Throwable {
    	homePage.skip_Intro();
    	Thread.sleep(3000);
    }

/*
    @And("^Verify Welcome Message \"([^\\\"]*)\"$")
    public void Verify_Welcome_Message(String title) throws Throwable {
    	homePage.verify_WelcomeText(title);
    	Thread.sleep(1000);
    }
    
*/    
 
    @And("^Click En yakin Akbank button$")
    public void Click_En_yakin_Akbank_button() throws Throwable {
    	homePage.click_btnEnYakinAkbank();
    	Thread.sleep(2000);
    }
    
    @And("^Click Atm Btn$")
    public void Click_Atm_Btn() throws Throwable {
        homePage.click_btnATM();
        Thread.sleep(2000);
    }
    
    @And("^Click Menu Bar$")
    public void Click_Menu_Bar() throws Throwable {
        homePage.click_btnMenuBar();
        Thread.sleep(2000);
    }
    
    @And("^Click Third Atm Option$")
    public void Click_Third_Atm_Option() throws Throwable {
        homePage.choose_ThirdATM();
        Thread.sleep(2000);
    }
    
    @And("^Click Yol Tarifi$")
    public void Click_Yol_Tarifi() throws Throwable {
        homePage.click_btnYolTarifi();
        Thread.sleep(7000);
    }
    
    
    
}