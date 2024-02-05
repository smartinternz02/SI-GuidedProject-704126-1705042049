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

WebUI.click(findTestObject('Object Repository/Amazon Pages/Validate_Amazon_Footer_Links_004/Page_Online Shopping site in India Shop Onl_10c5f3/a_AbeBooksBooks, art collectibles'))

WebUI.click(findTestObject('Object Repository/Amazon Pages/Validate_Amazon_Footer_Links_004/Page_Online Shopping site in India Shop Onl_10c5f3/a_Amazon Web ServicesScalable CloudComputin_7d54b3'))

WebUI.click(findTestObject('Object Repository/Amazon Pages/Validate_Amazon_Footer_Links_004/Page_Online Shopping site in India Shop Onl_10c5f3/a_AudibleDownloadAudio Books'))

WebUI.click(findTestObject('Object Repository/Amazon Pages/Validate_Amazon_Footer_Links_004/Page_Online Shopping site in India Shop Onl_10c5f3/a_IMDbMovies, TV Celebrities'))

WebUI.click(findTestObject('Object Repository/Amazon Pages/Validate_Amazon_Footer_Links_004/Page_Online Shopping site in India Shop Onl_10c5f3/a_ShopbopDesignerFashion Brands'))

WebUI.click(findTestObject('Object Repository/Amazon Pages/Validate_Amazon_Footer_Links_004/Page_Online Shopping site in India Shop Onl_10c5f3/a_Amazon BusinessEverything ForYour Business'))

WebUI.click(findTestObject('Object Repository/Amazon Pages/Validate_Amazon_Footer_Links_004/Page_Online Shopping site in India Shop Onl_10c5f3/a_Prime Now 2-Hour Deliveryon Everyday Items'))

WebUI.click(findTestObject('Object Repository/Amazon Pages/Validate_Amazon_Footer_Links_004/Page_Online Shopping site in India Shop Onl_10c5f3/a_Amazon Prime Music100 million songs, ad-f_1958ce'))

WebUI.closeBrowser()

