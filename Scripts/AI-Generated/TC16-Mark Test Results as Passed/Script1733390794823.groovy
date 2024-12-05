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

"Step 3: Navigate to team/*/project/*/executions/*"

TrueTestScripts.navigate("team/${GlobalVariable.team_id}/project/${GlobalVariable.project_id}/executions/${GlobalVariable.executions_id}")

"Step 4: Click on button testResultDetails (testResultDetails)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/button_testResultDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/button_testResultDetails', ['button_testResultDetails_class': button_testResultDetails_class, 'button_testResultDetails_internalRoleButtonName': button_testResultDetails_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 4-Click on button testResultDetails testResultDetails.png')

"Step 5: Click on button testResultDetails (testResultDetails2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/button_testResultDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/button_testResultDetails', ['button_testResultDetails_class': button_testResultDetails_class_1, 'button_testResultDetails_internalRoleButtonName': button_testResultDetails_internalRoleButtonName_1]))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 5-Click on button testResultDetails testResultDetails2.png')

"Step 6: Click on button testResultDetails (testResultDetails3) -> Navigate to page 'team/*/project/*/executions/*/test-result/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/button_testResultDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/button_testResultDetails', ['button_testResultDetails_class': button_testResultDetails_class_2, 'button_testResultDetails_internalRoleButtonName': button_testResultDetails_internalRoleButtonName_2]))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 6-Click on button testResultDetails testResultDetails3 - Navigate to page teamprojectexecutionstest-result.png')

"Step 7: Click on button markAsPassed"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/button_markAsPassed'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 7-Click on button markAsPassed.png')

"Step 8: Click on label changeTestResult"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/label_changeTestResult'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 8-Click on label changeTestResult.png')

"Step 9: Click on button submitResult"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/button_submitResult'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 9-Click on button submitResult.png')

"Step 10: Click on button markAsPassed"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/button_markAsPassed'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 10-Click on button markAsPassed.png')

"Step 11: Click on label changeTestResult"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/label_changeTestResult'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 11-Click on label changeTestResult.png')

"Step 12: Click on button submitResult"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/button_submitResult'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 12-Click on button submitResult.png')

"Step 13: Click on button markAsPassed"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/button_markAsPassed'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 13-Click on button markAsPassed.png')

"Step 14: Click on label changeTestResult"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/label_changeTestResult'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 14-Click on label changeTestResult.png')

"Step 15: Click on button submitResult"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/button_submitResult'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 15-Click on button submitResult.png')

"Step 16: Click on button markAsPassed"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/button_markAsPassed'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 16-Click on button markAsPassed.png')

"Step 17: Click on label changeTestResult"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/label_changeTestResult'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 17-Click on label changeTestResult.png')

"Step 18: Click on button submitResult2 -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/button_submitResult'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 18-Click on button submitResult2 - Navigate to page teamprojectexecutions.png')

"Step 19: Click on button testResultDetails (testResultDetails4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/button_testResultDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/button_testResultDetails', ['button_testResultDetails_class': button_testResultDetails_class_3, 'button_testResultDetails_internalRoleButtonName': button_testResultDetails_internalRoleButtonName_3]))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 19-Click on button testResultDetails testResultDetails4.png')

"Step 20: Click on button testResultDetails (testResultDetails5)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/button_testResultDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/button_testResultDetails', ['button_testResultDetails_class': button_testResultDetails_class_4, 'button_testResultDetails_internalRoleButtonName': button_testResultDetails_internalRoleButtonName_4]))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 20-Click on button testResultDetails testResultDetails5.png')

"Step 21: Click on button testResultDetails (testResultDetails6)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/button_testResultDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/button_testResultDetails', ['button_testResultDetails_class': button_testResultDetails_class_5, 'button_testResultDetails_internalRoleButtonName': button_testResultDetails_internalRoleButtonName_5]))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 21-Click on button testResultDetails testResultDetails6.png')

"Step 22: Click on button testResultDetails (testResultDetails7)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/button_testResultDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/button_testResultDetails', ['button_testResultDetails_class': button_testResultDetails_class_6, 'button_testResultDetails_internalRoleButtonName': button_testResultDetails_internalRoleButtonName_6]))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 22-Click on button testResultDetails testResultDetails7.png')

"Step 23: Click on button testResultDetails (testResultDetails8)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/button_testResultDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/button_testResultDetails', ['button_testResultDetails_class': button_testResultDetails_class_7, 'button_testResultDetails_internalRoleButtonName': button_testResultDetails_internalRoleButtonName_7]))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 23-Click on button testResultDetails testResultDetails8.png')

"Step 24: Click on button testResultDetails (testResultDetails9)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/button_testResultDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/button_testResultDetails', ['button_testResultDetails_class': button_testResultDetails_class_8, 'button_testResultDetails_internalRoleButtonName': button_testResultDetails_internalRoleButtonName_8]))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 24-Click on button testResultDetails testResultDetails9.png')

"Step 25: Click on button testResultDetails (testResultDetails10) -> Navigate to page 'team/*/project/*/executions/*/test-result/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/button_testResultDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/button_testResultDetails', ['button_testResultDetails_class': button_testResultDetails_class_9, 'button_testResultDetails_internalRoleButtonName': button_testResultDetails_internalRoleButtonName_9]))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 25-Click on button testResultDetails testResultDetails10 - Navigate to page teamprojectexecutionstest-result.png')

"Step 26: Click on button markAsPassed"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/button_markAsPassed'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 26-Click on button markAsPassed.png')

"Step 27: Click on label changeTestResult"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/label_changeTestResult'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 27-Click on label changeTestResult.png')

"Step 28: Click on button submitResult"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/button_submitResult'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 28-Click on button submitResult.png')

"Step 29: Click on button markAsPassed"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/button_markAsPassed'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 29-Click on button markAsPassed.png')

"Step 30: Click on label changeTestResult"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/label_changeTestResult'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 30-Click on label changeTestResult.png')

"Step 31: Click on button submitResult"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/button_submitResult'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 31-Click on button submitResult.png')

"Step 32: Click on button markAsPassed"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/button_markAsPassed'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 32-Click on button markAsPassed.png')

"Step 33: Click on label changeTestResult"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/label_changeTestResult'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 33-Click on label changeTestResult.png')

"Step 34: Click on button submitResult"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/button_submitResult'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 34-Click on button submitResult.png')

"Step 35: Click on button markAsPassed"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/button_markAsPassed'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 35-Click on button markAsPassed.png')

"Step 36: Click on label changeTestResult"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/label_changeTestResult'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 36-Click on label changeTestResult.png')

"Step 37: Click on button submitResult"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/button_submitResult'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 37-Click on button submitResult.png')

"Step 38: Click on button markAsPassed"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/button_markAsPassed'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 38-Click on button markAsPassed.png')

"Step 39: Click on div expectedResult"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/div_expectedResult'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 39-Click on div expectedResult.png')

"Step 40: Click on label changeTestResult"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/label_changeTestResult'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 40-Click on label changeTestResult.png')

"Step 41: Click on button submitResult"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/button_submitResult'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 41-Click on button submitResult.png')

"Step 42: Click on button markAsPassed"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/button_markAsPassed'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 42-Click on button markAsPassed.png')

"Step 43: Click on label changeTestResult"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/label_changeTestResult'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 43-Click on label changeTestResult.png')

"Step 44: Click on button submitResult"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/button_submitResult'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 44-Click on button submitResult.png')

"Step 45: Click on button markAsPassed"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/button_markAsPassed'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 45-Click on button markAsPassed.png')

"Step 46: Click on label changeTestResult"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/label_changeTestResult'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 46-Click on label changeTestResult.png')

"Step 47: Click on button submitResult2 -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/button_submitResult'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 47-Click on button submitResult2 - Navigate to page teamprojectexecutions.png')

"Step 48: Click on button testResultDetails (testResultDetails11)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/button_testResultDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/button_testResultDetails', ['button_testResultDetails_class': button_testResultDetails_class_10]))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 48-Click on button testResultDetails testResultDetails11.png')

"Step 49: Click on button testResultDetails (testResultDetails12)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/button_testResultDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/button_testResultDetails', ['button_testResultDetails_class': button_testResultDetails_class_11]))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 49-Click on button testResultDetails testResultDetails12.png')

"Step 50: Click on button careContinuityPortals (CareContinuityPortals2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/button_careContinuityPortals"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/button_careContinuityPortals', ['button_careContinuityPortals_internalRoleButtonName': button_careContinuityPortals_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 50-Click on button careContinuityPortals CareContinuityPortals2.png')

"Step 51: Click on link insightly -> Navigate to page 'team/*/project/*/executions/*/test-result/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_insightly'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 51-Click on link insightly - Navigate to page teamprojectexecutionstest-result.png')

"Step 52: Click on button markAsPassed"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/button_markAsPassed'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 52-Click on button markAsPassed.png')

"Step 53: Click on label changeTestResult"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/label_changeTestResult'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 53-Click on label changeTestResult.png')

"Step 54: Click on button submitResult"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/button_submitResult'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 54-Click on button submitResult.png')

"Step 55: Click on button markAsPassed"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/button_markAsPassed'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 55-Click on button markAsPassed.png')

"Step 56: Click on label changeTestResult"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/label_changeTestResult'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 56-Click on label changeTestResult.png')

"Step 57: Click on button submitResult3 -> Navigate to page 'organization/*/home'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-result/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/button_submitResult'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 57-Click on button submitResult3 - Navigate to page organizationhome.png')

"Step 58: Click on link projectExecutions (TestExecution)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/link_projectExecutions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/link_projectExecutions', ['link_projectExecutions_internalRoleLinkName': link_projectExecutions_internalRoleLinkName, 'team_id': team_id, 'executions_id': executions_id, 'project_id': project_id]))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 58-Click on link projectExecutions TestExecution.png')

"Step 59: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC16-Mark Test Results as Passed_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}