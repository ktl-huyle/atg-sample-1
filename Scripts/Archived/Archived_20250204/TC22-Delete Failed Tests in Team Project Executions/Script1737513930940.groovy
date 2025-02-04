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

"Step 2: Click on link testExecution (object) -> Navigate to page 'team project executions#team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "Archived/Archived_20250204/Dynamic Objects/Page_organization_home/link_testExecution"
WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Dynamic Objects/Page_organization_home/link_testExecution', ['link_testExecution_class': link_testExecution_class, 'link_testExecution_internalRoleLinkName': link_testExecution_internalRoleLinkName, 'project_id': project_id, 'executions_id': executions_id, 'team_id': team_id]))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 2-Click on link testExecution object - Navigate to page team project executionsteamprojectexecutions.png')

"Step 3: Click on div loadingSpinner"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Page_team_project_executions/div_loadingSpinner'))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 3-Click on div loadingSpinner.png')

"Step 4: Click on div loadingSpinner"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Page_team_project_executions/div_loadingSpinner'))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 4-Click on div loadingSpinner.png')

"Step 5: Click on link testRuns2 -> Navigate to page 'team project overview#team/*/project/*/overview'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Page_team_project_executions/link_testRuns2'))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 5-Click on link testRuns2 - Navigate to page team project overviewteamprojectoverview.png')

"Step 6: Click on link testRuns4 -> Navigate to page 'team project executions#team/*/project/*/executions'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/overview?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Page_team_project_overview/link_testRuns4'))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 6-Click on link testRuns4 - Navigate to page team project executionsteamprojectexecutions.png')

"Step 7: Click on label failedTests (failed652)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "Archived/Archived_20250204/Dynamic Objects/Page_team_project_executions/label_failedTests"
WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Dynamic Objects/Page_team_project_executions/label_failedTests', ['label_failedTests_for': label_failedTests_for, 'label_failedTests_internalRoleRowName': label_failedTests_internalRoleRowName]))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 7-Click on label failedTests failed652.png')

"Step 8: Click on label failedTests (failed651)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "Archived/Archived_20250204/Dynamic Objects/Page_team_project_executions/label_failedTests"
WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Dynamic Objects/Page_team_project_executions/label_failedTests', ['label_failedTests_for': label_failedTests_for_1, 'label_failedTests_internalRoleRowName': label_failedTests_internalRoleRowName_1]))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 8-Click on label failedTests failed651.png')

"Step 9: Click on label failedTests (failed650)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "Archived/Archived_20250204/Dynamic Objects/Page_team_project_executions/label_failedTests"
WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Dynamic Objects/Page_team_project_executions/label_failedTests', ['label_failedTests_for': label_failedTests_for_2, 'label_failedTests_internalRoleRowName': label_failedTests_internalRoleRowName_2]))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 9-Click on label failedTests failed650.png')

"Step 10: Click on button delete"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Page_team_project_executions/button_delete'))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 10-Click on button delete.png')

"Step 11: Click on button delete2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Page_team_project_executions/button_delete2'))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 11-Click on button delete2.png')

"Step 12: Click on label failedTests (failed652)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "Archived/Archived_20250204/Dynamic Objects/Page_team_project_executions/label_failedTests"
WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Dynamic Objects/Page_team_project_executions/label_failedTests', ['label_failedTests_for': label_failedTests_for_3, 'label_failedTests_internalRoleRowName': label_failedTests_internalRoleRowName_3]))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 12-Click on label failedTests failed652.png')

"Step 13: Click on label failedTests (failed651)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "Archived/Archived_20250204/Dynamic Objects/Page_team_project_executions/label_failedTests"
WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Dynamic Objects/Page_team_project_executions/label_failedTests', ['label_failedTests_for': label_failedTests_for_4, 'label_failedTests_internalRoleRowName': label_failedTests_internalRoleRowName_4]))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 13-Click on label failedTests failed651.png')

"Step 14: Click on label failedTests (failed650)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "Archived/Archived_20250204/Dynamic Objects/Page_team_project_executions/label_failedTests"
WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Dynamic Objects/Page_team_project_executions/label_failedTests', ['label_failedTests_for': label_failedTests_for_5, 'label_failedTests_internalRoleRowName': label_failedTests_internalRoleRowName_5]))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 14-Click on label failedTests failed650.png')

"Step 15: Click on button delete"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Page_team_project_executions/button_delete'))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 15-Click on button delete.png')

"Step 16: Click on button delete2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Page_team_project_executions/button_delete2'))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 16-Click on button delete2.png')

"Step 17: Click on link testRuns3 -> Navigate to page 'team project overview#team/*/project/*/overview'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Page_team_project_executions/link_testRuns3'))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 17-Click on link testRuns3 - Navigate to page team project overviewteamprojectoverview.png')

"Step 18: Click on link testRuns4 -> Navigate to page 'team project executions#team/*/project/*/executions'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/overview?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Page_team_project_overview/link_testRuns4'))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 18-Click on link testRuns4 - Navigate to page team project executionsteamprojectexecutions.png')

"Step 19: Click on button deleteExecution"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Page_team_project_executions/button_deleteExecution'))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 19-Click on button deleteExecution.png')

"Step 20: Click on button delete3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Page_team_project_executions/button_delete3'))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 20-Click on button delete3.png')

"Step 21: Click on button object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Page_team_project_executions/button_object'))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 21-Click on button object.png')

"Step 22: Click on button terribethBeasley -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Page_team_project_executions/button_terribethBeasley'))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 22-Click on button terribethBeasley - Navigate to page .png')

"Step 23: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC22-Delete Failed Tests in Team Project Executions_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}