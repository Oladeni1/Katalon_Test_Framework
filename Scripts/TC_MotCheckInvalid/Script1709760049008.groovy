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

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://www.gov.uk/check-mot-status')

WebUI.verifyElementText(findTestObject('Object Repository/MotCheckInvalid/Page_Check the MOT status of a vehicle - GOV.UK/h1_Check the MOT status of a vehicle'), 
    'Check the MOT status of a vehicle')

WebUI.click(findTestObject('Object Repository/MotCheckInvalid/Page_Check the MOT status of a vehicle - GOV.UK/a_Start now'))

WebUI.click(findTestObject('Object Repository/MotCheckInvalid/Page_Enter the registration number of the v_f11e46/input_For example, CU57ABC_wizard_vehicle_e_5f97e0'))

WebUI.verifyElementText(findTestObject('Object Repository/MotCheckInvalid/Page_Enter the registration number of the v_f11e46/h1_Enter the registration number of the vehicle'), 
    'Enter the registration number of the vehicle')

WebUI.setText(findTestObject('Object Repository/MotCheckInvalid/Page_Enter the registration number of the v_f11e46/input_For example, CU57ABC_wizard_vehicle_e_5f97e0'), 
    'CU57ABC')

WebUI.click(findTestObject('Object Repository/MotCheckInvalid/Page_Enter the registration number of the v_f11e46/button_Continue'))

WebUI.verifyElementText(findTestObject('Object Repository/MotCheckInvalid/Page_Vehicle details could not be found - C_afa424/h1_Vehicle details could not be found'), 
    'Vehicle details could not be found')

WebUI.click(findTestObject('Object Repository/MotCheckInvalid/Page_Vehicle details could not be found - C_afa424/a_Return to GOV.UK'))

WebUI.verifyElementText(findTestObject('Object Repository/MotCheckInvalid/Page_Give feedback on Check if a vehicle is_45d2b8/h1_Give feedback on Check if a vehicle is taxed'), 
    'Give feedback on Check if a vehicle is taxed')

WebUI.click(findTestObject('Object Repository/MotCheckInvalid/Page_Give feedback on Check if a vehicle is_45d2b8/input_Very satisfied_service_feedbackservic_aa5eb8'))

WebUI.verifyElementText(findTestObject('Object Repository/MotCheckInvalid/Page_Give feedback on Check if a vehicle is_45d2b8/label_How could we improve this service'), 
    'How could we improve this service?')

WebUI.setText(findTestObject('Object Repository/MotCheckInvalid/Page_Give feedback on Check if a vehicle is_45d2b8/textarea_How could we improve this service__e984b6'), 
    'Testing......')

WebUI.click(findTestObject('Object Repository/MotCheckInvalid/Page_Give feedback on Check if a vehicle is_45d2b8/button_Send feedback'))

WebUI.verifyElementText(findTestObject('Object Repository/MotCheckInvalid/Page_Thank you for contacting GOV.UK - GOV.UK/h1_Thank you for contacting GOV.UK'), 
    'Thank you for contacting GOV.UK')

WebUI.closeBrowser()

