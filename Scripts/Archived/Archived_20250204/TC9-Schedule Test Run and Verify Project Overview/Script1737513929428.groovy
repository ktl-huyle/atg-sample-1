import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.custom.TrueTestScripts

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to team/*/project/*/*/*"

TrueTestScripts.navigate("team/${GlobalVariable.team_id}/project/${GlobalVariable.project_id}/${GlobalVariable.path_param_5}/${GlobalVariable.path_param_6}")

"Step 2: Click on div testSuites (EHS TestAutomation)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "Archived/Archived_20250204/Dynamic Objects/Page_team_project_details/div_testSuites"
WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Dynamic Objects/Page_team_project_details/div_testSuites', ['div_testSuites_internalText': div_testSuites_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 2-Click on div testSuites EHS TestAutomation.png')

"Step 3: Click on div testSuites (TestSuites2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "Archived/Archived_20250204/Dynamic Objects/Page_team_project_details/div_testSuites"
WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Dynamic Objects/Page_team_project_details/div_testSuites', ['div_testSuites_internalText': div_testSuites_internalText_1]))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 3-Click on div testSuites TestSuites2.png')

"Step 4: Click on div testSuites (KatalonCloud2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "Archived/Archived_20250204/Dynamic Objects/Page_team_project_details/div_testSuites"
WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Dynamic Objects/Page_team_project_details/div_testSuites', ['div_testSuites_internalText': div_testSuites_internalText_2]))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 4-Click on div testSuites KatalonCloud2.png')

"Step 5: Click on div testSuites (UploadedData2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "Archived/Archived_20250204/Dynamic Objects/Page_team_project_details/div_testSuites"
WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Dynamic Objects/Page_team_project_details/div_testSuites', ['div_testSuites_internalText': div_testSuites_internalText_3]))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 5-Click on div testSuites UploadedData2.png')

"Step 6: Click on div testSuites (TestSuites3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "Archived/Archived_20250204/Dynamic Objects/Page_team_project_details/div_testSuites"
WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Dynamic Objects/Page_team_project_details/div_testSuites', ['div_testSuites_internalText': div_testSuites_internalText_4]))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 6-Click on div testSuites TestSuites3.png')

"Step 7: Click on link Executions -> Navigate to page 'team project detail#team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Page_team_project_details/link_Executions'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 7-Click on link Executions - Navigate to page team project detailteamproject.png')

"Step 8: Click on button ScheduleTestRun"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Page_team_project_detail/button_ScheduleTestRun'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 8-Click on button ScheduleTestRun.png')

"Step 9: Click on div TestSuites"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Page_team_project_detail/div_TestSuites'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 9-Click on div TestSuites.png')

"Step 10: Click on div TestSuites2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Page_team_project_detail/div_TestSuites2'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 10-Click on div TestSuites2.png')

"Step 11: Click on div Name"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Page_team_project_detail/div_Name'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 11-Click on div Name.png')

"Step 12: Enter input value in input Name"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('Archived/Archived_20250204/Page_team_project_detail/input_Name'), input_Name)

WebUI.takeScreenshot(reportLocation + '/TC9/Step 12-Enter input value in input Name.png')

"Step 13: Click on div ScheduleTestRun2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Page_team_project_detail/div_ScheduleTestRun2'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 13-Click on div ScheduleTestRun2.png')

"Step 14: Click on div SelectEnvironment2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Page_team_project_detail/div_SelectEnvironment2'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 14-Click on div SelectEnvironment2.png')

"Step 15: Click on div Unknown"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Page_team_project_detail/div_Unknown'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 15-Click on div Unknown.png')

"Step 16: Click on div Run"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Page_team_project_detail/div_Run'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 16-Click on div Run.png')

"Step 17: Click on div dynamicContent (Unknown2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Dynamic Objects/Page_team_project_detail/div_dynamicContent'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 17-Click on div dynamicContent Unknown2.png')

"Step 18: Click on button Run"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Page_team_project_detail/button_Run'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 18-Click on button Run.png')

"Step 19: Click on div Unknown3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Page_team_project_detail/div_Unknown3'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 19-Click on div Unknown3.png')

"Step 20: Click on item MoreOptions"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Page_team_project_detail/item_MoreOptions'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 20-Click on item MoreOptions.png')

"Step 21: Click on button MobileBrowsers"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Page_team_project_detail/button_MobileBrowsers'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 21-Click on button MobileBrowsers.png')

"Step 22: Click on span Android"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Page_team_project_detail/span_Android'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 22-Click on span Android.png')

"Step 23: Click on div Phone"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Page_team_project_detail/div_Phone'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 23-Click on div Phone.png')

"Step 24: Click on div AnyDeviceType"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Page_team_project_detail/div_AnyDeviceType'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 24-Click on div AnyDeviceType.png')

"Step 25: Click on div Phone"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Page_team_project_detail/div_Phone'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 25-Click on div Phone.png')

"Step 26: Click on div GooglePixel6Pro"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Page_team_project_detail/div_GooglePixel6Pro'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 26-Click on div GooglePixel6Pro.png')

"Step 27: Click on div ConfigureTestEnvironment"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Page_team_project_detail/div_ConfigureTestEnvironment'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 27-Click on div ConfigureTestEnvironment.png')

"Step 28: Click on div CancelSave"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Page_team_project_detail/div_CancelSave'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 28-Click on div CancelSave.png')

"Step 29: Click on button Save"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Page_team_project_detail/button_Save'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 29-Click on button Save.png')

"Step 30: Click on button Run"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Page_team_project_detail/button_Run'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 30-Click on button Run.png')

"Step 31: Click on button CloseDialog2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Page_team_project_detail/button_CloseDialog2'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 31-Click on button CloseDialog2.png')

"Step 32: Click on button closeAction (CloseButton3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "Archived/Archived_20250204/Dynamic Objects/Page_team_project_detail/button_closeAction"
WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Dynamic Objects/Page_team_project_detail/button_closeAction', ['button_closeAction_class': button_closeAction_class]))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 32-Click on button closeAction CloseButton3.png')

"Step 33: Click on button closeAction (alertDismiss)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "Archived/Archived_20250204/Dynamic Objects/Page_team_project_detail/button_closeAction"
WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Dynamic Objects/Page_team_project_detail/button_closeAction', ['button_closeAction_class': button_closeAction_class_1]))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 33-Click on button closeAction alertDismiss.png')

"Step 34: Click on div subscribedSessions"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Page_team_project_detail/div_subscribedSessions'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 34-Click on div subscribedSessions.png')

"Step 35: Click on link showDetails"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Page_team_project_detail/link_showDetails'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 35-Click on link showDetails.png')

"Step 36: Click on p sessionCount"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Page_team_project_detail/p_sessionCount'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 36-Click on p sessionCount.png')

"Step 37: Click on div dynamicContent (popoverBackdrop)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Dynamic Objects/Page_team_project_detail/div_dynamicContent'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 37-Click on div dynamicContent popoverBackdrop.png')

"Step 38: Click on link reports -> Navigate to page 'team project overview#team/*/project/*/overview'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20250204/Page_team_project_detail/link_reports'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 38-Click on link reports - Navigate to page team project overviewteamprojectoverview.png')

"Step 39: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC9-Schedule Test Run and Verify Project Overview_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}