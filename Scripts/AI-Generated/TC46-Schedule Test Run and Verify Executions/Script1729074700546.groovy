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

"Step 3: Navigate to organization/{*}/home"

TrueTestScripts.navigate("organization/{*}/home")

"Step 4: Click on link projectExecution (OracleJDE) -> Navigate to page 'team project#team/{*}/project/{*}'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'organization/{.*}/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/link_projectExecution"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/link_projectExecution', ['link_projectExecution_internalRoleLinkName': link_projectExecution_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC46/Step 4-Click on link projectExecution OracleJDE - Navigate to page team projectteamproject.png')

"Step 5: Click on link Settings2 -> Navigate to page 'team project settings#team/{*}/project/{*}/settings'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Settings2'))

WebUI.takeScreenshot(reportLocation + '/TC46/Step 5-Click on link Settings2 - Navigate to page team project settingsteamprojectsettings.png')

"Step 6: Click on link integrations (ScriptRepositories2) -> Navigate to page 'team project#team/{*}/project/{*}/{*}'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/settings?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_settings/link_integrations"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_settings/link_integrations', ['link_integrations_nthChild': link_integrations_nthChild, 'link_integrations_internalRoleLinkName': link_integrations_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC46/Step 6-Click on link integrations ScriptRepositories2 - Navigate to page team projectteamproject.png')

"Step 7: Click on link testAutomation (OracleJDE) -> Navigate to page 'team project#team/{*}/project/{*}/{*}/{*}'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_testAutomation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_testAutomation', ['link_testAutomation_trNthChild': link_testAutomation_trNthChild, 'link_testAutomation_internalRoleLinkName': link_testAutomation_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC46/Step 7-Click on link testAutomation OracleJDE - Navigate to page team projectteamproject.png')

"Step 8: Click on button ScheduleTestRun2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_ScheduleTestRun2'))

WebUI.takeScreenshot(reportLocation + '/TC46/Step 8-Click on button ScheduleTestRun2.png')

"Step 9: Schedule and run test cases with various inputs"

scheduleAndRunTestCases.execute(data_path_0, Integer.valueOf(index_0))

"Step 10: Click on link Tests4 -> Navigate to page 'team project#team/{*}/project/{*}/{*}/{*}'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Tests4'))

WebUI.takeScreenshot(reportLocation + '/TC46/Step 10-Click on link Tests4 - Navigate to page team projectteamproject.png')

"Step 11: Click on span treeSwitcherIcon (treeSwitcherIcon6)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/span_treeSwitcherIcon"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/span_treeSwitcherIcon', ['span_treeSwitcherIcon_divNthChild': span_treeSwitcherIcon_divNthChild]))

WebUI.takeScreenshot(reportLocation + '/TC46/Step 11-Click on span treeSwitcherIcon treeSwitcherIcon6.png')

"Step 12: Click on span treeSwitcherIcon (katalonTestCases)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/span_treeSwitcherIcon'))

WebUI.takeScreenshot(reportLocation + '/TC46/Step 12-Click on span treeSwitcherIcon katalonTestCases.png')

"Step 13: Click on div uploadedDataDetails (testCasesLabel)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_uploadedDataDetails'))

WebUI.takeScreenshot(reportLocation + '/TC46/Step 13-Click on div uploadedDataDetails testCasesLabel.png')

"Step 14: Click on input testCaseCheckbox"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_testCaseCheckbox'))

WebUI.takeScreenshot(reportLocation + '/TC46/Step 14-Click on input testCaseCheckbox.png')

"Step 15: Click on link Settings2 -> Navigate to page 'team project settings#team/{*}/project/{*}/settings'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Settings2'))

WebUI.takeScreenshot(reportLocation + '/TC46/Step 15-Click on link Settings2 - Navigate to page team project settingsteamprojectsettings.png')

"Step 16: Click on link integrations (ScriptRepositories2) -> Navigate to page 'team project#team/{*}/project/{*}/{*}'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/settings?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_settings/link_integrations"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_settings/link_integrations', ['link_integrations_nthChild': link_integrations_nthChild_1, 'link_integrations_internalRoleLinkName': link_integrations_internalRoleLinkName_1]))

WebUI.takeScreenshot(reportLocation + '/TC46/Step 16-Click on link integrations ScriptRepositories2 - Navigate to page team projectteamproject.png')

"Step 17: Click on link testAutomation (OracleJDE) -> Navigate to page 'team project#team/{*}/project/{*}/{*}/{*}'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_testAutomation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_testAutomation', ['link_testAutomation_trNthChild': link_testAutomation_trNthChild_1, 'link_testAutomation_internalRoleLinkName': link_testAutomation_internalRoleLinkName_1]))

WebUI.takeScreenshot(reportLocation + '/TC46/Step 17-Click on link testAutomation OracleJDE - Navigate to page team projectteamproject.png')

"Step 18: Click on button ScheduleTestRun2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_ScheduleTestRun2'))

WebUI.takeScreenshot(reportLocation + '/TC46/Step 18-Click on button ScheduleTestRun2.png')

"Step 19: Schedule and run test cases with various inputs"

scheduleAndRunTestCases.execute(data_path_1, Integer.valueOf(index_1))

"Step 20: Click on div SuccessMessage"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_SuccessMessage'))

WebUI.takeScreenshot(reportLocation + '/TC46/Step 20-Click on div SuccessMessage.png')

"Step 21: Click on div UnderTopNavbar2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_UnderTopNavbar2'))

WebUI.takeScreenshot(reportLocation + '/TC46/Step 21-Click on div UnderTopNavbar2.png')

"Step 22: Click on link testRunDetails (ViewCdcTestRun)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_testRunDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_testRunDetails', ['link_testRunDetails_internalRoleLinkName': link_testRunDetails_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC46/Step 22-Click on link testRunDetails ViewCdcTestRun.png')

"Step 23: Click on div testRunDetails (TestRunCell)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_testRunDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_testRunDetails', ['div_testRunDetails_internalRoleCellName': div_testRunDetails_internalRoleCellName]))

WebUI.takeScreenshot(reportLocation + '/TC46/Step 23-Click on div testRunDetails TestRunCell.png')

"Step 24: Click on div testRunDetails (TestRunCell) -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_testRunDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_testRunDetails', ['div_testRunDetails_internalRoleCellName': div_testRunDetails_internalRoleCellName_1]))

WebUI.takeScreenshot(reportLocation + '/TC46/Step 24-Click on div testRunDetails TestRunCell - Navigate to page .png')

"Step 25: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC46-Schedule Test Run and Verify Executions_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}