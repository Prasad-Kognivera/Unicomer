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

WebUI.click(findTestObject('Object Repository/WarrantyMenu/Page_Cosacs/a_Warranty'))

WebUI.mouseOver(findTestObject('Object Repository/WarrantyMenu/Page_Cosacs/a_Reports'))

WebUI.verifyElementText(findTestObject('Object Repository/WarrantyMenu/Page_Cosacs/a_Reports'), 'Reports')

WebUI.verifyElementText(findTestObject('Object Repository/WarrantyMenu/Page_Cosacs/a_Warranty Sales'), 'Warranty Sales')

WebUI.verifyElementText(findTestObject('Object Repository/WarrantyMenu/Page_Cosacs/a_Warranties Due Renewal'), 'Warranties Due Renewal')

WebUI.verifyElementText(findTestObject('Object Repository/WarrantyMenu/Page_Cosacs/a_Warranty Returns'), 'Warranty Returns')

WebUI.verifyElementText(findTestObject('Object Repository/WarrantyMenu/Page_Cosacs/a_Warranty Hit Rate'), 'Warranty Hit Rate')

WebUI.verifyElementText(findTestObject('Object Repository/WarrantyMenu/Page_Cosacs/a_Warranty Claims'), 'Warranty Claims')

WebUI.verifyElementText(findTestObject('Object Repository/WarrantyMenu/Page_Cosacs/a_Second Effort Solicitation'), 'Second Effort Solicitation')

WebUI.verifyElementText(findTestObject('Object Repository/WarrantyMenu/Page_Cosacs/a_Broker Warranty Transactions'), 'Broker Warranty Transactions')

WebUI.verifyElementText(findTestObject('Object Repository/WarrantyMenu/Page_Cosacs/a_Search Warranties'), 'Search Warranties')

WebUI.verifyElementText(findTestObject('Object Repository/WarrantyMenu/Page_Cosacs/a_Warranty Hierarchy'), 'Warranty Hierarchy')

WebUI.verifyElementText(findTestObject('Object Repository/WarrantyMenu/Page_Cosacs/a_Create Warranty'), 'Create Warranty')

WebUI.verifyElementText(findTestObject('Object Repository/WarrantyMenu/Page_Cosacs/a_Warranty Simulator'), 'Warranty Simulator')

WebUI.verifyElementText(findTestObject('Object Repository/WarrantyMenu/Page_Cosacs/a_WarrantyProduct Link'), 'Warranty/Product Link')

WebUI.verifyElementText(findTestObject('Object Repository/WarrantyMenu/Page_Cosacs/a_Warranty Promotions'), 'Warranty Promotions')

WebUI.verifyElementText(findTestObject('Object Repository/WarrantyMenu/Page_Cosacs/a_Warranty Return Percentage'), 'Warranty Return Percentage')

WebUI.closeBrowser()

