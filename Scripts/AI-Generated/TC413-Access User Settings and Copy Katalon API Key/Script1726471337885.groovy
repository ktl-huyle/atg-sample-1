import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.configuration.RunConfiguration
import katalon.truetest.TrueTestScripts

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

"Step 4: Click on button objectActions (object2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/button_objectActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/button_objectActions', ['button_objectActions_internalRoleButtonName': button_objectActions_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC413/Step 4-Click on button objectActions object2.png')

"Step 5: Click on link userSettings -> Navigate to page 'user/settings'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_home/link_userSettings'))

WebUI.takeScreenshot(reportLocation + '/TC413/Step 5-Click on link userSettings - Navigate to page usersettings.png')

"Step 6: Click on button objectActions (object)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/settings?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_user_settings/button_objectActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_user_settings/button_objectActions', ['button_objectActions_internalRoleButtonName': button_objectActions_internalRoleButtonName_1]))

WebUI.takeScreenshot(reportLocation + '/TC413/Step 6-Click on button objectActions object.png')

"Step 7: Click on div object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/settings?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_settings/div_object'))

WebUI.takeScreenshot(reportLocation + '/TC413/Step 7-Click on div object.png')

"Step 8: Click on link katalonApiKey -> Navigate to page 'user/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/settings?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_settings/link_katalonApiKey'))

WebUI.takeScreenshot(reportLocation + '/TC413/Step 8-Click on link katalonApiKey - Navigate to page user.png')

"Step 9: Click on button copyToClipboard"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user/button_copyToClipboard'))

WebUI.takeScreenshot(reportLocation + '/TC413/Step 9-Click on button copyToClipboard.png')

"Step 10: Click on button copyToClipboard2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user/button_copyToClipboard2'))

WebUI.takeScreenshot(reportLocation + '/TC413/Step 10-Click on button copyToClipboard2.png')

"Step 11: Click on button copyToClipboard -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user/button_copyToClipboard'))

WebUI.takeScreenshot(reportLocation + '/TC413/Step 11-Click on button copyToClipboard - Navigate to page .png')

"Step 12: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC413-Access User Settings and Copy Katalon API Key_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}