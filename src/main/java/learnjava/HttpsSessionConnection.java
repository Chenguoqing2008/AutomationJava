package learnjava;


import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class HttpsSessionConnection {
	
	@Test
	public void httpsConnection(){
		
		FirefoxProfile fP = new FirefoxProfile();
		
		fP.setAcceptUntrustedCertificates(true);
		
        WebDriver ff = new FirefoxDriver();
		
        ff.get("https://www.youtube.com/watch?v=bjaOhnZhLro");
	}

}
