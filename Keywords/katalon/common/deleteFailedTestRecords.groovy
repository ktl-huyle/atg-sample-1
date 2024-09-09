package katalon.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

public class deleteFailedTestRecords {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Click on button delete2"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_delete2'))
        
        "Step 2: Click on label failed652FailedSisbook"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/label_failed652FailedSisbook'))
        
        "Step 3: Click on label failed651FailedSisbook"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/label_failed651FailedSisbook'))
        
        "Step 4: Click on label failed650FailedSisbook"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/label_failed650FailedSisbook'))
        
        "Step 5: Click on button delete"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_delete'))
        
        "Step 6: Click on button delete2"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_delete2'))
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

