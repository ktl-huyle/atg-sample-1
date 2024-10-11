import internal.GlobalVariable
import com.kms.katalon.core.configuration.RunConfiguration
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.custom.TrueTestScripts
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

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

"Step 4: Click on button teamMemberAction (NawwarahYusof)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/button_teamMemberAction"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/button_teamMemberAction', ['button_teamMemberAction_internalRoleButtonName': button_teamMemberAction_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC85/Step 4-Click on button teamMemberAction NawwarahYusof.png')

"Step 5: Click on link UserSettings -> Navigate to page 'user/settings'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_home/link_UserSettings'))

WebUI.takeScreenshot(reportLocation + '/TC85/Step 5-Click on link UserSettings - Navigate to page usersettings.png')

"Step 6: Click on button userAction (NawwarahYusof)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/settings?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_user_settings/button_userAction"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_user_settings/button_userAction', ['button_userAction_internalRoleButtonName': button_userAction_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC85/Step 6-Click on button userAction NawwarahYusof.png')

"Step 7: Click on div Backdrop"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/settings?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_settings/div_Backdrop'))

WebUI.takeScreenshot(reportLocation + '/TC85/Step 7-Click on div Backdrop.png')

"Step 8: Click on link KatalonAPIKey -> Navigate to page 'user/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/settings?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_settings/link_KatalonAPIKey'))

WebUI.takeScreenshot(reportLocation + '/TC85/Step 8-Click on link KatalonAPIKey - Navigate to page user.png')

"Step 9: Click on button copyToClipboard (CopyToClipboard2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_user/button_copyToClipboard'))

WebUI.takeScreenshot(reportLocation + '/TC85/Step 9-Click on button copyToClipboard CopyToClipboard2.png')

"Step 10: Click on button copyToClipboard (CopyToClipboard3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_user/button_copyToClipboard'))

WebUI.takeScreenshot(reportLocation + '/TC85/Step 10-Click on button copyToClipboard CopyToClipboard3.png')

"Step 11: Click on button copyToClipboard (CopyToClipboard2) -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_user/button_copyToClipboard'))

WebUI.takeScreenshot(reportLocation + '/TC85/Step 11-Click on button copyToClipboard CopyToClipboard2 - Navigate to page .png')

"Step 12: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC85-Manage User Settings and API Key_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}