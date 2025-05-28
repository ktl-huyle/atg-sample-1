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

"Step 1: Navigate to /organization/*/home"

TrueTestScripts.navigate("/organization/${organization_id}/home")

"Step 2: Click on link csCellphoneShop -> Navigate to page '/team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_organization_home/link_csCellphoneShop'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 2-Click on link csCellphoneShop - Navigate to page teamproject.png')

"Step 3: Click on link truetest -> Navigate to page '/team/*/project/*/truetest/user-journeys'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_team_project/link_truetest'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 3-Click on link truetest - Navigate to page teamprojecttruetestuser-journeys.png')

"Step 4: Click on button generateNewUserJourneyMap"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_team_project_truetest_user_journeys/button_generateNewUserJourneyMap'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 4-Click on button generateNewUserJourneyMap.png')

"Step 5: Click on label custom"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_team_project_truetest_user_journeys/label_custom'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 5-Click on label custom.png')

"Step 6: Click on div object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_team_project_truetest_user_journeys/div_object'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 6-Click on div object.png')

"Step 7: Click on button monthNavigation (previousMonth)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/QA/Dynamic Objects/Page_team_project_truetest_user_journeys/button_monthNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/QA/Dynamic Objects/Page_team_project_truetest_user_journeys/button_monthNavigation', ['button_monthNavigation_buttonAriaLabel': button_monthNavigation_buttonAriaLabel, 'button_monthNavigation_class': button_monthNavigation_class]))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 7-Click on button monthNavigation previousMonth.png')

"Step 8: Click on button optionSelection (object)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/QA/Dynamic Objects/Page_team_project_truetest_user_journeys/button_optionSelection"
WebUI.enhancedClick(findTestObject('AI-Generated/QA/Dynamic Objects/Page_team_project_truetest_user_journeys/button_optionSelection', ['button_optionSelection_class': button_optionSelection_class, 'button_optionSelection_internalText': button_optionSelection_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 8-Click on button optionSelection object.png')

"Step 9: Click on button ok"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_team_project_truetest_user_journeys/button_ok'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 9-Click on button ok.png')

"Step 10: Click on div object2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_team_project_truetest_user_journeys/div_object2'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 10-Click on div object2.png')

"Step 11: Click on button monthNavigation (nextMonth)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/QA/Dynamic Objects/Page_team_project_truetest_user_journeys/button_monthNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/QA/Dynamic Objects/Page_team_project_truetest_user_journeys/button_monthNavigation', ['button_monthNavigation_buttonAriaLabel': button_monthNavigation_buttonAriaLabel_1, 'button_monthNavigation_class': button_monthNavigation_class_1]))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 11-Click on button monthNavigation nextMonth.png')

"Step 12: Click on button optionSelection (selectOption)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/QA/Dynamic Objects/Page_team_project_truetest_user_journeys/button_optionSelection_1"
WebUI.enhancedClick(findTestObject('AI-Generated/QA/Dynamic Objects/Page_team_project_truetest_user_journeys/button_optionSelection_1', ['button_optionSelection_internalText': button_optionSelection_internalText_1]))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 12-Click on button optionSelection selectOption.png')

"Step 13: Click on button optionSelection (five)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/QA/Dynamic Objects/Page_team_project_truetest_user_journeys/button_optionSelection_1"
WebUI.enhancedClick(findTestObject('AI-Generated/QA/Dynamic Objects/Page_team_project_truetest_user_journeys/button_optionSelection_1', ['button_optionSelection_internalText': button_optionSelection_internalText_2]))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 13-Click on button optionSelection five.png')

"Step 14: Click on button ok"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_team_project_truetest_user_journeys/button_ok'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 14-Click on button ok.png')

"Step 15: Click on label ignorePreviousFlows"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_team_project_truetest_user_journeys/label_ignorePreviousFlows'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 15-Click on label ignorePreviousFlows.png')

"Step 16: Click on button generate"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_team_project_truetest_user_journeys/button_generate'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 16-Click on button generate.png')

"Step 17: Click on button gotIt"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_team_project_truetest_user_journeys/button_gotIt'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 17-Click on button gotIt.png')

"Step 18: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC6-Generate User Journey Maps for Truetest Projects_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}