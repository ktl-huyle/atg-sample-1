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

"Step 3: Navigate to team/*/project/*/test-project"

TrueTestScripts.navigate("team/${GlobalVariable.team_id}/project/${GlobalVariable.project_id}/test-project")

"Step 4: Click on td testProject (TestProject)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-project?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_project/td_testProject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_project/td_testProject', ['td_testProject_internalRoleCellName': td_testProject_internalRoleCellName]))

WebUI.takeScreenshot(reportLocation + '/TC62/Step 4-Click on td testProject TestProject.png')

"Step 5: Click on td testProject (TestProject)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-project?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_project/td_testProject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_project/td_testProject', ['td_testProject_internalRoleCellName': td_testProject_internalRoleCellName_1]))

WebUI.takeScreenshot(reportLocation + '/TC62/Step 5-Click on td testProject TestProject.png')

"Step 6: Click on link testProjects (TestProject) -> Navigate to page 'team/*/project/*/test-project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-project?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_project/link_testProjects"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_project/link_testProjects', ['link_testProjects_trNthChild': link_testProjects_trNthChild, 'link_testProjects_internalRoleLinkName': link_testProjects_internalRoleLinkName, 'team_id': team_id, 'project_id': project_id, 'test_project_id': test_project_id]))

WebUI.takeScreenshot(reportLocation + '/TC62/Step 6-Click on link testProjects TestProject - Navigate to page teamprojecttest-project.png')

"Step 7: Click on button RefreshScriptRepository"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_project/button_RefreshScriptRepository'))

WebUI.takeScreenshot(reportLocation + '/TC62/Step 7-Click on button RefreshScriptRepository.png')

"Step 8: Click on button object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_project/button_object'))

WebUI.takeScreenshot(reportLocation + '/TC62/Step 8-Click on button object.png')

"Step 9: Click on button ScheduleTestRun -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_project/button_ScheduleTestRun'))

WebUI.takeScreenshot(reportLocation + '/TC62/Step 9-Click on button ScheduleTestRun - Navigate to page teamproject.png')

"Step 10: Click on input Name"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_Name'))

WebUI.takeScreenshot(reportLocation + '/TC62/Step 10-Click on input Name.png')

"Step 11: Click on input Name"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_Name'))

WebUI.takeScreenshot(reportLocation + '/TC62/Step 11-Click on input Name.png')

"Step 12: Click on input Name"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_Name'))

WebUI.takeScreenshot(reportLocation + '/TC62/Step 12-Click on input Name.png')

"Step 13: Enter input value in input Name2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_team_project/input_Name'), input_Name2)

WebUI.takeScreenshot(reportLocation + '/TC62/Step 13-Enter input value in input Name2.png')

"Step 14: Click on button TestSuiteCollection"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_TestSuiteCollection'))

WebUI.takeScreenshot(reportLocation + '/TC62/Step 14-Click on button TestSuiteCollection.png')

"Step 15: Click on div EnvironmentConfigure"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_EnvironmentConfigure'))

WebUI.takeScreenshot(reportLocation + '/TC62/Step 15-Click on div EnvironmentConfigure.png')

"Step 16: Click on link ConfigureEnvironments"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_ConfigureEnvironments'))

WebUI.takeScreenshot(reportLocation + '/TC62/Step 16-Click on link ConfigureEnvironments.png')

"Step 17: Click on div Local"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_Local'))

WebUI.takeScreenshot(reportLocation + '/TC62/Step 17-Click on div Local.png')

"Step 18: Click on div ConfigureTestEnvironment"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_ConfigureTestEnvironment'))

WebUI.takeScreenshot(reportLocation + '/TC62/Step 18-Click on div ConfigureTestEnvironment.png')

"Step 19: Click on div SelectEnvironment2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_SelectEnvironment2'))

WebUI.takeScreenshot(reportLocation + '/TC62/Step 19-Click on div SelectEnvironment2.png')

"Step 20: Click on div CreatedWithSketchRadixIoTAgent1"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_CreatedWithSketchRadixIoTAgent1'))

WebUI.takeScreenshot(reportLocation + '/TC62/Step 20-Click on div CreatedWithSketchRadixIoTAgent1.png')

"Step 21: Click on button Save3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Save3'))

WebUI.takeScreenshot(reportLocation + '/TC62/Step 21-Click on button Save3.png')

"Step 22: Click on button Run"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Run'))

WebUI.takeScreenshot(reportLocation + '/TC62/Step 22-Click on button Run.png')

"Step 23: Click on link ConfigureEnvironments"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_ConfigureEnvironments'))

WebUI.takeScreenshot(reportLocation + '/TC62/Step 23-Click on link ConfigureEnvironments.png')

"Step 24: Click on div SelectContainer"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_SelectContainer'))

WebUI.takeScreenshot(reportLocation + '/TC62/Step 24-Click on div SelectContainer.png')

"Step 25: Click on div CreatedWithSketchRadixIoTAgent12"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_CreatedWithSketchRadixIoTAgent12'))

WebUI.takeScreenshot(reportLocation + '/TC62/Step 25-Click on div CreatedWithSketchRadixIoTAgent12.png')

"Step 26: Click on button Cancel"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Cancel'))

WebUI.takeScreenshot(reportLocation + '/TC62/Step 26-Click on button Cancel.png')

"Step 27: Click on div ClearIcon"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_ClearIcon'))

WebUI.takeScreenshot(reportLocation + '/TC62/Step 27-Click on div ClearIcon.png')

"Step 28: Click on link ConfigureEnvironments"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_ConfigureEnvironments'))

WebUI.takeScreenshot(reportLocation + '/TC62/Step 28-Click on link ConfigureEnvironments.png')

"Step 29: Click on div Kubernetes"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_Kubernetes'))

WebUI.takeScreenshot(reportLocation + '/TC62/Step 29-Click on div Kubernetes.png')

"Step 30: Click on div Local2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_Local2'))

WebUI.takeScreenshot(reportLocation + '/TC62/Step 30-Click on div Local2.png')

"Step 31: Click on div ConfigureTestEnvironment"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_ConfigureTestEnvironment'))

WebUI.takeScreenshot(reportLocation + '/TC62/Step 31-Click on div ConfigureTestEnvironment.png')

"Step 32: Click on button Cancel"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Cancel'))

WebUI.takeScreenshot(reportLocation + '/TC62/Step 32-Click on button Cancel.png')

"Step 33: Click on button CloseDialog"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_CloseDialog'))

WebUI.takeScreenshot(reportLocation + '/TC62/Step 33-Click on button CloseDialog.png')

"Step 34: Click on button AlertButton (AlertButton6)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_AlertButton"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_AlertButton', ['button_AlertButton_class': button_AlertButton_class]))

WebUI.takeScreenshot(reportLocation + '/TC62/Step 34-Click on button AlertButton AlertButton6.png')

"Step 35: Click on span Settings4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/span_Settings'))

WebUI.takeScreenshot(reportLocation + '/TC62/Step 35-Click on span Settings4.png')

"Step 36: Click on link OrganizationSetup -> Navigate to page 'organization/*/settings/agent'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_OrganizationSetup'))

WebUI.takeScreenshot(reportLocation + '/TC62/Step 36-Click on link OrganizationSetup - Navigate to page organizationsettingsagent.png')

"Step 37: Click on link AgentSetup -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/agent?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_agent/link_AgentSetup'))

WebUI.takeScreenshot(reportLocation + '/TC62/Step 37-Click on link AgentSetup - Navigate to page teamproject.png')

"Step 38: Click on button ScheduleTestRun"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_ScheduleTestRun'))

WebUI.takeScreenshot(reportLocation + '/TC62/Step 38-Click on button ScheduleTestRun.png')

"Step 39: Click on input Name"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_Name'))

WebUI.takeScreenshot(reportLocation + '/TC62/Step 39-Click on input Name.png')

"Step 40: Click on input Name"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_Name'))

WebUI.takeScreenshot(reportLocation + '/TC62/Step 40-Click on input Name.png')

"Step 41: Click on input Name"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_Name'))

WebUI.takeScreenshot(reportLocation + '/TC62/Step 41-Click on input Name.png')

"Step 42: Enter input value in input Name2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_team_project/input_Name'), input_Name2_1)

WebUI.takeScreenshot(reportLocation + '/TC62/Step 42-Enter input value in input Name2.png')

"Step 43: Click on button TestSuiteCollection"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_TestSuiteCollection'))

WebUI.takeScreenshot(reportLocation + '/TC62/Step 43-Click on button TestSuiteCollection.png')

"Step 44: Click on div TestSuitesEPPs"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_TestSuitesEPPs'))

WebUI.takeScreenshot(reportLocation + '/TC62/Step 44-Click on div TestSuitesEPPs.png')

"Step 45: Click on div TestSuitesEPPs2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_TestSuitesEPPs2'))

WebUI.takeScreenshot(reportLocation + '/TC62/Step 45-Click on div TestSuitesEPPs2.png')

"Step 46: Click on div TestSuitesEPPs"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_TestSuitesEPPs'))

WebUI.takeScreenshot(reportLocation + '/TC62/Step 46-Click on div TestSuitesEPPs.png')

"Step 47: Click on div TestSuitesEPPs2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_TestSuitesEPPs2'))

WebUI.takeScreenshot(reportLocation + '/TC62/Step 47-Click on div TestSuitesEPPs2.png')

"Step 48: Click on link ConfigureEnvironments"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_ConfigureEnvironments'))

WebUI.takeScreenshot(reportLocation + '/TC62/Step 48-Click on link ConfigureEnvironments.png')

"Step 49: Click on div TestCloudName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_TestCloudName'))

WebUI.takeScreenshot(reportLocation + '/TC62/Step 49-Click on div TestCloudName.png')

"Step 50: Click on input RadioButton"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_RadioButton'))

WebUI.takeScreenshot(reportLocation + '/TC62/Step 50-Click on input RadioButton.png')

"Step 51: Click on div ConfigureTestEnvironment"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_ConfigureTestEnvironment'))

WebUI.takeScreenshot(reportLocation + '/TC62/Step 51-Click on div ConfigureTestEnvironment.png')

"Step 52: Click on div CreatedWithSketch3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_CreatedWithSketch3'))

WebUI.takeScreenshot(reportLocation + '/TC62/Step 52-Click on div CreatedWithSketch3.png')

"Step 53: Click on button Save3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Save3'))

WebUI.takeScreenshot(reportLocation + '/TC62/Step 53-Click on button Save3.png')

"Step 54: Click on button Run"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Run'))

WebUI.takeScreenshot(reportLocation + '/TC62/Step 54-Click on button Run.png')

"Step 55: Click on link ViewEPPs -> Navigate to page 'team/*/project/*/test-runs'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_ViewEPPs'))

WebUI.takeScreenshot(reportLocation + '/TC62/Step 55-Click on link ViewEPPs - Navigate to page teamprojecttest-runs.png')

"Step 56: Click on header testRun (EPPsAutomationTestCaseRun3) -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/header_testRun"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/header_testRun', ['header_testRun_internalRoleHeadingName': header_testRun_internalRoleHeadingName]))

WebUI.takeScreenshot(reportLocation + '/TC62/Step 56-Click on header testRun EPPsAutomationTestCaseRun3 - Navigate to page .png')

"Step 57: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC62-Schedule Test Run in Test Project_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}