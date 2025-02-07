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

"Step 1: Navigate to organization/*/home"

TrueTestScripts.navigate("organization/${GlobalVariable.organization_id}/home")

"Step 2: Click on link projectDetails (FirstProject) -> Navigate to page 'team project#team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/link_projectDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/link_projectDetails', ['link_projectDetails_internalRoleLinkName': link_projectDetails_internalRoleLinkName, 'team_id': team_id, 'project_id': project_id]))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 2-Click on link projectDetails FirstProject - Navigate to page team projectteamproject.png')

"Step 3: Click on link Executions2 -> Navigate to page 'team project detail#team/*/project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Executions2'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 3-Click on link Executions2 - Navigate to page team project detailteamproject.png')

"Step 4: Click on button ScheduleTestRun"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_detail/button_ScheduleTestRun'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 4-Click on button ScheduleTestRun.png')

"Step 5: Click on div SelectEnvironment"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_detail/div_SelectEnvironment'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 5-Click on div SelectEnvironment.png')

"Step 6: Click on item MoreOptions"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_detail/item_MoreOptions'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 6-Click on item MoreOptions.png')

"Step 7: Click on span CreatedWith"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_detail/span_CreatedWith'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 7-Click on span CreatedWith.png')

"Step 8: Click on span CreatedWithSketch"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_detail/span_CreatedWithSketch'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 8-Click on span CreatedWithSketch.png')

"Step 9: Click on div CreatedWithSketch"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_detail/div_CreatedWithSketch'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 9-Click on div CreatedWithSketch.png')

"Step 10: Click on div CreatedWithSketch2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_detail/div_CreatedWithSketch2'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 10-Click on div CreatedWithSketch2.png')

"Step 11: Click on div CreatedWithSketch3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_detail/div_CreatedWithSketch3'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 11-Click on div CreatedWithSketch3.png')

"Step 12: Click on div CreatedWithSketch4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_detail/div_CreatedWithSketch4'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 12-Click on div CreatedWithSketch4.png')

"Step 13: Click on div CreatedWithSketch3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_detail/div_CreatedWithSketch3'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 13-Click on div CreatedWithSketch3.png')

"Step 14: Click on div CreatedWithSketch4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_detail/div_CreatedWithSketch4'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 14-Click on div CreatedWithSketch4.png')

"Step 15: Click on div CreatedWithSketch3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_detail/div_CreatedWithSketch3'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 15-Click on div CreatedWithSketch3.png')

"Step 16: Click on div CreatedWithSketch5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_detail/div_CreatedWithSketch5'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 16-Click on div CreatedWithSketch5.png')

"Step 17: Click on div CreatedWithSketch4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_detail/div_CreatedWithSketch4'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 17-Click on div CreatedWithSketch4.png')

"Step 18: Click on div ConfigureTestEnvironment"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_detail/div_ConfigureTestEnvironment'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 18-Click on div ConfigureTestEnvironment.png')

"Step 19: Click on div ConfigureTestEnvironment"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_detail/div_ConfigureTestEnvironment'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 19-Click on div ConfigureTestEnvironment.png')

"Step 20: Click on div ConfigureTestEnvironment"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_detail/div_ConfigureTestEnvironment'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 20-Click on div ConfigureTestEnvironment.png')

"Step 21: Click on div ConfigureTestEnvironment"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_detail/div_ConfigureTestEnvironment'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 21-Click on div ConfigureTestEnvironment.png')

"Step 22: Click on button Cancel"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_detail/button_Cancel'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 22-Click on button Cancel.png')

"Step 23: Click on div ReactSelectControl"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_detail/div_ReactSelectControl'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 23-Click on div ReactSelectControl.png')

"Step 24: Click on item MoreOptions"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_detail/item_MoreOptions'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 24-Click on item MoreOptions.png')

"Step 25: Click on div LocalEnvironment"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_detail/div_LocalEnvironment'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 25-Click on div LocalEnvironment.png')

"Step 26: Click on div ReactSelectValue"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_detail/div_ReactSelectValue'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 26-Click on div ReactSelectValue.png')

"Step 27: Click on div ReactSelectValue2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_detail/div_ReactSelectValue2'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 27-Click on div ReactSelectValue2.png')

"Step 28: Click on div KubernetesEnvironment"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_detail/div_KubernetesEnvironment'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 28-Click on div KubernetesEnvironment.png')

"Step 29: Click on div LocalEnvironment"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_detail/div_LocalEnvironment'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 29-Click on div LocalEnvironment.png')

"Step 30: Click on div ConfigureTestEnvironment"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_detail/div_ConfigureTestEnvironment'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 30-Click on div ConfigureTestEnvironment.png')

"Step 31: Click on button Cancel"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_detail/button_Cancel'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 31-Click on button Cancel.png')

"Step 32: Click on button CloseDialog -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'team/.*/project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_detail/button_CloseDialog'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 32-Click on button CloseDialog - Navigate to page .png')

"Step 33: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC20-Schedule and Configure Test Run Environment_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}