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

WebUI.click(findTestObject('Object Repository/ServiceMenu/Page_Cosacs/a_Service'))

WebUI.mouseOver(findTestObject('Object Repository/ServiceMenu/Page_Cosacs/a_Reports'))

WebUI.verifyElementText(findTestObject('Object Repository/ServiceMenu/Page_Cosacs/a_Reports'), 'Reports')

WebUI.verifyElementText(findTestObject('Object Repository/ServiceMenu/Page_Cosacs/a_Weekly Summary'), 'Weekly Summary')

WebUI.verifyElementText(findTestObject('Object Repository/ServiceMenu/Page_Cosacs/a_Technician Rejections'), 'Technician Rejections')

WebUI.verifyElementText(findTestObject('Object Repository/ServiceMenu/Page_Cosacs/a_Service Request Resolutions'), 'Service Request Resolutions')

WebUI.verifyElementText(findTestObject('Object Repository/ServiceMenu/Page_Cosacs/a_Customer FeedbackHappy Call'), 'Customer Feedback/Happy Call')

WebUI.verifyElementText(findTestObject('Object Repository/ServiceMenu/Page_Cosacs/a_Spare Parts'), 'Spare Parts')

WebUI.verifyElementText(findTestObject('Object Repository/ServiceMenu/Page_Cosacs/a_Service Request Financial'), 'Service Request Financial')

WebUI.verifyElementText(findTestObject('Object Repository/ServiceMenu/Page_Cosacs/a_Installation Hit Rate'), 'Installation Hit Rate')

WebUI.verifyElementText(findTestObject('Object Repository/ServiceMenu/Page_Cosacs/a_Service Request Financial'), 'Service Request Financial')

WebUI.verifyElementText(findTestObject('Object Repository/ServiceMenu/Page_Cosacs/a_Service Failures'), 'Service Failures')

WebUI.verifyElementText(findTestObject('Object Repository/ServiceMenu/Page_Cosacs/a_Service Income Analysis'), 'Service Income Analysis')

WebUI.verifyElementText(findTestObject('Object Repository/ServiceMenu/Page_Cosacs/a_Resolution Time Per Product Category'), 
    'Resolution Time Per Product Category')

WebUI.verifyElementText(findTestObject('Object Repository/ServiceMenu/Page_Cosacs/a_Service Replacement Data'), 'Service Replacement Data')

WebUI.verifyElementText(findTestObject('Object Repository/ServiceMenu/Page_Cosacs/a_Service Monthly Claims Summary'), 'Service Monthly Claims Summary')

WebUI.verifyElementText(findTestObject('Object Repository/ServiceMenu/Page_Cosacs/a_Outstanding SRs Per Product Department'), 
    'Outstanding SRs Per Product Department')

WebUI.verifyElementText(findTestObject('Object Repository/ServiceMenu/Page_Cosacs/a_Service Claims'), 'Service Claims')

WebUI.verifyElementText(findTestObject('Object Repository/ServiceMenu/Page_Cosacs/a_Search Service Requests'), 'Search Service Requests')

WebUI.verifyElementText(findTestObject('Object Repository/ServiceMenu/Page_Cosacs/a_Technician Diary'), 'Technician Diary')

WebUI.verifyElementText(findTestObject('Object Repository/ServiceMenu/Page_Cosacs/a_My Diary'), 'My Diary')

WebUI.verifyElementText(findTestObject('Object Repository/ServiceMenu/Page_Cosacs/a_Diary Exceptions'), 'Diary Exceptions')

WebUI.verifyElementText(findTestObject('Object Repository/ServiceMenu/Page_Cosacs/a_Search My Jobs'), 'Search My Jobs')

WebUI.verifyElementText(findTestObject('Object Repository/ServiceMenu/Page_Cosacs/a_Technician Payments'), 'Technician Payments')

WebUI.verifyElementText(findTestObject('Object Repository/ServiceMenu/Page_Cosacs/a_My Payments'), 'My Payments')

WebUI.verifyElementText(findTestObject('Object Repository/ServiceMenu/Page_Cosacs/a_Labour Cost Matrix'), 'Labour Cost Matrix')

WebUI.verifyElementText(findTestObject('Object Repository/ServiceMenu/Page_Cosacs/a_Parts Cost Matrix'), 'Parts Cost Matrix')

WebUI.verifyElementText(findTestObject('Object Repository/ServiceMenu/Page_Cosacs/a_Suppliers'), 'Suppliers')

WebUI.verifyElementText(findTestObject('Object Repository/ServiceMenu/Page_Cosacs/a_Supplier Contractual Costs'), 'Supplier Contractual Costs')

WebUI.closeBrowser()

