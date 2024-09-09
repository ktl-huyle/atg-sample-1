import katalon.truetest.TrueTestScripts
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.configuration.RunConfiguration
import internal.GlobalVariable
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

"Step 3: Navigate to team/*/project/*/*"

TrueTestScripts.navigate("team/${GlobalVariable.team_id}/project/${GlobalVariable.project_id}/${GlobalVariable.path_param_5}")

"Step 4: Click on div object9"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_object9'))

WebUI.takeScreenshot(reportLocation + '/TC72/Step 4-Click on div object9.png')

"Step 5: Click on button details2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_details2'))

WebUI.takeScreenshot(reportLocation + '/TC72/Step 5-Click on button details2.png')

"Step 6: Click on button confirm"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_confirm'))

WebUI.takeScreenshot(reportLocation + '/TC72/Step 6-Click on button confirm.png')

"Step 7: Click on div object24"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_object24'))

WebUI.takeScreenshot(reportLocation + '/TC72/Step 7-Click on div object24.png')

"Step 8: Click on button object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_object'))

WebUI.takeScreenshot(reportLocation + '/TC72/Step 8-Click on button object.png')

"Step 9: Click on button details2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_details2'))

WebUI.takeScreenshot(reportLocation + '/TC72/Step 9-Click on button details2.png')

"Step 10: Click on button confirm"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_confirm'))

WebUI.takeScreenshot(reportLocation + '/TC72/Step 10-Click on button confirm.png')

"Step 11: Click on button object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_object'))

WebUI.takeScreenshot(reportLocation + '/TC72/Step 11-Click on button object.png')

"Step 12: Click on div object25"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_object25'))

WebUI.takeScreenshot(reportLocation + '/TC72/Step 12-Click on div object25.png')

"Step 13: Click on button details2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_details2'))

WebUI.takeScreenshot(reportLocation + '/TC72/Step 13-Click on button details2.png')

"Step 14: Click on button confirm"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_confirm'))

WebUI.takeScreenshot(reportLocation + '/TC72/Step 14-Click on button confirm.png')

"Step 15: Click on div object26"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_object26'))

WebUI.takeScreenshot(reportLocation + '/TC72/Step 15-Click on div object26.png')

"Step 16: Click on button details2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_details2'))

WebUI.takeScreenshot(reportLocation + '/TC72/Step 16-Click on button details2.png')

"Step 17: Click on button confirm"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_confirm'))

WebUI.takeScreenshot(reportLocation + '/TC72/Step 17-Click on button confirm.png')

"Step 18: Click on div object27"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_object27'))

WebUI.takeScreenshot(reportLocation + '/TC72/Step 18-Click on div object27.png')

"Step 19: Click on div object28"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_object28'))

WebUI.takeScreenshot(reportLocation + '/TC72/Step 19-Click on div object28.png')

"Step 20: Click on button object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_object'))

WebUI.takeScreenshot(reportLocation + '/TC72/Step 20-Click on button object.png')

"Step 21: Click on button details2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_details2'))

WebUI.takeScreenshot(reportLocation + '/TC72/Step 21-Click on button details2.png')

"Step 22: Click on button confirm"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_confirm'))

WebUI.takeScreenshot(reportLocation + '/TC72/Step 22-Click on button confirm.png')

"Step 23: Click on div object29"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_object29'))

WebUI.takeScreenshot(reportLocation + '/TC72/Step 23-Click on div object29.png')

"Step 24: Click on button details2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_details2'))

WebUI.takeScreenshot(reportLocation + '/TC72/Step 24-Click on button details2.png')

"Step 25: Click on button confirm"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_confirm'))

WebUI.takeScreenshot(reportLocation + '/TC72/Step 25-Click on button confirm.png')

"Step 26: Click on div object30"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_object30'))

WebUI.takeScreenshot(reportLocation + '/TC72/Step 26-Click on div object30.png')

"Step 27: Click on button details2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_details2'))

WebUI.takeScreenshot(reportLocation + '/TC72/Step 27-Click on button details2.png')

"Step 28: Click on button confirm"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_confirm'))

WebUI.takeScreenshot(reportLocation + '/TC72/Step 28-Click on button confirm.png')

"Step 29: Click on div object31"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_object31'))

WebUI.takeScreenshot(reportLocation + '/TC72/Step 29-Click on div object31.png')

"Step 30: Click on button object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_object'))

WebUI.takeScreenshot(reportLocation + '/TC72/Step 30-Click on button object.png')

"Step 31: Click on button details2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_details2'))

WebUI.takeScreenshot(reportLocation + '/TC72/Step 31-Click on button details2.png')

"Step 32: Click on button confirm"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_confirm'))

WebUI.takeScreenshot(reportLocation + '/TC72/Step 32-Click on button confirm.png')

"Step 33: Click on div object32"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_object32'))

WebUI.takeScreenshot(reportLocation + '/TC72/Step 33-Click on div object32.png')

"Step 34: Click on button object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_object'))

WebUI.takeScreenshot(reportLocation + '/TC72/Step 34-Click on button object.png')

"Step 35: Click on button details2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_details2'))

WebUI.takeScreenshot(reportLocation + '/TC72/Step 35-Click on button details2.png')

"Step 36: Click on button confirm"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_confirm'))

WebUI.takeScreenshot(reportLocation + '/TC72/Step 36-Click on button confirm.png')

"Step 37: Click on div object33"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_object33'))

WebUI.takeScreenshot(reportLocation + '/TC72/Step 37-Click on div object33.png')

"Step 38: Click on div object34"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_object34'))

WebUI.takeScreenshot(reportLocation + '/TC72/Step 38-Click on div object34.png')

"Step 39: Click on button details2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_details2'))

WebUI.takeScreenshot(reportLocation + '/TC72/Step 39-Click on button details2.png')

"Step 40: Click on button confirm"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_confirm'))

WebUI.takeScreenshot(reportLocation + '/TC72/Step 40-Click on button confirm.png')

"Step 41: Click on div object35"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_object35'))

WebUI.takeScreenshot(reportLocation + '/TC72/Step 41-Click on div object35.png')

"Step 42: Click on button object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_object'))

WebUI.takeScreenshot(reportLocation + '/TC72/Step 42-Click on button object.png')

"Step 43: Click on button details2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_details2'))

WebUI.takeScreenshot(reportLocation + '/TC72/Step 43-Click on button details2.png')

"Step 44: Click on button confirm"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_confirm'))

WebUI.takeScreenshot(reportLocation + '/TC72/Step 44-Click on button confirm.png')

"Step 45: Click on div object36"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_object36'))

WebUI.takeScreenshot(reportLocation + '/TC72/Step 45-Click on div object36.png')

"Step 46: Click on button object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_object'))

WebUI.takeScreenshot(reportLocation + '/TC72/Step 46-Click on button object.png')

"Step 47: Click on button details2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_details2'))

WebUI.takeScreenshot(reportLocation + '/TC72/Step 47-Click on button details2.png')

"Step 48: Click on button confirm"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_confirm'))

WebUI.takeScreenshot(reportLocation + '/TC72/Step 48-Click on button confirm.png')

"Step 49: Click on div object37"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_object37'))

WebUI.takeScreenshot(reportLocation + '/TC72/Step 49-Click on div object37.png')

"Step 50: Click on button details2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_details2'))

WebUI.takeScreenshot(reportLocation + '/TC72/Step 50-Click on button details2.png')

"Step 51: Click on button confirm"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_confirm'))

WebUI.takeScreenshot(reportLocation + '/TC72/Step 51-Click on button confirm.png')

"Step 52: Click on div object38"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_object38'))

WebUI.takeScreenshot(reportLocation + '/TC72/Step 52-Click on div object38.png')

"Step 53: Click on button object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_object'))

WebUI.takeScreenshot(reportLocation + '/TC72/Step 53-Click on button object.png')

"Step 54: Click on button details2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_details2'))

WebUI.takeScreenshot(reportLocation + '/TC72/Step 54-Click on button details2.png')

"Step 55: Click on button confirm"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_confirm'))

WebUI.takeScreenshot(reportLocation + '/TC72/Step 55-Click on button confirm.png')

"Step 56: Click on div object39"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_object39'))

WebUI.takeScreenshot(reportLocation + '/TC72/Step 56-Click on div object39.png')

"Step 57: Click on button object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_object'))

WebUI.takeScreenshot(reportLocation + '/TC72/Step 57-Click on button object.png')

"Step 58: Click on button details2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_details2'))

WebUI.takeScreenshot(reportLocation + '/TC72/Step 58-Click on button details2.png')

"Step 59: Click on button confirm"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_confirm'))

WebUI.takeScreenshot(reportLocation + '/TC72/Step 59-Click on button confirm.png')

"Step 60: Click on div object40"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_object40'))

WebUI.takeScreenshot(reportLocation + '/TC72/Step 60-Click on div object40.png')

"Step 61: Click on button object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_object'))

WebUI.takeScreenshot(reportLocation + '/TC72/Step 61-Click on button object.png')

"Step 62: Click on button details2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_details2'))

WebUI.takeScreenshot(reportLocation + '/TC72/Step 62-Click on button details2.png')

"Step 63: Click on button confirm"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_confirm'))

WebUI.takeScreenshot(reportLocation + '/TC72/Step 63-Click on button confirm.png')

"Step 64: Click on div object41"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_object41'))

WebUI.takeScreenshot(reportLocation + '/TC72/Step 64-Click on div object41.png')

"Step 65: Click on button details2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_details2'))

WebUI.takeScreenshot(reportLocation + '/TC72/Step 65-Click on button details2.png')

"Step 66: Click on button confirm"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_confirm'))

WebUI.takeScreenshot(reportLocation + '/TC72/Step 66-Click on button confirm.png')

"Step 67: Click on div object42"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_object42'))

WebUI.takeScreenshot(reportLocation + '/TC72/Step 67-Click on div object42.png')

"Step 68: Click on button details2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_details2'))

WebUI.takeScreenshot(reportLocation + '/TC72/Step 68-Click on button details2.png')

"Step 69: Click on button confirm"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_confirm'))

WebUI.takeScreenshot(reportLocation + '/TC72/Step 69-Click on button confirm.png')

"Step 70: Click on div object43"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_object43'))

WebUI.takeScreenshot(reportLocation + '/TC72/Step 70-Click on div object43.png')

"Step 71: Click on button object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_object'))

WebUI.takeScreenshot(reportLocation + '/TC72/Step 71-Click on button object.png')

"Step 72: Click on button details2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_details2'))

WebUI.takeScreenshot(reportLocation + '/TC72/Step 72-Click on button details2.png')

"Step 73: Click on button confirm"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_confirm'))

WebUI.takeScreenshot(reportLocation + '/TC72/Step 73-Click on button confirm.png')

"Step 74: Click on div object44"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_object44'))

WebUI.takeScreenshot(reportLocation + '/TC72/Step 74-Click on div object44.png')

"Step 75: Click on button object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_object'))

WebUI.takeScreenshot(reportLocation + '/TC72/Step 75-Click on button object.png')

"Step 76: Click on button details2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_details2'))

WebUI.takeScreenshot(reportLocation + '/TC72/Step 76-Click on button details2.png')

"Step 77: Click on button confirm"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_confirm'))

WebUI.takeScreenshot(reportLocation + '/TC72/Step 77-Click on button confirm.png')

"Step 78: Click on div object45"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_object45'))

WebUI.takeScreenshot(reportLocation + '/TC72/Step 78-Click on div object45.png')

"Step 79: Click on button object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_object'))

WebUI.takeScreenshot(reportLocation + '/TC72/Step 79-Click on button object.png')

"Step 80: Click on button details2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_details2'))

WebUI.takeScreenshot(reportLocation + '/TC72/Step 80-Click on button details2.png')

"Step 81: Click on button confirm"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_confirm'))

WebUI.takeScreenshot(reportLocation + '/TC72/Step 81-Click on button confirm.png')

"Step 82: Click on div object46"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_object46'))

WebUI.takeScreenshot(reportLocation + '/TC72/Step 82-Click on div object46.png')

"Step 83: Click on button object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_object'))

WebUI.takeScreenshot(reportLocation + '/TC72/Step 83-Click on button object.png')

"Step 84: Click on button details2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_details2'))

WebUI.takeScreenshot(reportLocation + '/TC72/Step 84-Click on button details2.png')

"Step 85: Click on button confirm"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_confirm'))

WebUI.takeScreenshot(reportLocation + '/TC72/Step 85-Click on button confirm.png')

"Step 86: Click on div object47"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_object47'))

WebUI.takeScreenshot(reportLocation + '/TC72/Step 86-Click on div object47.png')

"Step 87: Click on button object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_object'))

WebUI.takeScreenshot(reportLocation + '/TC72/Step 87-Click on button object.png')

"Step 88: Click on button details2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_details2'))

WebUI.takeScreenshot(reportLocation + '/TC72/Step 88-Click on button details2.png')

"Step 89: Click on button confirm"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_confirm'))

WebUI.takeScreenshot(reportLocation + '/TC72/Step 89-Click on button confirm.png')

"Step 90: Click on div object48"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_object48'))

WebUI.takeScreenshot(reportLocation + '/TC72/Step 90-Click on div object48.png')

"Step 91: Click on button object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_object'))

WebUI.takeScreenshot(reportLocation + '/TC72/Step 91-Click on button object.png')

"Step 92: Click on button details2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_details2'))

WebUI.takeScreenshot(reportLocation + '/TC72/Step 92-Click on button details2.png')

"Step 93: Click on button confirm"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_confirm'))

WebUI.takeScreenshot(reportLocation + '/TC72/Step 93-Click on button confirm.png')

"Step 94: Click on div object49"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_object49'))

WebUI.takeScreenshot(reportLocation + '/TC72/Step 94-Click on div object49.png')

"Step 95: Click on button details2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_details2'))

WebUI.takeScreenshot(reportLocation + '/TC72/Step 95-Click on button details2.png')

"Step 96: Click on button confirm"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_confirm'))

WebUI.takeScreenshot(reportLocation + '/TC72/Step 96-Click on button confirm.png')

"Step 97: Click on link summaryByTestResult"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_summaryByTestResult'))

WebUI.takeScreenshot(reportLocation + '/TC72/Step 97-Click on link summaryByTestResult.png')

"Step 98: Click on button object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_object'))

WebUI.takeScreenshot(reportLocation + '/TC72/Step 98-Click on button object.png')

"Step 99: Click on button details2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_details2'))

WebUI.takeScreenshot(reportLocation + '/TC72/Step 99-Click on button details2.png')

"Step 100: Click on button confirm -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_confirm'))

WebUI.takeScreenshot(reportLocation + '/TC72/Step 100-Click on button confirm - Navigate to page .png')

"Step 101: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC72-Manage and Verify Test Results in Team Project_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}