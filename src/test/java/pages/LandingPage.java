package pages;


import org.openqa.selenium.WebElement;

import base.Base;


public class LandingPage extends Base{
	//public static By menuLogin = By.xpath("");
	
	public  void navigateurl() {
		navigateURL("https://developer.salesforce.com");		
	}
	
	
	public void hoverOnLogin() {
			try {
			 WebElement login = (WebElement)js.executeScript("return document.querySelector('hgf-c360nav').shadowRoot.querySelector('li.utility-icons-items.login>hgf-c360login').shadowRoot.querySelector('span:nth-child(2)')");
			 mousehover(login);	
		}catch(org.openqa.selenium.ElementNotInteractableException ex) {
			
		}	
	}
	public void clickOnSalesforce() {
			try {
			 WebElement salesforce = (WebElement)js.executeScript("return document.querySelector('hgf-c360nav').shadowRoot.querySelector('li[class=\"utility-icons-items login\"]>hgf-c360login').shadowRoot.querySelector('h4')");
		 click(salesforce);	
		}catch(org.openqa.selenium.ElementNotInteractableException ex) {
			
		}
			
	}
	
	
}
