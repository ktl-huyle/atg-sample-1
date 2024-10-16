import internal.GlobalVariable
import truetest.common.scheduleAndRunTestCases
import truetest.custom.TrueTestScripts
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
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

"Step 3: Navigate to team/{*}/project/{*}/{*}"

TrueTestScripts.navigate("team/{*}/project/{*}/{*}")

"Step 4: Click on td testDetails (TestAutomation)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/td_testDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/td_testDetails', ['td_testDetails_internalRoleCellName': td_testDetails_internalRoleCellName]))

WebUI.takeScreenshot(reportLocation + '/TC30/Step 4-Click on td testDetails TestAutomation.png')

"Step 5: Click on td testDetails (TestAutomation)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/td_testDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/td_testDetails', ['td_testDetails_internalRoleCellName': td_testDetails_internalRoleCellName_1]))

WebUI.takeScreenshot(reportLocation + '/TC30/Step 5-Click on td testDetails TestAutomation.png')

"Step 6: Click on link testAutomation (TestAutomation) -> Navigate to page 'team project#team/{*}/project/{*}/{*}/{*}'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_testAutomation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_testAutomation', ['link_testAutomation_trNthChild': link_testAutomation_trNthChild, 'link_testAutomation_internalRoleLinkName': link_testAutomation_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC30/Step 6-Click on link testAutomation TestAutomation - Navigate to page team projectteamproject.png')

"Step 7: Click on button RefreshScriptRepository"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_RefreshScriptRepository'))

WebUI.takeScreenshot(reportLocation + '/TC30/Step 7-Click on button RefreshScriptRepository.png')

"Step 8: Click on button AlertClose"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_AlertClose'))

WebUI.takeScreenshot(reportLocation + '/TC30/Step 8-Click on button AlertClose.png')

"Step 9: Click on button ScheduleTestRun2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_ScheduleTestRun2'))

WebUI.takeScreenshot(reportLocation + '/TC30/Step 9-Click on button ScheduleTestRun2.png')

"Step 10: Schedule and run test cases with various inputs"

scheduleAndRunTestCases.execute(data_path_0, Integer.valueOf(index_0))

"Step 11: Click on button AlertClose"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_AlertClose'))

WebUI.takeScreenshot(reportLocation + '/TC30/Step 11-Click on button AlertClose.png')

"Step 12: Click on span Settings"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/span_Settings'))

WebUI.takeScreenshot(reportLocation + '/TC30/Step 12-Click on span Settings.png')

"Step 13: Click on link OrganizationSetup -> Navigate to page 'organization settings#organization/{*}/settings/agent'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_OrganizationSetup'))

WebUI.takeScreenshot(reportLocation + '/TC30/Step 13-Click on link OrganizationSetup - Navigate to page organization settingsorganizationsettingsagent.png')

"Step 14: Click on link AgentSetup -> Navigate to page 'team project#team/{*}/project/{*}/{*}'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'organization/{.*}/settings/agent?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings/link_AgentSetup'))

WebUI.takeScreenshot(reportLocation + '/TC30/Step 14-Click on link AgentSetup - Navigate to page team projectteamproject.png')

"Step 15: Click on button ScheduleTestRun3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_ScheduleTestRun3'))

WebUI.takeScreenshot(reportLocation + '/TC30/Step 15-Click on button ScheduleTestRun3.png')

"Step 16: Schedule and run test cases with various inputs"

scheduleAndRunTestCases.execute(data_path_1, Integer.valueOf(index_1))

"Step 17: Click on link testRunDetails (ViewEPPsAutomationTest)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_testRunDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_testRunDetails', ['link_testRunDetails_internalRoleLinkName': link_testRunDetails_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC30/Step 17-Click on link testRunDetails ViewEPPsAutomationTest.png')

"Step 18: Click on header testRunDetails (EPPsAutomationTestCaseRun) -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/header_testRunDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/header_testRunDetails', ['header_testRunDetails_internalRoleHeadingName': header_testRunDetails_internalRoleHeadingName]))

WebUI.takeScreenshot(reportLocation + '/TC30/Step 18-Click on header testRunDetails EPPsAutomationTestCaseRun - Navigate to page .png')

"Step 19: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC30-Schedule and Run Test Cases in Team Project_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}