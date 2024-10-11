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

"Step 4: Click on div teamProjectCells (TeamProjectCell)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_teamProjectCells"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_teamProjectCells', ['div_teamProjectCells_class': div_teamProjectCells_class, 'div_teamProjectCells_internalRoleCellName': div_teamProjectCells_internalRoleCellName]))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 4-Click on div teamProjectCells TeamProjectCell.png')

"Step 5: Click on button Terminate"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Terminate'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 5-Click on button Terminate.png')

"Step 6: Click on button Confirm"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Confirm'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 6-Click on button Confirm.png')

"Step 7: Click on div teamProjectCells (TeamProjectCell2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_teamProjectCells"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_teamProjectCells', ['div_teamProjectCells_class': div_teamProjectCells_class_1, 'div_teamProjectCells_internalRoleCellName': div_teamProjectCells_internalRoleCellName_1]))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 7-Click on div teamProjectCells TeamProjectCell2.png')

"Step 8: Click on button alertClose (AlertClose)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_alertClose'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 8-Click on button alertClose AlertClose.png')

"Step 9: Click on button Terminate"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Terminate'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 9-Click on button Terminate.png')

"Step 10: Click on button Confirm"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Confirm'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 10-Click on button Confirm.png')

"Step 11: Click on button alertClose (AlertClose2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_alertClose'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 11-Click on button alertClose AlertClose2.png')

"Step 12: Click on div teamProjectCells (TeamProjectCell3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_teamProjectCells"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_teamProjectCells', ['div_teamProjectCells_class': div_teamProjectCells_class_2, 'div_teamProjectCells_internalRoleCellName': div_teamProjectCells_internalRoleCellName_2]))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 12-Click on div teamProjectCells TeamProjectCell3.png')

"Step 13: Click on button Terminate"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Terminate'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 13-Click on button Terminate.png')

"Step 14: Click on button Confirm"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Confirm'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 14-Click on button Confirm.png')

"Step 15: Click on div teamProjectCells (TeamProjectCell4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_teamProjectCells"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_teamProjectCells', ['div_teamProjectCells_class': div_teamProjectCells_class_3, 'div_teamProjectCells_internalRoleCellName': div_teamProjectCells_internalRoleCellName_3]))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 15-Click on div teamProjectCells TeamProjectCell4.png')

"Step 16: Click on button Terminate"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Terminate'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 16-Click on button Terminate.png')

"Step 17: Click on button Confirm"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Confirm'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 17-Click on button Confirm.png')

"Step 18: Click on div TeamProjectInfo"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_TeamProjectInfo'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 18-Click on div TeamProjectInfo.png')

"Step 19: Click on div teamProjectCells (TeamProjectCell5)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_teamProjectCells"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_teamProjectCells', ['div_teamProjectCells_class': div_teamProjectCells_class_4, 'div_teamProjectCells_internalRoleCellName': div_teamProjectCells_internalRoleCellName_4]))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 19-Click on div teamProjectCells TeamProjectCell5.png')

"Step 20: Click on button alertClose (AlertClose)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_alertClose'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 20-Click on button alertClose AlertClose.png')

"Step 21: Click on button Terminate"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Terminate'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 21-Click on button Terminate.png')

"Step 22: Click on button Confirm"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Confirm'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 22-Click on button Confirm.png')

"Step 23: Click on div teamProjectCells (TeamProjectCell6)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_teamProjectCells"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_teamProjectCells', ['div_teamProjectCells_class': div_teamProjectCells_class_5, 'div_teamProjectCells_internalRoleCellName': div_teamProjectCells_internalRoleCellName_5]))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 23-Click on div teamProjectCells TeamProjectCell6.png')

"Step 24: Click on button Terminate"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Terminate'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 24-Click on button Terminate.png')

"Step 25: Click on button Confirm"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Confirm'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 25-Click on button Confirm.png')

"Step 26: Click on div teamProjectCells (TeamProjectCell7)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_teamProjectCells"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_teamProjectCells', ['div_teamProjectCells_class': div_teamProjectCells_class_6, 'div_teamProjectCells_internalRoleCellName': div_teamProjectCells_internalRoleCellName_6]))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 26-Click on div teamProjectCells TeamProjectCell7.png')

"Step 27: Click on button Terminate"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Terminate'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 27-Click on button Terminate.png')

"Step 28: Click on button Confirm"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Confirm'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 28-Click on button Confirm.png')

"Step 29: Click on div teamProjectCells (TeamProjectCell8)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_teamProjectCells"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_teamProjectCells', ['div_teamProjectCells_class': div_teamProjectCells_class_7, 'div_teamProjectCells_internalRoleCellName': div_teamProjectCells_internalRoleCellName_7]))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 29-Click on div teamProjectCells TeamProjectCell8.png')

"Step 30: Click on button alertClose (AlertClose)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_alertClose'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 30-Click on button alertClose AlertClose.png')

"Step 31: Click on button Terminate"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Terminate'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 31-Click on button Terminate.png')

"Step 32: Click on button Confirm"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Confirm'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 32-Click on button Confirm.png')

"Step 33: Click on div teamProjectCells (TeamProjectCell9)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_teamProjectCells"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_teamProjectCells', ['div_teamProjectCells_class': div_teamProjectCells_class_8, 'div_teamProjectCells_internalRoleCellName': div_teamProjectCells_internalRoleCellName_8]))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 33-Click on div teamProjectCells TeamProjectCell9.png')

"Step 34: Click on button alertClose (AlertClose)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_alertClose'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 34-Click on button alertClose AlertClose.png')

"Step 35: Click on button Terminate"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Terminate'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 35-Click on button Terminate.png')

"Step 36: Click on button Confirm"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Confirm'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 36-Click on button Confirm.png')

"Step 37: Click on div teamProjectCells (TeamProjectRunSession)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_teamProjectCells"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_teamProjectCells', ['div_teamProjectCells_class': div_teamProjectCells_class_9, 'div_teamProjectCells_internalRoleCellName': div_teamProjectCells_internalRoleCellName_9]))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 37-Click on div teamProjectCells TeamProjectRunSession.png')

"Step 38: Click on div TestRunDetails"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_TestRunDetails'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 38-Click on div TestRunDetails.png')

"Step 39: Click on button Terminate"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Terminate'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 39-Click on button Terminate.png')

"Step 40: Click on button Confirm"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Confirm'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 40-Click on button Confirm.png')

"Step 41: Click on div teamProjectCells (TeamProjectCell10)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_teamProjectCells"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_teamProjectCells', ['div_teamProjectCells_class': div_teamProjectCells_class_10, 'div_teamProjectCells_internalRoleCellName': div_teamProjectCells_internalRoleCellName_10]))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 41-Click on div teamProjectCells TeamProjectCell10.png')

"Step 42: Click on button alertClose (AlertClose)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_alertClose'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 42-Click on button alertClose AlertClose.png')

"Step 43: Click on button Terminate"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Terminate'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 43-Click on button Terminate.png')

"Step 44: Click on button Confirm"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Confirm'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 44-Click on button Confirm.png')

"Step 45: Click on div teamProjectCells (TeamProjectCell11)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_teamProjectCells"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_teamProjectCells', ['div_teamProjectCells_class': div_teamProjectCells_class_11, 'div_teamProjectCells_internalRoleCellName': div_teamProjectCells_internalRoleCellName_11]))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 45-Click on div teamProjectCells TeamProjectCell11.png')

"Step 46: Click on button alertClose (AlertClose)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_alertClose'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 46-Click on button alertClose AlertClose.png')

"Step 47: Click on button Terminate"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Terminate'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 47-Click on button Terminate.png')

"Step 48: Click on button Confirm"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Confirm'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 48-Click on button Confirm.png')

"Step 49: Click on div teamProjectCells (TeamProjectCell12)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_teamProjectCells"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_teamProjectCells', ['div_teamProjectCells_class': div_teamProjectCells_class_12, 'div_teamProjectCells_internalRoleCellName': div_teamProjectCells_internalRoleCellName_12]))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 49-Click on div teamProjectCells TeamProjectCell12.png')

"Step 50: Click on button Terminate"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Terminate'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 50-Click on button Terminate.png')

"Step 51: Click on button Confirm"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Confirm'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 51-Click on button Confirm.png')

"Step 52: Click on div teamProjectCells (TeamProjectCell13)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_teamProjectCells"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_teamProjectCells', ['div_teamProjectCells_class': div_teamProjectCells_class_13, 'div_teamProjectCells_internalRoleCellName': div_teamProjectCells_internalRoleCellName_13]))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 52-Click on div teamProjectCells TeamProjectCell13.png')

"Step 53: Click on button alertClose (AlertClose)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_alertClose'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 53-Click on button alertClose AlertClose.png')

"Step 54: Click on button Terminate"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Terminate'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 54-Click on button Terminate.png')

"Step 55: Click on button Confirm"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Confirm'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 55-Click on button Confirm.png')

"Step 56: Click on div teamProjectCells (TeamProjectCell14)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_teamProjectCells"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_teamProjectCells', ['div_teamProjectCells_class': div_teamProjectCells_class_14, 'div_teamProjectCells_internalRoleCellName': div_teamProjectCells_internalRoleCellName_14]))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 56-Click on div teamProjectCells TeamProjectCell14.png')

"Step 57: Click on button alertClose (AlertClose)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_alertClose'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 57-Click on button alertClose AlertClose.png')

"Step 58: Click on button Terminate"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Terminate'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 58-Click on button Terminate.png')

"Step 59: Click on button Confirm"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Confirm'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 59-Click on button Confirm.png')

"Step 60: Click on div teamProjectCells (TeamProjectCell15)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_teamProjectCells"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_teamProjectCells', ['div_teamProjectCells_class': div_teamProjectCells_class_15, 'div_teamProjectCells_internalRoleCellName': div_teamProjectCells_internalRoleCellName_15]))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 60-Click on div teamProjectCells TeamProjectCell15.png')

"Step 61: Click on button alertClose (AlertClose)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_alertClose'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 61-Click on button alertClose AlertClose.png')

"Step 62: Click on button Terminate"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Terminate'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 62-Click on button Terminate.png')

"Step 63: Click on button Confirm"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Confirm'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 63-Click on button Confirm.png')

"Step 64: Click on div teamProjectCells (TeamProjectCell16)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_teamProjectCells"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_teamProjectCells', ['div_teamProjectCells_class': div_teamProjectCells_class_16, 'div_teamProjectCells_internalRoleCellName': div_teamProjectCells_internalRoleCellName_16]))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 64-Click on div teamProjectCells TeamProjectCell16.png')

"Step 65: Click on button Terminate"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Terminate'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 65-Click on button Terminate.png')

"Step 66: Click on button Confirm"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Confirm'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 66-Click on button Confirm.png')

"Step 67: Click on div teamProjectCells (TeamProjectCell17)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_teamProjectCells"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_teamProjectCells', ['div_teamProjectCells_class': div_teamProjectCells_class_17, 'div_teamProjectCells_internalRoleCellName': div_teamProjectCells_internalRoleCellName_17]))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 67-Click on div teamProjectCells TeamProjectCell17.png')

"Step 68: Click on button Terminate"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Terminate'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 68-Click on button Terminate.png')

"Step 69: Click on button Confirm"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Confirm'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 69-Click on button Confirm.png')

"Step 70: Click on div teamProjectCells (TeamProjectCell18)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_teamProjectCells"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_teamProjectCells', ['div_teamProjectCells_class': div_teamProjectCells_class_18, 'div_teamProjectCells_internalRoleCellName': div_teamProjectCells_internalRoleCellName_18]))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 70-Click on div teamProjectCells TeamProjectCell18.png')

"Step 71: Click on button alertClose (AlertClose)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_alertClose'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 71-Click on button alertClose AlertClose.png')

"Step 72: Click on button Terminate"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Terminate'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 72-Click on button Terminate.png')

"Step 73: Click on button Confirm"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Confirm'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 73-Click on button Confirm.png')

"Step 74: Click on div teamProjectCells (TeamProjectCell19)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_teamProjectCells"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_teamProjectCells', ['div_teamProjectCells_class': div_teamProjectCells_class_19, 'div_teamProjectCells_internalRoleCellName': div_teamProjectCells_internalRoleCellName_19]))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 74-Click on div teamProjectCells TeamProjectCell19.png')

"Step 75: Click on button alertClose (AlertClose)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_alertClose'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 75-Click on button alertClose AlertClose.png')

"Step 76: Click on button Terminate"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Terminate'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 76-Click on button Terminate.png')

"Step 77: Click on button Confirm"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Confirm'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 77-Click on button Confirm.png')

"Step 78: Click on div teamProjectCells (TeamProjectCell20)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_teamProjectCells"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_teamProjectCells', ['div_teamProjectCells_class': div_teamProjectCells_class_20, 'div_teamProjectCells_internalRoleCellName': div_teamProjectCells_internalRoleCellName_20]))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 78-Click on div teamProjectCells TeamProjectCell20.png')

"Step 79: Click on button alertClose (AlertClose)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_alertClose'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 79-Click on button alertClose AlertClose.png')

"Step 80: Click on button Terminate"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Terminate'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 80-Click on button Terminate.png')

"Step 81: Click on button Confirm"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Confirm'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 81-Click on button Confirm.png')

"Step 82: Click on div teamProjectCells (TeamProjectCell21)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_teamProjectCells"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_teamProjectCells', ['div_teamProjectCells_class': div_teamProjectCells_class_21, 'div_teamProjectCells_internalRoleCellName': div_teamProjectCells_internalRoleCellName_21]))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 82-Click on div teamProjectCells TeamProjectCell21.png')

"Step 83: Click on button alertClose (AlertClose)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_alertClose'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 83-Click on button alertClose AlertClose.png')

"Step 84: Click on button Terminate"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Terminate'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 84-Click on button Terminate.png')

"Step 85: Click on button Confirm"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Confirm'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 85-Click on button Confirm.png')

"Step 86: Click on div teamProjectCells (TeamProjectCell22)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_teamProjectCells"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_teamProjectCells', ['div_teamProjectCells_class': div_teamProjectCells_class_22, 'div_teamProjectCells_internalRoleCellName': div_teamProjectCells_internalRoleCellName_22]))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 86-Click on div teamProjectCells TeamProjectCell22.png')

"Step 87: Click on button alertClose (AlertClose)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_alertClose'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 87-Click on button alertClose AlertClose.png')

"Step 88: Click on button Terminate"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Terminate'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 88-Click on button Terminate.png')

"Step 89: Click on button Confirm"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Confirm'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 89-Click on button Confirm.png')

"Step 90: Click on div teamProjectCells (TeamProjectCell23)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_teamProjectCells"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_teamProjectCells', ['div_teamProjectCells_class': div_teamProjectCells_class_23, 'div_teamProjectCells_internalRoleCellName': div_teamProjectCells_internalRoleCellName_23]))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 90-Click on div teamProjectCells TeamProjectCell23.png')

"Step 91: Click on button alertClose (AlertClose)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_alertClose'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 91-Click on button alertClose AlertClose.png')

"Step 92: Click on button Terminate"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Terminate'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 92-Click on button Terminate.png')

"Step 93: Click on button Confirm"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Confirm'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 93-Click on button Confirm.png')

"Step 94: Click on div teamProjectCells (TeamProjectCell24)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_teamProjectCells"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_teamProjectCells', ['div_teamProjectCells_class': div_teamProjectCells_class_24, 'div_teamProjectCells_internalRoleCellName': div_teamProjectCells_internalRoleCellName_24]))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 94-Click on div teamProjectCells TeamProjectCell24.png')

"Step 95: Click on button Terminate"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Terminate'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 95-Click on button Terminate.png')

"Step 96: Click on button Confirm"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Confirm'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 96-Click on button Confirm.png')

"Step 97: Click on div teamProjectCells (TeamProjectCell25)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_teamProjectCells"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_teamProjectCells', ['div_teamProjectCells_class': div_teamProjectCells_class_25, 'div_teamProjectCells_internalRoleCellName': div_teamProjectCells_internalRoleCellName_25]))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 97-Click on div teamProjectCells TeamProjectCell25.png')

"Step 98: Click on button alertClose (AlertClose)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_alertClose'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 98-Click on button alertClose AlertClose.png')

"Step 99: Click on button Terminate"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Terminate'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 99-Click on button Terminate.png')

"Step 100: Click on button Confirm -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Confirm'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 100-Click on button Confirm - Navigate to page .png')

"Step 101: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC13-Terminate Test Runs and Verify Home Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}