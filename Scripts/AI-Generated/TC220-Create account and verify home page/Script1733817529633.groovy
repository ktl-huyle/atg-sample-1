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

WebUI.takeScreenshot(reportLocation + '/TC220/Step 4-Click on link SignInCreateAccount - Navigate to page LogonForm.png')

"Step 5: Click on link SignIn2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/LogonForm?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_LogonForm/link_SignIn3'))

WebUI.takeScreenshot(reportLocation + '/TC220/Step 5-Click on link SignIn2.png')

"Step 6: Click on input Search2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/LogonForm?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_LogonForm/input_Search2'))

WebUI.takeScreenshot(reportLocation + '/TC220/Step 6-Click on input Search2.png')

"Step 7: Enter input value in input Search2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/LogonForm?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_LogonForm/input_Search2'), input_Search2)

WebUI.takeScreenshot(reportLocation + '/TC220/Step 7-Enter input value in input Search2.png')

"Step 8: Click on div EmptyDiv -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/LogonForm?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_LogonForm/div_EmptyDiv'))

WebUI.takeScreenshot(reportLocation + '/TC220/Step 8-Click on div EmptyDiv - Navigate to page .png')

"Step 9: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC220-Create account and verify home page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}