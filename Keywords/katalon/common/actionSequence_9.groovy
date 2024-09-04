package katalon.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

public class actionSequence_9 {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Click on div object7"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_runs/div_object7'))
        
        "Step 2: Click on button object"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_runs/button_object'))
        
        "Step 3: Click on div object8"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_runs/div_object8'))
        
        "Step 4: Click on button object"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_runs/button_object'))
        
        "Step 5: Click on div object9"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_runs/div_object9'))
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        
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

