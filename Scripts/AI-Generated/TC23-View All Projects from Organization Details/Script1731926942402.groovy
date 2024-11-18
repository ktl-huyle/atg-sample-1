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

"Step 4: Click on span organizationDetails (DXCPracticeForOracle)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/span_organizationDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/span_organizationDetails', ['span_organizationDetails_internalRoleButtonName': span_organizationDetails_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 4-Click on span organizationDetails DXCPracticeForOracle.png')

"Step 5: Click on div currentOrganizationDetails (CurrentDPDXCPractice)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/div_currentOrganizationDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/div_currentOrganizationDetails', ['div_currentOrganizationDetails_class': div_currentOrganizationDetails_class, 'div_currentOrganizationDetails_internalHasText': div_currentOrganizationDetails_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 5-Click on div currentOrganizationDetails CurrentDPDXCPractice.png')

"Step 6: Click on link organizationLinks (OJOracleJDE2) -> Navigate to page 'team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/link_organizationLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/link_organizationLinks', ['link_organizationLinks_nthChild': link_organizationLinks_nthChild, 'link_organizationLinks_internalRoleLinkName': link_organizationLinks_internalRoleLinkName, 'team_id': team_id, 'project_id': project_id]))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 6-Click on link organizationLinks OJOracleJDE2 - Navigate to page teamproject.png')

"Step 7: Click on button projectActions (OracleJDE)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_projectActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_projectActions', ['button_projectActions_internalRoleButtonName': button_projectActions_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 7-Click on button projectActions OracleJDE.png')

"Step 8: Click on link ViewAllProjects -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_ViewAllProjects'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 8-Click on link ViewAllProjects - Navigate to page .png')

"Step 9: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC23-View All Projects from Organization Details_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}