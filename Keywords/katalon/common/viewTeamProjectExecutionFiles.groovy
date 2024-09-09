package katalon.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

public class viewTeamProjectExecutionFiles {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Click on div object8"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_object8'))
        
        "Step 2: Click on button details -> Navigate to page 'team/*/project/*/executions/*'"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_details'))
        
        "Step 3: Click on link files -> Navigate to page 'team/*/project/*/executions/*/files'"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_files'))
        
        "Step 4: Click on input filterProfiles"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_files/input_filterProfiles'))
        
        "Step 5: Enter input value in input filterProfiles"
        
        WebUI.setText(findTestObject('AI-Generated/Page_team_project_executions_files/input_filterProfiles'), data['input_filterProfiles'])
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        data['input_filterProfiles'] = testData.getValue('input_filterProfiles', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['input_filterProfiles'] = 'default_data'
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

