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

"Step 1: Navigate to /secure/Dashboard.jspa"

TrueTestScripts.navigate("/secure/Dashboard.jspa")

"Step 2: Click on link dashboardActions (Create)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/secure/Dashboard.jspa?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_secure_Dashboard_jspa/link_dashboardActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_secure_Dashboard_jspa/link_dashboardActions', ['link_dashboardActions_internalRoleButtonName': link_dashboardActions_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 2-Click on link dashboardActions Create.png')

"Step 3: Click on input IssueType"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/secure/Dashboard.jspa?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_secure_Dashboard_jspa/input_IssueType'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 3-Click on input IssueType.png')

"Step 4: Click on link bugPriority (Bug)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/secure/Dashboard.jspa?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_secure_Dashboard_jspa/link_bugPriority"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_secure_Dashboard_jspa/link_bugPriority', ['link_bugPriority_internalRoleLinkName': link_bugPriority_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 4-Click on link bugPriority Bug.png')

"Step 5: Click on input Summary"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/secure/Dashboard.jspa?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_secure_Dashboard_jspa/input_Summary'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 5-Click on input Summary.png')

"Step 6: Enter input value in input Summary"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/secure/Dashboard.jspa?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_secure_Dashboard_jspa/input_Summary'), input_Summary)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 6-Enter input value in input Summary.png')

"Step 7: Click on textarea Description"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/secure/Dashboard.jspa?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_secure_Dashboard_jspa/textarea_Description'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 7-Click on textarea Description.png')

"Step 8: Enter input value in textarea Description"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/secure/Dashboard.jspa?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_secure_Dashboard_jspa/textarea_Description'), textarea_Description)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 8-Enter input value in textarea Description.png')

"Step 9: Click on input Priority"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/secure/Dashboard.jspa?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_secure_Dashboard_jspa/input_Priority'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 9-Click on input Priority.png')

"Step 10: Click on link bugPriority (Lowest)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/secure/Dashboard.jspa?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_secure_Dashboard_jspa/link_bugPriority"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_secure_Dashboard_jspa/link_bugPriority', ['link_bugPriority_internalRoleLinkName': link_bugPriority_internalRoleLinkName_1]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 10-Click on link bugPriority Lowest.png')

"Step 11: Click on textarea Labels"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/secure/Dashboard.jspa?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_secure_Dashboard_jspa/textarea_Labels'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 11-Click on textarea Labels.png')

"Step 12: Click on span Labels"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/secure/Dashboard.jspa?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_secure_Dashboard_jspa/span_Labels'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 12-Click on span Labels.png')

"Step 13: Click on link Test"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/secure/Dashboard.jspa?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_secure_Dashboard_jspa/link_Test'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 13-Click on link Test.png')

"Step 14: Click on button AssignToMe"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/secure/Dashboard.jspa?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_secure_Dashboard_jspa/button_AssignToMe'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 14-Click on button AssignToMe.png')

"Step 15: Click on input CreateIssueSubmit"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/secure/Dashboard.jspa?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_secure_Dashboard_jspa/input_CreateIssueSubmit'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 15-Click on input CreateIssueSubmit.png')

"Step 16: Click on link dashboardActions (Projects)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/secure/Dashboard.jspa?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_secure_Dashboard_jspa/link_dashboardActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_secure_Dashboard_jspa/link_dashboardActions', ['link_dashboardActions_internalRoleButtonName': link_dashboardActions_internalRoleButtonName_1]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 16-Click on link dashboardActions Projects.png')

"Step 17: Click on link ProjectName -> Navigate to page '/projects/*/issues/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/secure/Dashboard.jspa?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_secure_Dashboard_jspa/link_ProjectName'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 17-Click on link ProjectName - Navigate to page projectsissues.png')

"Step 18: Click on span AssignToMe"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/projects/.*/issues/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_projects_issues/span_AssignToMe'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 18-Click on span AssignToMe.png')

"Step 19: Click on link AssignToMe -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/projects/.*/issues/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_projects_issues/link_AssignToMe'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 19-Click on link AssignToMe - Navigate to page .png')

"Step 20: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC1-Manage Bug Issues in SauceDemo Dashboard_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}