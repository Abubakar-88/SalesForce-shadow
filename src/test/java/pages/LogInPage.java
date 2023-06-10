package pages;

import org.openqa.selenium.By;

import base.Base;
import step_definitions.Hooks;

public class LogInPage extends Base{
   By username=By.id("username");
   By password=By.id("password");
   By login=By.id("Login");
   
   public void enterUsername(String UserName) {
	   try{
		   sendkeys(username,UserName);   
	   }catch(org.openqa.selenium.NoSuchElementException ex){
	   }
	
   }
   public void enterPassword(String Pass) {
	   
	      try{
		    sendkeys(password,Pass);
	   }catch(org.openqa.selenium.NoSuchElementException ex){
	   }
	   
	   
	  
   }
   public void clickLogIn() {
	   click(login);
   }
   
   
}
