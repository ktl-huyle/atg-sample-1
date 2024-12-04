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
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/link_participantManagement', ['link_participantManagement_class': link_participantManagement_class, 'link_participantManagement_nthChild': link_participantManagement_nthChild, 'link_participantManagement_internalRoleLinkName': link_participantManagement_internalRoleLinkName, 'executions_id': executions_id, 'project_id': project_id, 'team_id': team_id]))

WebUI.takeScreenshot(reportLocation + '/TC97/Step 4-Click on link participantManagement bookParticipants - Navigate to page teamprojectexecutions.png')

"Step 5: Click on div loadingSpinner"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_loadingSpinner'))

WebUI.takeScreenshot(reportLocation + '/TC97/Step 5-Click on div loadingSpinner.png')

"Step 6: Click on div loadingSpinner"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_loadingSpinner'))

WebUI.takeScreenshot(reportLocation + '/TC97/Step 6-Click on div loadingSpinner.png')

"Step 7: Click on link testRuns -> Navigate to page 'team/*/project/*/overview'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_testRuns_1'))

WebUI.takeScreenshot(reportLocation + '/TC97/Step 7-Click on link testRuns - Navigate to page teamprojectoverview.png')

"Step 8: Click on link testRuns -> Navigate to page 'team/*/project/*/executions'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/overview?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_overview/link_testRuns_1'))

WebUI.takeScreenshot(reportLocation + '/TC97/Step 8-Click on link testRuns - Navigate to page teamprojectexecutions.png')

"Step 9: Click on label failed (Failed652)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/label_failed"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/label_failed', ['label_failed_for': label_failed_for, 'label_failed_internalRoleRowName': label_failed_internalRoleRowName]))

WebUI.takeScreenshot(reportLocation + '/TC97/Step 9-Click on label failed Failed652.png')

"Step 10: Click on label failed (Failed651)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/label_failed"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/label_failed', ['label_failed_for': label_failed_for_1, 'label_failed_internalRoleRowName': label_failed_internalRoleRowName_1]))

WebUI.takeScreenshot(reportLocation + '/TC97/Step 10-Click on label failed Failed651.png')

"Step 11: Click on label failed (Failed650)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/label_failed"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/label_failed', ['label_failed_for': label_failed_for_2, 'label_failed_internalRoleRowName': label_failed_internalRoleRowName_2]))

WebUI.takeScreenshot(reportLocation + '/TC97/Step 11-Click on label failed Failed650.png')

"Step 12: Click on button Delete"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_Delete'))

WebUI.takeScreenshot(reportLocation + '/TC97/Step 12-Click on button Delete.png')

"Step 13: Click on button Delete2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_Delete2'))

WebUI.takeScreenshot(reportLocation + '/TC97/Step 13-Click on button Delete2.png')

"Step 14: Click on label failed (Failed652)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/label_failed"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/label_failed', ['label_failed_for': label_failed_for_3, 'label_failed_internalRoleRowName': label_failed_internalRoleRowName_3]))

WebUI.takeScreenshot(reportLocation + '/TC97/Step 14-Click on label failed Failed652.png')

"Step 15: Click on label failed (Failed651)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/label_failed"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/label_failed', ['label_failed_for': label_failed_for_4, 'label_failed_internalRoleRowName': label_failed_internalRoleRowName_4]))

WebUI.takeScreenshot(reportLocation + '/TC97/Step 15-Click on label failed Failed651.png')

"Step 16: Click on label failed (Failed650)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/label_failed"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/label_failed', ['label_failed_for': label_failed_for_5, 'label_failed_internalRoleRowName': label_failed_internalRoleRowName_5]))

WebUI.takeScreenshot(reportLocation + '/TC97/Step 16-Click on label failed Failed650.png')

"Step 17: Click on button Delete"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_Delete'))

WebUI.takeScreenshot(reportLocation + '/TC97/Step 17-Click on button Delete.png')

"Step 18: Click on button Delete2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_Delete2'))

WebUI.takeScreenshot(reportLocation + '/TC97/Step 18-Click on button Delete2.png')

"Step 19: Click on link testRuns2 -> Navigate to page 'team/*/project/*/overview'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_testRuns2_1'))

WebUI.takeScreenshot(reportLocation + '/TC97/Step 19-Click on link testRuns2 - Navigate to page teamprojectoverview.png')

"Step 20: Click on link TestRuns3 -> Navigate to page 'team/*/project/*/executions'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/overview?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_overview/link_testRuns_1'))

WebUI.takeScreenshot(reportLocation + '/TC97/Step 20-Click on link TestRuns3 - Navigate to page teamprojectexecutions.png')

"Step 21: Click on button DeleteExecution"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_DeleteExecution'))

WebUI.takeScreenshot(reportLocation + '/TC97/Step 21-Click on button DeleteExecution.png')

"Step 22: Click on button delete"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_delete_1'))

WebUI.takeScreenshot(reportLocation + '/TC97/Step 22-Click on button delete.png')

"Step 23: Click on button object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_object'))

WebUI.takeScreenshot(reportLocation + '/TC97/Step 23-Click on button object.png')

"Step 24: Click on button terribethBeasley"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_terribethBeasley'))

WebUI.takeScreenshot(reportLocation + '/TC97/Step 24-Click on button terribethBeasley.png')

"Step 25: Click on div object2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_object2_1'))

WebUI.takeScreenshot(reportLocation + '/TC97/Step 25-Click on div object2.png')

"Step 26: Click on label failed (failed655)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/label_failed"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/label_failed', ['label_failed_for': label_failed_for_6, 'label_failed_internalRoleRowName': label_failed_internalRoleRowName_6]))

WebUI.takeScreenshot(reportLocation + '/TC97/Step 26-Click on label failed failed655.png')

"Step 27: Click on label failed (failed654)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/label_failed"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/label_failed', ['label_failed_for': label_failed_for_7, 'label_failed_internalRoleRowName': label_failed_internalRoleRowName_7]))

WebUI.takeScreenshot(reportLocation + '/TC97/Step 27-Click on label failed failed654.png')

"Step 28: Click on button delete2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_Delete'))

WebUI.takeScreenshot(reportLocation + '/TC97/Step 28-Click on button delete2.png')

"Step 29: Click on button Delete2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_Delete2'))

WebUI.takeScreenshot(reportLocation + '/TC97/Step 29-Click on button Delete2.png')

"Step 30: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC97-Verify Deletion of Failed Test Runs_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}