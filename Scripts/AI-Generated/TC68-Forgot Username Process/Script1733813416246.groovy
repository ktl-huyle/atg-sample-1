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

"Step 3: Navigate to /"

TrueTestScripts.navigate("/")

"Step 4: Click on link SignInCreateAccount -> Navigate to page '/LogonForm'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_SignInCreateAccount'))

WebUI.takeScreenshot(reportLocation + '/TC68/Step 4-Click on link SignInCreateAccount - Navigate to page LogonForm.png')

"Step 5: Click on link forgotUsername -> Navigate to page '/ForgotUsernameView'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/LogonForm?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_LogonForm/link_forgotUsername'))

WebUI.takeScreenshot(reportLocation + '/TC68/Step 5-Click on link forgotUsername - Navigate to page ForgotUsernameView.png')

"Step 6: Click on input emailAddress"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/ForgotUsernameView?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_ForgotUsernameView/input_emailAddress'))

WebUI.takeScreenshot(reportLocation + '/TC68/Step 6-Click on input emailAddress.png')

"Step 7: Click on link emailUsername2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/ForgotUsernameView?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_ForgotUsernameView/link_emailUsername2'))

WebUI.takeScreenshot(reportLocation + '/TC68/Step 7-Click on link emailUsername2.png')

"Step 8: Click on link emailUsername2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/ForgotUsernameView?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_ForgotUsernameView/link_emailUsername2'))

WebUI.takeScreenshot(reportLocation + '/TC68/Step 8-Click on link emailUsername2.png')

"Step 9: Click on link emailUsername -> Navigate to page '/ForgotUsername'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/ForgotUsernameView?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_ForgotUsernameView/link_emailUsername2'))

WebUI.takeScreenshot(reportLocation + '/TC68/Step 9-Click on link emailUsername - Navigate to page ForgotUsername.png')

"Step 10: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC68-Forgot Username Process_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}