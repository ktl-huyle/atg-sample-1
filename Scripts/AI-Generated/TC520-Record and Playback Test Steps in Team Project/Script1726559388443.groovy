import com.kms.katalon.core.configuration.RunConfiguration
import internal.GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import katalon.truetest.TrueTestScripts

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

"Step 4: Click on link dynamicObject (fpHvsamplesTestCase) -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/link_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/link_dynamicObject', ['link_dynamicObject_internalRoleLinkName': link_dynamicObject_internalRoleLinkName, 'link_dynamicObject_team_id': link_dynamicObject_team_id, 'link_dynamicObject_project_id': link_dynamicObject_project_id, 'link_dynamicObject_executions_id': link_dynamicObject_executions_id]))

WebUI.takeScreenshot(reportLocation + '/TC520/Step 4-Click on link dynamicObject fpHvsamplesTestCase - Navigate to page teamprojectexecutions.png')

"Step 5: Click on button testCase"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_testCase'))

WebUI.takeScreenshot(reportLocation + '/TC520/Step 5-Click on button testCase.png')

"Step 6: Click on button recordTestSteps -> Navigate to page 'team/*/project/*/test-design/test-cases/*/edit'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_recordTestSteps'))

WebUI.takeScreenshot(reportLocation + '/TC520/Step 6-Click on button recordTestSteps - Navigate to page teamprojecttest-designtest-casesedit.png')

"Step 7: Click on span dynamicObject (dragSelectEnterA)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases_edit/span_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases_edit/span_dynamicObject', ['span_dynamicObject_internalRoleButtonName': span_dynamicObject_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC520/Step 7-Click on span dynamicObject dragSelectEnterA.png')

"Step 8: Click on span dynamicObject (dragSelectEnterA)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases_edit/span_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases_edit/span_dynamicObject', ['span_dynamicObject_internalRoleButtonName': span_dynamicObject_internalRoleButtonName_1]))

WebUI.takeScreenshot(reportLocation + '/TC520/Step 8-Click on span dynamicObject dragSelectEnterA.png')

"Step 9: Click on span dynamicObject (dragSelectEnterA)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases_edit/span_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases_edit/span_dynamicObject', ['span_dynamicObject_internalRoleButtonName': span_dynamicObject_internalRoleButtonName_2]))

WebUI.takeScreenshot(reportLocation + '/TC520/Step 9-Click on span dynamicObject dragSelectEnterA.png')

"Step 10: Click on button addNewTestStep"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases_edit/button_addNewTestStep'))

WebUI.takeScreenshot(reportLocation + '/TC520/Step 10-Click on button addNewTestStep.png')

"Step 11: Click on div dynamicObject (clickOnObject)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases_edit/div_dynamicObject'))

WebUI.takeScreenshot(reportLocation + '/TC520/Step 11-Click on div dynamicObject clickOnObject.png')

"Step 12: Click on input dynamicObject (object)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases_edit/input_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases_edit/input_dynamicObject', ['input_dynamicObject_internalAttrPlaceholder': input_dynamicObject_internalAttrPlaceholder]))

WebUI.takeScreenshot(reportLocation + '/TC520/Step 12-Click on input dynamicObject object.png')

"Step 13: Click on div selectObject"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases_edit/div_selectObject'))

WebUI.takeScreenshot(reportLocation + '/TC520/Step 13-Click on div selectObject.png')

"Step 14: Click on div testStepCaptureNewObjectOption"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases_edit/div_testStepCaptureNewObjectOption'))

WebUI.takeScreenshot(reportLocation + '/TC520/Step 14-Click on div testStepCaptureNewObjectOption.png')

"Step 15: Click on button saveActionButton"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases_edit/button_saveActionButton'))

WebUI.takeScreenshot(reportLocation + '/TC520/Step 15-Click on button saveActionButton.png')

"Step 16: Click on div cssCa23fy"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases_edit/div_cssCa23fy'))

WebUI.takeScreenshot(reportLocation + '/TC520/Step 16-Click on div cssCa23fy.png')

"Step 17: Click on button addNewTestStep"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases_edit/button_addNewTestStep'))

WebUI.takeScreenshot(reportLocation + '/TC520/Step 17-Click on button addNewTestStep.png')

"Step 18: Enter input value in input testStepEditAutocompleteInput"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_team_project_test_design_test_cases_edit/input_testStepEditAutocompleteInput'), input_testStepEditAutocompleteInput)

WebUI.takeScreenshot(reportLocation + '/TC520/Step 18-Enter input value in input testStepEditAutocompleteInput.png')

"Step 19: Click on div dynamicObject (selectValueFromDropdown)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases_edit/div_dynamicObject'))

WebUI.takeScreenshot(reportLocation + '/TC520/Step 19-Click on div dynamicObject selectValueFromDropdown.png')

"Step 20: Click on input value"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases_edit/input_value'))

WebUI.takeScreenshot(reportLocation + '/TC520/Step 20-Click on input value.png')

"Step 21: Click on input dynamicObject (dropdown)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases_edit/input_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases_edit/input_dynamicObject', ['input_dynamicObject_internalAttrPlaceholder': input_dynamicObject_internalAttrPlaceholder_1]))

WebUI.takeScreenshot(reportLocation + '/TC520/Step 21-Click on input dynamicObject dropdown.png')

"Step 22: Click on div testStepCaptureNewObjectOption"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases_edit/div_testStepCaptureNewObjectOption'))

WebUI.takeScreenshot(reportLocation + '/TC520/Step 22-Click on div testStepCaptureNewObjectOption.png')

"Step 23: Click on input value"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases_edit/input_value'))

WebUI.takeScreenshot(reportLocation + '/TC520/Step 23-Click on input value.png')

"Step 24: Enter input value in input value"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_team_project_test_design_test_cases_edit/input_value'), input_value)

WebUI.takeScreenshot(reportLocation + '/TC520/Step 24-Enter input value in input value.png')

"Step 25: Click on button saveActionButton2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases_edit/button_saveActionButton2'))

WebUI.takeScreenshot(reportLocation + '/TC520/Step 25-Click on button saveActionButton2.png')

"Step 26: Click on input dragSelect (dragSelect)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases_edit/input_dragSelect'))

WebUI.takeScreenshot(reportLocation + '/TC520/Step 26-Click on input dragSelect dragSelect.png')

"Step 27: Click on input dragSelect (dragSelect2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases_edit/input_dragSelect"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases_edit/input_dragSelect', ['input_dragSelect_internalRoleButtonName': input_dragSelect_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC520/Step 27-Click on input dragSelect dragSelect2.png')

"Step 28: Click on input dragSelect (dragSelect3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases_edit/input_dragSelect"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases_edit/input_dragSelect', ['input_dragSelect_internalRoleButtonName': input_dragSelect_internalRoleButtonName_1]))

WebUI.takeScreenshot(reportLocation + '/TC520/Step 28-Click on input dragSelect dragSelect3.png')

"Step 29: Click on input dragSelect (dragSelect4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases_edit/input_dragSelect"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases_edit/input_dragSelect', ['input_dragSelect_internalRoleButtonName': input_dragSelect_internalRoleButtonName_2]))

WebUI.takeScreenshot(reportLocation + '/TC520/Step 29-Click on input dragSelect dragSelect4.png')

"Step 30: Click on input dragSelect (dragSelect5)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases_edit/input_dragSelect"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases_edit/input_dragSelect', ['input_dragSelect_internalRoleButtonName': input_dragSelect_internalRoleButtonName_3]))

WebUI.takeScreenshot(reportLocation + '/TC520/Step 30-Click on input dragSelect dragSelect5.png')

"Step 31: Click on input dragSelect (dragSelect6)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases_edit/input_dragSelect"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases_edit/input_dragSelect', ['input_dragSelect_internalRoleButtonName': input_dragSelect_internalRoleButtonName_4]))

WebUI.takeScreenshot(reportLocation + '/TC520/Step 31-Click on input dragSelect dragSelect6.png')

"Step 32: Click on input dragSelect (dragSelect7)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases_edit/input_dragSelect"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases_edit/input_dragSelect', ['input_dragSelect_internalRoleButtonName': input_dragSelect_internalRoleButtonName_5]))

WebUI.takeScreenshot(reportLocation + '/TC520/Step 32-Click on input dragSelect dragSelect7.png')

"Step 33: Click on input dragSelect (dragSelect8)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases_edit/input_dragSelect"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases_edit/input_dragSelect', ['input_dragSelect_internalRoleButtonName': input_dragSelect_internalRoleButtonName_6]))

WebUI.takeScreenshot(reportLocation + '/TC520/Step 33-Click on input dragSelect dragSelect8.png')

"Step 34: Click on input dragSelect (dragSelect9)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases_edit/input_dragSelect"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases_edit/input_dragSelect', ['input_dragSelect_internalRoleButtonName': input_dragSelect_internalRoleButtonName_7]))

WebUI.takeScreenshot(reportLocation + '/TC520/Step 34-Click on input dragSelect dragSelect9.png')

"Step 35: Click on span deleteAllSelectedSteps"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases_edit/span_deleteAllSelectedSteps'))

WebUI.takeScreenshot(reportLocation + '/TC520/Step 35-Click on span deleteAllSelectedSteps.png')

"Step 36: Click on div recordPlaybackOpenThe"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases_edit/div_recordPlaybackOpenThe'))

WebUI.takeScreenshot(reportLocation + '/TC520/Step 36-Click on div recordPlaybackOpenThe.png')

"Step 37: Click on button playbackWithBrowserExtension"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases_edit/button_playbackWithBrowserExtension'))

WebUI.takeScreenshot(reportLocation + '/TC520/Step 37-Click on button playbackWithBrowserExtension.png')

"Step 38: Click on span dynamicObject (dragSelectSelectPrice)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases_edit/span_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases_edit/span_dynamicObject', ['span_dynamicObject_internalRoleButtonName': span_dynamicObject_internalRoleButtonName_3]))

WebUI.takeScreenshot(reportLocation + '/TC520/Step 38-Click on span dynamicObject dragSelectSelectPrice.png')

"Step 39: Click on span dynamicObject (dragSelectSelectPrice)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases_edit/span_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases_edit/span_dynamicObject', ['span_dynamicObject_internalRoleButtonName': span_dynamicObject_internalRoleButtonName_4]))

WebUI.takeScreenshot(reportLocation + '/TC520/Step 39-Click on span dynamicObject dragSelectSelectPrice.png')

"Step 40: Click on span dynamicObject (dragSelectSelectPrice)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases_edit/span_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases_edit/span_dynamicObject', ['span_dynamicObject_internalRoleButtonName': span_dynamicObject_internalRoleButtonName_5]))

WebUI.takeScreenshot(reportLocation + '/TC520/Step 40-Click on span dynamicObject dragSelectSelectPrice.png')

"Step 41: Click on span dynamicObject (dragSelectSelectPrice)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases_edit/span_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases_edit/span_dynamicObject', ['span_dynamicObject_internalRoleButtonName': span_dynamicObject_internalRoleButtonName_6]))

WebUI.takeScreenshot(reportLocation + '/TC520/Step 41-Click on span dynamicObject dragSelectSelectPrice.png')

"Step 42: Click on button testStepEditButton"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases_edit/button_testStepEditButton'))

WebUI.takeScreenshot(reportLocation + '/TC520/Step 42-Click on button testStepEditButton.png')

"Step 43: Click on input value2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases_edit/input_value2'))

WebUI.takeScreenshot(reportLocation + '/TC520/Step 43-Click on input value2.png')

"Step 44: Click on input value2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases_edit/input_value2'))

WebUI.takeScreenshot(reportLocation + '/TC520/Step 44-Click on input value2.png')

"Step 45: Enter input value in input value2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_team_project_test_design_test_cases_edit/input_value2'), input_value2)

WebUI.takeScreenshot(reportLocation + '/TC520/Step 45-Enter input value in input value2.png')

"Step 46: Click on button saveActionButton3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases_edit/button_saveActionButton3'))

WebUI.takeScreenshot(reportLocation + '/TC520/Step 46-Click on button saveActionButton3.png')

"Step 47: Click on button playbackWithBrowserExtension -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases_edit/button_playbackWithBrowserExtension'))

WebUI.takeScreenshot(reportLocation + '/TC520/Step 47-Click on button playbackWithBrowserExtension - Navigate to page .png')

"Step 48: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC520-Record and Playback Test Steps in Team Project_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}