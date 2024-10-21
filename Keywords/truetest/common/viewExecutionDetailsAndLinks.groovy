package truetest.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import internal.GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

public class viewExecutionDetailsAndLinks {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Click on button CustomFields"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_CustomFields'))
        
        "Step 2: Click on div executionDetails (ExecutionDetails)"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/div_executionDetails"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/div_executionDetails', ['div_executionDetails_internalText': data['div_executionDetails_internalText']]))
        
        "Step 3: Click on button testSuiteActions (ElapsedDuration)"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/button_testSuiteActions"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/button_testSuiteActions', ['button_testSuiteActions_trNthChild': data['button_testSuiteActions_trNthChild'], 'button_testSuiteActions_internalRoleRowName': data['button_testSuiteActions_internalRoleRowName']]))
        
        "Step 4: Click on link executionLinks (ExecutionLink)"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/link_executionLinks"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/link_executionLinks', ['link_executionLinks_trNthChild': data['link_executionLinks_trNthChild'], 'link_executionLinks_internalRoleLinkName': data['link_executionLinks_internalRoleLinkName']]))
        
        "Step 5: Click on input SearchTestRun"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/input_SearchTestRun'))
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        data['button_testSuiteActions_internalRoleRowName'] = testData.getValue('button_testSuiteActions_internalRoleRowName', rowIndex)
        data['button_testSuiteActions_trNthChild'] = testData.getValue('button_testSuiteActions_trNthChild', rowIndex)
        data['div_executionDetails_internalText'] = testData.getValue('div_executionDetails_internalText', rowIndex)
        data['link_executionLinks_internalRoleLinkName'] = testData.getValue('link_executionLinks_internalRoleLinkName', rowIndex)
        data['link_executionLinks_trNthChild'] = testData.getValue('link_executionLinks_trNthChild', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['button_testSuiteActions_internalRoleRowName'] = 'default_data'
        data['button_testSuiteActions_trNthChild'] = 'default_data'
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

