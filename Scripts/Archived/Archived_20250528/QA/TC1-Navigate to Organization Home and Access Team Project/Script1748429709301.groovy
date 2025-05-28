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

"Step 1: Navigate to /organization/*/home"

TrueTestScripts.navigate("/organization/${organization_id}/home")

"Step 2: Click on button selectOrganization"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20250528/QA/Page_organization_home/button_selectOrganization'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 2-Click on button selectOrganization.png')

"Step 3: Click on div object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20250528/QA/Page_organization_home/div_object'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 3-Click on div object.png')

"Step 4: Click on div welcomeMessage"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20250528/QA/Page_organization_home/div_welcomeMessage'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 4-Click on div welcomeMessage.png')

"Step 5: Click on link spScheduleProject -> Navigate to page '/team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20250528/QA/Page_organization_home/link_spScheduleProject'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 5-Click on link spScheduleProject - Navigate to page teamproject.png')

"Step 6: Click on link executions -> Navigate to page '/team/*/project/*/test-runs'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20250528/QA/Page_team_project/link_executions'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 6-Click on link executions - Navigate to page teamprojecttest-runs.png')

"Step 7: Click on span selectOrganization"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20250528/QA/Page_team_project_test_runs/span_selectOrganization'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 7-Click on span selectOrganization.png')

"Step 8: Click on div katalonTestCloud -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20250528/QA/Page_team_project_test_runs/div_katalonTestCloud'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 8-Click on div katalonTestCloud - Navigate to page .png')

"Step 9: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC1-Navigate to Organization Home and Access Team Project_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}