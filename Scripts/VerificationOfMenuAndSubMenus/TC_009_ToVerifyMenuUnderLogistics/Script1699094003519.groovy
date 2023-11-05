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

WebUI.click(findTestObject('Object Repository/LogisticMenu/Page_Cosacs/a_Logistics'))

WebUI.verifyElementText(findTestObject('Object Repository/LogisticMenu/Page_Cosacs/a_Reports'), 'Reports')

WebUI.mouseOver(findTestObject('Object Repository/LogisticMenu/Page_Cosacs/a_Reports'))

WebUI.verifyElementText(findTestObject('Object Repository/LogisticMenu/Page_Cosacs/a_Delivery Performance Summary'), 'Delivery Performance Summary')

WebUI.verifyElementText(findTestObject('Object Repository/LogisticMenu/Page_Cosacs/a_Search Shipments'), 'Search Shipments')

WebUI.verifyElementText(findTestObject('Object Repository/LogisticMenu/Page_Cosacs/a_Search Pick Lists'), 'Search Pick Lists')

WebUI.verifyElementText(findTestObject('Object Repository/LogisticMenu/Page_Cosacs/a_Drivers'), 'Drivers')

WebUI.verifyElementText(findTestObject('Object Repository/LogisticMenu/Page_Cosacs/a_Trucks'), 'Trucks')

WebUI.verifyElementText(findTestObject('Object Repository/LogisticMenu/Page_Cosacs/a_Internal Driver Payment Setup'), 'Internal Driver Payment Setup')

WebUI.closeBrowser()

