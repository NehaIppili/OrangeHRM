package com.Automation.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class AdminPage extends BasePage {
	@FindBy(xpath="//b[text()='Admin']")
	private WebElement btnAdmin;
	@FindBy(xpath="//a[@class='arrow']")
	private WebElement btnUsrManagement;
	@FindBy(xpath="//a[text()='Users']")
	private WebElement btnUser;
	@FindBy(xpath="//input[@name='btnAdd']")
	private WebElement btnAdd;
    @FindBy(id="systemUser_userType")
	private WebElement usrTB;
	@FindBy(xpath="//input[@type='text']")
	private WebElement nameTB;
	@FindBy(id="systemUser_userName")
	private WebElement usr1TB;
	@FindBy(xpath="//input[@type='password']")
	private WebElement pwdTB;
	@FindBy(xpath="//input[@name='systemUser[confirmPassword]']")
	private WebElement conpwdTB;
	@FindBy(xpath="//input[@class='addbutton']")
	private WebElement btnSave;
	public void Action()
	{
	Actions act = new Actions(driver);
	act.moveToElement(btnAdmin).perform();;
	act.moveToElement(btnUsrManagement).perform();;
	btnAdmin.click();
	btnUsrManagement.click();
	}
	public void clickLogin_1()
	{
		btnAdd.click();
	}
	public void SelectRole()
	{
		Select drop = new Select(usrTB);
		drop.selectByVisibleText("ESS");
		usrTB.click();
	}
	public void enterUsername_1(String un)
	{
		nameTB.sendKeys(un);
	}
	public void enterUsername_2(String un)
	{
		usr1TB.sendKeys(un);
	}
	public void enterPassword_1(String pw)
	{
		pwdTB.sendKeys(pw);
	}
	public void enterConPassword(String pw)
	{
		 conpwdTB.sendKeys(pw);
	}
	public void Save()
	{
		btnSave.click();
	}
	
	
}
