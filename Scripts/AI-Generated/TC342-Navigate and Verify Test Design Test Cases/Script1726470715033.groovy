import internal.GlobalVariable
import com.kms.katalon.core.configuration.RunConfiguration
import katalon.truetest.TrueTestScripts
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

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

"Step 3: Navigate to team/*/project/*/test-design/test-cases/*"

TrueTestScripts.navigate("team/${GlobalVariable.team_id}/project/${GlobalVariable.project_id}/test-design/test-cases/${GlobalVariable.test_cases_id}")

"Step 4: Click on link dashboard -> Navigate to page 'team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/link_dashboard'))

WebUI.takeScreenshot(reportLocation + '/TC342/Step 4-Click on link dashboard - Navigate to page teamproject.png')

"Step 5: Click on link planning -> Navigate to page 'team/*/project/*/releases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_planning'))

WebUI.takeScreenshot(reportLocation + '/TC342/Step 5-Click on link planning - Navigate to page teamprojectreleases.png')

"Step 6: Click on link requirements -> Navigate to page 'team/*/project/*/requirements'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/releases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_releases/link_requirements'))

WebUI.takeScreenshot(reportLocation + '/TC342/Step 6-Click on link requirements - Navigate to page teamprojectrequirements.png')

"Step 7: Click on link releases -> Navigate to page 'team/*/project/*/releases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/requirements?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_requirements/link_releases'))

WebUI.takeScreenshot(reportLocation + '/TC342/Step 7-Click on link releases - Navigate to page teamprojectreleases.png')

"Step 8: Click on link testDesignTestCases -> Navigate to page 'team/*/project/*/test-design/test-cases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/releases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_releases/link_testDesignTestCases'))

WebUI.takeScreenshot(reportLocation + '/TC342/Step 8-Click on link testDesignTestCases - Navigate to page teamprojecttest-designtest-cases.png')

"Step 9: Click on span objectDetails (object)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_objectDetails'))

WebUI.takeScreenshot(reportLocation + '/TC342/Step 9-Click on span objectDetails object.png')

"Step 10: Click on div testCaseItems (testCases)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/div_testCaseItems'))

WebUI.takeScreenshot(reportLocation + '/TC342/Step 10-Click on div testCaseItems testCases.png')

"Step 11: Click on span objectDetails (object2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/span_objectDetails'))

WebUI.takeScreenshot(reportLocation + '/TC342/Step 11-Click on span objectDetails object2.png')

"Step 12: Click on div testCaseItems (agendarInventarioTomandoEn)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/div_testCaseItems"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/div_testCaseItems', ['div_testCaseItems_internalText': div_testCaseItems_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC342/Step 12-Click on div testCaseItems agendarInventarioTomandoEn.png')

"Step 13: Click on span object3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/span_object3'))

WebUI.takeScreenshot(reportLocation + '/TC342/Step 13-Click on span object3.png')

"Step 14: Click on div testCaseItems (mantenimientoSalasDeEntrega)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/div_testCaseItems"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/div_testCaseItems', ['div_testCaseItems_internalText': div_testCaseItems_internalText_1]))

WebUI.takeScreenshot(reportLocation + '/TC342/Step 14-Click on div testCaseItems mantenimientoSalasDeEntrega.png')

"Step 15: Click on div testCaseItems (agendarInventarioTomandoEn)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/div_testCaseItems"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/div_testCaseItems', ['div_testCaseItems_internalText': div_testCaseItems_internalText_2]))

WebUI.takeScreenshot(reportLocation + '/TC342/Step 15-Click on div testCaseItems agendarInventarioTomandoEn.png')

"Step 16: Click on div testCaseItems (katalonCloud)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/div_testCaseItems"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/div_testCaseItems', ['div_testCaseItems_internalText': div_testCaseItems_internalText_3]))

WebUI.takeScreenshot(reportLocation + '/TC342/Step 16-Click on div testCaseItems katalonCloud.png')

"Step 17: Click on link testDesignTestSuites -> Navigate to page 'team/*/project/*/test-design/test-suites'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/link_testDesignTestSuites'))

WebUI.takeScreenshot(reportLocation + '/TC342/Step 17-Click on link testDesignTestSuites - Navigate to page teamprojecttest-designtest-suites.png')

"Step 18: Click on link executions2 -> Navigate to page 'team/*/project/*/test-runs'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-suites?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_suites/link_executions2'))

WebUI.takeScreenshot(reportLocation + '/TC342/Step 18-Click on link executions2 - Navigate to page teamprojecttest-runs.png')

"Step 19: Click on link tests2 -> Navigate to page 'team/*/project/*/test-design/test-cases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/link_tests2'))

WebUI.takeScreenshot(reportLocation + '/TC342/Step 19-Click on link tests2 - Navigate to page teamprojecttest-designtest-cases.png')

"Step 20: Click on link executions -> Navigate to page 'team/*/project/*/test-runs'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/link_executions'))

WebUI.takeScreenshot(reportLocation + '/TC342/Step 20-Click on link executions - Navigate to page teamprojecttest-runs.png')

"Step 21: Click on body object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/body_object'))

WebUI.takeScreenshot(reportLocation + '/TC342/Step 21-Click on body object.png')

"Step 22: Click on div objectDetails (object)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_objectDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_objectDetails', ['div_objectDetails_class': div_objectDetails_class]))

WebUI.takeScreenshot(reportLocation + '/TC342/Step 22-Click on div objectDetails object.png')

"Step 23: Click on input rowSelection (selectRowUntitledTest)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/input_rowSelection"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/input_rowSelection', ['input_rowSelection_class': input_rowSelection_class, 'input_rowSelection_internalRoleRowName': input_rowSelection_internalRoleRowName]))

WebUI.takeScreenshot(reportLocation + '/TC342/Step 23-Click on input rowSelection selectRowUntitledTest.png')

"Step 24: Click on button arrowDropDownIcon"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_arrowDropDownIcon'))

WebUI.takeScreenshot(reportLocation + '/TC342/Step 24-Click on button arrowDropDownIcon.png')

"Step 25: Click on div lchavarriaGrupoqCom"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_lchavarriaGrupoqCom'))

WebUI.takeScreenshot(reportLocation + '/TC342/Step 25-Click on div lchavarriaGrupoqCom.png')

"Step 26: Click on input selectAllRows"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/input_selectAllRows'))

WebUI.takeScreenshot(reportLocation + '/TC342/Step 26-Click on input selectAllRows.png')

"Step 27: Click on link tests2 -> Navigate to page 'team/*/project/*/test-design/test-cases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/link_tests2'))

WebUI.takeScreenshot(reportLocation + '/TC342/Step 27-Click on link tests2 - Navigate to page teamprojecttest-designtest-cases.png')

"Step 28: Click on span object4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/span_object4'))

WebUI.takeScreenshot(reportLocation + '/TC342/Step 28-Click on span object4.png')

"Step 29: Click on div testCaseItems (agendarInventarioTomandoEn)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/div_testCaseItems"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/div_testCaseItems', ['div_testCaseItems_internalText': div_testCaseItems_internalText_4]))

WebUI.takeScreenshot(reportLocation + '/TC342/Step 29-Click on div testCaseItems agendarInventarioTomandoEn.png')

"Step 30: Click on link agendamientoCon -> Navigate to page 'team/*/project/*/test-design/test-cases/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/link_agendamientoCon'))

WebUI.takeScreenshot(reportLocation + '/TC342/Step 30-Click on link agendamientoCon - Navigate to page teamprojecttest-designtest-cases.png')

"Step 31: Click on link testDesignTestSuites -> Navigate to page 'team/*/project/*/test-design/test-suites'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/link_testDesignTestSuites'))

WebUI.takeScreenshot(reportLocation + '/TC342/Step 31-Click on link testDesignTestSuites - Navigate to page teamprojecttest-designtest-suites.png')

"Step 32: Click on span objectDetails (object)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-suites?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_suites/span_objectDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_suites/span_objectDetails', ['span_objectDetails_class': span_objectDetails_class]))

WebUI.takeScreenshot(reportLocation + '/TC342/Step 32-Click on span objectDetails object.png')

"Step 33: Click on span objectDetails (object2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-suites?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_suites/span_objectDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_suites/span_objectDetails', ['span_objectDetails_class': span_objectDetails_class_1]))

WebUI.takeScreenshot(reportLocation + '/TC342/Step 33-Click on span objectDetails object2.png')

"Step 34: Click on span object3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-suites?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_suites/span_object3'))

WebUI.takeScreenshot(reportLocation + '/TC342/Step 34-Click on span object3.png')

"Step 35: Click on div testSuiteItems (tsValidacionAgendamientoVehiculosConDanios)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-suites?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_suites/div_testSuiteItems"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_suites/div_testSuiteItems', ['div_testSuiteItems_internalText': div_testSuiteItems_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC342/Step 35-Click on div testSuiteItems tsValidacionAgendamientoVehiculosConDanios.png')

"Step 36: Click on div testSuiteItems (tsValidacionAgendamientoVehiculosConDanios2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-suites?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_suites/div_testSuiteItems"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_suites/div_testSuiteItems', ['div_testSuiteItems_internalText': div_testSuiteItems_internalText_1]))

WebUI.takeScreenshot(reportLocation + '/TC342/Step 36-Click on div testSuiteItems tsValidacionAgendamientoVehiculosConDanios2.png')

"Step 37: Click on link testSuiteLinks (testSuitesTsvalidacionAgendamientoVehiculos) -> Navigate to page 'team/*/project/*/test-design/test-suites/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-suites?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_suites/link_testSuiteLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_suites/link_testSuiteLinks', ['link_testSuiteLinks_internalRoleLinkName': link_testSuiteLinks_internalRoleLinkName, 'link_testSuiteLinks_team_id': link_testSuiteLinks_team_id, 'link_testSuiteLinks_project_id': link_testSuiteLinks_project_id, 'link_testSuiteLinks_test_suites_id': link_testSuiteLinks_test_suites_id]))

WebUI.takeScreenshot(reportLocation + '/TC342/Step 37-Click on link testSuiteLinks testSuitesTsvalidacionAgendamientoVehiculos - Navigate to page teamprojecttest-designtest-suites.png')

"Step 38: Click on link testSuiteLinks (testSuiteValidacionVehiculosConDañosMenores) -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-suites/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_suites/link_testSuiteLinks_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_suites/link_testSuiteLinks_1', ['link_testSuiteLinks_team_id': link_testSuiteLinks_team_id_1, 'link_testSuiteLinks_project_id': link_testSuiteLinks_project_id_1, 'link_testSuiteLinks_executions_id': link_testSuiteLinks_executions_id]))

WebUI.takeScreenshot(reportLocation + '/TC342/Step 38-Click on link testSuiteLinks testSuiteValidacionVehiculosConDañosMenores - Navigate to page teamprojectexecutions.png')

"Step 39: Click on link testResults -> Navigate to page 'team/*/project/*/executions/*/test-runs'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_testResults_1'))

WebUI.takeScreenshot(reportLocation + '/TC342/Step 39-Click on link testResults - Navigate to page teamprojectexecutionstest-runs.png')

"Step 40: Click on link testResults"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_runs/link_testResults'))

WebUI.takeScreenshot(reportLocation + '/TC342/Step 40-Click on link testResults.png')

"Step 41: Click on link files -> Navigate to page 'team/*/project/*/executions/*/files'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_runs/link_files'))

WebUI.takeScreenshot(reportLocation + '/TC342/Step 41-Click on link files - Navigate to page teamprojectexecutionsfiles.png')

"Step 42: Click on link dashboard -> Navigate to page 'team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/files?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_files/link_dashboard'))

WebUI.takeScreenshot(reportLocation + '/TC342/Step 42-Click on link dashboard - Navigate to page teamproject.png')

"Step 43: Click on link planning -> Navigate to page 'team/*/project/*/releases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_planning'))

WebUI.takeScreenshot(reportLocation + '/TC342/Step 43-Click on link planning - Navigate to page teamprojectreleases.png')

"Step 44: Click on link testDesignTestCases -> Navigate to page 'team/*/project/*/test-design/test-cases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/releases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_releases/link_testDesignTestCases'))

WebUI.takeScreenshot(reportLocation + '/TC342/Step 44-Click on link testDesignTestCases - Navigate to page teamprojecttest-designtest-cases.png')

"Step 45: Click on div testCaseItems (mantenimientoSalasDeEntrega)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/div_testCaseItems"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_design_test_cases/div_testCaseItems', ['div_testCaseItems_internalText': div_testCaseItems_internalText_5]))

WebUI.takeScreenshot(reportLocation + '/TC342/Step 45-Click on div testCaseItems mantenimientoSalasDeEntrega.png')

"Step 46: Click on link executions -> Navigate to page 'team/*/project/*/test-runs'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/link_executions'))

WebUI.takeScreenshot(reportLocation + '/TC342/Step 46-Click on link executions - Navigate to page teamprojecttest-runs.png')

"Step 47: Click on input rowSelection (selectRow)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/input_rowSelection"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/input_rowSelection', ['input_rowSelection_class': input_rowSelection_class_1, 'input_rowSelection_internalRoleRowName': input_rowSelection_internalRoleRowName_1]))

WebUI.takeScreenshot(reportLocation + '/TC342/Step 47-Click on input rowSelection selectRow.png')

"Step 48: Click on input rowSelection (unselectRow)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/input_rowSelection"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/input_rowSelection', ['input_rowSelection_class': input_rowSelection_class_2]))

WebUI.takeScreenshot(reportLocation + '/TC342/Step 48-Click on input rowSelection unselectRow.png')

"Step 49: Click on div testRunItems (object2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_testRunItems"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_testRunItems', ['div_testRunItems_internalRoleCellName': div_testRunItems_internalRoleCellName]))

WebUI.takeScreenshot(reportLocation + '/TC342/Step 49-Click on div testRunItems object2.png')

"Step 50: Click on input rowSelection (selectRow2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/input_rowSelection"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/input_rowSelection', ['input_rowSelection_class': input_rowSelection_class_3, 'input_rowSelection_internalRoleRowName': input_rowSelection_internalRoleRowName_2]))

WebUI.takeScreenshot(reportLocation + '/TC342/Step 50-Click on input rowSelection selectRow2.png')

"Step 51: Click on input rowSelection (unselectRow2) -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/input_rowSelection"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/input_rowSelection', ['input_rowSelection_class': input_rowSelection_class_4]))

WebUI.takeScreenshot(reportLocation + '/TC342/Step 51-Click on input rowSelection unselectRow2 - Navigate to page .png')

"Step 52: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC342-Navigate and Verify Test Design Test Cases_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}