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
import com.kms.katalon.core.webui.keyword.internal.WebUIKeywordMain as WebUIKeywordMain
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('Login/TC_001_Valid Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/PointOfSale/Page_Cosacs/a_Sales'))

WebUI.click(findTestObject('Object Repository/PointOfSale/Page_Cosacs/a_Point of Sale'))

WebUI.setText(findTestObject('Object Repository/PointOfSale/Page_Cosacs/inputsearchString'), 'DH736')

WebUI.waitForPageLoad(5)

WebUI.click(findTestObject('Object Repository/PointOfSale/Page_Cosacs/span_DH736 WASHINGTON TABLE4CH GBR - DINING_2d6c05'))

WebUI.click(findTestObject('Object Repository/PointOfSale/Page_Cosacs/button_Customer'))

WebUI.click(findTestObject('Object Repository/PointOfSale/Page_Cosacs/button_Search'))

WebUI.click(findTestObject('Object Repository/PointOfSale/Page_Cosacs/td_ng-binding'))

WebUI.click(findTestObject('Object Repository/PointOfSale/Page_Cosacs/td_ng-binding_1'))

WebUI.click(findTestObject('Object Repository/PointOfSale/Page_Cosacs/button_Basket1'))

WebUI.click(findTestObject('Object Repository/PointOfSale/Page_Cosacs/button_Payment'))

WebUI.click(findTestObject('Object Repository/PointOfSale/Page_Cosacs/button_Cash'))

WebUI.click(findTestObject('Object Repository/PointOfSale/Page_Cosacs/span_Select CSR'))

WebUI.click(findTestObject('Object Repository/PointOfSale/Page_Cosacs/div_1 - Steve Brickell'))

WebUI.click(findTestObject('Object Repository/PointOfSale/Page_Cosacs/button_Pay'))
/*
 * WebUI.waitForPageLoad(5)
 * 
 * WebUI.switchToWindowIndex(1)
 * 
 * //WebUI.switchToWindowTitle('Cosacs') WebUI.windowTitle
 * 
 * WebUI.waitForPageLoad(5)
 * 
 * WebUI.closeWindowIndex(1, FailureHandling.CONTINUE_ON_FAILURE)
 */

//WebUI.closeWindowTitle('Cosacs')
//WebUI.waitForPageLoad(5)


/*
 * saleComplete =
 * WebUI.verifyElementText(findTestObject('PointOfSale/Page_Cosacs/div_Sale
 * Completed'), '')
 * 
 * if (saleComplete == 'Sale Completed') { println('Sale is completed
 * successfully.!') } else { println('Please check the steps for completion of
 * sale') }
 */

WebUI.closeBrowser()

