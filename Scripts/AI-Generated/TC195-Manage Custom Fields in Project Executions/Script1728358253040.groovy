import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import internal.GlobalVariable
import truetest.common.navigateThumbnailImagesAndCloseErrors
import com.kms.katalon.core.configuration.RunConfiguration
import truetest.custom.TrueTestScripts
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

"Step 3: Navigate to team/*/project/*/executions/*"

TrueTestScripts.navigate("team/${GlobalVariable.team_id}/project/${GlobalVariable.project_id}/executions/${GlobalVariable.executions_id}")

"Step 4: Click on div ReviewSortInfo"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_ReviewSortInfo'))

WebUI.takeScreenshot(reportLocation + '/TC195/Step 4-Click on div ReviewSortInfo.png')

"Step 5: Click on pre failedTests (FailedC2772372)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/pre_failedTests"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/pre_failedTests', ['pre_failedTests_class': pre_failedTests_class, 'pre_failedTests_internalRoleButtonName': pre_failedTests_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC195/Step 5-Click on pre failedTests FailedC2772372.png')

"Step 6: Click on div CustomFields"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_CustomFields'))

WebUI.takeScreenshot(reportLocation + '/TC195/Step 6-Click on div CustomFields.png')

"Step 7: Click on link AddNew"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_AddNew'))

WebUI.takeScreenshot(reportLocation + '/TC195/Step 7-Click on link AddNew.png')

"Step 8: Click on input DisplayName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/input_DisplayName'))

WebUI.takeScreenshot(reportLocation + '/TC195/Step 8-Click on input DisplayName.png')

"Step 9: Click on button Close3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_Close3'))

WebUI.takeScreenshot(reportLocation + '/TC195/Step 9-Click on button Close3.png')

"Step 10: Click on button Open"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_Open'))

WebUI.takeScreenshot(reportLocation + '/TC195/Step 10-Click on button Open.png')

"Step 11: Click on link AddNew"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_AddNew'))

WebUI.takeScreenshot(reportLocation + '/TC195/Step 11-Click on link AddNew.png')

"Step 12: Click on input DisplayName2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/input_DisplayName2'))

WebUI.takeScreenshot(reportLocation + '/TC195/Step 12-Click on input DisplayName2.png')

"Step 13: Click on div failedTests (FailedC2772372)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/div_failedTests"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/div_failedTests', ['div_failedTests_class': div_failedTests_class, 'div_failedTests_internalRoleButtonName': div_failedTests_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC195/Step 13-Click on div failedTests FailedC2772372.png')

"Step 14: Click on button Open2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_Open2'))

WebUI.takeScreenshot(reportLocation + '/TC195/Step 14-Click on button Open2.png')

"Step 15: Click on span errorTypes (CheckPassTeam)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/span_errorTypes"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/span_errorTypes', ['span_errorTypes_mui': span_errorTypes_mui, 'span_errorTypes_option': span_errorTypes_option, 'span_errorTypes_internalText': span_errorTypes_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC195/Step 15-Click on span errorTypes CheckPassTeam.png')

"Step 16: Click on div InputContainer"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_InputContainer'))

WebUI.takeScreenshot(reportLocation + '/TC195/Step 16-Click on div InputContainer.png')

"Step 17: Click on button Open3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_Open3'))

WebUI.takeScreenshot(reportLocation + '/TC195/Step 17-Click on button Open3.png')

"Step 18: Click on list ProjectTeam"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/list_ProjectTeam'))

WebUI.takeScreenshot(reportLocation + '/TC195/Step 18-Click on list ProjectTeam.png')

"Step 19: Click on item TATeam"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/item_TATeam'))

WebUI.takeScreenshot(reportLocation + '/TC195/Step 19-Click on item TATeam.png')

"Step 20: Click on button Add"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_Add'))

WebUI.takeScreenshot(reportLocation + '/TC195/Step 20-Click on button Add.png')

"Step 21: Click on link AddNew"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_AddNew'))

WebUI.takeScreenshot(reportLocation + '/TC195/Step 21-Click on link AddNew.png')

"Step 22: Click on input DisplayName3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/input_DisplayName3'))

WebUI.takeScreenshot(reportLocation + '/TC195/Step 22-Click on input DisplayName3.png')

"Step 23: Click on span errorTypes (ErrorType)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/span_errorTypes"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/span_errorTypes', ['span_errorTypes_mui': span_errorTypes_mui_1, 'span_errorTypes_option': span_errorTypes_option_1, 'span_errorTypes_internalText': span_errorTypes_internalText_1]))

WebUI.takeScreenshot(reportLocation + '/TC195/Step 23-Click on span errorTypes ErrorType.png')

"Step 24: Click on div InputContainer"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_InputContainer'))

WebUI.takeScreenshot(reportLocation + '/TC195/Step 24-Click on div InputContainer.png')

"Step 25: Click on div InputContainer2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_InputContainer2'))

WebUI.takeScreenshot(reportLocation + '/TC195/Step 25-Click on div InputContainer2.png')

"Step 26: Click on button Open3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_Open3'))

WebUI.takeScreenshot(reportLocation + '/TC195/Step 26-Click on button Open3.png')

"Step 27: Click on div ThumbnailImage"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_ThumbnailImage_1'))

WebUI.takeScreenshot(reportLocation + '/TC195/Step 27-Click on div ThumbnailImage.png')

"Step 28: Click on button Close"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_Close'))

WebUI.takeScreenshot(reportLocation + '/TC195/Step 28-Click on button Close.png')

"Step 29: Click on input Value"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/input_Value'))

WebUI.takeScreenshot(reportLocation + '/TC195/Step 29-Click on input Value.png')

"Step 30: Click on span errorTypes (ObiectError)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/span_errorTypes"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/span_errorTypes', ['span_errorTypes_mui': span_errorTypes_mui_2, 'span_errorTypes_option': span_errorTypes_option_2, 'span_errorTypes_internalText': span_errorTypes_internalText_2]))

WebUI.takeScreenshot(reportLocation + '/TC195/Step 30-Click on span errorTypes ObiectError.png')

"Step 31: Click on button Add2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_Add2'))

WebUI.takeScreenshot(reportLocation + '/TC195/Step 31-Click on button Add2.png')

"Step 32: Interact with thumbnail images and handle error messages"

navigateThumbnailImagesAndCloseErrors.execute(data_path_0, Integer.valueOf(index_0))

"Step 33: Click on label FunctionsUpdates"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/label_FunctionsUpdates'))

WebUI.takeScreenshot(reportLocation + '/TC195/Step 33-Click on label FunctionsUpdates.png')

"Step 34: Click on button Submit"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_Submit'))

WebUI.takeScreenshot(reportLocation + '/TC195/Step 34-Click on button Submit.png')

"Step 35: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC195-Manage Custom Fields in Project Executions_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}