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

WebUI.verifyElementText(findTestObject('Object Repository/MotCheckValid/Page_Check the MOT status of a vehicle - GOV.UK/h1_Check the MOT status of a vehicle'), 
    'Check the MOT status of a vehicle')

WebUI.click(findTestObject('Object Repository/MotCheckValid/Page_Check the MOT status of a vehicle - GOV.UK/a_Start now'))

WebUI.setText(findTestObject('Object Repository/MotCheckValid/Page_Enter the registration number of the v_f11e46/input_For example, CU57ABC_wizard_vehicle_e_5f97e0'), 
    'YY55UVA')

WebUI.verifyElementText(findTestObject('Object Repository/MotCheckValid/Page_Enter the registration number of the v_f11e46/h1_Enter the registration number of the vehicle'), 
    'Enter the registration number of the vehicle')

WebUI.click(findTestObject('Object Repository/MotCheckValid/Page_Enter the registration number of the v_f11e46/button_Continue'))

WebUI.verifyElementText(findTestObject('Object Repository/MotCheckValid/Page_Is this the vehicle you are looking fo_014a96/h1_Is this the vehicle you are looking for'), 
    'Is this the vehicle you are looking for?')

WebUI.click(findTestObject('Object Repository/MotCheckValid/Page_Is this the vehicle you are looking fo_014a96/input_Is this the vehicle you are looking f_9db174'))

WebUI.click(findTestObject('Object Repository/MotCheckValid/Page_Is this the vehicle you are looking fo_014a96/button_Continue'))

WebUI.verifyElementText(findTestObject('Object Repository/MotCheckValid/Page_Vehicle Tax and MOT status results - C_780b1e/span_YY55 UVA'), 
    'YY55 UVA')

WebUI.verifyElementVisible(findTestObject('Page_Vehicle Tax and MOT status results - Check if a vehicle is taxed and has an MOT - GOV.UK/h2_TaxedVehicle YY55UVA is Taxed'))

WebUI.verifyElementVisible(findTestObject('Page_Vehicle Tax and MOT status results - Check if a vehicle is taxed and has an MOT - GOV.UK/h2_MOTVehicle YY55UVA has a valid MOT certificate'))

WebUI.verifyElementText(findTestObject('Object Repository/MotCheckValid/Page_Vehicle Tax and MOT status results - C_780b1e/dd_MAZDA'), 
    'MAZDA')

WebUI.verifyElementText(findTestObject('Object Repository/MotCheckValid/Page_Vehicle Tax and MOT status results - C_780b1e/dd_2006'), 
    '2006')

WebUI.verifyElementText(findTestObject('Object Repository/MotCheckValid/Page_Vehicle Tax and MOT status results - C_780b1e/dd_PETROL'), 
    'PETROL')

WebUI.verifyElementText(findTestObject('Object Repository/MotCheckValid/Page_Vehicle Tax and MOT status results - C_780b1e/dd_BLACK'), 
    'BLACK')

WebUI.verifyElementText(findTestObject('Object Repository/MotCheckValid/Page_Vehicle Tax and MOT status results - C_780b1e/dd_2 AXLE RIGID BODY'), 
    '2 AXLE RIGID BODY')

WebUI.click(findTestObject('Object Repository/MotCheckValid/Page_Vehicle Tax and MOT status results - C_780b1e/a_Return to GOV.UK'))

WebUI.verifyElementText(findTestObject('Object Repository/MotCheckValid/Page_Give feedback on Check if a vehicle is_45d2b8/h1_Give feedback on Check if a vehicle is taxed'), 
    'Give feedback on Check if a vehicle is taxed')

WebUI.click(findTestObject('Object Repository/MotCheckValid/Page_Give feedback on Check if a vehicle is_45d2b8/input_Overall, how did you feel about the s_523edc'))

WebUI.setText(findTestObject('Object Repository/MotCheckValid/Page_Give feedback on Check if a vehicle is_45d2b8/textarea_How could we improve this service__e984b6'), 
    'N/A')

WebUI.click(findTestObject('Object Repository/MotCheckValid/Page_Give feedback on Check if a vehicle is_45d2b8/button_Send feedback'))

WebUI.verifyElementPresent(findTestObject('Object Repository/MotCheckValid/Page_Thank you for contacting GOV.UK - GOV.UK/h1_Thank you for contacting GOV.UK'), 
    0)

WebUI.click(findTestObject('Object Repository/MotCheckValid/Page_Thank you for contacting GOV.UK - GOV.UK/a_Return to the GOV.UK home page'))

WebUI.verifyElementText(findTestObject('Object Repository/MotCheckValid/Page_Welcome to GOV.UK/span_The best place to find government serv_4536c5'), 
    'The best place to find government services and information')

WebUI.closeBrowser()

