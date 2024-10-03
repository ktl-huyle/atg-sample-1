import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.custom.TrueTestScripts
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
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

"Step 4: Click on span organizationOptions (OrganizationButton)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/span_organizationOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/span_organizationOptions', ['span_organizationOptions_internalRoleButtonName': span_organizationOptions_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC21/Step 4-Click on span organizationOptions OrganizationButton.png')

"Step 5: Click on div navigationBars (CurrentDPButton)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/div_navigationBars"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/div_navigationBars', ['div_navigationBars_class': div_navigationBars_class, 'div_navigationBars_internalHasText': div_navigationBars_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC21/Step 5-Click on div navigationBars CurrentDPButton.png')

"Step 6: Click on link organizationLinks (OJOracleJDE) -> Navigate to page 'team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/link_organizationLinks_2"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/link_organizationLinks_2', ['link_organizationLinks_internalRoleLinkName': link_organizationLinks_internalRoleLinkName, 'link_organizationLinks_project_id': link_organizationLinks_project_id, 'link_organizationLinks_team_id': link_organizationLinks_team_id]))

WebUI.takeScreenshot(reportLocation + '/TC21/Step 6-Click on link organizationLinks OJOracleJDE - Navigate to page teamproject.png')

"Step 7: Click on button projectOptions (OracleJDE)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_projectOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_projectOptions', ['button_projectOptions_internalRoleButtonName': button_projectOptions_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC21/Step 7-Click on button projectOptions OracleJDE.png')

"Step 8: Click on link ViewAllProjects -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_ViewAllProjects'))

WebUI.takeScreenshot(reportLocation + '/TC21/Step 8-Click on link ViewAllProjects - Navigate to page .png')

"Step 9: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC21-View All Projects in Organization_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}