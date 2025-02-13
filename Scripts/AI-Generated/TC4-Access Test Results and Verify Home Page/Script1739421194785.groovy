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

WebUI.takeScreenshot(reportLocation + '/TC4/Step 2-Click on header TestRunDetail.png')

"Step 3: Click on button testResultsActions (Sessions)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_detail/button_testResultsActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_detail/button_testResultsActions', ['button_testResultsActions_class': button_testResultsActions_class, 'button_testResultsActions_internalRoleTabName': button_testResultsActions_internalRoleTabName]))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 3-Click on button testResultsActions Sessions.png')

"Step 4: Click on div TotalTests"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_detail/div_TotalTests'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 4-Click on div TotalTests.png')

"Step 5: Click on i SolidIcon"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_detail/i_SolidIcon'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 5-Click on i SolidIcon.png')

"Step 6: Click on button testResultsActions (FailedTestResults)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_detail/button_testResultsActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_detail/button_testResultsActions', ['button_testResultsActions_class': button_testResultsActions_class_1, 'button_testResultsActions_internalRoleTabName': button_testResultsActions_internalRoleTabName_1]))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 6-Click on button testResultsActions FailedTestResults.png')

"Step 7: Click on button testResultsActions (Sessions)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_detail/button_testResultsActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_detail/button_testResultsActions', ['button_testResultsActions_class': button_testResultsActions_class_2, 'button_testResultsActions_internalRoleTabName': button_testResultsActions_internalRoleTabName_2]))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 7-Click on button testResultsActions Sessions.png')

"Step 8: Click on button testResultsActions (Sessions2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_detail/button_testResultsActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_detail/button_testResultsActions', ['button_testResultsActions_class': button_testResultsActions_class_3, 'button_testResultsActions_internalRoleTabName': button_testResultsActions_internalRoleTabName_3]))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 8-Click on button testResultsActions Sessions2.png')

"Step 9: Click on div TotalTests"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_detail/div_TotalTests'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 9-Click on div TotalTests.png')

"Step 10: Click on div TestRunDetail"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_detail/div_TestRunDetail'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 10-Click on div TestRunDetail.png')

"Step 11: Click on button CloseButton"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_detail/button_CloseButton'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 11-Click on button CloseButton.png')

"Step 12: Click on div testRunDetails (TestRunCell)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_detail/div_testRunDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_detail/div_testRunDetails', ['div_testRunDetails_internalRoleCellName': div_testRunDetails_internalRoleCellName]))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 12-Click on div testRunDetails TestRunCell.png')

"Step 13: Click on div NoDataDisplay -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_detail/div_NoDataDisplay'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 13-Click on div NoDataDisplay - Navigate to page .png')

"Step 14: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC4-Access Test Results and Verify Home Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}