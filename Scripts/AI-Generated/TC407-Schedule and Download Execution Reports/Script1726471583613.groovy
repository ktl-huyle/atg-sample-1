import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import katalon.truetest.TrueTestScripts
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import internal.GlobalVariable
import com.kms.katalon.core.configuration.RunConfiguration
import katalon.common.scheduleTestRunWithActiveTunnels

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

"Step 4: Click on link noDataProjects (8T871002TheOrgHasGranted) -> Navigate to page 'team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/link_noDataProjects"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/link_noDataProjects', ['link_noDataProjects_internalRoleLinkName': link_noDataProjects_internalRoleLinkName, 'link_noDataProjects_team_id': link_noDataProjects_team_id, 'link_noDataProjects_project_id': link_noDataProjects_project_id]))

WebUI.takeScreenshot(reportLocation + '/TC407/Step 4-Click on link noDataProjects 8T871002TheOrgHasGranted - Navigate to page teamproject.png')

"Step 5: Click on link reports9 -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_reports9'))

WebUI.takeScreenshot(reportLocation + '/TC407/Step 5-Click on link reports9 - Navigate to page teamproject.png')

"Step 6: Click on link executions17"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_executions17'))

WebUI.takeScreenshot(reportLocation + '/TC407/Step 6-Click on link executions17.png')

"Step 7: Click on button scheduleTestRun2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_scheduleTestRun2'))

WebUI.takeScreenshot(reportLocation + '/TC407/Step 7-Click on button scheduleTestRun2.png')

"Step 8: Schedule a test run with selected active tunnels and environments."

scheduleTestRunWithActiveTunnels.execute(data_path_0, Integer.valueOf(index_0))

"Step 9: Click on link testRunViews (viewCheckMultipleTest)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_testRunViews"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_testRunViews', ['link_testRunViews_internalRoleLinkName': link_testRunViews_internalRoleLinkName, 'link_testRunViews_team_id': link_testRunViews_team_id, 'link_testRunViews_project_id': link_testRunViews_project_id]))

WebUI.takeScreenshot(reportLocation + '/TC407/Step 9-Click on link testRunViews viewCheckMultipleTest.png')

"Step 10: Click on header projectObjects (object12)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/header_projectObjects"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/header_projectObjects', ['header_projectObjects_internalRoleHeadingName': header_projectObjects_internalRoleHeadingName]))

WebUI.takeScreenshot(reportLocation + '/TC407/Step 10-Click on header projectObjects object12.png')

"Step 11: Click on div objectDetails (object66)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_objectDetails_2"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_objectDetails_2', ['div_objectDetails_internalLabel': div_objectDetails_internalLabel]))

WebUI.takeScreenshot(reportLocation + '/TC407/Step 11-Click on div objectDetails object66.png')

"Step 12: Click on div object67"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_object67'))

WebUI.takeScreenshot(reportLocation + '/TC407/Step 12-Click on div object67.png')

"Step 13: Click on link tests7 -> Navigate to page 'team/*/project/*/test-design/test-cases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_tests7'))

WebUI.takeScreenshot(reportLocation + '/TC407/Step 13-Click on link tests7 - Navigate to page teamprojecttest-designtest-cases.png')

"Step 14: Click on link executions4 -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/link_executions4'))

WebUI.takeScreenshot(reportLocation + '/TC407/Step 14-Click on link executions4 - Navigate to page teamproject.png')

"Step 15: Click on header projectObjects (object12)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/header_projectObjects"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/header_projectObjects', ['header_projectObjects_internalRoleHeadingName': header_projectObjects_internalRoleHeadingName_1]))

WebUI.takeScreenshot(reportLocation + '/TC407/Step 15-Click on header projectObjects object12.png')

"Step 16: Click on button details2 -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_details2'))

WebUI.takeScreenshot(reportLocation + '/TC407/Step 16-Click on button details2 - Navigate to page teamprojectexecutions.png')

"Step 17: Click on link executionSettings (settings) -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/link_executionSettings"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/link_executionSettings', ['link_executionSettings_internalRoleLinkName': link_executionSettings_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC407/Step 17-Click on link executionSettings settings - Navigate to page teamproject.png')

"Step 18: Click on link reports10"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_reports10'))

WebUI.takeScreenshot(reportLocation + '/TC407/Step 18-Click on link reports10.png')

"Step 19: Click on link testRuns11"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_testRuns11'))

WebUI.takeScreenshot(reportLocation + '/TC407/Step 19-Click on link testRuns11.png')

"Step 20: Click on link uploadReports"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_uploadReports'))

WebUI.takeScreenshot(reportLocation + '/TC407/Step 20-Click on link uploadReports.png')

"Step 21: Schedule a test run with selected active tunnels and environments."

scheduleTestRunWithActiveTunnels.execute(data_path_1, Integer.valueOf(index_1))

"Step 22: Click on link executions17"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_executions17'))

WebUI.takeScreenshot(reportLocation + '/TC407/Step 22-Click on link executions17.png')

"Step 23: Click on link reports9"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_reports9'))

WebUI.takeScreenshot(reportLocation + '/TC407/Step 23-Click on link reports9.png')

"Step 24: Click on link testRuns11"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_testRuns11'))

WebUI.takeScreenshot(reportLocation + '/TC407/Step 24-Click on link testRuns11.png')

"Step 25: Click on link executionObjects (object2) -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_executionObjects"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_executionObjects', ['link_executionObjects_trNthChild': link_executionObjects_trNthChild, 'link_executionObjects_internalRoleLinkName': link_executionObjects_internalRoleLinkName, 'link_executionObjects_executions_id': link_executionObjects_executions_id, 'link_executionObjects_project_id': link_executionObjects_project_id, 'link_executionObjects_team_id': link_executionObjects_team_id]))

WebUI.takeScreenshot(reportLocation + '/TC407/Step 25-Click on link executionObjects object2 - Navigate to page teamprojectexecutions.png')

"Step 26: Click on button downloadExecutionFile"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_downloadExecutionFile'))

WebUI.takeScreenshot(reportLocation + '/TC407/Step 26-Click on button downloadExecutionFile.png')

"Step 27: Click on button compressFileZip"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_compressFileZip'))

WebUI.takeScreenshot(reportLocation + '/TC407/Step 27-Click on button compressFileZip.png')

"Step 28: Click on link object2 -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_object2'))

WebUI.takeScreenshot(reportLocation + '/TC407/Step 28-Click on link object2 - Navigate to page .png')

"Step 29: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC407-Schedule and Download Execution Reports_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}