import katalon.truetest.TrueTestScripts
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.configuration.RunConfiguration
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import internal.GlobalVariable

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

"Step 3: Navigate to team/*/project/*/*"

TrueTestScripts.navigate("team/${GlobalVariable.team_id}/project/${GlobalVariable.project_id}/${GlobalVariable.path_param_5}")

"Step 4: Click on link dashboard -> Navigate to page 'team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_dashboard'))

WebUI.takeScreenshot(reportLocation + '/TC103/Step 4-Click on link dashboard - Navigate to page teamproject.png')

"Step 5: Click on button chooseDate"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_chooseDate'))

WebUI.takeScreenshot(reportLocation + '/TC103/Step 5-Click on button chooseDate.png')

"Step 6: Click on button aug21"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_aug21'))

WebUI.takeScreenshot(reportLocation + '/TC103/Step 6-Click on button aug21.png')

"Step 7: Click on link reports -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_reports'))

WebUI.takeScreenshot(reportLocation + '/TC103/Step 7-Click on link reports - Navigate to page teamproject.png')

"Step 8: Click on link testRuns2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_testRuns2'))

WebUI.takeScreenshot(reportLocation + '/TC103/Step 8-Click on link testRuns2.png')

"Step 9: Click on link testSuiteCollectionRunAllPassed -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_testSuiteCollectionRunAllPassed'))

WebUI.takeScreenshot(reportLocation + '/TC103/Step 9-Click on link testSuiteCollectionRunAllPassed - Navigate to page teamprojectexecutions.png')

"Step 10: Click on link dashboard -> Navigate to page 'team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_dashboard'))

WebUI.takeScreenshot(reportLocation + '/TC103/Step 10-Click on link dashboard - Navigate to page teamproject.png')

"Step 11: Click on link tests -> Navigate to page 'team/*/project/*/test-design/test-cases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_tests'))

WebUI.takeScreenshot(reportLocation + '/TC103/Step 11-Click on link tests - Navigate to page teamprojecttest-designtest-cases.png')

"Step 12: Click on link reports -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/link_reports'))

WebUI.takeScreenshot(reportLocation + '/TC103/Step 12-Click on link reports - Navigate to page teamproject.png')

"Step 13: Click on link testRuns2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_testRuns2'))

WebUI.takeScreenshot(reportLocation + '/TC103/Step 13-Click on link testRuns2.png')

"Step 14: Click on label passedTestSuite"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/label_passedTestSuite'))

WebUI.takeScreenshot(reportLocation + '/TC103/Step 14-Click on label passedTestSuite.png')

"Step 15: Click on link testSuiteCollectionRetryPassed"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_testSuiteCollectionRetryPassed'))

WebUI.takeScreenshot(reportLocation + '/TC103/Step 15-Click on link testSuiteCollectionRetryPassed.png')

"Step 16: Click on label passedTestSuite"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/label_passedTestSuite'))

WebUI.takeScreenshot(reportLocation + '/TC103/Step 16-Click on label passedTestSuite.png')

"Step 17: Click on label passedTestSuite2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/label_passedTestSuite2'))

WebUI.takeScreenshot(reportLocation + '/TC103/Step 17-Click on label passedTestSuite2.png')

"Step 18: Click on button passedTestSuite"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_passedTestSuite'))

WebUI.takeScreenshot(reportLocation + '/TC103/Step 18-Click on button passedTestSuite.png')

"Step 19: Click on button delete"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_delete'))

WebUI.takeScreenshot(reportLocation + '/TC103/Step 19-Click on button delete.png')

"Step 20: Click on button delete2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_save'))

WebUI.takeScreenshot(reportLocation + '/TC103/Step 20-Click on button delete2.png')

"Step 21: Click on button object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_object'))

WebUI.takeScreenshot(reportLocation + '/TC103/Step 21-Click on button object.png')

"Step 22: Click on button po"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_po'))

WebUI.takeScreenshot(reportLocation + '/TC103/Step 22-Click on button po.png')

"Step 23: Click on link signOut -> Navigate to page 'organization/*/home'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_signOut'))

WebUI.takeScreenshot(reportLocation + '/TC103/Step 23-Click on link signOut - Navigate to page organizationhome.png')

"Step 24: Click on span dxcPracticeForOracle"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_home/span_dxcPracticeForOracle'))

WebUI.takeScreenshot(reportLocation + '/TC103/Step 24-Click on span dxcPracticeForOracle.png')

"Step 25: Click on link gssItams"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_home/link_gssItams'))

WebUI.takeScreenshot(reportLocation + '/TC103/Step 25-Click on link gssItams.png')

"Step 26: Click on span dxcPracticeForOracle"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_home/span_dxcPracticeForOracle'))

WebUI.takeScreenshot(reportLocation + '/TC103/Step 26-Click on span dxcPracticeForOracle.png')

"Step 27: Click on div currentMomyOrganization012"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_home/div_currentMomyOrganization012'))

WebUI.takeScreenshot(reportLocation + '/TC103/Step 27-Click on div currentMomyOrganization012.png')

"Step 28: Click on div allMomyOrganization01"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_home/div_allMomyOrganization01'))

WebUI.takeScreenshot(reportLocation + '/TC103/Step 28-Click on div allMomyOrganization01.png')

"Step 29: Click on div welcomeToMyOrganization01"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_home/div_welcomeToMyOrganization01'))

WebUI.takeScreenshot(reportLocation + '/TC103/Step 29-Click on div welcomeToMyOrganization01.png')

"Step 30: Click on button ai"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_home/button_ai'))

WebUI.takeScreenshot(reportLocation + '/TC103/Step 30-Click on button ai.png')

"Step 31: Click on link organizationSetupConfigure"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_home/link_organizationSetupConfigure'))

WebUI.takeScreenshot(reportLocation + '/TC103/Step 31-Click on link organizationSetupConfigure.png')

"Step 32: Click on span dxcPracticeForOracle"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_home/span_dxcPracticeForOracle'))

WebUI.takeScreenshot(reportLocation + '/TC103/Step 32-Click on span dxcPracticeForOracle.png')

"Step 33: Click on div object2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_home/div_object2'))

WebUI.takeScreenshot(reportLocation + '/TC103/Step 33-Click on div object2.png')

"Step 34: Click on link ojOracleJde2 -> Navigate to page 'team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_home/link_ojOracleJde2'))

WebUI.takeScreenshot(reportLocation + '/TC103/Step 34-Click on link ojOracleJde2 - Navigate to page teamproject.png')

"Step 35: Click on link reports -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_reports'))

WebUI.takeScreenshot(reportLocation + '/TC103/Step 35-Click on link reports - Navigate to page teamproject.png')

"Step 36: Click on link testRuns2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_testRuns2'))

WebUI.takeScreenshot(reportLocation + '/TC103/Step 36-Click on link testRuns2.png')

"Step 37: Click on label passedTestSuite"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/label_passedTestSuite'))

WebUI.takeScreenshot(reportLocation + '/TC103/Step 37-Click on label passedTestSuite.png')

"Step 38: Click on button delete"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_delete'))

WebUI.takeScreenshot(reportLocation + '/TC103/Step 38-Click on button delete.png')

"Step 39: Click on button delete2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_save'))

WebUI.takeScreenshot(reportLocation + '/TC103/Step 39-Click on button delete2.png')

"Step 40: Click on button object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_object'))

WebUI.takeScreenshot(reportLocation + '/TC103/Step 40-Click on button object.png')

"Step 41: Click on div object2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_object2'))

WebUI.takeScreenshot(reportLocation + '/TC103/Step 41-Click on div object2.png')

"Step 42: Click on button po"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_po'))

WebUI.takeScreenshot(reportLocation + '/TC103/Step 42-Click on button po.png')

"Step 43: Click on link switchAccount"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_switchAccount'))

WebUI.takeScreenshot(reportLocation + '/TC103/Step 43-Click on link switchAccount.png')

"Step 44: Click on button po"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_po'))

WebUI.takeScreenshot(reportLocation + '/TC103/Step 44-Click on button po.png')

"Step 45: Click on link signOut -> Navigate to page 'organization/*/home'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_signOut'))

WebUI.takeScreenshot(reportLocation + '/TC103/Step 45-Click on link signOut - Navigate to page organizationhome.png')

"Step 46: Click on span dxcPracticeForOracle"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_home/span_dxcPracticeForOracle'))

WebUI.takeScreenshot(reportLocation + '/TC103/Step 46-Click on span dxcPracticeForOracle.png')

"Step 47: Click on div currentMomyOrganization012"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_home/div_currentMomyOrganization012'))

WebUI.takeScreenshot(reportLocation + '/TC103/Step 47-Click on div currentMomyOrganization012.png')

"Step 48: Click on link senyumS -> Navigate to page 'team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_home/link_senyumS'))

WebUI.takeScreenshot(reportLocation + '/TC103/Step 48-Click on link senyumS - Navigate to page teamproject.png')

"Step 49: Click on link reports -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_reports'))

WebUI.takeScreenshot(reportLocation + '/TC103/Step 49-Click on link reports - Navigate to page teamproject.png')

"Step 50: Click on link testRuns2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_testRuns2'))

WebUI.takeScreenshot(reportLocation + '/TC103/Step 50-Click on link testRuns2.png')

"Step 51: Click on label passedTestSuite"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/label_passedTestSuite'))

WebUI.takeScreenshot(reportLocation + '/TC103/Step 51-Click on label passedTestSuite.png')

"Step 52: Click on label passedTestSuite2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/label_passedTestSuite2'))

WebUI.takeScreenshot(reportLocation + '/TC103/Step 52-Click on label passedTestSuite2.png')

"Step 53: Click on button delete"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_delete'))

WebUI.takeScreenshot(reportLocation + '/TC103/Step 53-Click on button delete.png')

"Step 54: Click on button delete2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_save'))

WebUI.takeScreenshot(reportLocation + '/TC103/Step 54-Click on button delete2.png')

"Step 55: Click on link dashboard -> Navigate to page 'team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_dashboard'))

WebUI.takeScreenshot(reportLocation + '/TC103/Step 55-Click on link dashboard - Navigate to page teamproject.png')

"Step 56: Click on button refresh"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_refresh'))

WebUI.takeScreenshot(reportLocation + '/TC103/Step 56-Click on button refresh.png')

"Step 57: Click on button refresh"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_refresh'))

WebUI.takeScreenshot(reportLocation + '/TC103/Step 57-Click on button refresh.png')

"Step 58: Click on button chooseDate"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_chooseDate'))

WebUI.takeScreenshot(reportLocation + '/TC103/Step 58-Click on button chooseDate.png')

"Step 59: Click on button aug21"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_aug21'))

WebUI.takeScreenshot(reportLocation + '/TC103/Step 59-Click on button aug21.png')

"Step 60: Click on button refresh"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_refresh'))

WebUI.takeScreenshot(reportLocation + '/TC103/Step 60-Click on button refresh.png')

"Step 61: Click on div allTestRunsNth0"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_allTestRunsNth0'))

WebUI.takeScreenshot(reportLocation + '/TC103/Step 61-Click on div allTestRunsNth0.png')

"Step 62: Click on button chooseDate2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_chooseDate2'))

WebUI.takeScreenshot(reportLocation + '/TC103/Step 62-Click on button chooseDate2.png')

"Step 63: Click on button aug21"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_aug21'))

WebUI.takeScreenshot(reportLocation + '/TC103/Step 63-Click on button aug21.png')

"Step 64: Click on button chooseDate3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_chooseDate3'))

WebUI.takeScreenshot(reportLocation + '/TC103/Step 64-Click on button chooseDate3.png')

"Step 65: Click on div aug19"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_aug19'))

WebUI.takeScreenshot(reportLocation + '/TC103/Step 65-Click on div aug19.png')

"Step 66: Click on div aug19"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_aug19'))

WebUI.takeScreenshot(reportLocation + '/TC103/Step 66-Click on div aug19.png')

"Step 67: Click on button aug21"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_aug21'))

WebUI.takeScreenshot(reportLocation + '/TC103/Step 67-Click on button aug21.png')

"Step 68: Click on div aug19"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_aug19'))

WebUI.takeScreenshot(reportLocation + '/TC103/Step 68-Click on div aug19.png')

"Step 69: Click on button aug22"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_aug22'))

WebUI.takeScreenshot(reportLocation + '/TC103/Step 69-Click on button aug22.png')

"Step 70: Click on button chooseDate"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_chooseDate'))

WebUI.takeScreenshot(reportLocation + '/TC103/Step 70-Click on button chooseDate.png')

"Step 71: Click on button aug19"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_aug19'))

WebUI.takeScreenshot(reportLocation + '/TC103/Step 71-Click on button aug19.png')

"Step 72: Click on button chooseDate2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_chooseDate2'))

WebUI.takeScreenshot(reportLocation + '/TC103/Step 72-Click on button chooseDate2.png')

"Step 73: Click on button aug24"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_aug24'))

WebUI.takeScreenshot(reportLocation + '/TC103/Step 73-Click on button aug24.png')

"Step 74: Click on div testActivitiesFromTo"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_testActivitiesFromTo'))

WebUI.takeScreenshot(reportLocation + '/TC103/Step 74-Click on div testActivitiesFromTo.png')

"Step 75: Click on div allTestRunsNth0 -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_allTestRunsNth0'))

WebUI.takeScreenshot(reportLocation + '/TC103/Step 75-Click on div allTestRunsNth0 - Navigate to page .png')

"Step 76: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC103-Verify Home Page After Test Run Management_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}