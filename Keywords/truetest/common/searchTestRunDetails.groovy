package truetest.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

public class searchTestRunDetails {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Click on button CustomFields"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_CustomFields'))
        
        "Step 2: Click on div TestOptions"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_TestOptions'))
        
        "Step 3: Click on button testSuiteResults (Row591)"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/button_testSuiteResults"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/button_testSuiteResults', ['button_testSuiteResults_trNthChild': data['button_testSuiteResults_trNthChild'], 'button_testSuiteResults_internalRoleRowName': data['button_testSuiteResults_internalRoleRowName']]))
        
        "Step 4: Click on link testRunDetails (Execution591)"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_testRunDetails"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_testRunDetails', ['link_testRunDetails_trNthChild': data['link_testRunDetails_trNthChild'], 'link_testRunDetails_internalRoleLinkName': data['link_testRunDetails_internalRoleLinkName'], 'link_testRunDetails_project_id': data['link_testRunDetails_project_id'], 'link_testRunDetails_team_id': data['link_testRunDetails_team_id'], 'link_testRunDetails_executions_id': data['link_testRunDetails_executions_id']]))
        
        "Step 5: Click on input SearchTestRun"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/input_SearchTestRun'))
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        data['button_testSuiteResults_internalRoleRowName'] = testData.getValue('button_testSuiteResults_internalRoleRowName', rowIndex)
        data['button_testSuiteResults_trNthChild'] = testData.getValue('button_testSuiteResults_trNthChild', rowIndex)
        data['link_testRunDetails_executions_id'] = testData.getValue('link_testRunDetails_executions_id', rowIndex)
        data['link_testRunDetails_internalRoleLinkName'] = testData.getValue('link_testRunDetails_internalRoleLinkName', rowIndex)
        data['link_testRunDetails_project_id'] = testData.getValue('link_testRunDetails_project_id', rowIndex)
        data['link_testRunDetails_team_id'] = testData.getValue('link_testRunDetails_team_id', rowIndex)
        data['link_testRunDetails_trNthChild'] = testData.getValue('link_testRunDetails_trNthChild', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['button_testSuiteResults_internalRoleRowName'] = 'default_data'
        data['button_testSuiteResults_trNthChild'] = 'default_data'
        data['link_testRunDetails_executions_id'] = 'default_data'
        data['link_testRunDetails_internalRoleLinkName'] = 'default_data'
        data['link_testRunDetails_project_id'] = 'default_data'
        data['link_testRunDetails_team_id'] = 'default_data'
        data['link_testRunDetails_trNthChild'] = 'default_data'
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

