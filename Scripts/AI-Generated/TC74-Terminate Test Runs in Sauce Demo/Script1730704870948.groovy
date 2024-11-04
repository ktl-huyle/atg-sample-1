import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import truetest.custom.TrueTestScripts
import com.kms.katalon.core.configuration.RunConfiguration
import internal.GlobalVariable
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

"Step 4: Click on div testRunCells (TestRunCell2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_testRunCells"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_testRunCells', ['div_testRunCells_class': div_testRunCells_class, 'div_testRunCells_internalRoleCellName': div_testRunCells_internalRoleCellName]))

WebUI.takeScreenshot(reportLocation + '/TC74/Step 4-Click on div testRunCells TestRunCell2.png')

"Step 5: Click on button Terminate"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Terminate_1'))

WebUI.takeScreenshot(reportLocation + '/TC74/Step 5-Click on button Terminate.png')

"Step 6: Click on button Confirm"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Confirm'))

WebUI.takeScreenshot(reportLocation + '/TC74/Step 6-Click on button Confirm.png')

"Step 7: Click on div testRunCells (TestRunCell3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_testRunCells"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_testRunCells', ['div_testRunCells_class': div_testRunCells_class_1, 'div_testRunCells_internalRoleCellName': div_testRunCells_internalRoleCellName_1]))

WebUI.takeScreenshot(reportLocation + '/TC74/Step 7-Click on div testRunCells TestRunCell3.png')

"Step 8: Click on button closeActions (Unknown)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_closeActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_closeActions', ['button_closeActions_class': button_closeActions_class, 'button_closeActions_nth': button_closeActions_nth]))

WebUI.takeScreenshot(reportLocation + '/TC74/Step 8-Click on button closeActions Unknown.png')

"Step 9: Click on button Terminate"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Terminate_1'))

WebUI.takeScreenshot(reportLocation + '/TC74/Step 9-Click on button Terminate.png')

"Step 10: Click on button Confirm"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Confirm'))

WebUI.takeScreenshot(reportLocation + '/TC74/Step 10-Click on button Confirm.png')

"Step 11: Click on button closeActions (CloseAlert)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_closeActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_closeActions', ['button_closeActions_class': button_closeActions_class_1]))

WebUI.takeScreenshot(reportLocation + '/TC74/Step 11-Click on button closeActions CloseAlert.png')

"Step 12: Click on div testRunCells (TestRunCell4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_testRunCells"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_testRunCells', ['div_testRunCells_class': div_testRunCells_class_2, 'div_testRunCells_internalRoleCellName': div_testRunCells_internalRoleCellName_2]))

WebUI.takeScreenshot(reportLocation + '/TC74/Step 12-Click on div testRunCells TestRunCell4.png')

"Step 13: Click on button Terminate"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Terminate_1'))

WebUI.takeScreenshot(reportLocation + '/TC74/Step 13-Click on button Terminate.png')

"Step 14: Click on button Confirm"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Confirm'))

WebUI.takeScreenshot(reportLocation + '/TC74/Step 14-Click on button Confirm.png')

"Step 15: Click on div testRunCells (TestRunCell5)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_testRunCells"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_testRunCells', ['div_testRunCells_class': div_testRunCells_class_3, 'div_testRunCells_internalRoleCellName': div_testRunCells_internalRoleCellName_3]))

WebUI.takeScreenshot(reportLocation + '/TC74/Step 15-Click on div testRunCells TestRunCell5.png')

"Step 16: Click on button Terminate"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Terminate_1'))

WebUI.takeScreenshot(reportLocation + '/TC74/Step 16-Click on button Terminate.png')

"Step 17: Click on button Confirm"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Confirm'))

WebUI.takeScreenshot(reportLocation + '/TC74/Step 17-Click on button Confirm.png')

"Step 18: Click on div TestRunInfo"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_TestRunInfo'))

WebUI.takeScreenshot(reportLocation + '/TC74/Step 18-Click on div TestRunInfo.png')

"Step 19: Click on div testRunCells (TestRunCell6)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_testRunCells"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_testRunCells', ['div_testRunCells_class': div_testRunCells_class_4, 'div_testRunCells_internalRoleCellName': div_testRunCells_internalRoleCellName_4]))

WebUI.takeScreenshot(reportLocation + '/TC74/Step 19-Click on div testRunCells TestRunCell6.png')

"Step 20: Click on button closeActions (Unknown)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_closeActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_closeActions', ['button_closeActions_class': button_closeActions_class_2, 'button_closeActions_nth': button_closeActions_nth_1]))

WebUI.takeScreenshot(reportLocation + '/TC74/Step 20-Click on button closeActions Unknown.png')

"Step 21: Click on button Terminate"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Terminate_1'))

WebUI.takeScreenshot(reportLocation + '/TC74/Step 21-Click on button Terminate.png')

"Step 22: Click on button Confirm"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Confirm'))

WebUI.takeScreenshot(reportLocation + '/TC74/Step 22-Click on button Confirm.png')

"Step 23: Click on div testRunCells (TestRunCell7)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_testRunCells"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_testRunCells', ['div_testRunCells_class': div_testRunCells_class_5, 'div_testRunCells_internalRoleCellName': div_testRunCells_internalRoleCellName_5]))

WebUI.takeScreenshot(reportLocation + '/TC74/Step 23-Click on div testRunCells TestRunCell7.png')

"Step 24: Click on button Terminate"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Terminate_1'))

WebUI.takeScreenshot(reportLocation + '/TC74/Step 24-Click on button Terminate.png')

"Step 25: Click on button Confirm"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Confirm'))

WebUI.takeScreenshot(reportLocation + '/TC74/Step 25-Click on button Confirm.png')

"Step 26: Click on div testRunCells (TestRunCell8)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_testRunCells"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_testRunCells', ['div_testRunCells_class': div_testRunCells_class_6, 'div_testRunCells_internalRoleCellName': div_testRunCells_internalRoleCellName_6]))

WebUI.takeScreenshot(reportLocation + '/TC74/Step 26-Click on div testRunCells TestRunCell8.png')

"Step 27: Click on button Terminate"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Terminate_1'))

WebUI.takeScreenshot(reportLocation + '/TC74/Step 27-Click on button Terminate.png')

"Step 28: Click on button Confirm"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Confirm'))

WebUI.takeScreenshot(reportLocation + '/TC74/Step 28-Click on button Confirm.png')

"Step 29: Click on div testRunCells (TestRunCell9)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_testRunCells"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_testRunCells', ['div_testRunCells_class': div_testRunCells_class_7, 'div_testRunCells_internalRoleCellName': div_testRunCells_internalRoleCellName_7]))

WebUI.takeScreenshot(reportLocation + '/TC74/Step 29-Click on div testRunCells TestRunCell9.png')

"Step 30: Click on button closeActions (Unknown)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_closeActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_closeActions', ['button_closeActions_class': button_closeActions_class_3, 'button_closeActions_nth': button_closeActions_nth_2]))

WebUI.takeScreenshot(reportLocation + '/TC74/Step 30-Click on button closeActions Unknown.png')

"Step 31: Click on button Terminate"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Terminate_1'))

WebUI.takeScreenshot(reportLocation + '/TC74/Step 31-Click on button Terminate.png')

"Step 32: Click on button Confirm"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Confirm'))

WebUI.takeScreenshot(reportLocation + '/TC74/Step 32-Click on button Confirm.png')

"Step 33: Click on div testRunCells (TestRunCell10)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_testRunCells"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_testRunCells', ['div_testRunCells_class': div_testRunCells_class_8, 'div_testRunCells_internalRoleCellName': div_testRunCells_internalRoleCellName_8]))

WebUI.takeScreenshot(reportLocation + '/TC74/Step 33-Click on div testRunCells TestRunCell10.png')

"Step 34: Click on button closeActions (Unknown)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_closeActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_closeActions', ['button_closeActions_class': button_closeActions_class_4, 'button_closeActions_nth': button_closeActions_nth_3]))

WebUI.takeScreenshot(reportLocation + '/TC74/Step 34-Click on button closeActions Unknown.png')

"Step 35: Click on button Terminate"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Terminate_1'))

WebUI.takeScreenshot(reportLocation + '/TC74/Step 35-Click on button Terminate.png')

"Step 36: Click on button Confirm"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Confirm'))

WebUI.takeScreenshot(reportLocation + '/TC74/Step 36-Click on button Confirm.png')

"Step 37: Click on div testRunCells (TestRunCell11)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_testRunCells"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_testRunCells', ['div_testRunCells_class': div_testRunCells_class_9, 'div_testRunCells_internalRoleCellName': div_testRunCells_internalRoleCellName_9]))

WebUI.takeScreenshot(reportLocation + '/TC74/Step 37-Click on div testRunCells TestRunCell11.png')

"Step 38: Click on div TestRunInfo2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_TestRunInfo2'))

WebUI.takeScreenshot(reportLocation + '/TC74/Step 38-Click on div TestRunInfo2.png')

"Step 39: Click on button Terminate"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Terminate_1'))

WebUI.takeScreenshot(reportLocation + '/TC74/Step 39-Click on button Terminate.png')

"Step 40: Click on button Confirm"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Confirm'))

WebUI.takeScreenshot(reportLocation + '/TC74/Step 40-Click on button Confirm.png')

"Step 41: Click on div testRunCells (TestRunCell12)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_testRunCells"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_testRunCells', ['div_testRunCells_class': div_testRunCells_class_10, 'div_testRunCells_internalRoleCellName': div_testRunCells_internalRoleCellName_10]))

WebUI.takeScreenshot(reportLocation + '/TC74/Step 41-Click on div testRunCells TestRunCell12.png')

"Step 42: Click on button closeActions (Unknown)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_closeActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_closeActions', ['button_closeActions_class': button_closeActions_class_5, 'button_closeActions_nth': button_closeActions_nth_4]))

WebUI.takeScreenshot(reportLocation + '/TC74/Step 42-Click on button closeActions Unknown.png')

"Step 43: Click on button Terminate"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Terminate_1'))

WebUI.takeScreenshot(reportLocation + '/TC74/Step 43-Click on button Terminate.png')

"Step 44: Click on button Confirm"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Confirm'))

WebUI.takeScreenshot(reportLocation + '/TC74/Step 44-Click on button Confirm.png')

"Step 45: Click on div testRunCells (TestRunCell13)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_testRunCells"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_testRunCells', ['div_testRunCells_class': div_testRunCells_class_11, 'div_testRunCells_internalRoleCellName': div_testRunCells_internalRoleCellName_11]))

WebUI.takeScreenshot(reportLocation + '/TC74/Step 45-Click on div testRunCells TestRunCell13.png')

"Step 46: Click on button closeActions (Unknown)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_closeActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_closeActions', ['button_closeActions_class': button_closeActions_class_6, 'button_closeActions_nth': button_closeActions_nth_5]))

WebUI.takeScreenshot(reportLocation + '/TC74/Step 46-Click on button closeActions Unknown.png')

"Step 47: Click on button Terminate"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Terminate_1'))

WebUI.takeScreenshot(reportLocation + '/TC74/Step 47-Click on button Terminate.png')

"Step 48: Click on button Confirm"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Confirm'))

WebUI.takeScreenshot(reportLocation + '/TC74/Step 48-Click on button Confirm.png')

"Step 49: Click on div testRunCells (TestRunCell14)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_testRunCells"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_testRunCells', ['div_testRunCells_class': div_testRunCells_class_12, 'div_testRunCells_internalRoleCellName': div_testRunCells_internalRoleCellName_12]))

WebUI.takeScreenshot(reportLocation + '/TC74/Step 49-Click on div testRunCells TestRunCell14.png')

"Step 50: Click on button Terminate"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Terminate_1'))

WebUI.takeScreenshot(reportLocation + '/TC74/Step 50-Click on button Terminate.png')

"Step 51: Click on button Confirm"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Confirm'))

WebUI.takeScreenshot(reportLocation + '/TC74/Step 51-Click on button Confirm.png')

"Step 52: Click on div testRunCells (TestRunCell15)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_testRunCells"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_testRunCells', ['div_testRunCells_class': div_testRunCells_class_13, 'div_testRunCells_internalRoleCellName': div_testRunCells_internalRoleCellName_13]))

WebUI.takeScreenshot(reportLocation + '/TC74/Step 52-Click on div testRunCells TestRunCell15.png')

"Step 53: Click on button closeActions (Unknown)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_closeActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_closeActions', ['button_closeActions_class': button_closeActions_class_7, 'button_closeActions_nth': button_closeActions_nth_6]))

WebUI.takeScreenshot(reportLocation + '/TC74/Step 53-Click on button closeActions Unknown.png')

"Step 54: Click on button Terminate"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Terminate_1'))

WebUI.takeScreenshot(reportLocation + '/TC74/Step 54-Click on button Terminate.png')

"Step 55: Click on button Confirm"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Confirm'))

WebUI.takeScreenshot(reportLocation + '/TC74/Step 55-Click on button Confirm.png')

"Step 56: Click on div testRunCells (TestRunCell16)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_testRunCells"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_testRunCells', ['div_testRunCells_class': div_testRunCells_class_14, 'div_testRunCells_internalRoleCellName': div_testRunCells_internalRoleCellName_14]))

WebUI.takeScreenshot(reportLocation + '/TC74/Step 56-Click on div testRunCells TestRunCell16.png')

"Step 57: Click on button closeActions (Unknown)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_closeActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_closeActions', ['button_closeActions_class': button_closeActions_class_8, 'button_closeActions_nth': button_closeActions_nth_7]))

WebUI.takeScreenshot(reportLocation + '/TC74/Step 57-Click on button closeActions Unknown.png')

"Step 58: Click on button Terminate"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Terminate_1'))

WebUI.takeScreenshot(reportLocation + '/TC74/Step 58-Click on button Terminate.png')

"Step 59: Click on button Confirm"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Confirm'))

WebUI.takeScreenshot(reportLocation + '/TC74/Step 59-Click on button Confirm.png')

"Step 60: Click on div testRunCells (TestRunCell17)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_testRunCells"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_testRunCells', ['div_testRunCells_class': div_testRunCells_class_15, 'div_testRunCells_internalRoleCellName': div_testRunCells_internalRoleCellName_15]))

WebUI.takeScreenshot(reportLocation + '/TC74/Step 60-Click on div testRunCells TestRunCell17.png')

"Step 61: Click on button closeActions (Unknown)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_closeActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_closeActions', ['button_closeActions_class': button_closeActions_class_9, 'button_closeActions_nth': button_closeActions_nth_8]))

WebUI.takeScreenshot(reportLocation + '/TC74/Step 61-Click on button closeActions Unknown.png')

"Step 62: Click on button Terminate"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Terminate_1'))

WebUI.takeScreenshot(reportLocation + '/TC74/Step 62-Click on button Terminate.png')

"Step 63: Click on button Confirm"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Confirm'))

WebUI.takeScreenshot(reportLocation + '/TC74/Step 63-Click on button Confirm.png')

"Step 64: Click on div testRunCells (TestRunCell18)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_testRunCells"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_testRunCells', ['div_testRunCells_class': div_testRunCells_class_16, 'div_testRunCells_internalRoleCellName': div_testRunCells_internalRoleCellName_16]))

WebUI.takeScreenshot(reportLocation + '/TC74/Step 64-Click on div testRunCells TestRunCell18.png')

"Step 65: Click on button Terminate"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Terminate_1'))

WebUI.takeScreenshot(reportLocation + '/TC74/Step 65-Click on button Terminate.png')

"Step 66: Click on button Confirm"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Confirm'))

WebUI.takeScreenshot(reportLocation + '/TC74/Step 66-Click on button Confirm.png')

"Step 67: Click on div testRunCells (TestRunCell19)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_testRunCells"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_testRunCells', ['div_testRunCells_class': div_testRunCells_class_17, 'div_testRunCells_internalRoleCellName': div_testRunCells_internalRoleCellName_17]))

WebUI.takeScreenshot(reportLocation + '/TC74/Step 67-Click on div testRunCells TestRunCell19.png')

"Step 68: Click on button Terminate"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Terminate_1'))

WebUI.takeScreenshot(reportLocation + '/TC74/Step 68-Click on button Terminate.png')

"Step 69: Click on button Confirm"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Confirm'))

WebUI.takeScreenshot(reportLocation + '/TC74/Step 69-Click on button Confirm.png')

"Step 70: Click on div testRunCells (TestRunCell20)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_testRunCells"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_testRunCells', ['div_testRunCells_class': div_testRunCells_class_18, 'div_testRunCells_internalRoleCellName': div_testRunCells_internalRoleCellName_18]))

WebUI.takeScreenshot(reportLocation + '/TC74/Step 70-Click on div testRunCells TestRunCell20.png')

"Step 71: Click on button closeActions (Unknown)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_closeActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_closeActions', ['button_closeActions_class': button_closeActions_class_10, 'button_closeActions_nth': button_closeActions_nth_9]))

WebUI.takeScreenshot(reportLocation + '/TC74/Step 71-Click on button closeActions Unknown.png')

"Step 72: Click on button Terminate"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Terminate_1'))

WebUI.takeScreenshot(reportLocation + '/TC74/Step 72-Click on button Terminate.png')

"Step 73: Click on button Confirm"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Confirm'))

WebUI.takeScreenshot(reportLocation + '/TC74/Step 73-Click on button Confirm.png')

"Step 74: Click on div testRunCells (TestRunCell21)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_testRunCells"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_testRunCells', ['div_testRunCells_class': div_testRunCells_class_19, 'div_testRunCells_internalRoleCellName': div_testRunCells_internalRoleCellName_19]))

WebUI.takeScreenshot(reportLocation + '/TC74/Step 74-Click on div testRunCells TestRunCell21.png')

"Step 75: Click on button closeActions (Unknown)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_closeActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_closeActions', ['button_closeActions_class': button_closeActions_class_11, 'button_closeActions_nth': button_closeActions_nth_10]))

WebUI.takeScreenshot(reportLocation + '/TC74/Step 75-Click on button closeActions Unknown.png')

"Step 76: Click on button Terminate"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Terminate_1'))

WebUI.takeScreenshot(reportLocation + '/TC74/Step 76-Click on button Terminate.png')

"Step 77: Click on button Confirm"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Confirm'))

WebUI.takeScreenshot(reportLocation + '/TC74/Step 77-Click on button Confirm.png')

"Step 78: Click on div testRunCells (TestRunCell22)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_testRunCells"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_testRunCells', ['div_testRunCells_class': div_testRunCells_class_20, 'div_testRunCells_internalRoleCellName': div_testRunCells_internalRoleCellName_20]))

WebUI.takeScreenshot(reportLocation + '/TC74/Step 78-Click on div testRunCells TestRunCell22.png')

"Step 79: Click on button closeActions (Unknown)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_closeActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_closeActions', ['button_closeActions_class': button_closeActions_class_12, 'button_closeActions_nth': button_closeActions_nth_11]))

WebUI.takeScreenshot(reportLocation + '/TC74/Step 79-Click on button closeActions Unknown.png')

"Step 80: Click on button Terminate"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Terminate_1'))

WebUI.takeScreenshot(reportLocation + '/TC74/Step 80-Click on button Terminate.png')

"Step 81: Click on button Confirm"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Confirm'))

WebUI.takeScreenshot(reportLocation + '/TC74/Step 81-Click on button Confirm.png')

"Step 82: Click on div testRunCells (TestRunCell23)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_testRunCells"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_testRunCells', ['div_testRunCells_class': div_testRunCells_class_21, 'div_testRunCells_internalRoleCellName': div_testRunCells_internalRoleCellName_21]))

WebUI.takeScreenshot(reportLocation + '/TC74/Step 82-Click on div testRunCells TestRunCell23.png')

"Step 83: Click on button closeActions (Unknown)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_closeActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_closeActions', ['button_closeActions_class': button_closeActions_class_13, 'button_closeActions_nth': button_closeActions_nth_12]))

WebUI.takeScreenshot(reportLocation + '/TC74/Step 83-Click on button closeActions Unknown.png')

"Step 84: Click on button Terminate"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Terminate_1'))

WebUI.takeScreenshot(reportLocation + '/TC74/Step 84-Click on button Terminate.png')

"Step 85: Click on button Confirm"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Confirm'))

WebUI.takeScreenshot(reportLocation + '/TC74/Step 85-Click on button Confirm.png')

"Step 86: Click on div testRunCells (TestRunCell24)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_testRunCells"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_testRunCells', ['div_testRunCells_class': div_testRunCells_class_22, 'div_testRunCells_internalRoleCellName': div_testRunCells_internalRoleCellName_22]))

WebUI.takeScreenshot(reportLocation + '/TC74/Step 86-Click on div testRunCells TestRunCell24.png')

"Step 87: Click on button closeActions (Unknown)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_closeActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_closeActions', ['button_closeActions_class': button_closeActions_class_14, 'button_closeActions_nth': button_closeActions_nth_13]))

WebUI.takeScreenshot(reportLocation + '/TC74/Step 87-Click on button closeActions Unknown.png')

"Step 88: Click on button Terminate"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Terminate_1'))

WebUI.takeScreenshot(reportLocation + '/TC74/Step 88-Click on button Terminate.png')

"Step 89: Click on button Confirm"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Confirm'))

WebUI.takeScreenshot(reportLocation + '/TC74/Step 89-Click on button Confirm.png')

"Step 90: Click on div testRunCells (TestRunCell25)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_testRunCells"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_testRunCells', ['div_testRunCells_class': div_testRunCells_class_23, 'div_testRunCells_internalRoleCellName': div_testRunCells_internalRoleCellName_23]))

WebUI.takeScreenshot(reportLocation + '/TC74/Step 90-Click on div testRunCells TestRunCell25.png')

"Step 91: Click on button closeActions (Unknown)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_closeActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_closeActions', ['button_closeActions_class': button_closeActions_class_15, 'button_closeActions_nth': button_closeActions_nth_14]))

WebUI.takeScreenshot(reportLocation + '/TC74/Step 91-Click on button closeActions Unknown.png')

"Step 92: Click on button Terminate"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Terminate_1'))

WebUI.takeScreenshot(reportLocation + '/TC74/Step 92-Click on button Terminate.png')

"Step 93: Click on button Confirm"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Confirm'))

WebUI.takeScreenshot(reportLocation + '/TC74/Step 93-Click on button Confirm.png')

"Step 94: Click on div testRunCells (TestRunCell26)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_testRunCells"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_testRunCells', ['div_testRunCells_class': div_testRunCells_class_24, 'div_testRunCells_internalRoleCellName': div_testRunCells_internalRoleCellName_24]))

WebUI.takeScreenshot(reportLocation + '/TC74/Step 94-Click on div testRunCells TestRunCell26.png')

"Step 95: Click on button Terminate"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Terminate_1'))

WebUI.takeScreenshot(reportLocation + '/TC74/Step 95-Click on button Terminate.png')

"Step 96: Click on button Confirm"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Confirm'))

WebUI.takeScreenshot(reportLocation + '/TC74/Step 96-Click on button Confirm.png')

"Step 97: Click on div testRunCells (TestRunCell27)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_testRunCells"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_testRunCells', ['div_testRunCells_class': div_testRunCells_class_25, 'div_testRunCells_internalRoleCellName': div_testRunCells_internalRoleCellName_25]))

WebUI.takeScreenshot(reportLocation + '/TC74/Step 97-Click on div testRunCells TestRunCell27.png')

"Step 98: Click on button closeActions (Unknown)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_closeActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_closeActions', ['button_closeActions_class': button_closeActions_class_16, 'button_closeActions_nth': button_closeActions_nth_15]))

WebUI.takeScreenshot(reportLocation + '/TC74/Step 98-Click on button closeActions Unknown.png')

"Step 99: Click on button Terminate"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Terminate_1'))

WebUI.takeScreenshot(reportLocation + '/TC74/Step 99-Click on button Terminate.png')

"Step 100: Click on button Confirm -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Confirm'))

WebUI.takeScreenshot(reportLocation + '/TC74/Step 100-Click on button Confirm - Navigate to page .png')

"Step 101: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC74-Terminate Test Runs in Sauce Demo_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}