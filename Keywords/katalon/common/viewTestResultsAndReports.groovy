package katalon.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

public class viewTestResultsAndReports {
    
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

