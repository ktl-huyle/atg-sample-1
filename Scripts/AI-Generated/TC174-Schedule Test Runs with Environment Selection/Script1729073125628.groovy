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

"Step 3: Navigate to team/{*}/project/{*}/{*}"

TrueTestScripts.navigate("team/{*}/project/{*}/{*}")

"Step 4: Click on td testAutomationInfo (TestAutomation)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/td_testAutomationInfo"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/td_testAutomationInfo', ['td_testAutomationInfo_internalRoleCellName': td_testAutomationInfo_internalRoleCellName]))

WebUI.takeScreenshot(reportLocation + '/TC174/Step 4-Click on td testAutomationInfo TestAutomation.png')

"Step 5: Click on td testAutomationInfo (TestAutomation)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/td_testAutomationInfo"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/td_testAutomationInfo', ['td_testAutomationInfo_internalRoleCellName': td_testAutomationInfo_internalRoleCellName_1]))

WebUI.takeScreenshot(reportLocation + '/TC174/Step 5-Click on td testAutomationInfo TestAutomation.png')

"Step 6: Click on link projectResources (TestAutomation) -> Navigate to page 'team project#team/{*}/project/{*}/{*}/{*}'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_projectResources"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_projectResources', ['link_projectResources_trNthChild': link_projectResources_trNthChild, 'link_projectResources_internalRoleLinkName': link_projectResources_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC174/Step 6-Click on link projectResources TestAutomation - Navigate to page team projectteamproject.png')

"Step 7: Click on button RefreshScriptRepository"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_RefreshScriptRepository'))

WebUI.takeScreenshot(reportLocation + '/TC174/Step 7-Click on button RefreshScriptRepository.png')

"Step 8: Click on button AlertClose"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_AlertClose'))

WebUI.takeScreenshot(reportLocation + '/TC174/Step 8-Click on button AlertClose.png')

"Step 9: Click on button ScheduleTestRun2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_ScheduleTestRun2'))

WebUI.takeScreenshot(reportLocation + '/TC174/Step 9-Click on button ScheduleTestRun2.png')

"Step 10: Schedule and run test cases with environment selection and input options"

scheduleAndRunTestCases.execute(data_path_0, Integer.valueOf(index_0))

"Step 11: Click on button AlertClose"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_AlertClose'))

WebUI.takeScreenshot(reportLocation + '/TC174/Step 11-Click on button AlertClose.png')

"Step 12: Click on span Settings"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/span_Settings'))

WebUI.takeScreenshot(reportLocation + '/TC174/Step 12-Click on span Settings.png')

"Step 13: Click on link OrganizationSetup -> Navigate to page 'settings page#organization/{*}/settings/agent'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_OrganizationSetup'))

WebUI.takeScreenshot(reportLocation + '/TC174/Step 13-Click on link OrganizationSetup - Navigate to page settings pageorganizationsettingsagent.png')

"Step 14: Click on link AgentSetup -> Navigate to page 'team project#team/{*}/project/{*}/{*}'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'organization/{.*}/settings/agent?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_settings_page/link_AgentSetup'))

WebUI.takeScreenshot(reportLocation + '/TC174/Step 14-Click on link AgentSetup - Navigate to page team projectteamproject.png')

"Step 15: Click on button ScheduleTestRun3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_ScheduleTestRun3'))

WebUI.takeScreenshot(reportLocation + '/TC174/Step 15-Click on button ScheduleTestRun3.png')

"Step 16: Schedule and run test cases with environment selection and input options"

scheduleAndRunTestCases.execute(data_path_1, Integer.valueOf(index_1))

"Step 17: Click on link viewTestRuns (ViewEPPsAutomationTest)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_viewTestRuns"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_viewTestRuns', ['link_viewTestRuns_internalRoleLinkName': link_viewTestRuns_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC174/Step 17-Click on link viewTestRuns ViewEPPsAutomationTest.png')

"Step 18: Click on header testRunDetails (EPPsAutomationTestCaseRun) -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/header_testRunDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/header_testRunDetails', ['header_testRunDetails_internalRoleHeadingName': header_testRunDetails_internalRoleHeadingName]))

WebUI.takeScreenshot(reportLocation + '/TC174/Step 18-Click on header testRunDetails EPPsAutomationTestCaseRun - Navigate to page .png')

"Step 19: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC174-Schedule Test Runs with Environment Selection_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}