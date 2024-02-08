package GalaxiaExchangeModule.tests.web;

import GalaxiaExchangeModule.base.TestBase;
import com.pages.RegisterPageValidation;
import com.relevantcodes.extentreports.LogStatus;
import com.report.Reports;
import com.utils.PropertyReaderOptimized;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.io.IOException;

public class RegisterPageValidationScript extends TestBase {
    RegisterPageValidation registerPageValidation;
    SoftAssert softAssert;

    public RegisterPageValidationScript() throws InterruptedException {
        registerPageValidation=new RegisterPageValidation(driver);
        softAssert=new SoftAssert();
    }

    @Test(priority = 1)
    public void verifyRegisterPageFirstNameRequiredValidationFunctionality() throws IOException, InterruptedException {
        test = Reports.createTest(new Object() {}.getClass().getEnclosingMethod().getName(), reports);
        try {
            Assert.assertEquals(registerPageValidation.validateRegisterPageFirstNameRequiredValidation(PropertyReaderOptimized.getExcelSheetValue(17,1),test),true);
            test.log(LogStatus.PASS,"All conditions are verified.");
        } catch (Error | Exception e) {
            test.log(LogStatus.FAIL,"All conditions aren't verified.");
            Assert.fail(String.valueOf(e.getStackTrace()));
            softAssert.assertAll();
        }
    }

    @Test(priority = 2)
    public void verifyRegisterPageLastNameRequiredValidationFunctionality() throws IOException, InterruptedException {
        test = Reports.createTest(new Object() {}.getClass().getEnclosingMethod().getName(), reports);
        try {
            Assert.assertEquals(registerPageValidation.validateRegisterPageLastNameRequiredValidation(PropertyReaderOptimized.getExcelSheetValue(18,1),test),true);
            test.log(LogStatus.PASS,"All conditions are verified.");
        } catch (Error | Exception e) {
            test.log(LogStatus.FAIL,"All conditions aren't verified.");
            Assert.fail(String.valueOf(e.getStackTrace()));
            softAssert.assertAll();
        }
    }

    @Test(priority = 3)
    public void verifyRegisterPageDateOfBirthRequiredValidationFunctionality() throws IOException, InterruptedException {
        test = Reports.createTest(new Object() {}.getClass().getEnclosingMethod().getName(), reports);
        try {
            Assert.assertEquals(registerPageValidation.validateRegisterPageDateOfBirthRequiredValidation(PropertyReaderOptimized.getExcelSheetValue(23,4),test),true);
            test.log(LogStatus.PASS,"All conditions are verified.");
        } catch (Error | Exception e) {
            test.log(LogStatus.FAIL,"All conditions aren't verified.");
            Assert.fail(String.valueOf(e.getStackTrace()));
            softAssert.assertAll();
        }
    }

    @Test(priority = 4)
    public void verifyRegisterPageEmailRequiredValidationFunctionality() throws IOException, InterruptedException {
        test = Reports.createTest(new Object() {}.getClass().getEnclosingMethod().getName(), reports);
        try {
            Assert.assertEquals(registerPageValidation.validateRegisterPageEmailRequiredValidation(PropertyReaderOptimized.getExcelSheetValue(19,1),test),true);
            test.log(LogStatus.PASS,"All conditions are verified.");
        } catch (Error | Exception e) {
            test.log(LogStatus.FAIL,"All conditions aren't verified.");
            Assert.fail(String.valueOf(e.getStackTrace()));
            softAssert.assertAll();
        }
    }

    @Test(priority = 5)
    public void verifyRegisterPagePasswordRequiredValidationFunctionality() throws IOException, InterruptedException {
        test = Reports.createTest(new Object() {}.getClass().getEnclosingMethod().getName(), reports);
        try {
            softAssert.assertEquals(registerPageValidation.validateRegisterPagePasswordRequiredValidation(PropertyReaderOptimized.getExcelSheetValue(20, 1),test), true);
            test.log(LogStatus.PASS,"All conditions are verified.");
        } catch (Error | Exception e) {
            test.log(LogStatus.FAIL,"All conditions aren't verified.");
            Assert.fail(String.valueOf(e.getStackTrace()));
            softAssert.assertAll();
        }
    }

    @Test(priority = 6)
    public void verifyRegisterPageConfirmPasswordRequiredValidationFunctionality() throws IOException, InterruptedException {
        test = Reports.createTest(new Object() {}.getClass().getEnclosingMethod().getName(), reports);
        try {
            softAssert.assertEquals(registerPageValidation.validateRegisterPageConfirmPasswordRequiredValidation(PropertyReaderOptimized.getExcelSheetValue(20, 1),test), true);
            test.log(LogStatus.PASS,"All conditions are verified.");
        } catch (Error | Exception e) {
            test.log(LogStatus.FAIL,"All conditions aren't verified.");
            Assert.fail(String.valueOf(e.getStackTrace()));
            softAssert.assertAll();
        }
    }

    @Test(priority = 7)
    public void verifyRegisterPageTermsAndConditionsRequiredValidationFunctionality() throws IOException, InterruptedException {
        test = Reports.createTest(new Object() {}.getClass().getEnclosingMethod().getName(), reports);
        try {
            softAssert.assertEquals(registerPageValidation.validateRegisterPageTermsAndConditionsRequiredValidation(PropertyReaderOptimized.getExcelSheetValue(21, 1),test), true);
            test.log(LogStatus.PASS,"All conditions are verified.");
        } catch (Error | Exception e) {
            test.log(LogStatus.FAIL,"All conditions aren't verified.");
            Assert.fail(String.valueOf(e.getStackTrace()));
            softAssert.assertAll();
        }
    }

    @Test(priority = 8)
    public void verifyFirstNameTextFieldValidationWithNumericValueFunctionality() throws IOException, InterruptedException {
        test = Reports.createTest(new Object() {}.getClass().getEnclosingMethod().getName(), reports);
        try {
            softAssert.assertEquals(registerPageValidation.validateFirstNameTextFieldValidationWithNumericValue(PropertyReaderOptimized.getExcelSheetValue(24, 4),test), true);
            test.log(LogStatus.PASS,"All conditions are verified.");
        } catch (Error | Exception e) {
            test.log(LogStatus.FAIL,"All conditions aren't verified.");
            Assert.fail(String.valueOf(e.getStackTrace()));
            softAssert.assertAll();
        }
    }

    @Test(priority = 9)
    public void verifyFirstNameTextFieldValidationWithSpecialCharacterValueFunctionality() throws IOException, InterruptedException {
        test = Reports.createTest(new Object() {}.getClass().getEnclosingMethod().getName(), reports);
        try {
            softAssert.assertEquals(registerPageValidation.validateFirstNameTextFieldValidationWithSpecialCharacterValue(PropertyReaderOptimized.getExcelSheetValue(24, 4),test), true);
            test.log(LogStatus.PASS,"All conditions are verified.");
        } catch (Error | Exception e) {
            test.log(LogStatus.FAIL,"All conditions aren't verified.");
            Assert.fail(String.valueOf(e.getStackTrace()));
            softAssert.assertAll();
        }
    }

    @Test(priority = 10)
    public void verifyFirstNameTextFieldValidationWithAlphaNumericValueFunctionality() throws IOException, InterruptedException {
        test = Reports.createTest(new Object() {}.getClass().getEnclosingMethod().getName(), reports);
        try {
            softAssert.assertEquals(registerPageValidation.validateFirstNameTextFieldValidationWithAlphaNumericValue(PropertyReaderOptimized.getExcelSheetValue(24, 4),test), true);
            test.log(LogStatus.PASS,"All conditions are verified.");
        } catch (Error | Exception e) {
            test.log(LogStatus.FAIL,"All conditions aren't verified.");
            Assert.fail(String.valueOf(e.getStackTrace()));
            softAssert.assertAll();
        }
    }

    @Test(priority = 11)
    public void verifyFirstNameTextFieldValidationWithAlphaSpecialCharacterValueFunctionality() throws IOException, InterruptedException {
        test = Reports.createTest(new Object() {}.getClass().getEnclosingMethod().getName(), reports);
        try {
            softAssert.assertEquals(registerPageValidation.validateFirstNameTextFieldValidationWithAlphaSpecialCharacterValue(PropertyReaderOptimized.getExcelSheetValue(24, 4),test), true);
            test.log(LogStatus.PASS,"All conditions are verified.");
        } catch (Error | Exception e) {
            test.log(LogStatus.FAIL,"All conditions aren't verified.");
            Assert.fail(String.valueOf(e.getStackTrace()));
            softAssert.assertAll();
        }
    }

    @Test(priority = 12)
    public void verifyFirstNameTextFieldValidationWithMoreThanTwentyFiveCharactersFunctionality() throws IOException, InterruptedException {
        test = Reports.createTest(new Object() {}.getClass().getEnclosingMethod().getName(), reports);
        try {
            softAssert.assertEquals(registerPageValidation.validateFirstNameTextFieldValidationWithMoreThanTwentyFiveCharacters(PropertyReaderOptimized.getExcelSheetValue(27, 4),test), true);
            test.log(LogStatus.PASS,"All conditions are verified.");
        } catch (Error | Exception e) {
            test.log(LogStatus.FAIL,"All conditions aren't verified.");
            Assert.fail(String.valueOf(e.getStackTrace()));
            softAssert.assertAll();
        }
    }

    @Test(priority = 13)
    public void verifyLastNameTextFieldValidationWithNumericValueFunctionality() throws IOException, InterruptedException {
        test = Reports.createTest(new Object() {}.getClass().getEnclosingMethod().getName(), reports);
        try {
            softAssert.assertEquals(registerPageValidation.validateLastNameTextFieldValidationWithNumericValue(PropertyReaderOptimized.getExcelSheetValue(24, 4),test), true);
            test.log(LogStatus.PASS,"All conditions are verified.");
        } catch (Error | Exception e) {
            test.log(LogStatus.FAIL,"All conditions aren't verified.");
            Assert.fail(String.valueOf(e.getStackTrace()));
            softAssert.assertAll();
        }
    }

    @Test(priority = 14)
    public void verifyLastNameTextFieldValidationWithSpecialCharacterValueValidationFunctionality() throws IOException, InterruptedException {
        test = Reports.createTest(new Object() {}.getClass().getEnclosingMethod().getName(), reports);
        try {
            softAssert.assertEquals(registerPageValidation.validateLastNameTextFieldValidationWithSpecialCharacterValue(PropertyReaderOptimized.getExcelSheetValue(24, 4),test), true);
            test.log(LogStatus.PASS,"All conditions are verified.");
        } catch (Error | Exception e) {
            test.log(LogStatus.FAIL,"All conditions aren't verified.");
            Assert.fail(String.valueOf(e.getStackTrace()));
            softAssert.assertAll();
        }
    }

    @Test(priority = 15)
    public void verifyLastNameTextFieldValidationWithAlphaNumericValueFunctionality() throws IOException, InterruptedException {
        test = Reports.createTest(new Object() {}.getClass().getEnclosingMethod().getName(), reports);
        try {
            softAssert.assertEquals(registerPageValidation.validateLastNameTextFieldValidationWithAlphaNumericValue(PropertyReaderOptimized.getExcelSheetValue(24, 4),test), true);
            test.log(LogStatus.PASS,"All conditions are verified.");
        } catch (Error | Exception e) {
            test.log(LogStatus.FAIL,"All conditions aren't verified.");
            Assert.fail(String.valueOf(e.getStackTrace()));
            softAssert.assertAll();
        }
    }

    @Test(priority = 16)
    public void verifyLastNameTextFieldValidationWithAlphaSpecialCharacterValueFunctionality() throws IOException, InterruptedException {
        test = Reports.createTest(new Object() {}.getClass().getEnclosingMethod().getName(), reports);
        try {
            softAssert.assertEquals(registerPageValidation.validateLastNameTextFieldValidationWithAlphaSpecialCharacterValue(PropertyReaderOptimized.getExcelSheetValue(24, 4),test), true);
            test.log(LogStatus.PASS,"All conditions are verified.");
        } catch (Error | Exception e) {
            test.log(LogStatus.FAIL,"All conditions aren't verified.");
            Assert.fail(String.valueOf(e.getStackTrace()));
            softAssert.assertAll();
        }
    }

    @Test(priority = 17)
    public void verifyLastNameTextFieldValidationWithMoreThanTwentyFiveCharactersFunctionality() throws IOException, InterruptedException {
        test = Reports.createTest(new Object() {}.getClass().getEnclosingMethod().getName(), reports);
        try {
            softAssert.assertEquals(registerPageValidation.validateLastNameTextFieldValidationWithMoreThanTwentyFiveCharacters(PropertyReaderOptimized.getExcelSheetValue(27, 4),test), true);
            test.log(LogStatus.PASS,"All conditions are verified.");
        } catch (Error | Exception e) {
            test.log(LogStatus.FAIL,"All conditions aren't verified.");
            Assert.fail(String.valueOf(e.getStackTrace()));
            softAssert.assertAll();
        }
    }

    @Test(priority = 18)
    public void verifyEmailTextFieldValidationWithAlreadyExistEmailAddressFunctionality() throws IOException, InterruptedException {
        test=Reports.createTest(new Object() {}.getClass().getEnclosingMethod().getName(), reports);
        try {
            softAssert.assertEquals(registerPageValidation.validateEmailTextFieldValidationWithAlreadyExistEmailAddress(PropertyReaderOptimized.getExcelSheetValue(24,1),test),true);
            test.log(LogStatus.PASS,"All conditions are verified.");
        } catch (Error | Exception e) {
            test.log(LogStatus.FAIL,"All conditions aren't verified.");
            Assert.fail(String.valueOf(e.getStackTrace()));
            softAssert.assertAll();
        }
    }

    @Test(priority = 19)
    public void verifyRegisterPageEmailTextFieldInvalidEmailAddressValidationWithMissingSymbolFunctionality() throws IOException, InterruptedException {
        test=Reports.createTest(new Object() {}.getClass().getEnclosingMethod().getName(), reports);
        try {
            softAssert.assertEquals(registerPageValidation.validateRegisterPageEmailTextFieldInvalidEmailAddressValidationWithMissingSymbol(PropertyReaderOptimized.getExcelSheetValue(1,1),test),true);
            test.log(LogStatus.PASS,"All conditions are verified.");
        } catch (Error | Exception e) {
            test.log(LogStatus.FAIL,"All conditions aren't verified.");
            Assert.fail(String.valueOf(e.getStackTrace()));
            softAssert.assertAll();
        }
    }

    @Test(priority = 20)
    public void verifyRegisterPageEmailTextFieldInvalidEmailAddressWithMissingDomainFunctionality() throws IOException, InterruptedException {
        test=Reports.createTest(new Object() {}.getClass().getEnclosingMethod().getName(), reports);
        try {
            softAssert.assertEquals(registerPageValidation.validateRegisterPageEmailTextFieldInvalidEmailAddressWithMissingDomain(PropertyReaderOptimized.getExcelSheetValue(1,1),test),true);
            test.log(LogStatus.PASS,"All conditions are verified.");
        } catch (Error | Exception e) {
            test.log(LogStatus.FAIL,"All conditions aren't verified.");
            Assert.fail(String.valueOf(e.getStackTrace()));
            softAssert.assertAll();
        }
    }

    @Test(priority = 21)
    public void verifyRegisterPageEmailTextFieldInvalidEmailAddressWithMissingTopLevelDomainFunctionality() throws IOException, InterruptedException {
        test=Reports.createTest(new Object() {}.getClass().getEnclosingMethod().getName(), reports);
        try {
            softAssert.assertEquals(registerPageValidation.validateRegisterPageEmailTextFieldInvalidEmailAddressWithMissingTopLevelDomain(PropertyReaderOptimized.getExcelSheetValue(1,1),test),true);
            test.log(LogStatus.PASS,"All conditions are verified.");
        } catch (Error | Exception e) {
            test.log(LogStatus.FAIL,"All conditions aren't verified.");
            Assert.fail(String.valueOf(e.getStackTrace()));
            softAssert.assertAll();
        }
    }

    @Test(priority = 22)
    public void verifyRegisterPageEmailTextFieldInvalidEmailAddressWithTopLevelDomainWithTrailingDotFunctionality() throws IOException, InterruptedException {
        test=Reports.createTest(new Object() {}.getClass().getEnclosingMethod().getName(), reports);
        try {
            softAssert.assertEquals(registerPageValidation.validateRegisterPageEmailTextFieldInvalidEmailAddressWithTopLevelDomainWithTrailingDot(PropertyReaderOptimized.getExcelSheetValue(1,1),test),true);
            test.log(LogStatus.PASS,"All conditions are verified.");
        } catch (Error | Exception e) {
            test.log(LogStatus.FAIL,"All conditions aren't verified.");
            Assert.fail(String.valueOf(e.getStackTrace()));
            softAssert.assertAll();
        }
    }

    @Test(priority = 23)
    public void verifyRegisterPageEmailTextFieldInvalidEmailAddressValidationWithDoubleDotInDomainFunctionality() throws IOException, InterruptedException {
        test=Reports.createTest(new Object() {}.getClass().getEnclosingMethod().getName(), reports);
        try {
            softAssert.assertEquals(registerPageValidation.validateRegisterPageEmailTextFieldInvalidEmailAddressValidationWithDoubleDotInDomain(PropertyReaderOptimized.getExcelSheetValue(1,1),test),true);
            test.log(LogStatus.PASS,"All conditions are verified.");
        } catch (Error | Exception e) {
            test.log(LogStatus.FAIL,"All conditions aren't verified.");
            Assert.fail(String.valueOf(e.getStackTrace()));
            softAssert.assertAll();
        }
    }

    @Test(priority = 24)
    public void verifyRegisterPageEmailTextFieldInvalidEmailAddressValidationWithInvalidTopLevelDomainFunctionality() throws IOException, InterruptedException {
        test=Reports.createTest(new Object() {}.getClass().getEnclosingMethod().getName(), reports);
        try {
            softAssert.assertEquals(registerPageValidation.validateRegisterPageEmailTextFieldInvalidEmailAddressValidationWithInvalidTopLevelDomain(PropertyReaderOptimized.getExcelSheetValue(1,1),test),true);
            test.log(LogStatus.PASS,"All conditions are verified.");
        } catch (Error | Exception e) {
            test.log(LogStatus.FAIL,"All conditions aren't verified.");
            Assert.fail(String.valueOf(e.getStackTrace()));
            softAssert.assertAll();
        }
    }

    @Test(priority = 25)
    public void verifyRegisterPageEmailTextFieldInvalidEmailAddressValidationWithInvalidCharacterHasTagFunctionality() throws IOException, InterruptedException {
        test=Reports.createTest(new Object() {}.getClass().getEnclosingMethod().getName(), reports);
        try {
            softAssert.assertEquals(registerPageValidation.validateRegisterPageEmailTextFieldInvalidEmailAddressValidationWithInvalidCharacterHasTag(PropertyReaderOptimized.getExcelSheetValue(1,1),test),true);
            test.log(LogStatus.PASS,"All conditions are verified.");
        } catch (Error | Exception e) {
            test.log(LogStatus.FAIL,"All conditions aren't verified.");
            Assert.fail(String.valueOf(e.getStackTrace()));
            softAssert.assertAll();
        }
    }

    @Test(priority = 26)
    public void verifyRegisterPageEmailTextFieldInvalidEmailAddressValidationWithSemicolonInsteadOfDotFunctionality() throws IOException, InterruptedException {
        test=Reports.createTest(new Object() {}.getClass().getEnclosingMethod().getName(), reports);
        try {
            softAssert.assertEquals(registerPageValidation.validateRegisterPageEmailTextFieldInvalidEmailAddressValidationWithSemicolonInsteadOfDot(PropertyReaderOptimized.getExcelSheetValue(1,1),test),true);
            test.log(LogStatus.PASS,"All conditions are verified.");
        } catch (Error | Exception e) {
            test.log(LogStatus.FAIL,"All conditions aren't verified.");
            Assert.fail(String.valueOf(e.getStackTrace()));
            softAssert.assertAll();
        }
    }

    @Test(priority = 27)
    public void verifyRegisterPageEmailTextFieldInvalidEmailAddressValidationWithMissingUserNameFunctionality() throws IOException, InterruptedException {
        test=Reports.createTest(new Object() {}.getClass().getEnclosingMethod().getName(), reports);
        try {
            softAssert.assertEquals(registerPageValidation.validateRegisterPageEmailTextFieldInvalidEmailAddressValidationWithMissingUserName(PropertyReaderOptimized.getExcelSheetValue(1,1),test),true);
            test.log(LogStatus.PASS,"All conditions are verified.");
        } catch (Error | Exception e) {
            test.log(LogStatus.FAIL,"All conditions aren't verified.");
            Assert.fail(String.valueOf(e.getStackTrace()));
            softAssert.assertAll();
        }
    }

    @Test(priority = 28)
    public void verifyRegisterPageEmailTextFieldInvalidEmailAddressValidationWithMissingDomainNameFunctionality() throws IOException, InterruptedException {
        test=Reports.createTest(new Object() {}.getClass().getEnclosingMethod().getName(), reports);
        try {
            softAssert.assertEquals(registerPageValidation.validateRegisterPageEmailTextFieldInvalidEmailAddressValidationWithMissingDomainName(PropertyReaderOptimized.getExcelSheetValue(1,1),test),true);
            test.log(LogStatus.PASS,"All conditions are verified.");
        } catch (Error | Exception e) {
            test.log(LogStatus.FAIL,"All conditions aren't verified.");
            Assert.fail(String.valueOf(e.getStackTrace()));
            softAssert.assertAll();
        }
    }

    @Test(priority = 29)
    public void verifyRegisterPageEmailTextFieldInvalidEmailAddressValidationWithConsecutiveDotsInDomainFunctionality() throws IOException, InterruptedException {
        test=Reports.createTest(new Object() {}.getClass().getEnclosingMethod().getName(), reports);
        try {
            softAssert.assertEquals(registerPageValidation.validateRegisterPageEmailTextFieldInvalidEmailAddressValidationWithConsecutiveDotsInDomain(PropertyReaderOptimized.getExcelSheetValue(1,1),test),true);
            test.log(LogStatus.PASS,"All conditions are verified.");
        } catch (Error | Exception e) {
            test.log(LogStatus.FAIL,"All conditions aren't verified.");
            Assert.fail(String.valueOf(e.getStackTrace()));
            softAssert.assertAll();
        }
    }

    @Test(priority = 30)
    public void verifyRegisterPageEmailTextFieldInvalidEmailAddressValidationWithMissingDotBetweenDomainAndTopLevelDomainFunctionality() throws IOException, InterruptedException {
        test=Reports.createTest(new Object() {}.getClass().getEnclosingMethod().getName(), reports);
        try {
            softAssert.assertEquals(registerPageValidation.validateRegisterPageEmailTextFieldInvalidEmailAddressValidationWithMissingDotBetweenDomainAndTopLevelDomain(PropertyReaderOptimized.getExcelSheetValue(1,1),test),true);
            test.log(LogStatus.PASS,"All conditions are verified.");
        } catch (Error | Exception e) {
            test.log(LogStatus.FAIL,"All conditions aren't verified.");
            Assert.fail(String.valueOf(e.getStackTrace()));
            softAssert.assertAll();
        }
    }

    @Test(priority = 31)
    public void verifyRegisterPageEmailTextFieldInvalidEmailAddressValidationWithMultipleConsecutiveDotsFunctionality() throws IOException, InterruptedException {
        test=Reports.createTest(new Object() {}.getClass().getEnclosingMethod().getName(), reports);
        try {
            softAssert.assertEquals(registerPageValidation.validateRegisterPageEmailTextFieldInvalidEmailAddressValidationWithMultipleConsecutiveDots(PropertyReaderOptimized.getExcelSheetValue(1,1),test),true);
            test.log(LogStatus.PASS,"All conditions are verified.");
        } catch (Error | Exception e) {
            test.log(LogStatus.FAIL,"All conditions aren't verified.");
            Assert.fail(String.valueOf(e.getStackTrace()));
            softAssert.assertAll();
        }
    }

    @Test(priority = 32)
    public void verifyRegisterPageEmailTextFieldInvalidEmailAddressValidationWithUnderScoreInDomainFunctionality() throws IOException, InterruptedException {
        test=Reports.createTest(new Object() {}.getClass().getEnclosingMethod().getName(), reports);
        try {
            softAssert.assertEquals(registerPageValidation.validateRegisterPageEmailTextFieldInvalidEmailAddressValidationWithUnderScoreInDomain(PropertyReaderOptimized.getExcelSheetValue(1,1),test),true);
            test.log(LogStatus.PASS,"All conditions are verified.");
        } catch (Error | Exception e) {
            test.log(LogStatus.FAIL,"All conditions aren't verified.");
            Assert.fail(String.valueOf(e.getStackTrace()));
            softAssert.assertAll();
        }
    }

    @Test(priority = 33)
    public void verifyRegisterPageEmailTextFieldInvalidEmailAddressValidationWithMissingDotBeforeTopLevelDomainFunctionality() throws IOException, InterruptedException {
        test=Reports.createTest(new Object() {}.getClass().getEnclosingMethod().getName(), reports);
        try {
            softAssert.assertEquals(registerPageValidation.validateRegisterPageEmailTextFieldInvalidEmailAddressValidationWithMissingDotBeforeTopLevelDomain(PropertyReaderOptimized.getExcelSheetValue(1,1),test),true);
            test.log(LogStatus.PASS,"All conditions are verified.");
        } catch (Error | Exception e) {
            test.log(LogStatus.FAIL,"All conditions aren't verified.");
            Assert.fail(String.valueOf(e.getStackTrace()));
            softAssert.assertAll();
        }
    }

    @Test(priority = 34)
    public void verifyRegisterPageEmailTextFieldInvalidEmailAddressValidationWithExclamationMarkInDomainFunctionality() throws IOException, InterruptedException {
        test=Reports.createTest(new Object() {}.getClass().getEnclosingMethod().getName(), reports);
        try {
            softAssert.assertEquals(registerPageValidation.validateRegisterPageEmailTextFieldInvalidEmailAddressValidationWithExclamationMarkInDomain(PropertyReaderOptimized.getExcelSheetValue(1,1),test),true);
            test.log(LogStatus.PASS,"All conditions are verified.");
        } catch (Error | Exception e) {
            test.log(LogStatus.FAIL,"All conditions aren't verified.");
            Assert.fail(String.valueOf(e.getStackTrace()));
            softAssert.assertAll();
        }
    }

    @Test(priority = 35)
    public void verifyRegisterPageEmailTextFieldInvalidEmailAddressValidationWithHyphenAtTheBeginningOfDomainFunctionality() throws IOException, InterruptedException {
        test=Reports.createTest(new Object() {}.getClass().getEnclosingMethod().getName(), reports);
        try {
            softAssert.assertEquals(registerPageValidation.validateRegisterPageEmailTextFieldInvalidEmailAddressValidationWithHyphenAtTheBeginningOfDomain(PropertyReaderOptimized.getExcelSheetValue(1,1),test),true);
            test.log(LogStatus.PASS,"All conditions are verified.");
        } catch (Error | Exception e) {
            test.log(LogStatus.FAIL,"All conditions aren't verified.");
            Assert.fail(String.valueOf(e.getStackTrace()));
            softAssert.assertAll();
        }
    }

    @Test(priority = 36)
    public void verifyRegisterPageEmailTextFieldInvalidEmailAddressValidationWithHyphenAtTheEndOfDomainFunctionality() throws IOException, InterruptedException {
        test=Reports.createTest(new Object() {}.getClass().getEnclosingMethod().getName(), reports);
        try {
            softAssert.assertEquals(registerPageValidation.validateRegisterPageEmailTextFieldInvalidEmailAddressValidationWithHyphenAtTheEndOfDomain(PropertyReaderOptimized.getExcelSheetValue(1,1),test),true);
            test.log(LogStatus.PASS,"All conditions are verified.");
        } catch (Error | Exception e) {
            test.log(LogStatus.FAIL,"All conditions aren't verified.");
            Assert.fail(String.valueOf(e.getStackTrace()));
            softAssert.assertAll();
        }
    }

    @Test(priority = 37)
    public void verifyRegisterPageEmailTextFieldInvalidEmailAddressValidationWithTrailingDotAfterTopLevelDomainFunctionality() throws IOException, InterruptedException {
        test=Reports.createTest(new Object() {}.getClass().getEnclosingMethod().getName(), reports);
        try {
            softAssert.assertEquals(registerPageValidation.validateRegisterPageEmailTextFieldInvalidEmailAddressValidationWithTrailingDotAfterTopLevelDomain(PropertyReaderOptimized.getExcelSheetValue(1,1),test),true);
            test.log(LogStatus.PASS,"All conditions are verified.");
        } catch (Error | Exception e) {
            test.log(LogStatus.FAIL,"All conditions aren't verified.");
            Assert.fail(String.valueOf(e.getStackTrace()));
            softAssert.assertAll();
        }
    }

    @Test(priority = 38)
    public void verifyRegisterPageEmailTextFieldInvalidEmailAddressValidationWithMissingTopLevelDomainFunctionality() throws IOException, InterruptedException {
        test=Reports.createTest(new Object() {}.getClass().getEnclosingMethod().getName(), reports);
        try {
            softAssert.assertEquals(registerPageValidation.validateRegisterPageEmailTextFieldInvalidEmailAddressValidationWithMissingTopLevelDomain(PropertyReaderOptimized.getExcelSheetValue(1,1),test),true);
            test.log(LogStatus.PASS,"All conditions are verified.");
        } catch (Error | Exception e) {
            test.log(LogStatus.FAIL,"All conditions aren't verified.");
            Assert.fail(String.valueOf(e.getStackTrace()));
            softAssert.assertAll();
        }
    }

    @Test(priority = 39)
    public void verifyRegisterPageEmailTextFieldInvalidEmailAddressValidationWithCommaInsteadOfDotFunctionality() throws IOException, InterruptedException {
        test=Reports.createTest(new Object() {}.getClass().getEnclosingMethod().getName(), reports);
        try {
            softAssert.assertEquals(registerPageValidation.validateRegisterPageEmailTextFieldInvalidEmailAddressValidationWithCommaInsteadOfDot(PropertyReaderOptimized.getExcelSheetValue(1,1),test),true);
            test.log(LogStatus.PASS,"All conditions are verified.");
        } catch (Error | Exception e) {
            test.log(LogStatus.FAIL,"All conditions aren't verified.");
            Assert.fail(String.valueOf(e.getStackTrace()));
            softAssert.assertAll();
        }
    }

    @Test(priority = 40)
    public void verifyRegisterPageEmailTextFieldInvalidEmailAddressValidationWithSlashInsteadOfDotFunctionality() throws IOException, InterruptedException {
        test=Reports.createTest(new Object() {}.getClass().getEnclosingMethod().getName(), reports);
        try {
            softAssert.assertEquals(registerPageValidation.validateRegisterPageEmailTextFieldInvalidEmailAddressValidationWithSlashInsteadOfDot(PropertyReaderOptimized.getExcelSheetValue(1,1),test),true);
            test.log(LogStatus.PASS,"All conditions are verified.");
        } catch (Error | Exception e) {
            test.log(LogStatus.FAIL,"All conditions aren't verified.");
            Assert.fail(String.valueOf(e.getStackTrace()));
            softAssert.assertAll();
        }
    }

    @Test(priority = 41)
    public void verifyRegisterPageEmailTextFieldInvalidEmailAddressValidationWithBackSlashInsteadOfDotFunctionality() throws IOException, InterruptedException {
        test=Reports.createTest(new Object() {}.getClass().getEnclosingMethod().getName(), reports);
        try {
            softAssert.assertEquals(registerPageValidation.validateRegisterPageEmailTextFieldInvalidEmailAddressValidationWithBackSlashInsteadOfDot(PropertyReaderOptimized.getExcelSheetValue(1,1),test),true);
            test.log(LogStatus.PASS,"All conditions are verified.");
        } catch (Error | Exception e) {
            test.log(LogStatus.FAIL,"All conditions aren't verified.");
            Assert.fail(String.valueOf(e.getStackTrace()));
            softAssert.assertAll();
        }
    }

    @Test(priority = 42)
    public void verifyRegisterPageEmailTextFieldInvalidEmailAddressValidationWithHashSymbolInsteadOfDotFunctionality() throws IOException, InterruptedException {
        test=Reports.createTest(new Object() {}.getClass().getEnclosingMethod().getName(), reports);
        try {
            softAssert.assertEquals(registerPageValidation.validateRegisterPageEmailTextFieldInvalidEmailAddressValidationWithHashSymbolInsteadOfDot(PropertyReaderOptimized.getExcelSheetValue(1,1),test),true);
            test.log(LogStatus.PASS,"All conditions are verified.");
        } catch (Error | Exception e) {
            test.log(LogStatus.FAIL,"All conditions aren't verified.");
            Assert.fail(String.valueOf(e.getStackTrace()));
            softAssert.assertAll();
        }
    }

    @Test(priority = 43)
    public void verifyRegisterPageEmailTextFieldInvalidEmailAddressValidationWithOpeningParenthesisInsteadOfDotFunctionality() throws IOException, InterruptedException {
        test=Reports.createTest(new Object() {}.getClass().getEnclosingMethod().getName(), reports);
        try {
            softAssert.assertEquals(registerPageValidation.validateRegisterPageEmailTextFieldInvalidEmailAddressValidationWithOpeningParenthesisInsteadOfDot(PropertyReaderOptimized.getExcelSheetValue(1,1),test),true);
            test.log(LogStatus.PASS,"All conditions are verified.");
        } catch (Error | Exception e) {
            test.log(LogStatus.FAIL,"All conditions aren't verified.");
            Assert.fail(String.valueOf(e.getStackTrace()));
            softAssert.assertAll();
        }
    }

    @Test(priority = 44)
    public void verifyRegisterPageEmailTextFieldInvalidEmailAddressValidationWithClosingParenthesisInsteadOfDotFunctionality() throws IOException, InterruptedException {
        test=Reports.createTest(new Object() {}.getClass().getEnclosingMethod().getName(), reports);
        try {
            softAssert.assertEquals(registerPageValidation.validateRegisterPageEmailTextFieldInvalidEmailAddressValidationWithClosingParenthesisInsteadOfDot(PropertyReaderOptimized.getExcelSheetValue(1,1),test),true);
            test.log(LogStatus.PASS,"All conditions are verified.");
        } catch (Error | Exception e) {
            test.log(LogStatus.FAIL,"All conditions aren't verified.");
            Assert.fail(String.valueOf(e.getStackTrace()));
            softAssert.assertAll();
        }
    }

    @Test(priority = 45)
    public void verifyRegisterPageEmailTextFieldInvalidEmailAddressValidationWithApostropheInsteadOfDotFunctionality() throws IOException, InterruptedException {
        test=Reports.createTest(new Object() {}.getClass().getEnclosingMethod().getName(), reports);
        try {
            softAssert.assertEquals(registerPageValidation.validateRegisterPageEmailTextFieldInvalidEmailAddressValidationWithApostropheInsteadOfDot(PropertyReaderOptimized.getExcelSheetValue(1,1),test),true);
            test.log(LogStatus.PASS,"All conditions are verified.");
        } catch (Error | Exception e) {
            test.log(LogStatus.FAIL,"All conditions aren't verified.");
            Assert.fail(String.valueOf(e.getStackTrace()));
            softAssert.assertAll();
        }
    }

    @Test(priority = 46)
    public void verifyRegisterPageEmailTextFieldInvalidEmailAddressValidationWithQuotationMarkInsteadOfDotFunctionality() throws IOException, InterruptedException {
        test=Reports.createTest(new Object() {}.getClass().getEnclosingMethod().getName(), reports);
        try {
            softAssert.assertEquals(registerPageValidation.validateRegisterPageEmailTextFieldInvalidEmailAddressValidationWithQuotationMarkInsteadOfDot(PropertyReaderOptimized.getExcelSheetValue(1,1),test),true);
            test.log(LogStatus.PASS,"All conditions are verified.");
        } catch (Error | Exception e) {
            test.log(LogStatus.FAIL,"All conditions aren't verified.");
            Assert.fail(String.valueOf(e.getStackTrace()));
            softAssert.assertAll();
        }
    }

    @Test(priority = 47)
    public void verifyRegisterPagePasswordTextFieldValidationWithMissingAlphabetFunctionality() throws IOException, InterruptedException {
        test=Reports.createTest(new Object() {}.getClass().getEnclosingMethod().getName(), reports);
        try {
            softAssert.assertEquals(registerPageValidation.validateRegisterPagePasswordTextFieldValidationWithMissingAlphabet(PropertyReaderOptimized.getExcelSheetValue(23,1),test),true);
            test.log(LogStatus.PASS,"All conditions are verified.");
        } catch (Error | Exception e) {
            test.log(LogStatus.FAIL,"All conditions aren't verified.");
            Assert.fail(String.valueOf(e.getStackTrace()));
            softAssert.assertAll();
        }
    }

    @Test(priority = 48)
    public void verifyRegisterPagePasswordTextFieldWithLessThanEightCharactersFunctionality() throws IOException, InterruptedException {
        test=Reports.createTest(new Object() {}.getClass().getEnclosingMethod().getName(), reports);
        try {
            softAssert.assertEquals(registerPageValidation.validateRegisterPagePasswordTextFieldWithLessThanEightCharacters(PropertyReaderOptimized.getExcelSheetValue(23,1),test),true);
            test.log(LogStatus.PASS,"All conditions are verified.");
        } catch (Error | Exception e) {
            test.log(LogStatus.FAIL,"All conditions aren't verified.");
            Assert.fail(String.valueOf(e.getStackTrace()));
            softAssert.assertAll();
        }
    }

    @Test(priority = 49)
    public void verifyRegisterPagePasswordTextFieldWithMissingNumberFunctionality() throws IOException, InterruptedException {
        test=Reports.createTest(new Object() {}.getClass().getEnclosingMethod().getName(), reports);
        try {
            softAssert.assertEquals(registerPageValidation.validateRegisterPagePasswordTextFieldWithMissingNumber(PropertyReaderOptimized.getExcelSheetValue(23,1),test),true);
            test.log(LogStatus.PASS,"All conditions are verified.");
        } catch (Error | Exception e) {
            test.log(LogStatus.FAIL,"All conditions aren't verified.");
            Assert.fail(String.valueOf(e.getStackTrace()));
            softAssert.assertAll();
        }
    }

    @Test(priority = 50)
    public void verifyRegisterPagePasswordTextFieldWithMissingUpperCaseLetterFunctionality() throws IOException, InterruptedException {
        test=Reports.createTest(new Object() {}.getClass().getEnclosingMethod().getName(), reports);
        try {
            softAssert.assertEquals(registerPageValidation.validateRegisterPagePasswordTextFieldWithMissingUpperCaseLetter(PropertyReaderOptimized.getExcelSheetValue(23,1),test),true);
            test.log(LogStatus.PASS,"All conditions are verified.");
        } catch (Error | Exception e) {
            test.log(LogStatus.FAIL,"All conditions aren't verified.");
            Assert.fail(String.valueOf(e.getStackTrace()));
            softAssert.assertAll();
        }
    }

    @Test(priority = 51)
    public void verifyRegisterPagePasswordTextFieldWithMissingLowercaseLetterFunctionality() throws IOException, InterruptedException {
        test=Reports.createTest(new Object() {}.getClass().getEnclosingMethod().getName(), reports);
        try {
            softAssert.assertEquals(registerPageValidation.validateRegisterPagePasswordTextFieldWithMissingLowercaseLetter(PropertyReaderOptimized.getExcelSheetValue(23,1),test),true);
            test.log(LogStatus.PASS,"All conditions are verified.");
        } catch (Error | Exception e) {
            test.log(LogStatus.FAIL,"All conditions aren't verified.");
            Assert.fail(String.valueOf(e.getStackTrace()));
            softAssert.assertAll();
        }
    }

    @Test(priority = 52)
    public void verifyRegisterPagePasswordTextFieldWithMissingSpecialCharacterFunctionality() throws IOException, InterruptedException {
        test=Reports.createTest(new Object() {}.getClass().getEnclosingMethod().getName(), reports);
        try {
            softAssert.assertEquals(registerPageValidation.validateRegisterPagePasswordTextFieldWithMissingSpecialCharacter(PropertyReaderOptimized.getExcelSheetValue(23,1),test),true);
            test.log(LogStatus.PASS,"All conditions are verified.");
        } catch (Error | Exception e) {
            test.log(LogStatus.FAIL,"All conditions aren't verified.");
            Assert.fail(String.valueOf(e.getStackTrace()));
            softAssert.assertAll();
        }
    }

    @Test(priority = 53)
    public void verifyRegisterPageConfirmPasswordMustMatchValidationFunctionality() throws IOException, InterruptedException {
        test=Reports.createTest(new Object() {}.getClass().getEnclosingMethod().getName(), reports);
        try {
            softAssert.assertEquals(registerPageValidation.validateRegisterPageConfirmPasswordMustMatchValidation(PropertyReaderOptimized.getExcelSheetValue(26, 4),test),true);
            test.log(LogStatus.PASS,"All conditions are verified.");
        } catch (Error | Exception e) {
            test.log(LogStatus.FAIL,"All conditions aren't verified.");
            Assert.fail(String.valueOf(e.getStackTrace()));
            softAssert.assertAll();
        }
    }

    @Test(priority = 54)
    public void verifyRegisterPagePhoneNumberRequiredValidationFunctionality() throws IOException, InterruptedException {
        test=Reports.createTest(new Object() {}.getClass().getEnclosingMethod().getName(), reports);
        try {
            softAssert.assertEquals(registerPageValidation.validateRegisterPagePhoneNumberRequiredValidation(PropertyReaderOptimized.getExcelSheetValue(25,1),test),true);
            test.log(LogStatus.PASS,"All conditions are verified.");
        } catch (Error | Exception e) {
            test.log(LogStatus.FAIL,"All conditions aren't verified.");
            Assert.fail(String.valueOf(e.getStackTrace()));
            softAssert.assertAll();
        }
    }

    @Test(priority = 55)
    public void verifyRegisterPageExistPhoneNumberErrorMsgFunctionality() throws IOException, InterruptedException {
        test=Reports.createTest(new Object() {}.getClass().getEnclosingMethod().getName(), reports);
        try {
            softAssert.assertEquals(registerPageValidation.validateRegisterPageExistPhoneNumberErrorMsg(PropertyReaderOptimized.getExcelSheetValue(28,1),test),true);
            test.log(LogStatus.PASS,"All conditions are verified.");
        } catch (Error | Exception e) {
            test.log(LogStatus.FAIL,"All conditions aren't verified.");
            Assert.fail(String.valueOf(e.getStackTrace()));
            softAssert.assertAll();
        }
    }

    @Test(priority = 56)
    public void verifyRegisterPageInvalidPhoneNumberValidationFunctionality() throws IOException, InterruptedException {
        test=Reports.createTest(new Object() {}.getClass().getEnclosingMethod().getName(), reports);
        try {
            softAssert.assertEquals(registerPageValidation.validateRegisterPageInvalidPhoneNumberValidation(PropertyReaderOptimized.getExcelSheetValue(29,1),test),true);
            test.log(LogStatus.PASS,"All conditions are verified.");
        } catch (Error | Exception e) {
            test.log(LogStatus.FAIL,"All conditions aren't verified.");
            Assert.fail(String.valueOf(e.getStackTrace()));
            softAssert.assertAll();
        }
    }

    @Test(priority = 57)
    public void verifyRegisterPageRequiredOtpValidationFunctionality() throws IOException, InterruptedException {
        test=Reports.createTest(new Object() {}.getClass().getEnclosingMethod().getName(), reports);
        try {
            softAssert.assertEquals(registerPageValidation.validateRegisterPageRequiredOtpValidation(PropertyReaderOptimized.getExcelSheetValue(26,1),test),true);
            test.log(LogStatus.PASS,"All conditions are verified.");
        } catch (Error | Exception e) {
            test.log(LogStatus.FAIL,"All conditions aren't verified.");
            Assert.fail(String.valueOf(e.getStackTrace()));
            softAssert.assertAll();
        }
    }

    @Test(priority = 58)
    public void verifyRegisterPageInvalidOtpValidationFunctionality() throws IOException, InterruptedException {
        test=Reports.createTest(new Object() {}.getClass().getEnclosingMethod().getName(), reports);
        try {
            softAssert.assertEquals(registerPageValidation.validateRegisterPageInvalidOtpValidation(PropertyReaderOptimized.getExcelSheetValue(27,1),test),true);
            test.log(LogStatus.PASS,"All conditions are verified.");
        } catch (Error | Exception e) {
            test.log(LogStatus.FAIL,"All conditions aren't verified.");
            Assert.fail(String.valueOf(e.getStackTrace()));
            softAssert.assertAll();
        }
    }
}
