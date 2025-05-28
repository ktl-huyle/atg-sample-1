import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.QA.custom.TrueTestScripts

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to /team/*/project/*/overview"

TrueTestScripts.navigate("/team/${team_id}/project/${project_id}/overview")

"Step 2: Click on link executions -> Navigate to page '/team/*/project/*/test-runs'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/overview?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_team_project_overview/link_executions'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 2-Click on link executions - Navigate to page teamprojecttest-runs.png')

"Step 3: Click on button scheduleTestRun"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_team_project_test_runs/button_scheduleTestRun'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 3-Click on button scheduleTestRun.png')

"Step 4: Click on button testSuiteCollection"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_team_project_test_runs/button_testSuiteCollection'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 4-Click on button testSuiteCollection.png')

"Step 5: Click on link configureEnvironments"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_team_project_test_runs/link_configureEnvironments'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 5-Click on link configureEnvironments.png')

"Step 6: Click on div testCloudLinux"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_team_project_test_runs/div_testCloudLinux'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 6-Click on div testCloudLinux.png')

"Step 7: Click on div testCloudLinux2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_team_project_test_runs/div_testCloudLinux2'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 7-Click on div testCloudLinux2.png')

"Step 8: Click on div testCloudLinux"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_team_project_test_runs/div_testCloudLinux'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 8-Click on div testCloudLinux.png')

"Step 9: Click on div testCloudLinux2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_team_project_test_runs/div_testCloudLinux2'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 9-Click on div testCloudLinux2.png')

"Step 10: Click on div testCloudLinux"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_team_project_test_runs/div_testCloudLinux'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 10-Click on div testCloudLinux.png')

"Step 11: Click on div testCloudLinux2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_team_project_test_runs/div_testCloudLinux2'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 11-Click on div testCloudLinux2.png')

"Step 12: Click on div testCloudLinux"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_team_project_test_runs/div_testCloudLinux'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 12-Click on div testCloudLinux.png')

"Step 13: Click on div testCloudLinux2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_team_project_test_runs/div_testCloudLinux2'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 13-Click on div testCloudLinux2.png')

"Step 14: Click on div testCloudLinux"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_team_project_test_runs/div_testCloudLinux'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 14-Click on div testCloudLinux.png')

"Step 15: Click on div testCloudLinux2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_team_project_test_runs/div_testCloudLinux2'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 15-Click on div testCloudLinux2.png')

"Step 16: Click on div testCloudLinux"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_team_project_test_runs/div_testCloudLinux'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 16-Click on div testCloudLinux.png')

"Step 17: Click on div testCloudLinux2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_team_project_test_runs/div_testCloudLinux2'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 17-Click on div testCloudLinux2.png')

"Step 18: Click on div testCloudLinux"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_team_project_test_runs/div_testCloudLinux'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 18-Click on div testCloudLinux.png')

"Step 19: Click on div testCloudLinux2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_team_project_test_runs/div_testCloudLinux2'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 19-Click on div testCloudLinux2.png')

"Step 20: Click on div testCloudLinux"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_team_project_test_runs/div_testCloudLinux'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 20-Click on div testCloudLinux.png')

"Step 21: Click on div testCloudLinux2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_team_project_test_runs/div_testCloudLinux2'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 21-Click on div testCloudLinux2.png')

"Step 22: Click on div testCloudLinux"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_team_project_test_runs/div_testCloudLinux'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 22-Click on div testCloudLinux.png')

"Step 23: Click on div testCloudLinux2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_team_project_test_runs/div_testCloudLinux2'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 23-Click on div testCloudLinux2.png')

"Step 24: Click on div testCloudLinux"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_team_project_test_runs/div_testCloudLinux'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 24-Click on div testCloudLinux.png')

"Step 25: Click on div testCloudLinux2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_team_project_test_runs/div_testCloudLinux2'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 25-Click on div testCloudLinux2.png')

"Step 26: Click on div testCloudLinux"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_team_project_test_runs/div_testCloudLinux'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 26-Click on div testCloudLinux.png')

"Step 27: Click on div testCloudLinux2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_team_project_test_runs/div_testCloudLinux2'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 27-Click on div testCloudLinux2.png')

"Step 28: Click on div testCloudLinux"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_team_project_test_runs/div_testCloudLinux'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 28-Click on div testCloudLinux.png')

"Step 29: Click on div testCloudLinux2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_team_project_test_runs/div_testCloudLinux2'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 29-Click on div testCloudLinux2.png')

"Step 30: Click on div testCloudLinux"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_team_project_test_runs/div_testCloudLinux'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 30-Click on div testCloudLinux.png')

"Step 31: Click on div testCloudLinux2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_team_project_test_runs/div_testCloudLinux2'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 31-Click on div testCloudLinux2.png')

"Step 32: Click on div testCloudLinux"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_team_project_test_runs/div_testCloudLinux'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 32-Click on div testCloudLinux.png')

"Step 33: Click on div object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_team_project_test_runs/div_object'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 33-Click on div object.png')

"Step 34: Click on div desktopBrowsers"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_team_project_test_runs/div_desktopBrowsers'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 34-Click on div desktopBrowsers.png')

"Step 35: Click on div testCloudLinux3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_team_project_test_runs/div_testCloudLinux3'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 35-Click on div testCloudLinux3.png')

"Step 36: Click on div testCloudLinux4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_team_project_test_runs/div_testCloudLinux4'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 36-Click on div testCloudLinux4.png')

"Step 37: Click on div testCloudLinux5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_team_project_test_runs/div_testCloudLinux5'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 37-Click on div testCloudLinux5.png')

"Step 38: Click on div testCloudLinux6"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_team_project_test_runs/div_testCloudLinux6'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 38-Click on div testCloudLinux6.png')

"Step 39: Click on div testCloudLinux5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_team_project_test_runs/div_testCloudLinux5'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 39-Click on div testCloudLinux5.png')

"Step 40: Click on div testCloudLinux6 -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_team_project_test_runs/div_testCloudLinux6'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 40-Click on div testCloudLinux6 - Navigate to page .png')

"Step 41: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC4-Schedule Test Run with Multiple Environments in Test Cloud_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}