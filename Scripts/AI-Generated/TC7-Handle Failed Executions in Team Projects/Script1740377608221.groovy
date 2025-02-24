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

TrueTestScripts.navigate("team/${GlobalVariable.team_id}/project/${GlobalVariable.project_id}/executions/${GlobalVariable.executions_id}")

"Step 2: Click on div FailedCreateReverse"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_FailedCreateReverse'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 2-Click on div FailedCreateReverse.png')

"Step 3: Click on div failedExecutionFilters (FailedQueryIndex)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/div_failedExecutionFilters"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/div_failedExecutionFilters', ['div_failedExecutionFilters_class': div_failedExecutionFilters_class, 'div_failedExecutionFilters_internalRoleButtonName': div_failedExecutionFilters_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 3-Click on div failedExecutionFilters FailedQueryIndex.png')

"Step 4: Click on div failedExecutionFilters (FailedFilterClaims)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/div_failedExecutionFilters"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/div_failedExecutionFilters', ['div_failedExecutionFilters_class': div_failedExecutionFilters_class_1, 'div_failedExecutionFilters_internalRoleButtonName': div_failedExecutionFilters_internalRoleButtonName_1]))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 4-Click on div failedExecutionFilters FailedFilterClaims.png')

"Step 5: Click on div ThumbnailImage3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_ThumbnailImage3'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 5-Click on div ThumbnailImage3.png')

"Step 6: Click on button Close"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_Close'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 6-Click on button Close.png')

"Step 7: Click on div ThumbnailImage4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_ThumbnailImage4'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 7-Click on div ThumbnailImage4.png')

"Step 8: Click on div failedExecutionDetails (FailedCreateReverse2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/div_failedExecutionDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/div_failedExecutionDetails', ['div_failedExecutionDetails_internalRoleButtonName': div_failedExecutionDetails_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 8-Click on div failedExecutionDetails FailedCreateReverse2.png')

"Step 9: Click on div ThumbnailImage5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_ThumbnailImage5'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 9-Click on div ThumbnailImage5.png')

"Step 10: Click on div FilePreviewError"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_FilePreviewError'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 10-Click on div FilePreviewError.png')

"Step 11: Click on button Close"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_Close'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 11-Click on button Close.png')

"Step 12: Click on pre ElementClickIntercepted"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/pre_ElementClickIntercepted'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 12-Click on pre ElementClickIntercepted.png')

"Step 13: Click on div ThumbnailImage3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_ThumbnailImage3'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 13-Click on div ThumbnailImage3.png')

"Step 14: Click on image FileImage"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/image_FileImage'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 14-Click on image FileImage.png')

"Step 15: Click on button Close2 -> Navigate to page 'organization home#organization/*/home'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_Close2'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 15-Click on button Close2 - Navigate to page organization homeorganizationhome.png')

"Step 16: Click on link TestExecutionDetails2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_home/link_TestExecutionDetails2'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 16-Click on link TestExecutionDetails2.png')

"Step 17: Click on link executionDetails (TestExecutionDetails3) -> Navigate to page 'team project executions#team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/link_executionDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/link_executionDetails', ['executions_id': executions_id, 'link_executionDetails_class': link_executionDetails_class, 'link_executionDetails_internalRoleLinkName': link_executionDetails_internalRoleLinkName, 'link_executionDetails_nthChild': link_executionDetails_nthChild, 'project_id': project_id, 'team_id': team_id]))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 17-Click on link executionDetails TestExecutionDetails3 - Navigate to page team project executionsteamprojectexecutions.png')

"Step 18: Click on div failedExecutionFilters (FailedCreateReverse3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/div_failedExecutionFilters"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/div_failedExecutionFilters', ['div_failedExecutionFilters_class': div_failedExecutionFilters_class_2, 'div_failedExecutionFilters_internalRoleButtonName': div_failedExecutionFilters_internalRoleButtonName_2]))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 18-Click on div failedExecutionFilters FailedCreateReverse3.png')

"Step 19: Click on div ThumbnailImage3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_ThumbnailImage3'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 19-Click on div ThumbnailImage3.png')

"Step 20: Click on button Close"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_Close'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 20-Click on button Close.png')

"Step 21: Click on div RightSidebar"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_RightSidebar'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 21-Click on div RightSidebar.png')

"Step 22: Click on div ThumbnailImage3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_ThumbnailImage3'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 22-Click on div ThumbnailImage3.png')

"Step 23: Click on image FileImage"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/image_FileImage'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 23-Click on image FileImage.png')

"Step 24: Click on button Close"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_Close'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 24-Click on button Close.png')

"Step 25: Click on pre ElementClickIntercepted"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/pre_ElementClickIntercepted'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 25-Click on pre ElementClickIntercepted.png')

"Step 26: Click on pre ElementClickIntercepted"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/pre_ElementClickIntercepted'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 26-Click on pre ElementClickIntercepted.png')

"Step 27: Click on div ThumbnailImage3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_ThumbnailImage3'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 27-Click on div ThumbnailImage3.png')

"Step 28: Click on button Close"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_Close'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 28-Click on button Close.png')

"Step 29: Click on div ThumbnailImage3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_ThumbnailImage3'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 29-Click on div ThumbnailImage3.png')

"Step 30: Click on button Close"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_Close'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 30-Click on button Close.png')

"Step 31: Click on td FailedFilterClaims"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/td_FailedFilterClaims'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 31-Click on td FailedFilterClaims.png')

"Step 32: Click on div ThumbnailImage5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_ThumbnailImage5'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 32-Click on div ThumbnailImage5.png')

"Step 33: Click on button Close"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_Close'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 33-Click on button Close.png')

"Step 34: Click on div ThumbnailImage3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_ThumbnailImage3'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 34-Click on div ThumbnailImage3.png')

"Step 35: Click on button Close"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_Close'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 35-Click on button Close.png')

"Step 36: Click on div ThumbnailImage4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_ThumbnailImage4'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 36-Click on div ThumbnailImage4.png')

"Step 37: Click on button Close"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_Close'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 37-Click on button Close.png')

"Step 38: Click on div ThumbnailImage6"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_ThumbnailImage6'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 38-Click on div ThumbnailImage6.png')

"Step 39: Click on button Close -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_Close'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 39-Click on button Close - Navigate to page .png')

"Step 40: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC7-Handle Failed Executions in Team Projects_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}