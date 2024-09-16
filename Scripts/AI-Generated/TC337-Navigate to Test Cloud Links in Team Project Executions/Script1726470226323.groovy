import katalon.truetest.TrueTestScripts
import internal.GlobalVariable
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
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

"Step 3: Navigate to organization/*/home"

TrueTestScripts.navigate("organization/${GlobalVariable.organization_id}/home")

"Step 4: Click on link dynamicObject (561NdevTeamDipoStar) -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/link_dynamicObject_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/link_dynamicObject_1', ['link_dynamicObject_nthChild': link_dynamicObject_nthChild, 'link_dynamicObject_class': link_dynamicObject_class, 'link_dynamicObject_internalRoleLinkName': link_dynamicObject_internalRoleLinkName, 'link_dynamicObject_executions_id': link_dynamicObject_executions_id, 'link_dynamicObject_team_id': link_dynamicObject_team_id, 'link_dynamicObject_project_id': link_dynamicObject_project_id]))

WebUI.takeScreenshot(reportLocation + '/TC337/Step 4-Click on link dynamicObject 561NdevTeamDipoStar - Navigate to page teamprojectexecutions.png')

"Step 5: Click on link object3 -> Navigate to page 'team/*/project/*/grid/plan/*/job/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_object3'))

WebUI.takeScreenshot(reportLocation + '/TC337/Step 5-Click on link object3 - Navigate to page teamprojectgridplanjob.png')

"Step 6: Click on link testCloudWindowsChrome -> Navigate to page 'team/*/project/*/agent/test-cloud/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid/plan/.*/job/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid_plan_job/link_testCloudWindowsChrome'))

WebUI.takeScreenshot(reportLocation + '/TC337/Step 6-Click on link testCloudWindowsChrome - Navigate to page teamprojectagenttest-cloud.png')

"Step 7: Click on link dynamicObject (page4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/agent/test-cloud/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_agent_test_cloud/link_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_agent_test_cloud/link_dynamicObject', ['link_dynamicObject_liNthChild': link_dynamicObject_liNthChild, 'link_dynamicObject_internalLabel': link_dynamicObject_internalLabel]))

WebUI.takeScreenshot(reportLocation + '/TC337/Step 7-Click on link dynamicObject page4.png')

"Step 8: Click on link dynamicObject (page3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/agent/test-cloud/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_agent_test_cloud/link_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_agent_test_cloud/link_dynamicObject', ['link_dynamicObject_liNthChild': link_dynamicObject_liNthChild_1]))

WebUI.takeScreenshot(reportLocation + '/TC337/Step 8-Click on link dynamicObject page3.png')

"Step 9: Click on link dynamicObject (page2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/agent/test-cloud/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_agent_test_cloud/link_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_agent_test_cloud/link_dynamicObject', ['link_dynamicObject_liNthChild': link_dynamicObject_liNthChild_2, 'link_dynamicObject_internalLabel': link_dynamicObject_internalLabel_1]))

WebUI.takeScreenshot(reportLocation + '/TC337/Step 9-Click on link dynamicObject page2.png')

"Step 10: Click on link dynamicObject (page1)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/agent/test-cloud/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_agent_test_cloud/link_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_agent_test_cloud/link_dynamicObject', ['link_dynamicObject_liNthChild': link_dynamicObject_liNthChild_3, 'link_dynamicObject_internalLabel': link_dynamicObject_internalLabel_2]))

WebUI.takeScreenshot(reportLocation + '/TC337/Step 10-Click on link dynamicObject page1.png')

"Step 11: Click on link dynamicObject (page2) -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/agent/test-cloud/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_agent_test_cloud/link_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_agent_test_cloud/link_dynamicObject', ['link_dynamicObject_liNthChild': link_dynamicObject_liNthChild_4, 'link_dynamicObject_internalLabel': link_dynamicObject_internalLabel_3]))

WebUI.takeScreenshot(reportLocation + '/TC337/Step 11-Click on link dynamicObject page2 - Navigate to page .png')

"Step 12: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC337-Navigate to Test Cloud Links in Team Project Executions_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}