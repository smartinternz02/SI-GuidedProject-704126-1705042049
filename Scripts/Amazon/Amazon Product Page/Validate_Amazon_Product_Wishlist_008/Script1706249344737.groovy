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

WebUI.setText(findTestObject('Object Repository/Amazon Product Page/Validate_Amazon_Product_Wishlist_008/Page_Online Shopping site in India Shop Onl_10c5f3/input_field-keywords'), 
    'Lipstick')

WebUI.click(findTestObject('Object Repository/Amazon Product Page/Validate_Amazon_Product_Wishlist_008/Page_Amazon.in  Lipstick/inputnav-search-submit-button'))

WebUI.click(findTestObject('Object Repository/Amazon Product Page/Validate_Amazon_Product_Wishlist_008/Page_Amazon.in  Lipstick/img_s-image'))

WebUI.switchToWindowTitle('Buy Staze 9to9 Love Tri-Angle 3 in 1 Lipstick |3 Unique Shades in 1 | Transfer-proof | 12 H Longstay | Non Drying Formula with Intense Color Payoff | 03 Caramel Rose | 3.8 g Online at Low Prices in India - Amazon.in')

WebUI.click(findTestObject('Object Repository/Amazon Product Page/Validate_Amazon_Product_Wishlist_008/Page_Buy Staze 9to9 Love Tri-Angle 3 in 1 L_aa7870/a_Add to Wish List'))

WebUI.closeBrowser()

