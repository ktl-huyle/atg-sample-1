import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.configuration.RunConfiguration
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

"Step 3: Navigate to organization/{*}/home"

TrueTestScripts.navigate("organization/{*}/home")

"Step 4: Click on link projectExecution (Execution) -> Navigate to page 'team project#team/{*}/project/{*}'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'organization/{.*}/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/link_projectExecution"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/link_projectExecution', ['link_projectExecution_internalRoleLinkName': link_projectExecution_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 4-Click on link projectExecution Execution - Navigate to page team projectteamproject.png')

"Step 5: Click on link Tests3 -> Navigate to page 'team project#team/{*}/project/{*}/{*}/{*}'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Tests3'))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 5-Click on link Tests3 - Navigate to page team projectteamproject.png')

"Step 6: Click on div uploadedDataDetails (UploadedData)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_uploadedDataDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_uploadedDataDetails', ['div_uploadedDataDetails_internalText': div_uploadedDataDetails_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 6-Click on div uploadedDataDetails UploadedData.png')

"Step 7: Click on span treeSwitcherIcon (CaretDown)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/span_treeSwitcherIcon_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/span_treeSwitcherIcon_1', ['span_treeSwitcherIcon_class': span_treeSwitcherIcon_class]))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 7-Click on span treeSwitcherIcon CaretDown.png')

"Step 8: Click on span treeSwitcherIcon (CaretDown2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/span_treeSwitcherIcon"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/span_treeSwitcherIcon', ['span_treeSwitcherIcon_nthChild': span_treeSwitcherIcon_nthChild, 'span_treeSwitcherIcon_class': span_treeSwitcherIcon_class_1, 'span_treeSwitcherIcon_divNthChild': span_treeSwitcherIcon_divNthChild]))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 8-Click on span treeSwitcherIcon CaretDown2.png')

"Step 9: Click on span treeSwitcherIcon (CaretDown3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/span_treeSwitcherIcon"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/span_treeSwitcherIcon', ['span_treeSwitcherIcon_nthChild': span_treeSwitcherIcon_nthChild_1, 'span_treeSwitcherIcon_class': span_treeSwitcherIcon_class_2, 'span_treeSwitcherIcon_divNthChild': span_treeSwitcherIcon_divNthChild_1]))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 9-Click on span treeSwitcherIcon CaretDown3.png')

"Step 10: Click on span treeSwitcherIcon (CaretDown4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/span_treeSwitcherIcon"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/span_treeSwitcherIcon', ['span_treeSwitcherIcon_nthChild': span_treeSwitcherIcon_nthChild_2, 'span_treeSwitcherIcon_class': span_treeSwitcherIcon_class_3, 'span_treeSwitcherIcon_divNthChild': span_treeSwitcherIcon_divNthChild_2]))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 10-Click on span treeSwitcherIcon CaretDown4.png')

"Step 11: Click on div uploadedDataDetails (CountyDemographics)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_uploadedDataDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_uploadedDataDetails', ['div_uploadedDataDetails_internalText': div_uploadedDataDetails_internalText_1]))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 11-Click on div uploadedDataDetails CountyDemographics.png')

"Step 12: Click on link InsuranceDemographics -> Navigate to page 'team project details#team/{*}/project/{*}/{*}/{*}/{*}'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_InsuranceDemographics'))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 12-Click on link InsuranceDemographics - Navigate to page team project detailsteamproject.png')

"Step 13: Click on link Reports -> Navigate to page 'team project overview#team/{*}/project/{*}/overview'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_details/link_Reports'))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 13-Click on link Reports - Navigate to page team project overviewteamprojectoverview.png')

"Step 14: Click on link TestRuns4 -> Navigate to page 'team project executions#team/{*}/project/{*}/executions'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/overview?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_overview/link_TestRuns4'))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 14-Click on link TestRuns4 - Navigate to page team project executionsteamprojectexecutions.png')

"Step 15: Click on link projectExecutions (Executions2) -> Navigate to page 'team project executions#team/{*}/project/{*}/executions/{*}'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/executions?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/link_projectExecutions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/link_projectExecutions', ['link_projectExecutions_trNthChild': link_projectExecutions_trNthChild, 'link_projectExecutions_internalRoleLinkName': link_projectExecutions_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 15-Click on link projectExecutions Executions2 - Navigate to page team project executionsteamprojectexecutions.png')

"Step 16: Click on button PushToXray"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/executions/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_PushToXray'))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 16-Click on button PushToXray.png')

"Step 17: Click on div SelectDropdown"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/executions/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_SelectDropdown'))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 17-Click on div SelectDropdown.png')

"Step 18: Click on button CloseDialog"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/executions/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_CloseDialog'))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 18-Click on button CloseDialog.png')

"Step 19: Click on link Tests -> Navigate to page 'team project#team/{*}/project/{*}/{*}/{*}'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/executions/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_Tests'))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 19-Click on link Tests - Navigate to page team projectteamproject.png')

"Step 20: Click on link Reports4 -> Navigate to page 'team project overview#team/{*}/project/{*}/overview'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Reports5'))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 20-Click on link Reports4 - Navigate to page team project overviewteamprojectoverview.png')

"Step 21: Click on link TestRuns4 -> Navigate to page 'team project executions#team/{*}/project/{*}/executions'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/overview?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_overview/link_TestRuns4'))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 21-Click on link TestRuns4 - Navigate to page team project executionsteamprojectexecutions.png')

"Step 22: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC18-Push to Xray and Verify Project Executions_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}