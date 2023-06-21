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

WebUI.callTestCase(findTestCase('login_berhasil'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Inventory/a_Inventory'))

WebUI.click(findTestObject('Object Repository/Inventory/button_Tanggal Kontrak_MuiButtonBase-root M_6e775a'))

WebUI.click(findTestObject('Object Repository/Inventory/button_Tanggal Kontrak_MuiButtonBase-root M_6e775a'))

WebUI.click(findTestObject('Object Repository/Inventory/button_26'))

WebUI.click(findTestObject('Object Repository/Inventory/button_OK'))

WebUI.click(findTestObject('Object Repository/Inventory/span_Dikoreksi'))

WebUI.click(findTestObject('Object Repository/Inventory/span_Kadaluwarsa'))

WebUI.click(findTestObject('Object Repository/Inventory/span_Diambil'))

WebUI.click(findTestObject('Object Repository/Inventory/span_Ditebus'))

WebUI.click(findTestObject('Object Repository/Inventory/span_Checkout Tanpa Izin'))

WebUI.click(findTestObject('Object Repository/Inventory/span_Dipinjam'))

WebUI.click(findTestObject('Object Repository/Inventory/span_Diizinkan'))

WebUI.click(findTestObject('Object Repository/Inventory/span_Menunggu'))

WebUI.click(findTestObject('Object Repository/Inventory/span_Tersimpan'))

WebUI.click(findTestObject('Object Repository/Inventory/span_Teregistrasi'))

WebUI.click(findTestObject('Object Repository/Inventory/span_Dikoreksi'))

WebUI.click(findTestObject('Object Repository/Inventory/button_Cari'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Inventory/div_1'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Inventory/div_26-05-2023 0700'), '26-05-2023 07:00')

WebUI.verifyElementText(findTestObject('Object Repository/Inventory/span_barang jaminan dikoreksi'), 'barang jaminan dikoreksi')

