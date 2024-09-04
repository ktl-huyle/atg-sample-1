package katalon.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

public class actionSequence_2 {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Click on button externalLinkButton5"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_externalLinkButton5'))
        
        "Step 2: Click on button externalLinkButton"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_externalLinkButton'))
        
        "Step 3: Click on button externalLinkButton2 -> Navigate to page 'team/*/project/*/executions/*/test-result/*'"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_externalLinkButton2'))
        
        "Step 4: Click on button markStatusButton"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/button_markStatusButton'))
        
        "Step 5: Click on label object"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/label_object'))
        
        "Step 6: Click on button submit"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions_test_result/button_submit'))
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
