import internal.GlobalVariable
import truetest.custom.TrueTestScripts
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

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

"Step 4: Click on div WelcomeToThermoFisher"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_home/div_WelcomeToThermoFisher'))

WebUI.takeScreenshot(reportLocation + '/TC112/Step 4-Click on div WelcomeToThermoFisher.png')

"Step 5: Click on div WelcomeToThermoFisher"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_home/div_WelcomeToThermoFisher'))

WebUI.takeScreenshot(reportLocation + '/TC112/Step 5-Click on div WelcomeToThermoFisher.png')

"Step 6: Click on div GridContainer"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_home/div_GridContainer'))

WebUI.takeScreenshot(reportLocation + '/TC112/Step 6-Click on div GridContainer.png')

"Step 7: Click on span organizationSelection (SelectOrganization)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/span_organizationSelection"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/span_organizationSelection', ['span_organizationSelection_internalRoleButtonName': span_organizationSelection_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC112/Step 7-Click on span organizationSelection SelectOrganization.png')

"Step 8: Click on span organizationSelection (SelectOrganizationChina)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/span_organizationSelection'))

WebUI.takeScreenshot(reportLocation + '/TC112/Step 8-Click on span organizationSelection SelectOrganizationChina.png')

"Step 9: Click on span SettingsButton"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_home/span_SettingsButton'))

WebUI.takeScreenshot(reportLocation + '/TC112/Step 9-Click on span SettingsButton.png')

"Step 10: Click on div Backdrop"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_home/div_Backdrop_1'))

WebUI.takeScreenshot(reportLocation + '/TC112/Step 10-Click on div Backdrop.png')

"Step 11: Click on button teamMemberAction (Sabrina)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/button_teamMemberAction"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/button_teamMemberAction', ['button_teamMemberAction_internalRoleButtonName': button_teamMemberAction_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC112/Step 11-Click on button teamMemberAction Sabrina.png')

"Step 12: Click on link UserSettings -> Navigate to page 'user/settings'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_home/link_UserSettings'))

WebUI.takeScreenshot(reportLocation + '/TC112/Step 12-Click on link UserSettings - Navigate to page usersettings.png')

"Step 13: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC112-View User Settings and Verify Navigation_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}