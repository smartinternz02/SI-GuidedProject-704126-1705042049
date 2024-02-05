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

WebUI.navigateToUrl('https://www.amazon.in/')

WebUI.doubleClick(findTestObject('Amazon Login Page/Validate_Amazon_NewUser_Reg_Page_006/Page_Online Shopping site in India Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in/a_Hello, sign in  Account  Lists'))

WebUI.click(findTestObject('Amazon Login Page/Validate_Amazon_NewUser_Reg_Page_006/Page_Amazon Sign In/a_Create your Amazon account'))

WebUI.setText(findTestObject('Amazon Login Page/Validate_Amazon_NewUser_Reg_Page_006/Page_Amazon Registration/input_Your name_customerName'), 
    GlobalVariable.Username)

WebUI.setText(findTestObject('Amazon Login Page/Validate_Amazon_NewUser_Reg_Page_006/Page_Amazon Registration/input_mobileNumber'), 
    GlobalVariable.MobileNumber)

WebUI.setText(findTestObject('Amazon Login Page/Validate_Amazon_NewUser_Reg_Page_006/Page_Amazon Registration/input_Password_password'), 
    GlobalVariable.Password)

WebUI.click(findTestObject('Amazon Login Page/Validate_Amazon_NewUser_Reg_Page_006/Page_Amazon Registration/verify mobile'))

WebUI.delay(3)

WebUI.closeBrowser()

