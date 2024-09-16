import katalon.truetest.TrueTestScripts
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import internal.GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import katalon.common.closeMultipleObjects
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

"Step 3: Navigate to team/*/project/*/test-runs"

TrueTestScripts.navigate("team/${GlobalVariable.team_id}/project/${GlobalVariable.project_id}/test-runs")

"Step 4: Click on header testRunDetails (untitledTestRun285)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/header_testRunDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/header_testRunDetails', ['header_testRunDetails_internalRoleHeadingName': header_testRunDetails_internalRoleHeadingName]))

WebUI.takeScreenshot(reportLocation + '/TC401/Step 4-Click on header testRunDetails untitledTestRun285.png')

"Step 5: Click on button sessionManagement (sessions)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/button_sessionManagement"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/button_sessionManagement', ['button_sessionManagement_class': button_sessionManagement_class, 'button_sessionManagement_internalRoleTabName': button_sessionManagement_internalRoleTabName]))

WebUI.takeScreenshot(reportLocation + '/TC401/Step 5-Click on button sessionManagement sessions.png')

"Step 6: Click on div totalTests1Nth1"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_totalTests1Nth1'))

WebUI.takeScreenshot(reportLocation + '/TC401/Step 6-Click on div totalTests1Nth1.png')

"Step 7: Click on i object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/i_object'))

WebUI.takeScreenshot(reportLocation + '/TC401/Step 7-Click on i object.png')

"Step 8: Click on button sessionManagement (failedTestResults)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/button_sessionManagement"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/button_sessionManagement', ['button_sessionManagement_class': button_sessionManagement_class_1, 'button_sessionManagement_internalRoleTabName': button_sessionManagement_internalRoleTabName_1]))

WebUI.takeScreenshot(reportLocation + '/TC401/Step 8-Click on button sessionManagement failedTestResults.png')

"Step 9: Click on button sessionManagement (sessions)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/button_sessionManagement"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/button_sessionManagement', ['button_sessionManagement_class': button_sessionManagement_class_2, 'button_sessionManagement_internalRoleTabName': button_sessionManagement_internalRoleTabName_2]))

WebUI.takeScreenshot(reportLocation + '/TC401/Step 9-Click on button sessionManagement sessions.png')

"Step 10: Click on button sessionManagement (sessions0)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/button_sessionManagement"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/button_sessionManagement', ['button_sessionManagement_class': button_sessionManagement_class_3, 'button_sessionManagement_internalRoleTabName': button_sessionManagement_internalRoleTabName_3]))

WebUI.takeScreenshot(reportLocation + '/TC401/Step 10-Click on button sessionManagement sessions0.png')

"Step 11: Click on div totalTests1Nth1"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_totalTests1Nth1'))

WebUI.takeScreenshot(reportLocation + '/TC401/Step 11-Click on div totalTests1Nth1.png')

"Step 12: Click on div testRunDetails (untitledTestRun285)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_testRunDetails_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_testRunDetails_1', ['div_testRunDetails_internalHasText': div_testRunDetails_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC401/Step 12-Click on div testRunDetails untitledTestRun285.png')

"Step 13: Click on button object2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_object4'))

WebUI.takeScreenshot(reportLocation + '/TC401/Step 13-Click on button object2.png')

"Step 14: Click on div testRunDetails (object7)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_testRunDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_testRunDetails', ['div_testRunDetails_internalRoleCellName': div_testRunDetails_internalRoleCellName]))

WebUI.takeScreenshot(reportLocation + '/TC401/Step 14-Click on div testRunDetails object7.png')

"Step 15: Click on div noDataToDisplay"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_noDataToDisplay'))

WebUI.takeScreenshot(reportLocation + '/TC401/Step 15-Click on div noDataToDisplay.png')

"Step 16: Click on div testRunDetails (object7)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_testRunDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_testRunDetails', ['div_testRunDetails_internalRoleCellName': div_testRunDetails_internalRoleCellName_1]))

WebUI.takeScreenshot(reportLocation + '/TC401/Step 16-Click on div testRunDetails object7.png')

"Step 17: Click on button object2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_object4'))

WebUI.takeScreenshot(reportLocation + '/TC401/Step 17-Click on button object2.png')

"Step 18: Click on div testRunDetails (object7)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_testRunDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_testRunDetails', ['div_testRunDetails_internalRoleCellName': div_testRunDetails_internalRoleCellName_2]))

WebUI.takeScreenshot(reportLocation + '/TC401/Step 18-Click on div testRunDetails object7.png')

"Step 19: Click on button details -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_details'))

WebUI.takeScreenshot(reportLocation + '/TC401/Step 19-Click on button details - Navigate to page teamprojectexecutions.png')

"Step 20: Click on link testResults6 -> Navigate to page 'team/*/project/*/executions/*/test-runs'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_testResults6'))

WebUI.takeScreenshot(reportLocation + '/TC401/Step 20-Click on link testResults6 - Navigate to page teamprojectexecutionstest-runs.png')

"Step 21: Click on div object2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_runs/div_object2'))

WebUI.takeScreenshot(reportLocation + '/TC401/Step 21-Click on div object2.png')

"Step 22: Close multiple objects in the project interface."

closeMultipleObjects.execute(data_path_0, Integer.valueOf(index_0))

"Step 23: Click on button testRunActions (object2) -> Navigate to page 'team/*/project/*/executions/*/test-result/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions_test_runs/button_testRunActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions_test_runs/button_testRunActions', ['button_testRunActions_class': button_testRunActions_class]))

WebUI.takeScreenshot(reportLocation + '/TC401/Step 23-Click on button testRunActions object2 - Navigate to page teamprojectexecutionstest-result.png')

"Step 24: Click on div thumbnailDetails (object)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions_test_result/div_thumbnailDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions_test_result/div_thumbnailDetails', ['div_thumbnailDetails_class': div_thumbnailDetails_class]))

WebUI.takeScreenshot(reportLocation + '/TC401/Step 24-Click on div thumbnailDetails object.png')

"Step 25: Click on div object2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/div_object2_1'))

WebUI.takeScreenshot(reportLocation + '/TC401/Step 25-Click on div object2.png')

"Step 26: Click on div object3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/div_object3'))

WebUI.takeScreenshot(reportLocation + '/TC401/Step 26-Click on div object3.png')

"Step 27: Click on div thumbnailDetails (object)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions_test_result/div_thumbnailDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions_test_result/div_thumbnailDetails', ['div_thumbnailDetails_class': div_thumbnailDetails_class_1]))

WebUI.takeScreenshot(reportLocation + '/TC401/Step 27-Click on div thumbnailDetails object.png')

"Step 28: Click on div object2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/div_object2_1'))

WebUI.takeScreenshot(reportLocation + '/TC401/Step 28-Click on div object2.png')

"Step 29: Click on image object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/image_object_1'))

WebUI.takeScreenshot(reportLocation + '/TC401/Step 29-Click on image object.png')

"Step 30: Click on div object2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/div_object2_1'))

WebUI.takeScreenshot(reportLocation + '/TC401/Step 30-Click on div object2.png')

"Step 31: Click on div object3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/div_object3'))

WebUI.takeScreenshot(reportLocation + '/TC401/Step 31-Click on div object3.png')

"Step 32: Click on div object4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/div_object4'))

WebUI.takeScreenshot(reportLocation + '/TC401/Step 32-Click on div object4.png')

"Step 33: Click on link requests -> Navigate to page 'team/*/project/*/executions/*/test-result/*/requests'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/link_requests'))

WebUI.takeScreenshot(reportLocation + '/TC401/Step 33-Click on link requests - Navigate to page teamprojectexecutionstest-resultrequests.png')

"Step 34: Click on link testObjects -> Navigate to page 'team/*/project/*/executions/*/test-result/*/test-objects'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*/requests?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result_requests/link_testObjects'))

WebUI.takeScreenshot(reportLocation + '/TC401/Step 34-Click on link testObjects - Navigate to page teamprojectexecutionstest-resulttest-objects.png')

"Step 35: Click on link similarFailures -> Navigate to page 'team/*/project/*/executions/*/test-result/*/similar-failures'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*/test-objects?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result_test_objects/link_similarFailures'))

WebUI.takeScreenshot(reportLocation + '/TC401/Step 35-Click on link similarFailures - Navigate to page teamprojectexecutionstest-resultsimilar-failures.png')

"Step 36: Click on link comments -> Navigate to page 'team/*/project/*/executions/*/test-result/*/comments'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*/similar-failures?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result_similar_failures/link_comments'))

WebUI.takeScreenshot(reportLocation + '/TC401/Step 36-Click on link comments - Navigate to page teamprojectexecutionstest-resultcomments.png')

"Step 37: Click on link reRuns -> Navigate to page 'team/*/project/*/executions/*/test-result/*/re-runs'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*/comments?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result_comments/link_reRuns'))

WebUI.takeScreenshot(reportLocation + '/TC401/Step 37-Click on link reRuns - Navigate to page teamprojectexecutionstest-resultre-runs.png')

"Step 38: Click on time failedSignin"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*/re-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result_re_runs/time_failedSignin'))

WebUI.takeScreenshot(reportLocation + '/TC401/Step 38-Click on time failedSignin.png')

"Step 39: Click on link reRuns"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*/re-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result_re_runs/link_reRuns'))

WebUI.takeScreenshot(reportLocation + '/TC401/Step 39-Click on link reRuns.png')

"Step 40: Click on time failedSignin"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*/re-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result_re_runs/time_failedSignin'))

WebUI.takeScreenshot(reportLocation + '/TC401/Step 40-Click on time failedSignin.png')

"Step 41: Click on div object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*/re-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result_re_runs/div_object'))

WebUI.takeScreenshot(reportLocation + '/TC401/Step 41-Click on div object.png')

"Step 42: Click on div createdWithSketch"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*/re-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result_re_runs/div_createdWithSketch'))

WebUI.takeScreenshot(reportLocation + '/TC401/Step 42-Click on div createdWithSketch.png')

"Step 43: Click on div object2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*/re-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result_re_runs/div_object2'))

WebUI.takeScreenshot(reportLocation + '/TC401/Step 43-Click on div object2.png')

"Step 44: Click on div object3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*/re-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result_re_runs/div_object3'))

WebUI.takeScreenshot(reportLocation + '/TC401/Step 44-Click on div object3.png')

"Step 45: Click on div object4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*/re-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result_re_runs/div_object4'))

WebUI.takeScreenshot(reportLocation + '/TC401/Step 45-Click on div object4.png')

"Step 46: Click on link result -> Navigate to page 'team/*/project/*/executions/*/test-result/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*/re-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result_re_runs/link_result_1'))

WebUI.takeScreenshot(reportLocation + '/TC401/Step 46-Click on link result - Navigate to page teamprojectexecutionstest-result.png')

"Step 47: Click on div errorMessage"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/div_errorMessage'))

WebUI.takeScreenshot(reportLocation + '/TC401/Step 47-Click on div errorMessage.png')

"Step 48: Click on div object5 -> Navigate to page 'team/*/project/*/executions/*/test-runs'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/div_object5'))

WebUI.takeScreenshot(reportLocation + '/TC401/Step 48-Click on div object5 - Navigate to page teamprojectexecutionstest-runs.png')

"Step 49: Click on div object2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_runs/div_object2'))

WebUI.takeScreenshot(reportLocation + '/TC401/Step 49-Click on div object2.png')

"Step 50: Click on link object -> Navigate to page 'team/*/project/*/executions/*/test-result/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_runs/link_object'))

WebUI.takeScreenshot(reportLocation + '/TC401/Step 50-Click on link object - Navigate to page teamprojectexecutionstest-result.png')

"Step 51: Click on link result"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/link_result'))

WebUI.takeScreenshot(reportLocation + '/TC401/Step 51-Click on link result.png')

"Step 52: Click on div object6"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/div_object6'))

WebUI.takeScreenshot(reportLocation + '/TC401/Step 52-Click on div object6.png')

"Step 53: Click on div object7"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/div_object7'))

WebUI.takeScreenshot(reportLocation + '/TC401/Step 53-Click on div object7.png')

"Step 54: Click on div thumbnailDetails (thumbnailImage) -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions_test_result/div_thumbnailDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions_test_result/div_thumbnailDetails', ['div_thumbnailDetails_class': div_thumbnailDetails_class_2]))

WebUI.takeScreenshot(reportLocation + '/TC401/Step 54-Click on div thumbnailDetails thumbnailImage - Navigate to page .png')

"Step 55: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC401-Close Multiple Objects in Project Interface_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}