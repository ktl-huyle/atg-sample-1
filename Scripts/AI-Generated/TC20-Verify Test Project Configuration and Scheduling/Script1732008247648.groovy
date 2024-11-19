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

"Step 3: Navigate to team/*/project/*/test-project"

TrueTestScripts.navigate("team/*/project/*/test-project")

"Step 4: Click on td testingResources (EncompassOpsTestAutomation)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-project?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_project/td_testingResources"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_project/td_testingResources', ['td_testingResources_internalRoleCellName': td_testingResources_internalRoleCellName]))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 4-Click on td testingResources EncompassOpsTestAutomation.png')

"Step 5: Click on td testingResources (EncompassOpsTestAutomation)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-project?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_project/td_testingResources"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_project/td_testingResources', ['td_testingResources_internalRoleCellName': td_testingResources_internalRoleCellName_1]))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 5-Click on td testingResources EncompassOpsTestAutomation.png')

"Step 6: Click on link testingResources (EncompassOpsTestAutomation) -> Navigate to page 'team/*/project/*/test-project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-project?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_project/link_testingResources"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_project/link_testingResources', ['link_testingResources_trNthChild': link_testingResources_trNthChild, 'link_testingResources_internalRoleLinkName': link_testingResources_internalRoleLinkName, 'test_project_id': test_project_id, 'project_id': project_id, 'team_id': team_id]))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 6-Click on link testingResources EncompassOpsTestAutomation - Navigate to page teamprojecttest-project.png')

"Step 7: Click on button RefreshScriptRepository"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_project/button_RefreshScriptRepository'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 7-Click on button RefreshScriptRepository.png')

"Step 8: Click on button Close"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_project/button_Close'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 8-Click on button Close.png')

"Step 9: Click on button ScheduleTestRun2 -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_project/button_ScheduleTestRun2'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 9-Click on button ScheduleTestRun2 - Navigate to page teamproject.png')

"Step 10: Click on input Name3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_Name3'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 10-Click on input Name3.png')

"Step 11: Click on input Name3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_Name3'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 11-Click on input Name3.png')

"Step 12: Click on input Name3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_Name3'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 12-Click on input Name3.png')

"Step 13: Enter input value in input Name3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_team_project/input_Name3'), input_Name3)

WebUI.takeScreenshot(reportLocation + '/TC20/Step 13-Enter input value in input Name3.png')

"Step 14: Click on button TestSuiteCollection"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_TestSuiteCollection'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 14-Click on button TestSuiteCollection.png')

"Step 15: Click on div EnvironmentConfigure"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_EnvironmentConfigure'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 15-Click on div EnvironmentConfigure.png')

"Step 16: Click on link ConfigureEnvironments"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_ConfigureEnvironments'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 16-Click on link ConfigureEnvironments.png')

"Step 17: Click on div Local"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_Local'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 17-Click on div Local.png')

"Step 18: Click on div ConfigureTestEnvironment"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_ConfigureTestEnvironment'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 18-Click on div ConfigureTestEnvironment.png')

"Step 19: Click on div SelectEnvironment2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_SelectEnvironment2'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 19-Click on div SelectEnvironment2.png')

"Step 20: Click on div CreatedWithSketchRadixIoTAgent1"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_CreatedWithSketchRadixIoTAgent1'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 20-Click on div CreatedWithSketchRadixIoTAgent1.png')

"Step 21: Click on button Save"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Save_1'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 21-Click on button Save.png')

"Step 22: Click on button Run2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Run2'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 22-Click on button Run2.png')

"Step 23: Click on link ConfigureEnvironments2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_ConfigureEnvironments2'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 23-Click on link ConfigureEnvironments2.png')

"Step 24: Click on div SelectContainer"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_SelectContainer'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 24-Click on div SelectContainer.png')

"Step 25: Click on div CreatedWithSketchRadixIoTAgent12"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_CreatedWithSketchRadixIoTAgent12'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 25-Click on div CreatedWithSketchRadixIoTAgent12.png')

"Step 26: Click on button Cancel"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Cancel'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 26-Click on button Cancel.png')

"Step 27: Click on div ClearIcon"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_ClearIcon'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 27-Click on div ClearIcon.png')

"Step 28: Click on link ConfigureEnvironments2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_ConfigureEnvironments2'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 28-Click on link ConfigureEnvironments2.png')

"Step 29: Click on div Kubernetes"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_Kubernetes'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 29-Click on div Kubernetes.png')

"Step 30: Click on div Local2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_Local2'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 30-Click on div Local2.png')

"Step 31: Click on div ConfigureTestEnvironment2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_ConfigureTestEnvironment2'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 31-Click on div ConfigureTestEnvironment2.png')

"Step 32: Click on button Cancel"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Cancel'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 32-Click on button Cancel.png')

"Step 33: Click on button CloseDialog"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_CloseDialog'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 33-Click on button CloseDialog.png')

"Step 34: Click on button closeActions (CloseButton)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_closeActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_closeActions', ['button_closeActions_class': button_closeActions_class]))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 34-Click on button closeActions CloseButton.png')

"Step 35: Click on span Settings2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/span_Settings2'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 35-Click on span Settings2.png')

"Step 36: Click on link OrganizationSetupConfigure -> Navigate to page 'organization/*/settings/agent'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_OrganizationSetupConfigure'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 36-Click on link OrganizationSetupConfigure - Navigate to page organizationsettingsagent.png')

"Step 37: Click on link AgentSetup -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/agent?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_agent/link_AgentSetup'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 37-Click on link AgentSetup - Navigate to page teamproject.png')

"Step 38: Click on button ScheduleTestRun"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_ScheduleTestRun'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 38-Click on button ScheduleTestRun.png')

"Step 39: Click on input Name3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_Name3'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 39-Click on input Name3.png')

"Step 40: Click on input Name3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_Name3'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 40-Click on input Name3.png')

"Step 41: Click on input Name3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_Name3'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 41-Click on input Name3.png')

"Step 42: Enter input value in input Name3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_team_project/input_Name3'), input_Name3_1)

WebUI.takeScreenshot(reportLocation + '/TC20/Step 42-Enter input value in input Name3.png')

"Step 43: Click on button TestSuiteCollection"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_TestSuiteCollection'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 43-Click on button TestSuiteCollection.png')

"Step 44: Click on div TestSuitesEPPs"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_TestSuitesEPPs'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 44-Click on div TestSuitesEPPs.png')

"Step 45: Click on div TestSuitesEPPs2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_TestSuitesEPPs2'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 45-Click on div TestSuitesEPPs2.png')

"Step 46: Click on div TestSuitesEPPs"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_TestSuitesEPPs'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 46-Click on div TestSuitesEPPs.png')

"Step 47: Click on div TestSuitesEPPs2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_TestSuitesEPPs2'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 47-Click on div TestSuitesEPPs2.png')

"Step 48: Click on link ConfigureEnvironments"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_ConfigureEnvironments'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 48-Click on link ConfigureEnvironments.png')

"Step 49: Click on div TestCloudName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_TestCloudName'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 49-Click on div TestCloudName.png')

"Step 50: Click on input RadioButtonA"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_RadioButtonA'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 50-Click on input RadioButtonA.png')

"Step 51: Click on div ConfigureTestEnvironment"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_ConfigureTestEnvironment'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 51-Click on div ConfigureTestEnvironment.png')

"Step 52: Click on div CreatedWithSketch"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_CreatedWithSketch'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 52-Click on div CreatedWithSketch.png')

"Step 53: Click on button Save"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Save_1'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 53-Click on button Save.png')

"Step 54: Click on button Run2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Run2'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 54-Click on button Run2.png')

"Step 55: Click on link ViewEPPsAutomationTest -> Navigate to page 'team/*/project/*/test-runs'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_ViewEPPsAutomationTest'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 55-Click on link ViewEPPsAutomationTest - Navigate to page teamprojecttest-runs.png')

"Step 56: Click on header testRunDetails (EPPsAutomationTestCaseRun) -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/header_testRunDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/header_testRunDetails', ['header_testRunDetails_internalRoleHeadingName': header_testRunDetails_internalRoleHeadingName]))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 56-Click on header testRunDetails EPPsAutomationTestCaseRun - Navigate to page .png')

"Step 57: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC20-Verify Test Project Configuration and Scheduling_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}