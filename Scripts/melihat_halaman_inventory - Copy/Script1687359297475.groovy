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

WebUI.callTestCase(findTestCase('login_berhasil'), [('NIK') : 'P29902'], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Inventory/a_Inventory'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Inventory/input_No. Kredit_MuiInputBase-input MuiInpu_8585e7'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Inventory/input_Tanggal Kontrak_MuiInputBase-input Mu_7d22e3'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Inventory/input_EPC Label RFID_MuiInputBase-input Mui_14e02b'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Inventory/span_Teregistrasi'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Inventory/span_Tersimpan'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Inventory/span_Menunggu'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Inventory/span_Diizinkan'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Inventory/span_Dipinjam'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Inventory/span_Checkout Tanpa Izin'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Inventory/span_Ditebus'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Inventory/span_Diambil'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Inventory/span_Dikoreksi'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Inventory/span_Kadaluwarsa'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Inventory/button_Cari'), 0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Inventory/th_No'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Object Repository/Inventory/th_TanggalStatus'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Object Repository/Inventory/th_TanggalKontrak'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Object Repository/Inventory/th_Photo'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Object Repository/Inventory/th_NoKredit'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Object Repository/Inventory/th_Produk'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Object Repository/Inventory/th_Gol'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Object Repository/Inventory/th_Status'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Object Repository/Inventory/th_Kabinet'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Object Repository/Inventory/th_StatusKredit'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Object Repository/Inventory/th_Action'), FailureHandling.STOP_ON_FAILURE)

WebUI.takeFullPageScreenshotAsCheckpoint('halaman_inventory_pengelola')

WebUI.closeBrowser()

