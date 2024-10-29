import com.kms.katalon.core.configuration.RunConfiguration
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import internal.GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
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

"Step 3: Navigate to /UserRegistrationForm"

TrueTestScripts.navigate("/UserRegistrationForm")

"Step 4: Click on input LogonId -> Navigate to page '/AjaxLogonForm'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/UserRegistrationForm?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_UserRegistrationForm/input_LogonId'))

WebUI.takeScreenshot(reportLocation + '/TC253/Step 4-Click on input LogonId - Navigate to page AjaxLogonForm.png')

"Step 5: Click on input LogonPassword"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/AjaxLogonForm?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_AjaxLogonForm/input_LogonPassword'))

WebUI.takeScreenshot(reportLocation + '/TC253/Step 5-Click on input LogonPassword.png')

"Step 6: Enter input value in input LogonPassword -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/AjaxLogonForm?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_AjaxLogonForm/input_LogonPassword'), input_LogonPassword)

WebUI.takeScreenshot(reportLocation + '/TC253/Step 6-Enter input value in input LogonPassword - Navigate to page .png')

"Step 7: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC253-User Registration and Login Verification_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}