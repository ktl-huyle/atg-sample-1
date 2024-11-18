import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.custom.TrueTestScripts


'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to team/*/project/*/grid"

TrueTestScripts.navigate("team/${GlobalVariable.team_id}/project/${GlobalVariable.project_id}/grid")

"Step 2: Click on div object4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid/div_object4'))

WebUI.takeScreenshot()

"Step 3: Click on button dynamicObject (object2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid/button_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid/button_dynamicObject', ['button_dynamicObject_trNthChild': button_dynamicObject_trNthChild, 'button_dynamicObject_internalRoleRowName': button_dynamicObject_internalRoleRowName]))

WebUI.takeScreenshot()

"Step 4: Click on link teamProjectGridPlanJob (teamProjectGridPlanJob9) -> Navigate to page 'team/*/project/*/grid/plan/*/job'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/grid?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_grid/link_teamProjectGridPlanJob"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_grid/link_teamProjectGridPlanJob', ['link_teamProjectGridPlanJob_trNthChild': link_teamProjectGridPlanJob_trNthChild, 'link_teamProjectGridPlanJob_internalRoleLinkName': link_teamProjectGridPlanJob_internalRoleLinkName, 'link_teamProjectGridPlanJob_plan_id': link_teamProjectGridPlanJob_plan_id, 'link_teamProjectGridPlanJob_team_id': link_teamProjectGridPlanJob_team_id, 'link_teamProjectGridPlanJob_project_id': link_teamProjectGridPlanJob_project_id]))

WebUI.takeScreenshot()

"Step 5: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC94-Verify Team Project Grid Plan Job from Grid_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}