import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import katalon.truetest.TrueTestScripts
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.configuration.RunConfiguration
import internal.GlobalVariable

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

"Step 3: Navigate to organization/*/home"

TrueTestScripts.navigate("organization/${GlobalVariable.organization_id}/home")

"Step 4: Click on button abdRahmaneLyamani"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_home/button_abdRahmaneLyamani'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 4-Click on button abdRahmaneLyamani.png')

"Step 5: Click on div userflowjsModalBackdrop"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_home/div_userflowjsModalBackdrop'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 5-Click on div userflowjsModalBackdrop.png')

"Step 6: Click on div userflowjsModalBackdrop"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_home/div_userflowjsModalBackdrop'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 6-Click on div userflowjsModalBackdrop.png')

"Step 7: Click on div userflowjsModalBackdrop"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_home/div_userflowjsModalBackdrop'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 7-Click on div userflowjsModalBackdrop.png')

"Step 8: Click on div lyamaniAbderrahmaneGmailCom"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_home/div_lyamaniAbderrahmaneGmailCom'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 8-Click on div lyamaniAbderrahmaneGmailCom.png')

"Step 9: Click on div lyamaniAbderrahmaneGmailCom"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_home/div_lyamaniAbderrahmaneGmailCom'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 9-Click on div lyamaniAbderrahmaneGmailCom.png')

"Step 10: Click on div object -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_home/div_object'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 10-Click on div object - Navigate to page .png')

"Step 11: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC8-Access User Profile and Verify Home Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}