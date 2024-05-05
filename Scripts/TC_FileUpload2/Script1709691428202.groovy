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

WebUI.navigateToUrl('https://www.dia-pen.hr/orbicon/3rdParty/rad-plus/test.html')

WebUI.verifyElementText(findTestObject('Object Repository/Page_File Upload Tester/h1_File Upload Test'), 'File Upload Test')

WebUI.uploadFile(findTestObject('OR_FileUpload2/Page_File Upload Tester/input_man CGI_userfile0'), 'C:\\Users\\olaol\\Katalon Studio\\Katalon_Auto_Framework\\Data\\KatalonFile.txt')

WebUI.uploadFile(findTestObject('OR_FileUpload2/Page_File Upload Tester/input_man CGI_userfile1'), 'C:\\Users\\olaol\\Katalon Studio\\Katalon_Auto_Framework\\Data\\KatalonDoc.docx')

WebUI.uploadFile(findTestObject('OR_FileUpload2/Page_File Upload Tester/input_man CGI_userfile2'), 'C:\\Users\\olaol\\Katalon Studio\\Katalon_Auto_Framework\\Data\\KataExcelFile.xlsx')

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_File Upload Tester/input_man CGI_userfile0'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Rad Upload Plus/font_Files Uploaded'), 'Files Uploaded')

WebUI.closeBrowser()

