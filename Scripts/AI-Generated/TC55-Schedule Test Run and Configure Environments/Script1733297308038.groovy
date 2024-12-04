import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
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

"Step 4: Click on link projectDetails (FPFirstProject2) -> Navigate to page 'team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/link_projectDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/link_projectDetails', ['link_projectDetails_internalRoleLinkName': link_projectDetails_internalRoleLinkName, 'project_id': project_id, 'team_id': team_id]))

WebUI.takeScreenshot(reportLocation + '/TC55/Step 4-Click on link projectDetails FPFirstProject2 - Navigate to page teamproject.png')

"Step 5: Click on link Executions5 -> Navigate to page 'team/*/project/*/test-runs'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Executions5'))

WebUI.takeScreenshot(reportLocation + '/TC55/Step 5-Click on link Executions5 - Navigate to page teamprojecttest-runs.png')

"Step 6: Click on button ScheduleTestRun"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_ScheduleTestRun'))

WebUI.takeScreenshot(reportLocation + '/TC55/Step 6-Click on button ScheduleTestRun.png')

"Step 7: Click on div SelectEnvironment"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_SelectEnvironment'))

WebUI.takeScreenshot(reportLocation + '/TC55/Step 7-Click on div SelectEnvironment.png')

"Step 8: Click on item MoreOptions"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/item_MoreOptions'))

WebUI.takeScreenshot(reportLocation + '/TC55/Step 8-Click on item MoreOptions.png')

"Step 9: Click on span CreatedWithSketchEdge"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/span_CreatedWithSketchEdge'))

WebUI.takeScreenshot(reportLocation + '/TC55/Step 9-Click on span CreatedWithSketchEdge.png')

"Step 10: Click on span CreatedWithSketchInternet"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/span_CreatedWithSketchInternet'))

WebUI.takeScreenshot(reportLocation + '/TC55/Step 10-Click on span CreatedWithSketchInternet.png')

"Step 11: Click on div CreatedWithSketchEdge"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_CreatedWithSketchEdge'))

WebUI.takeScreenshot(reportLocation + '/TC55/Step 11-Click on div CreatedWithSketchEdge.png')

"Step 12: Click on div CreatedWithSketchLinux"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_CreatedWithSketchLinux'))

WebUI.takeScreenshot(reportLocation + '/TC55/Step 12-Click on div CreatedWithSketchLinux.png')

"Step 13: Click on div CreatedWithSketchMacOS"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_CreatedWithSketchMacOS'))

WebUI.takeScreenshot(reportLocation + '/TC55/Step 13-Click on div CreatedWithSketchMacOS.png')

"Step 14: Click on div CreatedWithSketchLinux2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_CreatedWithSketchLinux2'))

WebUI.takeScreenshot(reportLocation + '/TC55/Step 14-Click on div CreatedWithSketchLinux2.png')

"Step 15: Click on div CreatedWithSketchMacOS"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_CreatedWithSketchMacOS'))

WebUI.takeScreenshot(reportLocation + '/TC55/Step 15-Click on div CreatedWithSketchMacOS.png')

"Step 16: Click on div CreatedWithSketchLinux2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_CreatedWithSketchLinux2'))

WebUI.takeScreenshot(reportLocation + '/TC55/Step 16-Click on div CreatedWithSketchLinux2.png')

"Step 17: Click on div CreatedWithSketchMacOS"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_CreatedWithSketchMacOS'))

WebUI.takeScreenshot(reportLocation + '/TC55/Step 17-Click on div CreatedWithSketchMacOS.png')

"Step 18: Click on div CreatedWithSketchWindows"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_CreatedWithSketchWindows'))

WebUI.takeScreenshot(reportLocation + '/TC55/Step 18-Click on div CreatedWithSketchWindows.png')

"Step 19: Click on div CreatedWithSketchLinux2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_CreatedWithSketchLinux2'))

WebUI.takeScreenshot(reportLocation + '/TC55/Step 19-Click on div CreatedWithSketchLinux2.png')

"Step 20: Click on div ConfigureTestEnvironment"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_ConfigureTestEnvironment'))

WebUI.takeScreenshot(reportLocation + '/TC55/Step 20-Click on div ConfigureTestEnvironment.png')

"Step 21: Click on div ConfigureTestEnvironment"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_ConfigureTestEnvironment'))

WebUI.takeScreenshot(reportLocation + '/TC55/Step 21-Click on div ConfigureTestEnvironment.png')

"Step 22: Click on div ConfigureTestEnvironment"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_ConfigureTestEnvironment'))

WebUI.takeScreenshot(reportLocation + '/TC55/Step 22-Click on div ConfigureTestEnvironment.png')

"Step 23: Click on div ConfigureTestEnvironment"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_ConfigureTestEnvironment'))

WebUI.takeScreenshot(reportLocation + '/TC55/Step 23-Click on div ConfigureTestEnvironment.png')

"Step 24: Click on button Cancel"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_Cancel'))

WebUI.takeScreenshot(reportLocation + '/TC55/Step 24-Click on button Cancel.png')

"Step 25: Click on div SelectLocal"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_SelectLocal'))

WebUI.takeScreenshot(reportLocation + '/TC55/Step 25-Click on div SelectLocal.png')

"Step 26: Click on item MoreOptions"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/item_MoreOptions'))

WebUI.takeScreenshot(reportLocation + '/TC55/Step 26-Click on item MoreOptions.png')

"Step 27: Click on div SelectKubernetes"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_SelectKubernetes'))

WebUI.takeScreenshot(reportLocation + '/TC55/Step 27-Click on div SelectKubernetes.png')

"Step 28: Click on div MuiBoxRoot"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_MuiBoxRoot'))

WebUI.takeScreenshot(reportLocation + '/TC55/Step 28-Click on div MuiBoxRoot.png')

"Step 29: Click on div MuiBoxRoot2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_MuiBoxRoot2'))

WebUI.takeScreenshot(reportLocation + '/TC55/Step 29-Click on div MuiBoxRoot2.png')

"Step 30: Click on div Kubernetes"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_Kubernetes'))

WebUI.takeScreenshot(reportLocation + '/TC55/Step 30-Click on div Kubernetes.png')

"Step 31: Click on div SelectKubernetes"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_SelectKubernetes'))

WebUI.takeScreenshot(reportLocation + '/TC55/Step 31-Click on div SelectKubernetes.png')

"Step 32: Click on div ConfigureTestEnvironment"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_ConfigureTestEnvironment'))

WebUI.takeScreenshot(reportLocation + '/TC55/Step 32-Click on div ConfigureTestEnvironment.png')

"Step 33: Click on button Cancel"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_Cancel'))

WebUI.takeScreenshot(reportLocation + '/TC55/Step 33-Click on button Cancel.png')

"Step 34: Click on button CloseDialog -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_CloseDialog'))

WebUI.takeScreenshot(reportLocation + '/TC55/Step 34-Click on button CloseDialog - Navigate to page .png')

"Step 35: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC55-Schedule Test Run and Configure Environments_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}