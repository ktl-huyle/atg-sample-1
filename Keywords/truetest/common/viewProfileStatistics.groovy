package truetest.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

public class viewProfileStatistics {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Click on button ProfileAll"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_ProfileAll'))
        
        "Step 2: Click on p SitMenuItem"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/p_SitMenuItem'))
        
        "Step 3: Click on button ProfileSit"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_ProfileSit'))
        
        "Step 4: Click on div SitImage"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_SitImage'))
        
        "Step 5: Click on button DailyPast7Days"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_DailyPast7Days'))
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

