import katalon.truetest.TrueTestScripts
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.configuration.RunConfiguration
import internal.GlobalVariable
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

"Step 3: Navigate to team/*/project/*/test-design/test-cases/*"

TrueTestScripts.navigate("team/${GlobalVariable.team_id}/project/${GlobalVariable.project_id}/test-design/test-cases/${GlobalVariable.test_cases_id}")

"Step 4: Click on link dashboard -> Navigate to page 'team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/link_dashboard'))

WebUI.takeScreenshot(reportLocation + '/TC26/Step 4-Click on link dashboard - Navigate to page teamproject.png')

"Step 5: Click on link planning -> Navigate to page 'team/*/project/*/releases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_planning'))

WebUI.takeScreenshot(reportLocation + '/TC26/Step 5-Click on link planning - Navigate to page teamprojectreleases.png')

"Step 6: Click on link requirements -> Navigate to page 'team/*/project/*/requirements'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/releases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_releases/link_requirements_1'))

WebUI.takeScreenshot(reportLocation + '/TC26/Step 6-Click on link requirements - Navigate to page teamprojectrequirements.png')

"Step 7: Click on link releases -> Navigate to page 'team/*/project/*/releases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/requirements?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_requirements/link_releases'))

WebUI.takeScreenshot(reportLocation + '/TC26/Step 7-Click on link releases - Navigate to page teamprojectreleases.png')

"Step 8: Click on link tests -> Navigate to page 'team/*/project/*/test-design/test-cases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/releases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_releases/link_tests'))

WebUI.takeScreenshot(reportLocation + '/TC26/Step 8-Click on link tests - Navigate to page teamprojecttest-designtest-cases.png')

"Step 9: Click on span object4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/span_object'))

WebUI.takeScreenshot(reportLocation + '/TC26/Step 9-Click on span object4.png')

"Step 10: Click on div testCases2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/div_testCases2'))

WebUI.takeScreenshot(reportLocation + '/TC26/Step 10-Click on div testCases2.png')

"Step 11: Click on span object5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/span_object5'))

WebUI.takeScreenshot(reportLocation + '/TC26/Step 11-Click on span object5.png')

"Step 12: Click on div agendarInventarioTomandoEn"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/div_agendarInventarioTomandoEn'))

WebUI.takeScreenshot(reportLocation + '/TC26/Step 12-Click on div agendarInventarioTomandoEn.png')

"Step 13: Click on span object6"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/span_object6_1'))

WebUI.takeScreenshot(reportLocation + '/TC26/Step 13-Click on span object6.png')

"Step 14: Click on div mantenimientoSalasDeEntrega"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/div_mantenimientoSalasDeEntrega'))

WebUI.takeScreenshot(reportLocation + '/TC26/Step 14-Click on div mantenimientoSalasDeEntrega.png')

"Step 15: Click on div agendarInventarioTomandoEn"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/div_agendarInventarioTomandoEn'))

WebUI.takeScreenshot(reportLocation + '/TC26/Step 15-Click on div agendarInventarioTomandoEn.png')

"Step 16: Click on div katalonCloud"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/div_katalonCloud'))

WebUI.takeScreenshot(reportLocation + '/TC26/Step 16-Click on div katalonCloud.png')

"Step 17: Click on link testSuites -> Navigate to page 'team/*/project/*/test-design/test-suites'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/link_testSuites'))

WebUI.takeScreenshot(reportLocation + '/TC26/Step 17-Click on link testSuites - Navigate to page teamprojecttest-designtest-suites.png')

"Step 18: Click on link executions -> Navigate to page 'team/*/project/*/test-runs'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-suites?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_suites/link_executions'))

WebUI.takeScreenshot(reportLocation + '/TC26/Step 18-Click on link executions - Navigate to page teamprojecttest-runs.png')

"Step 19: Click on link tests -> Navigate to page 'team/*/project/*/test-design/test-cases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/link_tests'))

WebUI.takeScreenshot(reportLocation + '/TC26/Step 19-Click on link tests - Navigate to page teamprojecttest-designtest-cases.png')

"Step 20: Click on link executions -> Navigate to page 'team/*/project/*/test-runs'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/link_executions'))

WebUI.takeScreenshot(reportLocation + '/TC26/Step 20-Click on link executions - Navigate to page teamprojecttest-runs.png')

"Step 21: Click on body object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/body_object'))

WebUI.takeScreenshot(reportLocation + '/TC26/Step 21-Click on body object.png')

"Step 22: Click on div object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_object_1'))

WebUI.takeScreenshot(reportLocation + '/TC26/Step 22-Click on div object.png')

"Step 23: Click on input selectRowUntitledTest2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/input_selectRowUntitledTest2'))

WebUI.takeScreenshot(reportLocation + '/TC26/Step 23-Click on input selectRowUntitledTest2.png')

"Step 24: Click on button arrowDropDownIcon"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_arrowDropDownIcon'))

WebUI.takeScreenshot(reportLocation + '/TC26/Step 24-Click on button arrowDropDownIcon.png')

"Step 25: Click on div lchavarriaGrupoqCom"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_lchavarriaGrupoqCom'))

WebUI.takeScreenshot(reportLocation + '/TC26/Step 25-Click on div lchavarriaGrupoqCom.png')

"Step 26: Click on input selectAllRows"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/input_selectAllRows'))

WebUI.takeScreenshot(reportLocation + '/TC26/Step 26-Click on input selectAllRows.png')

"Step 27: Click on link tests -> Navigate to page 'team/*/project/*/test-design/test-cases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/link_tests'))

WebUI.takeScreenshot(reportLocation + '/TC26/Step 27-Click on link tests - Navigate to page teamprojecttest-designtest-cases.png')

"Step 28: Click on span object7"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/span_object7_1'))

WebUI.takeScreenshot(reportLocation + '/TC26/Step 28-Click on span object7.png')

"Step 29: Click on div agendarInventarioTomandoEn"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/div_agendarInventarioTomandoEn'))

WebUI.takeScreenshot(reportLocation + '/TC26/Step 29-Click on div agendarInventarioTomandoEn.png')

"Step 30: Click on link agendamientoDaniosMayores -> Navigate to page 'team/*/project/*/test-design/test-cases/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/link_agendamientoDaniosMayores'))

WebUI.takeScreenshot(reportLocation + '/TC26/Step 30-Click on link agendamientoDaniosMayores - Navigate to page teamprojecttest-designtest-cases.png')

"Step 31: Click on link testSuites -> Navigate to page 'team/*/project/*/test-design/test-suites'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/link_testSuites'))

WebUI.takeScreenshot(reportLocation + '/TC26/Step 31-Click on link testSuites - Navigate to page teamprojecttest-designtest-suites.png')

"Step 32: Click on span object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-suites?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_suites/span_object'))

WebUI.takeScreenshot(reportLocation + '/TC26/Step 32-Click on span object.png')

"Step 33: Click on span object2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-suites?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_suites/span_object2'))

WebUI.takeScreenshot(reportLocation + '/TC26/Step 33-Click on span object2.png')

"Step 34: Click on span object3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-suites?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_suites/span_object3_1'))

WebUI.takeScreenshot(reportLocation + '/TC26/Step 34-Click on span object3.png')

"Step 35: Click on div tsValidacionAgendamientoVehiculosConDanios"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-suites?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_suites/div_tsValidacionAgendamientoVehiculosConDanios'))

WebUI.takeScreenshot(reportLocation + '/TC26/Step 35-Click on div tsValidacionAgendamientoVehiculosConDanios.png')

"Step 36: Click on div tsValidacionAgendamientoVehiculosConDanios2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-suites?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_suites/div_tsValidacionAgendamientoVehiculosConDanios2'))

WebUI.takeScreenshot(reportLocation + '/TC26/Step 36-Click on div tsValidacionAgendamientoVehiculosConDanios2.png')

"Step 37: Click on link smokeTestSuite -> Navigate to page 'team/*/project/*/test-design/test-suites/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-suites?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_suites/link_smokeTestSuite'))

WebUI.takeScreenshot(reportLocation + '/TC26/Step 37-Click on link smokeTestSuite - Navigate to page teamprojecttest-designtest-suites.png')

"Step 38: Click on link failedCpacDecPreapprovalBindTestSuite -> Navigate to page 'team/*/project/*/executions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-suites/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_suites/link_passedCoordinatorCore'))

WebUI.takeScreenshot(reportLocation + '/TC26/Step 38-Click on link failedCpacDecPreapprovalBindTestSuite - Navigate to page teamprojectexecutions.png')

"Step 39: Click on link testResults -> Navigate to page 'team/*/project/*/executions/*/test-runs'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_testResults'))

WebUI.takeScreenshot(reportLocation + '/TC26/Step 39-Click on link testResults - Navigate to page teamprojectexecutionstest-runs.png')

"Step 40: Click on link testResults"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_runs/link_testResults'))

WebUI.takeScreenshot(reportLocation + '/TC26/Step 40-Click on link testResults.png')

"Step 41: Click on link files -> Navigate to page 'team/*/project/*/executions/*/files'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_runs/link_files'))

WebUI.takeScreenshot(reportLocation + '/TC26/Step 41-Click on link files - Navigate to page teamprojectexecutionsfiles.png')

"Step 42: Click on link dashboard -> Navigate to page 'team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/executions/.*/files?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_files/link_dashboard'))

WebUI.takeScreenshot(reportLocation + '/TC26/Step 42-Click on link dashboard - Navigate to page teamproject.png')

"Step 43: Click on link planning -> Navigate to page 'team/*/project/*/releases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_planning'))

WebUI.takeScreenshot(reportLocation + '/TC26/Step 43-Click on link planning - Navigate to page teamprojectreleases.png')

"Step 44: Click on link tests -> Navigate to page 'team/*/project/*/test-design/test-cases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/releases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_releases/link_tests'))

WebUI.takeScreenshot(reportLocation + '/TC26/Step 44-Click on link tests - Navigate to page teamprojecttest-designtest-cases.png')

"Step 45: Click on div mantenimientoSalasDeEntrega"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/div_mantenimientoSalasDeEntrega'))

WebUI.takeScreenshot(reportLocation + '/TC26/Step 45-Click on div mantenimientoSalasDeEntrega.png')

"Step 46: Click on link executions -> Navigate to page 'team/*/project/*/test-runs'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-design/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_cases/link_executions'))

WebUI.takeScreenshot(reportLocation + '/TC26/Step 46-Click on link executions - Navigate to page teamprojecttest-runs.png')

"Step 47: Click on input selectRowUntitledTestNa"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/input_selectRowUntitledTestNa'))

WebUI.takeScreenshot(reportLocation + '/TC26/Step 47-Click on input selectRowUntitledTestNa.png')

"Step 48: Click on input selectRowUntitledTestNa"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/input_selectRowUntitledTestNa'))

WebUI.takeScreenshot(reportLocation + '/TC26/Step 48-Click on input selectRowUntitledTestNa.png')

"Step 49: Click on div parallelSuite751"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_object18'))

WebUI.takeScreenshot(reportLocation + '/TC26/Step 49-Click on div parallelSuite751.png')

"Step 50: Click on input selectRowUntitledTestNa2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/input_selectRowUntitledTestNa2'))

WebUI.takeScreenshot(reportLocation + '/TC26/Step 50-Click on input selectRowUntitledTestNa2.png')

"Step 51: Click on input selectRowUntitledTestNa2 -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/input_selectRowUntitledTestNa2'))

WebUI.takeScreenshot(reportLocation + '/TC26/Step 51-Click on input selectRowUntitledTestNa2 - Navigate to page .png')

"Step 52: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC26-Manage Test Cases and Verify Home Page in Sauce Demo_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}