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

"Step 3: Navigate to organization/*/home"

TrueTestScripts.navigate("organization/${GlobalVariable.organization_id}/home")

"Step 4: Click on link participantManagement (bookParticipants) -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/link_participantManagement"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/link_participantManagement', ['link_participantManagement_nthChild': link_participantManagement_nthChild, 'link_participantManagement_class': link_participantManagement_class, 'link_participantManagement_internalRoleLinkName': link_participantManagement_internalRoleLinkName, 'team_id': team_id, 'executions_id': executions_id, 'project_id': project_id]))

WebUI.takeScreenshot(reportLocation + '/TC35/Step 4-Click on link participantManagement bookParticipants - Navigate to page teamprojectexecutions.png')

"Step 5: Click on div loadingSpinner"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_loadingSpinner'))

WebUI.takeScreenshot(reportLocation + '/TC35/Step 5-Click on div loadingSpinner.png')

"Step 6: Click on div loadingSpinner"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_loadingSpinner'))

WebUI.takeScreenshot(reportLocation + '/TC35/Step 6-Click on div loadingSpinner.png')

"Step 7: Click on link testRuns -> Navigate to page 'team/*/project/*/overview'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_testRuns_1'))

WebUI.takeScreenshot(reportLocation + '/TC35/Step 7-Click on link testRuns - Navigate to page teamprojectoverview.png')

"Step 8: Click on link testRuns -> Navigate to page 'team/*/project/*/executions'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/overview?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_overview/link_testRuns_1'))

WebUI.takeScreenshot(reportLocation + '/TC35/Step 8-Click on link testRuns - Navigate to page teamprojectexecutions.png')

"Step 9: Click on label failedTests (Failed652)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/label_failedTests"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/label_failedTests', ['label_failedTests_for': label_failedTests_for, 'label_failedTests_internalRoleRowName': label_failedTests_internalRoleRowName]))

WebUI.takeScreenshot(reportLocation + '/TC35/Step 9-Click on label failedTests Failed652.png')

"Step 10: Click on label failedTests (Failed651)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/label_failedTests"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/label_failedTests', ['label_failedTests_for': label_failedTests_for_1, 'label_failedTests_internalRoleRowName': label_failedTests_internalRoleRowName_1]))

WebUI.takeScreenshot(reportLocation + '/TC35/Step 10-Click on label failedTests Failed651.png')

"Step 11: Click on label failedTests (Failed650)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/label_failedTests"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/label_failedTests', ['label_failedTests_for': label_failedTests_for_2, 'label_failedTests_internalRoleRowName': label_failedTests_internalRoleRowName_2]))

WebUI.takeScreenshot(reportLocation + '/TC35/Step 11-Click on label failedTests Failed650.png')

"Step 12: Click on button Delete"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_Delete'))

WebUI.takeScreenshot(reportLocation + '/TC35/Step 12-Click on button Delete.png')

"Step 13: Click on button Delete2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_Delete2'))

WebUI.takeScreenshot(reportLocation + '/TC35/Step 13-Click on button Delete2.png')

"Step 14: Click on label failedTests (Failed652)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/label_failedTests"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/label_failedTests', ['label_failedTests_for': label_failedTests_for_3, 'label_failedTests_internalRoleRowName': label_failedTests_internalRoleRowName_3]))

WebUI.takeScreenshot(reportLocation + '/TC35/Step 14-Click on label failedTests Failed652.png')

"Step 15: Click on label failedTests (Failed651)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/label_failedTests"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/label_failedTests', ['label_failedTests_for': label_failedTests_for_4, 'label_failedTests_internalRoleRowName': label_failedTests_internalRoleRowName_4]))

WebUI.takeScreenshot(reportLocation + '/TC35/Step 15-Click on label failedTests Failed651.png')

"Step 16: Click on label failedTests (Failed650)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/label_failedTests"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/label_failedTests', ['label_failedTests_for': label_failedTests_for_5, 'label_failedTests_internalRoleRowName': label_failedTests_internalRoleRowName_5]))

WebUI.takeScreenshot(reportLocation + '/TC35/Step 16-Click on label failedTests Failed650.png')

"Step 17: Click on button Delete"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_Delete'))

WebUI.takeScreenshot(reportLocation + '/TC35/Step 17-Click on button Delete.png')

"Step 18: Click on button Delete2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_Delete2'))

WebUI.takeScreenshot(reportLocation + '/TC35/Step 18-Click on button Delete2.png')

"Step 19: Click on link testRuns2 -> Navigate to page 'team/*/project/*/overview'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_testRuns2_1'))

WebUI.takeScreenshot(reportLocation + '/TC35/Step 19-Click on link testRuns2 - Navigate to page teamprojectoverview.png')

"Step 20: Click on link TestRuns7 -> Navigate to page 'team/*/project/*/executions'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/overview?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_overview/link_testRuns_1'))

WebUI.takeScreenshot(reportLocation + '/TC35/Step 20-Click on link TestRuns7 - Navigate to page teamprojectexecutions.png')

"Step 21: Click on button DeleteExecution"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_DeleteExecution'))

WebUI.takeScreenshot(reportLocation + '/TC35/Step 21-Click on button DeleteExecution.png')

"Step 22: Click on button delete"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_delete_1'))

WebUI.takeScreenshot(reportLocation + '/TC35/Step 22-Click on button delete.png')

"Step 23: Click on button object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_object'))

WebUI.takeScreenshot(reportLocation + '/TC35/Step 23-Click on button object.png')

"Step 24: Click on button terribethBeasley -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_terribethBeasley'))

WebUI.takeScreenshot(reportLocation + '/TC35/Step 24-Click on button terribethBeasley - Navigate to page .png')

"Step 25: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC35-Verify Test Runs Deletion Process_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}