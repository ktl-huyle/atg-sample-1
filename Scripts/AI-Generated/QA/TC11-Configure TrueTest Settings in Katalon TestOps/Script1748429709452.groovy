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

"Step 2: Click on button tr"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_team_project_truetest_user_journeys/button_tr'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 2-Click on button tr.png')

"Step 3: Click on div backdrop"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_team_project_truetest_user_journeys/div_backdrop'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 3-Click on div backdrop.png')

"Step 4: Click on span settings"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_team_project_truetest_user_journeys/span_settings'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 4-Click on span settings.png')

"Step 5: Click on link trueTestConfigure -> Navigate to page '/organization/*/settings/truetest'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_team_project_truetest_user_journeys/link_trueTestConfigure'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 5-Click on link trueTestConfigure - Navigate to page organizationsettingstruetest.png')

"Step 6: Click on button goToNextPage"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/truetest?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_organization_settings_truetest/button_goToNextPage'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 6-Click on button goToNextPage.png')

"Step 7: Click on button goToNextPage2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/truetest?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_organization_settings_truetest/button_goToNextPage2'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 7-Click on button goToNextPage2.png')

"Step 8: Click on link truetestSettings -> Navigate to page '/organization/*/settings/truetest/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/truetest?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_organization_settings_truetest/link_truetestSettings'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 8-Click on link truetestSettings - Navigate to page organizationsettingstruetest.png')

"Step 9: Click on button advancedSettings"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/truetest/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_organization_settings_truetest/button_advancedSettings'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 9-Click on button advancedSettings.png')

"Step 10: Click on p css"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/truetest/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_organization_settings_truetest/p_css'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 10-Click on p css.png')

"Step 11: Click on p css"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/truetest/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_organization_settings_truetest/p_css'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 11-Click on p css.png')

"Step 12: Click on p smartLocator"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/truetest/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_organization_settings_truetest/p_smartLocator'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 12-Click on p smartLocator.png')

"Step 13: Click on p smartLocator"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/truetest/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_organization_settings_truetest/p_smartLocator'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 13-Click on p smartLocator.png')

"Step 14: Click on p smartLocator"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/truetest/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_organization_settings_truetest/p_smartLocator'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 14-Click on p smartLocator.png')

"Step 15: Click on p smartLocator"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/truetest/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_organization_settings_truetest/p_smartLocator'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 15-Click on p smartLocator.png')

"Step 16: Click on div testDataDescription"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/truetest/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_organization_settings_truetest/div_testDataDescription'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 16-Click on div testDataDescription.png')

"Step 17: Click on div object -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/settings/truetest/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_organization_settings_truetest/div_object'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 17-Click on div object - Navigate to page .png')

"Step 18: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC11-Configure TrueTest Settings in Katalon TestOps_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}