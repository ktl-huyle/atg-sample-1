import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
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

"Step 3: Navigate to team/*/project/*/executions/*"

TrueTestScripts.navigate("team/*/project/*/executions/*")

"Step 4: Click on div NeedReview"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_NeedReview'))

WebUI.takeScreenshot(reportLocation + '/TC102/Step 4-Click on div NeedReview.png')

"Step 5: Click on pre failedTestCases (FailedC2772372)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/pre_failedTestCases"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/pre_failedTestCases', ['pre_failedTestCases_class': pre_failedTestCases_class, 'pre_failedTestCases_internalRoleButtonName': pre_failedTestCases_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC102/Step 5-Click on pre failedTestCases FailedC2772372.png')

"Step 6: Click on div CustomFields"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_CustomFields'))

WebUI.takeScreenshot(reportLocation + '/TC102/Step 6-Click on div CustomFields.png')

"Step 7: Click on link AddNew"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_AddNew'))

WebUI.takeScreenshot(reportLocation + '/TC102/Step 7-Click on link AddNew.png')

"Step 8: Click on input DisplayName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/input_DisplayName'))

WebUI.takeScreenshot(reportLocation + '/TC102/Step 8-Click on input DisplayName.png')

"Step 9: Click on button Close5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_Close5'))

WebUI.takeScreenshot(reportLocation + '/TC102/Step 9-Click on button Close5.png')

"Step 10: Click on button Open"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_Open'))

WebUI.takeScreenshot(reportLocation + '/TC102/Step 10-Click on button Open.png')

"Step 11: Click on link AddNew"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_AddNew'))

WebUI.takeScreenshot(reportLocation + '/TC102/Step 11-Click on link AddNew.png')

"Step 12: Click on input DisplayName2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/input_DisplayName2'))

WebUI.takeScreenshot(reportLocation + '/TC102/Step 12-Click on input DisplayName2.png')

"Step 13: Click on div failedTestDetails (FailedC2772372)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/div_failedTestDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/div_failedTestDetails', ['div_failedTestDetails_class': div_failedTestDetails_class, 'div_failedTestDetails_internalRoleButtonName': div_failedTestDetails_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC102/Step 13-Click on div failedTestDetails FailedC2772372.png')

"Step 14: Click on button Open2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_Open2'))

WebUI.takeScreenshot(reportLocation + '/TC102/Step 14-Click on button Open2.png')

"Step 15: Click on span errorDetails (CheckPassTeam)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/span_errorDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/span_errorDetails', ['span_errorDetails_option': span_errorDetails_option, 'span_errorDetails_mui': span_errorDetails_mui, 'span_errorDetails_internalText': span_errorDetails_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC102/Step 15-Click on span errorDetails CheckPassTeam.png')

"Step 16: Click on div FormControl"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_FormControl'))

WebUI.takeScreenshot(reportLocation + '/TC102/Step 16-Click on div FormControl.png')

"Step 17: Click on button Open3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_Open3'))

WebUI.takeScreenshot(reportLocation + '/TC102/Step 17-Click on button Open3.png')

"Step 18: Click on list ProjectTeam"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/list_ProjectTeam'))

WebUI.takeScreenshot(reportLocation + '/TC102/Step 18-Click on list ProjectTeam.png')

"Step 19: Click on item TATeam"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/item_TATeam'))

WebUI.takeScreenshot(reportLocation + '/TC102/Step 19-Click on item TATeam.png')

"Step 20: Click on button Add"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_Add'))

WebUI.takeScreenshot(reportLocation + '/TC102/Step 20-Click on button Add.png')

"Step 21: Click on link AddNew"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_AddNew'))

WebUI.takeScreenshot(reportLocation + '/TC102/Step 21-Click on link AddNew.png')

"Step 22: Click on input DisplayName3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/input_DisplayName3'))

WebUI.takeScreenshot(reportLocation + '/TC102/Step 22-Click on input DisplayName3.png')

"Step 23: Click on span errorDetails (ErrorType)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/span_errorDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/span_errorDetails', ['span_errorDetails_option': span_errorDetails_option_1, 'span_errorDetails_mui': span_errorDetails_mui_1, 'span_errorDetails_internalText': span_errorDetails_internalText_1]))

WebUI.takeScreenshot(reportLocation + '/TC102/Step 23-Click on span errorDetails ErrorType.png')

"Step 24: Click on div FormControl"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_FormControl'))

WebUI.takeScreenshot(reportLocation + '/TC102/Step 24-Click on div FormControl.png')

"Step 25: Click on div FormControl2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_FormControl2'))

WebUI.takeScreenshot(reportLocation + '/TC102/Step 25-Click on div FormControl2.png')

"Step 26: Click on button Open3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_Open3'))

WebUI.takeScreenshot(reportLocation + '/TC102/Step 26-Click on button Open3.png')

"Step 27: Click on div ThumbnailImage2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_ThumbnailImage2'))

WebUI.takeScreenshot(reportLocation + '/TC102/Step 27-Click on div ThumbnailImage2.png')

"Step 28: Click on button Close"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_Close'))

WebUI.takeScreenshot(reportLocation + '/TC102/Step 28-Click on button Close.png')

"Step 29: Click on input Value"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/input_Value'))

WebUI.takeScreenshot(reportLocation + '/TC102/Step 29-Click on input Value.png')

"Step 30: Click on span errorDetails (ObiectError)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/span_errorDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/span_errorDetails', ['span_errorDetails_option': span_errorDetails_option_2, 'span_errorDetails_mui': span_errorDetails_mui_2, 'span_errorDetails_internalText': span_errorDetails_internalText_2]))

WebUI.takeScreenshot(reportLocation + '/TC102/Step 30-Click on span errorDetails ObiectError.png')

"Step 31: Click on button Add2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_Add2'))

WebUI.takeScreenshot(reportLocation + '/TC102/Step 31-Click on button Add2.png')

"Step 32: Click on button MarkAsPassed"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_MarkAsPassed'))

WebUI.takeScreenshot(reportLocation + '/TC102/Step 32-Click on button MarkAsPassed.png')

"Step 33: Click on label ChangeTestResult2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/label_ChangeTestResult2'))

WebUI.takeScreenshot(reportLocation + '/TC102/Step 33-Click on label ChangeTestResult2.png')

"Step 34: Click on button Submit2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_Submit2'))

WebUI.takeScreenshot(reportLocation + '/TC102/Step 34-Click on button Submit2.png')

"Step 35: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC102-Manage Test Cases and Mark as Passed in Team Project Executions_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}