import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import truetest.custom.TrueTestScripts
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.configuration.RunConfiguration
import internal.GlobalVariable

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

"Step 3: Navigate to team/*/project/*"

TrueTestScripts.navigate("team/*/project/*")

"Step 4: Click on link Tests8 -> Navigate to page 'team/*/project/*/test-design/test-cases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Tests8'))

WebUI.takeScreenshot(reportLocation + '/TC64/Step 4-Click on link Tests8 - Navigate to page teamprojecttest-designtest-cases.png')

"Step 5: Click on link TestSuites7 -> Navigate to page 'team/*/project/*/test-design/test-suites'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/link_TestSuites7'))

WebUI.takeScreenshot(reportLocation + '/TC64/Step 5-Click on link TestSuites7 - Navigate to page teamprojecttest-designtest-suites.png')

"Step 6: Click on link reports -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-suites?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_suites/link_reports_1'))

WebUI.takeScreenshot(reportLocation + '/TC64/Step 6-Click on link reports - Navigate to page teamproject.png')

"Step 7: Click on link TestRuns8"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_TestRuns8'))

WebUI.takeScreenshot(reportLocation + '/TC64/Step 7-Click on link TestRuns8.png')

"Step 8: Click on link Planning4 -> Navigate to page 'team/*/project/*/releases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Planning4'))

WebUI.takeScreenshot(reportLocation + '/TC64/Step 8-Click on link Planning4 - Navigate to page teamprojectreleases.png')

"Step 9: Click on link CreateRelease -> Navigate to page 'team/*/project/*/releases/create'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/releases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_releases/link_CreateRelease'))

WebUI.takeScreenshot(reportLocation + '/TC64/Step 9-Click on link CreateRelease - Navigate to page teamprojectreleasescreate.png')

"Step 10: Click on input Name"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/releases/create?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_releases_create/input_Name'))

WebUI.takeScreenshot(reportLocation + '/TC64/Step 10-Click on input Name.png')

"Step 11: Enter input value in input Name"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/releases/create?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_team_project_releases_create/input_Name'), input_Name)

WebUI.takeScreenshot(reportLocation + '/TC64/Step 11-Enter input value in input Name.png')

"Step 12: Click on input StartTime"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/releases/create?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_releases_create/input_StartTime'))

WebUI.takeScreenshot(reportLocation + '/TC64/Step 12-Click on input StartTime.png')

"Step 13: Click on button ChooseDate"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/releases/create?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_releases_create/button_ChooseDate'))

WebUI.takeScreenshot(reportLocation + '/TC64/Step 13-Click on button ChooseDate.png')

"Step 14: Click on button releaseActions (August22)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/releases/create?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_releases_create/button_releaseActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_releases_create/button_releaseActions', ['button_releaseActions_internalLabel': button_releaseActions_internalLabel]))

WebUI.takeScreenshot(reportLocation + '/TC64/Step 14-Click on button releaseActions August22.png')

"Step 15: Click on input EndTime"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/releases/create?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_releases_create/input_EndTime'))

WebUI.takeScreenshot(reportLocation + '/TC64/Step 15-Click on input EndTime.png')

"Step 16: Click on button ChooseDate2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/releases/create?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_releases_create/button_ChooseDate2'))

WebUI.takeScreenshot(reportLocation + '/TC64/Step 16-Click on button ChooseDate2.png')

"Step 17: Click on button releaseActions (August22 2024)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/releases/create?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_releases_create/button_releaseActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_releases_create/button_releaseActions', ['button_releaseActions_internalLabel': button_releaseActions_internalLabel_1]))

WebUI.takeScreenshot(reportLocation + '/TC64/Step 17-Click on button releaseActions August22 2024.png')

"Step 18: Click on button Create -> Navigate to page 'team/*/project/*/releases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/releases/create?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_releases_create/button_Create'))

WebUI.takeScreenshot(reportLocation + '/TC64/Step 18-Click on button Create - Navigate to page teamprojectreleases.png')

"Step 19: Click on link CreateRelease -> Navigate to page 'team/*/project/*/releases/create'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/releases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_releases/link_CreateRelease'))

WebUI.takeScreenshot(reportLocation + '/TC64/Step 19-Click on link CreateRelease - Navigate to page teamprojectreleasescreate.png')

"Step 20: Click on input Name"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/releases/create?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_releases_create/input_Name'))

WebUI.takeScreenshot(reportLocation + '/TC64/Step 20-Click on input Name.png')

"Step 21: Click on input Name"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/releases/create?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_releases_create/input_Name'))

WebUI.takeScreenshot(reportLocation + '/TC64/Step 21-Click on input Name.png')

"Step 22: Enter input value in input Name"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/releases/create?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_team_project_releases_create/input_Name'), input_Name_1)

WebUI.takeScreenshot(reportLocation + '/TC64/Step 22-Enter input value in input Name.png')

"Step 23: Click on input StartTime"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/releases/create?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_releases_create/input_StartTime'))

WebUI.takeScreenshot(reportLocation + '/TC64/Step 23-Click on input StartTime.png')

"Step 24: Click on input EndTime"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/releases/create?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_releases_create/input_EndTime'))

WebUI.takeScreenshot(reportLocation + '/TC64/Step 24-Click on input EndTime.png')

"Step 25: Click on button Create -> Navigate to page 'team/*/project/*/releases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/releases/create?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_releases_create/button_Create'))

WebUI.takeScreenshot(reportLocation + '/TC64/Step 25-Click on button Create - Navigate to page teamprojectreleases.png')

"Step 26: Click on link reports (reports) -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/releases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_releases/link_reports"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_releases/link_reports', ['link_reports_nthChild': link_reports_nthChild, 'link_reports_internalRoleLinkName': link_reports_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC64/Step 26-Click on link reports reports - Navigate to page teamproject.png')

"Step 27: Click on link testCases -> Navigate to page 'team/*/project/*/test-reports/test-maintenance/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_testCases_1'))

WebUI.takeScreenshot(reportLocation + '/TC64/Step 27-Click on link testCases - Navigate to page teamprojecttest-reportstest-maintenance.png')

"Step 28: Click on link executions -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-reports/test-maintenance/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_reports_test_maintenance/link_executions'))

WebUI.takeScreenshot(reportLocation + '/TC64/Step 28-Click on link executions - Navigate to page teamproject.png')

"Step 29: Click on header testRunDetails (testRun)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/header_testRunDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/header_testRunDetails', ['header_testRunDetails_internalRoleHeadingName': header_testRunDetails_internalRoleHeadingName]))

WebUI.takeScreenshot(reportLocation + '/TC64/Step 29-Click on header testRunDetails testRun.png')

"Step 30: Click on button Icon2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Icon2'))

WebUI.takeScreenshot(reportLocation + '/TC64/Step 30-Click on button Icon2.png')

"Step 31: Click on link reports2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_reports2_1'))

WebUI.takeScreenshot(reportLocation + '/TC64/Step 31-Click on link reports2.png')

"Step 32: Click on link TestRuns8"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_TestRuns8'))

WebUI.takeScreenshot(reportLocation + '/TC64/Step 32-Click on link TestRuns8.png')

"Step 33: Click on link executionDetails (executionDetails) -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_executionDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_executionDetails', ['link_executionDetails_trNthChild': link_executionDetails_trNthChild, 'link_executionDetails_internalRoleLinkName': link_executionDetails_internalRoleLinkName, 'team_id': team_id, 'executions_id': executions_id, 'project_id': project_id]))

WebUI.takeScreenshot(reportLocation + '/TC64/Step 33-Click on link executionDetails executionDetails - Navigate to page teamprojectexecutions.png')

"Step 34: Click on button LinkToRelease"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_LinkToRelease'))

WebUI.takeScreenshot(reportLocation + '/TC64/Step 34-Click on button LinkToRelease.png')

"Step 35: Click on span testKatalon (testKatalon)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/span_testKatalon"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/span_testKatalon', ['span_testKatalon_class': span_testKatalon_class, 'span_testKatalon_internalRoleButtonName': span_testKatalon_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC64/Step 35-Click on span testKatalon testKatalon.png')

"Step 36: Click on div linkToRelease"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_linkToRelease'))

WebUI.takeScreenshot(reportLocation + '/TC64/Step 36-Click on div linkToRelease.png')

"Step 37: Click on div backdrop"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_backdrop'))

WebUI.takeScreenshot(reportLocation + '/TC64/Step 37-Click on div backdrop.png')

"Step 38: Click on link testRuns -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_testRuns_1'))

WebUI.takeScreenshot(reportLocation + '/TC64/Step 38-Click on link testRuns - Navigate to page teamproject.png')

"Step 39: Click on link TestRuns8"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_TestRuns8'))

WebUI.takeScreenshot(reportLocation + '/TC64/Step 39-Click on link TestRuns8.png')

"Step 40: Click on link executionDetails (executionDetails2) -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_executionDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_executionDetails', ['link_executionDetails_trNthChild': link_executionDetails_trNthChild_1, 'link_executionDetails_internalRoleLinkName': link_executionDetails_internalRoleLinkName_1, 'team_id': team_id_1, 'executions_id': executions_id_1, 'project_id': project_id_1]))

WebUI.takeScreenshot(reportLocation + '/TC64/Step 40-Click on link executionDetails executionDetails2 - Navigate to page teamprojectexecutions.png')

"Step 41: Click on button LinkToRelease"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_LinkToRelease'))

WebUI.takeScreenshot(reportLocation + '/TC64/Step 41-Click on button LinkToRelease.png')

"Step 42: Click on span testKatalon (testKatalon2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/span_testKatalon"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/span_testKatalon', ['span_testKatalon_class': span_testKatalon_class_1, 'span_testKatalon_internalRoleButtonName': span_testKatalon_internalRoleButtonName_1]))

WebUI.takeScreenshot(reportLocation + '/TC64/Step 42-Click on span testKatalon testKatalon2.png')

"Step 43: Click on button linkToRelease"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_linkToRelease_1'))

WebUI.takeScreenshot(reportLocation + '/TC64/Step 43-Click on button linkToRelease.png')

"Step 44: Click on div backdrop"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_backdrop'))

WebUI.takeScreenshot(reportLocation + '/TC64/Step 44-Click on div backdrop.png')

"Step 45: Click on button projectActions (firstProject)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/button_projectActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/button_projectActions', ['button_projectActions_internalRoleButtonName': button_projectActions_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC64/Step 45-Click on button projectActions firstProject.png')

"Step 46: Click on link dashboard -> Navigate to page 'team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_dashboard_1'))

WebUI.takeScreenshot(reportLocation + '/TC64/Step 46-Click on link dashboard - Navigate to page teamproject.png')

"Step 47: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC64-Create and Manage Releases in Team Project_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}