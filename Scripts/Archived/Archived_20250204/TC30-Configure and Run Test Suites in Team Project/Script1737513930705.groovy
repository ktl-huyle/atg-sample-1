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

"Step 2: Click on link projectDetails (FirstProject) -> Navigate to page 'team project#team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "Archived/Archived_20250204/Dynamic Objects/Page_organization_home/link_projectDetails"
WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Dynamic Objects/Page_organization_home/link_projectDetails', ['link_projectDetails_internalRoleLinkName': link_projectDetails_internalRoleLinkName, 'project_id': project_id, 'team_id': team_id]))

WebUI.takeScreenshot(reportLocation + '/TC30/Step 2-Click on link projectDetails FirstProject - Navigate to page team projectteamproject.png')

"Step 3: Click on link testNavigation (Tests) -> Navigate to page 'team project details#team/*/project/*/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "Archived/Archived_20250204/Dynamic Objects/Page_team_project/link_testNavigation"
WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Dynamic Objects/Page_team_project/link_testNavigation', ['link_testNavigation_nthChild': link_testNavigation_nthChild, 'path_param_6': path_param_6, 'project_id': project_id_1, 'path_param_5': path_param_5, 'team_id': team_id_1]))

WebUI.takeScreenshot(reportLocation + '/TC30/Step 3-Click on link testNavigation Tests - Navigate to page team project detailsteamproject.png')

"Step 4: Click on link Executions2 -> Navigate to page 'team project detail#team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Page_team_project_details/link_Executions2'))

WebUI.takeScreenshot(reportLocation + '/TC30/Step 4-Click on link Executions2 - Navigate to page team project detailteamproject.png')

"Step 5: Click on div testRunDetails (TestRunDetails)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "Archived/Archived_20250204/Dynamic Objects/Page_team_project_detail/div_testRunDetails"
WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Dynamic Objects/Page_team_project_detail/div_testRunDetails', ['div_testRunDetails_internalRoleCellName': div_testRunDetails_internalRoleCellName]))

WebUI.takeScreenshot(reportLocation + '/TC30/Step 5-Click on div testRunDetails TestRunDetails.png')

"Step 6: Click on button Details -> Navigate to page 'team project executions#team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Page_team_project_detail/button_Details'))

WebUI.takeScreenshot(reportLocation + '/TC30/Step 6-Click on button Details - Navigate to page team project executionsteamprojectexecutions.png')

"Step 7: Click on link Files -> Navigate to page 'team project detail#team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Page_team_project_executions/link_Files'))

WebUI.takeScreenshot(reportLocation + '/TC30/Step 7-Click on link Files - Navigate to page team project detailteamproject.png')

"Step 8: Click on div testRunDetails (TestRunDetails2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "Archived/Archived_20250204/Dynamic Objects/Page_team_project_detail/div_testRunDetails"
WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Dynamic Objects/Page_team_project_detail/div_testRunDetails', ['div_testRunDetails_internalRoleCellName': div_testRunDetails_internalRoleCellName_1]))

WebUI.takeScreenshot(reportLocation + '/TC30/Step 8-Click on div testRunDetails TestRunDetails2.png')

"Step 9: Click on button Details -> Navigate to page 'team project executions#team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Page_team_project_detail/button_Details'))

WebUI.takeScreenshot(reportLocation + '/TC30/Step 9-Click on button Details - Navigate to page team project executionsteamprojectexecutions.png')

"Step 10: Click on link Files2 -> Navigate to page 'file management#team/*/project/*/executions/*/files'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Page_team_project_executions/link_Files2'))

WebUI.takeScreenshot(reportLocation + '/TC30/Step 10-Click on link Files2 - Navigate to page file managementteamprojectexecutionsfiles.png')

"Step 11: Click on link Executions -> Navigate to page 'team project detail#team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions/.*/files?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Page_file_management/link_Executions'))

WebUI.takeScreenshot(reportLocation + '/TC30/Step 11-Click on link Executions - Navigate to page team project detailteamproject.png')

"Step 12: Click on button ScheduleTestRun"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Page_team_project_detail/button_ScheduleTestRun'))

WebUI.takeScreenshot(reportLocation + '/TC30/Step 12-Click on button ScheduleTestRun.png')

"Step 13: Click on div SelectValue"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Page_team_project_detail/div_SelectValue'))

WebUI.takeScreenshot(reportLocation + '/TC30/Step 13-Click on div SelectValue.png')

"Step 14: Click on div SelectOption"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Page_team_project_detail/div_SelectOption'))

WebUI.takeScreenshot(reportLocation + '/TC30/Step 14-Click on div SelectOption.png')

"Step 15: Click on div SelectValue2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Page_team_project_detail/div_SelectValue2'))

WebUI.takeScreenshot(reportLocation + '/TC30/Step 15-Click on div SelectValue2.png')

"Step 16: Click on div SelectOption2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Page_team_project_detail/div_SelectOption2'))

WebUI.takeScreenshot(reportLocation + '/TC30/Step 16-Click on div SelectOption2.png')

"Step 17: Click on div TestSuiteValue"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Page_team_project_detail/div_TestSuiteValue'))

WebUI.takeScreenshot(reportLocation + '/TC30/Step 17-Click on div TestSuiteValue.png')

"Step 18: Click on button TestSuiteCollection"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Page_team_project_detail/button_TestSuiteCollection'))

WebUI.takeScreenshot(reportLocation + '/TC30/Step 18-Click on button TestSuiteCollection.png')

"Step 19: Click on div SelectValue3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Page_team_project_detail/div_SelectValue3'))

WebUI.takeScreenshot(reportLocation + '/TC30/Step 19-Click on div SelectValue3.png')

"Step 20: Click on div SelectOption3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Page_team_project_detail/div_SelectOption3'))

WebUI.takeScreenshot(reportLocation + '/TC30/Step 20-Click on div SelectOption3.png')

"Step 21: Click on link ConfigureEnvironments"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Page_team_project_detail/link_ConfigureEnvironments'))

WebUI.takeScreenshot(reportLocation + '/TC30/Step 21-Click on link ConfigureEnvironments.png')

"Step 22: Click on input ConfigureTestEnvironment"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Page_team_project_detail/input_ConfigureTestEnvironment'))

WebUI.takeScreenshot(reportLocation + '/TC30/Step 22-Click on input ConfigureTestEnvironment.png')

"Step 23: Click on div SelectValue4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Page_team_project_detail/div_SelectValue4'))

WebUI.takeScreenshot(reportLocation + '/TC30/Step 23-Click on div SelectValue4.png')

"Step 24: Click on item MacOS"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Page_team_project_detail/item_MacOS'))

WebUI.takeScreenshot(reportLocation + '/TC30/Step 24-Click on item MacOS.png')

"Step 25: Click on span Chrome"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Page_team_project_detail/span_Chrome'))

WebUI.takeScreenshot(reportLocation + '/TC30/Step 25-Click on span Chrome.png')

"Step 26: Click on item 127"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Page_team_project_detail/item_127'))

WebUI.takeScreenshot(reportLocation + '/TC30/Step 26-Click on item 127.png')

"Step 27: Click on button Save2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Page_team_project_detail/button_Save2'))

WebUI.takeScreenshot(reportLocation + '/TC30/Step 27-Click on button Save2.png')

"Step 28: Click on button Run"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Page_team_project_detail/button_Run'))

WebUI.takeScreenshot(reportLocation + '/TC30/Step 28-Click on button Run.png')

"Step 29: Click on button Sessions"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Page_team_project_detail/button_Sessions'))

WebUI.takeScreenshot(reportLocation + '/TC30/Step 29-Click on button Sessions.png')

"Step 30: Click on div sortOptions (SortDetails)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "Archived/Archived_20250204/Dynamic Objects/Page_team_project_detail/div_sortOptions"
WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Dynamic Objects/Page_team_project_detail/div_sortOptions', ['div_sortOptions_internalHasText': div_sortOptions_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC30/Step 30-Click on div sortOptions SortDetails.png')

"Step 31: Click on div HistoryDetails"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Page_team_project_detail/div_HistoryDetails'))

WebUI.takeScreenshot(reportLocation + '/TC30/Step 31-Click on div HistoryDetails.png')

"Step 32: Click on div TestExecution"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Page_team_project_detail/div_TestExecution'))

WebUI.takeScreenshot(reportLocation + '/TC30/Step 32-Click on div TestExecution.png')

"Step 33: Click on div testRunDetails (TestRunDetails3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "Archived/Archived_20250204/Dynamic Objects/Page_team_project_detail/div_testRunDetails_1"
WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Dynamic Objects/Page_team_project_detail/div_testRunDetails_1', ['div_testRunDetails_internalHasText': div_testRunDetails_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC30/Step 33-Click on div testRunDetails TestRunDetails3.png')

"Step 34: Click on button Details -> Navigate to page 'team project executions#team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Page_team_project_detail/button_Details'))

WebUI.takeScreenshot(reportLocation + '/TC30/Step 34-Click on button Details - Navigate to page team project executionsteamprojectexecutions.png')

"Step 35: Click on link Files3 -> Navigate to page 'file management#team/*/project/*/executions/*/files'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Page_team_project_executions/link_Files3'))

WebUI.takeScreenshot(reportLocation + '/TC30/Step 35-Click on link Files3 - Navigate to page file managementteamprojectexecutionsfiles.png')

"Step 36: Click on link reportDownload (FileDownload)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions/.*/files?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "Archived/Archived_20250204/Dynamic Objects/Page_file_management/link_reportDownload"
WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Dynamic Objects/Page_file_management/link_reportDownload', ['link_reportDownload_trNthChild': link_reportDownload_trNthChild]))

WebUI.takeScreenshot(reportLocation + '/TC30/Step 36-Click on link reportDownload FileDownload.png')

"Step 37: Click on button DownloadFile"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions/.*/files?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Page_file_management/button_DownloadFile'))

WebUI.takeScreenshot(reportLocation + '/TC30/Step 37-Click on button DownloadFile.png')

"Step 38: Click on button CompressFile"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions/.*/files?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Page_file_management/button_CompressFile'))

WebUI.takeScreenshot(reportLocation + '/TC30/Step 38-Click on button CompressFile.png')

"Step 39: Click on link ExportFile"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions/.*/files?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Page_file_management/link_ExportFile'))

WebUI.takeScreenshot(reportLocation + '/TC30/Step 39-Click on link ExportFile.png')

"Step 40: Click on link pageNavigation (Page2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions/.*/files?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "Archived/Archived_20250204/Dynamic Objects/Page_file_management/link_pageNavigation"
WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Dynamic Objects/Page_file_management/link_pageNavigation', ['link_pageNavigation_liNthChild': link_pageNavigation_liNthChild, 'link_pageNavigation_internalLabel': link_pageNavigation_internalLabel]))

WebUI.takeScreenshot(reportLocation + '/TC30/Step 40-Click on link pageNavigation Page2.png')

"Step 41: Click on link pageNavigation (Page3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions/.*/files?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "Archived/Archived_20250204/Dynamic Objects/Page_file_management/link_pageNavigation"
WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Dynamic Objects/Page_file_management/link_pageNavigation', ['link_pageNavigation_liNthChild': link_pageNavigation_liNthChild_1, 'link_pageNavigation_internalLabel': link_pageNavigation_internalLabel_1]))

WebUI.takeScreenshot(reportLocation + '/TC30/Step 41-Click on link pageNavigation Page3.png')

"Step 42: Click on link reportDownload (HTMLReport) -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions/.*/files?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "Archived/Archived_20250204/Dynamic Objects/Page_file_management/link_reportDownload"
WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Dynamic Objects/Page_file_management/link_reportDownload', ['link_reportDownload_trNthChild': link_reportDownload_trNthChild_1]))

WebUI.takeScreenshot(reportLocation + '/TC30/Step 42-Click on link reportDownload HTMLReport - Navigate to page .png')

"Step 43: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC30-Configure and Run Test Suites in Team Project_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}