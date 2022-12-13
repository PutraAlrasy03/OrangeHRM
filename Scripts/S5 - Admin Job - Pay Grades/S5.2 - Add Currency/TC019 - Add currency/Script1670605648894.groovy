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

WebUI.callTestCase(findTestCase('Common/Add pay grade'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/S5 - Admin Job - Pay Grades/TC019/Page_OrangeHRM/button_Add'))

WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/web/index.php/admin/payGrade')

WebUI.setText(findTestObject('Object Repository/S5 - Admin Job - Pay Grades/TC019/Page_OrangeHRM/input_Name_oxd-input oxd-input--focus'), 'Grade 6')

WebUI.click(findTestObject('Object Repository/S5 - Admin Job - Pay Grades/TC019/Page_OrangeHRM/button_Save'))

WebUI.verifyElementPresent(findTestObject('Object Repository/S5 - Admin Job - Pay Grades/TC019/Page_OrangeHRM/div_InfoNo Records Found'), 0)

