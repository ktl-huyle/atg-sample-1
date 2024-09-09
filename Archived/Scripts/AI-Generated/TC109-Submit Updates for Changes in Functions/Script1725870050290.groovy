import katalon.truetest.TrueTestScripts
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.configuration.RunConfiguration
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import internal.GlobalVariable
import katalon.common.submitFunctionUpdates

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

"Step 3: Navigate to team/*/project/*/executions/*"

TrueTestScripts.navigate("team/${GlobalVariable.team_id}/project/${GlobalVariable.project_id}/executions/${GlobalVariable.executions_id}")

"Step 4: Click on div needReviewSortIdascendingSummaryAssertions"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_needReviewSortIdascendingSummaryAssertions'))

WebUI.takeScreenshot(reportLocation + '/TC109/Step 4-Click on div needReviewSortIdascendingSummaryAssertions.png')

"Step 5: Click on pre object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/pre_object'))

WebUI.takeScreenshot(reportLocation + '/TC109/Step 5-Click on pre object.png')

"Step 6: Click on div customFieldsAddNew"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_customFieldsAddNew'))

WebUI.takeScreenshot(reportLocation + '/TC109/Step 6-Click on div customFieldsAddNew.png')

"Step 7: Click on link addNew"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_addNew'))

WebUI.takeScreenshot(reportLocation + '/TC109/Step 7-Click on link addNew.png')

"Step 8: Click on input displayName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/input_displayName'))

WebUI.takeScreenshot(reportLocation + '/TC109/Step 8-Click on input displayName.png')

"Step 9: Click on button close2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_close2'))

WebUI.takeScreenshot(reportLocation + '/TC109/Step 9-Click on button close2.png')

"Step 10: Click on button close2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_close2'))

WebUI.takeScreenshot(reportLocation + '/TC109/Step 10-Click on button close2.png')

"Step 11: Click on link addNew"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_addNew'))

WebUI.takeScreenshot(reportLocation + '/TC109/Step 11-Click on link addNew.png')

"Step 12: Click on input displayName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/input_displayName'))

WebUI.takeScreenshot(reportLocation + '/TC109/Step 12-Click on input displayName.png')

"Step 13: Click on div object3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_object'))

WebUI.takeScreenshot(reportLocation + '/TC109/Step 13-Click on div object3.png')

"Step 14: Click on button close2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_close2'))

WebUI.takeScreenshot(reportLocation + '/TC109/Step 14-Click on button close2.png')

"Step 15: Click on span checkPassTeam"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/span_checkPassTeam'))

WebUI.takeScreenshot(reportLocation + '/TC109/Step 15-Click on span checkPassTeam.png')

"Step 16: Click on div reactSelectControl"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_reactSelectControl'))

WebUI.takeScreenshot(reportLocation + '/TC109/Step 16-Click on div reactSelectControl.png')

"Step 17: Click on button open"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_open'))

WebUI.takeScreenshot(reportLocation + '/TC109/Step 17-Click on button open.png')

"Step 18: Click on list projectTeamReleaseTeamTa"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/list_projectTeamReleaseTeamTa'))

WebUI.takeScreenshot(reportLocation + '/TC109/Step 18-Click on list projectTeamReleaseTeamTa.png')

"Step 19: Click on item taTeam"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/item_taTeam'))

WebUI.takeScreenshot(reportLocation + '/TC109/Step 19-Click on item taTeam.png')

"Step 20: Click on button add"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_add'))

WebUI.takeScreenshot(reportLocation + '/TC109/Step 20-Click on button add.png')

"Step 21: Click on link addNew"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_addNew'))

WebUI.takeScreenshot(reportLocation + '/TC109/Step 21-Click on link addNew.png')

"Step 22: Click on input displayName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/input_displayName'))

WebUI.takeScreenshot(reportLocation + '/TC109/Step 22-Click on input displayName.png')

"Step 23: Click on span checkPassTeam"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/span_checkPassTeam'))

WebUI.takeScreenshot(reportLocation + '/TC109/Step 23-Click on span checkPassTeam.png')

"Step 24: Click on div reactSelectControl"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_reactSelectControl'))

WebUI.takeScreenshot(reportLocation + '/TC109/Step 24-Click on div reactSelectControl.png')

"Step 25: Click on div reactSelectControl"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_reactSelectControl'))

WebUI.takeScreenshot(reportLocation + '/TC109/Step 25-Click on div reactSelectControl.png')

"Step 26: Click on button open"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_open'))

WebUI.takeScreenshot(reportLocation + '/TC109/Step 26-Click on button open.png')

"Step 27: Click on div thumbnailImage2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_thumbnailImage2'))

WebUI.takeScreenshot(reportLocation + '/TC109/Step 27-Click on div thumbnailImage2.png')

"Step 28: Click on button close"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_close'))

WebUI.takeScreenshot(reportLocation + '/TC109/Step 28-Click on button close.png')

"Step 29: Click on input value"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/input_value'))

WebUI.takeScreenshot(reportLocation + '/TC109/Step 29-Click on input value.png')

"Step 30: Click on span objectError"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/span_objectError'))

WebUI.takeScreenshot(reportLocation + '/TC109/Step 30-Click on span objectError.png')

"Step 31: Click on button add2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_add2'))

WebUI.takeScreenshot(reportLocation + '/TC109/Step 31-Click on button add2.png')

"Step 32: Submit updates for functions with changes"

submitFunctionUpdates.execute()

"Step 33: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC109-Submit Updates for Changes in Functions_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}