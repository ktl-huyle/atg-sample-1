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

"Step 2: Click on link projectDetails (executionDetails) -> Navigate to page 'team project#team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "Archived/Archived_20250204/Dynamic Objects/Page_organization_home/link_projectDetails"
WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Dynamic Objects/Page_organization_home/link_projectDetails', ['link_projectDetails_internalRoleLinkName': link_projectDetails_internalRoleLinkName, 'project_id': project_id, 'team_id': team_id]))

WebUI.takeScreenshot(reportLocation + '/TC17/Step 2-Click on link projectDetails executionDetails - Navigate to page team projectteamproject.png')

"Step 3: Click on link testNavigation (tests) -> Navigate to page 'team project details#team/*/project/*/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "Archived/Archived_20250204/Dynamic Objects/Page_team_project/link_testNavigation"
WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Dynamic Objects/Page_team_project/link_testNavigation', ['link_testNavigation_nthChild': link_testNavigation_nthChild, 'path_param_6': path_param_6, 'project_id': project_id_1, 'path_param_5': path_param_5, 'team_id': team_id_1]))

WebUI.takeScreenshot(reportLocation + '/TC17/Step 3-Click on link testNavigation tests - Navigate to page team project detailsteamproject.png')

"Step 4: Click on div testSuites (UploadedData)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "Archived/Archived_20250204/Dynamic Objects/Page_team_project_details/div_testSuites"
WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Dynamic Objects/Page_team_project_details/div_testSuites', ['div_testSuites_internalText': div_testSuites_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC17/Step 4-Click on div testSuites UploadedData.png')

"Step 5: Click on span katalonInfo (katalonStudio)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "Archived/Archived_20250204/Dynamic Objects/Page_team_project_details/span_katalonInfo"
WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Dynamic Objects/Page_team_project_details/span_katalonInfo', ['span_katalonInfo_class': span_katalonInfo_class]))

WebUI.takeScreenshot(reportLocation + '/TC17/Step 5-Click on span katalonInfo katalonStudio.png')

"Step 6: Click on span treeSwitcher (treeSwitcher)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "Archived/Archived_20250204/Dynamic Objects/Page_team_project_details/span_treeSwitcher"
WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Dynamic Objects/Page_team_project_details/span_treeSwitcher', ['span_treeSwitcher_class': span_treeSwitcher_class, 'span_treeSwitcher_nthChild': span_treeSwitcher_nthChild, 'span_treeSwitcher_divNthChild': span_treeSwitcher_divNthChild]))

WebUI.takeScreenshot(reportLocation + '/TC17/Step 6-Click on span treeSwitcher treeSwitcher.png')

"Step 7: Click on span treeSwitcher (treeSwitcher2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "Archived/Archived_20250204/Dynamic Objects/Page_team_project_details/span_treeSwitcher"
WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Dynamic Objects/Page_team_project_details/span_treeSwitcher', ['span_treeSwitcher_class': span_treeSwitcher_class_1, 'span_treeSwitcher_nthChild': span_treeSwitcher_nthChild_1, 'span_treeSwitcher_divNthChild': span_treeSwitcher_divNthChild_1]))

WebUI.takeScreenshot(reportLocation + '/TC17/Step 7-Click on span treeSwitcher treeSwitcher2.png')

"Step 8: Click on span treeSwitcher (treeSwitcher3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "Archived/Archived_20250204/Dynamic Objects/Page_team_project_details/span_treeSwitcher"
WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Dynamic Objects/Page_team_project_details/span_treeSwitcher', ['span_treeSwitcher_class': span_treeSwitcher_class_2, 'span_treeSwitcher_nthChild': span_treeSwitcher_nthChild_2, 'span_treeSwitcher_divNthChild': span_treeSwitcher_divNthChild_2]))

WebUI.takeScreenshot(reportLocation + '/TC17/Step 8-Click on span treeSwitcher treeSwitcher3.png')

"Step 9: Click on div testSuites (countyDemographics)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "Archived/Archived_20250204/Dynamic Objects/Page_team_project_details/div_testSuites"
WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Dynamic Objects/Page_team_project_details/div_testSuites', ['div_testSuites_internalText': div_testSuites_internalText_1]))

WebUI.takeScreenshot(reportLocation + '/TC17/Step 9-Click on div testSuites countyDemographics.png')

"Step 10: Click on link testSuiteDetails (insuranceDemographics) -> Navigate to page 'team project details#team/*/project/*/*/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "Archived/Archived_20250204/Dynamic Objects/Page_team_project_details/link_testSuiteDetails"
WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Dynamic Objects/Page_team_project_details/link_testSuiteDetails', ['link_testSuiteDetails_internalRoleLinkName': link_testSuiteDetails_internalRoleLinkName, 'path_param_7': path_param_7, 'project_id': project_id_2, 'path_param_5': path_param_5_1, 'path_param_6': path_param_6_1, 'team_id': team_id_2]))

WebUI.takeScreenshot(reportLocation + '/TC17/Step 10-Click on link testSuiteDetails insuranceDemographics - Navigate to page team project detailsteamproject.png')

"Step 11: Click on link reports2 -> Navigate to page 'team project overview#team/*/project/*/overview'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Page_team_project_details/link_reports2'))

WebUI.takeScreenshot(reportLocation + '/TC17/Step 11-Click on link reports2 - Navigate to page team project overviewteamprojectoverview.png')

"Step 12: Click on link testRuns3 -> Navigate to page 'team project executions#team/*/project/*/executions'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/overview?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Page_team_project_overview/link_testRuns3'))

WebUI.takeScreenshot(reportLocation + '/TC17/Step 12-Click on link testRuns3 - Navigate to page team project executionsteamprojectexecutions.png')

"Step 13: Click on link testRunDetails (testRunDetails2) -> Navigate to page 'team project executions#team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "Archived/Archived_20250204/Dynamic Objects/Page_team_project_executions/link_testRunDetails"
WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Dynamic Objects/Page_team_project_executions/link_testRunDetails', ['link_testRunDetails_trNthChild': link_testRunDetails_trNthChild, 'link_testRunDetails_internalRoleLinkName': link_testRunDetails_internalRoleLinkName, 'project_id': project_id_3, 'executions_id': executions_id, 'team_id': team_id_3]))

WebUI.takeScreenshot(reportLocation + '/TC17/Step 13-Click on link testRunDetails testRunDetails2 - Navigate to page team project executionsteamprojectexecutions.png')

"Step 14: Click on button pushToXray"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Page_team_project_executions/button_pushToXray'))

WebUI.takeScreenshot(reportLocation + '/TC17/Step 14-Click on button pushToXray.png')

"Step 15: Click on div selectDropdown"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Page_team_project_executions/div_selectDropdown'))

WebUI.takeScreenshot(reportLocation + '/TC17/Step 15-Click on div selectDropdown.png')

"Step 16: Click on button closeDialog"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Page_team_project_executions/button_closeDialog'))

WebUI.takeScreenshot(reportLocation + '/TC17/Step 16-Click on button closeDialog.png')

"Step 17: Click on link testList (tests) -> Navigate to page 'team project details#team/*/project/*/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "Archived/Archived_20250204/Dynamic Objects/Page_team_project_executions/link_testList"
WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Dynamic Objects/Page_team_project_executions/link_testList', ['path_param_6': path_param_6_2, 'project_id': project_id_4, 'path_param_5': path_param_5_2, 'team_id': team_id_4]))

WebUI.takeScreenshot(reportLocation + '/TC17/Step 17-Click on link testList tests - Navigate to page team project detailsteamproject.png')

"Step 18: Click on link reports3 -> Navigate to page 'team project overview#team/*/project/*/overview'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Page_team_project_details/link_reports3'))

WebUI.takeScreenshot(reportLocation + '/TC17/Step 18-Click on link reports3 - Navigate to page team project overviewteamprojectoverview.png')

"Step 19: Click on link testRuns3 -> Navigate to page 'team project executions#team/*/project/*/executions'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/overview?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Page_team_project_overview/link_testRuns3'))

WebUI.takeScreenshot(reportLocation + '/TC17/Step 19-Click on link testRuns3 - Navigate to page team project executionsteamprojectexecutions.png')

"Step 20: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC17-Push Test Details to Xray and Verify Executions_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}