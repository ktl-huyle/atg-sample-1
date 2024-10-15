package truetest.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

public class accessTestRunsAndViewExecutionDetails {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Click on link TestRuns6 -> Navigate to page '/team/*/project/*/executions'"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_overview/link_TestRuns6'))
        
        "Step 2: Click on button CustomFields"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_CustomFields'))
        
        "Step 3: Click on div executionDetails (ExecutionDetails)"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/div_executionDetails"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/div_executionDetails', ['div_executionDetails_internalText': data['div_executionDetails_internalText']]))
        
        "Step 4: Click on button ElapsedDuration"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_ElapsedDuration'))
        
        "Step 5: Click on link executionLinks (ExecutionLink)"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/link_executionLinks"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/link_executionLinks', ['link_executionLinks_trNthChild': data['link_executionLinks_trNthChild'], 'link_executionLinks_internalRoleLinkName': data['link_executionLinks_internalRoleLinkName']]))
        
        "Step 6: Click on input SearchTestRun"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/input_SearchTestRun'))
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        data['div_executionDetails_internalText'] = testData.getValue('div_executionDetails_internalText', rowIndex)
        data['link_executionLinks_internalRoleLinkName'] = testData.getValue('link_executionLinks_internalRoleLinkName', rowIndex)
        data['link_executionLinks_trNthChild'] = testData.getValue('link_executionLinks_trNthChild', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['div_executionDetails_internalText'] = 'default_data'
        data['link_executionLinks_internalRoleLinkName'] = 'default_data'
        data['link_executionLinks_trNthChild'] = 'default_data'
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

