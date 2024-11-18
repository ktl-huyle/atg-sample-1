import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import truetest.custom.TrueTestScripts
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

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

TrueTestScripts.navigate("organization/*/home")

"Step 4: Click on link projectLinks (SC SynergyCareManager) -> Navigate to page 'team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/link_projectLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/link_projectLinks', ['link_projectLinks_internalRoleLinkName': link_projectLinks_internalRoleLinkName, 'project_id': project_id, 'team_id': team_id]))

WebUI.takeScreenshot(reportLocation + '/TC59/Step 4-Click on link projectLinks SC SynergyCareManager - Navigate to page teamproject.png')

"Step 5: Click on button EnableJiraIntegration -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_EnableJiraIntegration'))

WebUI.takeScreenshot(reportLocation + '/TC59/Step 5-Click on button EnableJiraIntegration - Navigate to page teamproject.png')

"Step 6: Click on link JiraAddOn"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_JiraAddOn'))

WebUI.takeScreenshot(reportLocation + '/TC59/Step 6-Click on link JiraAddOn.png')

"Step 7: Click on link JiraAddOn"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_JiraAddOn'))

WebUI.takeScreenshot(reportLocation + '/TC59/Step 7-Click on link JiraAddOn.png')

"Step 8: Click on div YouNeedToFillInAll"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_YouNeedToFillInAll'))

WebUI.takeScreenshot(reportLocation + '/TC59/Step 8-Click on div YouNeedToFillInAll.png')

"Step 9: Click on div columnDetails (Column12)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_columnDetails'))

WebUI.takeScreenshot(reportLocation + '/TC59/Step 9-Click on div columnDetails Column12.png')

"Step 10: Click on input ServerUrl"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_ServerUrl'))

WebUI.takeScreenshot(reportLocation + '/TC59/Step 10-Click on input ServerUrl.png')

"Step 11: Enter input value in input ServerUrl"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_team_project/input_ServerUrl'), input_ServerUrl)

WebUI.takeScreenshot(reportLocation + '/TC59/Step 11-Enter input value in input ServerUrl.png')

"Step 12: Click on div Row"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_Row'))

WebUI.takeScreenshot(reportLocation + '/TC59/Step 12-Click on div Row.png')

"Step 13: Enter input value in input ServerUrl"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_team_project/input_ServerUrl'), input_ServerUrl_1)

WebUI.takeScreenshot(reportLocation + '/TC59/Step 13-Enter input value in input ServerUrl.png')

"Step 14: Click on div Row"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_Row'))

WebUI.takeScreenshot(reportLocation + '/TC59/Step 14-Click on div Row.png')

"Step 15: Click on div Row"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_Row'))

WebUI.takeScreenshot(reportLocation + '/TC59/Step 15-Click on div Row.png')

"Step 16: Click on input Username"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_Username'))

WebUI.takeScreenshot(reportLocation + '/TC59/Step 16-Click on input Username.png')

"Step 17: Click on div PasswordJiraServer"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_PasswordJiraServer'))

WebUI.takeScreenshot(reportLocation + '/TC59/Step 17-Click on div PasswordJiraServer.png')

"Step 18: Click on div Row"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_Row'))

WebUI.takeScreenshot(reportLocation + '/TC59/Step 18-Click on div Row.png')

"Step 19: Click on link Planning2 -> Navigate to page 'team/*/project/*/releases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Planning2'))

WebUI.takeScreenshot(reportLocation + '/TC59/Step 19-Click on link Planning2 - Navigate to page teamprojectreleases.png')

"Step 20: Click on link Dashboard -> Navigate to page 'team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/releases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_releases/link_Dashboard'))

WebUI.takeScreenshot(reportLocation + '/TC59/Step 20-Click on link Dashboard - Navigate to page teamproject.png')

"Step 21: Click on div zeroDetails (Zero)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_zeroDetails'))

WebUI.takeScreenshot(reportLocation + '/TC59/Step 21-Click on div zeroDetails Zero.png')

"Step 22: Click on div failureDetails (NewFailures)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_failureDetails'))

WebUI.takeScreenshot(reportLocation + '/TC59/Step 22-Click on div failureDetails NewFailures.png')

"Step 23: Click on div failureDetails (NewFailures)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_failureDetails'))

WebUI.takeScreenshot(reportLocation + '/TC59/Step 23-Click on div failureDetails NewFailures.png')

"Step 24: Click on link Tests7 -> Navigate to page 'team/*/project/*/test-design/test-cases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Tests7'))

WebUI.takeScreenshot(reportLocation + '/TC59/Step 24-Click on link Tests7 - Navigate to page teamprojecttest-designtest-cases.png')

"Step 25: Click on link Executions3 -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/link_Executions3'))

WebUI.takeScreenshot(reportLocation + '/TC59/Step 25-Click on link Executions3 - Navigate to page teamproject.png')

"Step 26: Click on link Planning2 -> Navigate to page 'team/*/project/*/releases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Planning2'))

WebUI.takeScreenshot(reportLocation + '/TC59/Step 26-Click on link Planning2 - Navigate to page teamprojectreleases.png')

"Step 27: Click on link Tests3 -> Navigate to page 'team/*/project/*/test-design/test-cases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/releases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_releases/link_Tests3'))

WebUI.takeScreenshot(reportLocation + '/TC59/Step 27-Click on link Tests3 - Navigate to page teamprojecttest-designtest-cases.png')

"Step 28: Click on link TestSuites5 -> Navigate to page 'team/*/project/*/test-design/test-suites'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/link_TestSuites5'))

WebUI.takeScreenshot(reportLocation + '/TC59/Step 28-Click on link TestSuites5 - Navigate to page teamprojecttest-designtest-suites.png')

"Step 29: Click on span KatalonCloud"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-suites?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_suites/span_KatalonCloud'))

WebUI.takeScreenshot(reportLocation + '/TC59/Step 29-Click on span KatalonCloud.png')

"Step 30: Click on span treeSwitchers (TreeSwitcher)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-suites?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_suites/span_treeSwitchers'))

WebUI.takeScreenshot(reportLocation + '/TC59/Step 30-Click on span treeSwitchers TreeSwitcher.png')

"Step 31: Click on link SettingUpScriptRepository -> Navigate to page 'team/*/project/*/git-test-project/setup'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-suites?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_suites/link_SettingUpScriptRepository'))

WebUI.takeScreenshot(reportLocation + '/TC59/Step 31-Click on link SettingUpScriptRepository - Navigate to page teamprojectgit-test-projectsetup.png')

"Step 32: Click on div CreateNewGitRepository"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/git-test-project/setup?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_git_test_project_setup/div_CreateNewGitRepository'))

WebUI.takeScreenshot(reportLocation + '/TC59/Step 32-Click on div CreateNewGitRepository.png')

"Step 33: Click on div GithubInfo"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/git-test-project/setup?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_git_test_project_setup/div_GithubInfo'))

WebUI.takeScreenshot(reportLocation + '/TC59/Step 33-Click on div GithubInfo.png')

"Step 34: Click on div BitbucketOption"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/git-test-project/setup?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_git_test_project_setup/div_BitbucketOption'))

WebUI.takeScreenshot(reportLocation + '/TC59/Step 34-Click on div BitbucketOption.png')

"Step 35: Click on input RepositoryURL"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/git-test-project/setup?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_git_test_project_setup/input_RepositoryURL'))

WebUI.takeScreenshot(reportLocation + '/TC59/Step 35-Click on input RepositoryURL.png')

"Step 36: Click on input RepositoryURL"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/git-test-project/setup?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_git_test_project_setup/input_RepositoryURL'))

WebUI.takeScreenshot(reportLocation + '/TC59/Step 36-Click on input RepositoryURL.png')

"Step 37: Enter input value in input RepositoryURL"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/git-test-project/setup?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_team_project_git_test_project_setup/input_RepositoryURL'), input_RepositoryURL)

WebUI.takeScreenshot(reportLocation + '/TC59/Step 37-Enter input value in input RepositoryURL.png')

"Step 38: Click on div RepositoryURLLabel"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/git-test-project/setup?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_git_test_project_setup/div_RepositoryURLLabel'))

WebUI.takeScreenshot(reportLocation + '/TC59/Step 38-Click on div RepositoryURLLabel.png')

"Step 39: Click on input Username"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/git-test-project/setup?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_git_test_project_setup/input_Username'))

WebUI.takeScreenshot(reportLocation + '/TC59/Step 39-Click on input Username.png')

"Step 40: Click on input Username"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/git-test-project/setup?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_git_test_project_setup/input_Username'))

WebUI.takeScreenshot(reportLocation + '/TC59/Step 40-Click on input Username.png')

"Step 41: Click on input Password"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/git-test-project/setup?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_git_test_project_setup/input_Password'))

WebUI.takeScreenshot(reportLocation + '/TC59/Step 41-Click on input Password.png')

"Step 42: Enter input value in input Password"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/git-test-project/setup?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_team_project_git_test_project_setup/input_Password'), input_Password)

WebUI.takeScreenshot(reportLocation + '/TC59/Step 42-Enter input value in input Password.png')

"Step 43: Click on input RepositoryURL"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/git-test-project/setup?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_git_test_project_setup/input_RepositoryURL'))

WebUI.takeScreenshot(reportLocation + '/TC59/Step 43-Click on input RepositoryURL.png')

"Step 44: Click on input RepositoryURL"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/git-test-project/setup?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_git_test_project_setup/input_RepositoryURL'))

WebUI.takeScreenshot(reportLocation + '/TC59/Step 44-Click on input RepositoryURL.png')

"Step 45: Click on input Username"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/git-test-project/setup?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_git_test_project_setup/input_Username'))

WebUI.takeScreenshot(reportLocation + '/TC59/Step 45-Click on input Username.png')

"Step 46: Enter input value in input Username"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/git-test-project/setup?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_team_project_git_test_project_setup/input_Username'), input_Username)

WebUI.takeScreenshot(reportLocation + '/TC59/Step 46-Enter input value in input Username.png')

"Step 47: Click on button Connect"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/git-test-project/setup?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_git_test_project_setup/button_Connect'))

WebUI.takeScreenshot(reportLocation + '/TC59/Step 47-Click on button Connect.png')

"Step 48: Click on input Username2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/git-test-project/setup?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_git_test_project_setup/input_Username2'))

WebUI.takeScreenshot(reportLocation + '/TC59/Step 48-Click on input Username2.png')

"Step 49: Enter input value in input Username2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/git-test-project/setup?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_team_project_git_test_project_setup/input_Username2'), input_Username2)

WebUI.takeScreenshot(reportLocation + '/TC59/Step 49-Enter input value in input Username2.png')

"Step 50: Click on form GitSetup"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/git-test-project/setup?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_git_test_project_setup/form_GitSetup'))

WebUI.takeScreenshot(reportLocation + '/TC59/Step 50-Click on form GitSetup.png')

"Step 51: Click on button Connect2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/git-test-project/setup?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_git_test_project_setup/button_Connect2'))

WebUI.takeScreenshot(reportLocation + '/TC59/Step 51-Click on button Connect2.png')

"Step 52: Click on input Username2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/git-test-project/setup?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_git_test_project_setup/input_Username2'))

WebUI.takeScreenshot(reportLocation + '/TC59/Step 52-Click on input Username2.png')

"Step 53: Enter input value in input Username2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/git-test-project/setup?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_team_project_git_test_project_setup/input_Username2'), input_Username2_1)

WebUI.takeScreenshot(reportLocation + '/TC59/Step 53-Enter input value in input Username2.png')

"Step 54: Click on link Tests -> Navigate to page 'team/*/project/*/test-design/test-cases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/git-test-project/setup?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_git_test_project_setup/link_Tests'))

WebUI.takeScreenshot(reportLocation + '/TC59/Step 54-Click on link Tests - Navigate to page teamprojecttest-designtest-cases.png')

"Step 55: Click on span treeSwitchers (TreeSwitcher7)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_treeSwitchers"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_treeSwitchers', ['span_treeSwitchers_class': span_treeSwitchers_class, 'span_treeSwitchers_divNthChild': span_treeSwitchers_divNthChild]))

WebUI.takeScreenshot(reportLocation + '/TC59/Step 55-Click on span treeSwitchers TreeSwitcher7.png')

"Step 56: Click on span testCaseSwitchers (TreeSwitcher8)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_testCaseSwitchers"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_testCaseSwitchers', ['span_testCaseSwitchers_class': span_testCaseSwitchers_class, 'span_testCaseSwitchers_nthChild': span_testCaseSwitchers_nthChild, 'span_testCaseSwitchers_divNthChild': span_testCaseSwitchers_divNthChild]))

WebUI.takeScreenshot(reportLocation + '/TC59/Step 56-Click on span testCaseSwitchers TreeSwitcher8.png')

"Step 57: Click on link TestSuites6 -> Navigate to page 'team/*/project/*/test-design/test-suites'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/link_TestSuites6'))

WebUI.takeScreenshot(reportLocation + '/TC59/Step 57-Click on link TestSuites6 - Navigate to page teamprojecttest-designtest-suites.png')

"Step 58: Click on link Reports -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-suites?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_suites/link_Reports_1'))

WebUI.takeScreenshot(reportLocation + '/TC59/Step 58-Click on link Reports - Navigate to page teamproject.png')

"Step 59: Click on link Planning3 -> Navigate to page 'team/*/project/*/releases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Planning3'))

WebUI.takeScreenshot(reportLocation + '/TC59/Step 59-Click on link Planning3 - Navigate to page teamprojectreleases.png')

"Step 60: Click on link Requirements -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/releases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_releases/link_Requirements'))

WebUI.takeScreenshot(reportLocation + '/TC59/Step 60-Click on link Requirements - Navigate to page teamproject.png')

"Step 61: Click on button alertActions (CloseButton2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_alertActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_alertActions', ['button_alertActions_class': button_alertActions_class]))

WebUI.takeScreenshot(reportLocation + '/TC59/Step 61-Click on button alertActions CloseButton2.png')

"Step 62: Click on div UnderTopNavbar"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_UnderTopNavbar'))

WebUI.takeScreenshot(reportLocation + '/TC59/Step 62-Click on div UnderTopNavbar.png')

"Step 63: Click on button alertActions (CloseButton)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_alertActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_alertActions', ['button_alertActions_class': button_alertActions_class_1]))

WebUI.takeScreenshot(reportLocation + '/TC59/Step 63-Click on button alertActions CloseButton.png')

"Step 64: Click on div JiraIssues"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_JiraIssues'))

WebUI.takeScreenshot(reportLocation + '/TC59/Step 64-Click on div JiraIssues.png')

"Step 65: Click on div JiraIssues2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_JiraIssues2'))

WebUI.takeScreenshot(reportLocation + '/TC59/Step 65-Click on div JiraIssues2.png')

"Step 66: Click on span settingsOptions (Settings)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/span_settingsOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/span_settingsOptions', ['span_settingsOptions_internalRoleButtonName': span_settingsOptions_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC59/Step 66-Click on span settingsOptions Settings.png')

"Step 67: Click on div dynamicObject (MuiBackdrop)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_dynamicObject', ['div_dynamicObject_class': div_dynamicObject_class]))

WebUI.takeScreenshot(reportLocation + '/TC59/Step 67-Click on div dynamicObject MuiBackdrop.png')

"Step 68: Click on link Dashboard4 -> Navigate to page 'team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Dashboard4'))

WebUI.takeScreenshot(reportLocation + '/TC59/Step 68-Click on link Dashboard4 - Navigate to page teamproject.png')

"Step 69: Click on div ReleaseReadiness"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_ReleaseReadiness'))

WebUI.takeScreenshot(reportLocation + '/TC59/Step 69-Click on div ReleaseReadiness.png')

"Step 70: Click on td NoDataToDisplay"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/td_NoDataToDisplay'))

WebUI.takeScreenshot(reportLocation + '/TC59/Step 70-Click on td NoDataToDisplay.png')

"Step 71: Click on div dashboardDetails (DashboardRefresh)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_dashboardDetails_1'))

WebUI.takeScreenshot(reportLocation + '/TC59/Step 71-Click on div dashboardDetails DashboardRefresh.png')

"Step 72: Click on link Reports8 -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Reports8'))

WebUI.takeScreenshot(reportLocation + '/TC59/Step 72-Click on link Reports8 - Navigate to page teamproject.png')

"Step 73: Click on link SummaryByTestResult -> Navigate to page 'team/*/project/*/test-reports/test-execution/test-performance'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_SummaryByTestResult'))

WebUI.takeScreenshot(reportLocation + '/TC59/Step 73-Click on link SummaryByTestResult - Navigate to page teamprojecttest-reportstest-executiontest-performance.png')

"Step 74: Click on link TestRuns -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-reports/test-execution/test-performance?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_reports_test_execution_test_performance/link_TestRuns'))

WebUI.takeScreenshot(reportLocation + '/TC59/Step 74-Click on link TestRuns - Navigate to page teamproject.png')

"Step 75: Click on link RunFrequency2 -> Navigate to page 'team/*/project/*/test-reports/test-execution/frequency-report'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_RunFrequency2'))

WebUI.takeScreenshot(reportLocation + '/TC59/Step 75-Click on link RunFrequency2 - Navigate to page teamprojecttest-reportstest-executionfrequency-report.png')

"Step 76: Click on link FailedTestResultsBeta -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-reports/test-execution/frequency-report?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_reports_test_execution_frequency_report/link_FailedTestResultsBeta'))

WebUI.takeScreenshot(reportLocation + '/TC59/Step 76-Click on link FailedTestResultsBeta - Navigate to page teamproject.png')

"Step 77: Click on link testManagementOptions (Defects)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_testManagementOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_testManagementOptions', ['link_testManagementOptions_nthChild': link_testManagementOptions_nthChild, 'link_testManagementOptions_internalRoleLinkName': link_testManagementOptions_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC59/Step 77-Click on link testManagementOptions Defects.png')

"Step 78: Click on link testManagementOptions (VisualTesting)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_testManagementOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_testManagementOptions', ['link_testManagementOptions_nthChild': link_testManagementOptions_nthChild_1, 'link_testManagementOptions_internalRoleLinkName': link_testManagementOptions_internalRoleLinkName_1]))

WebUI.takeScreenshot(reportLocation + '/TC59/Step 78-Click on link testManagementOptions VisualTesting.png')

"Step 79: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC59-Integrate Jira and Manage Test Cases_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}