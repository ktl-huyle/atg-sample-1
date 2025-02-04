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

"Step 2: Click on input rowSelection (selectRow)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "Archived/Archived_20250204/Dynamic Objects/Page_team_project_detail/input_rowSelection"
WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Dynamic Objects/Page_team_project_detail/input_rowSelection', ['input_rowSelection_internalRoleRowName': input_rowSelection_internalRoleRowName]))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 2-Click on input rowSelection selectRow.png')

"Step 3: Click on input rowSelection (selectRow2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "Archived/Archived_20250204/Dynamic Objects/Page_team_project_detail/input_rowSelection"
WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Dynamic Objects/Page_team_project_detail/input_rowSelection', ['input_rowSelection_internalRoleRowName': input_rowSelection_internalRoleRowName_1]))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 3-Click on input rowSelection selectRow2.png')

"Step 4: Click on button terminate"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Page_team_project_detail/button_terminate'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 4-Click on button terminate.png')

"Step 5: Click on button confirm"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Page_team_project_detail/button_confirm'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 5-Click on button confirm.png')

"Step 6: Click on input rowSelection (selectRow3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "Archived/Archived_20250204/Dynamic Objects/Page_team_project_detail/input_rowSelection"
WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Dynamic Objects/Page_team_project_detail/input_rowSelection', ['input_rowSelection_internalRoleRowName': input_rowSelection_internalRoleRowName_2]))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 6-Click on input rowSelection selectRow3.png')

"Step 7: Click on input rowSelection (selectRow4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "Archived/Archived_20250204/Dynamic Objects/Page_team_project_detail/input_rowSelection"
WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Dynamic Objects/Page_team_project_detail/input_rowSelection', ['input_rowSelection_internalRoleRowName': input_rowSelection_internalRoleRowName_3]))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 7-Click on input rowSelection selectRow4.png')

"Step 8: Click on input rowSelection (selectRow5)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "Archived/Archived_20250204/Dynamic Objects/Page_team_project_detail/input_rowSelection"
WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Dynamic Objects/Page_team_project_detail/input_rowSelection', ['input_rowSelection_internalRoleRowName': input_rowSelection_internalRoleRowName_4]))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 8-Click on input rowSelection selectRow5.png')

"Step 9: Click on button terminate"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Page_team_project_detail/button_terminate'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 9-Click on button terminate.png')

"Step 10: Click on button confirm"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Page_team_project_detail/button_confirm'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 10-Click on button confirm.png')

"Step 11: Click on input rowSelection (selectRow6)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "Archived/Archived_20250204/Dynamic Objects/Page_team_project_detail/input_rowSelection"
WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Dynamic Objects/Page_team_project_detail/input_rowSelection', ['input_rowSelection_internalRoleRowName': input_rowSelection_internalRoleRowName_5]))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 11-Click on input rowSelection selectRow6.png')

"Step 12: Click on button terminate"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Page_team_project_detail/button_terminate'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 12-Click on button terminate.png')

"Step 13: Click on button confirm -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Page_team_project_detail/button_confirm'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 13-Click on button confirm - Navigate to page .png')

"Step 14: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC24-Terminate Selected Executions in Team Project_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}