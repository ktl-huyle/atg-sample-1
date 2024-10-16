import internal.GlobalVariable
import com.kms.katalon.core.configuration.RunConfiguration
import truetest.custom.TrueTestScripts
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

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

"Step 4: Click on link testExecution (Sample Test Case) -> Navigate to page 'team project executions#team/{*}/project/{*}/executions/{*}'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'organization/{.*}/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/link_testExecution"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/link_testExecution', ['link_testExecution_internalRoleLinkName': link_testExecution_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC194/Step 4-Click on link testExecution Sample Test Case - Navigate to page team project executionsteamprojectexecutions.png')

"Step 5: Click on button AddTestCase"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/executions/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_AddTestCase'))

WebUI.takeScreenshot(reportLocation + '/TC194/Step 5-Click on button AddTestCase.png')

"Step 6: Click on button RecordTestSteps -> Navigate to page 'team project edit#team/{*}/project/{*}/{*}/{*}/{*}/edit'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/executions/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_RecordTestSteps'))

WebUI.takeScreenshot(reportLocation + '/TC194/Step 6-Click on button RecordTestSteps - Navigate to page team project editteamprojectedit.png')

"Step 7: Click on span dragSelect (dragSelect)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}/{.*}/edit?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_edit/span_dragSelect"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_edit/span_dragSelect', ['span_dragSelect_internalRoleButtonName': span_dragSelect_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC194/Step 7-Click on span dragSelect dragSelect.png')

"Step 8: Click on span dragSelect (dragSelect)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}/{.*}/edit?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_edit/span_dragSelect"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_edit/span_dragSelect', ['span_dragSelect_internalRoleButtonName': span_dragSelect_internalRoleButtonName_1]))

WebUI.takeScreenshot(reportLocation + '/TC194/Step 8-Click on span dragSelect dragSelect.png')

"Step 9: Click on span dragSelect (dragSelect)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}/{.*}/edit?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_edit/span_dragSelect"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_edit/span_dragSelect', ['span_dragSelect_internalRoleButtonName': span_dragSelect_internalRoleButtonName_2]))

WebUI.takeScreenshot(reportLocation + '/TC194/Step 9-Click on span dragSelect dragSelect.png')

"Step 10: Click on button addNewTestStep"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}/{.*}/edit?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_edit/button_addNewTestStep'))

WebUI.takeScreenshot(reportLocation + '/TC194/Step 10-Click on button addNewTestStep.png')

"Step 11: Click on div objectSelection (clickOnObject)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}/{.*}/edit?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_edit/div_objectSelection'))

WebUI.takeScreenshot(reportLocation + '/TC194/Step 11-Click on div objectSelection clickOnObject.png')

"Step 12: Click on input objectSelection (selectObject)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}/{.*}/edit?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_edit/input_objectSelection"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_edit/input_objectSelection', ['input_objectSelection_internalAttrPlaceholder': input_objectSelection_internalAttrPlaceholder]))

WebUI.takeScreenshot(reportLocation + '/TC194/Step 12-Click on input objectSelection selectObject.png')

"Step 13: Click on div objectInput"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}/{.*}/edit?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_edit/div_objectInput'))

WebUI.takeScreenshot(reportLocation + '/TC194/Step 13-Click on div objectInput.png')

"Step 14: Click on div captureNewObjectOption"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}/{.*}/edit?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_edit/div_captureNewObjectOption'))

WebUI.takeScreenshot(reportLocation + '/TC194/Step 14-Click on div captureNewObjectOption.png')

"Step 15: Click on button save"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}/{.*}/edit?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_edit/button_save'))

WebUI.takeScreenshot(reportLocation + '/TC194/Step 15-Click on button save.png')

"Step 16: Click on div contextMenu"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}/{.*}/edit?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_edit/div_contextMenu'))

WebUI.takeScreenshot(reportLocation + '/TC194/Step 16-Click on div contextMenu.png')

"Step 17: Click on button addNewTestStep"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}/{.*}/edit?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_edit/button_addNewTestStep'))

WebUI.takeScreenshot(reportLocation + '/TC194/Step 17-Click on button addNewTestStep.png')

"Step 18: Enter input value in input objectSelection (autocompleteAction)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}/{.*}/edit?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_edit/input_objectSelection'), input_objectSelection)

WebUI.takeScreenshot(reportLocation + '/TC194/Step 18-Enter input value in input objectSelection autocompleteAction.png')

"Step 19: Click on div objectSelection (selectValueDropdown)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}/{.*}/edit?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_edit/div_objectSelection'))

WebUI.takeScreenshot(reportLocation + '/TC194/Step 19-Click on div objectSelection selectValueDropdown.png')

"Step 20: Click on input value"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}/{.*}/edit?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_edit/input_value'))

WebUI.takeScreenshot(reportLocation + '/TC194/Step 20-Click on input value.png')

"Step 21: Click on input objectSelection (dropdownObject)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}/{.*}/edit?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_edit/input_objectSelection"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_edit/input_objectSelection', ['input_objectSelection_internalAttrPlaceholder': input_objectSelection_internalAttrPlaceholder_1]))

WebUI.takeScreenshot(reportLocation + '/TC194/Step 21-Click on input objectSelection dropdownObject.png')

"Step 22: Click on div captureNewObjectOption"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}/{.*}/edit?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_edit/div_captureNewObjectOption'))

WebUI.takeScreenshot(reportLocation + '/TC194/Step 22-Click on div captureNewObjectOption.png')

"Step 23: Click on input value"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}/{.*}/edit?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_edit/input_value'))

WebUI.takeScreenshot(reportLocation + '/TC194/Step 23-Click on input value.png')

"Step 24: Enter input value in input value"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}/{.*}/edit?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_team_project_edit/input_value'), input_value)

WebUI.takeScreenshot(reportLocation + '/TC194/Step 24-Enter input value in input value.png')

"Step 25: Click on button save2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}/{.*}/edit?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_edit/button_save2'))

WebUI.takeScreenshot(reportLocation + '/TC194/Step 25-Click on button save2.png')

"Step 26: Click on input dragSelectCheckboxes (checkbox)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}/{.*}/edit?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_edit/input_dragSelectCheckboxes'))

WebUI.takeScreenshot(reportLocation + '/TC194/Step 26-Click on input dragSelectCheckboxes checkbox.png')

"Step 27: Click on input dragSelectCheckboxes (dragSelectCheckbox)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}/{.*}/edit?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_edit/input_dragSelectCheckboxes"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_edit/input_dragSelectCheckboxes', ['input_dragSelectCheckboxes_internalRoleButtonName': input_dragSelectCheckboxes_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC194/Step 27-Click on input dragSelectCheckboxes dragSelectCheckbox.png')

"Step 28: Click on input dragSelectCheckboxes (dragSelectCheckbox2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}/{.*}/edit?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_edit/input_dragSelectCheckboxes"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_edit/input_dragSelectCheckboxes', ['input_dragSelectCheckboxes_internalRoleButtonName': input_dragSelectCheckboxes_internalRoleButtonName_1]))

WebUI.takeScreenshot(reportLocation + '/TC194/Step 28-Click on input dragSelectCheckboxes dragSelectCheckbox2.png')

"Step 29: Click on input dragSelectCheckboxes (dragSelectCheckbox3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}/{.*}/edit?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_edit/input_dragSelectCheckboxes"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_edit/input_dragSelectCheckboxes', ['input_dragSelectCheckboxes_internalRoleButtonName': input_dragSelectCheckboxes_internalRoleButtonName_2]))

WebUI.takeScreenshot(reportLocation + '/TC194/Step 29-Click on input dragSelectCheckboxes dragSelectCheckbox3.png')

"Step 30: Click on input dragSelectCheckboxes (dragSelectCheckbox4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}/{.*}/edit?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_edit/input_dragSelectCheckboxes"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_edit/input_dragSelectCheckboxes', ['input_dragSelectCheckboxes_internalRoleButtonName': input_dragSelectCheckboxes_internalRoleButtonName_3]))

WebUI.takeScreenshot(reportLocation + '/TC194/Step 30-Click on input dragSelectCheckboxes dragSelectCheckbox4.png')

"Step 31: Click on input dragSelectCheckboxes (dragSelectCheckbox5)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}/{.*}/edit?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_edit/input_dragSelectCheckboxes"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_edit/input_dragSelectCheckboxes', ['input_dragSelectCheckboxes_internalRoleButtonName': input_dragSelectCheckboxes_internalRoleButtonName_4]))

WebUI.takeScreenshot(reportLocation + '/TC194/Step 31-Click on input dragSelectCheckboxes dragSelectCheckbox5.png')

"Step 32: Click on input dragSelectCheckboxes (dragSelectCheckbox6)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}/{.*}/edit?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_edit/input_dragSelectCheckboxes"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_edit/input_dragSelectCheckboxes', ['input_dragSelectCheckboxes_internalRoleButtonName': input_dragSelectCheckboxes_internalRoleButtonName_5]))

WebUI.takeScreenshot(reportLocation + '/TC194/Step 32-Click on input dragSelectCheckboxes dragSelectCheckbox6.png')

"Step 33: Click on input dragSelectCheckboxes (dragSelectCheckbox7)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}/{.*}/edit?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_edit/input_dragSelectCheckboxes"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_edit/input_dragSelectCheckboxes', ['input_dragSelectCheckboxes_internalRoleButtonName': input_dragSelectCheckboxes_internalRoleButtonName_6]))

WebUI.takeScreenshot(reportLocation + '/TC194/Step 33-Click on input dragSelectCheckboxes dragSelectCheckbox7.png')

"Step 34: Click on input dragSelectCheckboxes (dragSelectCheckbox8)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}/{.*}/edit?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_edit/input_dragSelectCheckboxes"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_edit/input_dragSelectCheckboxes', ['input_dragSelectCheckboxes_internalRoleButtonName': input_dragSelectCheckboxes_internalRoleButtonName_7]))

WebUI.takeScreenshot(reportLocation + '/TC194/Step 34-Click on input dragSelectCheckboxes dragSelectCheckbox8.png')

"Step 35: Click on span deleteSelectedSteps"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}/{.*}/edit?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_edit/span_deleteSelectedSteps'))

WebUI.takeScreenshot(reportLocation + '/TC194/Step 35-Click on span deleteSelectedSteps.png')

"Step 36: Click on div recordPlayback"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}/{.*}/edit?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_edit/div_recordPlayback'))

WebUI.takeScreenshot(reportLocation + '/TC194/Step 36-Click on div recordPlayback.png')

"Step 37: Click on button playback"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}/{.*}/edit?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_edit/button_playback'))

WebUI.takeScreenshot(reportLocation + '/TC194/Step 37-Click on button playback.png')

"Step 38: Click on span dragSelect (dragSelect2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}/{.*}/edit?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_edit/span_dragSelect"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_edit/span_dragSelect', ['span_dragSelect_internalRoleButtonName': span_dragSelect_internalRoleButtonName_3]))

WebUI.takeScreenshot(reportLocation + '/TC194/Step 38-Click on span dragSelect dragSelect2.png')

"Step 39: Click on span dragSelect (dragSelect2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}/{.*}/edit?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_edit/span_dragSelect"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_edit/span_dragSelect', ['span_dragSelect_internalRoleButtonName': span_dragSelect_internalRoleButtonName_4]))

WebUI.takeScreenshot(reportLocation + '/TC194/Step 39-Click on span dragSelect dragSelect2.png')

"Step 40: Click on span dragSelect (dragSelect2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}/{.*}/edit?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_edit/span_dragSelect"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_edit/span_dragSelect', ['span_dragSelect_internalRoleButtonName': span_dragSelect_internalRoleButtonName_5]))

WebUI.takeScreenshot(reportLocation + '/TC194/Step 40-Click on span dragSelect dragSelect2.png')

"Step 41: Click on span dragSelect (dragSelect2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}/{.*}/edit?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_edit/span_dragSelect"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_edit/span_dragSelect', ['span_dragSelect_internalRoleButtonName': span_dragSelect_internalRoleButtonName_6]))

WebUI.takeScreenshot(reportLocation + '/TC194/Step 41-Click on span dragSelect dragSelect2.png')

"Step 42: Click on button edit"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}/{.*}/edit?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_edit/button_edit'))

WebUI.takeScreenshot(reportLocation + '/TC194/Step 42-Click on button edit.png')

"Step 43: Click on input value2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}/{.*}/edit?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_edit/input_value2'))

WebUI.takeScreenshot(reportLocation + '/TC194/Step 43-Click on input value2.png')

"Step 44: Click on input value2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}/{.*}/edit?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_edit/input_value2'))

WebUI.takeScreenshot(reportLocation + '/TC194/Step 44-Click on input value2.png')

"Step 45: Enter input value in input value2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}/{.*}/edit?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_team_project_edit/input_value2'), input_value2)

WebUI.takeScreenshot(reportLocation + '/TC194/Step 45-Enter input value in input value2.png')

"Step 46: Click on button save3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}/{.*}/edit?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_edit/button_save3'))

WebUI.takeScreenshot(reportLocation + '/TC194/Step 46-Click on button save3.png')

"Step 47: Click on button playback -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}/{.*}/edit?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_edit/button_playback'))

WebUI.takeScreenshot(reportLocation + '/TC194/Step 47-Click on button playback - Navigate to page .png')

"Step 48: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC194-Record and playback test steps in team project executions_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}