import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import com.kms.katalon.core.configuration.RunConfiguration
import truetest.custom.TrueTestScripts
import truetest.common.viewThumbnailImagesAndClose

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

"Step 3: Navigate to team/{*}/project/{*}/executions/{*}"

TrueTestScripts.navigate("team/{*}/project/{*}/executions/{*}")

"Step 4: Click on div failedPrerequisites (failedCreateReverse)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/executions/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/div_failedPrerequisites"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/div_failedPrerequisites', ['div_failedPrerequisites_class': div_failedPrerequisites_class, 'div_failedPrerequisites_internalRoleButtonName': div_failedPrerequisites_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC184/Step 4-Click on div failedPrerequisites failedCreateReverse.png')

"Step 5: Click on div failedQueries (failedQueryIndex)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/executions/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/div_failedQueries"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/div_failedQueries', ['div_failedQueries_class': div_failedQueries_class, 'div_failedQueries_internalRoleButtonName': div_failedQueries_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC184/Step 5-Click on div failedQueries failedQueryIndex.png')

"Step 6: Click on div failedQueries (failedFilterClaims)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/executions/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/div_failedQueries"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/div_failedQueries', ['div_failedQueries_class': div_failedQueries_class_1, 'div_failedQueries_internalRoleButtonName': div_failedQueries_internalRoleButtonName_1]))

WebUI.takeScreenshot(reportLocation + '/TC184/Step 6-Click on div failedQueries failedFilterClaims.png')

"Step 7: View thumbnail images and close the image viewer multiple times"

viewThumbnailImagesAndClose.execute(data_path_0, Integer.valueOf(index_0))

"Step 8: Click on button Close3 -> Navigate to page 'organization home#organization/{*}/home'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/executions/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_Close3'))

WebUI.takeScreenshot(reportLocation + '/TC184/Step 8-Click on button Close3 - Navigate to page organization homeorganizationhome.png')

"Step 9: Click on link TestExecution 750"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'organization/{.*}/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_home/link_TestExecution_750'))

WebUI.takeScreenshot(reportLocation + '/TC184/Step 9-Click on link TestExecution 750.png')

"Step 10: Click on link testExecution (TestExecution2) -> Navigate to page 'team project executions#team/{*}/project/{*}/executions/{*}'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'organization/{.*}/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/link_testExecution"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/link_testExecution', ['link_testExecution_nthChild': link_testExecution_nthChild, 'link_testExecution_class': link_testExecution_class, 'link_testExecution_internalRoleLinkName': link_testExecution_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC184/Step 10-Click on link testExecution TestExecution2 - Navigate to page team project executionsteamprojectexecutions.png')

"Step 11: Click on div failedQueries (failedCreateReverse2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/executions/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/div_failedQueries"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/div_failedQueries', ['div_failedQueries_class': div_failedQueries_class_2, 'div_failedQueries_internalRoleButtonName': div_failedQueries_internalRoleButtonName_2]))

WebUI.takeScreenshot(reportLocation + '/TC184/Step 11-Click on div failedQueries failedCreateReverse2.png')

"Step 12: View thumbnail images and close the image viewer multiple times"

viewThumbnailImagesAndClose.execute(data_path_1, Integer.valueOf(index_1))

"Step 13: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC184-Navigate and view failed test queries and images in project executions_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}