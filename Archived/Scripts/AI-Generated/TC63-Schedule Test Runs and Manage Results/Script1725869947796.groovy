import katalon.truetest.TrueTestScripts
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.configuration.RunConfiguration
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

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

"Step 3: Navigate to team/*/project/*"

TrueTestScripts.navigate("team/${GlobalVariable.team_id}/project/${GlobalVariable.project_id}")

"Step 4: Click on link executions -> Navigate to page 'team/*/project/*/test-runs'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_executions'))

WebUI.takeScreenshot(reportLocation + '/TC63/Step 4-Click on link executions - Navigate to page teamprojecttest-runs.png')

"Step 5: Click on button scheduleTestRun"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_scheduleTestRun'))

WebUI.takeScreenshot(reportLocation + '/TC63/Step 5-Click on button scheduleTestRun.png')

"Step 6: Click on link clickHereToRefresh"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/link_clickHereToRefresh'))

WebUI.takeScreenshot(reportLocation + '/TC63/Step 6-Click on link clickHereToRefresh.png')

"Step 7: Click on div object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_object'))

WebUI.takeScreenshot(reportLocation + '/TC63/Step 7-Click on div object.png')

"Step 8: Enter input value in input serverUrl"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_team_project_test_runs/input_serverUrl'), input_serverUrl)

WebUI.takeScreenshot(reportLocation + '/TC63/Step 8-Enter input value in input serverUrl.png')

"Step 9: Click on div object2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_object2'))

WebUI.takeScreenshot(reportLocation + '/TC63/Step 9-Click on div object2.png')

"Step 10: Click on input name"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/input_name'))

WebUI.takeScreenshot(reportLocation + '/TC63/Step 10-Click on input name.png')

"Step 11: Enter input value in input name"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_team_project_test_runs/input_name'), input_name)

WebUI.takeScreenshot(reportLocation + '/TC63/Step 11-Enter input value in input name.png')

"Step 12: Click on div object3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_object3'))

WebUI.takeScreenshot(reportLocation + '/TC63/Step 12-Click on div object3.png')

"Step 13: Click on div object4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_object4'))

WebUI.takeScreenshot(reportLocation + '/TC63/Step 13-Click on div object4.png')

"Step 14: Click on item moreOptions"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/item_moreOptions'))

WebUI.takeScreenshot(reportLocation + '/TC63/Step 14-Click on item moreOptions.png')

"Step 15: Click on span object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/span_object'))

WebUI.takeScreenshot(reportLocation + '/TC63/Step 15-Click on span object.png')

"Step 16: Click on div desktopBrowsers"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_desktopBrowsers'))

WebUI.takeScreenshot(reportLocation + '/TC63/Step 16-Click on div desktopBrowsers.png')

"Step 17: Click on div object5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_object5'))

WebUI.takeScreenshot(reportLocation + '/TC63/Step 17-Click on div object5.png')

"Step 18: Click on button save"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_save'))

WebUI.takeScreenshot(reportLocation + '/TC63/Step 18-Click on button save.png')

"Step 19: Click on div object6"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_object6'))

WebUI.takeScreenshot(reportLocation + '/TC63/Step 19-Click on div object6.png')

"Step 20: Click on div object7"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_object7'))

WebUI.takeScreenshot(reportLocation + '/TC63/Step 20-Click on div object7.png')

"Step 21: Click on button runS"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_runS'))

WebUI.takeScreenshot(reportLocation + '/TC63/Step 21-Click on button runS.png')

"Step 22: Click on button scheduleTestRun"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_scheduleTestRun'))

WebUI.takeScreenshot(reportLocation + '/TC63/Step 22-Click on button scheduleTestRun.png')

"Step 23: Click on div object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_object'))

WebUI.takeScreenshot(reportLocation + '/TC63/Step 23-Click on div object.png')

"Step 24: Enter input value in input serverUrl"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_team_project_test_runs/input_serverUrl'), input_serverUrl)

WebUI.takeScreenshot(reportLocation + '/TC63/Step 24-Enter input value in input serverUrl.png')

"Step 25: Click on div object8"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_object8'))

WebUI.takeScreenshot(reportLocation + '/TC63/Step 25-Click on div object8.png')

"Step 26: Click on div selectEnvironmentNth1"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_selectEnvironmentNth1'))

WebUI.takeScreenshot(reportLocation + '/TC63/Step 26-Click on div selectEnvironmentNth1.png')

"Step 27: Click on item moreOptions"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/item_moreOptions'))

WebUI.takeScreenshot(reportLocation + '/TC63/Step 27-Click on item moreOptions.png')

"Step 28: Click on span object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/span_object'))

WebUI.takeScreenshot(reportLocation + '/TC63/Step 28-Click on span object.png')

"Step 29: Click on label desktopBrowsers"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/label_desktopBrowsers'))

WebUI.takeScreenshot(reportLocation + '/TC63/Step 29-Click on label desktopBrowsers.png')

"Step 30: Click on div object5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_object5'))

WebUI.takeScreenshot(reportLocation + '/TC63/Step 30-Click on div object5.png')

"Step 31: Click on input includeApicalls"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/input_includeApicalls'))

WebUI.takeScreenshot(reportLocation + '/TC63/Step 31-Click on input includeApicalls.png')

"Step 32: Click on div object9"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_object9'))

WebUI.takeScreenshot(reportLocation + '/TC63/Step 32-Click on div object9.png')

"Step 33: Click on div object10"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_object10'))

WebUI.takeScreenshot(reportLocation + '/TC63/Step 33-Click on div object10.png')

"Step 34: Click on button save"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_save'))

WebUI.takeScreenshot(reportLocation + '/TC63/Step 34-Click on button save.png')

"Step 35: Click on div object11"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_object11'))

WebUI.takeScreenshot(reportLocation + '/TC63/Step 35-Click on div object11.png')

"Step 36: Click on div object12"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_object12'))

WebUI.takeScreenshot(reportLocation + '/TC63/Step 36-Click on div object12.png')

"Step 37: Click on input name"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/input_name'))

WebUI.takeScreenshot(reportLocation + '/TC63/Step 37-Click on input name.png')

"Step 38: Enter input value in input name"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_team_project_test_runs/input_name'), input_name)

WebUI.takeScreenshot(reportLocation + '/TC63/Step 38-Enter input value in input name.png')

"Step 39: Click on button runS"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_runS'))

WebUI.takeScreenshot(reportLocation + '/TC63/Step 39-Click on button runS.png')

"Step 40: Click on button scheduleTestRun"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_scheduleTestRun'))

WebUI.takeScreenshot(reportLocation + '/TC63/Step 40-Click on button scheduleTestRun.png')

"Step 41: Click on div object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_object'))

WebUI.takeScreenshot(reportLocation + '/TC63/Step 41-Click on div object.png')

"Step 42: Enter input value in input serverUrl"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_team_project_test_runs/input_serverUrl'), input_serverUrl)

WebUI.takeScreenshot(reportLocation + '/TC63/Step 42-Enter input value in input serverUrl.png')

"Step 43: Click on div object13"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_object13'))

WebUI.takeScreenshot(reportLocation + '/TC63/Step 43-Click on div object13.png')

"Step 44: Click on div object4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_object4'))

WebUI.takeScreenshot(reportLocation + '/TC63/Step 44-Click on div object4.png')

"Step 45: Click on item moreOptions"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/item_moreOptions'))

WebUI.takeScreenshot(reportLocation + '/TC63/Step 45-Click on item moreOptions.png')

"Step 46: Click on div object14"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_object14'))

WebUI.takeScreenshot(reportLocation + '/TC63/Step 46-Click on div object14.png')

"Step 47: Click on div object5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_object5'))

WebUI.takeScreenshot(reportLocation + '/TC63/Step 47-Click on div object5.png')

"Step 48: Click on button save"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_save'))

WebUI.takeScreenshot(reportLocation + '/TC63/Step 48-Click on button save.png')

"Step 49: Click on div object6"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_object6'))

WebUI.takeScreenshot(reportLocation + '/TC63/Step 49-Click on div object6.png')

"Step 50: Click on div object15"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_object15'))

WebUI.takeScreenshot(reportLocation + '/TC63/Step 50-Click on div object15.png')

"Step 51: Click on input name"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/input_name'))

WebUI.takeScreenshot(reportLocation + '/TC63/Step 51-Click on input name.png')

"Step 52: Enter input value in input name"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_team_project_test_runs/input_name'), input_name)

WebUI.takeScreenshot(reportLocation + '/TC63/Step 52-Enter input value in input name.png')

"Step 53: Click on button runS"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_runS'))

WebUI.takeScreenshot(reportLocation + '/TC63/Step 53-Click on button runS.png')

"Step 54: Click on div object16"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_object16'))

WebUI.takeScreenshot(reportLocation + '/TC63/Step 54-Click on div object16.png')

"Step 55: Click on div object17"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_object17'))

WebUI.takeScreenshot(reportLocation + '/TC63/Step 55-Click on div object17.png')

"Step 56: Click on div object18"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_object18'))

WebUI.takeScreenshot(reportLocation + '/TC63/Step 56-Click on div object18.png')

"Step 57: Click on div object17"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_object17'))

WebUI.takeScreenshot(reportLocation + '/TC63/Step 57-Click on div object17.png')

"Step 58: Click on button object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_object'))

WebUI.takeScreenshot(reportLocation + '/TC63/Step 58-Click on button object.png')

"Step 59: Click on link reports -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/link_reports'))

WebUI.takeScreenshot(reportLocation + '/TC63/Step 59-Click on link reports - Navigate to page teamproject.png')

"Step 60: Click on link testRuns2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_testRuns2'))

WebUI.takeScreenshot(reportLocation + '/TC63/Step 60-Click on link testRuns2.png')

"Step 61: Click on div allTestRunsNth0"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_allTestRunsNth0'))

WebUI.takeScreenshot(reportLocation + '/TC63/Step 61-Click on div allTestRunsNth0.png')

"Step 62: Click on label failed"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/label_failed'))

WebUI.takeScreenshot(reportLocation + '/TC63/Step 62-Click on label failed.png')

"Step 63: Click on label passed"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/label_passed'))

WebUI.takeScreenshot(reportLocation + '/TC63/Step 63-Click on label passed.png')

"Step 64: Click on label failed2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/label_failed2'))

WebUI.takeScreenshot(reportLocation + '/TC63/Step 64-Click on label failed2.png')

"Step 65: Click on label failed3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/label_failed3'))

WebUI.takeScreenshot(reportLocation + '/TC63/Step 65-Click on label failed3.png')

"Step 66: Click on button delete"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_delete'))

WebUI.takeScreenshot(reportLocation + '/TC63/Step 66-Click on button delete.png')

"Step 67: Click on button delete2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_save'))

WebUI.takeScreenshot(reportLocation + '/TC63/Step 67-Click on button delete2.png')

"Step 68: Click on link executions -> Navigate to page 'team/*/project/*/test-runs'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_executions'))

WebUI.takeScreenshot(reportLocation + '/TC63/Step 68-Click on link executions - Navigate to page teamprojecttest-runs.png')

"Step 69: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC63-Schedule Test Runs and Manage Results_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}