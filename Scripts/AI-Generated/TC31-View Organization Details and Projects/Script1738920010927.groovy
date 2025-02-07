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

"Step 1: Navigate to organization/*/home"

TrueTestScripts.navigate("organization/${GlobalVariable.organization_id}/home")

"Step 2: Click on span DXCPracticeOracle"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_home/span_DXCPracticeOracle'))

WebUI.takeScreenshot(reportLocation + '/TC31/Step 2-Click on span DXCPracticeOracle.png')

"Step 3: Click on div currentDivisi (CurrentDP)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/div_currentDivisi"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/div_currentDivisi', ['div_currentDivisi_internalHasText': div_currentDivisi_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC31/Step 3-Click on div currentDivisi CurrentDP.png')

"Step 4: Click on link organizationDetails (OJOracleJDE) -> Navigate to page 'team project#team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/link_organizationDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/link_organizationDetails', ['link_organizationDetails_internalRoleLinkName': link_organizationDetails_internalRoleLinkName, 'project_id': project_id, 'team_id': team_id]))

WebUI.takeScreenshot(reportLocation + '/TC31/Step 4-Click on link organizationDetails OJOracleJDE - Navigate to page team projectteamproject.png')

"Step 5: Click on button OracleJDE"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_OracleJDE'))

WebUI.takeScreenshot(reportLocation + '/TC31/Step 5-Click on button OracleJDE.png')

"Step 6: Click on link ViewAllProjects -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_ViewAllProjects'))

WebUI.takeScreenshot(reportLocation + '/TC31/Step 6-Click on link ViewAllProjects - Navigate to page .png')

"Step 7: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC31-View Organization Details and Projects_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}