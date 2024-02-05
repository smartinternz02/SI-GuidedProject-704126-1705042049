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

WebUI.doubleClick(findTestObject('Object Repository/Amazon Payment Page/Validate_Amazon_Payment_Page_010/Page_Online Shopping site in India Shop Onl_10c5f3/input_field-keywords'))

WebUI.setText(findTestObject('Object Repository/Amazon Payment Page/Validate_Amazon_Payment_Page_010/Page_Online Shopping site in India Shop Onl_10c5f3/input_field-keywords'), 
    'Kurta for women')

WebUI.click(findTestObject('Object Repository/Amazon Payment Page/Validate_Amazon_Payment_Page_010/Page_Online Shopping site in India Shop Onl_10c5f3/inputnav-search-submit-button'))

WebUI.click(findTestObject('Object Repository/Amazon Payment Page/Validate_Amazon_Payment_Page_010/Page_Amazon.in  Kurta for women/div_a-section aok-relative s-image-tall-aspect'))

WebUI.switchToWindowTitle('Bollyclues Women\'s Cotton Flared Printed Kurta(BC-COB) Blue : Amazon.in: Fashion')

WebUI.selectOptionByValue(findTestObject('Object Repository/Amazon Payment Page/Validate_Amazon_Payment_Page_010/Page_Bollyclues Womens Cotton Flared Printe_00b59a/select_1        2        3        4'), 
    '2', true)

WebUI.click(findTestObject('Object Repository/Amazon Payment Page/Validate_Amazon_Payment_Page_010/Page_Bollyclues Womens Cotton Flared Printe_00b59a/input_submit.add-to-cart'))

WebUI.click(findTestObject('Object Repository/Amazon Payment Page/Validate_Amazon_Payment_Page_010/Page_Select a delivery address/a_Add a new address'))

WebUI.click(findTestObject('Object Repository/Amazon Payment Page/Validate_Amazon_Payment_Page_010/Page_Amazon.in Checkout/a_Enter card details'))

WebUI.setText(findTestObject('Object Repository/Amazon Payment Page/Validate_Amazon_Payment_Page_010/Page_Amazon.in Checkout/input_addCreditCardNumber'), 
    '1223 3334 4444 5555')

WebUI.click(findTestObject('Object Repository/Amazon Payment Page/Validate_Amazon_Payment_Page_010/Page_Amazon.in Checkout/input_ppw-accountHolderName'))

WebUI.setText(findTestObject('Object Repository/Amazon Payment Page/Validate_Amazon_Payment_Page_010/Page_Amazon.in Checkout/input_ppw-accountHolderName'), 
    'ABC')

WebUI.click(findTestObject('Object Repository/Amazon Payment Page/Validate_Amazon_Payment_Page_010/Page_Amazon.in Checkout/span_01'))

WebUI.click(findTestObject('Object Repository/Amazon Payment Page/Validate_Amazon_Payment_Page_010/Page_Amazon.in Checkout/a_12'))

WebUI.click(findTestObject('Object Repository/Amazon Payment Page/Validate_Amazon_Payment_Page_010/Page_Amazon.in Checkout/span_2024'))

WebUI.click(findTestObject('Object Repository/Amazon Payment Page/Validate_Amazon_Payment_Page_010/Page_Amazon.in Checkout/a_2037'))

WebUI.click(findTestObject('Object Repository/Amazon Payment Page/Validate_Amazon_Payment_Page_010/Page_Amazon.in Checkout/span_Use this payment method'))

WebUI.click(findTestObject('Object Repository/Amazon Payment Page/Validate_Amazon_Payment_Page_010/Page_Amazon.in Checkout/h3_Items and delivery'))

WebUI.closeBrowser()

