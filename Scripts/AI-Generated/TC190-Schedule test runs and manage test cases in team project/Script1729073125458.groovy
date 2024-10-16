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

"Step 4: Click on link projectLinks (OracleJDE) -> Navigate to page 'team project#team/{*}/project/{*}'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'organization/{.*}/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/link_projectLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/link_projectLinks', ['link_projectLinks_internalRoleLinkName': link_projectLinks_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC190/Step 4-Click on link projectLinks OracleJDE - Navigate to page team projectteamproject.png')

"Step 5: Click on link Settings2 -> Navigate to page 'team project settings#team/{*}/project/{*}/settings'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Settings2'))

WebUI.takeScreenshot(reportLocation + '/TC190/Step 5-Click on link Settings2 - Navigate to page team project settingsteamprojectsettings.png')

"Step 6: Click on link scriptRepositories (ScriptRepositories2) -> Navigate to page 'team project#team/{*}/project/{*}/{*}'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/settings?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_settings/link_scriptRepositories"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_settings/link_scriptRepositories', ['link_scriptRepositories_nthChild': link_scriptRepositories_nthChild, 'link_scriptRepositories_internalRoleLinkName': link_scriptRepositories_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC190/Step 6-Click on link scriptRepositories ScriptRepositories2 - Navigate to page team projectteamproject.png')

"Step 7: Click on link projectResources (OracleJDE) -> Navigate to page 'team project#team/{*}/project/{*}/{*}/{*}'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_projectResources"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_projectResources', ['link_projectResources_trNthChild': link_projectResources_trNthChild, 'link_projectResources_internalRoleLinkName': link_projectResources_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC190/Step 7-Click on link projectResources OracleJDE - Navigate to page team projectteamproject.png')

"Step 8: Click on button ScheduleTestRun2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_ScheduleTestRun2'))

WebUI.takeScreenshot(reportLocation + '/TC190/Step 8-Click on button ScheduleTestRun2.png')

"Step 9: Schedule and run test cases with environment selection and input options"

scheduleAndRunTestCases.execute(data_path_0, Integer.valueOf(index_0))

"Step 10: Click on link Tests4 -> Navigate to page 'team project#team/{*}/project/{*}/{*}/{*}'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Tests4'))

WebUI.takeScreenshot(reportLocation + '/TC190/Step 10-Click on link Tests4 - Navigate to page team projectteamproject.png')

"Step 11: Click on span treeSwitcherIcons (treeSwitcherIcon6)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/span_treeSwitcherIcons"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/span_treeSwitcherIcons', ['span_treeSwitcherIcons_divNthChild': span_treeSwitcherIcons_divNthChild]))

WebUI.takeScreenshot(reportLocation + '/TC190/Step 11-Click on span treeSwitcherIcons treeSwitcherIcon6.png')

"Step 12: Click on span treeSwitcherIcons (katalonTestCases)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/span_treeSwitcherIcons'))

WebUI.takeScreenshot(reportLocation + '/TC190/Step 12-Click on span treeSwitcherIcons katalonTestCases.png')

"Step 13: Click on div uploadedDataInfo (testCasesLabel)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_uploadedDataInfo'))

WebUI.takeScreenshot(reportLocation + '/TC190/Step 13-Click on div uploadedDataInfo testCasesLabel.png')

"Step 14: Click on input testCaseCheckbox"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_testCaseCheckbox'))

WebUI.takeScreenshot(reportLocation + '/TC190/Step 14-Click on input testCaseCheckbox.png')

"Step 15: Click on link Settings2 -> Navigate to page 'team project settings#team/{*}/project/{*}/settings'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Settings2'))

WebUI.takeScreenshot(reportLocation + '/TC190/Step 15-Click on link Settings2 - Navigate to page team project settingsteamprojectsettings.png')

"Step 16: Click on link scriptRepositories (ScriptRepositories2) -> Navigate to page 'team project#team/{*}/project/{*}/{*}'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/settings?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_settings/link_scriptRepositories"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_settings/link_scriptRepositories', ['link_scriptRepositories_nthChild': link_scriptRepositories_nthChild_1, 'link_scriptRepositories_internalRoleLinkName': link_scriptRepositories_internalRoleLinkName_1]))

WebUI.takeScreenshot(reportLocation + '/TC190/Step 16-Click on link scriptRepositories ScriptRepositories2 - Navigate to page team projectteamproject.png')

"Step 17: Click on link projectResources (OracleJDE) -> Navigate to page 'team project#team/{*}/project/{*}/{*}/{*}'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_projectResources"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_projectResources', ['link_projectResources_trNthChild': link_projectResources_trNthChild_1, 'link_projectResources_internalRoleLinkName': link_projectResources_internalRoleLinkName_1]))

WebUI.takeScreenshot(reportLocation + '/TC190/Step 17-Click on link projectResources OracleJDE - Navigate to page team projectteamproject.png')

"Step 18: Click on button ScheduleTestRun2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_ScheduleTestRun2'))

WebUI.takeScreenshot(reportLocation + '/TC190/Step 18-Click on button ScheduleTestRun2.png')

"Step 19: Schedule and run test cases with environment selection and input options"

scheduleAndRunTestCases.execute(data_path_1, Integer.valueOf(index_1))

"Step 20: Click on div SuccessMessage"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_SuccessMessage'))

WebUI.takeScreenshot(reportLocation + '/TC190/Step 20-Click on div SuccessMessage.png')

"Step 21: Click on div UnderTopNavbar2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_UnderTopNavbar2'))

WebUI.takeScreenshot(reportLocation + '/TC190/Step 21-Click on div UnderTopNavbar2.png')

"Step 22: Click on link viewTestRuns (ViewCdcTestRun)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_viewTestRuns"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_viewTestRuns', ['link_viewTestRuns_internalRoleLinkName': link_viewTestRuns_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC190/Step 22-Click on link viewTestRuns ViewCdcTestRun.png')

"Step 23: Click on div testRunElements (TestRunCell)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_testRunElements"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_testRunElements', ['div_testRunElements_internalRoleCellName': div_testRunElements_internalRoleCellName]))

WebUI.takeScreenshot(reportLocation + '/TC190/Step 23-Click on div testRunElements TestRunCell.png')

"Step 24: Click on div testRunElements (TestRunCell) -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_testRunElements"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_testRunElements', ['div_testRunElements_internalRoleCellName': div_testRunElements_internalRoleCellName_1]))

WebUI.takeScreenshot(reportLocation + '/TC190/Step 24-Click on div testRunElements TestRunCell - Navigate to page .png')

"Step 25: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC190-Schedule test runs and manage test cases in team project_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}