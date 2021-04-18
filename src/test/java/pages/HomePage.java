package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AndroidFindBys;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

import java.awt.List;
import java.time.Duration;

import org.apache.http.impl.conn.tsccm.WaitingThread;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class HomePage {

    AndroidDriver<WebElement> driver;
    WebDriverWait wait;
    

    public HomePage(){

    }
    
    
    public HomePage(AndroidDriver driver){
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
    
    @AndroidFindBy(xpath =  "//android.widget.TextView[@content-desc=\"Play Store\"]")
    public WebElement btnPlayStore;
    
    @AndroidFindBy(xpath =  "//android.widget.TextView[@text='Uygulama ve oyun arayýn']")
    public WebElement btnSearchBox;
    
    @AndroidFindBy(xpath =  "//android.widget.EditText[@text='Uygulama ve oyun arayýn']")
    public WebElement txtSearchBox;
    
    @AndroidFindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"Akbank, AKBANK, \"]")
    public WebElement playAkbankApp;
    
    @AndroidFindBy(xpath =  "//android.widget.Button[@text='Yükle']")
    public WebElement downloadAkbankApp;
    
    @AndroidFindBy(xpath =  "//android.widget.Button[@text='Aç']")
    public WebElement verifydownloadAkbankApp;
      
    @AndroidFindBy(accessibility = "Ayarlar")
    public WebElement btnSettings;
    
    @AndroidFindBy(xpath =  "//android.widget.TextView[@text='Güvenlik ve gizlilik']")
    public WebElement btnSecurity;
    
    @AndroidFindBy(xpath =  "//android.widget.TextView[@text='Konum eriþimi']")
    public WebElement btnLocation;
    
    @AndroidFindBy(id =  "android:id/switch_widget")
    public WebElement switchLocation;
    
    @AndroidFindBy(accessibility =  "Akbank")
    public WebElement AkbankApp; 
    
    @AndroidFindBy(id =  "com.akbank.android.apps.akbank_direkt:id/button")
    public WebElement skipIntro; 
    
    @AndroidFindBy(id =  "com.akbank.android.apps.akbank_direkt:id/title")
    public WebElement verifyWelcomeText; 
    
    @AndroidFindBy(id =  "com.akbank.android.apps.akbank_direkt:id/item3")
    public WebElement btnEnYakinAkbank; 
    
    @AndroidFindBy(id =  "com.android.packageinstaller:id/permission_allow_button")
    public WebElement btnPermissionAllow;
    
    @AndroidFindBy(id =  "com.akbank.android.apps.akbank_direkt:id/map_atm_selected_wrapper")
    public WebElement btnATM; 
   
    @AndroidFindBy(id =  "com.akbank.android.apps.akbank_direkt:id/map_activity_btn_mylocation")
    public WebElement btnMyLocation; 
    
    @AndroidFindBy(id =  "com.akbank.android.apps.akbank_direkt:id/akbank_header_right_btn")
    public WebElement btnMenuBar;
    
    @AndroidFindBy(id =  "com.akbank.android.apps.akbank_direkt:id/map_detail_fragment_btnYolTarifi")
    public WebElement btnYolTarifi; 
    
      
    
    public void click_PlayStore(){
    	
    	btnPlayStore.isDisplayed();
    	btnPlayStore.click();
    }
    
    public void enter_SearchBox(){
    	
    	btnSearchBox.isDisplayed();
    	btnSearchBox.click(); 
    }
    
    public void send_SearchBox(String text){
    	
    	txtSearchBox.isDisplayed();
    	txtSearchBox.sendKeys(text); 
    	driver.pressKey(new KeyEvent(AndroidKey.ENTER));
    }


    public void enter_AkbankApp(){
    	    	
    	playAkbankApp.isDisplayed();	
    	playAkbankApp.click();    	      	
    }

      
    public void download_AkbankApp(){
    	
    	downloadAkbankApp.isDisplayed();
    	downloadAkbankApp.click();   	
    }
  
    public void verifydownload_AkbankApp(){
    	
    	wait = new WebDriverWait(driver, 130);
    	wait.until(ExpectedConditions.elementToBeClickable(verifydownloadAkbankApp));
    	    	
    	if(verifydownloadAkbankApp.isDisplayed()) {
    		driver.pressKey(new KeyEvent(AndroidKey.HOME));	
    	}   	   	
    }

          
    public void enter_Settings(){
    	
    	btnSettings.isDisplayed();
    	btnSettings.click();    	
    }
    
    public void enter_Security(){
    	
    	AndroidElement list = (AndroidElement) driver.findElement(By.xpath("//android.widget.LinearLayout"));
    	MobileElement listGroup = list.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("+ "new UiSelector().text(\"Güvenlik ve gizlilik\"));"));
    	listGroup.click();	
    }
    
    public void enter_Location(){
    	
    	btnLocation.isDisplayed();
    	btnLocation.click();    	
    }
    

	public void switch_Location() {
		
		switchLocation.isDisplayed();
		switchLocation.click();
		switchLocation.isSelected();
		driver.pressKey(new KeyEvent(AndroidKey.HOME));		
	}
	
	 public void open_AkbankApp(){
	    	
		WebElement swip = driver.findElement(By.id("com.huawei.android.launcher:id/workspace"));
	    	
	    Dimension ds = driver.manage().window().getSize();
	    int height = ds.getHeight();
	    int width = ds.getWidth();
	    int x = height / 2;
	    	
	    int top_y = (int) (width * 0.8);
	    int bottom_y = (int) (width * 0.2);
	    	
	    TouchAction ts = new TouchAction(driver);
	    ts.press(PointOption.point(top_y,x));
	    ts.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)));
	    ts.moveTo(PointOption.point(bottom_y,x));
	    ts.release().perform();
	    
	    wait = new WebDriverWait(driver, 5);
	    wait.until(ExpectedConditions.elementToBeClickable(AkbankApp));		
		AkbankApp.click();			
	}
	 
	 public void skip_Intro(){
		 
		wait = new WebDriverWait(driver, 10);
	    wait.until(ExpectedConditions.elementToBeClickable(skipIntro)); 
		skipIntro.isDisplayed();
		skipIntro.click();				
	}
	    
	
/*
	public void verify_WelcomeText(String title) {
		
		wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(verifyWelcomeText)); 
		if(verifyWelcomeText.getText().trim().contains(title)) {    		
    		System.out.println("Ýyi günler");
    		Assert.assertTrue(true);
    	}else Assert.assertTrue(false,"Actual title :"+verifyWelcomeText.getText().trim()+" does not contains"+ title);   		
	}
	 
*/	 
	 
	 public void click_btnEnYakinAkbank(){
		  
		 btnEnYakinAkbank.isDisplayed();
		 btnEnYakinAkbank.click();
		 btnPermissionAllow.click();
	}
	 
	public void click_btnATM() {
		
		 wait = new WebDriverWait(driver, 10);
		 wait.until(ExpectedConditions.visibilityOf(btnATM));  
		 btnATM.click();			
	}
	 
	public void click_btnMenuBar() {
		
		 btnMenuBar.isDisplayed();
		 btnMenuBar.click();					 
	} 
	 
	 
	 public void choose_ThirdATM(){
	    	
	    AndroidElement list = (AndroidElement) driver.findElement(By.xpath("//android.widget.ScrollView"));
	    MobileElement listGroup = list.findElement(MobileBy.AndroidUIAutomator("new UiSelector().className(\"android.widget.LinearLayout\").enabled(true).index(2)"));
	    listGroup.click();	
	}
	 
	 public void click_btnYolTarifi() {
		 
		 btnYolTarifi.isDisplayed();
		 btnYolTarifi.click();			         			 
	} 
	 

	 
	 
	 
	 
}