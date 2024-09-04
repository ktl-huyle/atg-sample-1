package katalon.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

public class actionSequence_7 {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Click on button profileAll"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_profileAll'))
        
        "Step 2: Click on p object"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/p_object'))
        
        "Step 3: Click on button profileAll"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_profileAll'))
        
        "Step 4: Click on div object44"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_object44'))
        
        "Step 5: Click on button dailyPast7Days"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_dailyPast7Days'))
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

