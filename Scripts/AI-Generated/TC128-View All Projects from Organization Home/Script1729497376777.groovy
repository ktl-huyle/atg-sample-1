import truetest.custom.TrueTestScripts
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import internal.GlobalVariable
import com.kms.katalon.core.configuration.RunConfiguration
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

"Step 3: Navigate to /organization/*/home"

TrueTestScripts.navigate("/organization/${GlobalVariable.organization_id}/home")

"Step 4: Click on span organizationSelect (OrganizationButton)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/span_organizationSelect"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/span_organizationSelect', ['span_organizationSelect_internalRoleButtonName': span_organizationSelect_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC128/Step 4-Click on span organizationSelect OrganizationButton.png')

"Step 5: Click on div currentOrganizationDetails (CurrentDPButton)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/div_currentOrganizationDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/div_currentOrganizationDetails', ['div_currentOrganizationDetails_class': div_currentOrganizationDetails_class, 'div_currentOrganizationDetails_internalHasText': div_currentOrganizationDetails_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC128/Step 5-Click on div currentOrganizationDetails CurrentDPButton.png')

"Step 6: Click on link organizationLinks (OJOracleJDE) -> Navigate to page '/team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/link_organizationLinks_2"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/link_organizationLinks_2', ['link_organizationLinks_internalRoleLinkName': link_organizationLinks_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC128/Step 6-Click on link organizationLinks OJOracleJDE - Navigate to page teamproject.png')

"Step 7: Click on button projectActions (OracleJDE)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_projectActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_projectActions', ['button_projectActions_internalRoleButtonName': button_projectActions_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC128/Step 7-Click on button projectActions OracleJDE.png')

"Step 8: Click on link ViewAllProjects -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_ViewAllProjects'))

WebUI.takeScreenshot(reportLocation + '/TC128/Step 8-Click on link ViewAllProjects - Navigate to page .png')

"Step 9: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC128-View All Projects from Organization Home_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}