import com.kms.katalon.core.configuration.RunConfiguration
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import internal.GlobalVariable
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

"Step 3: Navigate to /team/*/project/*/releases"

TrueTestScripts.navigate("/team/${GlobalVariable.team_id}/project/${GlobalVariable.project_id}/releases")

"Step 4: Click on link reports -> Navigate to page '/team/*/project/*/overview'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/releases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_releases/link_reports'))

WebUI.takeScreenshot(reportLocation + '/TC137/Step 4-Click on link reports - Navigate to page teamprojectoverview.png')

"Step 5: Click on link testRuns -> Navigate to page '/team/*/project/*/executions'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/overview?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_overview/link_testRuns'))

WebUI.takeScreenshot(reportLocation + '/TC137/Step 5-Click on link testRuns - Navigate to page teamprojectexecutions.png')

"Step 6: Click on link executionLinks (ExecutionDetail) -> Navigate to page '/team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/link_executionLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/link_executionLinks', ['link_executionLinks_trNthChild': link_executionLinks_trNthChild, 'link_executionLinks_internalRoleLinkName': link_executionLinks_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC137/Step 6-Click on link executionLinks ExecutionDetail - Navigate to page teamprojectexecutions.png')

"Step 7: Click on button LinkToRelease"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_LinkToRelease'))

WebUI.takeScreenshot(reportLocation + '/TC137/Step 7-Click on button LinkToRelease.png')

"Step 8: Click on span testKatalonVersions (regressionButton)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/span_testKatalonVersions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/span_testKatalonVersions', ['span_testKatalonVersions_class': span_testKatalonVersions_class, 'span_testKatalonVersions_internalRoleButtonName': span_testKatalonVersions_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC137/Step 8-Click on span testKatalonVersions regressionButton.png')

"Step 9: Click on link dashboard -> Navigate to page '/team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_dashboard'))

WebUI.takeScreenshot(reportLocation + '/TC137/Step 9-Click on link dashboard - Navigate to page teamproject.png')

"Step 10: Click on link reports -> Navigate to page '/team/*/project/*/overview'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_reports'))

WebUI.takeScreenshot(reportLocation + '/TC137/Step 10-Click on link reports - Navigate to page teamprojectoverview.png')

"Step 11: Click on link testRuns -> Navigate to page '/team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/overview?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_overview/link_testRuns'))

WebUI.takeScreenshot(reportLocation + '/TC137/Step 11-Click on link testRuns - Navigate to page teamprojectexecutions.png')

"Step 12: Click on button LinkToRelease"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_LinkToRelease'))

WebUI.takeScreenshot(reportLocation + '/TC137/Step 12-Click on button LinkToRelease.png')

"Step 13: Click on span testKatalonVersions (regressionButton) -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/span_testKatalonVersions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/span_testKatalonVersions', ['span_testKatalonVersions_class': span_testKatalonVersions_class_1, 'span_testKatalonVersions_internalRoleButtonName': span_testKatalonVersions_internalRoleButtonName_1]))

WebUI.takeScreenshot(reportLocation + '/TC137/Step 13-Click on span testKatalonVersions regressionButton - Navigate to page .png')

"Step 14: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC137-Link Test Runs to Releases and Verify_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}