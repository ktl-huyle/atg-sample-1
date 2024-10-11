import internal.GlobalVariable
import com.kms.katalon.core.configuration.RunConfiguration
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
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

"Step 3: Navigate to /welcome"

TrueTestScripts.navigate("/welcome")

"Step 4: Click on div qualityEngineer (ManualTester) -> Navigate to page 'organization/*/home'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/welcome?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_welcome/div_qualityEngineer"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_welcome/div_qualityEngineer', ['div_qualityEngineer_class': div_qualityEngineer_class, 'div_qualityEngineer_internalText': div_qualityEngineer_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC54/Step 4-Click on div qualityEngineer ManualTester - Navigate to page organizationhome.png')

"Step 5: Click on div RecentProjects2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_home/div_RecentProjects2'))

WebUI.takeScreenshot(reportLocation + '/TC54/Step 5-Click on div RecentProjects2.png')

"Step 6: Click on link projectNavigation (FPFirstProject2) -> Navigate to page 'team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/link_projectNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/link_projectNavigation', ['link_projectNavigation_internalRoleLinkName': link_projectNavigation_internalRoleLinkName, 'link_projectNavigation_team_id': link_projectNavigation_team_id, 'link_projectNavigation_project_id': link_projectNavigation_project_id]))

WebUI.takeScreenshot(reportLocation + '/TC54/Step 6-Click on link projectNavigation FPFirstProject2 - Navigate to page teamproject.png')

"Step 7: Click on span downloadKatalon (DownloadKatalonPackage)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/span_downloadKatalon"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/span_downloadKatalon', ['span_downloadKatalon_internalRoleButtonName': span_downloadKatalon_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC54/Step 7-Click on span downloadKatalon DownloadKatalonPackage.png')

"Step 8: Click on input TimeFilter"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_TimeFilter'))

WebUI.takeScreenshot(reportLocation + '/TC54/Step 8-Click on input TimeFilter.png')

"Step 9: Click on div ExecutionResult"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_ExecutionResult'))

WebUI.takeScreenshot(reportLocation + '/TC54/Step 9-Click on div ExecutionResult.png')

"Step 10: Click on link Tests4 -> Navigate to page 'team/*/project/*/test-design/test-cases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Tests4'))

WebUI.takeScreenshot(reportLocation + '/TC54/Step 10-Click on link Tests4 - Navigate to page teamprojecttest-designtest-cases.png')

"Step 11: Click on div testCasesSection (UploadedData)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/div_testCasesSection"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/div_testCasesSection', ['div_testCasesSection_internalText': div_testCasesSection_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC54/Step 11-Click on div testCasesSection UploadedData.png')

"Step 12: Click on input SearchTestCase"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/input_SearchTestCase'))

WebUI.takeScreenshot(reportLocation + '/TC54/Step 12-Click on input SearchTestCase.png')

"Step 13: Click on div MainContentButton"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/div_MainContentButton'))

WebUI.takeScreenshot(reportLocation + '/TC54/Step 13-Click on div MainContentButton.png')

"Step 14: Click on div testCaseSummary (NameMaintainer)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/div_testCaseSummary'))

WebUI.takeScreenshot(reportLocation + '/TC54/Step 14-Click on div testCaseSummary NameMaintainer.png')

"Step 15: Click on link WebServices -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/link_WebServices'))

WebUI.takeScreenshot(reportLocation + '/TC54/Step 15-Click on link WebServices - Navigate to page teamproject.png')

"Step 16: Click on link Anomalies"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Anomalies'))

WebUI.takeScreenshot(reportLocation + '/TC54/Step 16-Click on link Anomalies.png')

"Step 17: Click on link WebServices"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_WebServices'))

WebUI.takeScreenshot(reportLocation + '/TC54/Step 17-Click on link WebServices.png')

"Step 18: Click on link TestObjects -> Navigate to page 'team/*/project/*/test-design/test-objects'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_TestObjects'))

WebUI.takeScreenshot(reportLocation + '/TC54/Step 18-Click on link TestObjects - Navigate to page teamprojecttest-designtest-objects.png')

"Step 19: Click on link TestSuites -> Navigate to page 'team/*/project/*/test-design/test-suites'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-objects?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_objects/link_TestSuites'))

WebUI.takeScreenshot(reportLocation + '/TC54/Step 19-Click on link TestSuites - Navigate to page teamprojecttest-designtest-suites.png')

"Step 20: Click on link TestCases -> Navigate to page 'team/*/project/*/test-design/test-cases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-suites?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_suites/link_TestCases'))

WebUI.takeScreenshot(reportLocation + '/TC54/Step 20-Click on link TestCases - Navigate to page teamprojecttest-designtest-cases.png')

"Step 21: Click on div testCasesSection (UploadedData)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/div_testCasesSection"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/div_testCasesSection', ['div_testCasesSection_internalText': div_testCasesSection_internalText_1]))

WebUI.takeScreenshot(reportLocation + '/TC54/Step 21-Click on div testCasesSection UploadedData.png')

"Step 22: Click on input SearchTestCase"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/input_SearchTestCase'))

WebUI.takeScreenshot(reportLocation + '/TC54/Step 22-Click on input SearchTestCase.png')

"Step 23: Click on div MainContentButton"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/div_MainContentButton'))

WebUI.takeScreenshot(reportLocation + '/TC54/Step 23-Click on div MainContentButton.png')

"Step 24: Click on div testCaseSummary (NameMaintainer)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/div_testCaseSummary'))

WebUI.takeScreenshot(reportLocation + '/TC54/Step 24-Click on div testCaseSummary NameMaintainer.png')

"Step 25: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC54-Search and Verify Test Design Elements_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}