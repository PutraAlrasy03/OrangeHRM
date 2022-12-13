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

WebUI.click(findTestObject('Object Repository/S6 - Directory/TC120/Page_OrangeHRM/a_Time'))

WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/web/index.php/time/viewEmployeeTimesheet')

WebUI.click(findTestObject('Object Repository/S6 - Directory/TC120/Page_OrangeHRM/i_Attendance_oxd-icon bi-chevron-down'))

WebUI.click(findTestObject('Object Repository/S6 - Directory/TC120/Page_OrangeHRM/a_My Records'))

WebUI.click(findTestObject('Object Repository/S6 - Directory/TC120/Page_OrangeHRM/i_Date_oxd-icon bi-calendar oxd-date-input-icon'))

WebUI.click(findTestObject('Object Repository/S6 - Directory/TC120/Page_OrangeHRM/div_10'))

WebUI.click(findTestObject('Object Repository/S6 - Directory/TC120/Page_OrangeHRM/button_View'))

WebUI.verifyElementText(findTestObject('Object Repository/S6 - Directory/TC120/Page_OrangeHRM/span_(1) Record Found'), '(1) Record Found')

