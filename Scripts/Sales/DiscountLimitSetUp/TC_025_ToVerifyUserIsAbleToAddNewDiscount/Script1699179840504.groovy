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

WebUI.click(findTestObject('Object Repository/DiscountLimitSetUp/Page_Cosacs/a_Sales'))

WebUI.click(findTestObject('Object Repository/DiscountLimitSetUp/Page_Cosacs/a_Discount Limit Setup'))

WebUI.click(findTestObject('Object Repository/DiscountLimitSetUp/Page_Discount Limit Setup/span_glyphicons plus click glyph-btn ng-scope'))

WebUI.click(findTestObject('Object Repository/DiscountLimitSetUp/Page_Discount Limit Setup/span_All Store Type'))

WebUI.setText(findTestObject('Object Repository/DiscountLimitSetUp/Page_Discount Limit Setup/input_ng-pristine ng-untouched ng-valid'), 
    'courts')

WebUI.click(findTestObject('Object Repository/DiscountLimitSetUp/Page_Discount Limit Setup/i_glyphicons play'))

WebUI.click(findTestObject('Object Repository/DiscountLimitSetUp/Page_Discount Limit Setup/div_Courts'))

WebUI.click(findTestObject('Object Repository/DiscountLimitSetUp/Page_Discount Limit Setup/span_All Store Locations'))

WebUI.setText(findTestObject('Object Repository/DiscountLimitSetUp/Page_Discount Limit Setup/input_ng-pristine ng-untouched ng-valid'), 
    '910')

WebUI.click(findTestObject('Object Repository/DiscountLimitSetUp/Page_Discount Limit Setup/div_910 COURTS CROSS ROADS'))

WebUI.setText(findTestObject('Object Repository/DiscountLimitSetUp/Page_Discount Limit Setup/input_form-control text-right ng-untouched _146de2'), 
    '20')

WebUI.click(findTestObject('Object Repository/DiscountLimitSetUp/Page_Discount Limit Setup/span_glyphicons floppy_disk click glyph-btn_89d764'))

WebUI.verifyElementText(findTestObject('Object Repository/DiscountLimitSetUp/Page_Discount Limit Setup/p_Record added successfully'), 
    'Record added successfully')
successMessage = WebUI.getText(findTestObject('Object Repository/DiscountLimitSetUp/Page_Discount Limit Setup/p_Record added successfully'))

if (successMessage == 'Record added successfully') {
	println('Discount Limit Added Successfully')
} else {
	println('Plese reverify the entered criteria')
}

WebUI.closeBrowser()
