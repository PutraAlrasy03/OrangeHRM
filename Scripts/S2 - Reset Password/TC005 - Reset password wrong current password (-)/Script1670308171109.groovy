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

WebUI.click(findTestObject('Object Repository/TC005/Page_OrangeHRM/i_Dashboard_oxd-icon bi-caret-down-fill oxd_d2fd49'))

WebUI.click(findTestObject('Object Repository/TC005/Page_OrangeHRM/a_Change Password'))

WebUI.setText(findTestObject('Object Repository/TC005/Page_OrangeHRM/input_Current Password_oxd-input oxd-input--focus'), 
    'admin')

WebUI.setText(findTestObject('Object Repository/TC005/Page_OrangeHRM/input_password'), 'Alrasy03_')

WebUI.setText(findTestObject('Object Repository/TC005/Page_OrangeHRM/input_Confirm password'), 'Alrasy03_')

WebUI.click(findTestObject('Object Repository/TC005/Page_OrangeHRM/button_Save'))

WebUI.verifyElementText(findTestObject('Object Repository/TC005/Page_OrangeHRM/p_Error'), 'Error')

