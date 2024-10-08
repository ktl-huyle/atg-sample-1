import truetest.custom.TrueTestScripts
import com.kms.katalon.core.configuration.RunConfiguration
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
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

"Step 3: Navigate to organization/*/home"

TrueTestScripts.navigate("organization/${GlobalVariable.organization_id}/home")

"Step 4: Click on link testRunLinks (TestExecution 44) -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/link_testRunLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/link_testRunLinks', ['link_testRunLinks_internalRoleLinkName': link_testRunLinks_internalRoleLinkName, 'link_testRunLinks_team_id': link_testRunLinks_team_id, 'link_testRunLinks_executions_id': link_testRunLinks_executions_id, 'link_testRunLinks_project_id': link_testRunLinks_project_id]))

WebUI.takeScreenshot(reportLocation + '/TC71/Step 4-Click on link testRunLinks TestExecution 44 - Navigate to page teamprojectexecutions.png')

"Step 5: Click on button AddTestCase"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_AddTestCase'))

WebUI.takeScreenshot(reportLocation + '/TC71/Step 5-Click on button AddTestCase.png')

"Step 6: Click on button RecordTestSteps -> Navigate to page 'team/*/project/*/test-design/test-cases/*/edit'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_RecordTestSteps'))

WebUI.takeScreenshot(reportLocation + '/TC71/Step 6-Click on button RecordTestSteps - Navigate to page teamprojecttest-designtest-casesedit.png')

"Step 7: Click on span dragSelects (DragSelect)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases_edit/span_dragSelects"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases_edit/span_dragSelects', ['span_dragSelects_internalRoleButtonName': span_dragSelects_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC71/Step 7-Click on span dragSelects DragSelect.png')

"Step 8: Click on span dragSelects (DragSelect)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases_edit/span_dragSelects"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases_edit/span_dragSelects', ['span_dragSelects_internalRoleButtonName': span_dragSelects_internalRoleButtonName_1]))

WebUI.takeScreenshot(reportLocation + '/TC71/Step 8-Click on span dragSelects DragSelect.png')

"Step 9: Click on span dragSelects (DragSelect)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases_edit/span_dragSelects"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases_edit/span_dragSelects', ['span_dragSelects_internalRoleButtonName': span_dragSelects_internalRoleButtonName_2]))

WebUI.takeScreenshot(reportLocation + '/TC71/Step 9-Click on span dragSelects DragSelect.png')

"Step 10: Click on button AddNewTestStep"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases_edit/button_AddNewTestStep'))

WebUI.takeScreenshot(reportLocation + '/TC71/Step 10-Click on button AddNewTestStep.png')

"Step 11: Click on div selectValueActions (ClickOnObject)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases_edit/div_selectValueActions'))

WebUI.takeScreenshot(reportLocation + '/TC71/Step 11-Click on div selectValueActions ClickOnObject.png')

"Step 12: Click on input objectInputs (ObjectInput)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases_edit/input_objectInputs"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases_edit/input_objectInputs', ['input_objectInputs_internalAttrPlaceholder': input_objectInputs_internalAttrPlaceholder]))

WebUI.takeScreenshot(reportLocation + '/TC71/Step 12-Click on input objectInputs ObjectInput.png')

"Step 13: Click on div ObjectInputContainer"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases_edit/div_ObjectInputContainer'))

WebUI.takeScreenshot(reportLocation + '/TC71/Step 13-Click on div ObjectInputContainer.png')

"Step 14: Click on div CaptureNewObjectOption"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases_edit/div_CaptureNewObjectOption'))

WebUI.takeScreenshot(reportLocation + '/TC71/Step 14-Click on div CaptureNewObjectOption.png')

"Step 15: Click on button Save"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases_edit/button_Save'))

WebUI.takeScreenshot(reportLocation + '/TC71/Step 15-Click on button Save.png')

"Step 16: Click on div Unknown"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases_edit/div_Unknown'))

WebUI.takeScreenshot(reportLocation + '/TC71/Step 16-Click on div Unknown.png')

"Step 17: Click on button AddNewTestStep"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases_edit/button_AddNewTestStep'))

WebUI.takeScreenshot(reportLocation + '/TC71/Step 17-Click on button AddNewTestStep.png')

"Step 18: Enter input value in input AutocompleteInput"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_team_project_test_design_test_cases_edit/input_AutocompleteInput'), input_AutocompleteInput)

WebUI.takeScreenshot(reportLocation + '/TC71/Step 18-Enter input value in input AutocompleteInput.png')

"Step 19: Click on div selectValueActions (SelectValueDropdown)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases_edit/div_selectValueActions'))

WebUI.takeScreenshot(reportLocation + '/TC71/Step 19-Click on div selectValueActions SelectValueDropdown.png')

"Step 20: Click on input ValueInput"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases_edit/input_ValueInput'))

WebUI.takeScreenshot(reportLocation + '/TC71/Step 20-Click on input ValueInput.png')

"Step 21: Click on input objectInputs (DropdownObjectInput)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases_edit/input_objectInputs"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases_edit/input_objectInputs', ['input_objectInputs_internalAttrPlaceholder': input_objectInputs_internalAttrPlaceholder_1]))

WebUI.takeScreenshot(reportLocation + '/TC71/Step 21-Click on input objectInputs DropdownObjectInput.png')

"Step 22: Click on div CaptureNewObjectOption"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases_edit/div_CaptureNewObjectOption'))

WebUI.takeScreenshot(reportLocation + '/TC71/Step 22-Click on div CaptureNewObjectOption.png')

"Step 23: Click on input ValueInput"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases_edit/input_ValueInput'))

WebUI.takeScreenshot(reportLocation + '/TC71/Step 23-Click on input ValueInput.png')

"Step 24: Enter input value in input ValueInput"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_team_project_test_design_test_cases_edit/input_ValueInput'), input_ValueInput)

WebUI.takeScreenshot(reportLocation + '/TC71/Step 24-Enter input value in input ValueInput.png')

"Step 25: Click on button Save2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases_edit/button_Save2'))

WebUI.takeScreenshot(reportLocation + '/TC71/Step 25-Click on button Save2.png')

"Step 26: Click on input dragSelectCheckboxes (Checkbox)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases_edit/input_dragSelectCheckboxes'))

WebUI.takeScreenshot(reportLocation + '/TC71/Step 26-Click on input dragSelectCheckboxes Checkbox.png')

"Step 27: Click on input dragSelectCheckboxes (DragSelectCheckbox)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases_edit/input_dragSelectCheckboxes"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases_edit/input_dragSelectCheckboxes', ['input_dragSelectCheckboxes_internalRoleButtonName': input_dragSelectCheckboxes_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC71/Step 27-Click on input dragSelectCheckboxes DragSelectCheckbox.png')

"Step 28: Click on input dragSelectCheckboxes (DragSelectCheckbox2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases_edit/input_dragSelectCheckboxes"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases_edit/input_dragSelectCheckboxes', ['input_dragSelectCheckboxes_internalRoleButtonName': input_dragSelectCheckboxes_internalRoleButtonName_1]))

WebUI.takeScreenshot(reportLocation + '/TC71/Step 28-Click on input dragSelectCheckboxes DragSelectCheckbox2.png')

"Step 29: Click on input dragSelectCheckboxes (DragSelectCheckbox3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases_edit/input_dragSelectCheckboxes"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases_edit/input_dragSelectCheckboxes', ['input_dragSelectCheckboxes_internalRoleButtonName': input_dragSelectCheckboxes_internalRoleButtonName_2]))

WebUI.takeScreenshot(reportLocation + '/TC71/Step 29-Click on input dragSelectCheckboxes DragSelectCheckbox3.png')

"Step 30: Click on input dragSelectCheckboxes (DragSelectCheckbox4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases_edit/input_dragSelectCheckboxes"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases_edit/input_dragSelectCheckboxes', ['input_dragSelectCheckboxes_internalRoleButtonName': input_dragSelectCheckboxes_internalRoleButtonName_3]))

WebUI.takeScreenshot(reportLocation + '/TC71/Step 30-Click on input dragSelectCheckboxes DragSelectCheckbox4.png')

"Step 31: Click on input dragSelectCheckboxes (DragSelectCheckbox5)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases_edit/input_dragSelectCheckboxes"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases_edit/input_dragSelectCheckboxes', ['input_dragSelectCheckboxes_internalRoleButtonName': input_dragSelectCheckboxes_internalRoleButtonName_4]))

WebUI.takeScreenshot(reportLocation + '/TC71/Step 31-Click on input dragSelectCheckboxes DragSelectCheckbox5.png')

"Step 32: Click on input dragSelectCheckboxes (DragSelectCheckbox6)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases_edit/input_dragSelectCheckboxes"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases_edit/input_dragSelectCheckboxes', ['input_dragSelectCheckboxes_internalRoleButtonName': input_dragSelectCheckboxes_internalRoleButtonName_5]))

WebUI.takeScreenshot(reportLocation + '/TC71/Step 32-Click on input dragSelectCheckboxes DragSelectCheckbox6.png')

"Step 33: Click on input dragSelectCheckboxes (DragSelectCheckbox7)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases_edit/input_dragSelectCheckboxes"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases_edit/input_dragSelectCheckboxes', ['input_dragSelectCheckboxes_internalRoleButtonName': input_dragSelectCheckboxes_internalRoleButtonName_6]))

WebUI.takeScreenshot(reportLocation + '/TC71/Step 33-Click on input dragSelectCheckboxes DragSelectCheckbox7.png')

"Step 34: Click on input dragSelectCheckboxes (DragSelectCheckbox8)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases_edit/input_dragSelectCheckboxes"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases_edit/input_dragSelectCheckboxes', ['input_dragSelectCheckboxes_internalRoleButtonName': input_dragSelectCheckboxes_internalRoleButtonName_7]))

WebUI.takeScreenshot(reportLocation + '/TC71/Step 34-Click on input dragSelectCheckboxes DragSelectCheckbox8.png')

"Step 35: Click on span DeleteSelectedSteps"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases_edit/span_DeleteSelectedSteps'))

WebUI.takeScreenshot(reportLocation + '/TC71/Step 35-Click on span DeleteSelectedSteps.png')

"Step 36: Click on div RecordPlayback"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases_edit/div_RecordPlayback'))

WebUI.takeScreenshot(reportLocation + '/TC71/Step 36-Click on div RecordPlayback.png')

"Step 37: Click on button Playback"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases_edit/button_Playback'))

WebUI.takeScreenshot(reportLocation + '/TC71/Step 37-Click on button Playback.png')

"Step 38: Click on span dragSelects (DragSelect2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases_edit/span_dragSelects"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases_edit/span_dragSelects', ['span_dragSelects_internalRoleButtonName': span_dragSelects_internalRoleButtonName_3]))

WebUI.takeScreenshot(reportLocation + '/TC71/Step 38-Click on span dragSelects DragSelect2.png')

"Step 39: Click on span dragSelects (DragSelect2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases_edit/span_dragSelects"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases_edit/span_dragSelects', ['span_dragSelects_internalRoleButtonName': span_dragSelects_internalRoleButtonName_4]))

WebUI.takeScreenshot(reportLocation + '/TC71/Step 39-Click on span dragSelects DragSelect2.png')

"Step 40: Click on span dragSelects (DragSelect2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases_edit/span_dragSelects"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases_edit/span_dragSelects', ['span_dragSelects_internalRoleButtonName': span_dragSelects_internalRoleButtonName_5]))

WebUI.takeScreenshot(reportLocation + '/TC71/Step 40-Click on span dragSelects DragSelect2.png')

"Step 41: Click on span dragSelects (DragSelect2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases_edit/span_dragSelects"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases_edit/span_dragSelects', ['span_dragSelects_internalRoleButtonName': span_dragSelects_internalRoleButtonName_6]))

WebUI.takeScreenshot(reportLocation + '/TC71/Step 41-Click on span dragSelects DragSelect2.png')

"Step 42: Click on button Edit"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases_edit/button_Edit'))

WebUI.takeScreenshot(reportLocation + '/TC71/Step 42-Click on button Edit.png')

"Step 43: Click on input ValueInput2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases_edit/input_ValueInput2'))

WebUI.takeScreenshot(reportLocation + '/TC71/Step 43-Click on input ValueInput2.png')

"Step 44: Click on input ValueInput2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases_edit/input_ValueInput2'))

WebUI.takeScreenshot(reportLocation + '/TC71/Step 44-Click on input ValueInput2.png')

"Step 45: Enter input value in input ValueInput2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_team_project_test_design_test_cases_edit/input_ValueInput2'), input_ValueInput2)

WebUI.takeScreenshot(reportLocation + '/TC71/Step 45-Enter input value in input ValueInput2.png')

"Step 46: Click on button Save3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases_edit/button_Save3'))

WebUI.takeScreenshot(reportLocation + '/TC71/Step 46-Click on button Save3.png')

"Step 47: Click on button Playback -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases_edit/button_Playback'))

WebUI.takeScreenshot(reportLocation + '/TC71/Step 47-Click on button Playback - Navigate to page .png')

"Step 48: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC71-Verify Test Step Recording and Playback in Team Project_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}