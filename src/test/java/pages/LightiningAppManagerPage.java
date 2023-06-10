package pages;

import org.openqa.selenium.By;

import base.Base;

public class LightiningAppManagerPage extends Base {
	String devoloperName;
	By nurseryButton ;
	public void xpathText(String devName){
		
		devoloperName = devName;
		nurseryButton =	By.xpath("//span[text()='"+devoloperName+"']/parent::span/parent::td/following-sibling::td[last()]/span/div/a/span/span[1]");
	
	}
	 
	By editButton = By.xpath("//body/div[last()]/div/ul/li[1]/a");
	By deleteButton = By.xpath("//body/div[last()]/div/ul/li[2]/a");
	By delete = By.xpath("//span[text()='Delete']");
	By appMenu = By.xpath("//a[text()='Apps']");
	By appManagerButton = By.xpath("//a[text()='App Manager']");
	By newLightningButton = By.xpath("//span[text()='New Lightning App']");
    By profileMenu = By.xpath("//span[text()='View profile']/parent::div/span/div");
	By logOutButton = By.xpath("//a[text()='Log Out']");
    
    
    
	public void clickOnApp() {
		click(appMenu);
	}
	public void clickOnAppManager() {
		click(appManagerButton);
	}
	public void clickOnNewLightningApp() {
		click(newLightningButton);
	}
	public void clickOnnursery() {
		click(nurseryButton);
	}
	public void clickEditButton() {
		click(editButton);
	}
	public void clickDeleteButton() {
		click(deleteButton);
		click(delete);
	}
	public void clickViewProfile() {
		click(profileMenu);
	}
	public void clickLogOutButton() {
		click(logOutButton);
	}
}