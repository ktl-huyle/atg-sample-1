import truetest.common.scheduleAndRunTestCases
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import com.kms.katalon.core.configuration.RunConfiguration
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

"Step 3: Navigate to organization/{*}/home"

TrueTestScripts.navigate("organization/{*}/home")

"Step 4: Click on link projectLinks (FirstProject3) -> Navigate to page 'team project#team/{*}/project/{*}'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'organization/{.*}/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/link_projectLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/link_projectLinks', ['link_projectLinks_internalRoleLinkName': link_projectLinks_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC158/Step 4-Click on link projectLinks FirstProject3 - Navigate to page team projectteamproject.png')

"Step 5: Click on link tests -> Navigate to page 'team project#team/{*}/project/{*}/{*}/{*}'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_tests'))

WebUI.takeScreenshot(reportLocation + '/TC158/Step 5-Click on link tests - Navigate to page team projectteamproject.png')

"Step 6: Click on link Executions5 -> Navigate to page 'team project#team/{*}/project/{*}/{*}'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Executions5'))

WebUI.takeScreenshot(reportLocation + '/TC158/Step 6-Click on link Executions5 - Navigate to page team projectteamproject.png')

"Step 7: Click on div testRunElements (TestRunUntitled3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_testRunElements"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_testRunElements', ['div_testRunElements_internalRoleCellName': div_testRunElements_internalRoleCellName]))

WebUI.takeScreenshot(reportLocation + '/TC158/Step 7-Click on div testRunElements TestRunUntitled3.png')

"Step 8: Click on button Details -> Navigate to page 'team project executions#team/{*}/project/{*}/executions/{*}'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Details'))

WebUI.takeScreenshot(reportLocation + '/TC158/Step 8-Click on button Details - Navigate to page team project executionsteamprojectexecutions.png')

"Step 9: Click on link files -> Navigate to page 'team project#team/{*}/project/{*}/{*}'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/executions/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_files'))

WebUI.takeScreenshot(reportLocation + '/TC158/Step 9-Click on link files - Navigate to page team projectteamproject.png')

"Step 10: Click on div testRunElements (TestRunUntitled4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_testRunElements"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_testRunElements', ['div_testRunElements_internalRoleCellName': div_testRunElements_internalRoleCellName_1]))

WebUI.takeScreenshot(reportLocation + '/TC158/Step 10-Click on div testRunElements TestRunUntitled4.png')

"Step 11: Click on button Details -> Navigate to page 'team project executions#team/{*}/project/{*}/executions/{*}'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Details'))

WebUI.takeScreenshot(reportLocation + '/TC158/Step 11-Click on button Details - Navigate to page team project executionsteamprojectexecutions.png')

"Step 12: Click on link files2 -> Navigate to page 'file management#team/{*}/project/{*}/executions/{*}/files'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/executions/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_files2'))

WebUI.takeScreenshot(reportLocation + '/TC158/Step 12-Click on link files2 - Navigate to page file managementteamprojectexecutionsfiles.png')

"Step 13: Click on link Executions -> Navigate to page 'team project#team/{*}/project/{*}/{*}'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/executions/{.*}/files?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_file_management/link_Executions'))

WebUI.takeScreenshot(reportLocation + '/TC158/Step 13-Click on link Executions - Navigate to page team projectteamproject.png')

"Step 14: Click on button ScheduleTestRun"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_ScheduleTestRun'))

WebUI.takeScreenshot(reportLocation + '/TC158/Step 14-Click on button ScheduleTestRun.png')

"Step 15: Schedule and run test cases with environment selection and input options"

scheduleAndRunTestCases.execute(data_path_0, Integer.valueOf(index_0))

"Step 16: Click on button SessionsTab"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_SessionsTab'))

WebUI.takeScreenshot(reportLocation + '/TC158/Step 16-Click on button SessionsTab.png')

"Step 17: Click on div SortIDDescending"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_SortIDDescending'))

WebUI.takeScreenshot(reportLocation + '/TC158/Step 17-Click on div SortIDDescending.png')

"Step 18: Click on div historyInfo (HistorySubscribed)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_historyInfo'))

WebUI.takeScreenshot(reportLocation + '/TC158/Step 18-Click on div historyInfo HistorySubscribed.png')

"Step 19: Click on div TestExecution"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_TestExecution'))

WebUI.takeScreenshot(reportLocation + '/TC158/Step 19-Click on div TestExecution.png')

"Step 20: Click on div testRunUntitled (TestRunUntitled5)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_testRunUntitled"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_testRunUntitled', ['div_testRunUntitled_internalHasText': div_testRunUntitled_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC158/Step 20-Click on div testRunUntitled TestRunUntitled5.png')

"Step 21: Click on button Details -> Navigate to page 'team project executions#team/{*}/project/{*}/executions/{*}'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Details'))

WebUI.takeScreenshot(reportLocation + '/TC158/Step 21-Click on button Details - Navigate to page team project executionsteamprojectexecutions.png')

"Step 22: Click on link files3 -> Navigate to page 'file management#team/{*}/project/{*}/executions/{*}/files'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/executions/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_files3'))

WebUI.takeScreenshot(reportLocation + '/TC158/Step 22-Click on link files3 - Navigate to page file managementteamprojectexecutionsfiles.png')

"Step 23: Click on link fileManagement (ExecutionFile)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/executions/{.*}/files?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_file_management/link_fileManagement"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_file_management/link_fileManagement', ['link_fileManagement_trNthChild': link_fileManagement_trNthChild, 'link_fileManagement_internalRoleLinkName': link_fileManagement_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC158/Step 23-Click on link fileManagement ExecutionFile.png')

"Step 24: Click on button DownloadExecutionFile"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/executions/{.*}/files?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_file_management/button_DownloadExecutionFile'))

WebUI.takeScreenshot(reportLocation + '/TC158/Step 24-Click on button DownloadExecutionFile.png')

"Step 25: Click on button CompressFile"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/executions/{.*}/files?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_file_management/button_CompressFile'))

WebUI.takeScreenshot(reportLocation + '/TC158/Step 25-Click on button CompressFile.png')

"Step 26: Click on link ExportExecutionFile"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/executions/{.*}/files?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_file_management/link_ExportExecutionFile'))

WebUI.takeScreenshot(reportLocation + '/TC158/Step 26-Click on link ExportExecutionFile.png')

"Step 27: Click on link pageLinks (Page2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/executions/{.*}/files?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_file_management/link_pageLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_file_management/link_pageLinks', ['link_pageLinks_liNthChild': link_pageLinks_liNthChild, 'link_pageLinks_internalLabel': link_pageLinks_internalLabel]))

WebUI.takeScreenshot(reportLocation + '/TC158/Step 27-Click on link pageLinks Page2.png')

"Step 28: Click on link pageLinks (Page3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/executions/{.*}/files?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_file_management/link_pageLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_file_management/link_pageLinks', ['link_pageLinks_liNthChild': link_pageLinks_liNthChild_1, 'link_pageLinks_internalLabel': link_pageLinks_internalLabel_1]))

WebUI.takeScreenshot(reportLocation + '/TC158/Step 28-Click on link pageLinks Page3.png')

"Step 29: Click on link fileManagement (HTMLReport) -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/executions/{.*}/files?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_file_management/link_fileManagement"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_file_management/link_fileManagement', ['link_fileManagement_trNthChild': link_fileManagement_trNthChild_1]))

WebUI.takeScreenshot(reportLocation + '/TC158/Step 29-Click on link fileManagement HTMLReport - Navigate to page .png')

"Step 30: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC158-Schedule and manage test runs with environment selection in project settings_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}