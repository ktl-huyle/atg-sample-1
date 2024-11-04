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

"Step 3: Navigate to organization/*/home"

TrueTestScripts.navigate("organization/${GlobalVariable.organization_id}/home")

"Step 4: Click on link executionDetails (FPTestCase) -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/link_executionDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/link_executionDetails', ['link_executionDetails_internalRoleLinkName': link_executionDetails_internalRoleLinkName, 'link_executionDetails_team_id': link_executionDetails_team_id, 'link_executionDetails_executions_id': link_executionDetails_executions_id, 'link_executionDetails_project_id': link_executionDetails_project_id]))

WebUI.takeScreenshot(reportLocation + '/TC310/Step 4-Click on link executionDetails FPTestCase - Navigate to page teamprojectexecutions.png')

"Step 5: Click on button TestCase"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_TestCase'))

WebUI.takeScreenshot(reportLocation + '/TC310/Step 5-Click on button TestCase.png')

"Step 6: Click on button RecordTestSteps -> Navigate to page 'team/*/project/*/test-design/test-cases/*/edit'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_RecordTestSteps'))

WebUI.takeScreenshot(reportLocation + '/TC310/Step 6-Click on button RecordTestSteps - Navigate to page teamprojecttest-designtest-casesedit.png')

"Step 7: Click on span dragSelect (DragSelect)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases_edit/span_dragSelect"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases_edit/span_dragSelect', ['span_dragSelect_internalRoleButtonName': span_dragSelect_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC310/Step 7-Click on span dragSelect DragSelect.png')

"Step 8: Click on span dragSelect (DragSelect)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases_edit/span_dragSelect"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases_edit/span_dragSelect', ['span_dragSelect_internalRoleButtonName': span_dragSelect_internalRoleButtonName_1]))

WebUI.takeScreenshot(reportLocation + '/TC310/Step 8-Click on span dragSelect DragSelect.png')

"Step 9: Click on span dragSelect (DragSelect)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases_edit/span_dragSelect"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases_edit/span_dragSelect', ['span_dragSelect_internalRoleButtonName': span_dragSelect_internalRoleButtonName_2]))

WebUI.takeScreenshot(reportLocation + '/TC310/Step 9-Click on span dragSelect DragSelect.png')

"Step 10: Click on button AddNewTestStep"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases_edit/button_AddNewTestStep'))

WebUI.takeScreenshot(reportLocation + '/TC310/Step 10-Click on button AddNewTestStep.png')

"Step 11: Click on div dynamicObject (ClickOnObject)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases_edit/div_dynamicObject'))

WebUI.takeScreenshot(reportLocation + '/TC310/Step 11-Click on div dynamicObject ClickOnObject.png')

"Step 12: Click on input objectInputs (ObjectInput)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases_edit/input_objectInputs"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases_edit/input_objectInputs', ['input_objectInputs_internalAttrPlaceholder': input_objectInputs_internalAttrPlaceholder]))

WebUI.takeScreenshot(reportLocation + '/TC310/Step 12-Click on input objectInputs ObjectInput.png')

"Step 13: Click on div UnknownContent"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases_edit/div_UnknownContent'))

WebUI.takeScreenshot(reportLocation + '/TC310/Step 13-Click on div UnknownContent.png')

"Step 14: Click on div CaptureNewObjectOption"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases_edit/div_CaptureNewObjectOption'))

WebUI.takeScreenshot(reportLocation + '/TC310/Step 14-Click on div CaptureNewObjectOption.png')

"Step 15: Click on button Save"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases_edit/button_Save'))

WebUI.takeScreenshot(reportLocation + '/TC310/Step 15-Click on button Save.png')

"Step 16: Click on div object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases_edit/div_object'))

WebUI.takeScreenshot(reportLocation + '/TC310/Step 16-Click on div object.png')

"Step 17: Click on button AddNewTestStep"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases_edit/button_AddNewTestStep'))

WebUI.takeScreenshot(reportLocation + '/TC310/Step 17-Click on button AddNewTestStep.png')

"Step 18: Enter input value in input objectInputs (SelectAction)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases_edit/input_objectInputs'), input_objectInputs)

WebUI.takeScreenshot(reportLocation + '/TC310/Step 18-Enter input value in input objectInputs SelectAction.png')

"Step 19: Click on div dynamicObject (object2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases_edit/div_dynamicObject'))

WebUI.takeScreenshot(reportLocation + '/TC310/Step 19-Click on div dynamicObject object2.png')

"Step 20: Click on input Value"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases_edit/input_Value'))

WebUI.takeScreenshot(reportLocation + '/TC310/Step 20-Click on input Value.png')

"Step 21: Click on input objectInputs (DropdownObject)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases_edit/input_objectInputs"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases_edit/input_objectInputs', ['input_objectInputs_internalAttrPlaceholder': input_objectInputs_internalAttrPlaceholder_1]))

WebUI.takeScreenshot(reportLocation + '/TC310/Step 21-Click on input objectInputs DropdownObject.png')

"Step 22: Click on div CaptureNewObjectOption"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases_edit/div_CaptureNewObjectOption'))

WebUI.takeScreenshot(reportLocation + '/TC310/Step 22-Click on div CaptureNewObjectOption.png')

"Step 23: Click on input Value"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases_edit/input_Value'))

WebUI.takeScreenshot(reportLocation + '/TC310/Step 23-Click on input Value.png')

"Step 24: Enter input value in input Value"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_team_project_test_design_test_cases_edit/input_Value'), input_Value)

WebUI.takeScreenshot(reportLocation + '/TC310/Step 24-Enter input value in input Value.png')

"Step 25: Click on button Save2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases_edit/button_Save2'))

WebUI.takeScreenshot(reportLocation + '/TC310/Step 25-Click on button Save2.png')

"Step 26: Click on input checkboxInputs (Checkbox)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases_edit/input_checkboxInputs'))

WebUI.takeScreenshot(reportLocation + '/TC310/Step 26-Click on input checkboxInputs Checkbox.png')

"Step 27: Click on input checkboxInputs (Checkbox2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases_edit/input_checkboxInputs"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases_edit/input_checkboxInputs', ['input_checkboxInputs_internalRoleButtonName': input_checkboxInputs_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC310/Step 27-Click on input checkboxInputs Checkbox2.png')

"Step 28: Click on input checkboxInputs (Checkbox3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases_edit/input_checkboxInputs"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases_edit/input_checkboxInputs', ['input_checkboxInputs_internalRoleButtonName': input_checkboxInputs_internalRoleButtonName_1]))

WebUI.takeScreenshot(reportLocation + '/TC310/Step 28-Click on input checkboxInputs Checkbox3.png')

"Step 29: Click on input checkboxInputs (Checkbox4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases_edit/input_checkboxInputs"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases_edit/input_checkboxInputs', ['input_checkboxInputs_internalRoleButtonName': input_checkboxInputs_internalRoleButtonName_2]))

WebUI.takeScreenshot(reportLocation + '/TC310/Step 29-Click on input checkboxInputs Checkbox4.png')

"Step 30: Click on input checkboxInputs (Checkbox5)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases_edit/input_checkboxInputs"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases_edit/input_checkboxInputs', ['input_checkboxInputs_internalRoleButtonName': input_checkboxInputs_internalRoleButtonName_3]))

WebUI.takeScreenshot(reportLocation + '/TC310/Step 30-Click on input checkboxInputs Checkbox5.png')

"Step 31: Click on input checkboxInputs (Checkbox6)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases_edit/input_checkboxInputs"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases_edit/input_checkboxInputs', ['input_checkboxInputs_internalRoleButtonName': input_checkboxInputs_internalRoleButtonName_4]))

WebUI.takeScreenshot(reportLocation + '/TC310/Step 31-Click on input checkboxInputs Checkbox6.png')

"Step 32: Click on input checkboxInputs (Checkbox7)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases_edit/input_checkboxInputs"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases_edit/input_checkboxInputs', ['input_checkboxInputs_internalRoleButtonName': input_checkboxInputs_internalRoleButtonName_5]))

WebUI.takeScreenshot(reportLocation + '/TC310/Step 32-Click on input checkboxInputs Checkbox7.png')

"Step 33: Click on input checkboxInputs (Checkbox8)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases_edit/input_checkboxInputs"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases_edit/input_checkboxInputs', ['input_checkboxInputs_internalRoleButtonName': input_checkboxInputs_internalRoleButtonName_6]))

WebUI.takeScreenshot(reportLocation + '/TC310/Step 33-Click on input checkboxInputs Checkbox8.png')

"Step 34: Click on input checkboxInputs (Checkbox9)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases_edit/input_checkboxInputs"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases_edit/input_checkboxInputs', ['input_checkboxInputs_internalRoleButtonName': input_checkboxInputs_internalRoleButtonName_7]))

WebUI.takeScreenshot(reportLocation + '/TC310/Step 34-Click on input checkboxInputs Checkbox9.png')

"Step 35: Click on span DeleteSelectedSteps"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases_edit/span_DeleteSelectedSteps'))

WebUI.takeScreenshot(reportLocation + '/TC310/Step 35-Click on span DeleteSelectedSteps.png')

"Step 36: Click on div object3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases_edit/div_object3'))

WebUI.takeScreenshot(reportLocation + '/TC310/Step 36-Click on div object3.png')

"Step 37: Click on button Playback"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases_edit/button_Playback'))

WebUI.takeScreenshot(reportLocation + '/TC310/Step 37-Click on button Playback.png')

"Step 38: Click on span dragSelect (DragSelect2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases_edit/span_dragSelect"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases_edit/span_dragSelect', ['span_dragSelect_internalRoleButtonName': span_dragSelect_internalRoleButtonName_3]))

WebUI.takeScreenshot(reportLocation + '/TC310/Step 38-Click on span dragSelect DragSelect2.png')

"Step 39: Click on span dragSelect (DragSelect2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases_edit/span_dragSelect"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases_edit/span_dragSelect', ['span_dragSelect_internalRoleButtonName': span_dragSelect_internalRoleButtonName_4]))

WebUI.takeScreenshot(reportLocation + '/TC310/Step 39-Click on span dragSelect DragSelect2.png')

"Step 40: Click on span dragSelect (DragSelect2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases_edit/span_dragSelect"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases_edit/span_dragSelect', ['span_dragSelect_internalRoleButtonName': span_dragSelect_internalRoleButtonName_5]))

WebUI.takeScreenshot(reportLocation + '/TC310/Step 40-Click on span dragSelect DragSelect2.png')

"Step 41: Click on span dragSelect (DragSelect2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases_edit/span_dragSelect"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases_edit/span_dragSelect', ['span_dragSelect_internalRoleButtonName': span_dragSelect_internalRoleButtonName_6]))

WebUI.takeScreenshot(reportLocation + '/TC310/Step 41-Click on span dragSelect DragSelect2.png')

"Step 42: Click on button Edit"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases_edit/button_Edit'))

WebUI.takeScreenshot(reportLocation + '/TC310/Step 42-Click on button Edit.png')

"Step 43: Click on input Value2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases_edit/input_Value2'))

WebUI.takeScreenshot(reportLocation + '/TC310/Step 43-Click on input Value2.png')

"Step 44: Click on input Value2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases_edit/input_Value2'))

WebUI.takeScreenshot(reportLocation + '/TC310/Step 44-Click on input Value2.png')

"Step 45: Enter input value in input Value2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_team_project_test_design_test_cases_edit/input_Value2'), input_Value2)

WebUI.takeScreenshot(reportLocation + '/TC310/Step 45-Enter input value in input Value2.png')

"Step 46: Click on button Save3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases_edit/button_Save3'))

WebUI.takeScreenshot(reportLocation + '/TC310/Step 46-Click on button Save3.png')

"Step 47: Click on button Playback -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases_edit/button_Playback'))

WebUI.takeScreenshot(reportLocation + '/TC310/Step 47-Click on button Playback - Navigate to page .png')

"Step 48: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC310-Record and Playback Test Steps_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}