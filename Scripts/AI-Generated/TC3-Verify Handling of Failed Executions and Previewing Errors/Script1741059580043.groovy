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

"Step 1: Navigate to team/*/project/*/executions/*"

TrueTestScripts.navigate("team/${team_id}/project/${project_id}/executions/${executions_id}")

"Step 2: Click on div FailedCreateReverse"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_FailedCreateReverse'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 2-Click on div FailedCreateReverse.png')

"Step 3: Click on div failedExecutionFilters (FailedQueryIndex)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/div_failedExecutionFilters"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/div_failedExecutionFilters', ['div_failedExecutionFilters_class': div_failedExecutionFilters_class, 'div_failedExecutionFilters_internalRoleButtonName': div_failedExecutionFilters_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 3-Click on div failedExecutionFilters FailedQueryIndex.png')

"Step 4: Click on div failedExecutionFilters (FailedFilterClaims)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/div_failedExecutionFilters"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/div_failedExecutionFilters', ['div_failedExecutionFilters_class': div_failedExecutionFilters_class_1, 'div_failedExecutionFilters_internalRoleButtonName': div_failedExecutionFilters_internalRoleButtonName_1]))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 4-Click on div failedExecutionFilters FailedFilterClaims.png')

"Step 5: Click on div ThumbnailImage"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_ThumbnailImage'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 5-Click on div ThumbnailImage.png')

"Step 6: Click on button Close"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_Close'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 6-Click on button Close.png')

"Step 7: Click on div ThumbnailImage2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_ThumbnailImage2'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 7-Click on div ThumbnailImage2.png')

"Step 8: Click on div failedExecutionDetails (FailedCreateReverse2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/div_failedExecutionDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/div_failedExecutionDetails', ['div_failedExecutionDetails_internalRoleButtonName': div_failedExecutionDetails_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 8-Click on div failedExecutionDetails FailedCreateReverse2.png')

"Step 9: Click on div ThumbnailImage3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_ThumbnailImage3'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 9-Click on div ThumbnailImage3.png')

"Step 10: Click on div FilePreviewError"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_FilePreviewError'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 10-Click on div FilePreviewError.png')

"Step 11: Click on button Close"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_Close'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 11-Click on button Close.png')

"Step 12: Click on pre ElementClickIntercepted"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/pre_ElementClickIntercepted'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 12-Click on pre ElementClickIntercepted.png')

"Step 13: Click on div ThumbnailImage"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_ThumbnailImage'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 13-Click on div ThumbnailImage.png')

"Step 14: Click on image FileImage"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/image_FileImage'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 14-Click on image FileImage.png')

"Step 15: Click on button Close2 -> Navigate to page 'organization home#organization/*/home'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_Close2'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 15-Click on button Close2 - Navigate to page organization homeorganizationhome.png')

"Step 16: Click on link TestExecutionDetails -> Navigate to page 'team project executions#team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_home/link_TestExecutionDetails'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 16-Click on link TestExecutionDetails - Navigate to page team project executionsteamprojectexecutions.png')

"Step 17: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC3-Verify Handling of Failed Executions and Previewing Errors_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}