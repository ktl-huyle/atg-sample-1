package truetest.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

public class submitThumbnailImageUpdate {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Click on div ThumbnailImage"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_ThumbnailImage'))
        
        "Step 2: Click on button Close"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_Close'))
        
        "Step 3: Click on div ThumbnailImage"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_ThumbnailImage'))
        
        "Step 4: Click on label FunctionsUpdate"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/label_FunctionsUpdate'))
        
        "Step 5: Click on button Submit"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_Submit'))
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

