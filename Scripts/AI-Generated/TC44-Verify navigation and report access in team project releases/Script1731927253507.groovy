import internal.GlobalVariable
import truetest.custom.TrueTestScripts
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
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

"Step 3: Navigate to team/*/project/*/releases"

TrueTestScripts.navigate("team/*/project/*/releases")

"Step 4: Click on link Reports -> Navigate to page 'team/*/project/*/overview'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/releases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_releases/link_Reports'))

WebUI.takeScreenshot(reportLocation + '/TC44/Step 4-Click on link Reports - Navigate to page teamprojectoverview.png')

"Step 5: Click on link TestRuns4 -> Navigate to page 'team/*/project/*/executions'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/overview?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_overview/link_TestRuns4'))

WebUI.takeScreenshot(reportLocation + '/TC44/Step 5-Click on link TestRuns4 - Navigate to page teamprojectexecutions.png')

"Step 6: Click on link executionDetails (TestRunID2) -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/link_executionDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/link_executionDetails', ['link_executionDetails_trNthChild': link_executionDetails_trNthChild, 'link_executionDetails_internalRoleLinkName': link_executionDetails_internalRoleLinkName, 'team_id': team_id, 'project_id': project_id, 'executions_id': executions_id]))

WebUI.takeScreenshot(reportLocation + '/TC44/Step 6-Click on link executionDetails TestRunID2 - Navigate to page teamprojectexecutions.png')

"Step 7: Click on button LinkToRelease"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_LinkToRelease'))

WebUI.takeScreenshot(reportLocation + '/TC44/Step 7-Click on button LinkToRelease.png')

"Step 8: Click on span testKatalonDetails (RegresiButton)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/span_testKatalonDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/span_testKatalonDetails', ['span_testKatalonDetails_class': span_testKatalonDetails_class, 'span_testKatalonDetails_internalRoleButtonName': span_testKatalonDetails_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC44/Step 8-Click on span testKatalonDetails RegresiButton.png')

"Step 9: Click on link Dashboard -> Navigate to page 'team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_Dashboard'))

WebUI.takeScreenshot(reportLocation + '/TC44/Step 9-Click on link Dashboard - Navigate to page teamproject.png')

"Step 10: Click on link Reports3 -> Navigate to page 'team/*/project/*/overview'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Reports3'))

WebUI.takeScreenshot(reportLocation + '/TC44/Step 10-Click on link Reports3 - Navigate to page teamprojectoverview.png')

"Step 11: Click on link TestRuns4 -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/overview?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_overview/link_TestRuns4'))

WebUI.takeScreenshot(reportLocation + '/TC44/Step 11-Click on link TestRuns4 - Navigate to page teamprojectexecutions.png')

"Step 12: Click on button LinkToRelease"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_LinkToRelease'))

WebUI.takeScreenshot(reportLocation + '/TC44/Step 12-Click on button LinkToRelease.png')

"Step 13: Click on span testKatalonDetails (RegresiButton) -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/span_testKatalonDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/span_testKatalonDetails', ['span_testKatalonDetails_class': span_testKatalonDetails_class_1, 'span_testKatalonDetails_internalRoleButtonName': span_testKatalonDetails_internalRoleButtonName_1]))

WebUI.takeScreenshot(reportLocation + '/TC44/Step 13-Click on span testKatalonDetails RegresiButton - Navigate to page .png')

"Step 14: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC44-Verify navigation and report access in team project releases_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}