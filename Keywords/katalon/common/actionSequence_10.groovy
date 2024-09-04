package katalon.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

public class actionSequence_10 {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Click on div object5"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_object5'))
        
        "Step 2: Click on button object"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_object'))
        
        "Step 3: Click on div object6"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_object6'))
        
        "Step 4: Click on label object5"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/label_object5'))
        
        "Step 5: Click on button submit"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_submit'))
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

