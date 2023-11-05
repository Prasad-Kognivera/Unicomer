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

WebUI.click(findTestObject('Object Repository/MerchandisingMenu/Page_Cosacs/a_Merchandising'))

WebUI.mouseOver(findTestObject('Object Repository/MerchandisingMenu/Page_Cosacs/a_Create'))

WebUI.verifyElementText(findTestObject('Object Repository/MerchandisingMenu/Page_Cosacs/a_Create'), 'Create')

WebUI.verifyElementText(findTestObject('Object Repository/MerchandisingMenu/Page_Cosacs/a_Product Without Stock'), 'Product Without Stock')

WebUI.verifyElementText(findTestObject('Object Repository/MerchandisingMenu/Page_Cosacs/a_Stock Count'), 'Stock Count')

WebUI.mouseOver(findTestObject('Object Repository/MerchandisingMenu/Page_Cosacs/a_Search'))

WebUI.verifyElementText(findTestObject('Object Repository/MerchandisingMenu/Page_Cosacs/a_Search'), 'Search')

WebUI.verifyElementText(findTestObject('Object Repository/MerchandisingMenu/Page_Cosacs/a_Product Enquiry'), 'Product Enquiry')

WebUI.verifyElementText(findTestObject('Object Repository/MerchandisingMenu/Page_Cosacs/a_Goods on Loan'), 'Goods on Loan')

WebUI.verifyElementText(findTestObject('Object Repository/MerchandisingMenu/Page_Cosacs/a_Goods Receipts'), 'Goods Receipts')

WebUI.verifyElementText(findTestObject('Object Repository/MerchandisingMenu/Page_Cosacs/a_Locations'), 'Locations')

WebUI.verifyElementText(findTestObject('Object Repository/MerchandisingMenu/Page_Cosacs/a_Products'), 'Products')

WebUI.verifyElementText(findTestObject('Object Repository/MerchandisingMenu/Page_Cosacs/a_Promotions'), 'Promotions')

WebUI.verifyElementText(findTestObject('Object Repository/MerchandisingMenu/Page_Cosacs/a_Purchase Orders'), 'Purchase Orders')

WebUI.verifyElementText(findTestObject('Object Repository/MerchandisingMenu/Page_Cosacs/a_Stock Adjustments'), 'Stock Adjustments')

WebUI.verifyElementText(findTestObject('Object Repository/MerchandisingMenu/Page_Cosacs/a_Stock Allocations'), 'Stock Allocations')

WebUI.verifyElementText(findTestObject('Object Repository/MerchandisingMenu/Page_Cosacs/a_Stock Requisitions'), 'Stock Requisitions')

WebUI.verifyElementText(findTestObject('Object Repository/MerchandisingMenu/Page_Cosacs/a_Stock Transfers'), 'Stock Transfers')

WebUI.verifyElementText(findTestObject('Object Repository/MerchandisingMenu/Page_Cosacs/a_Stock Transfers'), 'Stock Transfers')

WebUI.verifyElementText(findTestObject('Object Repository/MerchandisingMenu/Page_Cosacs/a_Stock Counts'), 'Stock Counts')

WebUI.verifyElementText(findTestObject('Object Repository/MerchandisingMenu/Page_Cosacs/a_Vendors'), 'Vendors')

WebUI.verifyElementText(findTestObject('Object Repository/MerchandisingMenu/Page_Cosacs/a_Vendor Returns'), 'Vendor Returns')

WebUI.mouseOver(findTestObject('Object Repository/MerchandisingMenu/Page_Cosacs/a_Integration'))

WebUI.verifyElementText(findTestObject('Object Repository/MerchandisingMenu/Page_Cosacs/a_Integration'), 'Integration')

WebUI.verifyElementText(findTestObject('Object Repository/MerchandisingMenu/Page_Cosacs/a_CINT Errors'), 'CINT Errors')

WebUI.mouseOver(findTestObject('Object Repository/MerchandisingMenu/Page_Cosacs/a_Reports'))

WebUI.verifyElementText(findTestObject('Object Repository/MerchandisingMenu/Page_Cosacs/a_Reports'), 'Reports')

WebUI.verifyElementText(findTestObject('Object Repository/MerchandisingMenu/Page_Cosacs/a_Allocated Stock'), 'Allocated Stock')

WebUI.verifyElementText(findTestObject('Object Repository/MerchandisingMenu/Page_Cosacs/a_Buyer Sales History'), 'Buyer Sales History')

WebUI.verifyElementText(findTestObject('Object Repository/MerchandisingMenu/Page_Cosacs/a_Negative Stock'), 'Negative Stock')

WebUI.verifyElementText(findTestObject('Object Repository/MerchandisingMenu/Page_Cosacs/a_Promotion'), 'Promotion')

WebUI.verifyElementText(findTestObject('Object Repository/MerchandisingMenu/Page_Cosacs/a_Sales Comparison'), 'Sales Comparison')

WebUI.verifyElementText(findTestObject('Object Repository/MerchandisingMenu/Page_Cosacs/a_Stock Movement'), 'Stock Movement')

WebUI.verifyElementText(findTestObject('Object Repository/MerchandisingMenu/Page_Cosacs/a_Stock Valuation'), 'Stock Valuation')

WebUI.verifyElementText(findTestObject('Object Repository/MerchandisingMenu/Page_Cosacs/a_Stock Received'), 'Stock Received')

WebUI.verifyElementText(findTestObject('Object Repository/MerchandisingMenu/Page_Cosacs/a_Top Sku'), 'Top Sku')

WebUI.verifyElementText(findTestObject('Object Repository/MerchandisingMenu/Page_Cosacs/a_Trading'), 'Trading')

WebUI.verifyElementText(findTestObject('Object Repository/MerchandisingMenu/Page_Cosacs/a_Summary Update Control'), 'Summary Update Control')

WebUI.verifyElementText(findTestObject('Object Repository/MerchandisingMenu/Page_Cosacs/a_Summary Update Control'), 'Summary Update Control')

WebUI.verifyElementText(findTestObject('Object Repository/MerchandisingMenu/Page_Cosacs/a_Warehouse Oversupply'), 'Warehouse Oversupply')

WebUI.verifyElementText(findTestObject('Object Repository/MerchandisingMenu/Page_Cosacs/a_Weekly Trading Report'), 'Weekly Trading Report')

WebUI.verifyElementText(findTestObject('Object Repository/MerchandisingMenu/Page_Cosacs/a_Associated Products'), 'Associated Products')

WebUI.verifyElementText(findTestObject('Object Repository/MerchandisingMenu/Page_Cosacs/a_Product Status Maintenance'), 
    'Product Status Maintenance')

WebUI.verifyElementText(findTestObject('Object Repository/MerchandisingMenu/Page_Cosacs/a_Product Hierarchy'), 'Product Hierarchy')

WebUI.verifyElementText(findTestObject('Object Repository/MerchandisingMenu/Page_Cosacs/a_Stock Adjustment Reasons'), 'Stock Adjustment Reasons')

WebUI.verifyElementText(findTestObject('Object Repository/MerchandisingMenu/Page_Cosacs/a_Repossessed Conditions'), 'Repossessed Conditions')

WebUI.verifyElementText(findTestObject('Object Repository/MerchandisingMenu/Page_Cosacs/a_Period Data'), 'Period Data')

WebUI.verifyElementText(findTestObject('Object Repository/MerchandisingMenu/Page_Cosacs/a_Hierarchy Detail Setup'), 'Hierarchy Detail Setup')

WebUI.verifyElementText(findTestObject('Object Repository/MerchandisingMenu/Page_Cosacs/a_Standard Tax Rate Maintenance'), 
    'Standard Tax Rate Maintenance')

WebUI.verifyElementText(findTestObject('Object Repository/MerchandisingMenu/Page_Cosacs/a_Price Ticketing'), 'Price Ticketing')

WebUI.verifyElementText(findTestObject('Object Repository/MerchandisingMenu/Page_Cosacs/a_Transaction Types'), 'Transaction Types')

WebUI.verifyElementText(findTestObject('Object Repository/MerchandisingMenu/Page_Cosacs/a_Non warrantable items'), 'Non warrantable items')

WebUI.closeBrowser()

