package katalon.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

public class submitFunctionUpdates {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Click on div thumbnailImage"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_thumbnailImage'))
        
        "Step 2: Click on button close"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_close'))
        
        "Step 3: Click on div thumbnailImage"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_thumbnailImage'))
        
        "Step 4: Click on label functionsHaveUpdates"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/label_functionsHaveUpdates'))
        
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

