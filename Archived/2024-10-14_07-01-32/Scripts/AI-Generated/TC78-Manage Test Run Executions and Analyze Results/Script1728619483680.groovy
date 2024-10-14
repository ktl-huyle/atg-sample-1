import internal.GlobalVariable
import truetest.custom.TrueTestScripts
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
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

"Step 4: Click on link Executions9"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Executions9'))

WebUI.takeScreenshot(reportLocation + '/TC78/Step 4-Click on link Executions9.png')

"Step 5: Click on link Executions9"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Executions9'))

WebUI.takeScreenshot(reportLocation + '/TC78/Step 5-Click on link Executions9.png')

"Step 6: Click on link Executions9"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Executions9'))

WebUI.takeScreenshot(reportLocation + '/TC78/Step 6-Click on link Executions9.png')

"Step 7: Click on link Executions9"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Executions9'))

WebUI.takeScreenshot(reportLocation + '/TC78/Step 7-Click on link Executions9.png')

"Step 8: Click on div transactionHistory (UntitledTestRun)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_transactionHistory"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_transactionHistory', ['div_transactionHistory_class': div_transactionHistory_class, 'div_transactionHistory_internalRoleCellName': div_transactionHistory_internalRoleCellName]))

WebUI.takeScreenshot(reportLocation + '/TC78/Step 8-Click on div transactionHistory UntitledTestRun.png')

"Step 9: Click on div transactionHistory (UntitledTestRun2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_transactionHistory"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_transactionHistory', ['div_transactionHistory_class': div_transactionHistory_class_1, 'div_transactionHistory_internalRoleCellName': div_transactionHistory_internalRoleCellName_1]))

WebUI.takeScreenshot(reportLocation + '/TC78/Step 9-Click on div transactionHistory UntitledTestRun2.png')

"Step 10: Click on header testRun (UntitledTestRun5)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/header_testRun"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/header_testRun', ['header_testRun_internalRoleHeadingName': header_testRun_internalRoleHeadingName]))

WebUI.takeScreenshot(reportLocation + '/TC78/Step 10-Click on header testRun UntitledTestRun5.png')

"Step 11: Click on button Details2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Details2'))

WebUI.takeScreenshot(reportLocation + '/TC78/Step 11-Click on button Details2.png')

"Step 12: Click on button IconButton"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_IconButton'))

WebUI.takeScreenshot(reportLocation + '/TC78/Step 12-Click on button IconButton.png')

"Step 13: Click on div menu (PopoverBackdrop)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_menu"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_menu', ['div_menu_class': div_menu_class]))

WebUI.takeScreenshot(reportLocation + '/TC78/Step 13-Click on div menu PopoverBackdrop.png')

"Step 14: Click on div dynamicObject (UntitledTestRun3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_dynamicObject', ['div_dynamicObject_internalLabel': div_dynamicObject_internalLabel]))

WebUI.takeScreenshot(reportLocation + '/TC78/Step 14-Click on div dynamicObject UntitledTestRun3.png')

"Step 15: Click on div dynamicObject (UntitledTestRun3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_dynamicObject', ['div_dynamicObject_internalLabel': div_dynamicObject_internalLabel_1]))

WebUI.takeScreenshot(reportLocation + '/TC78/Step 15-Click on div dynamicObject UntitledTestRun3.png')

"Step 16: Click on div dynamicObject (UntitledTestRun3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_dynamicObject', ['div_dynamicObject_internalLabel': div_dynamicObject_internalLabel_2]))

WebUI.takeScreenshot(reportLocation + '/TC78/Step 16-Click on div dynamicObject UntitledTestRun3.png')

"Step 17: Click on div MuiPaperRoot"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_MuiPaperRoot'))

WebUI.takeScreenshot(reportLocation + '/TC78/Step 17-Click on div MuiPaperRoot.png')

"Step 18: Click on div MuiPaperRoot"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_MuiPaperRoot'))

WebUI.takeScreenshot(reportLocation + '/TC78/Step 18-Click on div MuiPaperRoot.png')

"Step 19: Click on button IconButton"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_IconButton'))

WebUI.takeScreenshot(reportLocation + '/TC78/Step 19-Click on button IconButton.png')

"Step 20: Click on div menu (PopoverBackdrop)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_menu"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_menu', ['div_menu_class': div_menu_class_1]))

WebUI.takeScreenshot(reportLocation + '/TC78/Step 20-Click on div menu PopoverBackdrop.png')

"Step 21: Click on div MuiPaperRoot"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_MuiPaperRoot'))

WebUI.takeScreenshot(reportLocation + '/TC78/Step 21-Click on div MuiPaperRoot.png')

"Step 22: Click on button SessionsTab"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_SessionsTab'))

WebUI.takeScreenshot(reportLocation + '/TC78/Step 22-Click on button SessionsTab.png')

"Step 23: Click on button FailedTestResults -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_FailedTestResults'))

WebUI.takeScreenshot(reportLocation + '/TC78/Step 23-Click on button FailedTestResults - Navigate to page .png')

"Step 24: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC78-Manage Test Run Executions and Analyze Results_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}