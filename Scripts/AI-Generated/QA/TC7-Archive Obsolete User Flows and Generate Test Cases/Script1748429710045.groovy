import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.QA.custom.TrueTestScripts

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to /team/*/project/*/truetest/user-journeys"

TrueTestScripts.navigate("/team/${team_id}/project/${project_id}/truetest/user-journeys")

"Step 2: Click on button reviewObsoleteFlows -> Navigate to page '/team/*/project/*/truetest/user-journeys/*/aut/*/retain'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_team_project_truetest_user_journeys/button_reviewObsoleteFlows'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 2-Click on button reviewObsoleteFlows - Navigate to page teamprojecttruetestuser-journeysautretain.png')

"Step 3: Click on input selectAllRows"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*/retain?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_team_project_truetest_user_journeys_aut_retain/input_selectAllRows'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 3-Click on input selectAllRows.png')

"Step 4: Click on button archiveAll -> Navigate to page '/team/*/project/*/truetest/user-journeys'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*/retain?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_team_project_truetest_user_journeys_aut_retain/button_archiveAll'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 4-Click on button archiveAll - Navigate to page teamprojecttruetestuser-journeys.png')

"Step 5: Click on button generateNewUserJourneyMap"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_team_project_truetest_user_journeys/button_generateNewUserJourneyMap'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 5-Click on button generateNewUserJourneyMap.png')

"Step 6: Click on label custom"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_team_project_truetest_user_journeys/label_custom'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 6-Click on label custom.png')

"Step 7: Click on div object3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_team_project_truetest_user_journeys/div_object3'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 7-Click on div object3.png')

"Step 8: Click on button optionSelection (option14)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/QA/Dynamic Objects/Page_team_project_truetest_user_journeys/button_optionSelection"
WebUI.enhancedClick(findTestObject('AI-Generated/QA/Dynamic Objects/Page_team_project_truetest_user_journeys/button_optionSelection', ['button_optionSelection_class': button_optionSelection_class, 'button_optionSelection_internalText': button_optionSelection_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 8-Click on button optionSelection option14.png')

"Step 9: Click on item timeOptions ( 0Minutes)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/QA/Dynamic Objects/Page_team_project_truetest_user_journeys/item_timeOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/QA/Dynamic Objects/Page_team_project_truetest_user_journeys/item_timeOptions', ['item_timeOptions_class': item_timeOptions_class, 'item_timeOptions_liAriaLabel': item_timeOptions_liAriaLabel, 'item_timeOptions_ulNthOfType': item_timeOptions_ulNthOfType]))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 9-Click on item timeOptions  0Minutes.png')

"Step 10: Click on div userJourneyMapPrompt"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_team_project_truetest_user_journeys/div_userJourneyMapPrompt'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 10-Click on div userJourneyMapPrompt.png')

"Step 11: Click on label last7DaysRecommended"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_team_project_truetest_user_journeys/label_last7DaysRecommended'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 11-Click on label last7DaysRecommended.png')

"Step 12: Click on button generate"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_team_project_truetest_user_journeys/button_generate'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 12-Click on button generate.png')

"Step 13: Click on button gotIt"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_team_project_truetest_user_journeys/button_gotIt'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 13-Click on button gotIt.png')

"Step 14: Click on link reports -> Navigate to page '/team/*/project/*/overview'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_team_project_truetest_user_journeys/link_reports'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 14-Click on link reports - Navigate to page teamprojectoverview.png')

"Step 15: Click on link truetest -> Navigate to page '/team/*/project/*/truetest/user-journeys'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/overview?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_team_project_overview/link_truetest'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 15-Click on link truetest - Navigate to page teamprojecttruetestuser-journeys.png')

"Step 16: Click on link executions -> Navigate to page '/team/*/project/*/test-runs'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_team_project_truetest_user_journeys/link_executions'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 16-Click on link executions - Navigate to page teamprojecttest-runs.png')

"Step 17: Click on link trueTest -> Navigate to page '/team/*/project/*/truetest/user-journeys'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_team_project_test_runs/link_trueTest'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 17-Click on link trueTest - Navigate to page teamprojecttruetestuser-journeys.png')

"Step 18: Click on button viewDetails (viewDetails) -> Navigate to page '/team/*/project/*/truetest/user-journeys/*/aut/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/QA/Dynamic Objects/Page_team_project_truetest_user_journeys/button_viewDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/QA/Dynamic Objects/Page_team_project_truetest_user_journeys/button_viewDetails', ['button_viewDetails_dataTestid': button_viewDetails_dataTestid]))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 18-Click on button viewDetails viewDetails - Navigate to page teamprojecttruetestuser-journeysaut.png')

"Step 19: Click on button object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_team_project_truetest_user_journeys_aut/button_object'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 19-Click on button object.png')

"Step 20: Click on button object2 -> Navigate to page '/team/*/project/*/truetest/user-journeys'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_team_project_truetest_user_journeys_aut/button_object2'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 20-Click on button object2 - Navigate to page teamprojecttruetestuser-journeys.png')

"Step 21: Click on div generateUserJourneyMap"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_team_project_truetest_user_journeys/div_generateUserJourneyMap'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 21-Click on div generateUserJourneyMap.png')

"Step 22: Click on button generateNewUserJourneyMap"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_team_project_truetest_user_journeys/button_generateNewUserJourneyMap'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 22-Click on button generateNewUserJourneyMap.png')

"Step 23: Click on label custom"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_team_project_truetest_user_journeys/label_custom'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 23-Click on label custom.png')

"Step 24: Click on label last7DaysRecommended"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_team_project_truetest_user_journeys/label_last7DaysRecommended'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 24-Click on label last7DaysRecommended.png')

"Step 25: Click on label ignorePreviousFlows"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_team_project_truetest_user_journeys/label_ignorePreviousFlows'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 25-Click on label ignorePreviousFlows.png')

"Step 26: Click on div cancelGenerate"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_team_project_truetest_user_journeys/div_cancelGenerate'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 26-Click on div cancelGenerate.png')

"Step 27: Click on button generate"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_team_project_truetest_user_journeys/button_generate'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 27-Click on button generate.png')

"Step 28: Click on button gotIt"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_team_project_truetest_user_journeys/button_gotIt'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 28-Click on button gotIt.png')

"Step 29: Click on link reports -> Navigate to page '/team/*/project/*/overview'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_team_project_truetest_user_journeys/link_reports'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 29-Click on link reports - Navigate to page teamprojectoverview.png')

"Step 30: Click on link truetest -> Navigate to page '/team/*/project/*/truetest/user-journeys'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/overview?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_team_project_overview/link_truetest'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 30-Click on link truetest - Navigate to page teamprojecttruetestuser-journeys.png')

"Step 31: Click on link reports -> Navigate to page '/team/*/project/*/overview'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_team_project_truetest_user_journeys/link_reports'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 31-Click on link reports - Navigate to page teamprojectoverview.png')

"Step 32: Click on link truetest -> Navigate to page '/team/*/project/*/truetest/user-journeys'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/overview?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_team_project_overview/link_truetest'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 32-Click on link truetest - Navigate to page teamprojecttruetestuser-journeys.png')

"Step 33: Click on button viewDetails (viewDetails2) -> Navigate to page '/team/*/project/*/truetest/user-journeys/*/aut/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/QA/Dynamic Objects/Page_team_project_truetest_user_journeys/button_viewDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/QA/Dynamic Objects/Page_team_project_truetest_user_journeys/button_viewDetails', ['button_viewDetails_dataTestid': button_viewDetails_dataTestid_1]))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 33-Click on button viewDetails viewDetails2 - Navigate to page teamprojecttruetestuser-journeysaut.png')

"Step 34: Click on button object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_team_project_truetest_user_journeys_aut/button_object'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 34-Click on button object.png')

"Step 35: Click on input selectAllRows"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_team_project_truetest_user_journeys_aut/input_selectAllRows'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 35-Click on input selectAllRows.png')

"Step 36: Click on button generateTestCases"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_team_project_truetest_user_journeys_aut/button_generateTestCases'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 36-Click on button generateTestCases.png')

"Step 37: Click on button generate"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_team_project_truetest_user_journeys_aut/button_generate'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 37-Click on button generate.png')

"Step 38: Click on span downloadArtifacts"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_team_project_truetest_user_journeys_aut/span_downloadArtifacts'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 38-Click on span downloadArtifacts.png')

"Step 39: Click on span downloadArtifacts"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_team_project_truetest_user_journeys_aut/span_downloadArtifacts'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 39-Click on span downloadArtifacts.png')

"Step 40: Click on link reports -> Navigate to page '/team/*/project/*/overview'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_team_project_truetest_user_journeys_aut/link_reports'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 40-Click on link reports - Navigate to page teamprojectoverview.png')

"Step 41: Click on link reports (reports)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/overview?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/QA/Dynamic Objects/Page_team_project_overview/link_reports"
WebUI.enhancedClick(findTestObject('AI-Generated/QA/Dynamic Objects/Page_team_project_overview/link_reports', ['link_reports_aTitle': link_reports_aTitle, 'link_reports_class': link_reports_class, 'link_reports_href_variable': link_reports_href_variable]))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 41-Click on link reports reports.png')

"Step 42: Click on link truetest -> Navigate to page '/team/*/project/*/truetest/user-journeys'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/overview?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_team_project_overview/link_truetest'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 42-Click on link truetest - Navigate to page teamprojecttruetestuser-journeys.png')

"Step 43: Click on button generateNewUserJourneyMap"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_team_project_truetest_user_journeys/button_generateNewUserJourneyMap'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 43-Click on button generateNewUserJourneyMap.png')

"Step 44: Click on label custom"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_team_project_truetest_user_journeys/label_custom'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 44-Click on label custom.png')

"Step 45: Click on div object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_team_project_truetest_user_journeys/div_object'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 45-Click on div object.png')

"Step 46: Click on button optionSelection (option14)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/QA/Dynamic Objects/Page_team_project_truetest_user_journeys/button_optionSelection"
WebUI.enhancedClick(findTestObject('AI-Generated/QA/Dynamic Objects/Page_team_project_truetest_user_journeys/button_optionSelection', ['button_optionSelection_class': button_optionSelection_class_1, 'button_optionSelection_internalText': button_optionSelection_internalText_1]))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 46-Click on button optionSelection option14.png')

"Step 47: Click on item timeOptions ( 0Minutes)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/QA/Dynamic Objects/Page_team_project_truetest_user_journeys/item_timeOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/QA/Dynamic Objects/Page_team_project_truetest_user_journeys/item_timeOptions', ['item_timeOptions_class': item_timeOptions_class_1, 'item_timeOptions_liAriaLabel': item_timeOptions_liAriaLabel_1, 'item_timeOptions_ulNthOfType': item_timeOptions_ulNthOfType_1]))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 47-Click on item timeOptions  0Minutes.png')

"Step 48: Click on button optionSelection (option142)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/QA/Dynamic Objects/Page_team_project_truetest_user_journeys/button_optionSelection"
WebUI.enhancedClick(findTestObject('AI-Generated/QA/Dynamic Objects/Page_team_project_truetest_user_journeys/button_optionSelection', ['button_optionSelection_class': button_optionSelection_class_2, 'button_optionSelection_internalText': button_optionSelection_internalText_2]))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 48-Click on button optionSelection option142.png')

"Step 49: Click on item timeOptions (option14Hours)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/QA/Dynamic Objects/Page_team_project_truetest_user_journeys/item_timeOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/QA/Dynamic Objects/Page_team_project_truetest_user_journeys/item_timeOptions', ['item_timeOptions_class': item_timeOptions_class_2, 'item_timeOptions_liAriaLabel': item_timeOptions_liAriaLabel_2, 'item_timeOptions_ulNthOfType': item_timeOptions_ulNthOfType_2]))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 49-Click on item timeOptions option14Hours.png')

"Step 50: Click on item timeOptions ( 10Minutes)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/QA/Dynamic Objects/Page_team_project_truetest_user_journeys/item_timeOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/QA/Dynamic Objects/Page_team_project_truetest_user_journeys/item_timeOptions', ['item_timeOptions_class': item_timeOptions_class_3, 'item_timeOptions_liAriaLabel': item_timeOptions_liAriaLabel_3, 'item_timeOptions_ulNthOfType': item_timeOptions_ulNthOfType_3]))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 50-Click on item timeOptions  10Minutes.png')

"Step 51: Click on label ignorePreviousFlows"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_team_project_truetest_user_journeys/label_ignorePreviousFlows'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 51-Click on label ignorePreviousFlows.png')

"Step 52: Click on button generate"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_team_project_truetest_user_journeys/button_generate'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 52-Click on button generate.png')

"Step 53: Click on button gotIt"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_team_project_truetest_user_journeys/button_gotIt'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 53-Click on button gotIt.png')

"Step 54: Click on link reports -> Navigate to page '/team/*/project/*/overview'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_team_project_truetest_user_journeys/link_reports'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 54-Click on link reports - Navigate to page teamprojectoverview.png')

"Step 55: Click on link truetest -> Navigate to page '/team/*/project/*/truetest/user-journeys'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/overview?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_team_project_overview/link_truetest'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 55-Click on link truetest - Navigate to page teamprojecttruetestuser-journeys.png')

"Step 56: Click on button viewDetails (viewDetails3) -> Navigate to page '/team/*/project/*/truetest/user-journeys/*/aut/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/QA/Dynamic Objects/Page_team_project_truetest_user_journeys/button_viewDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/QA/Dynamic Objects/Page_team_project_truetest_user_journeys/button_viewDetails', ['button_viewDetails_dataTestid': button_viewDetails_dataTestid_2]))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 56-Click on button viewDetails viewDetails3 - Navigate to page teamprojecttruetestuser-journeysaut.png')

"Step 57: Click on button object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_team_project_truetest_user_journeys_aut/button_object'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 57-Click on button object.png')

"Step 58: Click on input selectAllRows"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_team_project_truetest_user_journeys_aut/input_selectAllRows'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 58-Click on input selectAllRows.png')

"Step 59: Click on button generateTestCases"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_team_project_truetest_user_journeys_aut/button_generateTestCases'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 59-Click on button generateTestCases.png')

"Step 60: Click on button generate"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_team_project_truetest_user_journeys_aut/button_generate'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 60-Click on button generate.png')

"Step 61: Click on link reports -> Navigate to page '/team/*/project/*/overview'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_team_project_truetest_user_journeys_aut/link_reports'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 61-Click on link reports - Navigate to page teamprojectoverview.png')

"Step 62: Click on link truetest -> Navigate to page '/team/*/project/*/truetest/user-journeys'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/overview?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_team_project_overview/link_truetest'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 62-Click on link truetest - Navigate to page teamprojecttruetestuser-journeys.png')

"Step 63: Click on button viewDetails (viewDetails3) -> Navigate to page '/team/*/project/*/truetest/user-journeys/*/aut/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/QA/Dynamic Objects/Page_team_project_truetest_user_journeys/button_viewDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/QA/Dynamic Objects/Page_team_project_truetest_user_journeys/button_viewDetails', ['button_viewDetails_dataTestid': button_viewDetails_dataTestid_3]))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 63-Click on button viewDetails viewDetails3 - Navigate to page teamprojecttruetestuser-journeysaut.png')

"Step 64: Click on button viewFlowsInTableMode"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_team_project_truetest_user_journeys_aut/button_viewFlowsInTableMode'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 64-Click on button viewFlowsInTableMode.png')

"Step 65: Click on span downloadArtifacts"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_team_project_truetest_user_journeys_aut/span_downloadArtifacts'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 65-Click on span downloadArtifacts.png')

"Step 66: Click on link reports -> Navigate to page '/team/*/project/*/overview'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_team_project_truetest_user_journeys_aut/link_reports'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 66-Click on link reports - Navigate to page teamprojectoverview.png')

"Step 67: Click on link truetest -> Navigate to page '/team/*/project/*/truetest/user-journeys'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/overview?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_team_project_overview/link_truetest'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 67-Click on link truetest - Navigate to page teamprojecttruetestuser-journeys.png')

"Step 68: Click on button viewDetails (viewDetails3) -> Navigate to page '/team/*/project/*/truetest/user-journeys/*/aut/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/QA/Dynamic Objects/Page_team_project_truetest_user_journeys/button_viewDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/QA/Dynamic Objects/Page_team_project_truetest_user_journeys/button_viewDetails', ['button_viewDetails_dataTestid': button_viewDetails_dataTestid_4]))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 68-Click on button viewDetails viewDetails3 - Navigate to page teamprojecttruetestuser-journeysaut.png')

"Step 69: Click on button object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_team_project_truetest_user_journeys_aut/button_object'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 69-Click on button object.png')

"Step 70: Click on span downloadArtifacts -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys/.*/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_team_project_truetest_user_journeys_aut/span_downloadArtifacts'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 70-Click on span downloadArtifacts - Navigate to page .png')

"Step 71: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC7-Archive Obsolete User Flows and Generate Test Cases_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}