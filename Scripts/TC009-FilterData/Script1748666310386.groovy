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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://mbkm.unila.ac.id/auth/login')

WebUI.click(findTestObject('Object Repository/Page_Login  Kampus Merdeka - Universitas Lampung/a_Masuk dengan SSO Unila'))

WebUI.setText(findTestObject('Object Repository/Page_Single Sign On Universitas Lampung/input_CAPSLOCK key is turned on_username'), 
    '2255061022')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Single Sign On Universitas Lampung/input_CAPSLOCK key is turned on_password'), 
    'qrQ0x4GockLpjUPR7f5ZCQ==')

WebUI.click(findTestObject('Object Repository/Page_Single Sign On Universitas Lampung/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard Admin  Kampus Merdeka - Univ_69d92e/i_Dokumen Pendukung_ti ti-menu-2 ti-sm'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard Admin  Kampus Merdeka - Univ_69d92e/a_Daftar Periode'))

WebUI.click(findTestObject('Object Repository/Page_Daftar Periode MBKM  Kampus Merdeka - _e5418e/button_Filter Data'))

WebUI.setText(findTestObject('Object Repository/Page_Daftar Periode MBKM  Kampus Merdeka - _e5418e/input_Filter Data_search'), 
    'msib')

WebUI.click(findTestObject('Object Repository/Page_Daftar Periode MBKM  Kampus Merdeka - _e5418e/button_Reset Pencarian'))

WebUI.closeBrowser()

