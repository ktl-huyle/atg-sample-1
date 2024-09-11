package katalon.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

public class scheduleAndRefreshTestRuns {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Click on link schedules2 -> Navigate to page 'team/*/project/*/grid'"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/link_schedules2'))
        
        "Step 2: Click on button scheduleTestRun"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid/button_scheduleTestRun'))
        
        "Step 3: Click on link executions"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid/link_executions'))
        
        "Step 4: Enter input value in link schedules"
        
        WebUI.setText(findTestObject('AI-Generated/Page_team_project_grid/link_schedules'), data['link_schedules'])
        
        "Step 5: Click on button scheduleTestRun"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid/button_scheduleTestRun'))
        
        "Step 6: Click on div name"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid/div_name'))
        
        "Step 7: Click on input name"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid/input_name'))
        
        "Step 8: Click on div testSuitesAllFeaturesTestSuite"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid/div_testSuitesAllFeaturesTestSuite'))
        
        "Step 9: Click on div object"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid/div_object'))
        
        "Step 10: Click on div object"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid/div_object'))
        
        "Step 11: Click on button closeDialogButton"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid/button_closeDialogButton'))
        
        "Step 12: Click on button scheduleTestRun"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid/button_scheduleTestRun'))
        
        "Step 13: Click on link clickHereToRefresh"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid/link_clickHereToRefresh'))
        
        "Step 14: Click on link clickHereToRefresh"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid/link_clickHereToRefresh'))
        
        "Step 15: Click on div object2"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid/div_object2'))
        
        "Step 16: Click on div testSuitesAllFeaturesTestSuite2"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid/div_testSuitesAllFeaturesTestSuite2'))
        
        "Step 17: Click on link clickHereToRefresh"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid/link_clickHereToRefresh'))
        
        "Step 18: Click on link clickHereToRefresh"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid/link_clickHereToRefresh'))
        
        "Step 19: Click on button testSuiteCollection"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid/button_testSuiteCollection'))
        
        "Step 20: Click on button testSuite"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid/button_testSuite'))
        
        "Step 21: Click on div object3"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid/div_object3'))
        
        "Step 22: Click on div katalonCloud"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid/div_katalonCloud'))
        
        "Step 23: Click on div object4"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid/div_object4'))
        
        "Step 24: Click on div object3"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid/div_object3'))
        
        "Step 25: Click on div ehsTestAutomationGit"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_grid/div_ehsTestAutomationGit'))
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        data['link_schedules'] = testData.getValue('link_schedules', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['link_schedules'] = 'default_data'
        execute_functional_method(data)
    }
    
    public static def execute(String datasource = null, int rowIndex = 1) {
        if (datasource != null) {
            execute_with_data_source(datasource, rowIndex)
        } else {
            execute_without_data_source()
        }
    }
}

