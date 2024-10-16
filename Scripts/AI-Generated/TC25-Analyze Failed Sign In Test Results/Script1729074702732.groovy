import internal.GlobalVariable
import truetest.custom.TrueTestScripts
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.configuration.RunConfiguration
import truetest.common.selectAndCloseMultipleThumbnails

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

"Step 3: Navigate to team/{*}/project/{*}/{*}"

TrueTestScripts.navigate("team/{*}/project/{*}/{*}")

"Step 4: Click on header testRunDetails (UntitledTestRun2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/header_testRunDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/header_testRunDetails', ['header_testRunDetails_internalRoleHeadingName': header_testRunDetails_internalRoleHeadingName]))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 4-Click on header testRunDetails UntitledTestRun2.png')

"Step 5: Click on button SessionsTab3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_SessionsTab3'))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 5-Click on button SessionsTab3.png')

"Step 6: Click on div TotalTests"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_TotalTests'))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 6-Click on div TotalTests.png')

"Step 7: Click on i Icon"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/i_Icon'))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 7-Click on i Icon.png')

"Step 8: Click on button FailedTestResults2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_FailedTestResults2'))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 8-Click on button FailedTestResults2.png')

"Step 9: Click on button SessionsTab3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_SessionsTab3'))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 9-Click on button SessionsTab3.png')

"Step 10: Click on button Sessions2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Sessions2'))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 10-Click on button Sessions2.png')

"Step 11: Click on div TotalTests"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_TotalTests'))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 11-Click on div TotalTests.png')

"Step 12: Click on div testRunDetails (UntitledTestRun4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_testRunDetails_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_testRunDetails_1', ['div_testRunDetails_internalHasText': div_testRunDetails_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 12-Click on div testRunDetails UntitledTestRun4.png')

"Step 13: Click on button CloseButton"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_CloseButton'))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 13-Click on button CloseButton.png')

"Step 14: Click on div testRunDetails (UntitledTestRunDetails)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_testRunDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_testRunDetails', ['div_testRunDetails_internalRoleCellName': div_testRunDetails_internalRoleCellName]))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 14-Click on div testRunDetails UntitledTestRunDetails.png')

"Step 15: Click on div noDataDisplay (NoDataDisplay)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_noDataDisplay'))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 15-Click on div noDataDisplay NoDataDisplay.png')

"Step 16: Click on div testRunDetails (UntitledTestRunDetails)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_testRunDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_testRunDetails', ['div_testRunDetails_internalRoleCellName': div_testRunDetails_internalRoleCellName_1]))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 16-Click on div testRunDetails UntitledTestRunDetails.png')

"Step 17: Click on button CloseButton"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_CloseButton'))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 17-Click on button CloseButton.png')

"Step 18: Click on div testRunDetails (UntitledTestRunDetails)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_testRunDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_testRunDetails', ['div_testRunDetails_internalRoleCellName': div_testRunDetails_internalRoleCellName_2]))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 18-Click on div testRunDetails UntitledTestRunDetails.png')

"Step 19: Click on button Details -> Navigate to page 'team project executions#team/{*}/project/{*}/executions/{*}'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Details'))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 19-Click on button Details - Navigate to page team project executionsteamprojectexecutions.png')

"Step 20: Click on link TestResults2 -> Navigate to page 'team project executions#team/{*}/project/{*}/executions/{*}/{*}'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/executions/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_TestResults2'))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 20-Click on link TestResults2 - Navigate to page team project executionsteamprojectexecutions.png')

"Step 21: Click on div FailedSignin"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/executions/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_FailedSignin'))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 21-Click on div FailedSignin.png')

"Step 22: Select and close multiple thumbnail images"

selectAndCloseMultipleThumbnails.execute()

"Step 23: Click on button testResultDetails (TestResultDetails) -> Navigate to page 'test result#team/{*}/project/{*}/executions/{*}/test-result/{*}'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/executions/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/button_testResultDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/button_testResultDetails', ['button_testResultDetails_class': button_testResultDetails_class]))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 23-Click on button testResultDetails TestResultDetails - Navigate to page test resultteamprojectexecutionstest-result.png')

"Step 24: Click on div thumbnailImages (ThumbnailImage)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/executions/{.*}/test-result/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_test_result/div_thumbnailImages"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_test_result/div_thumbnailImages', ['div_thumbnailImages_class': div_thumbnailImages_class]))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 24-Click on div thumbnailImages ThumbnailImage.png')

"Step 25: Click on div GalleryView"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/executions/{.*}/test-result/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_test_result/div_GalleryView'))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 25-Click on div GalleryView.png')

"Step 26: Click on div FilePreview"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/executions/{.*}/test-result/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_test_result/div_FilePreview'))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 26-Click on div FilePreview.png')

"Step 27: Click on div thumbnailImages (ThumbnailImage)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/executions/{.*}/test-result/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_test_result/div_thumbnailImages"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_test_result/div_thumbnailImages', ['div_thumbnailImages_class': div_thumbnailImages_class_1]))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 27-Click on div thumbnailImages ThumbnailImage.png')

"Step 28: Click on div GalleryView"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/executions/{.*}/test-result/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_test_result/div_GalleryView'))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 28-Click on div GalleryView.png')

"Step 29: Click on image FileImage"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/executions/{.*}/test-result/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_test_result/image_FileImage'))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 29-Click on image FileImage.png')

"Step 30: Click on div GalleryView"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/executions/{.*}/test-result/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_test_result/div_GalleryView'))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 30-Click on div GalleryView.png')

"Step 31: Click on div FilePreview"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/executions/{.*}/test-result/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_test_result/div_FilePreview'))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 31-Click on div FilePreview.png')

"Step 32: Click on div ObjectRepository"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/executions/{.*}/test-result/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_test_result/div_ObjectRepository'))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 32-Click on div ObjectRepository.png')

"Step 33: Click on link Requests -> Navigate to page 'test requests#team/{*}/project/{*}/executions/{*}/test-result/{*}/requests'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/executions/{.*}/test-result/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_test_result/link_Requests'))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 33-Click on link Requests - Navigate to page test requeststeamprojectexecutionstest-resultrequests.png')

"Step 34: Click on link TestObjects -> Navigate to page 'test objects#team/{*}/project/{*}/executions/{*}/test-result/{*}/test-objects'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/executions/{.*}/test-result/{.*}/requests?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_test_requests/link_TestObjects'))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 34-Click on link TestObjects - Navigate to page test objectsteamprojectexecutionstest-resulttest-objects.png')

"Step 35: Click on link SimilarFailures -> Navigate to page 'test result analysis#team/{*}/project/{*}/executions/{*}/test-result/{*}/similar-failures'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/executions/{.*}/test-result/{.*}/test-objects?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_test_objects/link_SimilarFailures'))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 35-Click on link SimilarFailures - Navigate to page test result analysisteamprojectexecutionstest-resultsimilar-failures.png')

"Step 36: Click on link Comments -> Navigate to page 'comments section#team/{*}/project/{*}/executions/{*}/test-result/{*}/comments'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/executions/{.*}/test-result/{.*}/similar-failures?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_test_result_analysis/link_Comments'))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 36-Click on link Comments - Navigate to page comments sectionteamprojectexecutionstest-resultcomments.png')

"Step 37: Click on link ReRuns -> Navigate to page 'test result re runs#team/{*}/project/{*}/executions/{*}/test-result/{*}/re-runs'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/executions/{.*}/test-result/{.*}/comments?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_comments_section/link_ReRuns'))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 37-Click on link ReRuns - Navigate to page test result re runsteamprojectexecutionstest-resultre-runs.png')

"Step 38: Click on time FailedSigninReRun"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/executions/{.*}/test-result/{.*}/re-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_test_result_re_runs/time_FailedSigninReRun'))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 38-Click on time FailedSigninReRun.png')

"Step 39: Click on div ThumbnailImage"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/executions/{.*}/test-result/{.*}/re-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_test_result_re_runs/div_ThumbnailImage'))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 39-Click on div ThumbnailImage.png')

"Step 40: Click on div FilePreviewMessage"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/executions/{.*}/test-result/{.*}/re-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_test_result_re_runs/div_FilePreviewMessage'))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 40-Click on div FilePreviewMessage.png')

"Step 41: Click on div Attachments"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/executions/{.*}/test-result/{.*}/re-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_test_result_re_runs/div_Attachments'))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 41-Click on div Attachments.png')

"Step 42: Click on div ThumbnailImage2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/executions/{.*}/test-result/{.*}/re-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_test_result_re_runs/div_ThumbnailImage2'))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 42-Click on div ThumbnailImage2.png')

"Step 43: Click on div FilePreviewMessage2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/executions/{.*}/test-result/{.*}/re-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_test_result_re_runs/div_FilePreviewMessage2'))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 43-Click on div FilePreviewMessage2.png')

"Step 44: Click on div FilePreviewMessage2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/executions/{.*}/test-result/{.*}/re-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_test_result_re_runs/div_FilePreviewMessage2'))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 44-Click on div FilePreviewMessage2.png')

"Step 45: Click on div FilePreviewMessage"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/executions/{.*}/test-result/{.*}/re-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_test_result_re_runs/div_FilePreviewMessage'))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 45-Click on div FilePreviewMessage.png')

"Step 46: Click on link Result -> Navigate to page 'test result#team/{*}/project/{*}/executions/{*}/test-result/{*}'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/executions/{.*}/test-result/{.*}/re-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_test_result_re_runs/link_Result'))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 46-Click on link Result - Navigate to page test resultteamprojectexecutionstest-result.png')

"Step 47: Click on div ErrorMessage"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/executions/{.*}/test-result/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_test_result/div_ErrorMessage'))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 47-Click on div ErrorMessage.png')

"Step 48: Click on label Maintainer -> Navigate to page 'team project executions#team/{*}/project/{*}/executions/{*}/{*}'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/executions/{.*}/test-result/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_test_result/label_Maintainer'))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 48-Click on label Maintainer - Navigate to page team project executionsteamprojectexecutions.png')

"Step 49: Click on div FailedSignin"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/executions/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_FailedSignin'))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 49-Click on div FailedSignin.png')

"Step 50: Click on link UnknownLink -> Navigate to page 'test result#team/{*}/project/{*}/executions/{*}/test-result/{*}'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/executions/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_UnknownLink'))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 50-Click on link UnknownLink - Navigate to page test resultteamprojectexecutionstest-result.png')

"Step 51: Click on div NoDefectLinked"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/executions/{.*}/test-result/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_test_result/div_NoDefectLinked'))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 51-Click on div NoDefectLinked.png')

"Step 52: Click on div ObjectRepository2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/executions/{.*}/test-result/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_test_result/div_ObjectRepository2'))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 52-Click on div ObjectRepository2.png')

"Step 53: Click on div ObjectRepositoryImage"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/executions/{.*}/test-result/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_test_result/div_ObjectRepositoryImage'))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 53-Click on div ObjectRepositoryImage.png')

"Step 54: Click on div thumbnailImages (ThumbnailImage2) -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/executions/{.*}/test-result/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_test_result/div_thumbnailImages"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_test_result/div_thumbnailImages', ['div_thumbnailImages_class': div_thumbnailImages_class_2]))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 54-Click on div thumbnailImages ThumbnailImage2 - Navigate to page .png')

"Step 55: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC25-Analyze Failed Sign In Test Results_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}