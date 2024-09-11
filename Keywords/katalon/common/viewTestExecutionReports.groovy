package katalon.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

public class viewTestExecutionReports {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Click on link executions"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_executions'))
        
        "Step 2: Click on link executions"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_executions'))
        
        "Step 3: Click on link reports"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_reports'))
        
        "Step 4: Click on link testResults"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_testResults'))
        
        "Step 5: Click on button profileAll"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_profileAll'))
        
        "Step 6: Click on p sit"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/p_sit'))
        
        "Step 7: Click on button profileAll"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_profileAll'))
        
        "Step 8: Click on div sit"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_sit'))
        
        "Step 9: Click on button dailyPast7Days"
        
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

