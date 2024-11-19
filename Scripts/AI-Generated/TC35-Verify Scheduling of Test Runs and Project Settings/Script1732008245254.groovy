import internal.GlobalVariable
import truetest.custom.TrueTestScripts
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import truetest.common.scheduleTestRunForProject

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

"Step 3: Navigate to organization/*/home"

TrueTestScripts.navigate("organization/*/home")

"Step 4: Access project settings and schedule a test run."

scheduleTestRunForProject.execute(data_path_0, Integer.valueOf(index_0))

"Step 5: Click on input Name3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_Name3'))

WebUI.takeScreenshot(reportLocation + '/TC35/Step 5-Click on input Name3.png')

"Step 6: Click on div Name2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_Name2'))

WebUI.takeScreenshot(reportLocation + '/TC35/Step 6-Click on div Name2.png')

"Step 7: Enter input value in input Name3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_team_project/input_Name3'), input_Name3)

WebUI.takeScreenshot(reportLocation + '/TC35/Step 7-Enter input value in input Name3.png')

"Step 8: Click on div CustomSelectValue"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_CustomSelectValue'))

WebUI.takeScreenshot(reportLocation + '/TC35/Step 8-Click on div CustomSelectValue.png')

"Step 9: Click on div OracleJDE"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_OracleJDE'))

WebUI.takeScreenshot(reportLocation + '/TC35/Step 9-Click on div OracleJDE.png')

"Step 10: Click on div TestSuiteControl2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_TestSuiteControl2'))

WebUI.takeScreenshot(reportLocation + '/TC35/Step 10-Click on div TestSuiteControl2.png')

"Step 11: Click on div TestSuites"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_TestSuites'))

WebUI.takeScreenshot(reportLocation + '/TC35/Step 11-Click on div TestSuites.png')

"Step 12: Click on div SelectEnvironment3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_SelectEnvironment3'))

WebUI.takeScreenshot(reportLocation + '/TC35/Step 12-Click on div SelectEnvironment3.png')

"Step 13: Click on div WindowsChrome"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_WindowsChrome'))

WebUI.takeScreenshot(reportLocation + '/TC35/Step 13-Click on div WindowsChrome.png')

"Step 14: Click on div ExecutionProfile"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_ExecutionProfile'))

WebUI.takeScreenshot(reportLocation + '/TC35/Step 14-Click on div ExecutionProfile.png')

"Step 15: Click on div ExecutionProfileIcon"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_ExecutionProfileIcon'))

WebUI.takeScreenshot(reportLocation + '/TC35/Step 15-Click on div ExecutionProfileIcon.png')

"Step 16: Click on div ExecutionProfileDetail"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_ExecutionProfileDetail'))

WebUI.takeScreenshot(reportLocation + '/TC35/Step 16-Click on div ExecutionProfileDetail.png')

"Step 17: Click on item MoreOptions"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/item_MoreOptions'))

WebUI.takeScreenshot(reportLocation + '/TC35/Step 17-Click on item MoreOptions.png')

"Step 18: Click on label DesktopBrowsers"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/label_DesktopBrowsers'))

WebUI.takeScreenshot(reportLocation + '/TC35/Step 18-Click on label DesktopBrowsers.png')

"Step 19: Click on div ActiveTunnels"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_ActiveTunnels'))

WebUI.takeScreenshot(reportLocation + '/TC35/Step 19-Click on div ActiveTunnels.png')

"Step 20: Click on div UserEmail2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_UserEmail2'))

WebUI.takeScreenshot(reportLocation + '/TC35/Step 20-Click on div UserEmail2.png')

"Step 21: Click on button WebServices"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_WebServices'))

WebUI.takeScreenshot(reportLocation + '/TC35/Step 21-Click on button WebServices.png')

"Step 22: Click on button DesktopBrowsers"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_DesktopBrowsers'))

WebUI.takeScreenshot(reportLocation + '/TC35/Step 22-Click on button DesktopBrowsers.png')

"Step 23: Click on button Save2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Save2'))

WebUI.takeScreenshot(reportLocation + '/TC35/Step 23-Click on button Save2.png')

"Step 24: Click on div ExecutionProfileIcon"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_ExecutionProfileIcon'))

WebUI.takeScreenshot(reportLocation + '/TC35/Step 24-Click on div ExecutionProfileIcon.png')

"Step 25: Click on div ReactSelectIcon"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_ReactSelectIcon'))

WebUI.takeScreenshot(reportLocation + '/TC35/Step 25-Click on div ReactSelectIcon.png')

"Step 26: Click on div CustomSelectValueDetail"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_CustomSelectValueDetail'))

WebUI.takeScreenshot(reportLocation + '/TC35/Step 26-Click on div CustomSelectValueDetail.png')

"Step 27: Click on div ReactSelectIcon"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_ReactSelectIcon'))

WebUI.takeScreenshot(reportLocation + '/TC35/Step 27-Click on div ReactSelectIcon.png')

"Step 28: Click on button TestSuiteCollection"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_TestSuiteCollection'))

WebUI.takeScreenshot(reportLocation + '/TC35/Step 28-Click on button TestSuiteCollection.png')

"Step 29: Click on div TestSuiteCollection"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_TestSuiteCollection'))

WebUI.takeScreenshot(reportLocation + '/TC35/Step 29-Click on div TestSuiteCollection.png')

"Step 30: Click on div TestSuiteCollection"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_TestSuiteCollection'))

WebUI.takeScreenshot(reportLocation + '/TC35/Step 30-Click on div TestSuiteCollection.png')

"Step 31: Click on link Refresh"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Refresh'))

WebUI.takeScreenshot(reportLocation + '/TC35/Step 31-Click on link Refresh.png')

"Step 32: Click on div TestSuiteCollection"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_TestSuiteCollection'))

WebUI.takeScreenshot(reportLocation + '/TC35/Step 32-Click on div TestSuiteCollection.png')

"Step 33: Click on div TestSuiteCollection"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_TestSuiteCollection'))

WebUI.takeScreenshot(reportLocation + '/TC35/Step 33-Click on div TestSuiteCollection.png')

"Step 34: Click on button TestSuite"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_TestSuite'))

WebUI.takeScreenshot(reportLocation + '/TC35/Step 34-Click on button TestSuite.png')

"Step 35: Click on button Run2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Run2'))

WebUI.takeScreenshot(reportLocation + '/TC35/Step 35-Click on button Run2.png')

"Step 36: Click on button closeActions (Unknown)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_closeActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_closeActions', ['button_closeActions_class': button_closeActions_class]))

WebUI.takeScreenshot(reportLocation + '/TC35/Step 36-Click on button closeActions Unknown.png')

"Step 37: Click on button Run2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Run2'))

WebUI.takeScreenshot(reportLocation + '/TC35/Step 37-Click on button Run2.png')

"Step 38: Click on header MainHeader"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/header_MainHeader'))

WebUI.takeScreenshot(reportLocation + '/TC35/Step 38-Click on header MainHeader.png')

"Step 39: Click on div ExecutionProfileDetail2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_ExecutionProfileDetail2'))

WebUI.takeScreenshot(reportLocation + '/TC35/Step 39-Click on div ExecutionProfileDetail2.png')

"Step 40: Click on div EnvironmentOption"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_EnvironmentOption'))

WebUI.takeScreenshot(reportLocation + '/TC35/Step 40-Click on div EnvironmentOption.png')

"Step 41: Click on button AdvancedSettings2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_AdvancedSettings2'))

WebUI.takeScreenshot(reportLocation + '/TC35/Step 41-Click on button AdvancedSettings2.png')

"Step 42: Click on div Latest2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_Latest2'))

WebUI.takeScreenshot(reportLocation + '/TC35/Step 42-Click on div Latest2.png')

"Step 43: Click on div VersionNumber2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_VersionNumber2'))

WebUI.takeScreenshot(reportLocation + '/TC35/Step 43-Click on div VersionNumber2.png')

"Step 44: Click on button GoBack2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_GoBack2'))

WebUI.takeScreenshot(reportLocation + '/TC35/Step 44-Click on button GoBack2.png')

"Step 45: Click on button Run3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Run3'))

WebUI.takeScreenshot(reportLocation + '/TC35/Step 45-Click on button Run3.png')

"Step 46: Click on button closeActions (NoLicense)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_closeActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_closeActions', ['button_closeActions_class': button_closeActions_class_1]))

WebUI.takeScreenshot(reportLocation + '/TC35/Step 46-Click on button closeActions NoLicense.png')

"Step 47: Click on button CloseDialog2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_CloseDialog2'))

WebUI.takeScreenshot(reportLocation + '/TC35/Step 47-Click on button CloseDialog2.png')

"Step 48: Click on link Settings5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Settings5'))

WebUI.takeScreenshot(reportLocation + '/TC35/Step 48-Click on link Settings5.png')

"Step 49: Click on link testResources (TestCloudTunnels3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_testResources"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_testResources', ['link_testResources_nthChild': link_testResources_nthChild, 'link_testResources_internalRoleLinkName': link_testResources_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC35/Step 49-Click on link testResources TestCloudTunnels3.png')

"Step 50: Click on button projectActions (Setup2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_projectActions_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_projectActions_1', ['button_projectActions_internalRoleTabName': button_projectActions_internalRoleTabName]))

WebUI.takeScreenshot(reportLocation + '/TC35/Step 50-Click on button projectActions Setup2.png')

"Step 51: Click on div ApiKeyControl"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_ApiKeyControl'))

WebUI.takeScreenshot(reportLocation + '/TC35/Step 51-Click on div ApiKeyControl.png')

"Step 52: Click on div DefaultOption"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_DefaultOption'))

WebUI.takeScreenshot(reportLocation + '/TC35/Step 52-Click on div DefaultOption.png')

"Step 53: Click on link Here"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Here'))

WebUI.takeScreenshot(reportLocation + '/TC35/Step 53-Click on link Here.png')

"Step 54: Click on button projectActions (Setup) -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_projectActions_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_projectActions_1', ['button_projectActions_internalRoleTabName': button_projectActions_internalRoleTabName_1]))

WebUI.takeScreenshot(reportLocation + '/TC35/Step 54-Click on button projectActions Setup - Navigate to page .png')

"Step 55: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC35-Verify Scheduling of Test Runs and Project Settings_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}