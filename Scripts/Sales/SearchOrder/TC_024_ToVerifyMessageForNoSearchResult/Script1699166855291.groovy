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

WebUI.click(findTestObject('Object Repository/searchOrder/Page_Cosacs/a_Sales'))

WebUI.click(findTestObject('Object Repository/searchOrder/Page_Cosacs/a_Search Orders'))

WebUI.click(findTestObject('Object Repository/searchOrder/Page_Search Order/i_glyphicons play'))

WebUI.setText(findTestObject('Object Repository/searchOrder/Page_Search Order/input_ng-pristine ng-untouched ng-valid'), 
    '910')

WebUI.click(findTestObject('Object Repository/searchOrder/Page_Search Order/div_910 COURTS CROSS ROADS'))

WebUI.clearText(findTestObject('PointOfSale/Page_Search Order/FromDate'))

WebUI.setText(findTestObject('PointOfSale/Page_Search Order/FromDate'), '31-10-2023')

WebUI.clearText(findTestObject('PointOfSale/Page_Search Order/ToDate'))

WebUI.setText(findTestObject('PointOfSale/Page_Search Order/ToDate'), '2-11-2023')

WebUI.click(findTestObject('Object Repository/searchOrder/Page_Search Order/button_Search'))

message = WebUI.getText(findTestObject('Object Repository/searchOrder/Page_Search Order/div_There are no values matching your searc_10225f'))
if (message == 'There are no values matching your search filter.') {
    println('There are no values matching your search filter.')
} else {
    println('Search is displayed verify your data')
}

WebUI.closeBrowser()

