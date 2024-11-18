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

"Step 1: Navigate to team/*/project/*/executions"

TrueTestScripts.navigate("team/${GlobalVariable.team_id}/project/${GlobalVariable.project_id}/executions")

"Step 2: Click on link dashboard -> Navigate to page 'team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_dashboard_1'))

WebUI.takeScreenshot()

"Step 3: Click on button dynamicObject (object)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_dynamicObject', ['button_dynamicObject_nthChild': button_dynamicObject_nthChild, 'button_dynamicObject_internalLabel': button_dynamicObject_internalLabel]))

WebUI.takeScreenshot()

"Step 4: Click on button dynamicObject (object2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_dynamicObject_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_dynamicObject_1', ['button_dynamicObject_nthChild': button_dynamicObject_nthChild_1, 'button_dynamicObject_internalLabel': button_dynamicObject_internalLabel_1]))

WebUI.takeScreenshot()

"Step 5: Click on link reports7 -> Navigate to page 'team/*/project/*/overview'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_reports7'))

WebUI.takeScreenshot()

"Step 6: Click on link testRuns15 -> Navigate to page 'team/*/project/*/executions'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/overview?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_overview/link_testRuns15'))

WebUI.takeScreenshot()

"Step 7: Click on link teamProjectExecutions13 -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_teamProjectExecutions13'))

WebUI.takeScreenshot()

"Step 8: Click on link dashboard -> Navigate to page 'team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_dashboard_1'))

WebUI.takeScreenshot()

"Step 9: Click on link tests6 -> Navigate to page 'team/*/project/*/test-design/test-cases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_tests6'))

WebUI.takeScreenshot()

"Step 10: Click on link reports2 -> Navigate to page 'team/*/project/*/overview'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/link_reports2'))

WebUI.takeScreenshot()

"Step 11: Click on link testRuns15 -> Navigate to page 'team/*/project/*/executions'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/overview?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_overview/link_testRuns15'))

WebUI.takeScreenshot()

"Step 12: Click on label dynamicObject (object10)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/label_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/label_dynamicObject', ['label_dynamicObject_for': label_dynamicObject_for, 'label_dynamicObject_internalRoleRowName': label_dynamicObject_internalRoleRowName]))

WebUI.takeScreenshot()

"Step 13: Click on link teamProjectExecutions14"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_teamProjectExecutions14'))

WebUI.takeScreenshot()

"Step 14: Click on label dynamicObject (object10)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/label_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/label_dynamicObject', ['label_dynamicObject_for': label_dynamicObject_for_1, 'label_dynamicObject_internalRoleRowName': label_dynamicObject_internalRoleRowName_1]))

WebUI.takeScreenshot()

"Step 15: Click on label dynamicObject (object11)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/label_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/label_dynamicObject', ['label_dynamicObject_for': label_dynamicObject_for_2, 'label_dynamicObject_internalRoleRowName': label_dynamicObject_internalRoleRowName_2]))

WebUI.takeScreenshot()

"Step 16: Click on button dynamicObject (object9)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/button_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/button_dynamicObject', ['button_dynamicObject_trNthChild': button_dynamicObject_trNthChild, 'button_dynamicObject_internalRoleRowName': button_dynamicObject_internalRoleRowName]))

WebUI.takeScreenshot()

"Step 17: Click on button compareActions (delete2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/button_Delete"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/button_Delete', ['button_compareActions_internalRoleButtonName': button_compareActions_internalRoleButtonName]))

WebUI.takeScreenshot()

"Step 18: Click on button cancel"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_cancel'))

WebUI.takeScreenshot()

"Step 19: Click on label dynamicObject (object12)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/label_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/label_dynamicObject', ['label_dynamicObject_for': label_dynamicObject_for_3, 'label_dynamicObject_internalRoleRowName': label_dynamicObject_internalRoleRowName_3]))

WebUI.takeScreenshot()

"Step 20: Click on label dynamicObject (object13)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/label_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/label_dynamicObject', ['label_dynamicObject_for': label_dynamicObject_for_4, 'label_dynamicObject_internalRoleRowName': label_dynamicObject_internalRoleRowName_4]))

WebUI.takeScreenshot()

"Step 21: Click on button compareActions (compare)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/button_Delete"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/button_Delete', ['button_compareActions_internalRoleButtonName': button_compareActions_internalRoleButtonName_1]))

WebUI.takeScreenshot()

"Step 22: Click on label dynamicObject (object14)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/label_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/label_dynamicObject', ['label_dynamicObject_for': label_dynamicObject_for_5, 'label_dynamicObject_internalRoleRowName': label_dynamicObject_internalRoleRowName_5]))

WebUI.takeScreenshot()

"Step 23: Click on button compareActions (compare2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/button_Delete"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/button_Delete', ['button_compareActions_internalRoleButtonName': button_compareActions_internalRoleButtonName_2]))

WebUI.takeScreenshot()

"Step 24: Click on label dynamicObject (object10)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/label_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/label_dynamicObject', ['label_dynamicObject_for': label_dynamicObject_for_6, 'label_dynamicObject_internalRoleRowName': label_dynamicObject_internalRoleRowName_6]))

WebUI.takeScreenshot()

"Step 25: Click on label dynamicObject (object11)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/label_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/label_dynamicObject', ['label_dynamicObject_for': label_dynamicObject_for_7, 'label_dynamicObject_internalRoleRowName': label_dynamicObject_internalRoleRowName_7]))

WebUI.takeScreenshot()

"Step 26: Click on button compareActions (delete2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/button_Delete"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/button_Delete', ['button_compareActions_internalRoleButtonName': button_compareActions_internalRoleButtonName_3]))

WebUI.takeScreenshot()

"Step 27: Click on button delete3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_Delete2'))

WebUI.takeScreenshot()

"Step 28: Click on label dynamicObject (object10)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/label_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/label_dynamicObject', ['label_dynamicObject_for': label_dynamicObject_for_8, 'label_dynamicObject_internalRoleRowName': label_dynamicObject_internalRoleRowName_8]))

WebUI.takeScreenshot()

"Step 29: Click on button compareActions (delete2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/button_Delete"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/button_Delete', ['button_compareActions_internalRoleButtonName': button_compareActions_internalRoleButtonName_4]))

WebUI.takeScreenshot()

"Step 30: Click on button delete3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_Delete2'))

WebUI.takeScreenshot()

"Step 31: Click on button object5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_object5'))

WebUI.takeScreenshot()

"Step 32: Click on button dynamicObject (aishah)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/button_dynamicObject_4"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/button_dynamicObject_4', ['button_dynamicObject_internalRoleButtonName': button_dynamicObject_internalRoleButtonName]))

WebUI.takeScreenshot()

"Step 33: Click on link logout -> Navigate to page 'organization/*/home'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_logout'))

WebUI.takeScreenshot()

"Step 34: Click on span dynamicObject (object4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/span_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/span_dynamicObject', ['span_dynamicObject_internalRoleButtonName': span_dynamicObject_internalRoleButtonName]))

WebUI.takeScreenshot()

"Step 35: Click on link organizationLinks (myOrganization01)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/link_organizationLinks_2"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/link_organizationLinks_2', ['link_organizationLinks_class': link_organizationLinks_class, 'link_organizationLinks_internalRoleLinkName': link_organizationLinks_internalRoleLinkName, 'link_organizationLinks_organization_id': link_organizationLinks_organization_id]))

WebUI.takeScreenshot()

"Step 36: Click on span dynamicObject (object4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/span_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/span_dynamicObject', ['span_dynamicObject_internalRoleButtonName': span_dynamicObject_internalRoleButtonName_1]))

WebUI.takeScreenshot()

"Step 37: Click on div dynamicObject (object8)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/div_dynamicObject_3"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/div_dynamicObject_3', ['div_dynamicObject_nthChild': div_dynamicObject_nthChild, 'div_dynamicObject_internalHasText': div_dynamicObject_internalHasText]))

WebUI.takeScreenshot()

"Step 38: Click on div dynamicObject (object9)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/div_dynamicObject_3"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/div_dynamicObject_3', ['div_dynamicObject_nthChild': div_dynamicObject_nthChild_1, 'div_dynamicObject_internalHasText': div_dynamicObject_internalHasText_1]))

WebUI.takeScreenshot()

"Step 39: Click on div dynamicObject (object10)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/div_dynamicObject_4'))

WebUI.takeScreenshot()

"Step 40: Click on button teamMembers (rubathrahVeerakkumaran)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/button_teamMembers"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/button_teamMembers', ['button_teamMembers_internalRoleButtonName': button_teamMembers_internalRoleButtonName]))

WebUI.takeScreenshot()

"Step 41: Click on link logout"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_home/link_logout'))

WebUI.takeScreenshot()

"Step 42: Click on span dynamicObject (object5)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/span_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/span_dynamicObject', ['span_dynamicObject_internalRoleButtonName': span_dynamicObject_internalRoleButtonName_2]))

WebUI.takeScreenshot()

"Step 43: Click on div dynamicObject (object11)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/div_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/div_dynamicObject', ['div_dynamicObject_class': div_dynamicObject_class, 'div_dynamicObject_internalHasText': div_dynamicObject_internalHasText_2]))

WebUI.takeScreenshot()

"Step 44: Click on link organizationLinks (rRegIconnect) -> Navigate to page 'team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/link_organizationLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/link_organizationLinks', ['link_organizationLinks_nthChild': link_organizationLinks_nthChild, 'link_organizationLinks_internalRoleLinkName': link_organizationLinks_internalRoleLinkName_1, 'link_organizationLinks_team_id': link_organizationLinks_team_id, 'link_organizationLinks_project_id': link_organizationLinks_project_id]))

WebUI.takeScreenshot()

"Step 45: Click on link reports7 -> Navigate to page 'team/*/project/*/overview'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_reports7'))

WebUI.takeScreenshot()

"Step 46: Click on link testRuns15 -> Navigate to page 'team/*/project/*/executions'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/overview?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_overview/link_testRuns15'))

WebUI.takeScreenshot()

"Step 47: Click on label dynamicObject (object10)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/label_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/label_dynamicObject', ['label_dynamicObject_for': label_dynamicObject_for_9, 'label_dynamicObject_internalRoleRowName': label_dynamicObject_internalRoleRowName_9]))

WebUI.takeScreenshot()

"Step 48: Click on button compareActions (delete2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/button_Delete"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/button_Delete', ['button_compareActions_internalRoleButtonName': button_compareActions_internalRoleButtonName_5]))

WebUI.takeScreenshot()

"Step 49: Click on button delete3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_Delete2'))

WebUI.takeScreenshot()

"Step 50: Click on button object5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_object5'))

WebUI.takeScreenshot()

"Step 51: Click on div app"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_app'))

WebUI.takeScreenshot()

"Step 52: Click on button dynamicObject (aishah)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/button_dynamicObject_4"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/button_dynamicObject_4', ['button_dynamicObject_internalRoleButtonName': button_dynamicObject_internalRoleButtonName_1]))

WebUI.takeScreenshot()

"Step 53: Click on link switchAccount"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_switchAccount'))

WebUI.takeScreenshot()

"Step 54: Click on button dynamicObject (aishah)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/button_dynamicObject_4"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/button_dynamicObject_4', ['button_dynamicObject_internalRoleButtonName': button_dynamicObject_internalRoleButtonName_2]))

WebUI.takeScreenshot()

"Step 55: Click on link logout -> Navigate to page 'organization/*/home'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_logout'))

WebUI.takeScreenshot()

"Step 56: Click on span dynamicObject (object5)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/span_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/span_dynamicObject', ['span_dynamicObject_internalRoleButtonName': span_dynamicObject_internalRoleButtonName_3]))

WebUI.takeScreenshot()

"Step 57: Click on div dynamicObject (object12)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/div_dynamicObject_3"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/div_dynamicObject_3', ['div_dynamicObject_nthChild': div_dynamicObject_nthChild_2, 'div_dynamicObject_internalHasText': div_dynamicObject_internalHasText_3]))

WebUI.takeScreenshot()

"Step 58: Click on link organizationLinks (rRegIconnect2) -> Navigate to page 'team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/link_organizationLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/link_organizationLinks', ['link_organizationLinks_nthChild': link_organizationLinks_nthChild_1, 'link_organizationLinks_internalRoleLinkName': link_organizationLinks_internalRoleLinkName_2, 'link_organizationLinks_team_id': link_organizationLinks_team_id_1, 'link_organizationLinks_project_id': link_organizationLinks_project_id_1]))

WebUI.takeScreenshot()

"Step 59: Click on link reports7 -> Navigate to page 'team/*/project/*/overview'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_reports7'))

WebUI.takeScreenshot()

"Step 60: Click on link testRuns15 -> Navigate to page 'team/*/project/*/executions'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/overview?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_overview/link_testRuns15'))

WebUI.takeScreenshot()

"Step 61: Click on label dynamicObject (object10)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/label_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/label_dynamicObject', ['label_dynamicObject_for': label_dynamicObject_for_10, 'label_dynamicObject_internalRoleRowName': label_dynamicObject_internalRoleRowName_10]))

WebUI.takeScreenshot()

"Step 62: Click on label dynamicObject (object11)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/label_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/label_dynamicObject', ['label_dynamicObject_for': label_dynamicObject_for_11, 'label_dynamicObject_internalRoleRowName': label_dynamicObject_internalRoleRowName_11]))

WebUI.takeScreenshot()

"Step 63: Click on button compareActions (delete2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/button_Delete"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/button_Delete', ['button_compareActions_internalRoleButtonName': button_compareActions_internalRoleButtonName_6]))

WebUI.takeScreenshot()

"Step 64: Click on button delete3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_Delete2'))

WebUI.takeScreenshot()

"Step 65: Click on link dashboard -> Navigate to page 'team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_dashboard_1'))

WebUI.takeScreenshot()

"Step 66: Click on button refreshBtnProjectDashboard"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_refreshBtnProjectDashboard'))

WebUI.takeScreenshot()

"Step 67: Click on button refreshBtnProjectDashboard"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_refreshBtnProjectDashboard'))

WebUI.takeScreenshot()

"Step 68: Click on button dynamicObject (object)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_dynamicObject', ['button_dynamicObject_nthChild': button_dynamicObject_nthChild_2, 'button_dynamicObject_internalLabel': button_dynamicObject_internalLabel_2]))

WebUI.takeScreenshot()

"Step 69: Click on button dynamicObject (object2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_dynamicObject_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_dynamicObject_1', ['button_dynamicObject_nthChild': button_dynamicObject_nthChild_3, 'button_dynamicObject_internalLabel': button_dynamicObject_internalLabel_3]))

WebUI.takeScreenshot()

"Step 70: Click on button refreshBtnProjectDashboard"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_refreshBtnProjectDashboard'))

WebUI.takeScreenshot()

"Step 71: Click on div object6"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_object6'))

WebUI.takeScreenshot()

"Step 72: Click on button dynamicObject (object3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_dynamicObject', ['button_dynamicObject_nthChild': button_dynamicObject_nthChild_4, 'button_dynamicObject_internalLabel': button_dynamicObject_internalLabel_4]))

WebUI.takeScreenshot()

"Step 73: Click on button dynamicObject (object4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_dynamicObject_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_dynamicObject_1', ['button_dynamicObject_nthChild': button_dynamicObject_nthChild_5, 'button_dynamicObject_internalLabel': button_dynamicObject_internalLabel_5]))

WebUI.takeScreenshot()

"Step 74: Click on button dynamicObject (object5)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_dynamicObject_2'))

WebUI.takeScreenshot()

"Step 75: Click on div object7"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_object7'))

WebUI.takeScreenshot()

"Step 76: Click on div object7"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_object7'))

WebUI.takeScreenshot()

"Step 77: Click on button dynamicObject (object6)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_dynamicObject_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_dynamicObject_1', ['button_dynamicObject_nthChild': button_dynamicObject_nthChild_6, 'button_dynamicObject_internalLabel': button_dynamicObject_internalLabel_6]))

WebUI.takeScreenshot()

"Step 78: Click on div object7"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_object7'))

WebUI.takeScreenshot()

"Step 79: Click on button dynamicObject (object7)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_dynamicObject_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_dynamicObject_1', ['button_dynamicObject_nthChild': button_dynamicObject_nthChild_7, 'button_dynamicObject_internalLabel': button_dynamicObject_internalLabel_7]))

WebUI.takeScreenshot()

"Step 80: Click on button dynamicObject (object8)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_dynamicObject', ['button_dynamicObject_nthChild': button_dynamicObject_nthChild_8, 'button_dynamicObject_internalLabel': button_dynamicObject_internalLabel_8]))

WebUI.takeScreenshot()

"Step 81: Click on button dynamicObject (object9)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_dynamicObject_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_dynamicObject_1', ['button_dynamicObject_nthChild': button_dynamicObject_nthChild_9, 'button_dynamicObject_internalLabel': button_dynamicObject_internalLabel_9]))

WebUI.takeScreenshot()

"Step 82: Click on button dynamicObject (object3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_dynamicObject', ['button_dynamicObject_nthChild': button_dynamicObject_nthChild_10, 'button_dynamicObject_internalLabel': button_dynamicObject_internalLabel_10]))

WebUI.takeScreenshot()

"Step 83: Click on button dynamicObject (object10)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_dynamicObject_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_dynamicObject_1', ['button_dynamicObject_nthChild': button_dynamicObject_nthChild_11, 'button_dynamicObject_internalLabel': button_dynamicObject_internalLabel_11]))

WebUI.takeScreenshot()

"Step 84: Click on div object8"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_object8'))

WebUI.takeScreenshot()

"Step 85: Click on div object6 -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_object6'))

WebUI.takeScreenshot()

"Step 86: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC83-Verify Test Planning and Environment Configuration in Team Project_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}