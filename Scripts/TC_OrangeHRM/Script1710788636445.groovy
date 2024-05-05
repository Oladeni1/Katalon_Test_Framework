import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl(BaseUrl)

WebUI.maximizeWindow()

WebUI.verifyElementText(findTestObject('Object Repository/OrangeHRM_OR/Page_OrangeHRM/h5_Login'), 'Login')

WebUI.setText(findTestObject('Object Repository/OrangeHRM_OR/Page_OrangeHRM/input_Username_username'), UserName)

WebUI.setEncryptedText(findTestObject('Object Repository/OrangeHRM_OR/Page_OrangeHRM/input_Password_password'), PassWord)

WebUI.click(findTestObject('Object Repository/OrangeHRM_OR/Page_OrangeHRM/button_Login'))

WebUI.verifyElementText(findTestObject('Object Repository/OrangeHRM_OR/Page_OrangeHRM/h6_Dashboard'), 'Dashboard')

WebUI.click(findTestObject('Object Repository/OrangeHRM_OR/Page_OrangeHRM/span_Admin'))

WebUI.setText(findTestObject('Object Repository/OrangeHRM_OR/Page_OrangeHRM/input_Username_oxd-input oxd-input--focus'), 
    UserName)

WebUI.click(findTestObject('Object Repository/OrangeHRM_OR/Page_OrangeHRM/span_Performance'))

WebUI.verifyElementText(findTestObject('Object Repository/OrangeHRM_OR/Page_OrangeHRM/h5_Employee Reviews'), 'Employee Reviews')

WebUI.click(findTestObject('Object Repository/OrangeHRM_OR/Page_OrangeHRM/span_Recruitment'))

WebUI.verifyElementText(findTestObject('Object Repository/OrangeHRM_OR/Page_OrangeHRM/h5_Candidates'), 'Candidates')

WebUI.click(findTestObject('Object Repository/OrangeHRM_OR/Page_OrangeHRM/span_Dashboard'))

WebUI.click(findTestObject('Object Repository/OrangeHRM_OR/Page_OrangeHRM/span_Maintenance'))

WebUI.setEncryptedText(findTestObject('Object Repository/OrangeHRM_OR/Page_OrangeHRM/input_Password_password_1'), PassWord)

WebUI.click(findTestObject('Object Repository/OrangeHRM_OR/Page_OrangeHRM/button_Confirm'))

WebUI.verifyElementText(findTestObject('Object Repository/OrangeHRM_OR/Page_OrangeHRM/h6_Purge Employee Records'), 'Purge Employee Records')

WebUI.closeBrowser()

