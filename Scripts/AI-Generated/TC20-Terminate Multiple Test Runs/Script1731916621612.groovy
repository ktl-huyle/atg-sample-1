import truetest.custom.TrueTestScripts
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI


'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to team/*/project/*/test-runs"

TrueTestScripts.navigate("team/${GlobalVariable.team_id}/project/${GlobalVariable.project_id}/test-runs")

"Step 2: Click on input rowSelectionCheckbox (SelectRowCheckbox4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/input_rowSelectionCheckbox"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/input_rowSelectionCheckbox', ['input_rowSelectionCheckbox_class': input_rowSelectionCheckbox_class, 'input_rowSelectionCheckbox_internalRoleRowName': input_rowSelectionCheckbox_internalRoleRowName]))

WebUI.takeScreenshot()

"Step 3: Click on input rowSelectionCheckbox (SelectRow)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/input_rowSelectionCheckbox"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/input_rowSelectionCheckbox', ['input_rowSelectionCheckbox_class': input_rowSelectionCheckbox_class_1, 'input_rowSelectionCheckbox_internalRoleRowName': input_rowSelectionCheckbox_internalRoleRowName_1]))

WebUI.takeScreenshot()

"Step 4: Click on button Terminate"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_Terminate'))

WebUI.takeScreenshot()

"Step 5: Click on button Confirm"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_Confirm'))

WebUI.takeScreenshot()

"Step 6: Click on input rowSelectionCheckbox (SelectRow2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/input_rowSelectionCheckbox"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/input_rowSelectionCheckbox', ['input_rowSelectionCheckbox_class': input_rowSelectionCheckbox_class_2, 'input_rowSelectionCheckbox_internalRoleRowName': input_rowSelectionCheckbox_internalRoleRowName_2]))

WebUI.takeScreenshot()

"Step 7: Click on input rowSelectionCheckbox (SelectRow3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/input_rowSelectionCheckbox"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/input_rowSelectionCheckbox', ['input_rowSelectionCheckbox_class': input_rowSelectionCheckbox_class_3, 'input_rowSelectionCheckbox_internalRoleRowName': input_rowSelectionCheckbox_internalRoleRowName_3]))

WebUI.takeScreenshot()

"Step 8: Click on input rowSelectionCheckbox (SelectRow4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/input_rowSelectionCheckbox"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/input_rowSelectionCheckbox', ['input_rowSelectionCheckbox_class': input_rowSelectionCheckbox_class_4, 'input_rowSelectionCheckbox_internalRoleRowName': input_rowSelectionCheckbox_internalRoleRowName_4]))

WebUI.takeScreenshot()

"Step 9: Click on button Terminate2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_Terminate2'))

WebUI.takeScreenshot()

"Step 10: Click on button Confirm"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_Confirm'))

WebUI.takeScreenshot()

"Step 11: Click on input rowSelectionCheckbox (SelectRow5)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/input_rowSelectionCheckbox"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/input_rowSelectionCheckbox', ['input_rowSelectionCheckbox_class': input_rowSelectionCheckbox_class_5, 'input_rowSelectionCheckbox_internalRoleRowName': input_rowSelectionCheckbox_internalRoleRowName_5]))

WebUI.takeScreenshot()

"Step 12: Click on button Terminate"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_Terminate'))

WebUI.takeScreenshot()

"Step 13: Click on button Confirm -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_Confirm'))

WebUI.takeScreenshot()

"Step 14: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC20-Terminate Multiple Test Runs_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}