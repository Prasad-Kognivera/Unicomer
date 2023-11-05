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

WebUI.callTestCase(findTestCase('Login/TC_001_Valid Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/PointOfSale/Page_Cosacs/a_Sales'))

WebUI.click(findTestObject('Object Repository/PointOfSale/Page_Cosacs/a_Point of Sale'))

WebUI.click(findTestObject('Object Repository/PointOfSale/Page_Cosacs/div_FURNITURE'))

WebUI.click(findTestObject('Object Repository/PointOfSale/Page_Cosacs/div_DINING'))

WebUI.click(findTestObject('Object Repository/PointOfSale/Page_Cosacs/div_5 PC DINING SET METAL'))

WebUI.getText(findTestObject('PointOfSale/Page_Cosacs/ProductTile'))

WebUI.click(findTestObject('Object Repository/PointOfSale/Page_Cosacs/span_glyphicons cart_in'))

WebUI.click(findTestObject('Object Repository/PointOfSale/Page_Cosacs/button_Customer'))

WebUI.click(findTestObject('Object Repository/PointOfSale/Page_Cosacs/button_Search'))

WebUI.click(findTestObject('Object Repository/PointOfSale/Page_Cosacs/td_Warranty'))

WebUI.click(findTestObject('Object Repository/PointOfSale/Page_Cosacs/button_Basket1'))

WebUI.verifyElementPresent(findTestObject('Object Repository/PointOfSale/Page_Cosacs/div_DH736                                WA_277093'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/PointOfSale/Page_Cosacs/div_DH736                                WA_277093'), 
    'DH736 WASHINGTON TABLE4CH G/BR - DINING SET- 5 PCE-GOLDEN BROWN')

productname = WebUI.getText(findTestObject('PointOfSale/Page_Cosacs/ProductInBasket'))

if (productname.contains('DH736')) {
    println('Entered product and basket product is matching')
} else {
    println('Entered product and basket product is NOT matching\'')
}

WebUI.click(findTestObject('Object Repository/PointOfSale/Page_Cosacs/button_Payment'))

WebUI.rightClick(findTestObject('Object Repository/PointOfSale/Page_Cosacs/button_Cash'))

WebUI.verifyElementText(findTestObject('Object Repository/PointOfSale/Page_Cosacs/button_Cash'), 'Cash')

WebUI.rightClick(findTestObject('Object Repository/PointOfSale/Page_Cosacs/button_Foreign Cash'))

WebUI.verifyElementText(findTestObject('Object Repository/PointOfSale/Page_Cosacs/button_Foreign Cash'), 'Foreign Cash')

WebUI.verifyElementText(findTestObject('Object Repository/PointOfSale/Page_Cosacs/button_Cheque'), 'Cheque')

WebUI.verifyElementText(findTestObject('Object Repository/PointOfSale/Page_Cosacs/button_Debit Card'), 'Debit Card')

WebUI.verifyElementText(findTestObject('Object Repository/PointOfSale/Page_Cosacs/button_Credit Card'), 'Credit Card')

WebUI.verifyElementText(findTestObject('Object Repository/PointOfSale/Page_Cosacs/button_Optical Postings'), 'Optical Postings')


soldby = WebUI.getText(findTestObject('Object Repository/PointOfSale/Page_Cosacs/SoldBy'))

if (soldby=="Select CSR") {
	
	WebUI.verifyElementClickable(findTestObject('Object Repository/PointOfSale/Page_Cosacs/PayButton'))
	
	println('Please select sold by')
} else 
	
	{
	println('Sale is Completed')
}

WebUI.closeBrowser()

