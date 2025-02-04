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

"Step 1: Navigate to team/*/project/*/executions"

TrueTestScripts.navigate("team/${GlobalVariable.team_id}/project/${GlobalVariable.project_id}/executions")

"Step 2: Click on div sortingInfo (sortingInfo)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "Archived/Archived_20250204/Dynamic Objects/Page_team_project_executions/div_sortingInfo"
WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Dynamic Objects/Page_team_project_executions/div_sortingInfo', ['div_sortingInfo_internalText': div_sortingInfo_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 2-Click on div sortingInfo sortingInfo.png')

"Step 3: Click on span startedTime"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Page_team_project_executions/span_startedTime'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 3-Click on span startedTime.png')

"Step 4: Click on div sortingInfo (sortingInfo2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "Archived/Archived_20250204/Dynamic Objects/Page_team_project_executions/div_sortingInfo"
WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Dynamic Objects/Page_team_project_executions/div_sortingInfo', ['div_sortingInfo_internalText': div_sortingInfo_internalText_1]))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 4-Click on div sortingInfo sortingInfo2.png')

"Step 5: Click on div cardBody"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Page_team_project_executions/div_cardBody'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 5-Click on div cardBody.png')

"Step 6: Click on div testIssues (testCaseCell)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Dynamic Objects/Page_team_project_executions/div_testIssues'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 6-Click on div testIssues testCaseCell.png')

"Step 7: Click on td loadingStatus"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Page_team_project_executions/td_loadingStatus'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 7-Click on td loadingStatus.png')

"Step 8: Click on link testRunDetails"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Page_team_project_executions/link_testRunDetails'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 8-Click on link testRunDetails.png')

"Step 9: Click on div testCaseLabel"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Page_team_project_executions/div_testCaseLabel'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 9-Click on div testCaseLabel.png')

"Step 10: Click on link testRunDetails -> Navigate to page 'team project executions#team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Page_team_project_executions/link_testRunDetails'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 10-Click on link testRunDetails - Navigate to page team project executionsteamprojectexecutions.png')

"Step 11: Click on div failedTestResults"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Page_team_project_executions/div_failedTestResults'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 11-Click on div failedTestResults.png')

"Step 12: Click on td testCaseCell"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Page_team_project_executions/td_testCaseCell'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 12-Click on td testCaseCell.png')

"Step 13: Click on div testCaseDescription -> Navigate to page 'team project executions#team/*/project/*/executions'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Page_team_project_executions/div_testCaseDescription'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 13-Click on div testCaseDescription - Navigate to page team project executionsteamprojectexecutions.png')

"Step 14: Click on div allTestRuns"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Page_team_project_executions/div_allTestRuns'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 14-Click on div allTestRuns.png')

"Step 15: Click on div allTestRuns"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Page_team_project_executions/div_allTestRuns'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 15-Click on div allTestRuns.png')

"Step 16: Click on link testRunDetails"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Page_team_project_executions/link_testRunDetails'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 16-Click on link testRunDetails.png')

"Step 17: Click on link testRunDetails -> Navigate to page 'team project executions#team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Page_team_project_executions/link_testRunDetails'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 17-Click on link testRunDetails - Navigate to page team project executionsteamprojectexecutions.png')

"Step 18: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC14-View Test Run Details and Verify Executions_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}