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

WebUI.takeScreenshot(reportLocation + '/TC12/Step 2-Click on link csCellphoneShop - Navigate to page teamproject.png')

"Step 3: Click on link truetest -> Navigate to page '/team/*/project/*/truetest/user-journeys'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_team_project/link_truetest'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 3-Click on link truetest - Navigate to page teamprojecttruetestuser-journeys.png')

"Step 4: Click on button pageNavigation (goToPage2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/QA/Dynamic Objects/Page_team_project_truetest_user_journeys/button_pageNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/QA/Dynamic Objects/Page_team_project_truetest_user_journeys/button_pageNavigation', ['button_pageNavigation_buttonAriaLabel': button_pageNavigation_buttonAriaLabel, 'button_pageNavigation_liNthOfType': button_pageNavigation_liNthOfType]))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 4-Click on button pageNavigation goToPage2.png')

"Step 5: Click on button pageNavigation (goToPage3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/QA/Dynamic Objects/Page_team_project_truetest_user_journeys/button_pageNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/QA/Dynamic Objects/Page_team_project_truetest_user_journeys/button_pageNavigation', ['button_pageNavigation_buttonAriaLabel': button_pageNavigation_buttonAriaLabel_1, 'button_pageNavigation_liNthOfType': button_pageNavigation_liNthOfType_1]))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 5-Click on button pageNavigation goToPage3.png')

"Step 6: Click on button pageNavigation (goToPage4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/QA/Dynamic Objects/Page_team_project_truetest_user_journeys/button_pageNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/QA/Dynamic Objects/Page_team_project_truetest_user_journeys/button_pageNavigation', ['button_pageNavigation_buttonAriaLabel': button_pageNavigation_buttonAriaLabel_2, 'button_pageNavigation_liNthOfType': button_pageNavigation_liNthOfType_2]))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 6-Click on button pageNavigation goToPage4.png')

"Step 7: Click on button pageNavigation (goToPage5)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/QA/Dynamic Objects/Page_team_project_truetest_user_journeys/button_pageNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/QA/Dynamic Objects/Page_team_project_truetest_user_journeys/button_pageNavigation', ['button_pageNavigation_buttonAriaLabel': button_pageNavigation_buttonAriaLabel_3, 'button_pageNavigation_liNthOfType': button_pageNavigation_liNthOfType_3]))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 7-Click on button pageNavigation goToPage5.png')

"Step 8: Click on button pageNavigation (goToPage6)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/QA/Dynamic Objects/Page_team_project_truetest_user_journeys/button_pageNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/QA/Dynamic Objects/Page_team_project_truetest_user_journeys/button_pageNavigation', ['button_pageNavigation_buttonAriaLabel': button_pageNavigation_buttonAriaLabel_4, 'button_pageNavigation_liNthOfType': button_pageNavigation_liNthOfType_4]))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 8-Click on button pageNavigation goToPage6.png')

"Step 9: Click on button pageNavigation (goToPage7)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/QA/Dynamic Objects/Page_team_project_truetest_user_journeys/button_pageNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/QA/Dynamic Objects/Page_team_project_truetest_user_journeys/button_pageNavigation', ['button_pageNavigation_buttonAriaLabel': button_pageNavigation_buttonAriaLabel_5, 'button_pageNavigation_liNthOfType': button_pageNavigation_liNthOfType_5]))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 9-Click on button pageNavigation goToPage7.png')

"Step 10: Click on button pageNavigation (goToPage)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/QA/Dynamic Objects/Page_team_project_truetest_user_journeys/button_pageNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/QA/Dynamic Objects/Page_team_project_truetest_user_journeys/button_pageNavigation', ['button_pageNavigation_buttonAriaLabel': button_pageNavigation_buttonAriaLabel_6, 'button_pageNavigation_liNthOfType': button_pageNavigation_liNthOfType_6]))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 10-Click on button pageNavigation goToPage.png')

"Step 11: Click on button pageNavigation (goToPage2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/QA/Dynamic Objects/Page_team_project_truetest_user_journeys/button_pageNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/QA/Dynamic Objects/Page_team_project_truetest_user_journeys/button_pageNavigation', ['button_pageNavigation_buttonAriaLabel': button_pageNavigation_buttonAriaLabel_7, 'button_pageNavigation_liNthOfType': button_pageNavigation_liNthOfType_7]))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 11-Click on button pageNavigation goToPage2.png')

"Step 12: Click on button pageNavigation (goToPage56)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/QA/Dynamic Objects/Page_team_project_truetest_user_journeys/button_pageNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/QA/Dynamic Objects/Page_team_project_truetest_user_journeys/button_pageNavigation', ['button_pageNavigation_buttonAriaLabel': button_pageNavigation_buttonAriaLabel_8, 'button_pageNavigation_liNthOfType': button_pageNavigation_liNthOfType_8]))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 12-Click on button pageNavigation goToPage56.png')

"Step 13: Click on button goToPreviousPage"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/QA/Page_team_project_truetest_user_journeys/button_goToPreviousPage'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 13-Click on button goToPreviousPage.png')

"Step 14: Click on button pageNavigation (goToPage1)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/QA/Dynamic Objects/Page_team_project_truetest_user_journeys/button_pageNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/QA/Dynamic Objects/Page_team_project_truetest_user_journeys/button_pageNavigation', ['button_pageNavigation_buttonAriaLabel': button_pageNavigation_buttonAriaLabel_9, 'button_pageNavigation_liNthOfType': button_pageNavigation_liNthOfType_9]))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 14-Click on button pageNavigation goToPage1.png')

"Step 15: Click on button pageNavigation (goToPage2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/QA/Dynamic Objects/Page_team_project_truetest_user_journeys/button_pageNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/QA/Dynamic Objects/Page_team_project_truetest_user_journeys/button_pageNavigation', ['button_pageNavigation_buttonAriaLabel': button_pageNavigation_buttonAriaLabel_10, 'button_pageNavigation_liNthOfType': button_pageNavigation_liNthOfType_10]))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 15-Click on button pageNavigation goToPage2.png')

"Step 16: Click on button pageNavigation (goToPage3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/QA/Dynamic Objects/Page_team_project_truetest_user_journeys/button_pageNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/QA/Dynamic Objects/Page_team_project_truetest_user_journeys/button_pageNavigation', ['button_pageNavigation_buttonAriaLabel': button_pageNavigation_buttonAriaLabel_11, 'button_pageNavigation_liNthOfType': button_pageNavigation_liNthOfType_11]))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 16-Click on button pageNavigation goToPage3.png')

"Step 17: Click on button pageNavigation (goToPage4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/QA/Dynamic Objects/Page_team_project_truetest_user_journeys/button_pageNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/QA/Dynamic Objects/Page_team_project_truetest_user_journeys/button_pageNavigation', ['button_pageNavigation_buttonAriaLabel': button_pageNavigation_buttonAriaLabel_12, 'button_pageNavigation_liNthOfType': button_pageNavigation_liNthOfType_12]))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 17-Click on button pageNavigation goToPage4.png')

"Step 18: Click on button pageNavigation (goToPage5)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/QA/Dynamic Objects/Page_team_project_truetest_user_journeys/button_pageNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/QA/Dynamic Objects/Page_team_project_truetest_user_journeys/button_pageNavigation', ['button_pageNavigation_buttonAriaLabel': button_pageNavigation_buttonAriaLabel_13, 'button_pageNavigation_liNthOfType': button_pageNavigation_liNthOfType_13]))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 18-Click on button pageNavigation goToPage5.png')

"Step 19: Click on button pageNavigation (goToPage6) -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/QA/Dynamic Objects/Page_team_project_truetest_user_journeys/button_pageNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/QA/Dynamic Objects/Page_team_project_truetest_user_journeys/button_pageNavigation', ['button_pageNavigation_buttonAriaLabel': button_pageNavigation_buttonAriaLabel_14, 'button_pageNavigation_liNthOfType': button_pageNavigation_liNthOfType_14]))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 19-Click on button pageNavigation goToPage6 - Navigate to page .png')

"Step 20: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC12-Navigate Through TrueTest User Journeys in Katalon TestOps_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}