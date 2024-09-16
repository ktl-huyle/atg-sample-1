import internal.GlobalVariable
import katalon.truetest.TrueTestScripts
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.configuration.RunConfiguration

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

"Step 3: Navigate to team/*/project/*/*"

TrueTestScripts.navigate("team/${GlobalVariable.team_id}/project/${GlobalVariable.project_id}/${GlobalVariable.path_param_5}")

"Step 4: Click on link testResultSummary (object10)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_testResultSummary"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_testResultSummary', ['link_testResultSummary_class': link_testResultSummary_class, 'link_testResultSummary_internalRoleCellName': link_testResultSummary_internalRoleCellName]))

WebUI.takeScreenshot(reportLocation + '/TC385/Step 4-Click on link testResultSummary object10.png')

"Step 5: Click on button terminate"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_terminate'))

WebUI.takeScreenshot(reportLocation + '/TC385/Step 5-Click on button terminate.png')

"Step 6: Click on button confirm"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_confirm'))

WebUI.takeScreenshot(reportLocation + '/TC385/Step 6-Click on button confirm.png')

"Step 7: Click on link testResultSummary (object11)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_testResultSummary"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_testResultSummary', ['link_testResultSummary_class': link_testResultSummary_class_1, 'link_testResultSummary_internalRoleCellName': link_testResultSummary_internalRoleCellName_1]))

WebUI.takeScreenshot(reportLocation + '/TC385/Step 7-Click on link testResultSummary object11.png')

"Step 8: Click on button objectActions (object2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_objectActions_2"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_objectActions_2', ['button_objectActions_class': button_objectActions_class, 'button_objectActions_nth': button_objectActions_nth]))

WebUI.takeScreenshot(reportLocation + '/TC385/Step 8-Click on button objectActions object2.png')

"Step 9: Click on button terminate"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_terminate'))

WebUI.takeScreenshot(reportLocation + '/TC385/Step 9-Click on button terminate.png')

"Step 10: Click on button confirm"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_confirm'))

WebUI.takeScreenshot(reportLocation + '/TC385/Step 10-Click on button confirm.png')

"Step 11: Click on button objectActions (alert)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_objectActions_2"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_objectActions_2', ['button_objectActions_class': button_objectActions_class_1]))

WebUI.takeScreenshot(reportLocation + '/TC385/Step 11-Click on button objectActions alert.png')

"Step 12: Click on link testResultSummary (object12)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_testResultSummary"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_testResultSummary', ['link_testResultSummary_class': link_testResultSummary_class_2, 'link_testResultSummary_internalRoleCellName': link_testResultSummary_internalRoleCellName_2]))

WebUI.takeScreenshot(reportLocation + '/TC385/Step 12-Click on link testResultSummary object12.png')

"Step 13: Click on button terminate"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_terminate'))

WebUI.takeScreenshot(reportLocation + '/TC385/Step 13-Click on button terminate.png')

"Step 14: Click on button confirm"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_confirm'))

WebUI.takeScreenshot(reportLocation + '/TC385/Step 14-Click on button confirm.png')

"Step 15: Click on link testResultSummary (object13)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_testResultSummary"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_testResultSummary', ['link_testResultSummary_class': link_testResultSummary_class_3, 'link_testResultSummary_internalRoleCellName': link_testResultSummary_internalRoleCellName_3]))

WebUI.takeScreenshot(reportLocation + '/TC385/Step 15-Click on link testResultSummary object13.png')

"Step 16: Click on button terminate"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_terminate'))

WebUI.takeScreenshot(reportLocation + '/TC385/Step 16-Click on button terminate.png')

"Step 17: Click on button confirm"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_confirm'))

WebUI.takeScreenshot(reportLocation + '/TC385/Step 17-Click on button confirm.png')

"Step 18: Click on div object14"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_object14'))

WebUI.takeScreenshot(reportLocation + '/TC385/Step 18-Click on div object14.png')

"Step 19: Click on link testResultSummary (object15)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_testResultSummary"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_testResultSummary', ['link_testResultSummary_class': link_testResultSummary_class_4, 'link_testResultSummary_internalRoleCellName': link_testResultSummary_internalRoleCellName_4]))

WebUI.takeScreenshot(reportLocation + '/TC385/Step 19-Click on link testResultSummary object15.png')

"Step 20: Click on button objectActions (object2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_objectActions_2"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_objectActions_2', ['button_objectActions_class': button_objectActions_class_2, 'button_objectActions_nth': button_objectActions_nth_1]))

WebUI.takeScreenshot(reportLocation + '/TC385/Step 20-Click on button objectActions object2.png')

"Step 21: Click on button terminate"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_terminate'))

WebUI.takeScreenshot(reportLocation + '/TC385/Step 21-Click on button terminate.png')

"Step 22: Click on button confirm"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_confirm'))

WebUI.takeScreenshot(reportLocation + '/TC385/Step 22-Click on button confirm.png')

"Step 23: Click on link testResultSummary (object16)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_testResultSummary"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_testResultSummary', ['link_testResultSummary_class': link_testResultSummary_class_5, 'link_testResultSummary_internalRoleCellName': link_testResultSummary_internalRoleCellName_5]))

WebUI.takeScreenshot(reportLocation + '/TC385/Step 23-Click on link testResultSummary object16.png')

"Step 24: Click on button terminate"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_terminate'))

WebUI.takeScreenshot(reportLocation + '/TC385/Step 24-Click on button terminate.png')

"Step 25: Click on button confirm"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_confirm'))

WebUI.takeScreenshot(reportLocation + '/TC385/Step 25-Click on button confirm.png')

"Step 26: Click on link testResultSummary (object17)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_testResultSummary"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_testResultSummary', ['link_testResultSummary_class': link_testResultSummary_class_6, 'link_testResultSummary_internalRoleCellName': link_testResultSummary_internalRoleCellName_6]))

WebUI.takeScreenshot(reportLocation + '/TC385/Step 26-Click on link testResultSummary object17.png')

"Step 27: Click on button terminate"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_terminate'))

WebUI.takeScreenshot(reportLocation + '/TC385/Step 27-Click on button terminate.png')

"Step 28: Click on button confirm"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_confirm'))

WebUI.takeScreenshot(reportLocation + '/TC385/Step 28-Click on button confirm.png')

"Step 29: Click on link testResultSummary (object18)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_testResultSummary"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_testResultSummary', ['link_testResultSummary_class': link_testResultSummary_class_7, 'link_testResultSummary_internalRoleCellName': link_testResultSummary_internalRoleCellName_7]))

WebUI.takeScreenshot(reportLocation + '/TC385/Step 29-Click on link testResultSummary object18.png')

"Step 30: Click on button objectActions (object2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_objectActions_2"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_objectActions_2', ['button_objectActions_class': button_objectActions_class_3, 'button_objectActions_nth': button_objectActions_nth_2]))

WebUI.takeScreenshot(reportLocation + '/TC385/Step 30-Click on button objectActions object2.png')

"Step 31: Click on button terminate"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_terminate'))

WebUI.takeScreenshot(reportLocation + '/TC385/Step 31-Click on button terminate.png')

"Step 32: Click on button confirm"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_confirm'))

WebUI.takeScreenshot(reportLocation + '/TC385/Step 32-Click on button confirm.png')

"Step 33: Click on link testResultSummary (object19)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_testResultSummary"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_testResultSummary', ['link_testResultSummary_class': link_testResultSummary_class_8, 'link_testResultSummary_internalRoleCellName': link_testResultSummary_internalRoleCellName_8]))

WebUI.takeScreenshot(reportLocation + '/TC385/Step 33-Click on link testResultSummary object19.png')

"Step 34: Click on button objectActions (object2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_objectActions_2"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_objectActions_2', ['button_objectActions_class': button_objectActions_class_4, 'button_objectActions_nth': button_objectActions_nth_3]))

WebUI.takeScreenshot(reportLocation + '/TC385/Step 34-Click on button objectActions object2.png')

"Step 35: Click on button terminate"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_terminate'))

WebUI.takeScreenshot(reportLocation + '/TC385/Step 35-Click on button terminate.png')

"Step 36: Click on button confirm"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_confirm'))

WebUI.takeScreenshot(reportLocation + '/TC385/Step 36-Click on button confirm.png')

"Step 37: Click on link testResultSummary (object20)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_testResultSummary"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_testResultSummary', ['link_testResultSummary_class': link_testResultSummary_class_9, 'link_testResultSummary_internalRoleCellName': link_testResultSummary_internalRoleCellName_9]))

WebUI.takeScreenshot(reportLocation + '/TC385/Step 37-Click on link testResultSummary object20.png')

"Step 38: Click on div object21"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_object21'))

WebUI.takeScreenshot(reportLocation + '/TC385/Step 38-Click on div object21.png')

"Step 39: Click on button terminate"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_terminate'))

WebUI.takeScreenshot(reportLocation + '/TC385/Step 39-Click on button terminate.png')

"Step 40: Click on button confirm"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_confirm'))

WebUI.takeScreenshot(reportLocation + '/TC385/Step 40-Click on button confirm.png')

"Step 41: Click on link testResultSummary (object22)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_testResultSummary"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_testResultSummary', ['link_testResultSummary_class': link_testResultSummary_class_10, 'link_testResultSummary_internalRoleCellName': link_testResultSummary_internalRoleCellName_10]))

WebUI.takeScreenshot(reportLocation + '/TC385/Step 41-Click on link testResultSummary object22.png')

"Step 42: Click on button objectActions (object2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_objectActions_2"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_objectActions_2', ['button_objectActions_class': button_objectActions_class_5, 'button_objectActions_nth': button_objectActions_nth_4]))

WebUI.takeScreenshot(reportLocation + '/TC385/Step 42-Click on button objectActions object2.png')

"Step 43: Click on button terminate"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_terminate'))

WebUI.takeScreenshot(reportLocation + '/TC385/Step 43-Click on button terminate.png')

"Step 44: Click on button confirm"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_confirm'))

WebUI.takeScreenshot(reportLocation + '/TC385/Step 44-Click on button confirm.png')

"Step 45: Click on link testResultSummary (object23)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_testResultSummary"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_testResultSummary', ['link_testResultSummary_class': link_testResultSummary_class_11, 'link_testResultSummary_internalRoleCellName': link_testResultSummary_internalRoleCellName_11]))

WebUI.takeScreenshot(reportLocation + '/TC385/Step 45-Click on link testResultSummary object23.png')

"Step 46: Click on button objectActions (object2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_objectActions_2"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_objectActions_2', ['button_objectActions_class': button_objectActions_class_6, 'button_objectActions_nth': button_objectActions_nth_5]))

WebUI.takeScreenshot(reportLocation + '/TC385/Step 46-Click on button objectActions object2.png')

"Step 47: Click on button terminate"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_terminate'))

WebUI.takeScreenshot(reportLocation + '/TC385/Step 47-Click on button terminate.png')

"Step 48: Click on button confirm"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_confirm'))

WebUI.takeScreenshot(reportLocation + '/TC385/Step 48-Click on button confirm.png')

"Step 49: Click on link testResultSummary (object24)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_testResultSummary"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_testResultSummary', ['link_testResultSummary_class': link_testResultSummary_class_12, 'link_testResultSummary_internalRoleCellName': link_testResultSummary_internalRoleCellName_12]))

WebUI.takeScreenshot(reportLocation + '/TC385/Step 49-Click on link testResultSummary object24.png')

"Step 50: Click on button terminate"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_terminate'))

WebUI.takeScreenshot(reportLocation + '/TC385/Step 50-Click on button terminate.png')

"Step 51: Click on button confirm"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_confirm'))

WebUI.takeScreenshot(reportLocation + '/TC385/Step 51-Click on button confirm.png')

"Step 52: Click on link testResultSummary (object25)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_testResultSummary"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_testResultSummary', ['link_testResultSummary_class': link_testResultSummary_class_13, 'link_testResultSummary_internalRoleCellName': link_testResultSummary_internalRoleCellName_13]))

WebUI.takeScreenshot(reportLocation + '/TC385/Step 52-Click on link testResultSummary object25.png')

"Step 53: Click on button objectActions (object2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_objectActions_2"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_objectActions_2', ['button_objectActions_class': button_objectActions_class_7, 'button_objectActions_nth': button_objectActions_nth_6]))

WebUI.takeScreenshot(reportLocation + '/TC385/Step 53-Click on button objectActions object2.png')

"Step 54: Click on button terminate"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_terminate'))

WebUI.takeScreenshot(reportLocation + '/TC385/Step 54-Click on button terminate.png')

"Step 55: Click on button confirm"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_confirm'))

WebUI.takeScreenshot(reportLocation + '/TC385/Step 55-Click on button confirm.png')

"Step 56: Click on link testResultSummary (object26)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_testResultSummary"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_testResultSummary', ['link_testResultSummary_class': link_testResultSummary_class_14, 'link_testResultSummary_internalRoleCellName': link_testResultSummary_internalRoleCellName_14]))

WebUI.takeScreenshot(reportLocation + '/TC385/Step 56-Click on link testResultSummary object26.png')

"Step 57: Click on button objectActions (object2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_objectActions_2"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_objectActions_2', ['button_objectActions_class': button_objectActions_class_8, 'button_objectActions_nth': button_objectActions_nth_7]))

WebUI.takeScreenshot(reportLocation + '/TC385/Step 57-Click on button objectActions object2.png')

"Step 58: Click on button terminate"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_terminate'))

WebUI.takeScreenshot(reportLocation + '/TC385/Step 58-Click on button terminate.png')

"Step 59: Click on button confirm"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_confirm'))

WebUI.takeScreenshot(reportLocation + '/TC385/Step 59-Click on button confirm.png')

"Step 60: Click on link testResultSummary (object27)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_testResultSummary"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_testResultSummary', ['link_testResultSummary_class': link_testResultSummary_class_15, 'link_testResultSummary_internalRoleCellName': link_testResultSummary_internalRoleCellName_15]))

WebUI.takeScreenshot(reportLocation + '/TC385/Step 60-Click on link testResultSummary object27.png')

"Step 61: Click on button objectActions (object2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_objectActions_2"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_objectActions_2', ['button_objectActions_class': button_objectActions_class_9, 'button_objectActions_nth': button_objectActions_nth_8]))

WebUI.takeScreenshot(reportLocation + '/TC385/Step 61-Click on button objectActions object2.png')

"Step 62: Click on button terminate"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_terminate'))

WebUI.takeScreenshot(reportLocation + '/TC385/Step 62-Click on button terminate.png')

"Step 63: Click on button confirm"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_confirm'))

WebUI.takeScreenshot(reportLocation + '/TC385/Step 63-Click on button confirm.png')

"Step 64: Click on link testResultSummary (object28)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_testResultSummary"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_testResultSummary', ['link_testResultSummary_class': link_testResultSummary_class_16, 'link_testResultSummary_internalRoleCellName': link_testResultSummary_internalRoleCellName_16]))

WebUI.takeScreenshot(reportLocation + '/TC385/Step 64-Click on link testResultSummary object28.png')

"Step 65: Click on button terminate"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_terminate'))

WebUI.takeScreenshot(reportLocation + '/TC385/Step 65-Click on button terminate.png')

"Step 66: Click on button confirm"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_confirm'))

WebUI.takeScreenshot(reportLocation + '/TC385/Step 66-Click on button confirm.png')

"Step 67: Click on link testResultSummary (object29)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_testResultSummary"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_testResultSummary', ['link_testResultSummary_class': link_testResultSummary_class_17, 'link_testResultSummary_internalRoleCellName': link_testResultSummary_internalRoleCellName_17]))

WebUI.takeScreenshot(reportLocation + '/TC385/Step 67-Click on link testResultSummary object29.png')

"Step 68: Click on button terminate"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_terminate'))

WebUI.takeScreenshot(reportLocation + '/TC385/Step 68-Click on button terminate.png')

"Step 69: Click on button confirm"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_confirm'))

WebUI.takeScreenshot(reportLocation + '/TC385/Step 69-Click on button confirm.png')

"Step 70: Click on link testResultSummary (object30)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_testResultSummary"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_testResultSummary', ['link_testResultSummary_class': link_testResultSummary_class_18, 'link_testResultSummary_internalRoleCellName': link_testResultSummary_internalRoleCellName_18]))

WebUI.takeScreenshot(reportLocation + '/TC385/Step 70-Click on link testResultSummary object30.png')

"Step 71: Click on button objectActions (object2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_objectActions_2"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_objectActions_2', ['button_objectActions_class': button_objectActions_class_10, 'button_objectActions_nth': button_objectActions_nth_9]))

WebUI.takeScreenshot(reportLocation + '/TC385/Step 71-Click on button objectActions object2.png')

"Step 72: Click on button terminate"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_terminate'))

WebUI.takeScreenshot(reportLocation + '/TC385/Step 72-Click on button terminate.png')

"Step 73: Click on button confirm"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_confirm'))

WebUI.takeScreenshot(reportLocation + '/TC385/Step 73-Click on button confirm.png')

"Step 74: Click on link testResultSummary (object31)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_testResultSummary"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_testResultSummary', ['link_testResultSummary_class': link_testResultSummary_class_19, 'link_testResultSummary_internalRoleCellName': link_testResultSummary_internalRoleCellName_19]))

WebUI.takeScreenshot(reportLocation + '/TC385/Step 74-Click on link testResultSummary object31.png')

"Step 75: Click on button objectActions (object2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_objectActions_2"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_objectActions_2', ['button_objectActions_class': button_objectActions_class_11, 'button_objectActions_nth': button_objectActions_nth_10]))

WebUI.takeScreenshot(reportLocation + '/TC385/Step 75-Click on button objectActions object2.png')

"Step 76: Click on button terminate"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_terminate'))

WebUI.takeScreenshot(reportLocation + '/TC385/Step 76-Click on button terminate.png')

"Step 77: Click on button confirm"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_confirm'))

WebUI.takeScreenshot(reportLocation + '/TC385/Step 77-Click on button confirm.png')

"Step 78: Click on link testResultSummary (object32)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_testResultSummary"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_testResultSummary', ['link_testResultSummary_class': link_testResultSummary_class_20, 'link_testResultSummary_internalRoleCellName': link_testResultSummary_internalRoleCellName_20]))

WebUI.takeScreenshot(reportLocation + '/TC385/Step 78-Click on link testResultSummary object32.png')

"Step 79: Click on button objectActions (object2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_objectActions_2"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_objectActions_2', ['button_objectActions_class': button_objectActions_class_12, 'button_objectActions_nth': button_objectActions_nth_11]))

WebUI.takeScreenshot(reportLocation + '/TC385/Step 79-Click on button objectActions object2.png')

"Step 80: Click on button terminate"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_terminate'))

WebUI.takeScreenshot(reportLocation + '/TC385/Step 80-Click on button terminate.png')

"Step 81: Click on button confirm"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_confirm'))

WebUI.takeScreenshot(reportLocation + '/TC385/Step 81-Click on button confirm.png')

"Step 82: Click on link testResultSummary (object33)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_testResultSummary"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_testResultSummary', ['link_testResultSummary_class': link_testResultSummary_class_21, 'link_testResultSummary_internalRoleCellName': link_testResultSummary_internalRoleCellName_21]))

WebUI.takeScreenshot(reportLocation + '/TC385/Step 82-Click on link testResultSummary object33.png')

"Step 83: Click on button objectActions (object2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_objectActions_2"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_objectActions_2', ['button_objectActions_class': button_objectActions_class_13, 'button_objectActions_nth': button_objectActions_nth_12]))

WebUI.takeScreenshot(reportLocation + '/TC385/Step 83-Click on button objectActions object2.png')

"Step 84: Click on button terminate"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_terminate'))

WebUI.takeScreenshot(reportLocation + '/TC385/Step 84-Click on button terminate.png')

"Step 85: Click on button confirm"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_confirm'))

WebUI.takeScreenshot(reportLocation + '/TC385/Step 85-Click on button confirm.png')

"Step 86: Click on link testResultSummary (object34)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_testResultSummary"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_testResultSummary', ['link_testResultSummary_class': link_testResultSummary_class_22, 'link_testResultSummary_internalRoleCellName': link_testResultSummary_internalRoleCellName_22]))

WebUI.takeScreenshot(reportLocation + '/TC385/Step 86-Click on link testResultSummary object34.png')

"Step 87: Click on button objectActions (object2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_objectActions_2"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_objectActions_2', ['button_objectActions_class': button_objectActions_class_14, 'button_objectActions_nth': button_objectActions_nth_13]))

WebUI.takeScreenshot(reportLocation + '/TC385/Step 87-Click on button objectActions object2.png')

"Step 88: Click on button terminate"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_terminate'))

WebUI.takeScreenshot(reportLocation + '/TC385/Step 88-Click on button terminate.png')

"Step 89: Click on button confirm"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_confirm'))

WebUI.takeScreenshot(reportLocation + '/TC385/Step 89-Click on button confirm.png')

"Step 90: Click on link testResultSummary (object35)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_testResultSummary"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_testResultSummary', ['link_testResultSummary_class': link_testResultSummary_class_23, 'link_testResultSummary_internalRoleCellName': link_testResultSummary_internalRoleCellName_23]))

WebUI.takeScreenshot(reportLocation + '/TC385/Step 90-Click on link testResultSummary object35.png')

"Step 91: Click on button objectActions (object2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_objectActions_2"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_objectActions_2', ['button_objectActions_class': button_objectActions_class_15, 'button_objectActions_nth': button_objectActions_nth_14]))

WebUI.takeScreenshot(reportLocation + '/TC385/Step 91-Click on button objectActions object2.png')

"Step 92: Click on button terminate"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_terminate'))

WebUI.takeScreenshot(reportLocation + '/TC385/Step 92-Click on button terminate.png')

"Step 93: Click on button confirm"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_confirm'))

WebUI.takeScreenshot(reportLocation + '/TC385/Step 93-Click on button confirm.png')

"Step 94: Click on link testResultSummary (object36)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_testResultSummary"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_testResultSummary', ['link_testResultSummary_class': link_testResultSummary_class_24, 'link_testResultSummary_internalRoleCellName': link_testResultSummary_internalRoleCellName_24]))

WebUI.takeScreenshot(reportLocation + '/TC385/Step 94-Click on link testResultSummary object36.png')

"Step 95: Click on button terminate"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_terminate'))

WebUI.takeScreenshot(reportLocation + '/TC385/Step 95-Click on button terminate.png')

"Step 96: Click on button confirm"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_confirm'))

WebUI.takeScreenshot(reportLocation + '/TC385/Step 96-Click on button confirm.png')

"Step 97: Click on link testResultSummary (summaryByTestResult)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_testResultSummary"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_testResultSummary', ['link_testResultSummary_class': link_testResultSummary_class_25, 'link_testResultSummary_internalRoleCellName': link_testResultSummary_internalRoleCellName_25]))

WebUI.takeScreenshot(reportLocation + '/TC385/Step 97-Click on link testResultSummary summaryByTestResult.png')

"Step 98: Click on button objectActions (object2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_objectActions_2"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_objectActions_2', ['button_objectActions_class': button_objectActions_class_16, 'button_objectActions_nth': button_objectActions_nth_15]))

WebUI.takeScreenshot(reportLocation + '/TC385/Step 98-Click on button objectActions object2.png')

"Step 99: Click on button terminate"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_terminate'))

WebUI.takeScreenshot(reportLocation + '/TC385/Step 99-Click on button terminate.png')

"Step 100: Click on button confirm -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_confirm'))

WebUI.takeScreenshot(reportLocation + '/TC385/Step 100-Click on button confirm - Navigate to page .png')

"Step 101: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC385-Terminate Multiple Test Results_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}