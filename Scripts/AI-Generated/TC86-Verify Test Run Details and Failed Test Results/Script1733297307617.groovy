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

"Step 1: Navigate to http://demo.localhost.direct"

TrueTestScripts.navigate("")

"Step 2: Login into Application"

TrueTestScripts.login()

"Step 3: Navigate to team/*/project/*/*"

TrueTestScripts.navigate("team/${GlobalVariable.team_id}/project/${GlobalVariable.project_id}/${GlobalVariable.path_param_5}")

"Step 4: Click on link Executions (Executions8)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_Executions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_Executions', ['link_Executions_internalRoleLinkName': link_Executions_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC86/Step 4-Click on link Executions Executions8.png')

"Step 5: Click on link Executions (Executions8)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_Executions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_Executions', ['link_Executions_internalRoleLinkName': link_Executions_internalRoleLinkName_1]))

WebUI.takeScreenshot(reportLocation + '/TC86/Step 5-Click on link Executions Executions8.png')

"Step 6: Click on link Executions (Executions8)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_Executions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_Executions', ['link_Executions_internalRoleLinkName': link_Executions_internalRoleLinkName_2]))

WebUI.takeScreenshot(reportLocation + '/TC86/Step 6-Click on link Executions Executions8.png')

"Step 7: Click on link Executions (Executions8)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_Executions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_Executions', ['link_Executions_internalRoleLinkName': link_Executions_internalRoleLinkName_3]))

WebUI.takeScreenshot(reportLocation + '/TC86/Step 7-Click on link Executions Executions8.png')

"Step 8: Click on div UntitledTestRun (UntitledTestRun33)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_UntitledTestRun"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_UntitledTestRun', ['div_UntitledTestRun_internalRoleCellName': div_UntitledTestRun_internalRoleCellName]))

WebUI.takeScreenshot(reportLocation + '/TC86/Step 8-Click on div UntitledTestRun UntitledTestRun33.png')

"Step 9: Click on div UntitledTestRun (UntitledTestRun33)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_UntitledTestRun"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_UntitledTestRun', ['div_UntitledTestRun_internalRoleCellName': div_UntitledTestRun_internalRoleCellName_1]))

WebUI.takeScreenshot(reportLocation + '/TC86/Step 9-Click on div UntitledTestRun UntitledTestRun33.png')

"Step 10: Click on header UntitledTestRun (UntitledTestRun17)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/header_UntitledTestRun"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/header_UntitledTestRun', ['header_UntitledTestRun_internalRoleHeadingName': header_UntitledTestRun_internalRoleHeadingName]))

WebUI.takeScreenshot(reportLocation + '/TC86/Step 10-Click on header UntitledTestRun UntitledTestRun17.png')

"Step 11: Click on button Details3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Details3'))

WebUI.takeScreenshot(reportLocation + '/TC86/Step 11-Click on button Details3.png')

"Step 12: Click on button TestRunDetail"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_TestRunDetail'))

WebUI.takeScreenshot(reportLocation + '/TC86/Step 12-Click on button TestRunDetail.png')

"Step 13: Click on div PopoverBackdrop (PopoverBackdrop3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_PopoverBackdrop'))

WebUI.takeScreenshot(reportLocation + '/TC86/Step 13-Click on div PopoverBackdrop PopoverBackdrop3.png')

"Step 14: Click on div dynamicObject (UntitledTestRun)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_dynamicObject', ['div_dynamicObject_internalLabel': div_dynamicObject_internalLabel]))

WebUI.takeScreenshot(reportLocation + '/TC86/Step 14-Click on div dynamicObject UntitledTestRun.png')

"Step 15: Click on div dynamicObject (UntitledTestRun)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_dynamicObject', ['div_dynamicObject_internalLabel': div_dynamicObject_internalLabel_1]))

WebUI.takeScreenshot(reportLocation + '/TC86/Step 15-Click on div dynamicObject UntitledTestRun.png')

"Step 16: Click on div dynamicObject (UntitledTestRun)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_dynamicObject', ['div_dynamicObject_internalLabel': div_dynamicObject_internalLabel_2]))

WebUI.takeScreenshot(reportLocation + '/TC86/Step 16-Click on div dynamicObject UntitledTestRun.png')

"Step 17: Click on div MuiPaper"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_MuiPaper'))

WebUI.takeScreenshot(reportLocation + '/TC86/Step 17-Click on div MuiPaper.png')

"Step 18: Click on div MuiPaper"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_MuiPaper'))

WebUI.takeScreenshot(reportLocation + '/TC86/Step 18-Click on div MuiPaper.png')

"Step 19: Click on button TestRunDetail"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_TestRunDetail'))

WebUI.takeScreenshot(reportLocation + '/TC86/Step 19-Click on button TestRunDetail.png')

"Step 20: Click on div PopoverBackdrop (PopoverBackdrop3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_PopoverBackdrop'))

WebUI.takeScreenshot(reportLocation + '/TC86/Step 20-Click on div PopoverBackdrop PopoverBackdrop3.png')

"Step 21: Click on div MuiPaper"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_MuiPaper'))

WebUI.takeScreenshot(reportLocation + '/TC86/Step 21-Click on div MuiPaper.png')

"Step 22: Click on button SessionsTab (SessionsTab8)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_SessionsTab"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_SessionsTab', ['button_SessionsTab_internalRoleTabName': button_SessionsTab_internalRoleTabName]))

WebUI.takeScreenshot(reportLocation + '/TC86/Step 22-Click on button SessionsTab SessionsTab8.png')

"Step 23: Click on button SessionsTab (SessionsTab8) -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_SessionsTab"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_SessionsTab', ['button_SessionsTab_internalRoleTabName': button_SessionsTab_internalRoleTabName_1]))

WebUI.takeScreenshot(reportLocation + '/TC86/Step 23-Click on button SessionsTab SessionsTab8 - Navigate to page .png')

"Step 24: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC86-Verify Test Run Details and Failed Test Results_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}