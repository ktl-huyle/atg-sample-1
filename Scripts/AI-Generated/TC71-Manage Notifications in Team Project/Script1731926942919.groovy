import truetest.custom.TrueTestScripts
import com.kms.katalon.core.configuration.RunConfiguration
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
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

TrueTestScripts.navigate("organization/*/home")

"Step 4: Click on span Settings"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_home/span_Settings'))

WebUI.takeScreenshot(reportLocation + '/TC71/Step 4-Click on span Settings.png')

"Step 5: Click on link projectManagement (TestOpsHomepage)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/link_projectManagement"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/link_projectManagement', ['link_projectManagement_internalRoleLinkName': link_projectManagement_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC71/Step 5-Click on link projectManagement TestOpsHomepage.png')

"Step 6: Click on span Settings"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_home/span_Settings'))

WebUI.takeScreenshot(reportLocation + '/TC71/Step 6-Click on span Settings.png')

"Step 7: Click on link projectManagement (TestOpsHomepage)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/link_projectManagement"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/link_projectManagement', ['link_projectManagement_internalRoleLinkName': link_projectManagement_internalRoleLinkName_1]))

WebUI.takeScreenshot(reportLocation + '/TC71/Step 7-Click on link projectManagement TestOpsHomepage.png')

"Step 8: Click on div projectDetails (EnCompass) -> Navigate to page 'team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/div_projectDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/div_projectDetails', ['div_projectDetails_internalRoleLinkName': div_projectDetails_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC71/Step 8-Click on div projectDetails EnCompass - Navigate to page teamproject.png')

"Step 9: Click on button NotificationAction -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_NotificationAction'))

WebUI.takeScreenshot(reportLocation + '/TC71/Step 9-Click on button NotificationAction - Navigate to page .png')

"Step 10: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC71-Manage Notifications in Team Project_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}