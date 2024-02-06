package com.pages;

import com.base.BasePage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.utils.PropertyReaderOptimized;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class RegisterPageValidation {
    WebDriver driver;
    BasePage basePage;

    public RegisterPageValidation(WebDriver driver){
        this.driver=driver;
        basePage=new BasePage(driver);
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//button[text()='Sign Up']")
    private WebElement signUp;
    @FindBy(xpath = "//input[@name='firstName']")
    private WebElement firstNameTextField;
    @FindBy(xpath = "//input[@name='lastName']")
    private WebElement lastNameTextField;
    @FindBy(xpath = "//input[@placeholder='YY-MM-DD']")
    private WebElement dobField;
    @FindBy(xpath = "//span[@class='ant-picker-prev-icon']")
    private WebElement monthBackButton;
    @FindBy(xpath = "//span[@class='ant-picker-super-prev-icon']")
    private WebElement yearBackButton;
    @FindBy(xpath = "//td[@title='2006-02-02']")
    private WebElement dob;
    @FindBy(xpath = "//span[text()='First Name is required']")
    private WebElement firstNameRequiredValidation;
    @FindBy(xpath = "//span[text()='Last Name is required']")
    private WebElement lastNameRequiredValidation;
    @FindBy(xpath = "//span[text()='Date of birth is required']")
    private WebElement dobRequiredValidation;
    @FindBy(xpath = "//span[text()='Only alphabets are allowed']")
    private WebElement onlyAlphabetsAllowedValidation;
    @FindBy(xpath = "//span[text()='Maximum 25 characters allowed']")
    private WebElement maximumTwentyFiveCharactersAllowedValidation;
    @FindBy(xpath = "//input[@placeholder='Confirm password']")
    private WebElement confirmPasswordTextField;
    @FindBy(xpath = "//span[text()='Confirm Password is required']")
    private WebElement confirmPasswordRequiredValidation;
    @FindBy(xpath = "//span[text()='Confirm Passwords must match']")
    private WebElement confirmPasswordMustMatchValidation;
    @FindBy(xpath = "//input[@placeholder='Email']")
    private WebElement emailTextField;
    @FindBy(xpath = "//input[@placeholder='Password']")
    private WebElement passwordTextField;
    @FindBy(xpath = "//span[text()='Email is required']")
    private WebElement emailRequiredValidation;
    @FindBy(xpath = "//span[text()='Password is required']")
    private WebElement passwordRequiredValidation;
    @FindBy(xpath = "//span[text()='Please accept terms and conditions']")
    private WebElement checkBoxValidation;
    @FindBy(xpath = "//span[text()='Please enter valid email']")
    private WebElement invalidEmailAddressValidation;
    @FindBy(xpath = "//span[text()='Email is already taken']")
    private WebElement alreadyExistEmailAddressErrorPopUpMsg;
    @FindBy(xpath = "//span[contains(text(),'Password must ')]")
    private WebElement invalidPasswordValidation;
    @FindBy(xpath = "//span[@class='anticon anticon-eye-invisible ant-input-password-icon']")
    private WebElement eyeBtn;
    @FindBy(xpath = "//span[@class='ant-checkbox']")
    private WebElement checkBoxBtn;
    @FindBy(xpath = "//span[text()='Create Account']")
    private WebElement createAccountBtn;
    @FindBy(xpath = "//input[@id='search']")
    private WebElement mailinatorLoginTextField;
    @FindBy(xpath = "//button[text()='GO']")
    private WebElement goButton;
    @FindBy(xpath = "//tr[td[@class='ng-binding']]/td[2]")
    private WebElement emailVerification;
    @FindBy(xpath = "//iframe[@id='html_msg_body']")
    private WebElement iframe;
    @FindBy(xpath = "//a[text()='Confirm']")
    private WebElement confirmBtn;
    @FindBy(xpath = "//div[@class='flag mn']")
    private WebElement dropDownBtn;
    @FindBy(xpath = "//input[@class='search-box']")
    private WebElement searchBox;
    @FindBy(xpath = "//span[text()='India']")
    private WebElement countryName;
    @FindBy(xpath = "//input[@class='form-control ant-input']")
    private WebElement phoneNoTextField;
    @FindBy(xpath = "//span[text()='Send Code']")
    private WebElement sendCodeBtn;
    @FindBy(xpath = "//span[text()='Phone number is required']")
    private WebElement phoneNumberRequiredValidation;
    @FindBy(xpath = "//span[text()='Phone number already exists']")
    private WebElement phoneNumberAlreadyExistErrorPopUpMsg;
    @FindBy(xpath = "//span[text()='Please enter valid phone number']")
    private WebElement enterValidPhoneNumberValidation;
    @FindBy(xpath = "//span[text()='OTP is required']")
    private WebElement otpRequiredValidation;
    @FindBy(xpath = "//span[text()='OTP Code is Invalid']")
    private WebElement invalidOtpErrorPopUPMsg;
    @FindBy(xpath = "//input[@placeholder='Enter Code']")
    private WebElement enterCodeTextField;
    @FindBy(xpath = "//span[text()='Submit']")
    private WebElement submitBtn;

    public boolean validateRegisterPageFirstNameRequiredValidation(String firstName,ExtentTest test) throws IOException, InterruptedException {
        boolean isTrue = false;

        //Click on the signup button
        basePage.threadSleep();
        basePage.click(signUp);
        test.log(LogStatus.INFO, test.addScreenCapture(BasePage.getScreenCapture(driver)), "Verified clicked on the register button.");

        //Click on the signup button
        basePage.waitForElementToBeVisible(createAccountBtn);
        basePage.click(createAccountBtn);
        test.log(LogStatus.INFO, test.addScreenCapture(BasePage.getScreenCapture(driver)), "Verified clicked on the create account button.");

        //Get the value
        String firstNameValidation=firstNameRequiredValidation.getText();

        //Compare the values
        basePage.waitForElementToBeVisible(firstNameRequiredValidation);
        if (firstNameValidation.equals(firstName)) {
            isTrue = true;
            test.log(LogStatus.PASS, test.addScreenCapture(BasePage.getScreenCapture(driver)), "Verified First Name is required validation is matched.");
        } else {
            isTrue = false;
            test.log(LogStatus.FAIL, test.addScreenCapture(BasePage.getScreenCapture(driver)), "Verified Email is required validation isn't matched.");
        }

        return isTrue;
    }

    public boolean validateRegisterPageLastNameRequiredValidation(String lastName,ExtentTest test) throws IOException, InterruptedException {
        boolean isTrue = false;

        //Get the value
        String lastNameValidation=lastNameRequiredValidation.getText();

        //Compare the values
        basePage.waitForElementToBeVisible(firstNameRequiredValidation);
        if (lastNameValidation.equals(lastName)) {
            isTrue = true;
            test.log(LogStatus.PASS, test.addScreenCapture(BasePage.getScreenCapture(driver)), "Verified Last Name is required validation is matched.");
        } else {
            isTrue = false;
            test.log(LogStatus.FAIL, test.addScreenCapture(BasePage.getScreenCapture(driver)), "Verified Last Name is required validation isn't matched.");
        }

        return isTrue;
    }

    public boolean validateRegisterPageDateOfBirthRequiredValidation(String dob,ExtentTest test) throws IOException, InterruptedException {
        boolean isTrue = false;

        //Get the value
        String dobValidation=dobRequiredValidation.getText();

        //Compare the values
        basePage.waitForElementToBeVisible(dobRequiredValidation);
        if (dobValidation.equals(dob)) {
            isTrue = true;
            test.log(LogStatus.PASS, test.addScreenCapture(BasePage.getScreenCapture(driver)), "Verified Date of birth is required validation is matched.");
        } else {
            isTrue = false;
            test.log(LogStatus.FAIL, test.addScreenCapture(BasePage.getScreenCapture(driver)), "Verified Date of birth is required validation isn't matched.");
        }

        return isTrue;
    }
    public boolean validateRegisterPageEmailRequiredValidation(String email,ExtentTest test) throws IOException, InterruptedException {
        boolean isTrue = false;

        //Get the value
        String emailValidation=emailRequiredValidation.getText();

        //Compare the values
        basePage.waitForElementToBeVisible(emailRequiredValidation);
        if (emailValidation.equals(email)) {
            isTrue = true;
            test.log(LogStatus.PASS, test.addScreenCapture(BasePage.getScreenCapture(driver)), "Verified Email is required validation is matched.");
        } else {
            isTrue = false;
            test.log(LogStatus.FAIL, test.addScreenCapture(BasePage.getScreenCapture(driver)), "Verified Email is required validation isn't matched.");
        }

        return isTrue;
    }
    public boolean validateRegisterPagePasswordRequiredValidation(String password,ExtentTest test) throws IOException, InterruptedException {
        boolean isTrue=false;

        //Get the value
        String passwordValidation=passwordRequiredValidation.getText();

        //Compare the values
        if (passwordValidation.equals(password)) {
            isTrue = true;
            test.log(LogStatus.PASS, test.addScreenCapture(BasePage.getScreenCapture(driver)), "Verified Password is required validation is matched.");
        } else {
            isTrue = false;
            test.log(LogStatus.FAIL, test.addScreenCapture(BasePage.getScreenCapture(driver)), "Verified Password is required validation isn't matched.");
        }

        return isTrue;
    }

    public boolean validateRegisterPageConfirmPasswordRequiredValidation(String confirmPassword,ExtentTest test) throws IOException, InterruptedException {
        boolean isTrue = false;

        //Get the value
        String confirmPasswordValidation=confirmPasswordRequiredValidation.getText();

        //Compare the values
        basePage.waitForElementToBeVisible(confirmPasswordRequiredValidation);
        if (confirmPasswordValidation.equals(confirmPassword)) {
            isTrue = true;
            test.log(LogStatus.PASS, test.addScreenCapture(BasePage.getScreenCapture(driver)), "Verified Confirm Password is required validation is matched.");
        } else {
            isTrue = false;
            test.log(LogStatus.FAIL, test.addScreenCapture(BasePage.getScreenCapture(driver)), "Verified Confirm Password is required validation isn't matched.");
        }

        return isTrue;
    }

    public boolean validateRegisterPageTermsAndConditionsRequiredValidation(String termsAndConditions,ExtentTest test) throws IOException, InterruptedException {
        boolean isTrue=false;

        //Get the value
        String termsAndConditionsValidation=checkBoxValidation.getText();

        //Compare the values
        if(termsAndConditionsValidation.equals(termsAndConditions)) {
            isTrue=true;
            test.log(LogStatus.PASS,test.addScreenCapture(BasePage.getScreenCapture(driver)),"Verified Please accept terms and conditions validation is matched.");
        }else {
            isTrue=false;
            test.log(LogStatus.FAIL,test.addScreenCapture(BasePage.getScreenCapture(driver)),"Verified Please accept terms and conditions validation isn't matched.");
        }

        return isTrue;
    }

    public boolean validateFirstNameTextFieldValidationWithNumericValue(String onlyAlphabetsAllowed,ExtentTest test) throws IOException, InterruptedException {
        boolean isTrue = false;

        String firstName=RandomStringUtils.randomNumeric(6,8);

        //Enter the value in the first name text field
        basePage.waitForElementToBeVisible(firstNameTextField);
        basePage.enterText(firstNameTextField,firstName);
        test.log(LogStatus.INFO,test.addScreenCapture(BasePage.getScreenCapture(driver)),"Verified entered the value in the first name text field.");

        //Get the value
        String onlyAlphabetsAllowedVal=onlyAlphabetsAllowedValidation.getText();

        //Compare the values
        basePage.waitForElementToBeVisible(onlyAlphabetsAllowedValidation);
        if (onlyAlphabetsAllowedVal.equals(onlyAlphabetsAllowed)) {
            isTrue = true;
            test.log(LogStatus.PASS, test.addScreenCapture(BasePage.getScreenCapture(driver)), "Verified Only alphabets are allowed validation is matched.");
        } else {
            isTrue = false;
            test.log(LogStatus.FAIL, test.addScreenCapture(BasePage.getScreenCapture(driver)), "Verified Only alphabets are allowed validation isn't matched.");
        }

        return isTrue;
    }

    public boolean validateFirstNameTextFieldValidationWithSpecialCharacterValue(String onlyAlphabetsAllowed,ExtentTest test) throws IOException, InterruptedException {
        boolean isTrue = false;

        //Remove the value from the first name text field
        basePage.waitForElementToBeVisible(firstNameTextField);
        basePage.removeValue(firstNameTextField);
        test.log(LogStatus.INFO,test.addScreenCapture(BasePage.getScreenCapture(driver)),"Verified removed the value from the first name text field.");

        //Enter the value in the first name text field
        basePage.waitForElementToBeVisible(firstNameTextField);
        basePage.enterText(firstNameTextField,"!@#$%&");
        test.log(LogStatus.INFO,test.addScreenCapture(BasePage.getScreenCapture(driver)),"Verified entered the value in the first name text field.");

        //Get the value
        String onlyAlphabetsAllowedVal=onlyAlphabetsAllowedValidation.getText();

        //Compare the values
        basePage.waitForElementToBeVisible(onlyAlphabetsAllowedValidation);
        if (onlyAlphabetsAllowedVal.equals(onlyAlphabetsAllowed)) {
            isTrue = true;
            test.log(LogStatus.PASS, test.addScreenCapture(BasePage.getScreenCapture(driver)), "Verified Only alphabets are allowed validation is matched.");
        } else {
            isTrue = false;
            test.log(LogStatus.FAIL, test.addScreenCapture(BasePage.getScreenCapture(driver)), "Verified Only alphabets are allowed validation isn't matched.");
        }

        return isTrue;
    }

    public boolean validateFirstNameTextFieldValidationWithAlphaNumericValue(String onlyAlphabetsAllowed,ExtentTest test) throws IOException, InterruptedException {
        boolean isTrue = false;

        String firstName=RandomStringUtils.randomAlphanumeric(6,8);

        //Remove the value from the first name text field
        basePage.waitForElementToBeVisible(firstNameTextField);
        basePage.removeValue(firstNameTextField);
        test.log(LogStatus.INFO,test.addScreenCapture(BasePage.getScreenCapture(driver)),"Verified removed the value from the first name text field.");

        //Enter the value in the first name text field
        basePage.waitForElementToBeVisible(firstNameTextField);
        basePage.enterText(firstNameTextField,firstName);
        test.log(LogStatus.INFO,test.addScreenCapture(BasePage.getScreenCapture(driver)),"Verified entered the value in the first name text field.");

        //Get the value
        String onlyAlphabetsAllowedVal=onlyAlphabetsAllowedValidation.getText();

        //Compare the values
        basePage.waitForElementToBeVisible(onlyAlphabetsAllowedValidation);
        if (onlyAlphabetsAllowedVal.equals(onlyAlphabetsAllowed)) {
            isTrue = true;
            test.log(LogStatus.PASS, test.addScreenCapture(BasePage.getScreenCapture(driver)), "Verified Only alphabets are allowed validation is matched.");
        } else {
            isTrue = false;
            test.log(LogStatus.FAIL, test.addScreenCapture(BasePage.getScreenCapture(driver)), "Verified Only alphabets are allowed validation isn't matched.");
        }

        return isTrue;
    }

    public boolean validateFirstNameTextFieldValidationWithAlphaSpecialCharacterValue(String onlyAlphabetsAllowed,ExtentTest test) throws IOException, InterruptedException {
        boolean isTrue = false;

        //Remove the value from the first name text field
        basePage.waitForElementToBeVisible(firstNameTextField);
        basePage.removeValue(firstNameTextField);
        test.log(LogStatus.INFO,test.addScreenCapture(BasePage.getScreenCapture(driver)),"Verified removed the value from the first name text field.");

        //Enter the value in the first name text field
        basePage.waitForElementToBeVisible(firstNameTextField);
        basePage.enterText(firstNameTextField,"abcd@#");
        test.log(LogStatus.INFO,test.addScreenCapture(BasePage.getScreenCapture(driver)),"Verified entered the value in the first name text field.");

        //Get the value
        String onlyAlphabetsAllowedVal=onlyAlphabetsAllowedValidation.getText();

        //Compare the values
        basePage.waitForElementToBeVisible(onlyAlphabetsAllowedValidation);
        if (onlyAlphabetsAllowedVal.equals(onlyAlphabetsAllowed)) {
            isTrue = true;
            test.log(LogStatus.PASS, test.addScreenCapture(BasePage.getScreenCapture(driver)), "Verified Only alphabets are allowed validation is matched.");
        } else {
            isTrue = false;
            test.log(LogStatus.FAIL, test.addScreenCapture(BasePage.getScreenCapture(driver)), "Verified Only alphabets are allowed validation isn't matched.");
        }

        return isTrue;
    }

    public boolean validateFirstNameTextFieldValidationWithMoreThanTwentyFiveCharacters(String maximumCharacters,ExtentTest test) throws IOException, InterruptedException {
        boolean isTrue = false;

        String firstName=RandomStringUtils.randomAlphabetic(26,30);

        //Remove the value from the first name text field
        basePage.waitForElementToBeVisible(firstNameTextField);
        basePage.removeValue(firstNameTextField);

        //Enter the value in the first name text field
        basePage.waitForElementToBeVisible(firstNameTextField);
        basePage.enterText(firstNameTextField,firstName);
        test.log(LogStatus.INFO,test.addScreenCapture(BasePage.getScreenCapture(driver)),"Verified entered the value in the first name text field.");

        //Get the value
        String maximumCharactersValidation=maximumTwentyFiveCharactersAllowedValidation.getText();

        //Compare the values
        basePage.waitForElementToBeVisible(maximumTwentyFiveCharactersAllowedValidation);
        if (maximumCharactersValidation.equals(maximumCharacters)) {
            isTrue = true;
            test.log(LogStatus.PASS, test.addScreenCapture(BasePage.getScreenCapture(driver)), "Verified Maximum 25 characters allowed validation is matched.");
        } else {
            isTrue = false;
            test.log(LogStatus.FAIL, test.addScreenCapture(BasePage.getScreenCapture(driver)), "Verified Maximum 25 characters allowed validation isn't matched.");
        }

        //Clear the value from the first name text field
        basePage.waitForElementToBeVisible(firstNameTextField);
        basePage.clearValue(firstNameTextField);

        //Enter the value in the first name text field
        basePage.waitForElementToBeVisible(firstNameTextField);
        basePage.enterText(firstNameTextField,"nn");

        return isTrue;
    }

    public boolean validateLastNameTextFieldValidationWithNumericValue(String onlyAlphabetsAllowed,ExtentTest test) throws IOException, InterruptedException {
        boolean isTrue = false;

        String lastName=RandomStringUtils.randomNumeric(6,8);

        //Enter the value in the last name text field
        basePage.waitForElementToBeVisible(lastNameTextField);
        basePage.enterText(lastNameTextField,lastName);
        test.log(LogStatus.INFO,test.addScreenCapture(BasePage.getScreenCapture(driver)),"Verified entered the value in the last name text field.");

        //Get the value
        String onlyAlphabetsAllowedVal=onlyAlphabetsAllowedValidation.getText();

        //Compare the values
        basePage.waitForElementToBeVisible(onlyAlphabetsAllowedValidation);
        if (onlyAlphabetsAllowedVal.equals(onlyAlphabetsAllowed)) {
            isTrue = true;
            test.log(LogStatus.PASS, test.addScreenCapture(BasePage.getScreenCapture(driver)), "Verified Only alphabets are allowed validation is matched.");
        } else {
            isTrue = false;
            test.log(LogStatus.FAIL, test.addScreenCapture(BasePage.getScreenCapture(driver)), "Verified Only alphabets are allowed validation isn't matched.");
        }

        return isTrue;
    }

    public boolean validateLastNameTextFieldValidationWithSpecialCharacterValue(String onlyAlphabetsAllowed,ExtentTest test) throws IOException, InterruptedException {
        boolean isTrue = false;

        //Remove the value from the last name text field
        basePage.waitForElementToBeVisible(lastNameTextField);
        basePage.removeValue(lastNameTextField);
        test.log(LogStatus.INFO,test.addScreenCapture(BasePage.getScreenCapture(driver)),"Verified removed the value from the last name text field.");

        //Enter the value in the last name text field
        basePage.waitForElementToBeVisible(lastNameTextField);
        basePage.enterText(lastNameTextField,"!@#$%&");
        test.log(LogStatus.INFO,test.addScreenCapture(BasePage.getScreenCapture(driver)),"Verified entered the value in the last name text field.");

        //Get the value
        String onlyAlphabetsAllowedVal=onlyAlphabetsAllowedValidation.getText();

        //Compare the values
        basePage.waitForElementToBeVisible(onlyAlphabetsAllowedValidation);
        if (onlyAlphabetsAllowedVal.equals(onlyAlphabetsAllowed)) {
            isTrue = true;
            test.log(LogStatus.PASS, test.addScreenCapture(BasePage.getScreenCapture(driver)), "Verified Only alphabets are allowed validation is matched.");
        } else {
            isTrue = false;
            test.log(LogStatus.FAIL, test.addScreenCapture(BasePage.getScreenCapture(driver)), "Verified Only alphabets are allowed validation isn't matched.");
        }

        return isTrue;
    }

    public boolean validateLastNameTextFieldValidationWithAlphaNumericValue(String onlyAlphabetsAllowed,ExtentTest test) throws IOException, InterruptedException {
        boolean isTrue = false;

        String lastName=RandomStringUtils.randomAlphanumeric(6,8);

        //Remove the value from the last name text field
        basePage.waitForElementToBeVisible(lastNameTextField);
        basePage.removeValue(lastNameTextField);
        test.log(LogStatus.INFO,test.addScreenCapture(BasePage.getScreenCapture(driver)),"Verified removed the value from the last name text field.");

        //Enter the value in the last name text field
        basePage.waitForElementToBeVisible(lastNameTextField);
        basePage.enterText(lastNameTextField,lastName);
        test.log(LogStatus.INFO,test.addScreenCapture(BasePage.getScreenCapture(driver)),"Verified entered the value in the last name text field.");

        //Get the value
        String onlyAlphabetsAllowedVal=onlyAlphabetsAllowedValidation.getText();

        //Compare the values
        basePage.waitForElementToBeVisible(onlyAlphabetsAllowedValidation);
        if (onlyAlphabetsAllowedVal.equals(onlyAlphabetsAllowed)) {
            isTrue = true;
            test.log(LogStatus.PASS, test.addScreenCapture(BasePage.getScreenCapture(driver)), "Verified Only alphabets are allowed validation is matched.");
        } else {
            isTrue = false;
            test.log(LogStatus.FAIL, test.addScreenCapture(BasePage.getScreenCapture(driver)), "Verified Only alphabets are allowed validation isn't matched.");
        }

        return isTrue;
    }

    public boolean validateLastNameTextFieldValidationWithAlphaSpecialCharacterValue(String onlyAlphabetsAllowed,ExtentTest test) throws IOException, InterruptedException {
        boolean isTrue = false;

        //Remove the value from the last name text field
        basePage.waitForElementToBeVisible(lastNameTextField);
        basePage.removeValue(lastNameTextField);
        test.log(LogStatus.INFO,test.addScreenCapture(BasePage.getScreenCapture(driver)),"Verified removed the value from the last name text field.");

        //Enter the value in the last name text field
        basePage.waitForElementToBeVisible(lastNameTextField);
        basePage.enterText(lastNameTextField,"abcd@#");
        test.log(LogStatus.INFO,test.addScreenCapture(BasePage.getScreenCapture(driver)),"Verified entered the value in the last name text field.");

        //Get the value
        String onlyAlphabetsAllowedVal=onlyAlphabetsAllowedValidation.getText();

        //Compare the values
        basePage.waitForElementToBeVisible(onlyAlphabetsAllowedValidation);
        if (onlyAlphabetsAllowedVal.equals(onlyAlphabetsAllowed)) {
            isTrue = true;
            test.log(LogStatus.PASS, test.addScreenCapture(BasePage.getScreenCapture(driver)), "Verified Only alphabets are allowed validation is matched.");
        } else {
            isTrue = false;
            test.log(LogStatus.FAIL, test.addScreenCapture(BasePage.getScreenCapture(driver)), "Verified Only alphabets are allowed validation isn't matched.");
        }

        return isTrue;
    }

    public boolean validateLastNameTextFieldValidationWithMoreThanTwentyFiveCharacters(String maximumCharacters,ExtentTest test) throws IOException, InterruptedException {
        boolean isTrue = false;

        String lastName=RandomStringUtils.randomAlphabetic(26,30);

        //Remove the value from the last name text field
        basePage.waitForElementToBeVisible(lastNameTextField);
        basePage.removeValue(lastNameTextField);
        test.log(LogStatus.INFO,test.addScreenCapture(BasePage.getScreenCapture(driver)),"Verified removed the value from the last name text field.");

        //Enter the value in the last name text field
        basePage.waitForElementToBeVisible(lastNameTextField);
        basePage.enterText(lastNameTextField,lastName);
        test.log(LogStatus.INFO,test.addScreenCapture(BasePage.getScreenCapture(driver)),"Verified entered the value in the last name text field.");

        //Get the value
        String maximumCharactersValidation=maximumTwentyFiveCharactersAllowedValidation.getText();

        //Compare the values
        basePage.waitForElementToBeVisible(maximumTwentyFiveCharactersAllowedValidation);
        if (maximumCharactersValidation.equals(maximumCharacters)) {
            isTrue = true;
            test.log(LogStatus.PASS, test.addScreenCapture(BasePage.getScreenCapture(driver)), "Verified Maximum 25 characters allowed validation is matched.");
        } else {
            isTrue = false;
            test.log(LogStatus.FAIL, test.addScreenCapture(BasePage.getScreenCapture(driver)), "Verified Maximum 25 characters allowed validation isn't matched.");
        }

        //Clear the value from the last name text field
        basePage.waitForElementToBeVisible(lastNameTextField);
        basePage.clearValue(lastNameTextField);

        //Enter the value in the last name text field
        basePage.waitForElementToBeVisible(lastNameTextField);
        basePage.enterText(lastNameTextField,"mm");

        return isTrue;
    }

    public boolean validateEmailTextFieldValidationWithAlreadyExistEmailAddress(String emailAlreadyTaken,ExtentTest test) throws IOException {
        boolean isTrue=false;

        //Enter the value in the email text field
        basePage.waitForElementToBeVisible(emailTextField);
        basePage.enterText(emailTextField,"naveen.beniwal@antiersolutions.com");
        test.log(LogStatus.INFO,test.addScreenCapture(BasePage.getScreenCapture(driver)),"Verified entered the value in the Email Text Field.");
        //Enter the value in the password text field

        basePage.waitForElementToBeVisible(passwordTextField);
        basePage.enterText(passwordTextField, "Test@123");
        test.log(LogStatus.INFO, test.addScreenCapture(BasePage.getScreenCapture(driver)), "Verified entered the value in the Password text field.");

        //Click on the eye button
        basePage.waitForElementToBeVisible(eyeBtn);
        basePage.click(eyeBtn);
        test.log(LogStatus.INFO, test.addScreenCapture(BasePage.getScreenCapture(driver)), "Verified clicked on the eye button.");

        //Check box button
        basePage.waitForElementToBeVisible(checkBoxBtn);
        basePage.click(checkBoxBtn);
        test.log(LogStatus.INFO, test.addScreenCapture(BasePage.getScreenCapture(driver)), "Verified clicked on the check box.");

        //Click on the signup button
        basePage.waitForElementToBeVisible(createAccountBtn);
        basePage.click(createAccountBtn);
        test.log(LogStatus.INFO, test.addScreenCapture(BasePage.getScreenCapture(driver)), "Verified clicked on the create account button.");

        //Error pop-up message
        basePage.waitForElementToBeVisible(alreadyExistEmailAddressErrorPopUpMsg);
        String errorMessage=alreadyExistEmailAddressErrorPopUpMsg.getText();
        if(errorMessage.equals(emailAlreadyTaken)){
            isTrue=true;
            test.log(LogStatus.PASS,test.addScreenCapture(BasePage.getScreenCapture(driver)),"Verified Email is already taken pop-up message is matched.");
        }else {
            isTrue=false;
            test.log(LogStatus.FAIL,test.addScreenCapture(BasePage.getScreenCapture(driver)),"Verified Email is already taken pop-up message isn't matched.");
        }

        return isTrue;
    }

    public boolean validateRegisterPageEmailTextFieldInvalidEmailAddressValidationWithOnlyNumericValue(String invalidEmail,ExtentTest test) throws IOException {
        boolean isTrue=false;

        String numeric= RandomStringUtils.randomNumeric(5,10);
        String email=numeric+".com";

        //Enter the value in the email text field
        basePage.waitForElementToBeVisible(emailTextField);
        basePage.enterText(emailTextField,"1");

        //Clear the value in the email text field
        basePage.waitForElementToBeVisible(emailTextField);
        basePage.clearValue(emailTextField);
        test.log(LogStatus.INFO,test.addScreenCapture(BasePage.getScreenCapture(driver)),"Verified cleared the value in the email text field.");

        //Enter the value in the email text field
        basePage.waitForElementToBeVisible(emailTextField);
        basePage.enterText(emailTextField,email);
        test.log(LogStatus.INFO,test.addScreenCapture(BasePage.getScreenCapture(driver)),"Verified entered the value in the Email Text Field.");

        //Validation message
        basePage.waitForElementToBeVisible(invalidEmailAddressValidation);
        String invalidEmailValidation=invalidEmailAddressValidation.getText();
        if (invalidEmailValidation.equals(invalidEmail)) {
            isTrue=true;
            test.log(LogStatus.PASS, test.addScreenCapture(BasePage.getScreenCapture(driver)), "Verified Please enter valid email validation is matched.");
        }else {
            isTrue=false;
            test.log(LogStatus.FAIL, test.addScreenCapture(BasePage.getScreenCapture(driver)), "Verified Please enter valid email validation isn't matched.");
        }

        return isTrue;
    }

    public boolean validateRegisterPageEmailTextFieldInvalidEmailAddressValidationWithOnlyAlphabeticValue(String invalidEmail,ExtentTest test) throws IOException {
        boolean isTrue=false;

        String alphabetic= RandomStringUtils.randomAlphabetic(5,10);
        String email=alphabetic+".com";

        //Clear the value in the email name text field
        basePage.waitForElementToBeVisible(emailTextField);
        basePage.clearValue(emailTextField);
        test.log(LogStatus.INFO,test.addScreenCapture(BasePage.getScreenCapture(driver)),"Verified cleared the value in the Email Text Field.");

        //Enter the value in the email text field
        basePage.waitForElementToBeVisible(emailTextField);
        basePage.enterText(emailTextField,email);
        test.log(LogStatus.INFO,test.addScreenCapture(BasePage.getScreenCapture(driver)),"Verified entered the value in the Email Text Field.");

        //Validation message
        basePage.waitForElementToBeVisible(invalidEmailAddressValidation);
        String invalidEmailValidation=invalidEmailAddressValidation.getText();
        if(invalidEmailValidation.equals(invalidEmail)) {
            isTrue=true;
            test.log(LogStatus.PASS,test.addScreenCapture(BasePage.getScreenCapture(driver)),"Verified Please enter valid email validation is matched.");
        }else {
            isTrue=false;
            test.log(LogStatus.FAIL,test.addScreenCapture(BasePage.getScreenCapture(driver)),"Verified Please enter valid email validation isn't matched.");
        }

        return isTrue;
    }

    public boolean validateRegisterPageEmailTextFieldInvalidEmailAddressValidationWithAlphaNumericValue(String invalidEmail,ExtentTest test) throws IOException {
        boolean isTrue=false;

        String alphanumeric= RandomStringUtils.randomAlphanumeric(5,10);
        String email=alphanumeric+".com";

        //Clear the value in the email name text field
        basePage.waitForElementToBeVisible(emailTextField);
        basePage.clearValue(emailTextField);
        test.log(LogStatus.INFO,test.addScreenCapture(BasePage.getScreenCapture(driver)),"Verified cleared the value in the Email Text Field.");

        //Enter the value in the email text field
        basePage.waitForElementToBeVisible(emailTextField);
        basePage.enterText(emailTextField,email);
        test.log(LogStatus.INFO,test.addScreenCapture(BasePage.getScreenCapture(driver)),"Verified entered the value in the Email Text Field.");

        //Validation message
        basePage.waitForElementToBeVisible(invalidEmailAddressValidation);
        String invalidEmailValidation=invalidEmailAddressValidation.getText();
        if(invalidEmailValidation.equals(invalidEmail)) {
            isTrue=true;
            test.log(LogStatus.PASS,test.addScreenCapture(BasePage.getScreenCapture(driver)),"Verified Please enter valid email validation is matched.");
        }else {
            isTrue=false;
            test.log(LogStatus.FAIL,test.addScreenCapture(BasePage.getScreenCapture(driver)),"Verified Please enter valid email validation isn't matched.");
        }

        return isTrue;
    }

    public boolean validateRegisterPageEmailTextFieldInvalidEmailAddressValidationWithMultipleAtTheRateValue(String invalidEmail,ExtentTest test) throws IOException {
        boolean isTrue=false;

        String randomAlphanumeric= RandomStringUtils.randomAlphanumeric(5,10);
        String email=randomAlphanumeric+"@jd@.com";

        //Clear the value in the email name text field
        basePage.waitForElementToBeVisible(emailTextField);
        basePage.clearValue(emailTextField);
        test.log(LogStatus.INFO,test.addScreenCapture(BasePage.getScreenCapture(driver)),"Verified cleared the value in the Email Text Field.");

        //Enter the value in the email text field
        basePage.waitForElementToBeVisible(emailTextField);
        basePage.enterText(emailTextField,email);
        test.log(LogStatus.INFO,test.addScreenCapture(BasePage.getScreenCapture(driver)),"Verified entered the value in the Email Text Field.");

        //Validation message
        basePage.waitForElementToBeVisible(invalidEmailAddressValidation);
        String invalidEmailValidation=invalidEmailAddressValidation.getText();
        if(invalidEmailValidation.equals(invalidEmail)) {
            isTrue=true;
            test.log(LogStatus.PASS,test.addScreenCapture(BasePage.getScreenCapture(driver)),"Verified Please enter valid email validation is matched.");
        }else {
            isTrue=false;
            test.log(LogStatus.FAIL,test.addScreenCapture(BasePage.getScreenCapture(driver)),"Verified Please enter valid email validation isn't matched.");
        }

        return isTrue;
    }

    public boolean validateRegisterPageEmailTextFieldInvalidEmailAddressValidationWithOnlySpecialCharacterValue(String invalidEmail,ExtentTest test) throws IOException {
        boolean isTrue=false;

        //Clear the value in the email name text field
        basePage.waitForElementToBeVisible(emailTextField);
        basePage.clearValue(emailTextField);
        test.log(LogStatus.INFO,test.addScreenCapture(BasePage.getScreenCapture(driver)),"Verified cleared the value in the Email Text Field.");

        //Enter the value in the email text field
        basePage.waitForElementToBeVisible(emailTextField);
        basePage.enterText(emailTextField,"!@#$.com");
        test.log(LogStatus.INFO,test.addScreenCapture(BasePage.getScreenCapture(driver)),"Verified entered the value in the Email Text Field.");

        //Validation message
        basePage.waitForElementToBeVisible(invalidEmailAddressValidation);
        String invalidEmailValidation=invalidEmailAddressValidation.getText();
        if(invalidEmailValidation.equals(invalidEmail)) {
            isTrue=true;
            test.log(LogStatus.PASS,test.addScreenCapture(BasePage.getScreenCapture(driver)),"Verified Please enter valid email validation is matched.");
        }else {
            isTrue=false;
            test.log(LogStatus.FAIL,test.addScreenCapture(BasePage.getScreenCapture(driver)),"Verified Please enter valid email validation isn't matched.");
        }

        return isTrue;
    }

    public boolean validateRegisterPageEmailTextFieldInvalidEmailAddressValidationWithoutAtTheRate(String invalidEmail,ExtentTest test) throws IOException {
        boolean isTrue=false;

        String randomAlphanumeric=RandomStringUtils.randomAlphanumeric(5,10);
        String email=randomAlphanumeric+".com";

        //Clear the value in the email name text field
        basePage.waitForElementToBeVisible(emailTextField);
        basePage.clearValue(emailTextField);
        test.log(LogStatus.INFO,test.addScreenCapture(BasePage.getScreenCapture(driver)),"Verified cleared the value in the Email Text Field.");

        //Enter the value in the email text field
        basePage.waitForElementToBeVisible(emailTextField);
        basePage.enterText(emailTextField,email);
        test.log(LogStatus.INFO,test.addScreenCapture(BasePage.getScreenCapture(driver)),"Verified entered the value in the Email Text Field.");

        //Validation message
        basePage.waitForElementToBeVisible(invalidEmailAddressValidation);
        String invalidEmailValidation=invalidEmailAddressValidation.getText();
        if(invalidEmailValidation.equals(invalidEmail)) {
            isTrue=true;
            test.log(LogStatus.PASS,test.addScreenCapture(BasePage.getScreenCapture(driver)),"Verified Please enter valid email validation is matched.");
        }else {
            isTrue=false;
            test.log(LogStatus.FAIL,test.addScreenCapture(BasePage.getScreenCapture(driver)),"Verified Please enter valid email validation isn't matched.");
        }

        return isTrue;
    }

    public boolean validateRegisterPageEmailTextFieldInvalidEmailAddressValidationWithMultipleDot(String invalidEmail,ExtentTest test) throws IOException {
        boolean isTrue=false;

        String registerEmail= PropertyReaderOptimized.getKeyValue("registerPageValidationEmail");
        String randomAlphanumeric=RandomStringUtils.randomAlphanumeric(5,10);
        String email=randomAlphanumeric+"@a.in.a..com";

        //Clear the value in the email name text field
        basePage.waitForElementToBeVisible(emailTextField);
        basePage.clearValue(emailTextField);
        test.log(LogStatus.INFO,test.addScreenCapture(BasePage.getScreenCapture(driver)),"Verified cleared the value in the Email Text Field.");

        //Enter the value in the email text field
        basePage.waitForElementToBeVisible(emailTextField);
        basePage.enterText(emailTextField,email);
        test.log(LogStatus.INFO,test.addScreenCapture(BasePage.getScreenCapture(driver)),"Verified entered the value in the Email Text Field.");

        //Validation message
        basePage.waitForElementToBeVisible(invalidEmailAddressValidation);
        String invalidEmailValidation=invalidEmailAddressValidation.getText();
        if(invalidEmailValidation.equals(invalidEmail)) {
            isTrue=true;
            test.log(LogStatus.PASS,test.addScreenCapture(BasePage.getScreenCapture(driver)),"Verified Please enter valid email validation is matched.");
        }else {
            isTrue=false;
            test.log(LogStatus.FAIL,test.addScreenCapture(BasePage.getScreenCapture(driver)),"Verified Please enter valid email validation isn't matched.");
        }

        //Clear the value in the email name text field
        basePage.waitForElementToBeVisible(emailTextField);
        basePage.clearValue(emailTextField);

        //Enter the value in the email text field
        basePage.waitForElementToBeVisible(emailTextField);
        basePage.enterText(emailTextField,registerEmail);

        return isTrue;
    }

    public boolean validateRegisterPagePasswordTextFieldValidationWithLessThanEightCharacters(String passwordContains,ExtentTest test) throws InterruptedException, IOException {
        boolean isTrue = false;

        String randomAlphanumeric=RandomStringUtils.randomAlphanumeric(1,4);
        String password=randomAlphanumeric+"A@";

        //Enter the value in the password text field
        basePage.waitForElementToBeVisible(passwordTextField);
        basePage.enterText(passwordTextField,"1");

        //Clear the value in the password text field
        basePage.waitForElementToBeVisible(passwordTextField);
        basePage.clearValue(passwordTextField);
        test.log(LogStatus.INFO, test.addScreenCapture(BasePage.getScreenCapture(driver)), "Clear the value in the password text field.");

        //Enter the value in the password text field
        basePage.waitForElementToBeVisible(passwordTextField);
        basePage.enterText(passwordTextField,password);
        test.log(LogStatus.INFO, test.addScreenCapture(BasePage.getScreenCapture(driver)), "Keep the less than 8 characters in the password text field.");

        //Validation message
        basePage.waitForElementToBeVisible(invalidPasswordValidation);
        String invalidPassword=invalidPasswordValidation.getText();
        if (invalidPassword.equals(passwordContains)) {
            test.log(LogStatus.PASS, test.addScreenCapture(BasePage.getScreenCapture(driver)), "Verified Password must be a minimum of 8 characters including number, upper, lower and one special character validation is matched.");
            isTrue = true;
        } else {
            test.log(LogStatus.FAIL, test.addScreenCapture(BasePage.getScreenCapture(driver)), "Verified Password must be a minimum of 8 characters including number, upper, lower and one special character validation isn't matched.");
            isTrue = false;
        }

        return isTrue;
    }

    public boolean validateRegisterPagePasswordTextFieldWithOnlyNumericValue(String passwordContains,ExtentTest test) throws InterruptedException, IOException {
        boolean isTrue = false;

        String password=RandomStringUtils.randomNumeric(1,10);

        //Clear the value in the password text field
        basePage.waitForElementToBeVisible(passwordTextField);
        basePage.clearValue(passwordTextField);
        test.log(LogStatus.INFO, test.addScreenCapture(BasePage.getScreenCapture(driver)), "Clear the value in the password text field.");

        //Enter the value in the password text field
        basePage.waitForElementToBeVisible(passwordTextField);
        basePage.enterText(passwordTextField,password);
        test.log(LogStatus.INFO, test.addScreenCapture(BasePage.getScreenCapture(driver)), "Keep only Numeric value in the password text field.");

        //Validation message
        basePage.waitForElementToBeVisible(invalidPasswordValidation);
        String invalidPassword=invalidPasswordValidation.getText();
        if (invalidPassword.equals(passwordContains)) {
            test.log(LogStatus.PASS, test.addScreenCapture(BasePage.getScreenCapture(driver)), "Verified Password must be a minimum of 8 characters including number, upper, lower and one special character validation is matched.");
            isTrue = true;
        } else {
            test.log(LogStatus.FAIL, test.addScreenCapture(BasePage.getScreenCapture(driver)), "Verified Password must be a minimum of 8 characters including number, upper, lower and one special character validation isn't matched.");
            isTrue = false;
        }

        return isTrue;
    }

    public boolean validateRegisterPagePasswordTextFieldWithOnlySpecialCharacterValue(String passwordContains,ExtentTest test) throws InterruptedException, IOException {
        boolean isTrue = false;

        String password="!@#$%#$@@";

        //Clear the value in the password text field
        basePage.waitForElementToBeVisible(passwordTextField);
        basePage.clearValue(passwordTextField);
        test.log(LogStatus.INFO, test.addScreenCapture(BasePage.getScreenCapture(driver)), "Clear the value in the password text field.");

        //Enter the value in the password text field
        basePage.waitForElementToBeVisible(passwordTextField);
        basePage.enterText(passwordTextField,password);
        test.log(LogStatus.INFO, test.addScreenCapture(BasePage.getScreenCapture(driver)), "Keep only Special Character value in the password text field.");

        //Validation message
        basePage.waitForElementToBeVisible(invalidPasswordValidation);
        String invalidPassword=invalidPasswordValidation.getText();
        if(invalidPassword.equals(passwordContains)) {
            test.log(LogStatus.PASS,test.addScreenCapture(BasePage.getScreenCapture(driver)),"Verified Password must be a minimum of 8 characters including number, upper, lower and one special character validation is matched.");
            isTrue=true;
        }else {
            test.log(LogStatus.FAIL,test.addScreenCapture(BasePage.getScreenCapture(driver)),"Verified Password must be a minimum of 8 characters including number, upper, lower and one special character validation isn't matched.");
            isTrue=false;
        }

        return isTrue;
    }

    public boolean validateRegisterPagePasswordTextFieldWithOnlyAlphabeticValue(String passwordContains,ExtentTest test) throws InterruptedException, IOException {
        boolean isTrue = false;

        String password=RandomStringUtils.randomAlphabetic(1,20);

        //Clear the value in the password text field
        basePage.waitForElementToBeVisible(passwordTextField);
        basePage.clearValue(passwordTextField);
        test.log(LogStatus.INFO,test.addScreenCapture(BasePage.getScreenCapture(driver)),"Clear the value in the password text field.");

        //Enter the value in the password text field
        basePage.waitForElementToBeVisible(passwordTextField);
        basePage.enterText(passwordTextField,password);
        test.log(LogStatus.INFO,test.addScreenCapture(BasePage.getScreenCapture(driver)),"Keep only Alphabetic value in the password text field.");

        //Validation message
        basePage.waitForElementToBeVisible(invalidPasswordValidation);
        String invalidPassword=invalidPasswordValidation.getText();
        if(invalidPassword.equals(passwordContains)) {
            test.log(LogStatus.PASS,test.addScreenCapture(BasePage.getScreenCapture(driver)),"Verified Password must be a minimum of 8 characters including number, upper, lower and one special character validation is matched.");
            isTrue=true;
        }else {
            test.log(LogStatus.FAIL,test.addScreenCapture(BasePage.getScreenCapture(driver)),"Verified Password must be a minimum of 8 characters including number, upper, lower and one special character validation isn't matched.");
            isTrue=false;
        }

        return isTrue;
    }

    public boolean validateRegisterPagePasswordTextFieldWithAlphaNumericValue(String passwordContains,ExtentTest test) throws InterruptedException, IOException {
        boolean isTrue = false;

        String password=RandomStringUtils.randomAlphanumeric(1,20);

        //Clear the value in the password text field
        basePage.waitForElementToBeVisible(passwordTextField);
        basePage.clearValue(passwordTextField);
        test.log(LogStatus.INFO,test.addScreenCapture(BasePage.getScreenCapture(driver)),"Clear the value in the password text field.");

        //Enter the value in the password text field
        basePage.waitForElementToBeVisible(passwordTextField);
        basePage.enterText(passwordTextField,password);
        test.log(LogStatus.INFO,test.addScreenCapture(BasePage.getScreenCapture(driver)),"Keep Numeric and Alphabetic value in the password text field.");

        //Validation message
        basePage.waitForElementToBeVisible(invalidPasswordValidation);
        String invalidPassword=invalidPasswordValidation.getText();
        if(invalidPassword.equals(passwordContains)) {
            test.log(LogStatus.PASS,test.addScreenCapture(BasePage.getScreenCapture(driver)),"Verified Password must be a minimum of 8 characters including number, upper, lower and one special character validation is matched.");
            isTrue=true;
        }else {
            test.log(LogStatus.FAIL,test.addScreenCapture(BasePage.getScreenCapture(driver)),"Verified Password must be a minimum of 8 characters including number, upper, lower and one special character validation isn't matched.");
            isTrue=false;
        }

        return isTrue;
    }

    public boolean validateRegisterPagePasswordTextFieldWithSpecialAndNumericValue(String passwordContains,ExtentTest test) throws InterruptedException, IOException {
        boolean isTrue = false;

        String numericValue=RandomStringUtils.randomNumeric(1,10);
        String password=numericValue+"@#!$";

        //Clear the value in the password text field
        basePage.waitForElementToBeVisible(passwordTextField);
        basePage.clearValue(passwordTextField);
        test.log(LogStatus.INFO, test.addScreenCapture(BasePage.getScreenCapture(driver)), "Clear the value in the password text field.");

        //Enter the value in the password text field
        basePage.waitForElementToBeVisible(passwordTextField);
        basePage.enterText(passwordTextField,password);
        test.log(LogStatus.INFO, test.addScreenCapture(BasePage.getScreenCapture(driver)), "Keep Special Character and Numeric value in the password text field.");

        //Validation message
        basePage.waitForElementToBeVisible(invalidPasswordValidation);
        String invalidPassword=invalidPasswordValidation.getText();
        if (invalidPassword.equals(passwordContains)) {
            test.log(LogStatus.PASS, test.addScreenCapture(BasePage.getScreenCapture(driver)), "Verified Password must be a minimum of 8 characters including number, upper, lower and one special character validation is matched.");
            isTrue = true;
        } else {
            test.log(LogStatus.FAIL, test.addScreenCapture(BasePage.getScreenCapture(driver)), "Verified Password must be a minimum of 8 characters including number, upper, lower and one special character validation isn't matched.");
            isTrue = false;
        }

        return isTrue;
    }

    public boolean validateRegisterPagePasswordTextFieldWithSpecialAndAlphabeticValue(String passwordContains,ExtentTest test) throws InterruptedException, IOException {
        boolean isTrue = false;

        String randomAlphabetic=RandomStringUtils.randomAlphabetic(1,10);
        String password=randomAlphabetic+"@#!$";

        //Clear the value in the password text field
        basePage.waitForElementToBeVisible(passwordTextField);
        basePage.clearValue(passwordTextField);
        test.log(LogStatus.INFO, test.addScreenCapture(BasePage.getScreenCapture(driver)), "Clear the value in the password text field.");

        //Enter the value in the password text field
        basePage.waitForElementToBeVisible(passwordTextField);
        basePage.enterText(passwordTextField,password);
        test.log(LogStatus.INFO, test.addScreenCapture(BasePage.getScreenCapture(driver)), "Keep Special Character and Alphabetic value in the password text field.");

        //Validation message
        basePage.waitForElementToBeVisible(invalidPasswordValidation);
        String invalidPassword=invalidPasswordValidation.getText();
        if (invalidPassword.equals(passwordContains)) {
            test.log(LogStatus.PASS, test.addScreenCapture(BasePage.getScreenCapture(driver)), "Verified Password must be a minimum of 8 characters including number, upper, lower and one special character validation is matched.");
            isTrue = true;
        } else {
            test.log(LogStatus.FAIL, test.addScreenCapture(BasePage.getScreenCapture(driver)), "Verified Password must be a minimum of 8 characters including number, upper, lower and one special character validation isn't matched.");
            isTrue = false;
        }

        return isTrue;
    }

    public boolean validateRegisterPagePasswordTextFieldWithoutUpperCaseValue(String passwordContains,ExtentTest test) throws InterruptedException, IOException {
        boolean isTrue = false;

        String password="admin@123";

        //Clear the value in the password text field
        basePage.waitForElementToBeVisible(passwordTextField);
        basePage.clearValue(passwordTextField);
        test.log(LogStatus.INFO, test.addScreenCapture(BasePage.getScreenCapture(driver)), "Clear the value in the password text field.");

        //Enter the value in the password text field
        basePage.waitForElementToBeVisible(passwordTextField);
        basePage.enterText(passwordTextField,password);
        test.log(LogStatus.INFO, test.addScreenCapture(BasePage.getScreenCapture(driver)), "Keep 1 Lower Case, 1 Number, 1 Special, and At least 8 Characters in the password text field.");


        //Validation message
        basePage.waitForElementToBeVisible(invalidPasswordValidation);
        String invalidPassword=invalidPasswordValidation.getText();
        if (invalidPassword.equals(passwordContains)) {
            test.log(LogStatus.PASS, test.addScreenCapture(BasePage.getScreenCapture(driver)), "Verified Password must be a minimum of 8 characters including number, upper, lower and one special character validation is matched.");
            isTrue = true;
        } else {
            test.log(LogStatus.FAIL, test.addScreenCapture(BasePage.getScreenCapture(driver)), "Verified Password must be a minimum of 8 characters including number, upper, lower and one special character validation isn't matched.");
            isTrue = false;
        }

        return isTrue;
    }

    public boolean validateRegisterPagePasswordTextFieldWithoutLowerCaseValue(String passwordContains,ExtentTest test) throws InterruptedException, IOException {
        boolean isTrue = false;

        String password="ADMIN@123";

        //Clear the value in the password text field
        basePage.waitForElementToBeVisible(passwordTextField);
        basePage.clearValue(passwordTextField);
        test.log(LogStatus.INFO, test.addScreenCapture(BasePage.getScreenCapture(driver)), "Clear the value in the password text field.");

        //Enter the value in the password text field
        basePage.waitForElementToBeVisible(passwordTextField);
        basePage.enterText(passwordTextField,password);
        test.log(LogStatus.INFO, test.addScreenCapture(BasePage.getScreenCapture(driver)), "Keep 1 Upper Case, 1 Number, 1 Special, and At least 8 Characters in the password text field.");

        //Validation message
        basePage.waitForElementToBeVisible(invalidPasswordValidation);
        String invalidPassword=invalidPasswordValidation.getText();
        if (invalidPassword.equals(passwordContains)) {
            test.log(LogStatus.PASS, test.addScreenCapture(BasePage.getScreenCapture(driver)), "Verified Password must be a minimum of 8 characters including number, upper, lower and one special character validation is matched.");
            isTrue = true;
        } else {
            test.log(LogStatus.FAIL, test.addScreenCapture(BasePage.getScreenCapture(driver)), "Verified Password must be a minimum of 8 characters including number, upper, lower and one special character validation isn't matched.");
            isTrue = false;
        }

        return isTrue;
    }

    public boolean validateRegisterPagePasswordTextFieldWithoutNumericValue(String passwordContains,ExtentTest test) throws InterruptedException, IOException {
        boolean isTrue = false;

        String randomAlphabetic=RandomStringUtils.randomAlphabetic(1,10);
        String password=randomAlphabetic+"!@#$";

        //Clear the value in the password text field
        basePage.waitForElementToBeVisible(passwordTextField);
        basePage.clearValue(passwordTextField);
        test.log(LogStatus.INFO, test.addScreenCapture(BasePage.getScreenCapture(driver)), "Clear the value in the password text field.");

        //Enter the value in the password text field
        basePage.waitForElementToBeVisible(passwordTextField);
        basePage.enterText(passwordTextField,password);
        test.log(LogStatus.INFO, test.addScreenCapture(BasePage.getScreenCapture(driver)), "Keep 1 Upper Case, 1 Lower Case, 1 Special, and At least 8 Characters in the password text field.");

        //Validation message
        basePage.waitForElementToBeVisible(invalidPasswordValidation);
        String invalidPassword=invalidPasswordValidation.getText();
        if (invalidPassword.equals(passwordContains)) {
            test.log(LogStatus.PASS, test.addScreenCapture(BasePage.getScreenCapture(driver)), "Verified Password must be a minimum of 8 characters including number, upper, lower and one special character validation is matched.");
            isTrue = true;
        } else {
            test.log(LogStatus.FAIL, test.addScreenCapture(BasePage.getScreenCapture(driver)), "Verified Password must be a minimum of 8 characters including number, upper, lower and one special character validation isn't matched.");
            isTrue = false;
        }

        return isTrue;
    }

    public boolean validateRegisterPagePasswordTextFieldWithoutSpecialCharacterValue(String passwordContains,ExtentTest test) throws InterruptedException, IOException {
        boolean isTrue = false;

        String password = RandomStringUtils.randomAlphanumeric(1, 15);

        //Clear the value in the password text field
        basePage.waitForElementToBeVisible(passwordTextField);
        basePage.clearValue(passwordTextField);
        test.log(LogStatus.INFO, test.addScreenCapture(BasePage.getScreenCapture(driver)), "Clear the value in the password text field.");

        //Enter the value in the password text field
        basePage.waitForElementToBeVisible(passwordTextField);
        basePage.enterText(passwordTextField, password);
        test.log(LogStatus.INFO, test.addScreenCapture(BasePage.getScreenCapture(driver)), "Keep 1 Upper Case, 1 Lower Case, 1 Number, and At least 8 Characters in the password text field.");

        //Validation message
        basePage.waitForElementToBeVisible(invalidPasswordValidation);
        String invalidPassword = invalidPasswordValidation.getText();
        if (invalidPassword.equals(passwordContains)) {
            test.log(LogStatus.PASS, test.addScreenCapture(BasePage.getScreenCapture(driver)), "Verified Password must be a minimum of 8 characters including number, upper, lower and one special character validation is matched.");
            isTrue = true;
        } else {
            test.log(LogStatus.FAIL, test.addScreenCapture(BasePage.getScreenCapture(driver)), "Verified Password must be a minimum of 8 characters including number, upper, lower and one special character validation isn't matched.");
            isTrue = false;
        }

        //Clear the value in the password text field
        basePage.waitForElementToBeVisible(passwordTextField);
        basePage.clearValue(passwordTextField);

        //Enter the value in the password text field
        basePage.waitForElementToBeVisible(passwordTextField);
        basePage.enterText(passwordTextField, "Test@123");

        return isTrue;
    }

    public boolean validateRegisterPageConfirmPasswordMustMatchValidation(String confirmPasswordMustMatch,ExtentTest test) throws InterruptedException, IOException {
        boolean isTrue = false;

        String mailinatorEmail = PropertyReaderOptimized.getKeyValue("registerPageValidationMailinatorEmail");
        String confirmPassword="abcd";

        //Enter the value in the confirm-password text field
        basePage.waitForElementToBeVisible(confirmPasswordTextField);
        basePage.enterText(confirmPasswordTextField,confirmPassword);
        test.log(LogStatus.INFO, test.addScreenCapture(BasePage.getScreenCapture(driver)),"Verified entered the value in the confirm password text field.");

        //Get the value
        String confirmPasswordMustMatchVal=confirmPasswordMustMatchValidation.getText();

        //Compare the values
        basePage.waitForElementToBeVisible(confirmPasswordMustMatchValidation);
        if (confirmPasswordMustMatchVal.equals(confirmPasswordMustMatch)) {
            test.log(LogStatus.PASS, test.addScreenCapture(BasePage.getScreenCapture(driver)), "Verified Confirm Password must match validation is matched.");
            isTrue = true;
        } else {
            test.log(LogStatus.FAIL, test.addScreenCapture(BasePage.getScreenCapture(driver)), "Verified Confirm Password must match validation isn't matched.");
            isTrue = false;
        }

        //Clear the value from the confirm-password text field
        basePage.waitForElementToBeVisible(confirmPasswordTextField);
        basePage.clearValue(confirmPasswordTextField);

        //Enter the value in the confirm-password text field
        basePage.waitForElementToBeVisible(confirmPasswordTextField);
        basePage.enterText(confirmPasswordTextField,"Test@123");

        //Click on the create account button
        basePage.waitForElementToBeVisible(createAccountBtn);
        basePage.click(createAccountBtn);

        //Switch to the new window
        driver.switchTo().newWindow(WindowType.WINDOW).navigate().to(PropertyReaderOptimized.getKeyValue("mailinatorUrl"));

        //Enter the value in the mailinator login text field
        basePage.waitForElementToBeVisible(mailinatorLoginTextField);
        basePage.enterText(mailinatorLoginTextField, mailinatorEmail);

        //Click on the go button
        basePage.waitForElementToBeVisible(goButton);
        basePage.click(goButton);

        //Click on the email verification link
        basePage.threadSleep();
        basePage.waitForElementToBeVisible(emailVerification);
        basePage.click(emailVerification);

        //Switch to the frame
        basePage.waitForElementToBeVisible(iframe);
        basePage.switchToFrameWebElement(iframe);

        //Click on the confirm button
        basePage.waitForElementToBeVisible(confirmBtn);
        basePage.click(confirmBtn);

        //Switch the window
        Thread.sleep(2000);
        basePage.switchToWindow();

        return isTrue;
    }

    public boolean validateRegisterPagePhoneNumberRequiredValidation(String phoneNumber,ExtentTest test) throws InterruptedException, IOException {
        boolean isTrue = false;

        //Click on the send code button
        basePage.waitForElementToBeVisible(sendCodeBtn);
        basePage.click(sendCodeBtn);
        test.log(LogStatus.INFO,test.addScreenCapture(BasePage.getScreenCapture(driver)),"Verified clicked on the send code button.");

        //Validation message
        basePage.waitForElementToBeVisible(phoneNumberRequiredValidation);
        String phoneNumberValidation=phoneNumberRequiredValidation.getText();
        if(phoneNumberValidation.equals(phoneNumber)){
            isTrue=true;
            test.log(LogStatus.PASS,test.addScreenCapture(BasePage.getScreenCapture(driver)),"Verified Phone number is required validation is matched.");
        }else {
            isTrue=false;
            test.log(LogStatus.FAIL,test.addScreenCapture(BasePage.getScreenCapture(driver)),"Verified Phone number is required validation isn't matched.");
        }

        return isTrue;
    }

    public boolean validateRegisterPageExistPhoneNumberErrorMsg(String phoneNumberAlreadyExists,ExtentTest test) throws InterruptedException, IOException {
        boolean isTrue = false;

        String country=PropertyReaderOptimized.getKeyValue("registerValidationCountry");
        String existPhoneNumber=PropertyReaderOptimized.getKeyValue("registerExistPhoneNumber");

        //Click on the drop-down button
        basePage.waitForElementToBeVisible(dropDownBtn);
        basePage.click(dropDownBtn);
        test.log(LogStatus.INFO,test.addScreenCapture(BasePage.getScreenCapture(driver)),"Verified clicked on the drop-down button.");

        //Search box
        basePage.waitForElementToBeVisible(searchBox);
        basePage.enterText(searchBox,country);
        test.log(LogStatus.INFO,test.addScreenCapture(BasePage.getScreenCapture(driver)),"Verified entered the value in the search box text field.");

        //Select country
        basePage.waitForElementToBeVisible(countryName);
        basePage.click(countryName);
        test.log(LogStatus.INFO,test.addScreenCapture(BasePage.getScreenCapture(driver)),"Verified clicked on the country name.");

        //Enter the value in the phone number text field
        basePage.waitForElementToBeVisible(phoneNoTextField);
        basePage.enterText(phoneNoTextField,existPhoneNumber);
        test.log(LogStatus.INFO,test.addScreenCapture(BasePage.getScreenCapture(driver)),"Verified entered the value in the phone number text field.");

        //Click on the send code button
        basePage.waitForElementToBeVisible(sendCodeBtn);
        basePage.click(sendCodeBtn);
        test.log(LogStatus.INFO,test.addScreenCapture(BasePage.getScreenCapture(driver)),"Verified clicked on the send code button.");

        //Error pop-up message
        basePage.waitForElementToBeVisible(phoneNumberAlreadyExistErrorPopUpMsg);
        String phoneNumberAlreadyExistsMessage=phoneNumberAlreadyExistErrorPopUpMsg.getText();
        if(phoneNumberAlreadyExistsMessage.equals(phoneNumberAlreadyExists)){
            isTrue=true;
            test.log(LogStatus.PASS,test.addScreenCapture(BasePage.getScreenCapture(driver)),"Verified Phone number already exists pop-up message is matched.");
        }else {
            isTrue=false;
            test.log(LogStatus.FAIL,test.addScreenCapture(BasePage.getScreenCapture(driver)),"Verified Phone number already exists pop-up message isn't matched.");
        }

        return isTrue;
    }

    public boolean validateRegisterPageInvalidPhoneNumberValidation(String phoneNumberValidation,ExtentTest test) throws InterruptedException, IOException {
        boolean isTrue = false;

        String invalidPhoneNumber=PropertyReaderOptimized.getKeyValue("registerInvalidPhoneNumber");

        //Enter the value in the phone number text field
        basePage.waitForElementToBeVisible(phoneNoTextField);
        basePage.enterText(phoneNoTextField,"12");
        test.log(LogStatus.INFO,test.addScreenCapture(BasePage.getScreenCapture(driver)),"Verified entered the value in the phone number text field.");

        basePage.waitForElementToBeVisible(phoneNoTextField);
        basePage.removeValue(phoneNoTextField);
        test.log(LogStatus.INFO,test.addScreenCapture(BasePage.getScreenCapture(driver)),"Verified removed the value from the phone number text field.");

        //Enter the value in the phone number text field
        basePage.waitForElementToBeVisible(phoneNoTextField);
        basePage.enterText(phoneNoTextField,invalidPhoneNumber);
        test.log(LogStatus.INFO,test.addScreenCapture(BasePage.getScreenCapture(driver)),"Verified entered the value in the phone number text field.");

        //Validation message
        basePage.waitForElementToBeVisible(enterValidPhoneNumberValidation);
        String phoneNumber=enterValidPhoneNumberValidation.getText();
        if(phoneNumber.equals(phoneNumberValidation)){
            isTrue=true;
            test.log(LogStatus.PASS,test.addScreenCapture(BasePage.getScreenCapture(driver)),"Verified Please enter valid phone number validation is matched.");
        }else {
            isTrue=false;
            test.log(LogStatus.FAIL,test.addScreenCapture(BasePage.getScreenCapture(driver)),"Verified Please enter valid phone number validation isn't matched.");
        }

        return isTrue;
    }

    public boolean validateRegisterPageRequiredOtpValidation(String OTP,ExtentTest test) throws InterruptedException, IOException {
        boolean isTrue = false;

        String phoneNumber=PropertyReaderOptimized.getKeyValue("registerValidationPhoneNumber");

        //Remove the value in the phone number text field
        basePage.waitForElementToBeVisible(phoneNoTextField);
        basePage.remove(phoneNoTextField);
        test.log(LogStatus.INFO,test.addScreenCapture(BasePage.getScreenCapture(driver)),"Verified removed the value in the phone number text field.");

        //Enter the value in the phone number text field
        basePage.waitForElementToBeVisible(phoneNoTextField);
        basePage.enterText(phoneNoTextField,phoneNumber);
        test.log(LogStatus.INFO,test.addScreenCapture(BasePage.getScreenCapture(driver)),"Verified entered the value in the phone number text field.");

        //Click on the send code button
        basePage.waitForElementToBeVisible(sendCodeBtn);
        basePage.click(sendCodeBtn);
        test.log(LogStatus.INFO,test.addScreenCapture(BasePage.getScreenCapture(driver)),"Verified clicked on the send code button.");

        //Click on the submit button
        basePage.waitForElementToBeVisible(submitBtn);
        basePage.click(submitBtn);
        test.log(LogStatus.INFO,test.addScreenCapture(BasePage.getScreenCapture(driver)),"Verified clicked on the submit button.");

        //Validation message
        basePage.waitForElementToBeVisible(otpRequiredValidation);
        String otpValidation=otpRequiredValidation.getText();
        if(otpValidation.equals(OTP)){
            isTrue=true;
            test.log(LogStatus.PASS,test.addScreenCapture(BasePage.getScreenCapture(driver)),"Verified OTP is required validation is matched.");
        }else {
            isTrue=false;
            test.log(LogStatus.FAIL,test.addScreenCapture(BasePage.getScreenCapture(driver)),"Verified OTP is required validation isn't matched.");
        }

        return isTrue;
    }

    public boolean validateRegisterPageInvalidOtpValidation(String invalidOTP,ExtentTest test) throws InterruptedException, IOException {
        boolean isTrue = false;

        String invalidOtp=PropertyReaderOptimized.getKeyValue("registerInvalidOtp");

        //Enter the value in the enter code text field
        basePage.waitForElementToBeVisible(enterCodeTextField);
        basePage.enterText(enterCodeTextField,invalidOtp);
        test.log(LogStatus.INFO,test.addScreenCapture(BasePage.getScreenCapture(driver)),"Verified entered the value in the enter code text field.");

        //Click on the submit button
        basePage.waitForElementToBeVisible(submitBtn);
        basePage.click(submitBtn);
        test.log(LogStatus.INFO,test.addScreenCapture(BasePage.getScreenCapture(driver)),"Verified clicked on the submit button.");

        //Error pop-up message
        basePage.waitForElementToBeVisible(invalidOtpErrorPopUPMsg);
        String invalidOTPMessage=invalidOtpErrorPopUPMsg.getText();
        if(invalidOTPMessage.equals(invalidOTP)){
            isTrue=true;
            test.log(LogStatus.PASS,test.addScreenCapture(BasePage.getScreenCapture(driver)),"Verified OTP Code is Invalid pop-up message is matched.");
        }else {
            isTrue=false;
            test.log(LogStatus.FAIL,test.addScreenCapture(BasePage.getScreenCapture(driver)),"Verified OTP Code is Invalid pop-up message isn't matched.");
        }

        return isTrue;
    }
}
