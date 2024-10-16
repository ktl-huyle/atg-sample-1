import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import truetest.custom.TrueTestScripts
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

"Step 3: Navigate to team/{*}/project/{*}/overview"

TrueTestScripts.navigate("team/{*}/project/{*}/overview")

"Step 4: Click on div TestRunsUpload"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/overview?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_overview/div_TestRunsUpload'))

WebUI.takeScreenshot(reportLocation + '/TC15/Step 4-Click on div TestRunsUpload.png')

"Step 5: Click on link RunFrequency -> Navigate to page 'report page#team/{*}/project/{*}/test-reports/test-execution/frequency-report'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/overview?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_overview/link_RunFrequency'))

WebUI.takeScreenshot(reportLocation + '/TC15/Step 5-Click on link RunFrequency - Navigate to page report pageteamprojecttest-reportstest-executionfrequency-report.png')

"Step 6: Click on button DateLabel"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/test-reports/test-execution/frequency-report?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_report_page/button_DateLabel'))

WebUI.takeScreenshot(reportLocation + '/TC15/Step 6-Click on button DateLabel.png')

"Step 7: Click on link Dashboard -> Navigate to page 'team project#team/{*}/project/{*}'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/test-reports/test-execution/frequency-report?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_report_page/link_Dashboard'))

WebUI.takeScreenshot(reportLocation + '/TC15/Step 7-Click on link Dashboard - Navigate to page team projectteamproject.png')

"Step 8: Click on link Reports3 -> Navigate to page 'team project overview#team/{*}/project/{*}/overview'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Reports3'))

WebUI.takeScreenshot(reportLocation + '/TC15/Step 8-Click on link Reports3 - Navigate to page team project overviewteamprojectoverview.png')

"Step 9: Click on link RunFrequency -> Navigate to page 'report page#team/{*}/project/{*}/test-reports/test-execution/frequency-report'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/overview?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_overview/link_RunFrequency'))

WebUI.takeScreenshot(reportLocation + '/TC15/Step 9-Click on link RunFrequency - Navigate to page report pageteamprojecttest-reportstest-executionfrequency-report.png')

"Step 10: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC15-Upload Test Runs and Verify Reports Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}