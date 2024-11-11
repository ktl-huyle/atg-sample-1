package truetest.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

public class navigateAndScheduleTestRunForProject {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Click on link ojOracleJdeThereIsNoDataToDisplay -> Navigate to page 'team/*/project/*'"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_home/link_ojOracleJdeThereIsNoDataToDisplay'))
        
        "Step 2: Click on link settings -> Navigate to page 'team/*/project/*/settings'"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_settings'))
        
        "Step 3: Click on link scriptRepositories5 -> Navigate to page 'team/*/project/*/test-project'"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_settings/link_scriptRepositories5'))
        
        "Step 4: Click on link teamProjectTestProject2 -> Navigate to page 'team/*/project/*/test-project/*'"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_project/link_teamProjectTestProject2'))
        
        "Step 5: Click on button scheduleTestRun2 -> Navigate to page 'team/*/project/*/test-planning'"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_project/button_scheduleTestRun2'))
        
        "Step 6: Click on input name2"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_planning/input_name2'))
        
        "Step 7: Click on div object7"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_planning/div_object7'))
        
        "Step 8: Enter input value in input name2"
        
        WebUI.setText(findTestObject('AI-Generated/Page_team_project_test_planning/input_name2'), data['input_name2_1'])
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        data['input_name2_1'] = testData.getValue('input_name2_1', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['input_name2_1'] = 'default_data'
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

