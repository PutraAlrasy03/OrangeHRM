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

WebUI.callTestCase(findTestCase('Common/Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/S3 - Admin User Management/TC008/Page_OrangeHRM/a_Admin'))

WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/web/index.php/admin/viewSystemUsers')

WebUI.click(findTestObject('Object Repository/S3 - Admin User Management/TC008/Page_OrangeHRM/button_Add'))

WebUI.selectOptionByValue(findTestObject(null), '', false)

WebUI.setText(findTestObject('Object Repository/S3 - Admin User Management/TC008/Page_OrangeHRM/input'), 'Allu  Arjun')

WebUI.click(findTestObject('Object Repository/S3 - Admin User Management/TC008/Page_OrangeHRM/div_-- Select --'))

WebUI.click(findTestObject('Object Repository/S3 - Admin User Management/TC008/Page_OrangeHRM/input_Username_oxd-input oxd-input--focus'))

WebUI.setText(findTestObject('Object Repository/S3 - Admin User Management/TC008/Page_OrangeHRM/input_Username_oxd-input oxd-input--focus o_d4f516'), 
    'Allu1')

WebUI.setEncryptedText(findTestObject('Object Repository/S3 - Admin User Management/TC008/Page_OrangeHRM/input_Password_oxd-input oxd-input--focus o_671073'), 
    'A8J5DB7QB2/+yLWTFNfonQ==')

WebUI.click(findTestObject('Object Repository/S3 - Admin User Management/TC008/Page_OrangeHRM/button_Save'))

WebUI.verifyElementChecked(findTestObject('Page_OrangeHRM/div_SuccessSuccessfully Saved'), 0)

