package org.fasttrackit.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterField {

    @FindBy(id = "firstname")
    private WebElement firstName;

    @FindBy(id = "lastname")
    private WebElement lastName;

    @FindBy(id = "email_address")
    private WebElement emailAdress;

    @FindBy(id = "password")
    private WebElement password;

    @FindBy(id = "confirmation")
    private WebElement confirmation;

    @FindBy(id = "is_subscribed")
    private WebElement isSubscribed;

    @FindBy(xpath = "//button[@title='Register']")
    private WebElement registerButton;

    public void completeRegister(String firstNameVar,String lastNameVar,String emailAdressVar,String passwordVar,String confirmVar){

        firstName.sendKeys(firstNameVar);
        lastName.sendKeys(lastNameVar);
        emailAdress.sendKeys(emailAdressVar);
        password.sendKeys(passwordVar);
        confirmation.sendKeys(confirmVar);
        isSubscribed.click();
        registerButton.click();


    }
    
}
