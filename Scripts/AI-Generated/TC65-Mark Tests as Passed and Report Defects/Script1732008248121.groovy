import internal.GlobalVariable
import truetest.custom.TrueTestScripts
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.configuration.RunConfiguration
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

TrueTestScripts.navigate("team/*/project/*/executions/*")

"Step 4: Click on div RightSidebar3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_RightSidebar3'))

WebUI.takeScreenshot(reportLocation + '/TC65/Step 4-Click on div RightSidebar3.png')

"Step 5: Click on div reportDefect (ReportDefectMarkAs)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/div_reportDefect'))

WebUI.takeScreenshot(reportLocation + '/TC65/Step 5-Click on div reportDefect ReportDefectMarkAs.png')

"Step 6: Click on button MarkAsPassed"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_MarkAsPassed'))

WebUI.takeScreenshot(reportLocation + '/TC65/Step 6-Click on button MarkAsPassed.png')

"Step 7: Click on label FunctionsUpdate"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/label_FunctionsUpdate'))

WebUI.takeScreenshot(reportLocation + '/TC65/Step 7-Click on label FunctionsUpdate.png')

"Step 8: Click on button Submit"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_Submit'))

WebUI.takeScreenshot(reportLocation + '/TC65/Step 8-Click on button Submit.png')

"Step 9: Click on span FailedTest"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/span_FailedTest'))

WebUI.takeScreenshot(reportLocation + '/TC65/Step 9-Click on span FailedTest.png')

"Step 10: Click on span FailedTest"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/span_FailedTest'))

WebUI.takeScreenshot(reportLocation + '/TC65/Step 10-Click on span FailedTest.png')

"Step 11: Click on span failedTests (FailedTest2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/span_failedTests"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/span_failedTests', ['span_failedTests_class': span_failedTests_class, 'span_failedTests_internalRoleButtonName': span_failedTests_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC65/Step 11-Click on span failedTests FailedTest2.png')

"Step 12: Click on button MarkAsPassed"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_MarkAsPassed'))

WebUI.takeScreenshot(reportLocation + '/TC65/Step 12-Click on button MarkAsPassed.png')

"Step 13: Click on label FunctionsUpdate"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/label_FunctionsUpdate'))

WebUI.takeScreenshot(reportLocation + '/TC65/Step 13-Click on label FunctionsUpdate.png')

"Step 14: Click on label ChangeTestResult"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/label_ChangeTestResult'))

WebUI.takeScreenshot(reportLocation + '/TC65/Step 14-Click on label ChangeTestResult.png')

"Step 15: Click on button Submit"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_Submit'))

WebUI.takeScreenshot(reportLocation + '/TC65/Step 15-Click on button Submit.png')

"Step 16: Click on span failedTests (FailedTest3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/span_failedTests"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/span_failedTests', ['span_failedTests_class': span_failedTests_class_1, 'span_failedTests_internalRoleButtonName': span_failedTests_internalRoleButtonName_1]))

WebUI.takeScreenshot(reportLocation + '/TC65/Step 16-Click on span failedTests FailedTest3.png')

"Step 17: Click on button MarkAsPassed"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_MarkAsPassed'))

WebUI.takeScreenshot(reportLocation + '/TC65/Step 17-Click on button MarkAsPassed.png')

"Step 18: Click on label ChangeTestResult"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/label_ChangeTestResult'))

WebUI.takeScreenshot(reportLocation + '/TC65/Step 18-Click on label ChangeTestResult.png')

"Step 19: Click on button Submit"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_Submit'))

WebUI.takeScreenshot(reportLocation + '/TC65/Step 19-Click on button Submit.png')

"Step 20: Click on div failedTests (FailedTest2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/div_failedTests"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/div_failedTests', ['div_failedTests_class': div_failedTests_class, 'div_failedTests_internalRoleButtonName': div_failedTests_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC65/Step 20-Click on div failedTests FailedTest2.png')

"Step 21: Click on button ReportDefect"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_ReportDefect'))

WebUI.takeScreenshot(reportLocation + '/TC65/Step 21-Click on button ReportDefect.png')

"Step 22: Click on div IssuePicker"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_IssuePicker'))

WebUI.takeScreenshot(reportLocation + '/TC65/Step 22-Click on div IssuePicker.png')

"Step 23: Enter input value in input Combobox"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_team_project_executions/input_Combobox'), input_Combobox)

WebUI.takeScreenshot(reportLocation + '/TC65/Step 23-Enter input value in input Combobox.png')

"Step 24: Click on p AutoTestInfo"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/p_AutoTestInfo'))

WebUI.takeScreenshot(reportLocation + '/TC65/Step 24-Click on p AutoTestInfo.png')

"Step 25: Click on button LinkDefect"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_LinkDefect'))

WebUI.takeScreenshot(reportLocation + '/TC65/Step 25-Click on button LinkDefect.png')

"Step 26: Click on button MarkAsPassed"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_MarkAsPassed'))

WebUI.takeScreenshot(reportLocation + '/TC65/Step 26-Click on button MarkAsPassed.png')

"Step 27: Click on label FunctionsUpdate"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/label_FunctionsUpdate'))

WebUI.takeScreenshot(reportLocation + '/TC65/Step 27-Click on label FunctionsUpdate.png')

"Step 28: Click on button Submit"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_Submit'))

WebUI.takeScreenshot(reportLocation + '/TC65/Step 28-Click on button Submit.png')

"Step 29: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC65-Mark Tests as Passed and Report Defects_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}