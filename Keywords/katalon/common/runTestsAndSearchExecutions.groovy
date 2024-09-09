package katalon.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

public class runTestsAndSearchExecutions {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Click on button customFields"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_customFields'))
        
        "Step 2: Click on div dailyPast7DaysReleaseBuildAllProfileAll"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_dailyPast7DaysReleaseBuildAllProfileAll'))
        
        "Step 3: Click on button run"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_run'))
        
        "Step 4: Click on link executions4"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_executions4'))
        
        "Step 5: Click on input searchTestRun"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_searchTestRun'))
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

