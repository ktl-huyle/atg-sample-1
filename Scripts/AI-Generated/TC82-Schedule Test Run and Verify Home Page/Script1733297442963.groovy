import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.common.accessProjectDetailsAndScheduleTestRun
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

"Step 4: Access project details and schedule a test run"

accessProjectDetailsAndScheduleTestRun.execute(data_path_0, Integer.valueOf(index_0))

"Step 5: Click on input Name"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_Name'))

WebUI.takeScreenshot(reportLocation + '/TC82/Step 5-Click on input Name.png')

"Step 6: Click on div Name"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_Name'))

WebUI.takeScreenshot(reportLocation + '/TC82/Step 6-Click on div Name.png')

"Step 7: Enter input value in input Name2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_team_project/input_Name'), input_Name2)

WebUI.takeScreenshot(reportLocation + '/TC82/Step 7-Enter input value in input Name2.png')

"Step 8: Click on div ReactSelectIndicator"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_ReactSelectIndicator'))

WebUI.takeScreenshot(reportLocation + '/TC82/Step 8-Click on div ReactSelectIndicator.png')

"Step 9: Click on div ReactSelectIndicator"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_ReactSelectIndicator'))

WebUI.takeScreenshot(reportLocation + '/TC82/Step 9-Click on div ReactSelectIndicator.png')

"Step 10: Click on div TestSuiteIcon"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_TestSuiteIcon'))

WebUI.takeScreenshot(reportLocation + '/TC82/Step 10-Click on div TestSuiteIcon.png')

"Step 11: Click on div TestSuites"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_TestSuites'))

WebUI.takeScreenshot(reportLocation + '/TC82/Step 11-Click on div TestSuites.png')

"Step 12: Click on div ReactSelectControlIndicator"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_ReactSelectControlIndicator'))

WebUI.takeScreenshot(reportLocation + '/TC82/Step 12-Click on div ReactSelectControlIndicator.png')

"Step 13: Click on item MoreOptions"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/item_MoreOptions'))

WebUI.takeScreenshot(reportLocation + '/TC82/Step 13-Click on item MoreOptions.png')

"Step 14: Click on input RadioButton2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_RadioButton2'))

WebUI.takeScreenshot(reportLocation + '/TC82/Step 14-Click on input RadioButton2.png')

"Step 15: Click on div ReactSelectValueContainer2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_ReactSelectValueContainer2'))

WebUI.takeScreenshot(reportLocation + '/TC82/Step 15-Click on div ReactSelectValueContainer2.png')

"Step 16: Click on div ReactSelectControl"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_ReactSelectControl'))

WebUI.takeScreenshot(reportLocation + '/TC82/Step 16-Click on div ReactSelectControl.png')

"Step 17: Click on div ReactSelectControl"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_ReactSelectControl'))

WebUI.takeScreenshot(reportLocation + '/TC82/Step 17-Click on div ReactSelectControl.png')

"Step 18: Click on div ReactSelectControl"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_ReactSelectControl'))

WebUI.takeScreenshot(reportLocation + '/TC82/Step 18-Click on div ReactSelectControl.png')

"Step 19: Click on div ConfigureTestEnvironment2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_ConfigureTestEnvironment2'))

WebUI.takeScreenshot(reportLocation + '/TC82/Step 19-Click on div ConfigureTestEnvironment2.png')

"Step 20: Click on div ReactSelectControl"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_ReactSelectControl'))

WebUI.takeScreenshot(reportLocation + '/TC82/Step 20-Click on div ReactSelectControl.png')

"Step 21: Click on div ReactSelectControl"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_ReactSelectControl'))

WebUI.takeScreenshot(reportLocation + '/TC82/Step 21-Click on div ReactSelectControl.png')

"Step 22: Click on div SketchToolInfo"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_SketchToolInfo'))

WebUI.takeScreenshot(reportLocation + '/TC82/Step 22-Click on div SketchToolInfo.png')

"Step 23: Click on button Save"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Save_1'))

WebUI.takeScreenshot(reportLocation + '/TC82/Step 23-Click on button Save.png')

"Step 24: Click on div ExecutionProfileIcon"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_ExecutionProfileIcon'))

WebUI.takeScreenshot(reportLocation + '/TC82/Step 24-Click on div ExecutionProfileIcon.png')

"Step 25: Click on div ExecutionProfileIcon"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_ExecutionProfileIcon'))

WebUI.takeScreenshot(reportLocation + '/TC82/Step 25-Click on div ExecutionProfileIcon.png')

"Step 26: Click on div ExecutionProfileDetail"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_ExecutionProfileDetail'))

WebUI.takeScreenshot(reportLocation + '/TC82/Step 26-Click on div ExecutionProfileDetail.png')

"Step 27: Click on div EnvironmentSelectFocus"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_EnvironmentSelectFocus'))

WebUI.takeScreenshot(reportLocation + '/TC82/Step 27-Click on div EnvironmentSelectFocus.png')

"Step 28: Click on div ReactSelectValueContainer"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_ReactSelectValueContainer'))

WebUI.takeScreenshot(reportLocation + '/TC82/Step 28-Click on div ReactSelectValueContainer.png')

"Step 29: Click on div TestCloudCreated"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_TestCloudCreated'))

WebUI.takeScreenshot(reportLocation + '/TC82/Step 29-Click on div TestCloudCreated.png')

"Step 30: Click on div TestCloudCreated"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_TestCloudCreated'))

WebUI.takeScreenshot(reportLocation + '/TC82/Step 30-Click on div TestCloudCreated.png')

"Step 31: Click on div WindowsChrome"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_WindowsChrome'))

WebUI.takeScreenshot(reportLocation + '/TC82/Step 31-Click on div WindowsChrome.png')

"Step 32: Click on div WindowsChrome"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_WindowsChrome'))

WebUI.takeScreenshot(reportLocation + '/TC82/Step 32-Click on div WindowsChrome.png')

"Step 33: Click on item MoreOptions"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/item_MoreOptions'))

WebUI.takeScreenshot(reportLocation + '/TC82/Step 33-Click on item MoreOptions.png')

"Step 34: Click on div BrowserTypeIndicator"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_BrowserTypeIndicator'))

WebUI.takeScreenshot(reportLocation + '/TC82/Step 34-Click on div BrowserTypeIndicator.png')

"Step 35: Click on div BrowserTypeIndicator"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_BrowserTypeIndicator'))

WebUI.takeScreenshot(reportLocation + '/TC82/Step 35-Click on div BrowserTypeIndicator.png')

"Step 36: Click on div ReactSelectIndicator2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_ReactSelectIndicator2'))

WebUI.takeScreenshot(reportLocation + '/TC82/Step 36-Click on div ReactSelectIndicator2.png')

"Step 37: Click on div ReactSelectMultiValue"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_ReactSelectMultiValue'))

WebUI.takeScreenshot(reportLocation + '/TC82/Step 37-Click on div ReactSelectMultiValue.png')

"Step 38: Click on div ReactSelectControl"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_ReactSelectControl'))

WebUI.takeScreenshot(reportLocation + '/TC82/Step 38-Click on div ReactSelectControl.png')

"Step 39: Click on div ReactSelectControl"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_ReactSelectControl'))

WebUI.takeScreenshot(reportLocation + '/TC82/Step 39-Click on div ReactSelectControl.png')

"Step 40: Click on div ReactSelectOption4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_ReactSelectOption4'))

WebUI.takeScreenshot(reportLocation + '/TC82/Step 40-Click on div ReactSelectOption4.png')

"Step 41: Click on div ReactSelectIndicator2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_ReactSelectIndicator2'))

WebUI.takeScreenshot(reportLocation + '/TC82/Step 41-Click on div ReactSelectIndicator2.png')

"Step 42: Click on div ReactSelectIndicator2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_ReactSelectIndicator2'))

WebUI.takeScreenshot(reportLocation + '/TC82/Step 42-Click on div ReactSelectIndicator2.png')

"Step 43: Click on button ExpandMore"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_ExpandMore'))

WebUI.takeScreenshot(reportLocation + '/TC82/Step 43-Click on button ExpandMore.png')

"Step 44: Click on input RadioButtons"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_RadioButtons'))

WebUI.takeScreenshot(reportLocation + '/TC82/Step 44-Click on input RadioButtons.png')

"Step 45: Click on label DesktopBrowsers"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/label_DesktopBrowsers'))

WebUI.takeScreenshot(reportLocation + '/TC82/Step 45-Click on label DesktopBrowsers.png')

"Step 46: Click on div ActiveTunnelsSVG"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_ActiveTunnelsSVG'))

WebUI.takeScreenshot(reportLocation + '/TC82/Step 46-Click on div ActiveTunnelsSVG.png')

"Step 47: Click on div ActiveTunnelsSVG"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_ActiveTunnelsSVG'))

WebUI.takeScreenshot(reportLocation + '/TC82/Step 47-Click on div ActiveTunnelsSVG.png')

"Step 48: Click on label DesktopBrowsers"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/label_DesktopBrowsers'))

WebUI.takeScreenshot(reportLocation + '/TC82/Step 48-Click on label DesktopBrowsers.png')

"Step 49: Click on label DesktopBrowsers"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/label_DesktopBrowsers'))

WebUI.takeScreenshot(reportLocation + '/TC82/Step 49-Click on label DesktopBrowsers.png')

"Step 50: Click on div ActiveTunnelsIndicator"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_ActiveTunnelsIndicator'))

WebUI.takeScreenshot(reportLocation + '/TC82/Step 50-Click on div ActiveTunnelsIndicator.png')

"Step 51: Click on div ActiveTunnelsIndicator"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_ActiveTunnelsIndicator'))

WebUI.takeScreenshot(reportLocation + '/TC82/Step 51-Click on div ActiveTunnelsIndicator.png')

"Step 52: Click on div DesktopBrowsersLabel"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_DesktopBrowsersLabel'))

WebUI.takeScreenshot(reportLocation + '/TC82/Step 52-Click on div DesktopBrowsersLabel.png')

"Step 53: Click on button ExpandMore2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_ExpandMore'))

WebUI.takeScreenshot(reportLocation + '/TC82/Step 53-Click on button ExpandMore2.png')

"Step 54: Click on div SketchToolInfo2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_SketchToolInfo2'))

WebUI.takeScreenshot(reportLocation + '/TC82/Step 54-Click on div SketchToolInfo2.png')

"Step 55: Click on button Save"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Save_1'))

WebUI.takeScreenshot(reportLocation + '/TC82/Step 55-Click on button Save.png')

"Step 56: Click on div TestSuiteIcon"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_TestSuiteIcon'))

WebUI.takeScreenshot(reportLocation + '/TC82/Step 56-Click on div TestSuiteIcon.png')

"Step 57: Click on div TestSuiteIcon"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_TestSuiteIcon'))

WebUI.takeScreenshot(reportLocation + '/TC82/Step 57-Click on div TestSuiteIcon.png')

"Step 58: Click on div ReactSelectValueContainer"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_ReactSelectValueContainer'))

WebUI.takeScreenshot(reportLocation + '/TC82/Step 58-Click on div ReactSelectValueContainer.png')

"Step 59: Click on div ReactSelectValueContainer"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_ReactSelectValueContainer'))

WebUI.takeScreenshot(reportLocation + '/TC82/Step 59-Click on div ReactSelectValueContainer.png')

"Step 60: Click on button AdvancedSettings"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_AdvancedSettings'))

WebUI.takeScreenshot(reportLocation + '/TC82/Step 60-Click on button AdvancedSettings.png')

"Step 61: Click on button CloseDialog4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_CloseDialog4'))

WebUI.takeScreenshot(reportLocation + '/TC82/Step 61-Click on button CloseDialog4.png')

"Step 62: Click on link Tests -> Navigate to page 'team/*/project/*/test-design/test-cases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Tests_1'))

WebUI.takeScreenshot(reportLocation + '/TC82/Step 62-Click on link Tests - Navigate to page teamprojecttest-designtest-cases.png')

"Step 63: Click on span testCaseItems (objectItems)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_testCaseItems"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_testCaseItems', ['span_testCaseItems_divNthChild': span_testCaseItems_divNthChild]))

WebUI.takeScreenshot(reportLocation + '/TC82/Step 63-Click on span testCaseItems objectItems.png')

"Step 64: Click on span testCaseItems (KatalonStudioTestCases)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_testCaseItems'))

WebUI.takeScreenshot(reportLocation + '/TC82/Step 64-Click on span testCaseItems KatalonStudioTestCases.png')

"Step 65: Click on div UploadedData (UploadedData5)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/div_UploadedData"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/div_UploadedData', ['div_UploadedData_internalText': div_UploadedData_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC82/Step 65-Click on div UploadedData UploadedData5.png')

"Step 66: Click on input testCaseCheckbox"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/input_testCaseCheckbox'))

WebUI.takeScreenshot(reportLocation + '/TC82/Step 66-Click on input testCaseCheckbox.png')

"Step 67: Click on link settings -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/link_settings'))

WebUI.takeScreenshot(reportLocation + '/TC82/Step 67-Click on link settings - Navigate to page teamproject.png')

"Step 68: Click on link testEnvironments (TestEnvironments39)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_testEnvironments"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_testEnvironments', ['link_testEnvironments_nthChild': link_testEnvironments_nthChild, 'link_testEnvironments_internalRoleLinkName': link_testEnvironments_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC82/Step 68-Click on link testEnvironments TestEnvironments39.png')

"Step 69: Click on link dynamicObject (OracleJDE) -> Navigate to page 'team/*/project/*/test-project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_dynamicObject', ['link_dynamicObject_trNthChild': link_dynamicObject_trNthChild, 'link_dynamicObject_internalRoleLinkName': link_dynamicObject_internalRoleLinkName, 'team_id': team_id, 'project_id': project_id, 'test_project_id': test_project_id]))

WebUI.takeScreenshot(reportLocation + '/TC82/Step 69-Click on link dynamicObject OracleJDE - Navigate to page teamprojecttest-project.png')

"Step 70: Click on button ScheduleTestRun -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_project/button_ScheduleTestRun'))

WebUI.takeScreenshot(reportLocation + '/TC82/Step 70-Click on button ScheduleTestRun - Navigate to page teamproject.png')

"Step 71: Click on div Name"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_Name'))

WebUI.takeScreenshot(reportLocation + '/TC82/Step 71-Click on div Name.png')

"Step 72: Enter input value in input Name2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_team_project/input_Name'), input_Name2_1)

WebUI.takeScreenshot(reportLocation + '/TC82/Step 72-Enter input value in input Name2.png')

"Step 73: Click on div ReactSelectControlIndicator"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_ReactSelectControlIndicator'))

WebUI.takeScreenshot(reportLocation + '/TC82/Step 73-Click on div ReactSelectControlIndicator.png')

"Step 74: Click on div ReactSelectControlIndicator"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_ReactSelectControlIndicator'))

WebUI.takeScreenshot(reportLocation + '/TC82/Step 74-Click on div ReactSelectControlIndicator.png')

"Step 75: Click on item MoreOptions"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/item_MoreOptions'))

WebUI.takeScreenshot(reportLocation + '/TC82/Step 75-Click on item MoreOptions.png')

"Step 76: Click on button MobileBrowsers"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_MobileBrowsers'))

WebUI.takeScreenshot(reportLocation + '/TC82/Step 76-Click on button MobileBrowsers.png')

"Step 77: Click on button WebServices2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_WebServices2'))

WebUI.takeScreenshot(reportLocation + '/TC82/Step 77-Click on button WebServices2.png')

"Step 78: Click on div NormalLabel"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_NormalLabel'))

WebUI.takeScreenshot(reportLocation + '/TC82/Step 78-Click on div NormalLabel.png')

"Step 79: Click on label WebServices"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/label_WebServices'))

WebUI.takeScreenshot(reportLocation + '/TC82/Step 79-Click on label WebServices.png')

"Step 80: Click on div ActiveTunnelsIndicator"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_ActiveTunnelsIndicator'))

WebUI.takeScreenshot(reportLocation + '/TC82/Step 80-Click on div ActiveTunnelsIndicator.png')

"Step 81: Click on div ActiveTunnelsIndicator"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_ActiveTunnelsIndicator'))

WebUI.takeScreenshot(reportLocation + '/TC82/Step 81-Click on div ActiveTunnelsIndicator.png')

"Step 82: Click on link HowToSetUpTestCloud"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_HowToSetUpTestCloud'))

WebUI.takeScreenshot(reportLocation + '/TC82/Step 82-Click on link HowToSetUpTestCloud.png')

"Step 83: Click on div ActiveTunnelsValueContainer"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_ActiveTunnelsValueContainer'))

WebUI.takeScreenshot(reportLocation + '/TC82/Step 83-Click on div ActiveTunnelsValueContainer.png')

"Step 84: Click on div ReactSelectOption5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_ReactSelectOption5'))

WebUI.takeScreenshot(reportLocation + '/TC82/Step 84-Click on div ReactSelectOption5.png')

"Step 85: Click on button DesktopBrowsers2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_DesktopBrowsers2'))

WebUI.takeScreenshot(reportLocation + '/TC82/Step 85-Click on button DesktopBrowsers2.png')

"Step 86: Click on input RadioButton2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_RadioButton2'))

WebUI.takeScreenshot(reportLocation + '/TC82/Step 86-Click on input RadioButton2.png')

"Step 87: Click on div ReactSelectControl"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_ReactSelectControl'))

WebUI.takeScreenshot(reportLocation + '/TC82/Step 87-Click on div ReactSelectControl.png')

"Step 88: Click on div SketchToolInfo3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_SketchToolInfo3'))

WebUI.takeScreenshot(reportLocation + '/TC82/Step 88-Click on div SketchToolInfo3.png')

"Step 89: Click on button Save"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Save_1'))

WebUI.takeScreenshot(reportLocation + '/TC82/Step 89-Click on button Save.png')

"Step 90: Click on div ExecutionProfileIcon"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_ExecutionProfileIcon'))

WebUI.takeScreenshot(reportLocation + '/TC82/Step 90-Click on div ExecutionProfileIcon.png')

"Step 91: Click on div ExecutionProfileIcon"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_ExecutionProfileIcon'))

WebUI.takeScreenshot(reportLocation + '/TC82/Step 91-Click on div ExecutionProfileIcon.png')

"Step 92: Click on button Run"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Run'))

WebUI.takeScreenshot(reportLocation + '/TC82/Step 92-Click on button Run.png')

"Step 93: Click on div dynamicObject (successMessage)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_dynamicObject_1'))

WebUI.takeScreenshot(reportLocation + '/TC82/Step 93-Click on div dynamicObject successMessage.png')

"Step 94: Click on div topNavbar"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_topNavbar'))

WebUI.takeScreenshot(reportLocation + '/TC82/Step 94-Click on div topNavbar.png')

"Step 95: Click on link viewTestRun (viewTestRun)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_viewTestRun"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_viewTestRun', ['link_viewTestRun_internalRoleLinkName': link_viewTestRun_internalRoleLinkName, 'team_id': team_id_1, 'project_id': project_id_1]))

WebUI.takeScreenshot(reportLocation + '/TC82/Step 95-Click on link viewTestRun viewTestRun.png')

"Step 96: Click on div UntitledTestRun (UntitledTestRun33)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_UntitledTestRun"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_UntitledTestRun', ['div_UntitledTestRun_internalRoleCellName': div_UntitledTestRun_internalRoleCellName]))

WebUI.takeScreenshot(reportLocation + '/TC82/Step 96-Click on div UntitledTestRun UntitledTestRun33.png')

"Step 97: Click on div UntitledTestRun (UntitledTestRun33) -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_UntitledTestRun"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_UntitledTestRun', ['div_UntitledTestRun_internalRoleCellName': div_UntitledTestRun_internalRoleCellName_1]))

WebUI.takeScreenshot(reportLocation + '/TC82/Step 97-Click on div UntitledTestRun UntitledTestRun33 - Navigate to page .png')

"Step 98: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC82-Schedule Test Run and Verify Home Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}