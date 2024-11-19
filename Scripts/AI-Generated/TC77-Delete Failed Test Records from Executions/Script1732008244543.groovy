import internal.GlobalVariable
import truetest.custom.TrueTestScripts
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.common.deleteFailedTestRecords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
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

TrueTestScripts.navigate("organization/*/home")

"Step 4: Click on link executionDetails (bookParticipants) -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/link_executionDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/link_executionDetails', ['link_executionDetails_class': link_executionDetails_class, 'link_executionDetails_nthChild': link_executionDetails_nthChild, 'link_executionDetails_internalRoleLinkName': link_executionDetails_internalRoleLinkName, 'project_id': project_id, 'executions_id': executions_id, 'team_id': team_id]))

WebUI.takeScreenshot(reportLocation + '/TC77/Step 4-Click on link executionDetails bookParticipants - Navigate to page teamprojectexecutions.png')

"Step 5: Click on div loadingSpinner"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_loadingSpinner'))

WebUI.takeScreenshot(reportLocation + '/TC77/Step 5-Click on div loadingSpinner.png')

"Step 6: Click on div loadingSpinner"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_loadingSpinner'))

WebUI.takeScreenshot(reportLocation + '/TC77/Step 6-Click on div loadingSpinner.png')

"Step 7: Click on link testRuns2 -> Navigate to page 'team/*/project/*/overview'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_testRuns2_1'))

WebUI.takeScreenshot(reportLocation + '/TC77/Step 7-Click on link testRuns2 - Navigate to page teamprojectoverview.png')

"Step 8: Click on link testRuns"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/overview?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_overview/link_testRuns_1'))

WebUI.takeScreenshot(reportLocation + '/TC77/Step 8-Click on link testRuns.png')

"Step 9: Delete records of failed tests from the system."

deleteFailedTestRecords.execute(data_path_0, Integer.valueOf(index_0))

"Step 10: Delete records of failed tests from the system."

deleteFailedTestRecords.execute(data_path_1, Integer.valueOf(index_1))

"Step 11: Click on link testRuns3 -> Navigate to page 'team/*/project/*/overview'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_testRuns3'))

WebUI.takeScreenshot(reportLocation + '/TC77/Step 11-Click on link testRuns3 - Navigate to page teamprojectoverview.png')

"Step 12: Click on link testRuns -> Navigate to page 'team/*/project/*/executions'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/overview?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_overview/link_testRuns_1'))

WebUI.takeScreenshot(reportLocation + '/TC77/Step 12-Click on link testRuns - Navigate to page teamprojectexecutions.png')

"Step 13: Click on button DeleteExecution"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_DeleteExecution'))

WebUI.takeScreenshot(reportLocation + '/TC77/Step 13-Click on button DeleteExecution.png')

"Step 14: Click on button delete"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_delete'))

WebUI.takeScreenshot(reportLocation + '/TC77/Step 14-Click on button delete.png')

"Step 15: Click on button object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_object'))

WebUI.takeScreenshot(reportLocation + '/TC77/Step 15-Click on button object.png')

"Step 16: Click on button terribethBeasley"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_terribethBeasley'))

WebUI.takeScreenshot(reportLocation + '/TC77/Step 16-Click on button terribethBeasley.png')

"Step 17: Click on div object2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_object2'))

WebUI.takeScreenshot(reportLocation + '/TC77/Step 17-Click on div object2.png')

"Step 18: Click on label failedTests (failed655)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/label_failedTests"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/label_failedTests', ['label_failedTests_for': label_failedTests_for, 'label_failedTests_internalRoleRowName': label_failedTests_internalRoleRowName]))

WebUI.takeScreenshot(reportLocation + '/TC77/Step 18-Click on label failedTests failed655.png')

"Step 19: Click on label failedTests (failed654)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/label_failedTests"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/label_failedTests', ['label_failedTests_for': label_failedTests_for_1, 'label_failedTests_internalRoleRowName': label_failedTests_internalRoleRowName_1]))

WebUI.takeScreenshot(reportLocation + '/TC77/Step 19-Click on label failedTests failed654.png')

"Step 20: Click on button delete2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_delete2'))

WebUI.takeScreenshot(reportLocation + '/TC77/Step 20-Click on button delete2.png')

"Step 21: Click on button Delete"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_Delete_1'))

WebUI.takeScreenshot(reportLocation + '/TC77/Step 21-Click on button Delete.png')

"Step 22: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC77-Delete Failed Test Records from Executions_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}