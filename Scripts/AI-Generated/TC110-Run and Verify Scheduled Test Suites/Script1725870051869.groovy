import katalon.truetest.TrueTestScripts
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.configuration.RunConfiguration
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

"Step 3: Navigate to /welcome"

TrueTestScripts.navigate("/welcome")

"Step 4: Click on div welcomeAfiqaShahid"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/welcome?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_welcome/div_welcomeAfiqaShahid'))

WebUI.takeScreenshot(reportLocation + '/TC110/Step 4-Click on div welcomeAfiqaShahid.png')

"Step 5: Click on div developer -> Navigate to page 'organization/*/home'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/welcome?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_welcome/div_developer'))

WebUI.takeScreenshot(reportLocation + '/TC110/Step 5-Click on div developer - Navigate to page organizationhome.png')

"Step 6: Click on button ai"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_home/button_ai'))

WebUI.takeScreenshot(reportLocation + '/TC110/Step 6-Click on button ai.png')

"Step 7: Click on link organizationSetupConfigure"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_home/link_organizationSetupConfigure'))

WebUI.takeScreenshot(reportLocation + '/TC110/Step 7-Click on link organizationSetupConfigure.png')

"Step 8: Click on button surbanaJurong"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_home/button_surbanaJurong'))

WebUI.takeScreenshot(reportLocation + '/TC110/Step 8-Click on button surbanaJurong.png')

"Step 9: Click on div object2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_home/div_object2'))

WebUI.takeScreenshot(reportLocation + '/TC110/Step 9-Click on div object2.png')

"Step 10: Click on link ojOracleJde2 -> Navigate to page 'team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_home/link_ojOracleJde2'))

WebUI.takeScreenshot(reportLocation + '/TC110/Step 10-Click on link ojOracleJde2 - Navigate to page teamproject.png')

"Step 11: Click on link executions -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_executions'))

WebUI.takeScreenshot(reportLocation + '/TC110/Step 11-Click on link executions - Navigate to page teamproject.png')

"Step 12: Click on div regPreRptestSuiteCollection"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_regPreRptestSuiteCollection'))

WebUI.takeScreenshot(reportLocation + '/TC110/Step 12-Click on div regPreRptestSuiteCollection.png')

"Step 13: Click on div regPreRptestSuiteCollection2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_regPreRptestSuiteCollection2'))

WebUI.takeScreenshot(reportLocation + '/TC110/Step 13-Click on div regPreRptestSuiteCollection2.png')

"Step 14: Click on link schedules2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_schedules2'))

WebUI.takeScreenshot(reportLocation + '/TC110/Step 14-Click on link schedules2.png')

"Step 15: Click on input filterByName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_filterByName'))

WebUI.takeScreenshot(reportLocation + '/TC110/Step 15-Click on input filterByName.png')

"Step 16: Enter input value in input filterByName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_team_project/input_filterByName'), input_filterByName)

WebUI.takeScreenshot(reportLocation + '/TC110/Step 16-Enter input value in input filterByName.png')

"Step 17: Click on link regPreRptestSuite -> Navigate to page 'team/*/project/*/grid/plan/*/job'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_regPreRptestSuite'))

WebUI.takeScreenshot(reportLocation + '/TC110/Step 17-Click on link regPreRptestSuite - Navigate to page teamprojectgridplanjob.png')

"Step 18: Click on button run2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job/button_run2'))

WebUI.takeScreenshot(reportLocation + '/TC110/Step 18-Click on button run2.png')

"Step 19: Click on div object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job/div_object'))

WebUI.takeScreenshot(reportLocation + '/TC110/Step 19-Click on div object.png')

"Step 20: Click on button run3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job/button_run3'))

WebUI.takeScreenshot(reportLocation + '/TC110/Step 20-Click on button run3.png')

"Step 21: Click on div historyCalendarSchedules"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job/div_historyCalendarSchedules'))

WebUI.takeScreenshot(reportLocation + '/TC110/Step 21-Click on div historyCalendarSchedules.png')

"Step 22: Click on link history -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job/link_history'))

WebUI.takeScreenshot(reportLocation + '/TC110/Step 22-Click on link history - Navigate to page teamproject.png')

"Step 23: Click on link history2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_history2'))

WebUI.takeScreenshot(reportLocation + '/TC110/Step 23-Click on link history2.png')

"Step 24: Click on link schedules2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_schedules2'))

WebUI.takeScreenshot(reportLocation + '/TC110/Step 24-Click on link schedules2.png')

"Step 25: Click on link history2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_history2'))

WebUI.takeScreenshot(reportLocation + '/TC110/Step 25-Click on link history2.png')

"Step 26: Click on link calendar"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_calendar'))

WebUI.takeScreenshot(reportLocation + '/TC110/Step 26-Click on link calendar.png')

"Step 27: Click on link schedules2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_schedules2'))

WebUI.takeScreenshot(reportLocation + '/TC110/Step 27-Click on link schedules2.png')

"Step 28: Click on input filterByName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_filterByName'))

WebUI.takeScreenshot(reportLocation + '/TC110/Step 28-Click on input filterByName.png')

"Step 29: Enter input value in input filterByName -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_team_project/input_filterByName'), input_filterByName)

WebUI.takeScreenshot(reportLocation + '/TC110/Step 29-Enter input value in input filterByName - Navigate to page .png')

"Step 30: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC110-Run and Verify Scheduled Test Suites_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}