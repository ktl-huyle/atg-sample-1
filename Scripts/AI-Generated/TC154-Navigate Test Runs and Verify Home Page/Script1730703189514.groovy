import internal.GlobalVariable
import truetest.custom.TrueTestScripts
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.configuration.RunConfiguration
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

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

"Step 4: Click on link Executions4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Executions4'))

WebUI.takeScreenshot(reportLocation + '/TC154/Step 4-Click on link Executions4.png')

"Step 5: Click on link Executions4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Executions4'))

WebUI.takeScreenshot(reportLocation + '/TC154/Step 5-Click on link Executions4.png')

"Step 6: Click on link Executions4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Executions4'))

WebUI.takeScreenshot(reportLocation + '/TC154/Step 6-Click on link Executions4.png')

"Step 7: Click on link Executions4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Executions4'))

WebUI.takeScreenshot(reportLocation + '/TC154/Step 7-Click on link Executions4.png')

"Step 8: Click on div testRunCells (UntitledTestRun4053)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_testRunCells"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_testRunCells', ['div_testRunCells_class': div_testRunCells_class, 'div_testRunCells_internalRoleCellName': div_testRunCells_internalRoleCellName]))

WebUI.takeScreenshot(reportLocation + '/TC154/Step 8-Click on div testRunCells UntitledTestRun4053.png')

"Step 9: Click on div testRunCells (UntitledTestRun4054)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_testRunCells"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_testRunCells', ['div_testRunCells_class': div_testRunCells_class_1, 'div_testRunCells_internalRoleCellName': div_testRunCells_internalRoleCellName_1]))

WebUI.takeScreenshot(reportLocation + '/TC154/Step 9-Click on div testRunCells UntitledTestRun4054.png')

"Step 10: Click on header testRunHeaders (UntitledTestRun4054)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/header_testRunHeaders"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/header_testRunHeaders', ['header_testRunHeaders_internalRoleHeadingName': header_testRunHeaders_internalRoleHeadingName]))

WebUI.takeScreenshot(reportLocation + '/TC154/Step 10-Click on header testRunHeaders UntitledTestRun4054.png')

"Step 11: Click on button Details"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Details'))

WebUI.takeScreenshot(reportLocation + '/TC154/Step 11-Click on button Details.png')

"Step 12: Click on button Icon"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Icon'))

WebUI.takeScreenshot(reportLocation + '/TC154/Step 12-Click on button Icon.png')

"Step 13: Click on div dynamicObject (PopoverBackdrop)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_dynamicObject', ['div_dynamicObject_class': div_dynamicObject_class]))

WebUI.takeScreenshot(reportLocation + '/TC154/Step 13-Click on div dynamicObject PopoverBackdrop.png')

"Step 14: Click on div untitledTestRunLabel (UntitledTestRunLabel)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_untitledTestRunLabel"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_untitledTestRunLabel', ['div_untitledTestRunLabel_internalLabel': div_untitledTestRunLabel_internalLabel]))

WebUI.takeScreenshot(reportLocation + '/TC154/Step 14-Click on div untitledTestRunLabel UntitledTestRunLabel.png')

"Step 15: Click on div untitledTestRunLabel (UntitledTestRunLabel)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_untitledTestRunLabel"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_untitledTestRunLabel', ['div_untitledTestRunLabel_internalLabel': div_untitledTestRunLabel_internalLabel_1]))

WebUI.takeScreenshot(reportLocation + '/TC154/Step 15-Click on div untitledTestRunLabel UntitledTestRunLabel.png')

"Step 16: Click on div untitledTestRunLabel (UntitledTestRunLabel)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_untitledTestRunLabel"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_untitledTestRunLabel', ['div_untitledTestRunLabel_internalLabel': div_untitledTestRunLabel_internalLabel_2]))

WebUI.takeScreenshot(reportLocation + '/TC154/Step 16-Click on div untitledTestRunLabel UntitledTestRunLabel.png')

"Step 17: Click on div Paper"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_Paper'))

WebUI.takeScreenshot(reportLocation + '/TC154/Step 17-Click on div Paper.png')

"Step 18: Click on div Paper"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_Paper'))

WebUI.takeScreenshot(reportLocation + '/TC154/Step 18-Click on div Paper.png')

"Step 19: Click on button Icon"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Icon'))

WebUI.takeScreenshot(reportLocation + '/TC154/Step 19-Click on button Icon.png')

"Step 20: Click on div dynamicObject (PopoverBackdrop)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_dynamicObject', ['div_dynamicObject_class': div_dynamicObject_class_1]))

WebUI.takeScreenshot(reportLocation + '/TC154/Step 20-Click on div dynamicObject PopoverBackdrop.png')

"Step 21: Click on div Paper"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_Paper'))

WebUI.takeScreenshot(reportLocation + '/TC154/Step 21-Click on div Paper.png')

"Step 22: Click on button SessionsTab"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_SessionsTab'))

WebUI.takeScreenshot(reportLocation + '/TC154/Step 22-Click on button SessionsTab.png')

"Step 23: Click on button FailedTestResultsTab -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_FailedTestResultsTab'))

WebUI.takeScreenshot(reportLocation + '/TC154/Step 23-Click on button FailedTestResultsTab - Navigate to page .png')

"Step 24: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC154-Navigate Test Runs and Verify Home Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}