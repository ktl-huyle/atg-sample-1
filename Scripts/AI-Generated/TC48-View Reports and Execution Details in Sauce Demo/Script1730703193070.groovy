import internal.GlobalVariable
import truetest.custom.TrueTestScripts
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.configuration.RunConfiguration
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

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

"Step 4: Click on link Reports5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Reports5_1'))

WebUI.takeScreenshot(reportLocation + '/TC48/Step 4-Click on link Reports5.png')

"Step 5: Click on link TestRuns7"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_TestRuns4'))

WebUI.takeScreenshot(reportLocation + '/TC48/Step 5-Click on link TestRuns7.png')

"Step 6: Click on link executionDetails (TestRun4) -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_executionDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_executionDetails', ['link_executionDetails_trNthChild': link_executionDetails_trNthChild, 'link_executionDetails_internalRoleLinkName': link_executionDetails_internalRoleLinkName, 'link_executionDetails_project_id': link_executionDetails_project_id, 'link_executionDetails_team_id': link_executionDetails_team_id, 'link_executionDetails_executions_id': link_executionDetails_executions_id]))

WebUI.takeScreenshot(reportLocation + '/TC48/Step 6-Click on link executionDetails TestRun4 - Navigate to page teamprojectexecutions.png')

"Step 7: Click on div testCases (TestCase)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/div_testCases"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/div_testCases', ['div_testCases_class': div_testCases_class, 'div_testCases_internalText': div_testCases_internalText, 'div_testCases_nth': div_testCases_nth]))

WebUI.takeScreenshot(reportLocation + '/TC48/Step 7-Click on div testCases TestCase.png')

"Step 8: Click on div testCases (TestCase)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/div_testCases"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/div_testCases', ['div_testCases_class': div_testCases_class_1, 'div_testCases_internalText': div_testCases_internalText_1, 'div_testCases_nth': div_testCases_nth_1]))

WebUI.takeScreenshot(reportLocation + '/TC48/Step 8-Click on div testCases TestCase.png')

"Step 9: Click on link Reports"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_Reports_1'))

WebUI.takeScreenshot(reportLocation + '/TC48/Step 9-Click on link Reports.png')

"Step 10: Click on link executionSettings (Executions) -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/link_executionSettings"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/link_executionSettings', ['link_executionSettings_internalRoleLinkName': link_executionSettings_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC48/Step 10-Click on link executionSettings Executions - Navigate to page teamproject.png')

"Step 11: Click on link Reports5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Reports5_1'))

WebUI.takeScreenshot(reportLocation + '/TC48/Step 11-Click on link Reports5.png')

"Step 12: Click on link TestRuns7"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_TestRuns4'))

WebUI.takeScreenshot(reportLocation + '/TC48/Step 12-Click on link TestRuns7.png')

"Step 13: Click on link executionDetails (TestRun4) -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_executionDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_executionDetails', ['link_executionDetails_trNthChild': link_executionDetails_trNthChild_1, 'link_executionDetails_internalRoleLinkName': link_executionDetails_internalRoleLinkName_1, 'link_executionDetails_project_id': link_executionDetails_project_id_1, 'link_executionDetails_team_id': link_executionDetails_team_id_1, 'link_executionDetails_executions_id': link_executionDetails_executions_id_1]))

WebUI.takeScreenshot(reportLocation + '/TC48/Step 13-Click on link executionDetails TestRun4 - Navigate to page teamprojectexecutions.png')

"Step 14: Click on div RightSidebar2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_RightSidebar2'))

WebUI.takeScreenshot(reportLocation + '/TC48/Step 14-Click on div RightSidebar2.png')

"Step 15: Click on div RightSidebar2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_RightSidebar2'))

WebUI.takeScreenshot(reportLocation + '/TC48/Step 15-Click on div RightSidebar2.png')

"Step 16: Click on link Reports"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_Reports_1'))

WebUI.takeScreenshot(reportLocation + '/TC48/Step 16-Click on link Reports.png')

"Step 17: Click on link TestRuns3 -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_TestRuns5'))

WebUI.takeScreenshot(reportLocation + '/TC48/Step 17-Click on link TestRuns3 - Navigate to page teamproject.png')

"Step 18: Click on link TestRuns7"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_TestRuns4'))

WebUI.takeScreenshot(reportLocation + '/TC48/Step 18-Click on link TestRuns7.png')

"Step 19: Click on link executionDetails (TestRun5) -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_executionDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_executionDetails', ['link_executionDetails_trNthChild': link_executionDetails_trNthChild_2, 'link_executionDetails_internalRoleLinkName': link_executionDetails_internalRoleLinkName_2, 'link_executionDetails_project_id': link_executionDetails_project_id_2, 'link_executionDetails_team_id': link_executionDetails_team_id_2, 'link_executionDetails_executions_id': link_executionDetails_executions_id_2]))

WebUI.takeScreenshot(reportLocation + '/TC48/Step 19-Click on link executionDetails TestRun5 - Navigate to page teamprojectexecutions.png')

"Step 20: Click on div RightSidebar2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_RightSidebar2'))

WebUI.takeScreenshot(reportLocation + '/TC48/Step 20-Click on div RightSidebar2.png')

"Step 21: Click on div RightSidebar2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_RightSidebar2'))

WebUI.takeScreenshot(reportLocation + '/TC48/Step 21-Click on div RightSidebar2.png')

"Step 22: Click on div Loading"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_Loading'))

WebUI.takeScreenshot(reportLocation + '/TC48/Step 22-Click on div Loading.png')

"Step 23: Click on div Loading"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_Loading'))

WebUI.takeScreenshot(reportLocation + '/TC48/Step 23-Click on div Loading.png')

"Step 24: Click on div Loading"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_Loading'))

WebUI.takeScreenshot(reportLocation + '/TC48/Step 24-Click on div Loading.png')

"Step 25: Click on div Loading"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_Loading'))

WebUI.takeScreenshot(reportLocation + '/TC48/Step 25-Click on div Loading.png')

"Step 26: Click on div Loading"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_Loading'))

WebUI.takeScreenshot(reportLocation + '/TC48/Step 26-Click on div Loading.png')

"Step 27: Click on div Loading"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_Loading'))

WebUI.takeScreenshot(reportLocation + '/TC48/Step 27-Click on div Loading.png')

"Step 28: Click on div Loading"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_Loading'))

WebUI.takeScreenshot(reportLocation + '/TC48/Step 28-Click on div Loading.png')

"Step 29: Click on div RightSidebar2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_RightSidebar2'))

WebUI.takeScreenshot(reportLocation + '/TC48/Step 29-Click on div RightSidebar2.png')

"Step 30: Click on div RightSidebar2 -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_RightSidebar2'))

WebUI.takeScreenshot(reportLocation + '/TC48/Step 30-Click on div RightSidebar2 - Navigate to page .png')

"Step 31: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC48-View Reports and Execution Details in Sauce Demo_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}