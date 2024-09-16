import internal.GlobalVariable
import katalon.truetest.TrueTestScripts
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import katalon.common.submitThumbnailUpdates
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.configuration.RunConfiguration

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

WebUI.takeScreenshot(reportLocation + '/TC442/Step 4-Click on div needReviewSortIdascendingSummaryAssertions.png')

"Step 5: Click on pre failedVerifications (failedC2772372)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/pre_failedVerifications"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/pre_failedVerifications', ['pre_failedVerifications_class': pre_failedVerifications_class, 'pre_failedVerifications_internalRoleButtonName': pre_failedVerifications_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC442/Step 5-Click on pre failedVerifications failedC2772372.png')

"Step 6: Click on div customFieldsAddNew"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_customFieldsAddNew'))

WebUI.takeScreenshot(reportLocation + '/TC442/Step 6-Click on div customFieldsAddNew.png')

"Step 7: Click on link addNew"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_addNew'))

WebUI.takeScreenshot(reportLocation + '/TC442/Step 7-Click on link addNew.png')

"Step 8: Click on input displayName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/input_displayName'))

WebUI.takeScreenshot(reportLocation + '/TC442/Step 8-Click on input displayName.png')

"Step 9: Click on button close4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_close4'))

WebUI.takeScreenshot(reportLocation + '/TC442/Step 9-Click on button close4.png')

"Step 10: Click on button open"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_open'))

WebUI.takeScreenshot(reportLocation + '/TC442/Step 10-Click on button open.png')

"Step 11: Click on link addNew"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_addNew'))

WebUI.takeScreenshot(reportLocation + '/TC442/Step 11-Click on link addNew.png')

"Step 12: Click on input displayName2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/input_displayName2'))

WebUI.takeScreenshot(reportLocation + '/TC442/Step 12-Click on input displayName2.png')

"Step 13: Click on div failedQueries (object14)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/div_failedQueries"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/div_failedQueries', ['div_failedQueries_class': div_failedQueries_class, 'div_failedQueries_internalRoleButtonName': div_failedQueries_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC442/Step 13-Click on div failedQueries object14.png')

"Step 14: Click on button open2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_open2'))

WebUI.takeScreenshot(reportLocation + '/TC442/Step 14-Click on button open2.png')

"Step 15: Click on span errorDetails (checkPassTeam)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/span_errorDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/span_errorDetails', ['span_errorDetails_option': span_errorDetails_option, 'span_errorDetails_mui': span_errorDetails_mui, 'span_errorDetails_internalText': span_errorDetails_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC442/Step 15-Click on span errorDetails checkPassTeam.png')

"Step 16: Click on div reactSelectControl"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_reactSelectControl'))

WebUI.takeScreenshot(reportLocation + '/TC442/Step 16-Click on div reactSelectControl.png')

"Step 17: Click on button open3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_open3'))

WebUI.takeScreenshot(reportLocation + '/TC442/Step 17-Click on button open3.png')

"Step 18: Click on list projectTeamReleaseTeamTa"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/list_projectTeamReleaseTeamTa'))

WebUI.takeScreenshot(reportLocation + '/TC442/Step 18-Click on list projectTeamReleaseTeamTa.png')

"Step 19: Click on item taTeam"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/item_taTeam'))

WebUI.takeScreenshot(reportLocation + '/TC442/Step 19-Click on item taTeam.png')

"Step 20: Click on button add"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_add'))

WebUI.takeScreenshot(reportLocation + '/TC442/Step 20-Click on button add.png')

"Step 21: Click on link addNew"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_addNew'))

WebUI.takeScreenshot(reportLocation + '/TC442/Step 21-Click on link addNew.png')

"Step 22: Click on input displayName3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/input_displayName3'))

WebUI.takeScreenshot(reportLocation + '/TC442/Step 22-Click on input displayName3.png')

"Step 23: Click on span errorDetails (errorType)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/span_errorDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/span_errorDetails', ['span_errorDetails_option': span_errorDetails_option_1, 'span_errorDetails_mui': span_errorDetails_mui_1, 'span_errorDetails_internalText': span_errorDetails_internalText_1]))

WebUI.takeScreenshot(reportLocation + '/TC442/Step 23-Click on span errorDetails errorType.png')

"Step 24: Click on div reactSelectControl"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_reactSelectControl'))

WebUI.takeScreenshot(reportLocation + '/TC442/Step 24-Click on div reactSelectControl.png')

"Step 25: Click on div object15"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_object15'))

WebUI.takeScreenshot(reportLocation + '/TC442/Step 25-Click on div object15.png')

"Step 26: Click on button open3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_open3'))

WebUI.takeScreenshot(reportLocation + '/TC442/Step 26-Click on button open3.png')

"Step 27: Click on div thumbnailImage2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_thumbnailImage2'))

WebUI.takeScreenshot(reportLocation + '/TC442/Step 27-Click on div thumbnailImage2.png')

"Step 28: Click on button close"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_close'))

WebUI.takeScreenshot(reportLocation + '/TC442/Step 28-Click on button close.png')

"Step 29: Click on input value"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/input_value'))

WebUI.takeScreenshot(reportLocation + '/TC442/Step 29-Click on input value.png')

"Step 30: Click on span errorDetails (objectError)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/span_errorDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/span_errorDetails', ['span_errorDetails_option': span_errorDetails_option_2, 'span_errorDetails_mui': span_errorDetails_mui_2, 'span_errorDetails_internalText': span_errorDetails_internalText_2]))

WebUI.takeScreenshot(reportLocation + '/TC442/Step 30-Click on span errorDetails objectError.png')

"Step 31: Click on button add2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_add2'))

WebUI.takeScreenshot(reportLocation + '/TC442/Step 31-Click on button add2.png')

"Step 32: Submit updates for functions with thumbnail images."

submitThumbnailUpdates.execute(data_path_0, Integer.valueOf(index_0))

"Step 33: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC442-Submit Updates for Functions with Thumbnail Images_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}