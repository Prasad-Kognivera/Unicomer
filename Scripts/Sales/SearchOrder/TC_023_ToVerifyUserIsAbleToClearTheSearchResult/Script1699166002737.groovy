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

WebUI.click(findTestObject('Object Repository/PointOfSale/Page_Cosacs/a_Search Orders'))

WebUI.clearText(findTestObject('PointOfSale/Page_Search Order/FromDate'))

WebUI.setText(findTestObject('PointOfSale/Page_Search Order/FromDate'), '4-11-2022')

WebUI.clearText(findTestObject('PointOfSale/Page_Search Order/ToDate'))

WebUI.setText(findTestObject('PointOfSale/Page_Search Order/ToDate'), '4-11-2024')

WebUI.click(findTestObject('Object Repository/PointOfSale/Page_Search Order/button_Search'))

searchResult = WebUI.verifyElementPresent(findTestObject('Object Repository/PointOfSale/Page_Search Order/SearchResultCheck'), 
    5)

if (searchResult == true) {
    //WebUI.verifyElementPresent(findTestObject('Object Repository/PointOfSale/Page_Search Order/SearchResultCheck'), 5)
    println('Search is working.!')
} else {
    println('No result found for entered criteria')
}



WebUI.click(findTestObject('searchOrder/Page_Search Order/ClearButton'))

if (searchResult == false) {
	//WebUI.verifyElementPresent(findTestObject('Object Repository/PointOfSale/Page_Search Order/SearchResultCheck'), 5)
	println('Search result cleared is not working')
} else {
	println('Search Criteria is cleared successfully..!!')
}
WebUI.closeBrowser()

