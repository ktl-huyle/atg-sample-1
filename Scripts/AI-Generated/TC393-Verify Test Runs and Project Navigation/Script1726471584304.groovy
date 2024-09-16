import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import internal.GlobalVariable
import com.kms.katalon.core.configuration.RunConfiguration
import katalon.truetest.TrueTestScripts

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

"Step 3: Navigate to organization/*/home"

TrueTestScripts.navigate("organization/${GlobalVariable.organization_id}/home")

"Step 4: Click on link testRuns (71Ava) -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/link_testRuns"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/link_testRuns', ['link_testRuns_nthChild': link_testRuns_nthChild, 'link_testRuns_class': link_testRuns_class, 'link_testRuns_internalRoleLinkName': link_testRuns_internalRoleLinkName, 'link_testRuns_executions_id': link_testRuns_executions_id, 'link_testRuns_team_id': link_testRuns_team_id, 'link_testRuns_project_id': link_testRuns_project_id]))

WebUI.takeScreenshot(reportLocation + '/TC393/Step 4-Click on link testRuns 71Ava - Navigate to page teamprojectexecutions.png')

"Step 5: Click on link testResults4 -> Navigate to page 'team/*/project/*/executions/*/test-runs'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_testResults4'))

WebUI.takeScreenshot(reportLocation + '/TC393/Step 5-Click on link testResults4 - Navigate to page teamprojectexecutionstest-runs.png')

"Step 6: Click on link files2 -> Navigate to page 'team/*/project/*/executions/*/files'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_runs/link_files2'))

WebUI.takeScreenshot(reportLocation + '/TC393/Step 6-Click on link files2 - Navigate to page teamprojectexecutionsfiles.png')

"Step 7: Click on link defects -> Navigate to page 'team/*/project/*/executions/*/defect'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/files?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_files/link_defects'))

WebUI.takeScreenshot(reportLocation + '/TC393/Step 7-Click on link defects - Navigate to page teamprojectexecutionsdefect.png')

"Step 8: Click on div object -> Navigate to page 'team/*/project/*/executions/*/files'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/defect?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_defect/div_object'))

WebUI.takeScreenshot(reportLocation + '/TC393/Step 8-Click on div object - Navigate to page teamprojectexecutionsfiles.png')

"Step 9: Click on link testRuns -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/files?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_files/link_testRuns'))

WebUI.takeScreenshot(reportLocation + '/TC393/Step 9-Click on link testRuns - Navigate to page teamproject.png')

"Step 10: Click on link testRuns7"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_testRuns7'))

WebUI.takeScreenshot(reportLocation + '/TC393/Step 10-Click on link testRuns7.png')

"Step 11: Click on link executionObjects (executions10) -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_executionObjects"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_executionObjects', ['link_executionObjects_trNthChild': link_executionObjects_trNthChild, 'link_executionObjects_internalRoleLinkName': link_executionObjects_internalRoleLinkName, 'link_executionObjects_executions_id': link_executionObjects_executions_id, 'link_executionObjects_project_id': link_executionObjects_project_id, 'link_executionObjects_team_id': link_executionObjects_team_id]))

WebUI.takeScreenshot(reportLocation + '/TC393/Step 11-Click on link executionObjects executions10 - Navigate to page teamprojectexecutions.png')

"Step 12: Click on div object3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_object3'))

WebUI.takeScreenshot(reportLocation + '/TC393/Step 12-Click on div object3.png')

"Step 13: Click on div object3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_object3'))

WebUI.takeScreenshot(reportLocation + '/TC393/Step 13-Click on div object3.png')

"Step 14: Click on link testResults5 -> Navigate to page 'team/*/project/*/executions/*/test-runs'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_testResults5'))

WebUI.takeScreenshot(reportLocation + '/TC393/Step 14-Click on link testResults5 - Navigate to page teamprojectexecutionstest-runs.png')

"Step 15: Click on link summary2 -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_runs/link_summary2'))

WebUI.takeScreenshot(reportLocation + '/TC393/Step 15-Click on link summary2 - Navigate to page teamprojectexecutions.png')

"Step 16: Click on link summary"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_summary'))

WebUI.takeScreenshot(reportLocation + '/TC393/Step 16-Click on link summary.png')

"Step 17: Click on link testResults5 -> Navigate to page 'team/*/project/*/executions/*/test-runs'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_testResults5'))

WebUI.takeScreenshot(reportLocation + '/TC393/Step 17-Click on link testResults5 - Navigate to page teamprojectexecutionstest-runs.png')

"Step 18: Click on link summary2 -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_runs/link_summary2'))

WebUI.takeScreenshot(reportLocation + '/TC393/Step 18-Click on link summary2 - Navigate to page teamprojectexecutions.png')

"Step 19: Click on link testRuns3 -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_testRuns3'))

WebUI.takeScreenshot(reportLocation + '/TC393/Step 19-Click on link testRuns3 - Navigate to page teamproject.png')

"Step 20: Click on link testRuns7"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_testRuns7'))

WebUI.takeScreenshot(reportLocation + '/TC393/Step 20-Click on link testRuns7.png')

"Step 21: Click on link overview"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_overview'))

WebUI.takeScreenshot(reportLocation + '/TC393/Step 21-Click on link overview.png')

"Step 22: Click on link projectNavigation (testRuns8)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_projectNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_projectNavigation', ['link_projectNavigation_internalRoleLinkName': link_projectNavigation_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC393/Step 22-Click on link projectNavigation testRuns8.png')

"Step 23: Click on link dashboard3 -> Navigate to page 'team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_dashboard3'))

WebUI.takeScreenshot(reportLocation + '/TC393/Step 23-Click on link dashboard3 - Navigate to page teamproject.png')

"Step 24: Click on body object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/body_object'))

WebUI.takeScreenshot(reportLocation + '/TC393/Step 24-Click on body object.png')

"Step 25: Click on link dashboard4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_dashboard4'))

WebUI.takeScreenshot(reportLocation + '/TC393/Step 25-Click on link dashboard4.png')

"Step 26: Click on link tests3 -> Navigate to page 'team/*/project/*/test-design/test-cases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_tests3'))

WebUI.takeScreenshot(reportLocation + '/TC393/Step 26-Click on link tests3 - Navigate to page teamprojecttest-designtest-cases.png')

"Step 27: Click on link executions2 -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/link_executions2_1'))

WebUI.takeScreenshot(reportLocation + '/TC393/Step 27-Click on link executions2 - Navigate to page teamproject.png')

"Step 28: Click on header projectObjects (object7)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/header_projectObjects"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/header_projectObjects', ['header_projectObjects_internalRoleHeadingName': header_projectObjects_internalRoleHeadingName]))

WebUI.takeScreenshot(reportLocation + '/TC393/Step 28-Click on header projectObjects object7.png')

"Step 29: Click on button details -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_details'))

WebUI.takeScreenshot(reportLocation + '/TC393/Step 29-Click on button details - Navigate to page teamprojectexecutions.png')

"Step 30: Click on label needReview -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/label_needReview'))

WebUI.takeScreenshot(reportLocation + '/TC393/Step 30-Click on label needReview - Navigate to page teamproject.png')

"Step 31: Click on button object6"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_object6'))

WebUI.takeScreenshot(reportLocation + '/TC393/Step 31-Click on button object6.png')

"Step 32: Click on link executions11"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_executions11'))

WebUI.takeScreenshot(reportLocation + '/TC393/Step 32-Click on link executions11.png')

"Step 33: Click on button projectActions (alloy)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_projectActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_projectActions', ['button_projectActions_internalRoleButtonName': button_projectActions_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC393/Step 33-Click on button projectActions alloy.png')

"Step 34: Click on link tests4 -> Navigate to page 'team/*/project/*/test-design/test-cases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_tests4'))

WebUI.takeScreenshot(reportLocation + '/TC393/Step 34-Click on link tests4 - Navigate to page teamprojecttest-designtest-cases.png')

"Step 35: Click on span objectElements (object6)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_objectElements"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_objectElements', ['span_objectElements_divNthChild': span_objectElements_divNthChild]))

WebUI.takeScreenshot(reportLocation + '/TC393/Step 35-Click on span objectElements object6.png')

"Step 36: Click on span objectElements (object7)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_objectElements'))

WebUI.takeScreenshot(reportLocation + '/TC393/Step 36-Click on span objectElements object7.png')

"Step 37: Click on span objectElements (object8)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_objectElements'))

WebUI.takeScreenshot(reportLocation + '/TC393/Step 37-Click on span objectElements object8.png')

"Step 38: Click on span objectElements (object9)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_objectElements"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_objectElements', ['span_objectElements_divNthChild': span_objectElements_divNthChild_1]))

WebUI.takeScreenshot(reportLocation + '/TC393/Step 38-Click on span objectElements object9.png')

"Step 39: Click on span objectDetails (object10)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_objectDetails_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_objectDetails_1', ['span_objectDetails_divNthChild': span_objectDetails_divNthChild]))

WebUI.takeScreenshot(reportLocation + '/TC393/Step 39-Click on span objectDetails object10.png')

"Step 40: Click on link dashboard -> Navigate to page 'team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/link_dashboard_1'))

WebUI.takeScreenshot(reportLocation + '/TC393/Step 40-Click on link dashboard - Navigate to page teamproject.png')

"Step 41: Click on link planning2 -> Navigate to page 'team/*/project/*/releases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_planning2'))

WebUI.takeScreenshot(reportLocation + '/TC393/Step 41-Click on link planning2 - Navigate to page teamprojectreleases.png')

"Step 42: Click on link tests3 -> Navigate to page 'team/*/project/*/test-design/test-cases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/releases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_releases/link_tests3'))

WebUI.takeScreenshot(reportLocation + '/TC393/Step 42-Click on link tests3 - Navigate to page teamprojecttest-designtest-cases.png')

"Step 43: Click on link tests"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/link_tests'))

WebUI.takeScreenshot(reportLocation + '/TC393/Step 43-Click on link tests.png')

"Step 44: Click on item object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/item_object'))

WebUI.takeScreenshot(reportLocation + '/TC393/Step 44-Click on item object.png')

"Step 45: Click on link testSuites2 -> Navigate to page 'team/*/project/*/test-design/test-suites'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/link_testSuites2_1'))

WebUI.takeScreenshot(reportLocation + '/TC393/Step 45-Click on link testSuites2 - Navigate to page teamprojecttest-designtest-suites.png')

"Step 46: Click on link testObjects2 -> Navigate to page 'team/*/project/*/test-design/test-objects'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-suites?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_suites/link_testObjects2'))

WebUI.takeScreenshot(reportLocation + '/TC393/Step 46-Click on link testObjects2 - Navigate to page teamprojecttest-designtest-objects.png')

"Step 47: Click on link testSettings (executions) -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-objects?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_objects/link_testSettings"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_objects/link_testSettings', ['link_testSettings_internalRoleLinkName': link_testSettings_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC393/Step 47-Click on link testSettings executions - Navigate to page teamproject.png')

"Step 48: Click on header projectObjects (object7)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/header_projectObjects"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/header_projectObjects', ['header_projectObjects_internalRoleHeadingName': header_projectObjects_internalRoleHeadingName_1]))

WebUI.takeScreenshot(reportLocation + '/TC393/Step 48-Click on header projectObjects object7.png')

"Step 49: Click on button object6"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_object6'))

WebUI.takeScreenshot(reportLocation + '/TC393/Step 49-Click on button object6.png')

"Step 50: Click on header projectObjects (object8)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/header_projectObjects"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/header_projectObjects', ['header_projectObjects_internalRoleHeadingName': header_projectObjects_internalRoleHeadingName_2]))

WebUI.takeScreenshot(reportLocation + '/TC393/Step 50-Click on header projectObjects object8.png')

"Step 51: Click on div object43"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_object43'))

WebUI.takeScreenshot(reportLocation + '/TC393/Step 51-Click on div object43.png')

"Step 52: Click on button object6"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_object6'))

WebUI.takeScreenshot(reportLocation + '/TC393/Step 52-Click on button object6.png')

"Step 53: Click on header projectObjects (object9)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/header_projectObjects"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/header_projectObjects', ['header_projectObjects_internalRoleHeadingName': header_projectObjects_internalRoleHeadingName_3]))

WebUI.takeScreenshot(reportLocation + '/TC393/Step 53-Click on header projectObjects object9.png')

"Step 54: Click on button object6"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_object6'))

WebUI.takeScreenshot(reportLocation + '/TC393/Step 54-Click on button object6.png')

"Step 55: Click on button object7"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_object7'))

WebUI.takeScreenshot(reportLocation + '/TC393/Step 55-Click on button object7.png')

"Step 56: Click on button object7"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_object7'))

WebUI.takeScreenshot(reportLocation + '/TC393/Step 56-Click on button object7.png')

"Step 57: Click on input dateRange"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_dateRange'))

WebUI.takeScreenshot(reportLocation + '/TC393/Step 57-Click on input dateRange.png')

"Step 58: Click on body object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/body_object'))

WebUI.takeScreenshot(reportLocation + '/TC393/Step 58-Click on body object.png')

"Step 59: Click on div objectComponents (object44)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_objectComponents"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_objectComponents', ['div_objectComponents_class': div_objectComponents_class]))

WebUI.takeScreenshot(reportLocation + '/TC393/Step 59-Click on div objectComponents object44.png')

"Step 60: Click on div object45"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_object45'))

WebUI.takeScreenshot(reportLocation + '/TC393/Step 60-Click on div object45.png')

"Step 61: Click on div object46"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_object46'))

WebUI.takeScreenshot(reportLocation + '/TC393/Step 61-Click on div object46.png')

"Step 62: Click on body object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/body_object'))

WebUI.takeScreenshot(reportLocation + '/TC393/Step 62-Click on body object.png')

"Step 63: Click on div objectComponents (object44)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_objectComponents"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_objectComponents', ['div_objectComponents_class': div_objectComponents_class_1]))

WebUI.takeScreenshot(reportLocation + '/TC393/Step 63-Click on div objectComponents object44.png')

"Step 64: Click on input executor"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_executor'))

WebUI.takeScreenshot(reportLocation + '/TC393/Step 64-Click on input executor.png')

"Step 65: Click on div object47"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_object47'))

WebUI.takeScreenshot(reportLocation + '/TC393/Step 65-Click on div object47.png')

"Step 66: Click on label status"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/label_status'))

WebUI.takeScreenshot(reportLocation + '/TC393/Step 66-Click on label status.png')

"Step 67: Click on body object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/body_object'))

WebUI.takeScreenshot(reportLocation + '/TC393/Step 67-Click on body object.png')

"Step 68: Click on div objectComponents (object44)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_objectComponents"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_objectComponents', ['div_objectComponents_class': div_objectComponents_class_2]))

WebUI.takeScreenshot(reportLocation + '/TC393/Step 68-Click on div objectComponents object44.png')

"Step 69: Click on div object48"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_object48'))

WebUI.takeScreenshot(reportLocation + '/TC393/Step 69-Click on div object48.png')

"Step 70: Click on input dateRange"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_dateRange'))

WebUI.takeScreenshot(reportLocation + '/TC393/Step 70-Click on input dateRange.png')

"Step 71: Click on button objectActions (object8)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_objectActions_4"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_objectActions_4', ['button_objectActions_class': button_objectActions_class]))

WebUI.takeScreenshot(reportLocation + '/TC393/Step 71-Click on button objectActions object8.png')

"Step 72: Click on div testRunStatus (historyScheduleTestRunTimeStatusAllStatus)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_testRunStatus"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_testRunStatus', ['div_testRunStatus_internalText': div_testRunStatus_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC393/Step 72-Click on div testRunStatus historyScheduleTestRunTimeStatusAllStatus.png')

"Step 73: Click on button object7"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_object7'))

WebUI.takeScreenshot(reportLocation + '/TC393/Step 73-Click on button object7.png')

"Step 74: Click on button object7"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_object7'))

WebUI.takeScreenshot(reportLocation + '/TC393/Step 74-Click on button object7.png')

"Step 75: Click on button object7"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_object7'))

WebUI.takeScreenshot(reportLocation + '/TC393/Step 75-Click on button object7.png')

"Step 76: Click on body object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/body_object'))

WebUI.takeScreenshot(reportLocation + '/TC393/Step 76-Click on body object.png')

"Step 77: Click on div objectComponents (object49)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_objectComponents"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_objectComponents', ['div_objectComponents_class': div_objectComponents_class_3]))

WebUI.takeScreenshot(reportLocation + '/TC393/Step 77-Click on div objectComponents object49.png')

"Step 78: Click on input dateRange"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_dateRange'))

WebUI.takeScreenshot(reportLocation + '/TC393/Step 78-Click on input dateRange.png')

"Step 79: Click on button monthNavigation (previousMonth)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_monthNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_monthNavigation', ['button_monthNavigation_class': button_monthNavigation_class, 'button_monthNavigation_internalRoleButtonName': button_monthNavigation_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC393/Step 79-Click on button monthNavigation previousMonth.png')

"Step 80: Click on button objectActions (object9)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_objectActions_4"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_objectActions_4', ['button_objectActions_class': button_objectActions_class_1]))

WebUI.takeScreenshot(reportLocation + '/TC393/Step 80-Click on button objectActions object9.png')

"Step 81: Click on div object47 -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_object47'))

WebUI.takeScreenshot(reportLocation + '/TC393/Step 81-Click on div object47 - Navigate to page .png')

"Step 82: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC393-Verify Test Runs and Project Navigation_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}