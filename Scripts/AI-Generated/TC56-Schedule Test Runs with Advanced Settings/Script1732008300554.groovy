import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import truetest.custom.TrueTestScripts
import com.kms.katalon.core.configuration.RunConfiguration
import truetest.common.scheduleTestRunForProject
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
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

TrueTestScripts.navigate("organization/*/home")

"Step 4: Access project settings and schedule a test run."

scheduleTestRunForProject.execute(data_path_0, Integer.valueOf(index_0))

"Step 5: Click on input Name3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_Name3'))

WebUI.takeScreenshot(reportLocation + '/TC56/Step 5-Click on input Name3.png')

"Step 6: Click on div Name2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_Name2'))

WebUI.takeScreenshot(reportLocation + '/TC56/Step 6-Click on div Name2.png')

"Step 7: Enter input value in input Name3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_team_project/input_Name3'), input_Name3)

WebUI.takeScreenshot(reportLocation + '/TC56/Step 7-Enter input value in input Name3.png')

"Step 8: Click on div ReactSelectIndicator"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_ReactSelectIndicator'))

WebUI.takeScreenshot(reportLocation + '/TC56/Step 8-Click on div ReactSelectIndicator.png')

"Step 9: Click on div ReactSelectIndicator"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_ReactSelectIndicator'))

WebUI.takeScreenshot(reportLocation + '/TC56/Step 9-Click on div ReactSelectIndicator.png')

"Step 10: Click on div TestSuiteIcon"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_TestSuiteIcon'))

WebUI.takeScreenshot(reportLocation + '/TC56/Step 10-Click on div TestSuiteIcon.png')

"Step 11: Click on div TestSuites"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_TestSuites'))

WebUI.takeScreenshot(reportLocation + '/TC56/Step 11-Click on div TestSuites.png')

"Step 12: Click on div ReactSelectControlIndicator"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_ReactSelectControlIndicator'))

WebUI.takeScreenshot(reportLocation + '/TC56/Step 12-Click on div ReactSelectControlIndicator.png')

"Step 13: Click on item MoreOptions"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/item_MoreOptions'))

WebUI.takeScreenshot(reportLocation + '/TC56/Step 13-Click on item MoreOptions.png')

"Step 14: Click on input RadioButtonA2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_RadioButtonA2'))

WebUI.takeScreenshot(reportLocation + '/TC56/Step 14-Click on input RadioButtonA2.png')

"Step 15: Click on div ReactSelectValueContainer"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_ReactSelectValueContainer'))

WebUI.takeScreenshot(reportLocation + '/TC56/Step 15-Click on div ReactSelectValueContainer.png')

"Step 16: Click on div Indicator"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_Indicator'))

WebUI.takeScreenshot(reportLocation + '/TC56/Step 16-Click on div Indicator.png')

"Step 17: Click on div Indicator"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_Indicator'))

WebUI.takeScreenshot(reportLocation + '/TC56/Step 17-Click on div Indicator.png')

"Step 18: Click on div Indicator"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_Indicator'))

WebUI.takeScreenshot(reportLocation + '/TC56/Step 18-Click on div Indicator.png')

"Step 19: Click on div ConfigureTestEnvironment3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_ConfigureTestEnvironment3'))

WebUI.takeScreenshot(reportLocation + '/TC56/Step 19-Click on div ConfigureTestEnvironment3.png')

"Step 20: Click on div Indicator"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_Indicator'))

WebUI.takeScreenshot(reportLocation + '/TC56/Step 20-Click on div Indicator.png')

"Step 21: Click on div Indicator"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_Indicator'))

WebUI.takeScreenshot(reportLocation + '/TC56/Step 21-Click on div Indicator.png')

"Step 22: Click on div SketchToolInfo"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_SketchToolInfo'))

WebUI.takeScreenshot(reportLocation + '/TC56/Step 22-Click on div SketchToolInfo.png')

"Step 23: Click on button Save2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Save2'))

WebUI.takeScreenshot(reportLocation + '/TC56/Step 23-Click on button Save2.png')

"Step 24: Click on div ExecutionProfileIcon"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_ExecutionProfileIcon'))

WebUI.takeScreenshot(reportLocation + '/TC56/Step 24-Click on div ExecutionProfileIcon.png')

"Step 25: Click on div ExecutionProfileIcon"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_ExecutionProfileIcon'))

WebUI.takeScreenshot(reportLocation + '/TC56/Step 25-Click on div ExecutionProfileIcon.png')

"Step 26: Click on div ExecutionProfileDetail"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_ExecutionProfileDetail'))

WebUI.takeScreenshot(reportLocation + '/TC56/Step 26-Click on div ExecutionProfileDetail.png')

"Step 27: Click on div EnvironmentSelectFocus"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_EnvironmentSelectFocus'))

WebUI.takeScreenshot(reportLocation + '/TC56/Step 27-Click on div EnvironmentSelectFocus.png')

"Step 28: Click on div ReactSelectValueContainer2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_ReactSelectValueContainer2'))

WebUI.takeScreenshot(reportLocation + '/TC56/Step 28-Click on div ReactSelectValueContainer2.png')

"Step 29: Click on div TestCloudCreated2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_TestCloudCreated2'))

WebUI.takeScreenshot(reportLocation + '/TC56/Step 29-Click on div TestCloudCreated2.png')

"Step 30: Click on div TestCloudCreated2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_TestCloudCreated2'))

WebUI.takeScreenshot(reportLocation + '/TC56/Step 30-Click on div TestCloudCreated2.png')

"Step 31: Click on div WindowsChrome"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_WindowsChrome'))

WebUI.takeScreenshot(reportLocation + '/TC56/Step 31-Click on div WindowsChrome.png')

"Step 32: Click on div WindowsChrome"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_WindowsChrome'))

WebUI.takeScreenshot(reportLocation + '/TC56/Step 32-Click on div WindowsChrome.png')

"Step 33: Click on item MoreOptions"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/item_MoreOptions'))

WebUI.takeScreenshot(reportLocation + '/TC56/Step 33-Click on item MoreOptions.png')

"Step 34: Click on div BrowserTypeIndicator"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_BrowserTypeIndicator'))

WebUI.takeScreenshot(reportLocation + '/TC56/Step 34-Click on div BrowserTypeIndicator.png')

"Step 35: Click on div BrowserTypeIndicator"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_BrowserTypeIndicator'))

WebUI.takeScreenshot(reportLocation + '/TC56/Step 35-Click on div BrowserTypeIndicator.png')

"Step 36: Click on div ReactSelectIndicator2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_ReactSelectIndicator2'))

WebUI.takeScreenshot(reportLocation + '/TC56/Step 36-Click on div ReactSelectIndicator2.png')

"Step 37: Click on div ReactSelectMultiValue"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_ReactSelectMultiValue'))

WebUI.takeScreenshot(reportLocation + '/TC56/Step 37-Click on div ReactSelectMultiValue.png')

"Step 38: Click on div Indicator"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_Indicator'))

WebUI.takeScreenshot(reportLocation + '/TC56/Step 38-Click on div Indicator.png')

"Step 39: Click on div Indicator"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_Indicator'))

WebUI.takeScreenshot(reportLocation + '/TC56/Step 39-Click on div Indicator.png')

"Step 40: Click on div ReactSelectOption"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_ReactSelectOption'))

WebUI.takeScreenshot(reportLocation + '/TC56/Step 40-Click on div ReactSelectOption.png')

"Step 41: Click on div ReactSelectIndicator2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_ReactSelectIndicator2'))

WebUI.takeScreenshot(reportLocation + '/TC56/Step 41-Click on div ReactSelectIndicator2.png')

"Step 42: Click on div ReactSelectIndicator2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_ReactSelectIndicator2'))

WebUI.takeScreenshot(reportLocation + '/TC56/Step 42-Click on div ReactSelectIndicator2.png')

"Step 43: Click on button ExpandMore"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_ExpandMore'))

WebUI.takeScreenshot(reportLocation + '/TC56/Step 43-Click on button ExpandMore.png')

"Step 44: Click on input RadioButtons"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_RadioButtons'))

WebUI.takeScreenshot(reportLocation + '/TC56/Step 44-Click on input RadioButtons.png')

"Step 45: Click on label DesktopBrowsers"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/label_DesktopBrowsers'))

WebUI.takeScreenshot(reportLocation + '/TC56/Step 45-Click on label DesktopBrowsers.png')

"Step 46: Click on div ActiveTunnels"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_ActiveTunnels'))

WebUI.takeScreenshot(reportLocation + '/TC56/Step 46-Click on div ActiveTunnels.png')

"Step 47: Click on div ActiveTunnels"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_ActiveTunnels'))

WebUI.takeScreenshot(reportLocation + '/TC56/Step 47-Click on div ActiveTunnels.png')

"Step 48: Click on label DesktopBrowsers"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/label_DesktopBrowsers'))

WebUI.takeScreenshot(reportLocation + '/TC56/Step 48-Click on label DesktopBrowsers.png')

"Step 49: Click on label DesktopBrowsers"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/label_DesktopBrowsers'))

WebUI.takeScreenshot(reportLocation + '/TC56/Step 49-Click on label DesktopBrowsers.png')

"Step 50: Click on div ActiveTunnelsIndicator"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_ActiveTunnelsIndicator'))

WebUI.takeScreenshot(reportLocation + '/TC56/Step 50-Click on div ActiveTunnelsIndicator.png')

"Step 51: Click on div ActiveTunnelsIndicator"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_ActiveTunnelsIndicator'))

WebUI.takeScreenshot(reportLocation + '/TC56/Step 51-Click on div ActiveTunnelsIndicator.png')

"Step 52: Click on div DesktopBrowsersLabel"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_DesktopBrowsersLabel'))

WebUI.takeScreenshot(reportLocation + '/TC56/Step 52-Click on div DesktopBrowsersLabel.png')

"Step 53: Click on button ExpandMore2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_ExpandMore2'))

WebUI.takeScreenshot(reportLocation + '/TC56/Step 53-Click on button ExpandMore2.png')

"Step 54: Click on div SketchToolInfo2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_SketchToolInfo2'))

WebUI.takeScreenshot(reportLocation + '/TC56/Step 54-Click on div SketchToolInfo2.png')

"Step 55: Click on button Save2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Save2'))

WebUI.takeScreenshot(reportLocation + '/TC56/Step 55-Click on button Save2.png')

"Step 56: Click on div TestSuiteIcon"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_TestSuiteIcon'))

WebUI.takeScreenshot(reportLocation + '/TC56/Step 56-Click on div TestSuiteIcon.png')

"Step 57: Click on div TestSuiteIcon"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_TestSuiteIcon'))

WebUI.takeScreenshot(reportLocation + '/TC56/Step 57-Click on div TestSuiteIcon.png')

"Step 58: Click on div ReactSelectValueContainer2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_ReactSelectValueContainer2'))

WebUI.takeScreenshot(reportLocation + '/TC56/Step 58-Click on div ReactSelectValueContainer2.png')

"Step 59: Click on div ReactSelectValueContainer2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_ReactSelectValueContainer2'))

WebUI.takeScreenshot(reportLocation + '/TC56/Step 59-Click on div ReactSelectValueContainer2.png')

"Step 60: Click on button AdvancedSettings"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_AdvancedSettings'))

WebUI.takeScreenshot(reportLocation + '/TC56/Step 60-Click on button AdvancedSettings.png')

"Step 61: Click on button CloseDialog3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_CloseDialog3'))

WebUI.takeScreenshot(reportLocation + '/TC56/Step 61-Click on button CloseDialog3.png')

"Step 62: Click on link Tests2 -> Navigate to page 'team/*/project/*/test-design/test-cases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Tests2'))

WebUI.takeScreenshot(reportLocation + '/TC56/Step 62-Click on link Tests2 - Navigate to page teamprojecttest-designtest-cases.png')

"Step 63: Click on span treeSwitchers (TreeSwitcher4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_treeSwitchers_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_treeSwitchers_1', ['span_treeSwitchers_class': span_treeSwitchers_class, 'span_treeSwitchers_nthChild': span_treeSwitchers_nthChild, 'span_treeSwitchers_divNthChild': span_treeSwitchers_divNthChild]))

WebUI.takeScreenshot(reportLocation + '/TC56/Step 63-Click on span treeSwitchers TreeSwitcher4.png')

"Step 64: Click on span treeSwitchers (TestCases)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_treeSwitchers_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_treeSwitchers_1', ['span_treeSwitchers_class': span_treeSwitchers_class_1, 'span_treeSwitchers_nthChild': span_treeSwitchers_nthChild_1, 'span_treeSwitchers_divNthChild': span_treeSwitchers_divNthChild_1]))

WebUI.takeScreenshot(reportLocation + '/TC56/Step 64-Click on span treeSwitchers TestCases.png')

"Step 65: Click on div testCases (TestCases)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/div_testCases"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/div_testCases', ['div_testCases_internalText': div_testCases_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC56/Step 65-Click on div testCases TestCases.png')

"Step 66: Click on input TestCaseCheckbox"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/input_TestCaseCheckbox'))

WebUI.takeScreenshot(reportLocation + '/TC56/Step 66-Click on input TestCaseCheckbox.png')

"Step 67: Click on link Settings -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/link_Settings_1'))

WebUI.takeScreenshot(reportLocation + '/TC56/Step 67-Click on link Settings - Navigate to page teamproject.png')

"Step 68: Click on link testResources (ScriptRepositories3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_testResources"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_testResources', ['link_testResources_nthChild': link_testResources_nthChild, 'link_testResources_internalRoleLinkName': link_testResources_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC56/Step 68-Click on link testResources ScriptRepositories3.png')

"Step 69: Click on link projectLinks (OracleJDE) -> Navigate to page 'team/*/project/*/test-project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_projectLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_projectLinks', ['link_projectLinks_trNthChild': link_projectLinks_trNthChild, 'link_projectLinks_internalRoleLinkName': link_projectLinks_internalRoleLinkName, 'team_id': team_id, 'test_project_id': test_project_id, 'project_id': project_id]))

WebUI.takeScreenshot(reportLocation + '/TC56/Step 69-Click on link projectLinks OracleJDE - Navigate to page teamprojecttest-project.png')

"Step 70: Click on button ScheduleTestRun2 -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_project/button_ScheduleTestRun2'))

WebUI.takeScreenshot(reportLocation + '/TC56/Step 70-Click on button ScheduleTestRun2 - Navigate to page teamproject.png')

"Step 71: Click on div Name2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_Name2'))

WebUI.takeScreenshot(reportLocation + '/TC56/Step 71-Click on div Name2.png')

"Step 72: Enter input value in input Name3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_team_project/input_Name3'), input_Name3_1)

WebUI.takeScreenshot(reportLocation + '/TC56/Step 72-Enter input value in input Name3.png')

"Step 73: Click on div ReactSelectControlIndicator"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_ReactSelectControlIndicator'))

WebUI.takeScreenshot(reportLocation + '/TC56/Step 73-Click on div ReactSelectControlIndicator.png')

"Step 74: Click on div ReactSelectControlIndicator"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_ReactSelectControlIndicator'))

WebUI.takeScreenshot(reportLocation + '/TC56/Step 74-Click on div ReactSelectControlIndicator.png')

"Step 75: Click on item MoreOptions"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/item_MoreOptions'))

WebUI.takeScreenshot(reportLocation + '/TC56/Step 75-Click on item MoreOptions.png')

"Step 76: Click on button MobileBrowsers"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_MobileBrowsers'))

WebUI.takeScreenshot(reportLocation + '/TC56/Step 76-Click on button MobileBrowsers.png')

"Step 77: Click on button WebServices2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_WebServices2'))

WebUI.takeScreenshot(reportLocation + '/TC56/Step 77-Click on button WebServices2.png')

"Step 78: Click on div NormalLabel"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_NormalLabel'))

WebUI.takeScreenshot(reportLocation + '/TC56/Step 78-Click on div NormalLabel.png')

"Step 79: Click on label WebServices"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/label_WebServices'))

WebUI.takeScreenshot(reportLocation + '/TC56/Step 79-Click on label WebServices.png')

"Step 80: Click on div ActiveTunnelsIndicator2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_ActiveTunnelsIndicator2'))

WebUI.takeScreenshot(reportLocation + '/TC56/Step 80-Click on div ActiveTunnelsIndicator2.png')

"Step 81: Click on div ActiveTunnelsIndicator2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_ActiveTunnelsIndicator2'))

WebUI.takeScreenshot(reportLocation + '/TC56/Step 81-Click on div ActiveTunnelsIndicator2.png')

"Step 82: Click on link HowToSetUpTestCloud"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_HowToSetUpTestCloud'))

WebUI.takeScreenshot(reportLocation + '/TC56/Step 82-Click on link HowToSetUpTestCloud.png')

"Step 83: Click on div ActiveTunnelsValueContainer"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_ActiveTunnelsValueContainer'))

WebUI.takeScreenshot(reportLocation + '/TC56/Step 83-Click on div ActiveTunnelsValueContainer.png')

"Step 84: Click on div ReactSelectOption2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_ReactSelectOption2'))

WebUI.takeScreenshot(reportLocation + '/TC56/Step 84-Click on div ReactSelectOption2.png')

"Step 85: Click on button DesktopBrowsers2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_DesktopBrowsers2'))

WebUI.takeScreenshot(reportLocation + '/TC56/Step 85-Click on button DesktopBrowsers2.png')

"Step 86: Click on input RadioButtonA2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_RadioButtonA2'))

WebUI.takeScreenshot(reportLocation + '/TC56/Step 86-Click on input RadioButtonA2.png')

"Step 87: Click on div Indicator"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_Indicator'))

WebUI.takeScreenshot(reportLocation + '/TC56/Step 87-Click on div Indicator.png')

"Step 88: Click on div SketchToolInfo3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_SketchToolInfo3'))

WebUI.takeScreenshot(reportLocation + '/TC56/Step 88-Click on div SketchToolInfo3.png')

"Step 89: Click on button Save2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Save2'))

WebUI.takeScreenshot(reportLocation + '/TC56/Step 89-Click on button Save2.png')

"Step 90: Click on div ExecutionProfileIcon"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_ExecutionProfileIcon'))

WebUI.takeScreenshot(reportLocation + '/TC56/Step 90-Click on div ExecutionProfileIcon.png')

"Step 91: Click on div ExecutionProfileIcon"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_ExecutionProfileIcon'))

WebUI.takeScreenshot(reportLocation + '/TC56/Step 91-Click on div ExecutionProfileIcon.png')

"Step 92: Click on button Run2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Run2'))

WebUI.takeScreenshot(reportLocation + '/TC56/Step 92-Click on button Run2.png')

"Step 93: Click on div SuccessMessage"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_SuccessMessage'))

WebUI.takeScreenshot(reportLocation + '/TC56/Step 93-Click on div SuccessMessage.png')

"Step 94: Click on div Navbar"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_Navbar'))

WebUI.takeScreenshot(reportLocation + '/TC56/Step 94-Click on div Navbar.png')

"Step 95: Click on link viewTestRuns (ViewTestRun)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_viewTestRuns"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_viewTestRuns', ['link_viewTestRuns_internalRoleLinkName': link_viewTestRuns_internalRoleLinkName, 'team_id': team_id_1, 'project_id': project_id_1]))

WebUI.takeScreenshot(reportLocation + '/TC56/Step 95-Click on link viewTestRuns ViewTestRun.png')

"Step 96: Click on div testRunCells (TestRunCell)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_testRunCells"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_testRunCells', ['div_testRunCells_internalRoleCellName': div_testRunCells_internalRoleCellName]))

WebUI.takeScreenshot(reportLocation + '/TC56/Step 96-Click on div testRunCells TestRunCell.png')

"Step 97: Click on div testRunCells (TestRunCell) -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_testRunCells"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_testRunCells', ['div_testRunCells_internalRoleCellName': div_testRunCells_internalRoleCellName_1]))

WebUI.takeScreenshot(reportLocation + '/TC56/Step 97-Click on div testRunCells TestRunCell - Navigate to page .png')

"Step 98: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC56-Schedule Test Runs with Advanced Settings_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}