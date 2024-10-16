import internal.GlobalVariable
import com.kms.katalon.core.configuration.RunConfiguration
import truetest.custom.TrueTestScripts
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

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

"Step 3: Navigate to team/{*}/project/{*}/{*}"

TrueTestScripts.navigate("team/{*}/project/{*}/{*}")

"Step 4: Click on i Unknown"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/i_Unknown'))

WebUI.takeScreenshot(reportLocation + '/TC196/Step 4-Click on i Unknown.png')

"Step 5: Click on header testRunDetails (UntitledTestRun3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/header_testRunDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/header_testRunDetails', ['header_testRunDetails_internalRoleHeadingName': header_testRunDetails_internalRoleHeadingName]))

WebUI.takeScreenshot(reportLocation + '/TC196/Step 5-Click on header testRunDetails UntitledTestRun3.png')

"Step 6: Click on i TotalTests"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/i_TotalTests'))

WebUI.takeScreenshot(reportLocation + '/TC196/Step 6-Click on i TotalTests.png')

"Step 7: Click on i TotalTests"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/i_TotalTests'))

WebUI.takeScreenshot(reportLocation + '/TC196/Step 7-Click on i TotalTests.png')

"Step 8: Click on button SessionsTab4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_SessionsTab4'))

WebUI.takeScreenshot(reportLocation + '/TC196/Step 8-Click on button SessionsTab4.png')

"Step 9: Click on button FailedTestResults3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_FailedTestResults3'))

WebUI.takeScreenshot(reportLocation + '/TC196/Step 9-Click on button FailedTestResults3.png')

"Step 10: Click on button Details -> Navigate to page 'team project executions#team/{*}/project/{*}/executions/{*}'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Details'))

WebUI.takeScreenshot(reportLocation + '/TC196/Step 10-Click on button Details - Navigate to page team project executionsteamprojectexecutions.png')

"Step 11: Click on link testSuites (iOS Test Suite) -> Navigate to page 'team project details#team/{*}/project/{*}/{*}/{*}/{*}'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/executions/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/link_testSuites"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/link_testSuites', ['link_testSuites_trNthChild': link_testSuites_trNthChild, 'link_testSuites_internalRoleLinkName': link_testSuites_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC196/Step 11-Click on link testSuites iOS Test Suite - Navigate to page team project detailsteamproject.png')

"Step 12: Click on link testSuitesDetails (iosTestSuite) -> Navigate to page 'team project executions#team/{*}/project/{*}/executions/{*}'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_details/link_testSuitesDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_details/link_testSuitesDetails', ['link_testSuitesDetails_internalRoleRowName': link_testSuitesDetails_internalRoleRowName]))

WebUI.takeScreenshot(reportLocation + '/TC196/Step 12-Click on link testSuitesDetails iosTestSuite - Navigate to page team project executionsteamprojectexecutions.png')

"Step 13: Click on link TestResults3 -> Navigate to page 'team project executions#team/{*}/project/{*}/executions/{*}/{*}'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/executions/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_TestResults3'))

WebUI.takeScreenshot(reportLocation + '/TC196/Step 13-Click on link TestResults3 - Navigate to page team project executionsteamprojectexecutions.png')

"Step 14: Click on span passedTestCase"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/executions/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/span_passedTestCase'))

WebUI.takeScreenshot(reportLocation + '/TC196/Step 14-Click on span passedTestCase.png')

"Step 15: Click on div InfoSidebarCloseButton"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/executions/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_InfoSidebarCloseButton'))

WebUI.takeScreenshot(reportLocation + '/TC196/Step 15-Click on div InfoSidebarCloseButton.png')

"Step 16: Click on link settings -> Navigate to page 'team project settings#team/{*}/project/{*}/settings'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/executions/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_settings'))

WebUI.takeScreenshot(reportLocation + '/TC196/Step 16-Click on link settings - Navigate to page team project settingsteamprojectsettings.png')

"Step 17: Click on label Enable BDD reports"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/settings?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_settings/label_Enable_BDD_reports'))

WebUI.takeScreenshot(reportLocation + '/TC196/Step 17-Click on label Enable BDD reports.png')

"Step 18: Click on button Save2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/settings?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_settings/button_Save2'))

WebUI.takeScreenshot(reportLocation + '/TC196/Step 18-Click on button Save2.png')

"Step 19: Click on button Settings"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/settings?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_settings/button_Settings'))

WebUI.takeScreenshot(reportLocation + '/TC196/Step 19-Click on button Settings.png')

"Step 20: Click on div Backdrop"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/settings?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_settings/div_Backdrop'))

WebUI.takeScreenshot(reportLocation + '/TC196/Step 20-Click on div Backdrop.png')

"Step 21: Click on link scriptRepositories (Integrations) -> Navigate to page 'team project#team/{*}/project/{*}/{*}'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/settings?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_settings/link_scriptRepositories"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_settings/link_scriptRepositories', ['link_scriptRepositories_nthChild': link_scriptRepositories_nthChild, 'link_scriptRepositories_internalRoleLinkName': link_scriptRepositories_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC196/Step 21-Click on link scriptRepositories Integrations - Navigate to page team projectteamproject.png')

"Step 22: Click on div pipelineElements (CodelessAutomationTool)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_pipelineElements"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_pipelineElements', ['div_pipelineElements_class': div_pipelineElements_class, 'div_pipelineElements_internalRoleTreeitemName': div_pipelineElements_internalRoleTreeitemName]))

WebUI.takeScreenshot(reportLocation + '/TC196/Step 22-Click on div pipelineElements CodelessAutomationTool.png')

"Step 23: Click on div pipelineElements (ExpandMoreIcon)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_pipelineElements"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_pipelineElements', ['div_pipelineElements_class': div_pipelineElements_class_1]))

WebUI.takeScreenshot(reportLocation + '/TC196/Step 23-Click on div pipelineElements ExpandMoreIcon.png')

"Step 24: Click on div pipelineElements (ALMTestManagement)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_pipelineElements"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_pipelineElements', ['div_pipelineElements_class': div_pipelineElements_class_2, 'div_pipelineElements_internalRoleTreeitemName': div_pipelineElements_internalRoleTreeitemName_1]))

WebUI.takeScreenshot(reportLocation + '/TC196/Step 24-Click on div pipelineElements ALMTestManagement.png')

"Step 25: Click on div pipelineElements (ExpandMoreIcon2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_pipelineElements"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_pipelineElements', ['div_pipelineElements_class': div_pipelineElements_class_3]))

WebUI.takeScreenshot(reportLocation + '/TC196/Step 25-Click on div pipelineElements ExpandMoreIcon2.png')

"Step 26: Click on div pipelineElements (CICDPipeline)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_pipelineElements"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_pipelineElements', ['div_pipelineElements_class': div_pipelineElements_class_4, 'div_pipelineElements_internalRoleTreeitemName': div_pipelineElements_internalRoleTreeitemName_2]))

WebUI.takeScreenshot(reportLocation + '/TC196/Step 26-Click on div pipelineElements CICDPipeline.png')

"Step 27: Click on div pipelineElements (ExpandMoreIcon3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_pipelineElements"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_pipelineElements', ['div_pipelineElements_class': div_pipelineElements_class_5]))

WebUI.takeScreenshot(reportLocation + '/TC196/Step 27-Click on div pipelineElements ExpandMoreIcon3.png')

"Step 28: Click on link CustomFields -> Navigate to page 'custom fields#team/{*}/project/{*}/custom-fields'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_CustomFields'))

WebUI.takeScreenshot(reportLocation + '/TC196/Step 28-Click on link CustomFields - Navigate to page custom fieldsteamprojectcustom-fields.png')

"Step 29: Click on link integrations (testCloudTunnels) -> Navigate to page 'team project#team/{*}/project/{*}/{*}'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/custom-fields?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_custom_fields/link_integrations"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_custom_fields/link_integrations', ['link_integrations_nthChild': link_integrations_nthChild, 'link_integrations_internalRoleLinkName': link_integrations_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC196/Step 29-Click on link integrations testCloudTunnels - Navigate to page team projectteamproject.png')

"Step 30: Click on link CustomFields -> Navigate to page 'custom fields#team/{*}/project/{*}/custom-fields'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_CustomFields'))

WebUI.takeScreenshot(reportLocation + '/TC196/Step 30-Click on link CustomFields - Navigate to page custom fieldsteamprojectcustom-fields.png')

"Step 31: Click on link integrations (integrations) -> Navigate to page 'team project#team/{*}/project/{*}/{*}'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/custom-fields?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_custom_fields/link_integrations"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_custom_fields/link_integrations', ['link_integrations_nthChild': link_integrations_nthChild_1, 'link_integrations_internalRoleLinkName': link_integrations_internalRoleLinkName_1]))

WebUI.takeScreenshot(reportLocation + '/TC196/Step 31-Click on link integrations integrations - Navigate to page team projectteamproject.png')

"Step 32: Click on div backdropElements (GPTManualTestGenerator)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_backdropElements"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_backdropElements', ['div_backdropElements_class': div_backdropElements_class]))

WebUI.takeScreenshot(reportLocation + '/TC196/Step 32-Click on div backdropElements GPTManualTestGenerator.png')

"Step 33: Click on div Integrations"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_Integrations'))

WebUI.takeScreenshot(reportLocation + '/TC196/Step 33-Click on div Integrations.png')

"Step 34: Click on link TestEnvironments -> Navigate to page 'team project agent#team/{*}/project/{*}/agent'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_TestEnvironments'))

WebUI.takeScreenshot(reportLocation + '/TC196/Step 34-Click on link TestEnvironments - Navigate to page team project agentteamprojectagent.png')

"Step 35: Click on link Script Repositories -> Navigate to page 'team project#team/{*}/project/{*}/{*}'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/agent?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_agent/link_Script_Repositories'))

WebUI.takeScreenshot(reportLocation + '/TC196/Step 35-Click on link Script Repositories - Navigate to page team projectteamproject.png')

"Step 36: Click on link General2 -> Navigate to page 'team project settings#team/{*}/project/{*}/settings'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_General2'))

WebUI.takeScreenshot(reportLocation + '/TC196/Step 36-Click on link General2 - Navigate to page team project settingsteamprojectsettings.png')

"Step 37: Click on link Tests -> Navigate to page 'team project#team/{*}/project/{*}/{*}/{*}'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/settings?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_settings/link_Tests'))

WebUI.takeScreenshot(reportLocation + '/TC196/Step 37-Click on link Tests - Navigate to page team projectteamproject.png')

"Step 38: Click on link executions5 -> Navigate to page 'team project#team/{*}/project/{*}/{*}'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_executions5'))

WebUI.takeScreenshot(reportLocation + '/TC196/Step 38-Click on link executions5 - Navigate to page team projectteamproject.png')

"Step 39: Click on button SelectRow"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_SelectRow'))

WebUI.takeScreenshot(reportLocation + '/TC196/Step 39-Click on button SelectRow.png')

"Step 40: Click on div backdropElements (PopoverBackdrop)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_backdropElements"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_backdropElements', ['div_backdropElements_class': div_backdropElements_class_1]))

WebUI.takeScreenshot(reportLocation + '/TC196/Step 40-Click on div backdropElements PopoverBackdrop.png')

"Step 41: Click on link Reports10 -> Navigate to page 'team project overview#team/{*}/project/{*}/overview'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Reports10'))

WebUI.takeScreenshot(reportLocation + '/TC196/Step 41-Click on link Reports10 - Navigate to page team project overviewteamprojectoverview.png')

"Step 42: Click on link Upload Reports -> Navigate to page 'team project import#team/{*}/project/{*}/import-manual-reports'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/overview?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_overview/link_Upload_Reports'))

WebUI.takeScreenshot(reportLocation + '/TC196/Step 42-Click on link Upload Reports - Navigate to page team project importteamprojectimport-manual-reports.png')

"Step 43: Click on input selectKatalonFiles"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/import-manual-reports?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_import/input_selectKatalonFiles'))

WebUI.takeScreenshot(reportLocation + '/TC196/Step 43-Click on input selectKatalonFiles.png')

"Step 44: Click on input selectTags"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/import-manual-reports?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_import/input_selectTags'))

WebUI.takeScreenshot(reportLocation + '/TC196/Step 44-Click on input selectTags.png')

"Step 45: Click on div customFields"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/import-manual-reports?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_import/div_customFields'))

WebUI.takeScreenshot(reportLocation + '/TC196/Step 45-Click on div customFields.png')

"Step 46: Click on button import"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/import-manual-reports?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_import/button_import'))

WebUI.takeScreenshot(reportLocation + '/TC196/Step 46-Click on button import.png')

"Step 47: Click on link reports"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/import-manual-reports?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_import/link_reports'))

WebUI.takeScreenshot(reportLocation + '/TC196/Step 47-Click on link reports.png')

"Step 48: Click on link testRuns -> Navigate to page 'team project overview#team/{*}/project/{*}/overview'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/import-manual-reports?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_import/link_testRuns'))

WebUI.takeScreenshot(reportLocation + '/TC196/Step 48-Click on link testRuns - Navigate to page team project overviewteamprojectoverview.png')

"Step 49: Click on link Test Runs -> Navigate to page 'team project executions#team/{*}/project/{*}/executions'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/overview?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_overview/link_Test_Runs'))

WebUI.takeScreenshot(reportLocation + '/TC196/Step 49-Click on link Test Runs - Navigate to page team project executionsteamprojectexecutions.png')

"Step 50: Click on link executionLinks (object2) -> Navigate to page 'team project executions#team/{*}/project/{*}/executions/{*}'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/executions?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/link_executionLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/link_executionLinks', ['link_executionLinks_trNthChild': link_executionLinks_trNthChild, 'link_executionLinks_internalRoleLinkName': link_executionLinks_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC196/Step 50-Click on link executionLinks object2 - Navigate to page team project executionsteamprojectexecutions.png')

"Step 51: Click on link TestResults3 -> Navigate to page 'team project executions#team/{*}/project/{*}/executions/{*}/{*}'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/executions/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_TestResults3'))

WebUI.takeScreenshot(reportLocation + '/TC196/Step 51-Click on link TestResults3 - Navigate to page team project executionsteamprojectexecutions.png')

"Step 52: Click on label object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/executions/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/label_object'))

WebUI.takeScreenshot(reportLocation + '/TC196/Step 52-Click on label object.png')

"Step 53: Click on label object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/executions/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/label_object'))

WebUI.takeScreenshot(reportLocation + '/TC196/Step 53-Click on label object.png')

"Step 54: Click on button testResultDetails (TestResultDetails2) -> Navigate to page 'test result#team/{*}/project/{*}/executions/{*}/test-result/{*}'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/executions/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/button_testResultDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/button_testResultDetails', ['button_testResultDetails_class': button_testResultDetails_class]))

WebUI.takeScreenshot(reportLocation + '/TC196/Step 54-Click on button testResultDetails TestResultDetails2 - Navigate to page test resultteamprojectexecutionstest-result.png')

"Step 55: Click on span listenerActions (startListenerAction)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/executions/{.*}/test-result/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_test_result/span_listenerActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_test_result/span_listenerActions', ['span_listenerActions_internalHasText': span_listenerActions_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC196/Step 55-Click on span listenerActions startListenerAction.png')

"Step 56: Click on span listenerActions (startListenerAction2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/executions/{.*}/test-result/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_test_result/span_listenerActions'))

WebUI.takeScreenshot(reportLocation + '/TC196/Step 56-Click on span listenerActions startListenerAction2.png')

"Step 57: Click on span listenerActions (createdWithSketch)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/executions/{.*}/test-result/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_test_result/span_listenerActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_test_result/span_listenerActions', ['span_listenerActions_internalHasText': span_listenerActions_internalHasText_1]))

WebUI.takeScreenshot(reportLocation + '/TC196/Step 57-Click on span listenerActions createdWithSketch.png')

"Step 58: Click on span logInfo (createdWithSketch2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/executions/{.*}/test-result/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_test_result/span_logInfo"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_test_result/span_logInfo', ['span_logInfo_class': span_logInfo_class, 'span_logInfo_internalHasText': span_logInfo_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC196/Step 58-Click on span logInfo createdWithSketch2.png')

"Step 59: Click on span logInfo (logInfoExecutingTest)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/executions/{.*}/test-result/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_test_result/span_logInfo'))

WebUI.takeScreenshot(reportLocation + '/TC196/Step 59-Click on span logInfo logInfoExecutingTest.png')

"Step 60: Click on span logInfo (logInfoExecutingTest2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/executions/{.*}/test-result/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_test_result/span_logInfo"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_test_result/span_logInfo', ['span_logInfo_class': span_logInfo_class_1, 'span_logInfo_internalHasText': span_logInfo_internalHasText_1]))

WebUI.takeScreenshot(reportLocation + '/TC196/Step 60-Click on span logInfo logInfoExecutingTest2.png')

"Step 61: Click on span logInfo (elseIfPlatformName)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/executions/{.*}/test-result/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_test_result/span_logInfo'))

WebUI.takeScreenshot(reportLocation + '/TC196/Step 61-Click on span logInfo elseIfPlatformName.png')

"Step 62: Click on span elseIfPlatformName2 -> Navigate to page 'team project executions#team/{*}/project/{*}/executions/{*}/{*}'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/executions/{.*}/test-result/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_test_result/span_elseIfPlatformName2'))

WebUI.takeScreenshot(reportLocation + '/TC196/Step 62-Click on span elseIfPlatformName2 - Navigate to page team project executionsteamprojectexecutions.png')

"Step 63: Click on link reports"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/executions/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_reports'))

WebUI.takeScreenshot(reportLocation + '/TC196/Step 63-Click on link reports.png')

"Step 64: Click on link reports"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/executions/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_reports'))

WebUI.takeScreenshot(reportLocation + '/TC196/Step 64-Click on link reports.png')

"Step 65: Click on link reports"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/executions/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_reports'))

WebUI.takeScreenshot(reportLocation + '/TC196/Step 65-Click on link reports.png')

"Step 66: Click on link summary -> Navigate to page 'team project executions#team/{*}/project/{*}/executions/{*}'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/executions/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_summary'))

WebUI.takeScreenshot(reportLocation + '/TC196/Step 66-Click on link summary - Navigate to page team project executionsteamprojectexecutions.png')

"Step 67: Click on link Reports"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/executions/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_Reports'))

WebUI.takeScreenshot(reportLocation + '/TC196/Step 67-Click on link Reports.png')

"Step 68: Click on link Executions5 -> Navigate to page 'team project#team/{*}/project/{*}/{*}'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/executions/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_Executions5'))

WebUI.takeScreenshot(reportLocation + '/TC196/Step 68-Click on link Executions5 - Navigate to page team projectteamproject.png')

"Step 69: Click on header testRunDetails (UntitledTestRun3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/header_testRunDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/header_testRunDetails', ['header_testRunDetails_internalRoleHeadingName': header_testRunDetails_internalRoleHeadingName_1]))

WebUI.takeScreenshot(reportLocation + '/TC196/Step 69-Click on header testRunDetails UntitledTestRun3.png')

"Step 70: Click on button IconButton2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_IconButton2'))

WebUI.takeScreenshot(reportLocation + '/TC196/Step 70-Click on button IconButton2.png')

"Step 71: Click on div backdropElements (PopoverBackdrop)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_backdropElements"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_backdropElements', ['div_backdropElements_class': div_backdropElements_class_2]))

WebUI.takeScreenshot(reportLocation + '/TC196/Step 71-Click on div backdropElements PopoverBackdrop.png')

"Step 72: Click on button Details -> Navigate to page 'team project executions#team/{*}/project/{*}/executions/{*}'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Details'))

WebUI.takeScreenshot(reportLocation + '/TC196/Step 72-Click on button Details - Navigate to page team project executionsteamprojectexecutions.png')

"Step 73: Click on link testSuites (Android Test Suite) -> Navigate to page 'team project details#team/{*}/project/{*}/{*}/{*}/{*}'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/executions/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/link_testSuites"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/link_testSuites', ['link_testSuites_trNthChild': link_testSuites_trNthChild_1, 'link_testSuites_internalRoleLinkName': link_testSuites_internalRoleLinkName_1]))

WebUI.takeScreenshot(reportLocation + '/TC196/Step 73-Click on link testSuites Android Test Suite - Navigate to page team project detailsteamproject.png')

"Step 74: Click on link testSuitesDetails (androidTestSuite) -> Navigate to page 'team project executions#team/{*}/project/{*}/executions/{*}'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_details/link_testSuitesDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_details/link_testSuitesDetails', ['link_testSuitesDetails_internalRoleRowName': link_testSuitesDetails_internalRoleRowName_1]))

WebUI.takeScreenshot(reportLocation + '/TC196/Step 74-Click on link testSuitesDetails androidTestSuite - Navigate to page team project executionsteamprojectexecutions.png')

"Step 75: Click on link TestResults3 -> Navigate to page 'team project executions#team/{*}/project/{*}/executions/{*}/{*}'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/executions/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_TestResults3'))

WebUI.takeScreenshot(reportLocation + '/TC196/Step 75-Click on link TestResults3 - Navigate to page team project executionsteamprojectexecutions.png')

"Step 76: Click on button testResultDetails (TestResultDetails2) -> Navigate to page 'test result#team/{*}/project/{*}/executions/{*}/test-result/{*}'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/executions/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/button_testResultDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/button_testResultDetails', ['button_testResultDetails_class': button_testResultDetails_class_1]))

WebUI.takeScreenshot(reportLocation + '/TC196/Step 76-Click on button testResultDetails TestResultDetails2 - Navigate to page test resultteamprojectexecutionstest-result.png')

"Step 77: Click on div createdWithSketch"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/executions/{.*}/test-result/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_test_result/div_createdWithSketch'))

WebUI.takeScreenshot(reportLocation + '/TC196/Step 77-Click on div createdWithSketch.png')

"Step 78: Click on link requests -> Navigate to page 'test requests#team/{*}/project/{*}/executions/{*}/test-result/{*}/requests'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/executions/{.*}/test-result/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_test_result/link_requests'))

WebUI.takeScreenshot(reportLocation + '/TC196/Step 78-Click on link requests - Navigate to page test requeststeamprojectexecutionstest-resultrequests.png')

"Step 79: Click on link testObjects -> Navigate to page 'test objects#team/{*}/project/{*}/executions/{*}/test-result/{*}/test-objects'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/executions/{.*}/test-result/{.*}/requests?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_test_requests/link_testObjects'))

WebUI.takeScreenshot(reportLocation + '/TC196/Step 79-Click on link testObjects - Navigate to page test objectsteamprojectexecutionstest-resulttest-objects.png')

"Step 80: Click on link comments -> Navigate to page 'comments section#team/{*}/project/{*}/executions/{*}/test-result/{*}/comments'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/executions/{.*}/test-result/{.*}/test-objects?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_test_objects/link_comments'))

WebUI.takeScreenshot(reportLocation + '/TC196/Step 80-Click on link comments - Navigate to page comments sectionteamprojectexecutionstest-resultcomments.png')

"Step 81: Click on link reRuns -> Navigate to page 'test result re runs#team/{*}/project/{*}/executions/{*}/test-result/{*}/re-runs'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/executions/{.*}/test-result/{.*}/comments?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_comments_section/link_reRuns'))

WebUI.takeScreenshot(reportLocation + '/TC196/Step 81-Click on link reRuns - Navigate to page test result re runsteamprojectexecutionstest-resultre-runs.png')

"Step 82: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC196-Manage test result details and integrations in team project_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}