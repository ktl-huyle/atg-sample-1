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

"Step 3: Navigate to organization/*/home"

TrueTestScripts.navigate("organization/${GlobalVariable.organization_id}/home")

"Step 4: Click on link projectDetails (SC SynergyCareManager) -> Navigate to page 'team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/link_projectDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/link_projectDetails', ['link_projectDetails_internalRoleLinkName': link_projectDetails_internalRoleLinkName, 'team_id': team_id, 'project_id': project_id]))

WebUI.takeScreenshot(reportLocation + '/TC85/Step 4-Click on link projectDetails SC SynergyCareManager - Navigate to page teamproject.png')

"Step 5: Click on button EnableJiraIntegration -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_EnableJiraIntegration'))

WebUI.takeScreenshot(reportLocation + '/TC85/Step 5-Click on button EnableJiraIntegration - Navigate to page teamproject.png')

"Step 6: Click on link JiraAddon"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_JiraAddon'))

WebUI.takeScreenshot(reportLocation + '/TC85/Step 6-Click on link JiraAddon.png')

"Step 7: Click on link JiraAddon"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_JiraAddon'))

WebUI.takeScreenshot(reportLocation + '/TC85/Step 7-Click on link JiraAddon.png')

"Step 8: Click on div FillInAll"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_FillInAll'))

WebUI.takeScreenshot(reportLocation + '/TC85/Step 8-Click on div FillInAll.png')

"Step 9: Click on div Column12"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_Column12'))

WebUI.takeScreenshot(reportLocation + '/TC85/Step 9-Click on div Column12.png')

"Step 10: Click on input ServerUrl"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_ServerUrl'))

WebUI.takeScreenshot(reportLocation + '/TC85/Step 10-Click on input ServerUrl.png')

"Step 11: Enter input value in input ServerUrl"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_team_project/input_ServerUrl'), input_ServerUrl)

WebUI.takeScreenshot(reportLocation + '/TC85/Step 11-Enter input value in input ServerUrl.png')

"Step 12: Click on div Row"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_Row'))

WebUI.takeScreenshot(reportLocation + '/TC85/Step 12-Click on div Row.png')

"Step 13: Enter input value in input ServerUrl"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_team_project/input_ServerUrl'), input_ServerUrl_1)

WebUI.takeScreenshot(reportLocation + '/TC85/Step 13-Enter input value in input ServerUrl.png')

"Step 14: Click on div Row"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_Row'))

WebUI.takeScreenshot(reportLocation + '/TC85/Step 14-Click on div Row.png')

"Step 15: Click on div Row"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_Row'))

WebUI.takeScreenshot(reportLocation + '/TC85/Step 15-Click on div Row.png')

"Step 16: Click on input Username"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_Username'))

WebUI.takeScreenshot(reportLocation + '/TC85/Step 16-Click on input Username.png')

"Step 17: Click on div PasswordJira"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_PasswordJira'))

WebUI.takeScreenshot(reportLocation + '/TC85/Step 17-Click on div PasswordJira.png')

"Step 18: Click on div Row"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_Row'))

WebUI.takeScreenshot(reportLocation + '/TC85/Step 18-Click on div Row.png')

"Step 19: Click on link Planning3 -> Navigate to page 'team/*/project/*/releases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Planning3'))

WebUI.takeScreenshot(reportLocation + '/TC85/Step 19-Click on link Planning3 - Navigate to page teamprojectreleases.png')

"Step 20: Click on link Dashboard -> Navigate to page 'team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/releases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_releases/link_Dashboard'))

WebUI.takeScreenshot(reportLocation + '/TC85/Step 20-Click on link Dashboard - Navigate to page teamproject.png')

"Step 21: Click on div Zero"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_Zero'))

WebUI.takeScreenshot(reportLocation + '/TC85/Step 21-Click on div Zero.png')

"Step 22: Click on div NewFailures"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_NewFailures'))

WebUI.takeScreenshot(reportLocation + '/TC85/Step 22-Click on div NewFailures.png')

"Step 23: Click on div NewFailures"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_NewFailures'))

WebUI.takeScreenshot(reportLocation + '/TC85/Step 23-Click on div NewFailures.png')

"Step 24: Click on link Tests8 -> Navigate to page 'team/*/project/*/test-design/test-cases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Tests8'))

WebUI.takeScreenshot(reportLocation + '/TC85/Step 24-Click on link Tests8 - Navigate to page teamprojecttest-designtest-cases.png')

"Step 25: Click on link Executions5 -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/link_Executions5'))

WebUI.takeScreenshot(reportLocation + '/TC85/Step 25-Click on link Executions5 - Navigate to page teamproject.png')

"Step 26: Click on link Planning3 -> Navigate to page 'team/*/project/*/releases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Planning3'))

WebUI.takeScreenshot(reportLocation + '/TC85/Step 26-Click on link Planning3 - Navigate to page teamprojectreleases.png')

"Step 27: Click on link Tests3 -> Navigate to page 'team/*/project/*/test-design/test-cases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/releases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_releases/link_Tests3'))

WebUI.takeScreenshot(reportLocation + '/TC85/Step 27-Click on link Tests3 - Navigate to page teamprojecttest-designtest-cases.png')

"Step 28: Click on link TestSuites7 -> Navigate to page 'team/*/project/*/test-design/test-suites'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/link_TestSuites7'))

WebUI.takeScreenshot(reportLocation + '/TC85/Step 28-Click on link TestSuites7 - Navigate to page teamprojecttest-designtest-suites.png')

"Step 29: Click on span KatalonCloud"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-suites?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_suites/span_KatalonCloud'))

WebUI.takeScreenshot(reportLocation + '/TC85/Step 29-Click on span KatalonCloud.png')

"Step 30: Click on span treeSwitcher (TreeSwitcher)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-suites?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_suites/span_treeSwitcher'))

WebUI.takeScreenshot(reportLocation + '/TC85/Step 30-Click on span treeSwitcher TreeSwitcher.png')

"Step 31: Click on link SettingUpScriptRepository -> Navigate to page 'team/*/project/*/git-test-project/setup'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-suites?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_suites/link_SettingUpScriptRepository'))

WebUI.takeScreenshot(reportLocation + '/TC85/Step 31-Click on link SettingUpScriptRepository - Navigate to page teamprojectgit-test-projectsetup.png')

"Step 32: Click on div CreateNewGitRepository"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/git-test-project/setup?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_git_test_project_setup/div_CreateNewGitRepository'))

WebUI.takeScreenshot(reportLocation + '/TC85/Step 32-Click on div CreateNewGitRepository.png')

"Step 33: Click on div GithubInfo"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/git-test-project/setup?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_git_test_project_setup/div_GithubInfo'))

WebUI.takeScreenshot(reportLocation + '/TC85/Step 33-Click on div GithubInfo.png')

"Step 34: Click on div BitbucketOption"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/git-test-project/setup?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_git_test_project_setup/div_BitbucketOption'))

WebUI.takeScreenshot(reportLocation + '/TC85/Step 34-Click on div BitbucketOption.png')

"Step 35: Click on input RepositoryURL"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/git-test-project/setup?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_git_test_project_setup/input_RepositoryURL'))

WebUI.takeScreenshot(reportLocation + '/TC85/Step 35-Click on input RepositoryURL.png')

"Step 36: Click on input RepositoryURL"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/git-test-project/setup?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_git_test_project_setup/input_RepositoryURL'))

WebUI.takeScreenshot(reportLocation + '/TC85/Step 36-Click on input RepositoryURL.png')

"Step 37: Enter input value in input RepositoryUrl"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/git-test-project/setup?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_team_project_git_test_project_setup/input_RepositoryURL'), input_RepositoryUrl)

WebUI.takeScreenshot(reportLocation + '/TC85/Step 37-Enter input value in input RepositoryUrl.png')

"Step 38: Click on div RepositoryURLLabel"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/git-test-project/setup?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_git_test_project_setup/div_RepositoryURLLabel'))

WebUI.takeScreenshot(reportLocation + '/TC85/Step 38-Click on div RepositoryURLLabel.png')

"Step 39: Click on input Username"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/git-test-project/setup?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_git_test_project_setup/input_Username'))

WebUI.takeScreenshot(reportLocation + '/TC85/Step 39-Click on input Username.png')

"Step 40: Click on input Username"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/git-test-project/setup?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_git_test_project_setup/input_Username'))

WebUI.takeScreenshot(reportLocation + '/TC85/Step 40-Click on input Username.png')

"Step 41: Click on input Password"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/git-test-project/setup?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_git_test_project_setup/input_Password'))

WebUI.takeScreenshot(reportLocation + '/TC85/Step 41-Click on input Password.png')

"Step 42: Enter input value in input AppPassword"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/git-test-project/setup?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_team_project_git_test_project_setup/input_Password'), input_AppPassword)

WebUI.takeScreenshot(reportLocation + '/TC85/Step 42-Enter input value in input AppPassword.png')

"Step 43: Click on input RepositoryURL"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/git-test-project/setup?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_git_test_project_setup/input_RepositoryURL'))

WebUI.takeScreenshot(reportLocation + '/TC85/Step 43-Click on input RepositoryURL.png')

"Step 44: Click on input RepositoryURL"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/git-test-project/setup?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_git_test_project_setup/input_RepositoryURL'))

WebUI.takeScreenshot(reportLocation + '/TC85/Step 44-Click on input RepositoryURL.png')

"Step 45: Click on input Username"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/git-test-project/setup?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_git_test_project_setup/input_Username'))

WebUI.takeScreenshot(reportLocation + '/TC85/Step 45-Click on input Username.png')

"Step 46: Enter input value in input Username2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/git-test-project/setup?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_team_project_git_test_project_setup/input_Username'), input_Username2)

WebUI.takeScreenshot(reportLocation + '/TC85/Step 46-Enter input value in input Username2.png')

"Step 47: Click on button Connect"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/git-test-project/setup?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_git_test_project_setup/button_Connect'))

WebUI.takeScreenshot(reportLocation + '/TC85/Step 47-Click on button Connect.png')

"Step 48: Click on input Username3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/git-test-project/setup?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_git_test_project_setup/input_Username3'))

WebUI.takeScreenshot(reportLocation + '/TC85/Step 48-Click on input Username3.png')

"Step 49: Enter input value in input Username4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/git-test-project/setup?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_team_project_git_test_project_setup/input_Username3'), input_Username4)

WebUI.takeScreenshot(reportLocation + '/TC85/Step 49-Enter input value in input Username4.png')

"Step 50: Click on form GitSetup"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/git-test-project/setup?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_git_test_project_setup/form_GitSetup'))

WebUI.takeScreenshot(reportLocation + '/TC85/Step 50-Click on form GitSetup.png')

"Step 51: Click on button Connect"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/git-test-project/setup?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_git_test_project_setup/button_Connect'))

WebUI.takeScreenshot(reportLocation + '/TC85/Step 51-Click on button Connect.png')

"Step 52: Click on input Username3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/git-test-project/setup?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_git_test_project_setup/input_Username3'))

WebUI.takeScreenshot(reportLocation + '/TC85/Step 52-Click on input Username3.png')

"Step 53: Enter input value in input Username4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/git-test-project/setup?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_team_project_git_test_project_setup/input_Username3'), input_Username4_1)

WebUI.takeScreenshot(reportLocation + '/TC85/Step 53-Enter input value in input Username4.png')

"Step 54: Click on link Tests -> Navigate to page 'team/*/project/*/test-design/test-cases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/git-test-project/setup?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_git_test_project_setup/link_Tests'))

WebUI.takeScreenshot(reportLocation + '/TC85/Step 54-Click on link Tests - Navigate to page teamprojecttest-designtest-cases.png')

"Step 55: Click on span treeSwitcher (TreeSwitcher5)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_treeSwitcher_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_treeSwitcher_1', ['span_treeSwitcher_divNthChild': span_treeSwitcher_divNthChild]))

WebUI.takeScreenshot(reportLocation + '/TC85/Step 55-Click on span treeSwitcher TreeSwitcher5.png')

"Step 56: Click on span testCaseItems (TreeSwitcher4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_testCaseItems"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_testCaseItems', ['span_testCaseItems_divNthChild': span_testCaseItems_divNthChild]))

WebUI.takeScreenshot(reportLocation + '/TC85/Step 56-Click on span testCaseItems TreeSwitcher4.png')

"Step 57: Click on link TestSuites7 -> Navigate to page 'team/*/project/*/test-design/test-suites'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/link_TestSuites7'))

WebUI.takeScreenshot(reportLocation + '/TC85/Step 57-Click on link TestSuites7 - Navigate to page teamprojecttest-designtest-suites.png')

"Step 58: Click on link Reports -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-suites?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_suites/link_Reports'))

WebUI.takeScreenshot(reportLocation + '/TC85/Step 58-Click on link Reports - Navigate to page teamproject.png')

"Step 59: Click on link Planning3 -> Navigate to page 'team/*/project/*/releases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Planning3'))

WebUI.takeScreenshot(reportLocation + '/TC85/Step 59-Click on link Planning3 - Navigate to page teamprojectreleases.png')

"Step 60: Click on link Requirements -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/releases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_releases/link_Requirements'))

WebUI.takeScreenshot(reportLocation + '/TC85/Step 60-Click on link Requirements - Navigate to page teamproject.png')

"Step 61: Click on button AlertButton (AlertButton6)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_AlertButton"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_AlertButton', ['button_AlertButton_class': button_AlertButton_class]))

WebUI.takeScreenshot(reportLocation + '/TC85/Step 61-Click on button AlertButton AlertButton6.png')

"Step 62: Click on div UnderTopNavbar"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_UnderTopNavbar'))

WebUI.takeScreenshot(reportLocation + '/TC85/Step 62-Click on div UnderTopNavbar.png')

"Step 63: Click on button AlertButton (AlertButton6)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_AlertButton"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_AlertButton', ['button_AlertButton_class': button_AlertButton_class_1]))

WebUI.takeScreenshot(reportLocation + '/TC85/Step 63-Click on button AlertButton AlertButton6.png')

"Step 64: Click on div JiraIssues"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_JiraIssues'))

WebUI.takeScreenshot(reportLocation + '/TC85/Step 64-Click on div JiraIssues.png')

"Step 65: Click on div JiraIssues2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_JiraIssues2'))

WebUI.takeScreenshot(reportLocation + '/TC85/Step 65-Click on div JiraIssues2.png')

"Step 66: Click on span Settings2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/span_dynamicObject'))

WebUI.takeScreenshot(reportLocation + '/TC85/Step 66-Click on span Settings2.png')

"Step 67: Click on div MuiBackdropRoot"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_Backdrop'))

WebUI.takeScreenshot(reportLocation + '/TC85/Step 67-Click on div MuiBackdropRoot.png')

"Step 68: Click on link Dashboard5 -> Navigate to page 'team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Dashboard5'))

WebUI.takeScreenshot(reportLocation + '/TC85/Step 68-Click on link Dashboard5 - Navigate to page teamproject.png')

"Step 69: Click on div ReleaseReadiness"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_ReleaseReadiness'))

WebUI.takeScreenshot(reportLocation + '/TC85/Step 69-Click on div ReleaseReadiness.png')

"Step 70: Click on td NoDataToDisplay"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/td_NoDataToDisplay'))

WebUI.takeScreenshot(reportLocation + '/TC85/Step 70-Click on td NoDataToDisplay.png')

"Step 71: Click on div DashboardRefresh"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_DashboardRefresh'))

WebUI.takeScreenshot(reportLocation + '/TC85/Step 71-Click on div DashboardRefresh.png')

"Step 72: Click on link reportsSettings (reports15) -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_reportsSettings"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_reportsSettings', ['link_reportsSettings_nthChild': link_reportsSettings_nthChild, 'link_reportsSettings_internalRoleLinkName': link_reportsSettings_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC85/Step 72-Click on link reportsSettings reports15 - Navigate to page teamproject.png')

"Step 73: Click on link SummaryByTestResult2 -> Navigate to page 'team/*/project/*/test-reports/test-execution/test-performance'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_SummaryByTestResult2'))

WebUI.takeScreenshot(reportLocation + '/TC85/Step 73-Click on link SummaryByTestResult2 - Navigate to page teamprojecttest-reportstest-executiontest-performance.png')

"Step 74: Click on link TestRuns3 -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-reports/test-execution/test-performance?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_reports_test_execution_test_performance/link_TestRuns3'))

WebUI.takeScreenshot(reportLocation + '/TC85/Step 74-Click on link TestRuns3 - Navigate to page teamproject.png')

"Step 75: Click on link RunFrequency3 -> Navigate to page 'team/*/project/*/test-reports/test-execution/frequency-report'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_RunFrequency3'))

WebUI.takeScreenshot(reportLocation + '/TC85/Step 75-Click on link RunFrequency3 - Navigate to page teamprojecttest-reportstest-executionfrequency-report.png')

"Step 76: Click on link FailedTestResults -> Navigate to page 'team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-reports/test-execution/frequency-report?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_reports_test_execution_frequency_report/link_FailedTestResults'))

WebUI.takeScreenshot(reportLocation + '/TC85/Step 76-Click on link FailedTestResults - Navigate to page teamproject.png')

"Step 77: Click on link testEnvironments (TestEnvironments39)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_testEnvironments"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_testEnvironments', ['link_testEnvironments_nthChild': link_testEnvironments_nthChild, 'link_testEnvironments_internalRoleLinkName': link_testEnvironments_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC85/Step 77-Click on link testEnvironments TestEnvironments39.png')

"Step 78: Click on link testEnvironments (TestEnvironments39)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_testEnvironments"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_testEnvironments', ['link_testEnvironments_nthChild': link_testEnvironments_nthChild_1, 'link_testEnvironments_internalRoleLinkName': link_testEnvironments_internalRoleLinkName_1]))

WebUI.takeScreenshot(reportLocation + '/TC85/Step 78-Click on link testEnvironments TestEnvironments39.png')

"Step 79: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC85-Connect Git Repository and Verify Project_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}