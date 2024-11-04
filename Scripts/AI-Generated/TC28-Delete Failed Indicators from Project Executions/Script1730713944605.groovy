import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.custom.TrueTestScripts
import internal.GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI


'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to organization/*/home"

TrueTestScripts.navigate("organization/${GlobalVariable.organization_id}/home")

"Step 2: Click on link testSuiteLinks (ExecutionDetails 652) -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/link_testSuiteLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/link_testSuiteLinks', ['link_testSuiteLinks_class': link_testSuiteLinks_class, 'link_testSuiteLinks_internalRoleLinkName': link_testSuiteLinks_internalRoleLinkName, 'link_testSuiteLinks_project_id': link_testSuiteLinks_project_id, 'link_testSuiteLinks_executions_id': link_testSuiteLinks_executions_id, 'link_testSuiteLinks_team_id': link_testSuiteLinks_team_id]))

WebUI.takeScreenshot()

"Step 3: Click on div LoadingSpinner"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_LoadingSpinner'))

WebUI.takeScreenshot()

"Step 4: Click on div LoadingSpinner"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_LoadingSpinner'))

WebUI.takeScreenshot()

"Step 5: Click on link TestRuns2 -> Navigate to page 'team/*/project/*/overview'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_TestRuns2'))

WebUI.takeScreenshot()

"Step 6: Click on link TestRuns3 -> Navigate to page 'team/*/project/*/executions'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/overview?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_overview/link_TestRuns3'))

WebUI.takeScreenshot()

"Step 7: Click on label failureIndicators (Failed652)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/label_failureIndicators"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/label_failureIndicators', ['label_failureIndicators_for': label_failureIndicators_for, 'label_failureIndicators_internalRoleRowName': label_failureIndicators_internalRoleRowName]))

WebUI.takeScreenshot()

"Step 8: Click on label failureIndicators (Failed651)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/label_failureIndicators"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/label_failureIndicators', ['label_failureIndicators_for': label_failureIndicators_for_1, 'label_failureIndicators_internalRoleRowName': label_failureIndicators_internalRoleRowName_1]))

WebUI.takeScreenshot()

"Step 9: Click on label failureIndicators (Failed650)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/label_failureIndicators"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/label_failureIndicators', ['label_failureIndicators_for': label_failureIndicators_for_2, 'label_failureIndicators_internalRoleRowName': label_failureIndicators_internalRoleRowName_2]))

WebUI.takeScreenshot()

"Step 10: Click on button Delete"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_Delete'))

WebUI.takeScreenshot()

"Step 11: Click on button Delete2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_Delete2'))

WebUI.takeScreenshot()

"Step 12: Click on label failureIndicators (Failed652)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/label_failureIndicators"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/label_failureIndicators', ['label_failureIndicators_for': label_failureIndicators_for_3, 'label_failureIndicators_internalRoleRowName': label_failureIndicators_internalRoleRowName_3]))

WebUI.takeScreenshot()

"Step 13: Click on label failureIndicators (Failed651)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/label_failureIndicators"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/label_failureIndicators', ['label_failureIndicators_for': label_failureIndicators_for_4, 'label_failureIndicators_internalRoleRowName': label_failureIndicators_internalRoleRowName_4]))

WebUI.takeScreenshot()

"Step 14: Click on label failureIndicators (Failed650)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/label_failureIndicators"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/label_failureIndicators', ['label_failureIndicators_for': label_failureIndicators_for_5, 'label_failureIndicators_internalRoleRowName': label_failureIndicators_internalRoleRowName_5]))

WebUI.takeScreenshot()

"Step 15: Click on button Delete"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_Delete'))

WebUI.takeScreenshot()

"Step 16: Click on button Delete2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_Delete2'))

WebUI.takeScreenshot()

"Step 17: Click on link TestRuns3 -> Navigate to page 'team/*/project/*/overview'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_TestRuns3'))

WebUI.takeScreenshot()

"Step 18: Click on link TestRuns3 -> Navigate to page 'team/*/project/*/executions'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/overview?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_overview/link_TestRuns3'))

WebUI.takeScreenshot()

"Step 19: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC28-Delete Failed Indicators from Project Executions_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}