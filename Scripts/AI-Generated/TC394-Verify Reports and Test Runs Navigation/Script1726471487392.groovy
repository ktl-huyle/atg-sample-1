import internal.GlobalVariable
import katalon.truetest.TrueTestScripts
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

"Step 3: Navigate to team/*/project/*/*"

TrueTestScripts.navigate("team/${GlobalVariable.team_id}/project/${GlobalVariable.project_id}/${GlobalVariable.path_param_5}")

"Step 4: Click on link reports4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_reports4'))

WebUI.takeScreenshot(reportLocation + '/TC394/Step 4-Click on link reports4.png')

"Step 5: Click on link testRuns6"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_testRuns6'))

WebUI.takeScreenshot(reportLocation + '/TC394/Step 5-Click on link testRuns6.png')

"Step 6: Click on link executionObjects (executions12) -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_executionObjects"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_executionObjects', ['link_executionObjects_trNthChild': link_executionObjects_trNthChild, 'link_executionObjects_internalRoleLinkName': link_executionObjects_internalRoleLinkName, 'link_executionObjects_project_id': link_executionObjects_project_id, 'link_executionObjects_team_id': link_executionObjects_team_id, 'link_executionObjects_executions_id': link_executionObjects_executions_id]))

WebUI.takeScreenshot(reportLocation + '/TC394/Step 6-Click on link executionObjects executions12 - Navigate to page teamprojectexecutions.png')

"Step 7: Click on div testCaseDetails (object4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/div_testCaseDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/div_testCaseDetails', ['div_testCaseDetails_class': div_testCaseDetails_class, 'div_testCaseDetails_internalText': div_testCaseDetails_internalText, 'div_testCaseDetails_nth': div_testCaseDetails_nth]))

WebUI.takeScreenshot(reportLocation + '/TC394/Step 7-Click on div testCaseDetails object4.png')

"Step 8: Click on div testCaseDetails (object4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/div_testCaseDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/div_testCaseDetails', ['div_testCaseDetails_class': div_testCaseDetails_class_1, 'div_testCaseDetails_internalText': div_testCaseDetails_internalText_1, 'div_testCaseDetails_nth': div_testCaseDetails_nth_1]))

WebUI.takeScreenshot(reportLocation + '/TC394/Step 8-Click on div testCaseDetails object4.png')

"Step 9: Click on link reports"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_reports'))

WebUI.takeScreenshot(reportLocation + '/TC394/Step 9-Click on link reports.png')

"Step 10: Click on link executionSettings (executions) -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/link_executionSettings"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/link_executionSettings', ['link_executionSettings_internalRoleLinkName': link_executionSettings_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC394/Step 10-Click on link executionSettings executions - Navigate to page teamproject.png')

"Step 11: Click on link reports4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_reports4'))

WebUI.takeScreenshot(reportLocation + '/TC394/Step 11-Click on link reports4.png')

"Step 12: Click on link testRuns6"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_testRuns6'))

WebUI.takeScreenshot(reportLocation + '/TC394/Step 12-Click on link testRuns6.png')

"Step 13: Click on link executionObjects (executions12) -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_executionObjects"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_executionObjects', ['link_executionObjects_trNthChild': link_executionObjects_trNthChild_1, 'link_executionObjects_internalRoleLinkName': link_executionObjects_internalRoleLinkName_1, 'link_executionObjects_project_id': link_executionObjects_project_id_1, 'link_executionObjects_team_id': link_executionObjects_team_id_1, 'link_executionObjects_executions_id': link_executionObjects_executions_id_1]))

WebUI.takeScreenshot(reportLocation + '/TC394/Step 13-Click on link executionObjects executions12 - Navigate to page teamprojectexecutions.png')

"Step 14: Click on div sidebarLayoutRightSidebar2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_sidebarLayoutRightSidebar2'))

WebUI.takeScreenshot(reportLocation + '/TC394/Step 14-Click on div sidebarLayoutRightSidebar2.png')

"Step 15: Click on div sidebarLayoutRightSidebar2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_sidebarLayoutRightSidebar2'))

WebUI.takeScreenshot(reportLocation + '/TC394/Step 15-Click on div sidebarLayoutRightSidebar2.png')

"Step 16: Click on link reports"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_reports'))

WebUI.takeScreenshot(reportLocation + '/TC394/Step 16-Click on link reports.png')

"Step 17: Click on link testRuns2 -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_testRuns2_1'))

WebUI.takeScreenshot(reportLocation + '/TC394/Step 17-Click on link testRuns2 - Navigate to page teamproject.png')

"Step 18: Click on link testRuns6"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_testRuns6'))

WebUI.takeScreenshot(reportLocation + '/TC394/Step 18-Click on link testRuns6.png')

"Step 19: Click on link executionObjects (executions13) -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_executionObjects"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_executionObjects', ['link_executionObjects_trNthChild': link_executionObjects_trNthChild_2, 'link_executionObjects_internalRoleLinkName': link_executionObjects_internalRoleLinkName_2, 'link_executionObjects_project_id': link_executionObjects_project_id_2, 'link_executionObjects_team_id': link_executionObjects_team_id_2, 'link_executionObjects_executions_id': link_executionObjects_executions_id_2]))

WebUI.takeScreenshot(reportLocation + '/TC394/Step 19-Click on link executionObjects executions13 - Navigate to page teamprojectexecutions.png')

"Step 20: Click on div sidebarLayoutRightSidebar2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_sidebarLayoutRightSidebar2'))

WebUI.takeScreenshot(reportLocation + '/TC394/Step 20-Click on div sidebarLayoutRightSidebar2.png')

"Step 21: Click on div sidebarLayoutRightSidebar2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_sidebarLayoutRightSidebar2'))

WebUI.takeScreenshot(reportLocation + '/TC394/Step 21-Click on div sidebarLayoutRightSidebar2.png')

"Step 22: Click on div object5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_object5'))

WebUI.takeScreenshot(reportLocation + '/TC394/Step 22-Click on div object5.png')

"Step 23: Click on div object5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_object5'))

WebUI.takeScreenshot(reportLocation + '/TC394/Step 23-Click on div object5.png')

"Step 24: Click on div object5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_object5'))

WebUI.takeScreenshot(reportLocation + '/TC394/Step 24-Click on div object5.png')

"Step 25: Click on div object5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_object5'))

WebUI.takeScreenshot(reportLocation + '/TC394/Step 25-Click on div object5.png')

"Step 26: Click on div object5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_object5'))

WebUI.takeScreenshot(reportLocation + '/TC394/Step 26-Click on div object5.png')

"Step 27: Click on div object5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_object5'))

WebUI.takeScreenshot(reportLocation + '/TC394/Step 27-Click on div object5.png')

"Step 28: Click on div object5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_object5'))

WebUI.takeScreenshot(reportLocation + '/TC394/Step 28-Click on div object5.png')

"Step 29: Click on div sidebarLayoutRightSidebar2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_sidebarLayoutRightSidebar2'))

WebUI.takeScreenshot(reportLocation + '/TC394/Step 29-Click on div sidebarLayoutRightSidebar2.png')

"Step 30: Click on div sidebarLayoutRightSidebar2 -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_sidebarLayoutRightSidebar2'))

WebUI.takeScreenshot(reportLocation + '/TC394/Step 30-Click on div sidebarLayoutRightSidebar2 - Navigate to page .png')

"Step 31: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC394-Verify Reports and Test Runs Navigation_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}