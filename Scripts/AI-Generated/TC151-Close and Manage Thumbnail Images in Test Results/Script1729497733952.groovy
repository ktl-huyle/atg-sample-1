import truetest.custom.TrueTestScripts
import truetest.common.closeThumbnailImages
import com.kms.katalon.core.configuration.RunConfiguration
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
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

"Step 3: Navigate to /team/*/project/*/test-runs"

TrueTestScripts.navigate("/team/${GlobalVariable.team_id}/project/${GlobalVariable.project_id}/test-runs")

"Step 4: Click on header testRunTitles (UntitledTestRun2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/header_testRunTitles"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/header_testRunTitles', ['header_testRunTitles_internalRoleHeadingName': header_testRunTitles_internalRoleHeadingName]))

WebUI.takeScreenshot(reportLocation + '/TC151/Step 4-Click on header testRunTitles UntitledTestRun2.png')

"Step 5: Click on button SessionsTab"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_SessionsTab'))

WebUI.takeScreenshot(reportLocation + '/TC151/Step 5-Click on button SessionsTab.png')

"Step 6: Click on div testRunStatistics (TotalTests)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_testRunStatistics'))

WebUI.takeScreenshot(reportLocation + '/TC151/Step 6-Click on div testRunStatistics TotalTests.png')

"Step 7: Click on i Icon"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/i_Icon'))

WebUI.takeScreenshot(reportLocation + '/TC151/Step 7-Click on i Icon.png')

"Step 8: Click on button FailedTestResultsTab"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_FailedTestResultsTab'))

WebUI.takeScreenshot(reportLocation + '/TC151/Step 8-Click on button FailedTestResultsTab.png')

"Step 9: Click on button SessionsTab"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_SessionsTab'))

WebUI.takeScreenshot(reportLocation + '/TC151/Step 9-Click on button SessionsTab.png')

"Step 10: Click on button SessionsTab2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_SessionsTab2'))

WebUI.takeScreenshot(reportLocation + '/TC151/Step 10-Click on button SessionsTab2.png')

"Step 11: Click on div testRunStatistics (TotalTests)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_testRunStatistics'))

WebUI.takeScreenshot(reportLocation + '/TC151/Step 11-Click on div testRunStatistics TotalTests.png')

"Step 12: Click on div testRunDetails (TestRun)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_testRunDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_testRunDetails', ['div_testRunDetails_internalHasText': div_testRunDetails_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC151/Step 12-Click on div testRunDetails TestRun.png')

"Step 13: Click on button Close"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_Close'))

WebUI.takeScreenshot(reportLocation + '/TC151/Step 13-Click on button Close.png')

"Step 14: Click on div testRunCells (TestRunDetails)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_testRunCells"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_testRunCells', ['div_testRunCells_class': div_testRunCells_class, 'div_testRunCells_internalRoleCellName': div_testRunCells_internalRoleCellName]))

WebUI.takeScreenshot(reportLocation + '/TC151/Step 14-Click on div testRunCells TestRunDetails.png')

"Step 15: Click on div NoDataDisplay"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_NoDataDisplay'))

WebUI.takeScreenshot(reportLocation + '/TC151/Step 15-Click on div NoDataDisplay.png')

"Step 16: Click on div testRunCells (TestRunDetails)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_testRunCells"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_testRunCells', ['div_testRunCells_class': div_testRunCells_class_1, 'div_testRunCells_internalRoleCellName': div_testRunCells_internalRoleCellName_1]))

WebUI.takeScreenshot(reportLocation + '/TC151/Step 16-Click on div testRunCells TestRunDetails.png')

"Step 17: Click on button Close"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_Close'))

WebUI.takeScreenshot(reportLocation + '/TC151/Step 17-Click on button Close.png')

"Step 18: Click on div testRunCells (TestRunDetails)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_testRunCells"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_testRunCells', ['div_testRunCells_class': div_testRunCells_class_2, 'div_testRunCells_internalRoleCellName': div_testRunCells_internalRoleCellName_2]))

WebUI.takeScreenshot(reportLocation + '/TC151/Step 18-Click on div testRunCells TestRunDetails.png')

"Step 19: Click on button Details2 -> Navigate to page '/team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_Details2'))

WebUI.takeScreenshot(reportLocation + '/TC151/Step 19-Click on button Details2 - Navigate to page teamprojectexecutions.png')

"Step 20: Click on link TestResults3 -> Navigate to page '/team/*/project/*/executions/*/test-runs'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_TestResults3'))

WebUI.takeScreenshot(reportLocation + '/TC151/Step 20-Click on link TestResults3 - Navigate to page teamprojectexecutionstest-runs.png')

"Step 21: Click on div FailedSigninMessage"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_runs/div_FailedSigninMessage'))

WebUI.takeScreenshot(reportLocation + '/TC151/Step 21-Click on div FailedSigninMessage.png')

"Step 22: Close multiple thumbnail images in the interface"

closeThumbnailImages.execute()

"Step 23: Click on button GoToTestResultDetails -> Navigate to page '/team/*/project/*/executions/*/test-result/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_runs/button_GoToTestResultDetails'))

WebUI.takeScreenshot(reportLocation + '/TC151/Step 23-Click on button GoToTestResultDetails - Navigate to page teamprojectexecutionstest-result.png')

"Step 24: Click on div thumbnailImages (ThumbnailImage)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions_test_result/div_thumbnailImages"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions_test_result/div_thumbnailImages', ['div_thumbnailImages_class': div_thumbnailImages_class]))

WebUI.takeScreenshot(reportLocation + '/TC151/Step 24-Click on div thumbnailImages ThumbnailImage.png')

"Step 25: Click on div GalleryView"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/div_GalleryView'))

WebUI.takeScreenshot(reportLocation + '/TC151/Step 25-Click on div GalleryView.png')

"Step 26: Click on div FilePreviewMessage"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/div_FilePreviewMessage'))

WebUI.takeScreenshot(reportLocation + '/TC151/Step 26-Click on div FilePreviewMessage.png')

"Step 27: Click on div thumbnailImages (ThumbnailImage)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions_test_result/div_thumbnailImages"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions_test_result/div_thumbnailImages', ['div_thumbnailImages_class': div_thumbnailImages_class_1]))

WebUI.takeScreenshot(reportLocation + '/TC151/Step 27-Click on div thumbnailImages ThumbnailImage.png')

"Step 28: Click on div GalleryView"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/div_GalleryView'))

WebUI.takeScreenshot(reportLocation + '/TC151/Step 28-Click on div GalleryView.png')

"Step 29: Click on image testRunPreviews (FilePreview)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions_test_result/image_testRunPreviews"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions_test_result/image_testRunPreviews', ['image_testRunPreviews_internalRoleImgName': image_testRunPreviews_internalRoleImgName]))

WebUI.takeScreenshot(reportLocation + '/TC151/Step 29-Click on image testRunPreviews FilePreview.png')

"Step 30: Click on div GalleryView"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/div_GalleryView'))

WebUI.takeScreenshot(reportLocation + '/TC151/Step 30-Click on div GalleryView.png')

"Step 31: Click on div FilePreviewMessage"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/div_FilePreviewMessage'))

WebUI.takeScreenshot(reportLocation + '/TC151/Step 31-Click on div FilePreviewMessage.png')

"Step 32: Click on div ObjectRepositoryTreeItem"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/div_ObjectRepositoryTreeItem'))

WebUI.takeScreenshot(reportLocation + '/TC151/Step 32-Click on div ObjectRepositoryTreeItem.png')

"Step 33: Click on link Requests -> Navigate to page '/team/*/project/*/executions/*/test-result/*/requests'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/link_Requests'))

WebUI.takeScreenshot(reportLocation + '/TC151/Step 33-Click on link Requests - Navigate to page teamprojectexecutionstest-resultrequests.png')

"Step 34: Click on link TestObjects -> Navigate to page '/team/*/project/*/executions/*/test-result/*/test-objects'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*/requests?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result_requests/link_TestObjects'))

WebUI.takeScreenshot(reportLocation + '/TC151/Step 34-Click on link TestObjects - Navigate to page teamprojectexecutionstest-resulttest-objects.png')

"Step 35: Click on link SimilarFailures -> Navigate to page '/team/*/project/*/executions/*/test-result/*/similar-failures'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*/test-objects?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result_test_objects/link_SimilarFailures'))

WebUI.takeScreenshot(reportLocation + '/TC151/Step 35-Click on link SimilarFailures - Navigate to page teamprojectexecutionstest-resultsimilar-failures.png')

"Step 36: Click on link Comments -> Navigate to page '/team/*/project/*/executions/*/test-result/*/comments'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*/similar-failures?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result_similar_failures/link_Comments'))

WebUI.takeScreenshot(reportLocation + '/TC151/Step 36-Click on link Comments - Navigate to page teamprojectexecutionstest-resultcomments.png')

"Step 37: Click on link ReRuns -> Navigate to page '/team/*/project/*/executions/*/test-result/*/re-runs'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*/comments?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result_comments/link_ReRuns'))

WebUI.takeScreenshot(reportLocation + '/TC151/Step 37-Click on link ReRuns - Navigate to page teamprojectexecutionstest-resultre-runs.png')

"Step 38: Click on time FailedSigninReRun"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*/re-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result_re_runs/time_FailedSigninReRun'))

WebUI.takeScreenshot(reportLocation + '/TC151/Step 38-Click on time FailedSigninReRun.png')

"Step 39: Click on div ThumbnailImage"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*/re-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result_re_runs/div_ThumbnailImage'))

WebUI.takeScreenshot(reportLocation + '/TC151/Step 39-Click on div ThumbnailImage.png')

"Step 40: Click on div FileTypePreviewMessage"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*/re-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result_re_runs/div_FileTypePreviewMessage'))

WebUI.takeScreenshot(reportLocation + '/TC151/Step 40-Click on div FileTypePreviewMessage.png')

"Step 41: Click on div Attachments"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*/re-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result_re_runs/div_Attachments'))

WebUI.takeScreenshot(reportLocation + '/TC151/Step 41-Click on div Attachments.png')

"Step 42: Click on div ThumbnailImage2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*/re-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result_re_runs/div_ThumbnailImage2'))

WebUI.takeScreenshot(reportLocation + '/TC151/Step 42-Click on div ThumbnailImage2.png')

"Step 43: Click on div FileDownloadMessage"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*/re-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result_re_runs/div_FileDownloadMessage'))

WebUI.takeScreenshot(reportLocation + '/TC151/Step 43-Click on div FileDownloadMessage.png')

"Step 44: Click on div FileDownloadMessage"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*/re-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result_re_runs/div_FileDownloadMessage'))

WebUI.takeScreenshot(reportLocation + '/TC151/Step 44-Click on div FileDownloadMessage.png')

"Step 45: Click on div FileTypePreviewMessage"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*/re-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result_re_runs/div_FileTypePreviewMessage'))

WebUI.takeScreenshot(reportLocation + '/TC151/Step 45-Click on div FileTypePreviewMessage.png')

"Step 46: Click on link Result -> Navigate to page '/team/*/project/*/executions/*/test-result/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*/re-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result_re_runs/link_Result'))

WebUI.takeScreenshot(reportLocation + '/TC151/Step 46-Click on link Result - Navigate to page teamprojectexecutionstest-result.png')

"Step 47: Click on div ErrorMessage"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/div_ErrorMessage'))

WebUI.takeScreenshot(reportLocation + '/TC151/Step 47-Click on div ErrorMessage.png')

"Step 48: Click on label Maintainer -> Navigate to page '/team/*/project/*/executions/*/test-runs'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/label_Maintainer'))

WebUI.takeScreenshot(reportLocation + '/TC151/Step 48-Click on label Maintainer - Navigate to page teamprojectexecutionstest-runs.png')

"Step 49: Click on div FailedSigninMessage"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_runs/div_FailedSigninMessage'))

WebUI.takeScreenshot(reportLocation + '/TC151/Step 49-Click on div FailedSigninMessage.png')

"Step 50: Click on link TestRuns -> Navigate to page '/team/*/project/*/executions/*/test-result/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_runs/link_TestRuns'))

WebUI.takeScreenshot(reportLocation + '/TC151/Step 50-Click on link TestRuns - Navigate to page teamprojectexecutionstest-result.png')

"Step 51: Click on div InputBase"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/div_InputBase'))

WebUI.takeScreenshot(reportLocation + '/TC151/Step 51-Click on div InputBase.png')

"Step 52: Click on input FailureReasonSelect"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/input_FailureReasonSelect'))

WebUI.takeScreenshot(reportLocation + '/TC151/Step 52-Click on input FailureReasonSelect.png')

"Step 53: Click on div FailureReasonBeta"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/div_FailureReasonBeta'))

WebUI.takeScreenshot(reportLocation + '/TC151/Step 53-Click on div FailureReasonBeta.png')

"Step 54: Click on div ObjectRepository"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/div_ObjectRepository'))

WebUI.takeScreenshot(reportLocation + '/TC151/Step 54-Click on div ObjectRepository.png')

"Step 55: Click on div ObjectRepositoryImage"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/div_ObjectRepositoryImage'))

WebUI.takeScreenshot(reportLocation + '/TC151/Step 55-Click on div ObjectRepositoryImage.png')

"Step 56: Click on div thumbnailImages (ThumbnailImage2) -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions_test_result/div_thumbnailImages"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions_test_result/div_thumbnailImages', ['div_thumbnailImages_class': div_thumbnailImages_class_2]))

WebUI.takeScreenshot(reportLocation + '/TC151/Step 56-Click on div thumbnailImages ThumbnailImage2 - Navigate to page .png')

"Step 57: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC151-Close and Manage Thumbnail Images in Test Results_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}