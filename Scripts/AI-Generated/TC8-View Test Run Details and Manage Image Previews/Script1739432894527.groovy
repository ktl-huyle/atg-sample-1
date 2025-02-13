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

"Step 1: Navigate to team/*/project/*/*"

TrueTestScripts.navigate("team/${GlobalVariable.team_id}/project/${GlobalVariable.project_id}/${GlobalVariable.path_param_5}")

"Step 2: Click on header TestRunDetail"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_detail/header_TestRunDetail'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 2-Click on header TestRunDetail.png')

"Step 3: Click on button testSessions (Sessions)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_detail/button_testSessions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_detail/button_testSessions', ['button_testSessions_class': button_testSessions_class, 'button_testSessions_internalRoleTabName': button_testSessions_internalRoleTabName]))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 3-Click on button testSessions Sessions.png')

"Step 4: Click on div TotalTests"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_detail/div_TotalTests'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 4-Click on div TotalTests.png')

"Step 5: Click on i SolidIcon"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_detail/i_SolidIcon'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 5-Click on i SolidIcon.png')

"Step 6: Click on button testSessions (FailedTestResults)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_detail/button_testSessions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_detail/button_testSessions', ['button_testSessions_class': button_testSessions_class_1, 'button_testSessions_internalRoleTabName': button_testSessions_internalRoleTabName_1]))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 6-Click on button testSessions FailedTestResults.png')

"Step 7: Click on button testSessions (Sessions)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_detail/button_testSessions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_detail/button_testSessions', ['button_testSessions_class': button_testSessions_class_2, 'button_testSessions_internalRoleTabName': button_testSessions_internalRoleTabName_2]))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 7-Click on button testSessions Sessions.png')

"Step 8: Click on button testSessions (Sessions2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_detail/button_testSessions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_detail/button_testSessions', ['button_testSessions_class': button_testSessions_class_3, 'button_testSessions_internalRoleTabName': button_testSessions_internalRoleTabName_3]))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 8-Click on button testSessions Sessions2.png')

"Step 9: Click on div TotalTests"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_detail/div_TotalTests'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 9-Click on div TotalTests.png')

"Step 10: Click on div TestRunDetail"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_detail/div_TestRunDetail'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 10-Click on div TestRunDetail.png')

"Step 11: Click on button CloseButton"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_detail/button_CloseButton'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 11-Click on button CloseButton.png')

"Step 12: Click on div parallelSuites (TestRunCell)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_detail/div_parallelSuites"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_detail/div_parallelSuites', ['div_parallelSuites_internalRoleCellName': div_parallelSuites_internalRoleCellName]))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 12-Click on div parallelSuites TestRunCell.png')

"Step 13: Click on div NoDataDisplay"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_detail/div_NoDataDisplay'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 13-Click on div NoDataDisplay.png')

"Step 14: Click on div parallelSuites (TestRunCell)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_detail/div_parallelSuites"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_detail/div_parallelSuites', ['div_parallelSuites_internalRoleCellName': div_parallelSuites_internalRoleCellName_1]))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 14-Click on div parallelSuites TestRunCell.png')

"Step 15: Click on button CloseButton"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_detail/button_CloseButton'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 15-Click on button CloseButton.png')

"Step 16: Click on div parallelSuites (TestRunCell)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_detail/div_parallelSuites"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_detail/div_parallelSuites', ['div_parallelSuites_internalRoleCellName': div_parallelSuites_internalRoleCellName_2]))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 16-Click on div parallelSuites TestRunCell.png')

"Step 17: Click on button Details -> Navigate to page 'team project executions#team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_detail/button_Details'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 17-Click on button Details - Navigate to page team project executionsteamprojectexecutions.png')

"Step 18: Click on link TestResults -> Navigate to page 'team project executions#team/*/project/*/executions/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_TestResults'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 18-Click on link TestResults - Navigate to page team project executionsteamprojectexecutions.png')

"Step 19: Click on div FailedSignin"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_FailedSignin'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 19-Click on div FailedSignin.png')

"Step 20: Click on div ErrorStackTrace"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_ErrorStackTrace'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 20-Click on div ErrorStackTrace.png')

"Step 21: Click on div ErrorStackTrace"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_ErrorStackTrace'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 21-Click on div ErrorStackTrace.png')

"Step 22: Click on div ThumbnailImage7"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_ThumbnailImage7'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 22-Click on div ThumbnailImage7.png')

"Step 23: Click on div FilePreviewMessage"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_FilePreviewMessage'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 23-Click on div FilePreviewMessage.png')

"Step 24: Click on button close2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_close2'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 24-Click on button close2.png')

"Step 25: Click on button goToTestResult -> Navigate to page 'test result#team/*/project/*/executions/*/test-result/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_goToTestResult'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 25-Click on button goToTestResult - Navigate to page test resultteamprojectexecutionstest-result.png')

"Step 26: Click on div thumbnailImages (ThumbnailImage)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_test_result/div_thumbnailImages"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_test_result/div_thumbnailImages', ['div_thumbnailImages_class': div_thumbnailImages_class]))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 26-Click on div thumbnailImages ThumbnailImage.png')

"Step 27: Click on div GalleryView"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_test_result/div_GalleryView'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 27-Click on div GalleryView.png')

"Step 28: Click on div SketchImageView"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_test_result/div_SketchImageView'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 28-Click on div SketchImageView.png')

"Step 29: Click on div thumbnailImages (ThumbnailImage)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_test_result/div_thumbnailImages"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_test_result/div_thumbnailImages', ['div_thumbnailImages_class': div_thumbnailImages_class_1]))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 29-Click on div thumbnailImages ThumbnailImage.png')

"Step 30: Click on div GalleryView"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_test_result/div_GalleryView'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 30-Click on div GalleryView.png')

"Step 31: Click on image ThumbnailImage"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_test_result/image_ThumbnailImage'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 31-Click on image ThumbnailImage.png')

"Step 32: Click on div GalleryView"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_test_result/div_GalleryView'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 32-Click on div GalleryView.png')

"Step 33: Click on div SketchImageView"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_test_result/div_SketchImageView'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 33-Click on div SketchImageView.png')

"Step 34: Click on div ObjectRepository"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_test_result/div_ObjectRepository'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 34-Click on div ObjectRepository.png')

"Step 35: Click on link Requests -> Navigate to page 'test result requests#team/*/project/*/executions/*/test-result/*/requests'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_test_result/link_Requests'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 35-Click on link Requests - Navigate to page test result requeststeamprojectexecutionstest-resultrequests.png')

"Step 36: Click on link TestObjects -> Navigate to page 'test result overview#team/*/project/*/executions/*/test-result/*/test-objects'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions/.*/test-result/.*/requests?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_test_result_requests/link_TestObjects'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 36-Click on link TestObjects - Navigate to page test result overviewteamprojectexecutionstest-resulttest-objects.png')

"Step 37: Click on link SimilarFailures -> Navigate to page 'test result analysis#team/*/project/*/executions/*/test-result/*/similar-failures'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions/.*/test-result/.*/test-objects?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_test_result_overview/link_SimilarFailures'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 37-Click on link SimilarFailures - Navigate to page test result analysisteamprojectexecutionstest-resultsimilar-failures.png')

"Step 38: Click on link Comments -> Navigate to page 'comment section#team/*/project/*/executions/*/test-result/*/comments'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions/.*/test-result/.*/similar-failures?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_test_result_analysis/link_Comments'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 38-Click on link Comments - Navigate to page comment sectionteamprojectexecutionstest-resultcomments.png')

"Step 39: Click on link ReRuns -> Navigate to page 'test result re runs#team/*/project/*/executions/*/test-result/*/re-runs'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions/.*/test-result/.*/comments?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_comment_section/link_ReRuns'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 39-Click on link ReRuns - Navigate to page test result re runsteamprojectexecutionstest-resultre-runs.png')

"Step 40: Click on time ReRunDetails"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions/.*/test-result/.*/re-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_test_result_re_runs/time_ReRunDetails'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 40-Click on time ReRunDetails.png')

"Step 41: Click on div ThumbnailImage"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions/.*/test-result/.*/re-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_test_result_re_runs/div_ThumbnailImage'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 41-Click on div ThumbnailImage.png')

"Step 42: Click on div FilePreviewMessage"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions/.*/test-result/.*/re-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_test_result_re_runs/div_FilePreviewMessage'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 42-Click on div FilePreviewMessage.png')

"Step 43: Click on div Attachments"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions/.*/test-result/.*/re-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_test_result_re_runs/div_Attachments'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 43-Click on div Attachments.png')

"Step 44: Click on div ThumbnailImage2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions/.*/test-result/.*/re-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_test_result_re_runs/div_ThumbnailImage2'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 44-Click on div ThumbnailImage2.png')

"Step 45: Click on div FilePreviewMessage2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions/.*/test-result/.*/re-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_test_result_re_runs/div_FilePreviewMessage2'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 45-Click on div FilePreviewMessage2.png')

"Step 46: Click on div FilePreviewMessage2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions/.*/test-result/.*/re-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_test_result_re_runs/div_FilePreviewMessage2'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 46-Click on div FilePreviewMessage2.png')

"Step 47: Click on div FilePreviewMessage"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions/.*/test-result/.*/re-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_test_result_re_runs/div_FilePreviewMessage'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 47-Click on div FilePreviewMessage.png')

"Step 48: Click on link Result -> Navigate to page 'test result#team/*/project/*/executions/*/test-result/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions/.*/test-result/.*/re-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_test_result_re_runs/link_Result'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 48-Click on link Result - Navigate to page test resultteamprojectexecutionstest-result.png')

"Step 49: Click on div ErrorMessage"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_test_result/div_ErrorMessage'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 49-Click on div ErrorMessage.png')

"Step 50: Click on label Maintainer -> Navigate to page 'team project executions#team/*/project/*/executions/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_test_result/label_Maintainer'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 50-Click on label Maintainer - Navigate to page team project executionsteamprojectexecutions.png')

"Step 51: Click on div FailedSignin"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_FailedSignin'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 51-Click on div FailedSignin.png')

"Step 52: Click on link ExecutionLink -> Navigate to page 'test result#team/*/project/*/executions/*/test-result/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_ExecutionLink'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 52-Click on link ExecutionLink - Navigate to page test resultteamprojectexecutionstest-result.png')

"Step 53: Click on div NoDefectLinked"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_test_result/div_NoDefectLinked'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 53-Click on div NoDefectLinked.png')

"Step 54: Click on div ObjectRepository2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_test_result/div_ObjectRepository2'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 54-Click on div ObjectRepository2.png')

"Step 55: Click on div ObjectRepositoryImage"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_test_result/div_ObjectRepositoryImage'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 55-Click on div ObjectRepositoryImage.png')

"Step 56: Click on div thumbnailImages (ThumbnailImage2) -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_test_result/div_thumbnailImages"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_test_result/div_thumbnailImages', ['div_thumbnailImages_class': div_thumbnailImages_class_2]))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 56-Click on div thumbnailImages ThumbnailImage2 - Navigate to page .png')

"Step 57: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC8-View Test Run Details and Manage Image Previews_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}