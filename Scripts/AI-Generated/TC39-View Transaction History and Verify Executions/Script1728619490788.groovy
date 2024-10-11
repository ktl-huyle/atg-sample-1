import internal.GlobalVariable
import truetest.custom.TrueTestScripts
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
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

"Step 4: Click on link Executions3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Executions3_1'))

WebUI.takeScreenshot(reportLocation + '/TC39/Step 4-Click on link Executions3.png')

"Step 5: Click on div transactionHistory (SGDPSp2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_transactionHistory"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_transactionHistory', ['div_transactionHistory_class': div_transactionHistory_class, 'div_transactionHistory_internalRoleCellName': div_transactionHistory_internalRoleCellName]))

WebUI.takeScreenshot(reportLocation + '/TC39/Step 5-Click on div transactionHistory SGDPSp2.png')

"Step 6: Click on button CloseButton"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_CloseButton'))

WebUI.takeScreenshot(reportLocation + '/TC39/Step 6-Click on button CloseButton.png')

"Step 7: Click on header testRun (SGDPSp2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/header_testRun"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/header_testRun', ['header_testRun_internalRoleHeadingName': header_testRun_internalRoleHeadingName]))

WebUI.takeScreenshot(reportLocation + '/TC39/Step 7-Click on header testRun SGDPSp2.png')

"Step 8: Click on button Sessions"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_testResults'))

WebUI.takeScreenshot(reportLocation + '/TC39/Step 8-Click on button Sessions.png')

"Step 9: Click on header testRun (TestCaseHeading)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/header_testRun"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/header_testRun', ['header_testRun_internalRoleHeadingName': header_testRun_internalRoleHeadingName_1]))

WebUI.takeScreenshot(reportLocation + '/TC39/Step 9-Click on header testRun TestCaseHeading.png')

"Step 10: Click on div transactionHistory (QRPay)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_transactionHistory"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_transactionHistory', ['div_transactionHistory_class': div_transactionHistory_class_1, 'div_transactionHistory_internalRoleCellName': div_transactionHistory_internalRoleCellName_1]))

WebUI.takeScreenshot(reportLocation + '/TC39/Step 10-Click on div transactionHistory QRPay.png')

"Step 11: Click on div transactionHistory (CheckTransactionHistory)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_transactionHistory"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_transactionHistory', ['div_transactionHistory_class': div_transactionHistory_class_2, 'div_transactionHistory_internalRoleCellName': div_transactionHistory_internalRoleCellName_2]))

WebUI.takeScreenshot(reportLocation + '/TC39/Step 11-Click on div transactionHistory CheckTransactionHistory.png')

"Step 12: Click on div transactionHistory (CheckTransactionHistory2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/div_transactionHistory"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/div_transactionHistory', ['div_transactionHistory_class': div_transactionHistory_class_3, 'div_transactionHistory_internalRoleCellName': div_transactionHistory_internalRoleCellName_3]))

WebUI.takeScreenshot(reportLocation + '/TC39/Step 12-Click on div transactionHistory CheckTransactionHistory2.png')

"Step 13: Click on button Close"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Close_1'))

WebUI.takeScreenshot(reportLocation + '/TC39/Step 13-Click on button Close.png')

"Step 14: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC39-View Transaction History and Verify Executions_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}