package katalon.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

public class markTestsAsPassedAndReportIssues {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Click on button markAsPassed"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_markAsPassed'))
        
        "Step 2: Click on label functionsHaveUpdates"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/label_functionsHaveUpdates'))
        
        "Step 3: Click on button submit"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_submit'))
        
        "Step 4: Click on span failedC2795025"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/span_failedC2795025'))
        
        "Step 5: Click on span failedC2795025"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/span_failedC2795025'))
        
        "Step 6: Click on span failedSortAndFilterGui"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/span_failedSortAndFilterGui'))
        
        "Step 7: Click on button markAsPassed"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_markAsPassed'))
        
        "Step 8: Click on label functionsHaveUpdates"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/label_functionsHaveUpdates'))
        
        "Step 9: Click on label basedOnManualTestResult"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/label_basedOnManualTestResult'))
        
        "Step 10: Click on button submit"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_submit'))
        
        "Step 11: Click on span failedSortAndFilterGui"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/span_failedSortAndFilterGui'))
        
        "Step 12: Click on button markAsPassed"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_markAsPassed'))
        
        "Step 13: Click on label basedOnManualTestResult"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/label_basedOnManualTestResult'))
        
        "Step 14: Click on button submit"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_submit'))
        
        "Step 15: Click on div failedC2772372"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_failedC2772372'))
        
        "Step 16: Click on button reportDefect"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_reportDefect'))
        
        "Step 17: Click on div issuePicker"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_issuePicker'))
        
        "Step 18: Enter input value in input personalAccessToken"
        
        WebUI.setText(findTestObject('AI-Generated/Page_team_project_executions/input_personalAccessToken'), data['input_personalAccessToken'])
        
        "Step 19: Click on p auto3546AndC9287"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/p_auto3546AndC9287'))
        
        "Step 20: Click on button linkDefect"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_linkDefect'))
        
        "Step 21: Click on button markAsPassed"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_markAsPassed'))
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        data['input_personalAccessToken'] = testData.getValue('input_personalAccessToken', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['input_personalAccessToken'] = 'default_data'
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

