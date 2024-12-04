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

"Step 4: Click on link projectDetails (FirstProject) -> Navigate to page 'team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/link_projectDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/link_projectDetails', ['link_projectDetails_internalRoleLinkName': link_projectDetails_internalRoleLinkName, 'team_id': team_id, 'project_id': project_id]))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 4-Click on link projectDetails FirstProject - Navigate to page teamproject.png')

"Step 5: Click on link Tests -> Navigate to page 'team/*/project/*/test-design/test-cases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Tests'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 5-Click on link Tests - Navigate to page teamprojecttest-designtest-cases.png')

"Step 6: Click on link Executions -> Navigate to page 'team/*/project/*/test-runs'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/link_Executions'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 6-Click on link Executions - Navigate to page teamprojecttest-runs.png')

"Step 7: Click on div testRunItems (UntitledTestRun)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_testRunItems"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_testRunItems', ['div_testRunItems_internalRoleCellName': div_testRunItems_internalRoleCellName]))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 7-Click on div testRunItems UntitledTestRun.png')

"Step 8: Click on button Details2 -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_Details2'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 8-Click on button Details2 - Navigate to page teamprojectexecutions.png')

"Step 9: Click on link Files -> Navigate to page 'team/*/project/*/test-runs'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_Files_1'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 9-Click on link Files - Navigate to page teamprojecttest-runs.png')

"Step 10: Click on div testRunItems (UntitledTestRun2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_testRunItems"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_testRunItems', ['div_testRunItems_internalRoleCellName': div_testRunItems_internalRoleCellName_1]))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 10-Click on div testRunItems UntitledTestRun2.png')

"Step 11: Click on button Details2 -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_Details2'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 11-Click on button Details2 - Navigate to page teamprojectexecutions.png')

"Step 12: Click on link Files2 -> Navigate to page 'team/*/project/*/executions/*/files'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_Files2'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 12-Click on link Files2 - Navigate to page teamprojectexecutionsfiles.png')

"Step 13: Click on link Executions -> Navigate to page 'team/*/project/*/test-runs'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/files?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_files/link_Executions'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 13-Click on link Executions - Navigate to page teamprojecttest-runs.png')

"Step 14: Click on button ScheduleTestRun"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_ScheduleTestRun'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 14-Click on button ScheduleTestRun.png')

"Step 15: Click on div CustomSelectValue"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_CustomSelectValue'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 15-Click on div CustomSelectValue.png')

"Step 16: Click on div GitCreatedWithSketch"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_GitCreatedWithSketch'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 16-Click on div GitCreatedWithSketch.png')

"Step 17: Click on div TestSuiteControl"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_TestSuiteControl'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 17-Click on div TestSuiteControl.png')

"Step 18: Click on div TestSuitesFileUpload"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_TestSuitesFileUpload'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 18-Click on div TestSuitesFileUpload.png')

"Step 19: Click on div SelectTestSuite"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_SelectTestSuite'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 19-Click on div SelectTestSuite.png')

"Step 20: Click on button TestSuiteCollection"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_TestSuiteCollection'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 20-Click on button TestSuiteCollection.png')

"Step 21: Click on div TestSuiteCollectionControl"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_TestSuiteCollectionControl'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 21-Click on div TestSuiteCollectionControl.png')

"Step 22: Click on div TestSuitesTestSuiteCollection"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_TestSuitesTestSuiteCollection'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 22-Click on div TestSuitesTestSuiteCollection.png')

"Step 23: Click on link ConfigureEnvironments"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/link_ConfigureEnvironments'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 23-Click on link ConfigureEnvironments.png')

"Step 24: Click on input ConfigureTestEnvironment"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/input_ConfigureTestEnvironment'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 24-Click on input ConfigureTestEnvironment.png')

"Step 25: Click on div SelectSingleValue"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_SelectSingleValue'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 25-Click on div SelectSingleValue.png')

"Step 26: Click on item MacOS"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/item_MacOS'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 26-Click on item MacOS.png')

"Step 27: Click on span Chrome"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/span_Chrome'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 27-Click on span Chrome.png')

"Step 28: Click on item TestRun"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/item_TestRun'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 28-Click on item TestRun.png')

"Step 29: Click on button Save2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_Save2'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 29-Click on button Save2.png')

"Step 30: Click on button Run"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_Run'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 30-Click on button Run.png')

"Step 31: Click on button sessionActions (Sessions)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/button_sessionActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/button_sessionActions', ['button_sessionActions_internalRoleTabName': button_sessionActions_internalRoleTabName]))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 31-Click on button sessionActions Sessions.png')

"Step 32: Click on div sortOptions (SortID)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_sortOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_sortOptions', ['div_sortOptions_internalHasText': div_sortOptions_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 32-Click on div sortOptions SortID.png')

"Step 33: Click on div historyItems (History)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_historyItems"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_historyItems', ['div_historyItems_internalHasText': div_historyItems_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 33-Click on div historyItems History.png')

"Step 34: Click on div TestExecution"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_TestExecution'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 34-Click on div TestExecution.png')

"Step 35: Click on div untitledTestRuns (UntitledTestRun3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_untitledTestRuns"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_untitledTestRuns', ['div_untitledTestRuns_internalHasText': div_untitledTestRuns_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 35-Click on div untitledTestRuns UntitledTestRun3.png')

"Step 36: Click on button Details2 -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_Details2'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 36-Click on button Details2 - Navigate to page teamprojectexecutions.png')

"Step 37: Click on link Files3 -> Navigate to page 'team/*/project/*/executions/*/files'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_Files3'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 37-Click on link Files3 - Navigate to page teamprojectexecutionsfiles.png')

"Step 38: Click on link fileDownload (HTMLFile2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/files?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions_files/link_fileDownload"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions_files/link_fileDownload', ['link_fileDownload_trNthChild': link_fileDownload_trNthChild, 'link_fileDownload_internalRoleLinkName': link_fileDownload_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 38-Click on link fileDownload HTMLFile2.png')

"Step 39: Click on button DownloadExecutionFile"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/files?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_files/button_DownloadExecutionFile'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 39-Click on button DownloadExecutionFile.png')

"Step 40: Click on button CompressFile"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/files?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_files/button_CompressFile'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 40-Click on button CompressFile.png')

"Step 41: Click on link ExportExecution"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/files?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_files/link_ExportExecution'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 41-Click on link ExportExecution.png')

"Step 42: Click on link pageNavigation (Page2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/files?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions_files/link_pageNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions_files/link_pageNavigation', ['link_pageNavigation_liNthChild': link_pageNavigation_liNthChild, 'link_pageNavigation_internalLabel': link_pageNavigation_internalLabel]))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 42-Click on link pageNavigation Page2.png')

"Step 43: Click on link pageNavigation (Page3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/files?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions_files/link_pageNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions_files/link_pageNavigation', ['link_pageNavigation_liNthChild': link_pageNavigation_liNthChild_1, 'link_pageNavigation_internalLabel': link_pageNavigation_internalLabel_1]))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 43-Click on link pageNavigation Page3.png')

"Step 44: Click on link fileDownload (HTMLFile2) -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/files?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions_files/link_fileDownload"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions_files/link_fileDownload', ['link_fileDownload_trNthChild': link_fileDownload_trNthChild_1, 'link_fileDownload_internalRoleLinkName': link_fileDownload_internalRoleLinkName_1]))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 44-Click on link fileDownload HTMLFile2 - Navigate to page .png')

"Step 45: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC9-Verify Test Execution Details and Report Download_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}