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

WebUI.navigateToUrl('https://rahulshettyacademy.com/seleniumPractise/#/')

WebUI.setText(findTestObject('Object Repository/Page_GreenKart - veg and fruits kart/input_KART_search-keyword (1)'), 'carrot')

WebUI.click(findTestObject('Object Repository/Page_GreenKart - veg and fruits kart/a_'))

WebUI.click(findTestObject('Object Repository/Page_GreenKart - veg and fruits kart/button_ADD TO CART (1)'))

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/Page_GreenKart - veg and fruits kart/input_KART_search-keyword (1)'), 'Tom')

WebUI.click(findTestObject('Object Repository/Page_GreenKart - veg and fruits kart/header_GREENKARTLimited offer - FREE Core J_9f8137'))

WebUI.click(findTestObject('Object Repository/Page_GreenKart - veg and fruits kart/img (1)'))

WebUI.click(findTestObject('Object Repository/Page_GreenKart - veg and fruits kart/div_Tomato - 1 Kg16'))

WebUI.click(findTestObject('Object Repository/Page_GreenKart - veg and fruits kart/button_ADD TO CART (1)'))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Page_GreenKart - veg and fruits kart/input_KART_search-keyword (1)'), 'cucu')

WebUI.click(findTestObject('Object Repository/Page_GreenKart - veg and fruits kart/a_'))

WebUI.click(findTestObject('Object Repository/Page_GreenKart - veg and fruits kart/button_ADD TO CART (1)'))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Page_GreenKart - veg and fruits kart/input_KART_search-keyword (1)'), 'pot')

WebUI.click(findTestObject('Object Repository/Page_GreenKart - veg and fruits kart/a_'))

WebUI.click(findTestObject('Object Repository/Page_GreenKart - veg and fruits kart/button_ADD TO CART (1)'))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Page_GreenKart - veg and fruits kart/input_KART_search-keyword (1)'), 'man')

WebUI.click(findTestObject('Object Repository/Page_GreenKart - veg and fruits kart/a_'))

WebUI.click(findTestObject('Object Repository/Page_GreenKart - veg and fruits kart/button_ADD TO CART (1)'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_GreenKart - veg and fruits kart/img_1 (1)'))

WebUI.click(findTestObject('Object Repository/Page_GreenKart - veg and fruits kart/button_PROCEED TO CHECKOUT'))

WebUI.click(findTestObject('Object Repository/Page_GreenKart - veg and fruits kart/button_Place Order'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_GreenKart - veg and fruits kart/select_SelectAfghanistanAlbaniaAlgeriaAndor_973f8b'), 
    'Nigeria', true)

WebUI.click(findTestObject('Object Repository/Page_GreenKart - veg and fruits kart/input_Choose Country_chkAgree'))

WebUI.click(findTestObject('Object Repository/Page_GreenKart - veg and fruits kart/button_Proceed'))

WebUI.doubleClick(findTestObject('Page_GreenKart - veg and fruits kart/span_Thank you, your order has been placed _cef5f0'))

WebUI.closeBrowser()

