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

"Step 2: Click on link testExecution (TestExecutionDetails) -> Navigate to page 'team project executions#team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "Archived/Archived_20250204/Dynamic Objects/Page_organization_home/link_testExecution"
WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Dynamic Objects/Page_organization_home/link_testExecution', ['link_testExecution_class': link_testExecution_class, 'link_testExecution_internalRoleLinkName': link_testExecution_internalRoleLinkName, 'project_id': project_id, 'executions_id': executions_id, 'team_id': team_id]))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 2-Click on link testExecution TestExecutionDetails - Navigate to page team project executionsteamprojectexecutions.png')

"Step 3: Click on link testList (Tests) -> Navigate to page 'team project details#team/*/project/*/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "Archived/Archived_20250204/Dynamic Objects/Page_team_project_executions/link_testList"
WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Dynamic Objects/Page_team_project_executions/link_testList', ['path_param_6': path_param_6, 'project_id': project_id_1, 'path_param_5': path_param_5, 'team_id': team_id_1]))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 3-Click on link testList Tests - Navigate to page team project detailsteamproject.png')

"Step 4: Click on div testSuites (UploadedData)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "Archived/Archived_20250204/Dynamic Objects/Page_team_project_details/div_testSuites"
WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Dynamic Objects/Page_team_project_details/div_testSuites', ['div_testSuites_internalText': div_testSuites_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 4-Click on div testSuites UploadedData.png')

"Step 5: Click on link TestSuites"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Page_team_project_details/link_TestSuites'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 5-Click on link TestSuites.png')

"Step 6: Click on div testSuites (KatalonCloud)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "Archived/Archived_20250204/Dynamic Objects/Page_team_project_details/div_testSuites"
WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Dynamic Objects/Page_team_project_details/div_testSuites', ['div_testSuites_internalText': div_testSuites_internalText_1]))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 6-Click on div testSuites KatalonCloud.png')

"Step 7: Click on div testSuites (UploadedData2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "Archived/Archived_20250204/Dynamic Objects/Page_team_project_details/div_testSuites"
WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Dynamic Objects/Page_team_project_details/div_testSuites', ['div_testSuites_internalText': div_testSuites_internalText_2]))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 7-Click on div testSuites UploadedData2.png')

"Step 8: Click on div testSuites (TestSuites)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "Archived/Archived_20250204/Dynamic Objects/Page_team_project_details/div_testSuites"
WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Dynamic Objects/Page_team_project_details/div_testSuites', ['div_testSuites_internalText': div_testSuites_internalText_3]))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 8-Click on div testSuites TestSuites.png')

"Step 9: Click on link testSuiteDetails (SmokeTestSuite) -> Navigate to page 'team project details#team/*/project/*/*/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "Archived/Archived_20250204/Dynamic Objects/Page_team_project_details/link_testSuiteDetails"
WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Dynamic Objects/Page_team_project_details/link_testSuiteDetails', ['link_testSuiteDetails_internalRoleLinkName': link_testSuiteDetails_internalRoleLinkName, 'path_param_7': path_param_7, 'project_id': project_id_2, 'path_param_5': path_param_5_1, 'path_param_6': path_param_6_1, 'team_id': team_id_2]))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 9-Click on link testSuiteDetails SmokeTestSuite - Navigate to page team project detailsteamproject.png')

"Step 10: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC6-Check Test Suites in Team Project Details_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}