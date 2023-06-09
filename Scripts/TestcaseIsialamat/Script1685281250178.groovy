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

Mobile.startApplication('C:\\Users\\LENOVO\\Katalon Studio\\Final Test\\App\\Happy Day Shopping_v1.1_apkpure.com.apk', true)

Mobile.tap(findTestObject('Object Repository/Shop/android.view.ViewGroup'), 0)

Mobile.tap(findTestObject('Object Repository/Shop/android.view.ViewGroup (1)'), 0)

Mobile.setText(findTestObject('Object Repository/Shop/android.widget.EditText - 1'), '5', 0)

Mobile.tap(findTestObject('Object Repository/Shop/android.widget.TextView - Add to Bag'), 0)

Mobile.tap(findTestObject('Object Repository/Shop/android.widget.TextView - Your Bag'), 0)

Mobile.tap(findTestObject('Object Repository/Shop/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('Object Repository/Shop/android.widget.TextView - Belo Sun Expert Translucent Loose Powder SPF30 10g'), 
    0)

Mobile.tap(findTestObject('Object Repository/Shop/android.widget.TextView - .18.50   Save'), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.tap(findTestObject('Object Repository/Shop/android.widget.ImageView (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Shop/android.widget.TextView - Checkout'), 0)

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/Shop/android.widget.TextView - 1'), 0)

Mobile.tap(findTestObject('Object Repository/Shop/android.widget.Button - Checkout'), 0)

Mobile.setText(findTestObject('Object Repository/Shop/android.widget.EditText'), 'meita', 0)

Mobile.setText(findTestObject('Object Repository/Shop/android.widget.EditText (1)'), '082241849951', 0)

Mobile.closeApplication()

