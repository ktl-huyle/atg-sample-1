package katalon.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

public class reviewFailedTestExecutions {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Click on div object2"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_runs/div_object2'))
        
        "Step 2: Click on button close"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_runs/button_close'))
        
        "Step 3: Click on span failedAmst4964"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_runs/span_failedAmst4964'))
        
        "Step 4: Click on span failedAmst4964"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_runs/span_failedAmst4964'))
        
        "Step 5: Click on div object2"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_runs/div_object2'))
        
        "Step 6: Click on button close"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_runs/button_close'))
        
        "Step 7: Click on div amst4965AutodialerCall"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_runs/div_amst4965AutodialerCall'))
        
        "Step 8: Click on span failedAmst5028"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_runs/span_failedAmst5028'))
        
        "Step 9: Click on span failedAmst5051"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_runs/span_failedAmst5051'))
        
        "Step 10: Click on span failedAmst4963"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_runs/span_failedAmst4963'))
        
        "Step 11: Click on span failedAmst4933"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_runs/span_failedAmst4933'))
        
        "Step 12: Click on div amst4965AutodialerCall"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_runs/div_amst4965AutodialerCall'))
        
        "Step 13: Click on span failedAmst4968"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_runs/span_failedAmst4968'))
        
        "Step 14: Click on span failedAmst4965"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_runs/span_failedAmst4965'))
        
        "Step 15: Click on div amst4965AutodialerCall"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_runs/div_amst4965AutodialerCall'))
        
        "Step 16: Click on div amst4965AutodialerCall"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_runs/div_amst4965AutodialerCall'))
        
        "Step 17: Click on div object2"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_runs/div_object2'))
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

