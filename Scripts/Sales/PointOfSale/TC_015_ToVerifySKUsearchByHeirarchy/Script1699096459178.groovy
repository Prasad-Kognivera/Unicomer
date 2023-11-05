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

WebUI.verifyElementPresent(findTestObject('Object Repository/PointOfSale/Page_Cosacs/span_DH736 WASHINGTON TABLE4CH GBR - DINING_2d6c05'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/PointOfSale/Page_Cosacs/span_DH736 WASHINGTON TABLE4CH GBR - DINING_2d6c05'), 
    'DH736 WASHINGTON TABLE4CH G/BR - DINING SET- 5 PCE-GOLDEN BROWN')

WebUI.closeBrowser()

