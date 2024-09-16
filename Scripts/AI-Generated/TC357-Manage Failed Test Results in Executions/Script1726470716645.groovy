import internal.GlobalVariable
import com.kms.katalon.core.configuration.RunConfiguration
import katalon.truetest.TrueTestScripts
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

TrueTestScripts.navigate("organization/${GlobalVariable.organization_id}/home")

"Step 4: Click on link participantDetails (bookParticipants) -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/link_participantDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/link_participantDetails', ['link_participantDetails_class': link_participantDetails_class, 'link_participantDetails_internalRoleLinkName': link_participantDetails_internalRoleLinkName, 'link_participantDetails_project_id': link_participantDetails_project_id, 'link_participantDetails_executions_id': link_participantDetails_executions_id, 'link_participantDetails_team_id': link_participantDetails_team_id]))

WebUI.takeScreenshot(reportLocation + '/TC357/Step 4-Click on link participantDetails bookParticipants - Navigate to page teamprojectexecutions.png')

"Step 5: Click on div loadingSpinner"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_loadingSpinner'))

WebUI.takeScreenshot(reportLocation + '/TC357/Step 5-Click on div loadingSpinner.png')

"Step 6: Click on div loadingSpinner"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_loadingSpinner'))

WebUI.takeScreenshot(reportLocation + '/TC357/Step 6-Click on div loadingSpinner.png')

"Step 7: Click on link testRuns -> Navigate to page 'team/*/project/*/overview'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_testRuns_1'))

WebUI.takeScreenshot(reportLocation + '/TC357/Step 7-Click on link testRuns - Navigate to page teamprojectoverview.png')

"Step 8: Click on link testRuns2 -> Navigate to page 'team/*/project/*/executions'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/overview?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_overview/link_testRuns2'))

WebUI.takeScreenshot(reportLocation + '/TC357/Step 8-Click on link testRuns2 - Navigate to page teamprojectexecutions.png')

"Step 9: Click on label failedTestResults (failed652FailedSisbook)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/label_failedTestResults"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/label_failedTestResults', ['label_failedTestResults_for': label_failedTestResults_for, 'label_failedTestResults_internalRoleRowName': label_failedTestResults_internalRoleRowName]))

WebUI.takeScreenshot(reportLocation + '/TC357/Step 9-Click on label failedTestResults failed652FailedSisbook.png')

"Step 10: Click on label failedTestResults (failed651FailedSisbook)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/label_failedTestResults"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/label_failedTestResults', ['label_failedTestResults_for': label_failedTestResults_for_1, 'label_failedTestResults_internalRoleRowName': label_failedTestResults_internalRoleRowName_1]))

WebUI.takeScreenshot(reportLocation + '/TC357/Step 10-Click on label failedTestResults failed651FailedSisbook.png')

"Step 11: Click on label failedTestResults (failed650FailedSisbook)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/label_failedTestResults"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/label_failedTestResults', ['label_failedTestResults_for': label_failedTestResults_for_2, 'label_failedTestResults_internalRoleRowName': label_failedTestResults_internalRoleRowName_2]))

WebUI.takeScreenshot(reportLocation + '/TC357/Step 11-Click on label failedTestResults failed650FailedSisbook.png')

"Step 12: Click on button delete"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_delete2'))

WebUI.takeScreenshot(reportLocation + '/TC357/Step 12-Click on button delete.png')

"Step 13: Click on button delete2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_delete3'))

WebUI.takeScreenshot(reportLocation + '/TC357/Step 13-Click on button delete2.png')

"Step 14: Click on label failedTestResults (failed652FailedSisbook)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/label_failedTestResults"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/label_failedTestResults', ['label_failedTestResults_for': label_failedTestResults_for_3, 'label_failedTestResults_internalRoleRowName': label_failedTestResults_internalRoleRowName_3]))

WebUI.takeScreenshot(reportLocation + '/TC357/Step 14-Click on label failedTestResults failed652FailedSisbook.png')

"Step 15: Click on label failedTestResults (failed651FailedSisbook)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/label_failedTestResults"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/label_failedTestResults', ['label_failedTestResults_for': label_failedTestResults_for_4, 'label_failedTestResults_internalRoleRowName': label_failedTestResults_internalRoleRowName_4]))

WebUI.takeScreenshot(reportLocation + '/TC357/Step 15-Click on label failedTestResults failed651FailedSisbook.png')

"Step 16: Click on label failedTestResults (failed650FailedSisbook)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/label_failedTestResults"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/label_failedTestResults', ['label_failedTestResults_for': label_failedTestResults_for_5, 'label_failedTestResults_internalRoleRowName': label_failedTestResults_internalRoleRowName_5]))

WebUI.takeScreenshot(reportLocation + '/TC357/Step 16-Click on label failedTestResults failed650FailedSisbook.png')

"Step 17: Click on button delete"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_delete2'))

WebUI.takeScreenshot(reportLocation + '/TC357/Step 17-Click on button delete.png')

"Step 18: Click on button delete2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_delete3'))

WebUI.takeScreenshot(reportLocation + '/TC357/Step 18-Click on button delete2.png')

"Step 19: Click on link testRuns2 -> Navigate to page 'team/*/project/*/overview'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_testRuns2'))

WebUI.takeScreenshot(reportLocation + '/TC357/Step 19-Click on link testRuns2 - Navigate to page teamprojectoverview.png')

"Step 20: Click on link testRuns2 -> Navigate to page 'team/*/project/*/executions'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/overview?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_overview/link_testRuns2'))

WebUI.takeScreenshot(reportLocation + '/TC357/Step 20-Click on link testRuns2 - Navigate to page teamprojectexecutions.png')

"Step 21: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC357-Manage Failed Test Results in Executions_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}