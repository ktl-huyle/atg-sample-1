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

"Step 3: Navigate to team/*/project/*/*"

TrueTestScripts.navigate("team/${GlobalVariable.team_id}/project/${GlobalVariable.project_id}/${GlobalVariable.path_param_5}")

"Step 4: Click on link Executions3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Executions3_1'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 4-Click on link Executions3.png')

"Step 5: Click on link Executions3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Executions3_1'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 5-Click on link Executions3.png')

"Step 6: Click on link Executions3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Executions3_1'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 6-Click on link Executions3.png')

"Step 7: Click on link Executions3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Executions3_1'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 7-Click on link Executions3.png')

"Step 8: Click on div teamProjectCells (UntitledTestRun)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_teamProjectCells"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_teamProjectCells', ['div_teamProjectCells_class': div_teamProjectCells_class, 'div_teamProjectCells_internalRoleCellName': div_teamProjectCells_internalRoleCellName]))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 8-Click on div teamProjectCells UntitledTestRun.png')

"Step 9: Click on div teamProjectCells (UntitledTestRun2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_teamProjectCells"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_teamProjectCells', ['div_teamProjectCells_class': div_teamProjectCells_class_1, 'div_teamProjectCells_internalRoleCellName': div_teamProjectCells_internalRoleCellName_1]))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 9-Click on div teamProjectCells UntitledTestRun2.png')

"Step 10: Click on header testRunHeaders (UntitledTestRun)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/header_testRunHeaders"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/header_testRunHeaders', ['header_testRunHeaders_internalRoleHeadingName': header_testRunHeaders_internalRoleHeadingName]))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 10-Click on header testRunHeaders UntitledTestRun.png')

"Step 11: Click on button Details"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Details'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 11-Click on button Details.png')

"Step 12: Click on button IconButton"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_IconButton'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 12-Click on button IconButton.png')

"Step 13: Click on div menuBackdrops (PopoverBackdrop)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_menuBackdrops"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_menuBackdrops', ['div_menuBackdrops_class': div_menuBackdrops_class]))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 13-Click on div menuBackdrops PopoverBackdrop.png')

"Step 14: Click on div testRunSections (UntitledTestRun3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_testRunSections"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_testRunSections', ['div_testRunSections_internalLabel': div_testRunSections_internalLabel]))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 14-Click on div testRunSections UntitledTestRun3.png')

"Step 15: Click on div testRunSections (UntitledTestRun3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_testRunSections"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_testRunSections', ['div_testRunSections_internalLabel': div_testRunSections_internalLabel_1]))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 15-Click on div testRunSections UntitledTestRun3.png')

"Step 16: Click on div testRunSections (UntitledTestRun3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_testRunSections"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_testRunSections', ['div_testRunSections_internalLabel': div_testRunSections_internalLabel_2]))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 16-Click on div testRunSections UntitledTestRun3.png')

"Step 17: Click on div MuiPaperRoot"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_MuiPaperRoot'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 17-Click on div MuiPaperRoot.png')

"Step 18: Click on div MuiPaperRoot"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_MuiPaperRoot'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 18-Click on div MuiPaperRoot.png')

"Step 19: Click on button IconButton"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_IconButton'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 19-Click on button IconButton.png')

"Step 20: Click on div menuBackdrops (PopoverBackdrop)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_menuBackdrops"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_menuBackdrops', ['div_menuBackdrops_class': div_menuBackdrops_class_1]))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 20-Click on div menuBackdrops PopoverBackdrop.png')

"Step 21: Click on div MuiPaperRoot"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_MuiPaperRoot'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 21-Click on div MuiPaperRoot.png')

"Step 22: Click on button SessionsTab"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_SessionsTab'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 22-Click on button SessionsTab.png')

"Step 23: Click on button FailedTestResults -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_FailedTestResults_1'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 23-Click on button FailedTestResults - Navigate to page .png')

"Step 24: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC13-Verify Test Run Details and Execution in Team Project_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}