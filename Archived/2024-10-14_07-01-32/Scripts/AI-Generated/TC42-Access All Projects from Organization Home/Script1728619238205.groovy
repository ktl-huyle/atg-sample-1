import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import truetest.custom.TrueTestScripts
import com.kms.katalon.core.configuration.RunConfiguration

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

"Step 4: Click on span organizationSelection (OrganizationButton)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/span_organizationSelection"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/span_organizationSelection', ['span_organizationSelection_internalRoleButtonName': span_organizationSelection_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC42/Step 4-Click on span organizationSelection OrganizationButton.png')

"Step 5: Click on div navigationMenu (CurrentDPButton)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/div_navigationMenu"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/div_navigationMenu', ['div_navigationMenu_class': div_navigationMenu_class, 'div_navigationMenu_internalHasText': div_navigationMenu_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC42/Step 5-Click on div navigationMenu CurrentDPButton.png')

"Step 6: Click on link organizationNavigation (OJOracleJDE) -> Navigate to page 'team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/link_organizationNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/link_organizationNavigation', ['link_organizationNavigation_internalRoleLinkName': link_organizationNavigation_internalRoleLinkName, 'link_organizationNavigation_team_id': link_organizationNavigation_team_id, 'link_organizationNavigation_project_id': link_organizationNavigation_project_id]))

WebUI.takeScreenshot(reportLocation + '/TC42/Step 6-Click on link organizationNavigation OJOracleJDE - Navigate to page teamproject.png')

"Step 7: Click on button projectAction (OracleJDE)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_projectAction"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_projectAction', ['button_projectAction_internalRoleButtonName': button_projectAction_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC42/Step 7-Click on button projectAction OracleJDE.png')

"Step 8: Click on link ViewAllProjects -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_ViewAllProjects'))

WebUI.takeScreenshot(reportLocation + '/TC42/Step 8-Click on link ViewAllProjects - Navigate to page .png')

"Step 9: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC42-Access All Projects from Organization Home_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}