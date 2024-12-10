import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.custom.TrueTestScripts

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to http://demo.localhost.direct"

TrueTestScripts.navigate("")

"Step 2: Login into Application"

TrueTestScripts.login()

"Step 3: Navigate to /LogonForm"

TrueTestScripts.navigate("/LogonForm")

"Step 4: Click on input LogonPassword"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/LogonForm?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_LogonForm/input_LogonPassword'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 4-Click on input LogonPassword.png')

"Step 5: Enter input value in input LogonPassword2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/LogonForm?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_LogonForm/input_LogonPassword'), input_LogonPassword2)

WebUI.takeScreenshot(reportLocation + '/TC16/Step 5-Enter input value in input LogonPassword2.png')

"Step 6: Click on link SignIn2 -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/LogonForm?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_LogonForm/link_SignIn2'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 6-Click on link SignIn2 - Navigate to page .png')

"Step 7: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC16-Verify Login Process from Logon Form_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}