package katalon.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

public class manageFailedTestsAndCloseObjects {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Click on div object3"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_object3'))
        
        "Step 2: Click on button close4"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_close4'))
        
        "Step 3: Click on div object4"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_object4'))
        
        "Step 4: Click on div failedCreateReverse2"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_failedCreateReverse2'))
        
        "Step 5: Click on div object5"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_object5'))
        
        "Step 6: Click on div createdWithSketch"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_createdWithSketch'))
        
        "Step 7: Click on button close4"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_close4'))
        
        "Step 8: Click on pre object"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/pre_object'))
        
        "Step 9: Click on div object3"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_object3'))
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

