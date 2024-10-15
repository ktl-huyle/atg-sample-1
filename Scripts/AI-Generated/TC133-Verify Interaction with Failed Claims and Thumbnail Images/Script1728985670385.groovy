import truetest.custom.TrueTestScripts
import truetest.common.thumbnailImageInteractionAndErrorHandling
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.configuration.RunConfiguration
import internal.GlobalVariable
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

"Step 3: Navigate to /team/*/project/*/executions/*"

TrueTestScripts.navigate("/team/${GlobalVariable.team_id}/project/${GlobalVariable.project_id}/executions/${GlobalVariable.executions_id}")

"Step 4: Click on div failedPreRequisites (failedCreateReverse)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/div_failedPreRequisites"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/div_failedPreRequisites', ['div_failedPreRequisites_class': div_failedPreRequisites_class, 'div_failedPreRequisites_internalRoleButtonName': div_failedPreRequisites_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC133/Step 4-Click on div failedPreRequisites failedCreateReverse.png')

"Step 5: Click on div failedClaims (failedQueryIndex)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/div_failedClaims"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/div_failedClaims', ['div_failedClaims_class': div_failedClaims_class, 'div_failedClaims_internalRoleButtonName': div_failedClaims_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC133/Step 5-Click on div failedClaims failedQueryIndex.png')

"Step 6: Click on div failedClaims (failedFilterClaims)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/div_failedClaims"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/div_failedClaims', ['div_failedClaims_class': div_failedClaims_class_1, 'div_failedClaims_internalRoleButtonName': div_failedClaims_internalRoleButtonName_1]))

WebUI.takeScreenshot(reportLocation + '/TC133/Step 6-Click on div failedClaims failedFilterClaims.png')

"Step 7: Interact with thumbnail images and handle errors"

thumbnailImageInteractionAndErrorHandling.execute(data_path_0, Integer.valueOf(index_0))

"Step 8: Click on button Close3 -> Navigate to page '/organization/*/home'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_Close3'))

WebUI.takeScreenshot(reportLocation + '/TC133/Step 8-Click on button Close3 - Navigate to page organizationhome.png')

"Step 9: Click on link TestExecution 750"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_home/link_TestExecution_750'))

WebUI.takeScreenshot(reportLocation + '/TC133/Step 9-Click on link TestExecution 750.png')

"Step 10: Click on link testItems (TestExecution2) -> Navigate to page '/team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/link_testItems"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/link_testItems', ['link_testItems_class': link_testItems_class, 'link_testItems_nthChild': link_testItems_nthChild, 'link_testItems_internalRoleLinkName': link_testItems_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC133/Step 10-Click on link testItems TestExecution2 - Navigate to page teamprojectexecutions.png')

"Step 11: Click on div failedClaims (failedCreateReverse2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/div_failedClaims"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/div_failedClaims', ['div_failedClaims_class': div_failedClaims_class_2, 'div_failedClaims_internalRoleButtonName': div_failedClaims_internalRoleButtonName_2]))

WebUI.takeScreenshot(reportLocation + '/TC133/Step 11-Click on div failedClaims failedCreateReverse2.png')

"Step 12: Interact with thumbnail images and handle errors"

thumbnailImageInteractionAndErrorHandling.execute(data_path_1, Integer.valueOf(index_1))

"Step 13: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC133-Verify Interaction with Failed Claims and Thumbnail Images_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}