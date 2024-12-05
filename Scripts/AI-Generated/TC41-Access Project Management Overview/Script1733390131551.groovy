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

"Step 1: Navigate to http://demo.localhost.direct"

TrueTestScripts.navigate("")

"Step 2: Login into Application"

TrueTestScripts.login()

"Step 3: Navigate to team/*/project/*/*"

TrueTestScripts.navigate("team/${GlobalVariable.team_id}/project/${GlobalVariable.project_id}/${GlobalVariable.path_param_5}")

"Step 4: Click on link reportsAndSettings (Executions4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_reportsAndSettings"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_reportsAndSettings', ['link_reportsAndSettings_nthChild': link_reportsAndSettings_nthChild, 'link_reportsAndSettings_internalRoleLinkName': link_reportsAndSettings_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 4-Click on link reportsAndSettings Executions4.png')

"Step 5: Click on link projectManagementOptions (Schedules)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_projectManagementOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_projectManagementOptions', ['link_projectManagementOptions_nthChild': link_projectManagementOptions_nthChild, 'link_projectManagementOptions_internalRoleLinkName': link_projectManagementOptions_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 5-Click on link projectManagementOptions Schedules.png')

"Step 6: Click on link reportsAndSettings (Reports3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_reportsAndSettings"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_reportsAndSettings', ['link_reportsAndSettings_nthChild': link_reportsAndSettings_nthChild_1, 'link_reportsAndSettings_internalRoleLinkName': link_reportsAndSettings_internalRoleLinkName_1]))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 6-Click on link reportsAndSettings Reports3.png')

"Step 7: Click on link overviewAndTestRuns (TestRuns)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_overviewAndTestRuns"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_overviewAndTestRuns', ['link_overviewAndTestRuns_nthChild': link_overviewAndTestRuns_nthChild]))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 7-Click on link overviewAndTestRuns TestRuns.png')

"Step 8: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC41-Access Project Management Overview_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}