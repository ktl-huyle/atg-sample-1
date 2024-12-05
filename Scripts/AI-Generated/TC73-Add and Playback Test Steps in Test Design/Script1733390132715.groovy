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

"Step 3: Navigate to organization/*/home"

TrueTestScripts.navigate("organization/${GlobalVariable.organization_id}/home")

"Step 4: Click on link forumAndProjectExecution (SampleTestCase) -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/link_forumAndProjectExecution"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/link_forumAndProjectExecution', ['link_forumAndProjectExecution_internalRoleLinkName': link_forumAndProjectExecution_internalRoleLinkName, 'executions_id': executions_id, 'team_id': team_id, 'project_id': project_id]))

WebUI.takeScreenshot(reportLocation + '/TC73/Step 4-Click on link forumAndProjectExecution SampleTestCase - Navigate to page teamprojectexecutions.png')

"Step 5: Click on button TestCase"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_TestCase'))

WebUI.takeScreenshot(reportLocation + '/TC73/Step 5-Click on button TestCase.png')

"Step 6: Click on button RecordTestSteps -> Navigate to page 'team/*/project/*/test-design/test-cases/*/edit'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_RecordTestSteps'))

WebUI.takeScreenshot(reportLocation + '/TC73/Step 6-Click on button RecordTestSteps - Navigate to page teamprojecttest-designtest-casesedit.png')

"Step 7: Click on span objectElements (object)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases_edit/span_objectElements"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases_edit/span_objectElements', ['span_objectElements_internalRoleButtonName': span_objectElements_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC73/Step 7-Click on span objectElements object.png')

"Step 8: Click on span objectElements (object)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases_edit/span_objectElements"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases_edit/span_objectElements', ['span_objectElements_internalRoleButtonName': span_objectElements_internalRoleButtonName_1]))

WebUI.takeScreenshot(reportLocation + '/TC73/Step 8-Click on span objectElements object.png')

"Step 9: Click on span objectElements (object)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases_edit/span_objectElements"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases_edit/span_objectElements', ['span_objectElements_internalRoleButtonName': span_objectElements_internalRoleButtonName_2]))

WebUI.takeScreenshot(reportLocation + '/TC73/Step 9-Click on span objectElements object.png')

"Step 10: Click on button AddNewTestStep"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases_edit/button_AddNewTestStep'))

WebUI.takeScreenshot(reportLocation + '/TC73/Step 10-Click on button AddNewTestStep.png')

"Step 11: Click on div objectElements (object)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases_edit/div_objectElements'))

WebUI.takeScreenshot(reportLocation + '/TC73/Step 11-Click on div objectElements object.png')

"Step 12: Click on input objectActions (Object)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases_edit/input_objectActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases_edit/input_objectActions', ['input_objectActions_internalAttrPlaceholder': input_objectActions_internalAttrPlaceholder]))

WebUI.takeScreenshot(reportLocation + '/TC73/Step 12-Click on input objectActions Object.png')

"Step 13: Click on div object2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases_edit/div_object2'))

WebUI.takeScreenshot(reportLocation + '/TC73/Step 13-Click on div object2.png')

"Step 14: Click on div object3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases_edit/div_object3'))

WebUI.takeScreenshot(reportLocation + '/TC73/Step 14-Click on div object3.png')

"Step 15: Click on button Save"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases_edit/button_Save'))

WebUI.takeScreenshot(reportLocation + '/TC73/Step 15-Click on button Save.png')

"Step 16: Click on div object4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases_edit/div_object4'))

WebUI.takeScreenshot(reportLocation + '/TC73/Step 16-Click on div object4.png')

"Step 17: Click on button AddNewTestStep"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases_edit/button_AddNewTestStep'))

WebUI.takeScreenshot(reportLocation + '/TC73/Step 17-Click on button AddNewTestStep.png')

"Step 18: Enter input value in input objectActions (SelectAction)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases_edit/input_objectActions'), input_objectActions)

WebUI.takeScreenshot(reportLocation + '/TC73/Step 18-Enter input value in input objectActions SelectAction.png')

"Step 19: Click on div objectElements (object5)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases_edit/div_objectElements'))

WebUI.takeScreenshot(reportLocation + '/TC73/Step 19-Click on div objectElements object5.png')

"Step 20: Click on input Value"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases_edit/input_Value'))

WebUI.takeScreenshot(reportLocation + '/TC73/Step 20-Click on input Value.png')

"Step 21: Click on input objectActions (DropdownObject)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases_edit/input_objectActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases_edit/input_objectActions', ['input_objectActions_internalAttrPlaceholder': input_objectActions_internalAttrPlaceholder_1]))

WebUI.takeScreenshot(reportLocation + '/TC73/Step 21-Click on input objectActions DropdownObject.png')

"Step 22: Click on div object3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases_edit/div_object3'))

WebUI.takeScreenshot(reportLocation + '/TC73/Step 22-Click on div object3.png')

"Step 23: Click on input Value"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases_edit/input_Value'))

WebUI.takeScreenshot(reportLocation + '/TC73/Step 23-Click on input Value.png')

"Step 24: Enter input value in input Value2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_team_project_test_design_test_cases_edit/input_Value'), input_Value2)

WebUI.takeScreenshot(reportLocation + '/TC73/Step 24-Enter input value in input Value2.png')

"Step 25: Click on button Save"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases_edit/button_Save'))

WebUI.takeScreenshot(reportLocation + '/TC73/Step 25-Click on button Save.png')

"Step 26: Click on input checkboxes (checkbox)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases_edit/input_checkboxes'))

WebUI.takeScreenshot(reportLocation + '/TC73/Step 26-Click on input checkboxes checkbox.png')

"Step 27: Click on input checkboxes (checkbox2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases_edit/input_checkboxes"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases_edit/input_checkboxes', ['input_checkboxes_internalRoleButtonName': input_checkboxes_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC73/Step 27-Click on input checkboxes checkbox2.png')

"Step 28: Click on input checkboxes (checkbox3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases_edit/input_checkboxes"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases_edit/input_checkboxes', ['input_checkboxes_internalRoleButtonName': input_checkboxes_internalRoleButtonName_1]))

WebUI.takeScreenshot(reportLocation + '/TC73/Step 28-Click on input checkboxes checkbox3.png')

"Step 29: Click on input checkboxes (checkbox4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases_edit/input_checkboxes"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases_edit/input_checkboxes', ['input_checkboxes_internalRoleButtonName': input_checkboxes_internalRoleButtonName_2]))

WebUI.takeScreenshot(reportLocation + '/TC73/Step 29-Click on input checkboxes checkbox4.png')

"Step 30: Click on input checkboxes (checkbox5)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases_edit/input_checkboxes"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases_edit/input_checkboxes', ['input_checkboxes_internalRoleButtonName': input_checkboxes_internalRoleButtonName_3]))

WebUI.takeScreenshot(reportLocation + '/TC73/Step 30-Click on input checkboxes checkbox5.png')

"Step 31: Click on input checkboxes (checkbox6)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases_edit/input_checkboxes"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases_edit/input_checkboxes', ['input_checkboxes_internalRoleButtonName': input_checkboxes_internalRoleButtonName_4]))

WebUI.takeScreenshot(reportLocation + '/TC73/Step 31-Click on input checkboxes checkbox6.png')

"Step 32: Click on input checkboxes (checkbox7)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases_edit/input_checkboxes"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases_edit/input_checkboxes', ['input_checkboxes_internalRoleButtonName': input_checkboxes_internalRoleButtonName_5]))

WebUI.takeScreenshot(reportLocation + '/TC73/Step 32-Click on input checkboxes checkbox7.png')

"Step 33: Click on input checkboxes (checkbox8)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases_edit/input_checkboxes"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases_edit/input_checkboxes', ['input_checkboxes_internalRoleButtonName': input_checkboxes_internalRoleButtonName_6]))

WebUI.takeScreenshot(reportLocation + '/TC73/Step 33-Click on input checkboxes checkbox8.png')

"Step 34: Click on input checkboxes (checkbox9)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases_edit/input_checkboxes"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases_edit/input_checkboxes', ['input_checkboxes_internalRoleButtonName': input_checkboxes_internalRoleButtonName_7]))

WebUI.takeScreenshot(reportLocation + '/TC73/Step 34-Click on input checkboxes checkbox9.png')

"Step 35: Click on span DeleteSelectedSteps"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases_edit/span_DeleteSelectedSteps'))

WebUI.takeScreenshot(reportLocation + '/TC73/Step 35-Click on span DeleteSelectedSteps.png')

"Step 36: Click on div object6"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases_edit/div_object6'))

WebUI.takeScreenshot(reportLocation + '/TC73/Step 36-Click on div object6.png')

"Step 37: Click on button Playback"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases_edit/button_Playback'))

WebUI.takeScreenshot(reportLocation + '/TC73/Step 37-Click on button Playback.png')

"Step 38: Click on span objectElements (object2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases_edit/span_objectElements"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases_edit/span_objectElements', ['span_objectElements_internalRoleButtonName': span_objectElements_internalRoleButtonName_3]))

WebUI.takeScreenshot(reportLocation + '/TC73/Step 38-Click on span objectElements object2.png')

"Step 39: Click on span objectElements (object2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases_edit/span_objectElements"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases_edit/span_objectElements', ['span_objectElements_internalRoleButtonName': span_objectElements_internalRoleButtonName_4]))

WebUI.takeScreenshot(reportLocation + '/TC73/Step 39-Click on span objectElements object2.png')

"Step 40: Click on span objectElements (object2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases_edit/span_objectElements"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases_edit/span_objectElements', ['span_objectElements_internalRoleButtonName': span_objectElements_internalRoleButtonName_5]))

WebUI.takeScreenshot(reportLocation + '/TC73/Step 40-Click on span objectElements object2.png')

"Step 41: Click on span objectElements (object2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases_edit/span_objectElements"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases_edit/span_objectElements', ['span_objectElements_internalRoleButtonName': span_objectElements_internalRoleButtonName_6]))

WebUI.takeScreenshot(reportLocation + '/TC73/Step 41-Click on span objectElements object2.png')

"Step 42: Click on button Edit"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases_edit/button_Edit'))

WebUI.takeScreenshot(reportLocation + '/TC73/Step 42-Click on button Edit.png')

"Step 43: Click on input Value3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases_edit/input_Value3'))

WebUI.takeScreenshot(reportLocation + '/TC73/Step 43-Click on input Value3.png')

"Step 44: Click on input Value3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases_edit/input_Value3'))

WebUI.takeScreenshot(reportLocation + '/TC73/Step 44-Click on input Value3.png')

"Step 45: Enter input value in input Value4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_team_project_test_design_test_cases_edit/input_Value3'), input_Value4)

WebUI.takeScreenshot(reportLocation + '/TC73/Step 45-Enter input value in input Value4.png')

"Step 46: Click on button Save"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases_edit/button_Save'))

WebUI.takeScreenshot(reportLocation + '/TC73/Step 46-Click on button Save.png')

"Step 47: Click on button Playback -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases_edit/button_Playback'))

WebUI.takeScreenshot(reportLocation + '/TC73/Step 47-Click on button Playback - Navigate to page .png')

"Step 48: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC73-Add and Playback Test Steps in Test Design_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}