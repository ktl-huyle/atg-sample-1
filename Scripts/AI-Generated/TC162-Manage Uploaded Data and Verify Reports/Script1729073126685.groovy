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

"Step 3: Navigate to organization/{*}/home"

TrueTestScripts.navigate("organization/{*}/home")

"Step 4: Click on link projectLinks (Execution) -> Navigate to page 'team project#team/{*}/project/{*}'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'organization/{.*}/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/link_projectLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/link_projectLinks', ['link_projectLinks_internalRoleLinkName': link_projectLinks_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC162/Step 4-Click on link projectLinks Execution - Navigate to page team projectteamproject.png')

"Step 5: Click on link Tests3 -> Navigate to page 'team project#team/{*}/project/{*}/{*}/{*}'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Tests3'))

WebUI.takeScreenshot(reportLocation + '/TC162/Step 5-Click on link Tests3 - Navigate to page team projectteamproject.png')

"Step 6: Click on div uploadedDataInfo (UploadedData)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_uploadedDataInfo"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_uploadedDataInfo', ['div_uploadedDataInfo_internalText': div_uploadedDataInfo_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC162/Step 6-Click on div uploadedDataInfo UploadedData.png')

"Step 7: Click on span treeSwitcherIcons (CaretDown)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/span_treeSwitcherIcons_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/span_treeSwitcherIcons_1', ['span_treeSwitcherIcons_class': span_treeSwitcherIcons_class]))

WebUI.takeScreenshot(reportLocation + '/TC162/Step 7-Click on span treeSwitcherIcons CaretDown.png')

"Step 8: Click on span treeSwitcherIcons (CaretDown2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/span_treeSwitcherIcons"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/span_treeSwitcherIcons', ['span_treeSwitcherIcons_nthChild': span_treeSwitcherIcons_nthChild, 'span_treeSwitcherIcons_class': span_treeSwitcherIcons_class_1, 'span_treeSwitcherIcons_divNthChild': span_treeSwitcherIcons_divNthChild]))

WebUI.takeScreenshot(reportLocation + '/TC162/Step 8-Click on span treeSwitcherIcons CaretDown2.png')

"Step 9: Click on span treeSwitcherIcons (CaretDown3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/span_treeSwitcherIcons"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/span_treeSwitcherIcons', ['span_treeSwitcherIcons_nthChild': span_treeSwitcherIcons_nthChild_1, 'span_treeSwitcherIcons_class': span_treeSwitcherIcons_class_2, 'span_treeSwitcherIcons_divNthChild': span_treeSwitcherIcons_divNthChild_1]))

WebUI.takeScreenshot(reportLocation + '/TC162/Step 9-Click on span treeSwitcherIcons CaretDown3.png')

"Step 10: Click on span treeSwitcherIcons (CaretDown4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/span_treeSwitcherIcons"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/span_treeSwitcherIcons', ['span_treeSwitcherIcons_nthChild': span_treeSwitcherIcons_nthChild_2, 'span_treeSwitcherIcons_class': span_treeSwitcherIcons_class_3, 'span_treeSwitcherIcons_divNthChild': span_treeSwitcherIcons_divNthChild_2]))

WebUI.takeScreenshot(reportLocation + '/TC162/Step 10-Click on span treeSwitcherIcons CaretDown4.png')

"Step 11: Click on div uploadedDataInfo (CountyDemographics)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_uploadedDataInfo"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_uploadedDataInfo', ['div_uploadedDataInfo_internalText': div_uploadedDataInfo_internalText_1]))

WebUI.takeScreenshot(reportLocation + '/TC162/Step 11-Click on div uploadedDataInfo CountyDemographics.png')

"Step 12: Click on link InsuranceDemographics -> Navigate to page 'team project details#team/{*}/project/{*}/{*}/{*}/{*}'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_InsuranceDemographics'))

WebUI.takeScreenshot(reportLocation + '/TC162/Step 12-Click on link InsuranceDemographics - Navigate to page team project detailsteamproject.png')

"Step 13: Click on link Reports -> Navigate to page 'team project overview#team/{*}/project/{*}/overview'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_details/link_Reports'))

WebUI.takeScreenshot(reportLocation + '/TC162/Step 13-Click on link Reports - Navigate to page team project overviewteamprojectoverview.png')

"Step 14: Click on link TestRuns4 -> Navigate to page 'team project executions#team/{*}/project/{*}/executions'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/overview?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_overview/link_TestRuns4'))

WebUI.takeScreenshot(reportLocation + '/TC162/Step 14-Click on link TestRuns4 - Navigate to page team project executionsteamprojectexecutions.png')

"Step 15: Click on link executionLinks (Executions2) -> Navigate to page 'team project executions#team/{*}/project/{*}/executions/{*}'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/executions?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/link_executionLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/link_executionLinks', ['link_executionLinks_trNthChild': link_executionLinks_trNthChild, 'link_executionLinks_internalRoleLinkName': link_executionLinks_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC162/Step 15-Click on link executionLinks Executions2 - Navigate to page team project executionsteamprojectexecutions.png')

"Step 16: Click on button PushToXray"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/executions/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_PushToXray'))

WebUI.takeScreenshot(reportLocation + '/TC162/Step 16-Click on button PushToXray.png')

"Step 17: Click on div SelectDropdown"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/executions/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_SelectDropdown'))

WebUI.takeScreenshot(reportLocation + '/TC162/Step 17-Click on div SelectDropdown.png')

"Step 18: Click on button CloseDialog"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/executions/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_CloseDialog'))

WebUI.takeScreenshot(reportLocation + '/TC162/Step 18-Click on button CloseDialog.png')

"Step 19: Click on link Tests -> Navigate to page 'team project#team/{*}/project/{*}/{*}/{*}'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/executions/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_Tests'))

WebUI.takeScreenshot(reportLocation + '/TC162/Step 19-Click on link Tests - Navigate to page team projectteamproject.png')

"Step 20: Click on link Reports4 -> Navigate to page 'team project overview#team/{*}/project/{*}/overview'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/{.*}/{.*}?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Reports4'))

WebUI.takeScreenshot(reportLocation + '/TC162/Step 20-Click on link Reports4 - Navigate to page team project overviewteamprojectoverview.png')

"Step 21: Click on link TestRuns4 -> Navigate to page 'team project executions#team/{*}/project/{*}/executions'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/{.*}/project/{.*}/overview?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_overview/link_TestRuns4'))

WebUI.takeScreenshot(reportLocation + '/TC162/Step 21-Click on link TestRuns4 - Navigate to page team project executionsteamprojectexecutions.png')

"Step 22: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC162-Manage Uploaded Data and Verify Reports_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}