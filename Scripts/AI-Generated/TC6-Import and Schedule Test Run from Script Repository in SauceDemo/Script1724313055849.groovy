import katalon.truetest.TrueTestScripts
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import internal.GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI


'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to team/*/project/*"

TrueTestScripts.navigate("team/${GlobalVariable.team_id}/project/${GlobalVariable.project_id}")

"Step 2: Click on link teamSettings -> Navigate to page 'team/*/project/*/settings'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_teamSettings'))

WebUI.takeScreenshot()

"Step 3: Click on link scriptRepositories -> Navigate to page '/team/320312/project/434641/test-project'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/settings?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_settings/link_scriptRepositories'))

WebUI.takeScreenshot()

"Step 4: Click on button typeAll"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/320312/project/434641/test-project?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_teamprojecttest_project/button_typeAll'))

WebUI.takeScreenshot()

"Step 5: Click on link teamImportScriptRepository"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/320312/project/434641/test-project?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_teamprojecttest_project/link_teamImportScriptRepository'))

WebUI.takeScreenshot()

"Step 6: Click on link teamZipRepo -> Navigate to page 'team/*/project/*/test-project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/320312/project/434641/test-project?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_teamprojecttest_project/link_teamZipRepo'))

WebUI.takeScreenshot()

"Step 7: Click on button edit"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_project/button_edit'))

WebUI.takeScreenshot()

"Step 8: Click on button refreshScriptRepository"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_project/button_refreshScriptRepository'))

WebUI.takeScreenshot()

"Step 9: Click on button cancel"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_project/button_cancel'))

WebUI.takeScreenshot()

"Step 10: Click on button scheduleTestRun -> Navigate to page '/team/320312/project/434641/test-planning'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_project/button_scheduleTestRun'))

WebUI.takeScreenshot()

"Step 11: Click on button closeDialog"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/320312/project/434641/test-planning?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_teamprojecttest_planning/button_closeDialog'))

WebUI.takeScreenshot()

"Step 12: Click on link teamSchedules -> Navigate to page 'team/*/project/*/grid'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/320312/project/434641/test-planning?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_teamprojecttest_planning/link_teamSchedules'))

WebUI.takeScreenshot()

"Step 13: Click on button scriptRepositoryAll -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid/button_scriptRepositoryAll'))

WebUI.takeScreenshot()

"Step 14: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC6-Import and Schedule Test Run from Script Repository in SauceDemo_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}