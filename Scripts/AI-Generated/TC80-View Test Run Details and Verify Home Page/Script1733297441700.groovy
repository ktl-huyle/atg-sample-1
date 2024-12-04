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

"Step 1: Navigate to http://demo.localhost.direct"

TrueTestScripts.navigate("")

"Step 2: Login into Application"

TrueTestScripts.login()

"Step 3: Navigate to team/*/project/*/test-runs"

TrueTestScripts.navigate("team/${GlobalVariable.team_id}/project/${GlobalVariable.project_id}/test-runs")

"Step 4: Click on header testRun (EPPsAutomationTestCaseRun3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/header_testRun"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/header_testRun', ['header_testRun_internalRoleHeadingName': header_testRun_internalRoleHeadingName]))

WebUI.takeScreenshot(reportLocation + '/TC80/Step 4-Click on header testRun EPPsAutomationTestCaseRun3.png')

"Step 5: Click on button dynamicObject (Sessions)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/button_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/button_dynamicObject', ['button_dynamicObject_internalRoleTabName': button_dynamicObject_internalRoleTabName]))

WebUI.takeScreenshot(reportLocation + '/TC80/Step 5-Click on button dynamicObject Sessions.png')

"Step 6: Click on div TotalTests"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_TotalTests'))

WebUI.takeScreenshot(reportLocation + '/TC80/Step 6-Click on div TotalTests.png')

"Step 7: Click on i object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/i_object'))

WebUI.takeScreenshot(reportLocation + '/TC80/Step 7-Click on i object.png')

"Step 8: Click on button dynamicObject (FailedTestResults)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/button_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/button_dynamicObject', ['button_dynamicObject_internalRoleTabName': button_dynamicObject_internalRoleTabName_1]))

WebUI.takeScreenshot(reportLocation + '/TC80/Step 8-Click on button dynamicObject FailedTestResults.png')

"Step 9: Click on button dynamicObject (Sessions)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/button_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/button_dynamicObject', ['button_dynamicObject_internalRoleTabName': button_dynamicObject_internalRoleTabName_2]))

WebUI.takeScreenshot(reportLocation + '/TC80/Step 9-Click on button dynamicObject Sessions.png')

"Step 10: Click on button Sessions2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_Sessions3'))

WebUI.takeScreenshot(reportLocation + '/TC80/Step 10-Click on button Sessions2.png')

"Step 11: Click on div TotalTests"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_TotalTests'))

WebUI.takeScreenshot(reportLocation + '/TC80/Step 11-Click on div TotalTests.png')

"Step 12: Click on div dynamicObject (UntitledTestRun)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_dynamicObject', ['div_dynamicObject_internalHasText': div_dynamicObject_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC80/Step 12-Click on div dynamicObject UntitledTestRun.png')

"Step 13: Click on button Object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_Object'))

WebUI.takeScreenshot(reportLocation + '/TC80/Step 13-Click on button Object.png')

"Step 14: Click on div testRunItems (object)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_testRunItems"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_testRunItems', ['div_testRunItems_internalRoleCellName': div_testRunItems_internalRoleCellName]))

WebUI.takeScreenshot(reportLocation + '/TC80/Step 14-Click on div testRunItems object.png')

"Step 15: Click on div NoDataToDisplay"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_NoDataToDisplay'))

WebUI.takeScreenshot(reportLocation + '/TC80/Step 15-Click on div NoDataToDisplay.png')

"Step 16: Click on div testRunItems (object)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_testRunItems"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_testRunItems', ['div_testRunItems_internalRoleCellName': div_testRunItems_internalRoleCellName_1]))

WebUI.takeScreenshot(reportLocation + '/TC80/Step 16-Click on div testRunItems object.png')

"Step 17: Click on button Object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_Object'))

WebUI.takeScreenshot(reportLocation + '/TC80/Step 17-Click on button Object.png')

"Step 18: Click on div testRunItems (object)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_testRunItems"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_testRunItems', ['div_testRunItems_internalRoleCellName': div_testRunItems_internalRoleCellName_2]))

WebUI.takeScreenshot(reportLocation + '/TC80/Step 18-Click on div testRunItems object.png')

"Step 19: Click on button Details2 -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_Details2_1'))

WebUI.takeScreenshot(reportLocation + '/TC80/Step 19-Click on button Details2 - Navigate to page teamprojectexecutions.png')

"Step 20: Click on link TestResults6 -> Navigate to page 'team/*/project/*/executions/*/test-runs'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_TestResults6'))

WebUI.takeScreenshot(reportLocation + '/TC80/Step 20-Click on link TestResults6 - Navigate to page teamprojectexecutionstest-runs.png')

"Step 21: Click on div FailedSignin"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_runs/div_FailedSignin'))

WebUI.takeScreenshot(reportLocation + '/TC80/Step 21-Click on div FailedSignin.png')

"Step 22: Click on div ErrorStackTrace"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_runs/div_ErrorStackTrace'))

WebUI.takeScreenshot(reportLocation + '/TC80/Step 22-Click on div ErrorStackTrace.png')

"Step 23: Click on div ErrorStackTrace"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_runs/div_ErrorStackTrace'))

WebUI.takeScreenshot(reportLocation + '/TC80/Step 23-Click on div ErrorStackTrace.png')

"Step 24: Click on div ThumbnailImage"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_runs/div_ThumbnailImage'))

WebUI.takeScreenshot(reportLocation + '/TC80/Step 24-Click on div ThumbnailImage.png')

"Step 25: Click on div FilePreviewMessage"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_runs/div_FilePreviewMessage'))

WebUI.takeScreenshot(reportLocation + '/TC80/Step 25-Click on div FilePreviewMessage.png')

"Step 26: Click on button Close"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_runs/button_Close'))

WebUI.takeScreenshot(reportLocation + '/TC80/Step 26-Click on button Close.png')

"Step 27: Click on button TestResultDetails (TestResultDetails3) -> Navigate to page 'team/*/project/*/executions/*/test-result/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions_test_runs/button_TestResultDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions_test_runs/button_TestResultDetails', ['button_TestResultDetails_class': button_TestResultDetails_class]))

WebUI.takeScreenshot(reportLocation + '/TC80/Step 27-Click on button TestResultDetails TestResultDetails3 - Navigate to page teamprojectexecutionstest-result.png')

"Step 28: Click on div dynamicObject (ThumbnailImage)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions_test_result/div_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions_test_result/div_dynamicObject', ['div_dynamicObject_class': div_dynamicObject_class]))

WebUI.takeScreenshot(reportLocation + '/TC80/Step 28-Click on div dynamicObject ThumbnailImage.png')

"Step 29: Click on div GalleryView"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/div_GalleryView'))

WebUI.takeScreenshot(reportLocation + '/TC80/Step 29-Click on div GalleryView.png')

"Step 30: Click on div SketchPreview"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/div_SketchPreview'))

WebUI.takeScreenshot(reportLocation + '/TC80/Step 30-Click on div SketchPreview.png')

"Step 31: Click on div dynamicObject (ThumbnailImage)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions_test_result/div_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions_test_result/div_dynamicObject', ['div_dynamicObject_class': div_dynamicObject_class_1]))

WebUI.takeScreenshot(reportLocation + '/TC80/Step 31-Click on div dynamicObject ThumbnailImage.png')

"Step 32: Click on div GalleryView"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/div_GalleryView'))

WebUI.takeScreenshot(reportLocation + '/TC80/Step 32-Click on div GalleryView.png')

"Step 33: Click on image dynamicObject (SketchImage)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions_test_result/image_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions_test_result/image_dynamicObject', ['image_dynamicObject_internalRoleImgName': image_dynamicObject_internalRoleImgName]))

WebUI.takeScreenshot(reportLocation + '/TC80/Step 33-Click on image dynamicObject SketchImage.png')

"Step 34: Click on div GalleryView"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/div_GalleryView'))

WebUI.takeScreenshot(reportLocation + '/TC80/Step 34-Click on div GalleryView.png')

"Step 35: Click on div SketchPreview"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/div_SketchPreview'))

WebUI.takeScreenshot(reportLocation + '/TC80/Step 35-Click on div SketchPreview.png')

"Step 36: Click on div ObjectRepository"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/div_ObjectRepository'))

WebUI.takeScreenshot(reportLocation + '/TC80/Step 36-Click on div ObjectRepository.png')

"Step 37: Click on link Requests -> Navigate to page 'team/*/project/*/executions/*/test-result/*/requests'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/link_Requests'))

WebUI.takeScreenshot(reportLocation + '/TC80/Step 37-Click on link Requests - Navigate to page teamprojectexecutionstest-resultrequests.png')

"Step 38: Click on link TestObjects -> Navigate to page 'team/*/project/*/executions/*/test-result/*/test-objects'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*/requests?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result_requests/link_TestObjects'))

WebUI.takeScreenshot(reportLocation + '/TC80/Step 38-Click on link TestObjects - Navigate to page teamprojectexecutionstest-resulttest-objects.png')

"Step 39: Click on link SimilarFailures -> Navigate to page 'team/*/project/*/executions/*/test-result/*/similar-failures'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*/test-objects?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result_test_objects/link_SimilarFailures'))

WebUI.takeScreenshot(reportLocation + '/TC80/Step 39-Click on link SimilarFailures - Navigate to page teamprojectexecutionstest-resultsimilar-failures.png')

"Step 40: Click on link Comments -> Navigate to page 'team/*/project/*/executions/*/test-result/*/comments'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*/similar-failures?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result_similar_failures/link_Comments'))

WebUI.takeScreenshot(reportLocation + '/TC80/Step 40-Click on link Comments - Navigate to page teamprojectexecutionstest-resultcomments.png')

"Step 41: Click on link ReRuns -> Navigate to page 'team/*/project/*/executions/*/test-result/*/re-runs'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*/comments?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result_comments/link_ReRuns'))

WebUI.takeScreenshot(reportLocation + '/TC80/Step 41-Click on link ReRuns - Navigate to page teamprojectexecutionstest-resultre-runs.png')

"Step 42: Click on time FailedSigninReRun"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*/re-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result_re_runs/time_FailedSigninReRun'))

WebUI.takeScreenshot(reportLocation + '/TC80/Step 42-Click on time FailedSigninReRun.png')

"Step 43: Click on div ThumbnailImage"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*/re-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result_re_runs/div_ThumbnailImage'))

WebUI.takeScreenshot(reportLocation + '/TC80/Step 43-Click on div ThumbnailImage.png')

"Step 44: Click on div FilePreview"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*/re-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result_re_runs/div_FilePreview'))

WebUI.takeScreenshot(reportLocation + '/TC80/Step 44-Click on div FilePreview.png')

"Step 45: Click on div Attachments"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*/re-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result_re_runs/div_Attachments'))

WebUI.takeScreenshot(reportLocation + '/TC80/Step 45-Click on div Attachments.png')

"Step 46: Click on div thumbnailImage"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*/re-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result_re_runs/div_thumbnailImage_1'))

WebUI.takeScreenshot(reportLocation + '/TC80/Step 46-Click on div thumbnailImage.png')

"Step 47: Click on div filePreviewMessage"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*/re-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result_re_runs/div_filePreviewMessage'))

WebUI.takeScreenshot(reportLocation + '/TC80/Step 47-Click on div filePreviewMessage.png')

"Step 48: Click on div filePreviewMessage"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*/re-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result_re_runs/div_filePreviewMessage'))

WebUI.takeScreenshot(reportLocation + '/TC80/Step 48-Click on div filePreviewMessage.png')

"Step 49: Click on div FilePreview"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*/re-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result_re_runs/div_FilePreview'))

WebUI.takeScreenshot(reportLocation + '/TC80/Step 49-Click on div FilePreview.png')

"Step 50: Click on link result -> Navigate to page 'team/*/project/*/executions/*/test-result/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*/re-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result_re_runs/link_result_1'))

WebUI.takeScreenshot(reportLocation + '/TC80/Step 50-Click on link result - Navigate to page teamprojectexecutionstest-result.png')

"Step 51: Click on div errorMessage"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/div_errorMessage'))

WebUI.takeScreenshot(reportLocation + '/TC80/Step 51-Click on div errorMessage.png')

"Step 52: Click on label maintainer -> Navigate to page 'team/*/project/*/executions/*/test-runs'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/label_maintainer'))

WebUI.takeScreenshot(reportLocation + '/TC80/Step 52-Click on label maintainer - Navigate to page teamprojectexecutionstest-runs.png')

"Step 53: Click on div FailedSignin"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_runs/div_FailedSignin'))

WebUI.takeScreenshot(reportLocation + '/TC80/Step 53-Click on div FailedSignin.png')

"Step 54: Click on link moreOptions -> Navigate to page 'team/*/project/*/executions/*/test-result/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_runs/link_moreOptions'))

WebUI.takeScreenshot(reportLocation + '/TC80/Step 54-Click on link moreOptions - Navigate to page teamprojectexecutionstest-result.png')

"Step 55: Click on div NoDefectLinked"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/div_NoDefectLinked'))

WebUI.takeScreenshot(reportLocation + '/TC80/Step 55-Click on div NoDefectLinked.png')

"Step 56: Click on div objectRepository"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/div_objectRepository_1'))

WebUI.takeScreenshot(reportLocation + '/TC80/Step 56-Click on div objectRepository.png')

"Step 57: Click on div objectRepositoryImage"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/div_objectRepositoryImage'))

WebUI.takeScreenshot(reportLocation + '/TC80/Step 57-Click on div objectRepositoryImage.png')

"Step 58: Click on div dynamicObject (Object) -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions_test_result/div_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions_test_result/div_dynamicObject', ['div_dynamicObject_class': div_dynamicObject_class_2]))

WebUI.takeScreenshot(reportLocation + '/TC80/Step 58-Click on div dynamicObject Object - Navigate to page .png')

"Step 59: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC80-View Test Run Details and Verify Home Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}