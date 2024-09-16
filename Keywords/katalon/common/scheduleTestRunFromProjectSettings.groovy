package katalon.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import internal.GlobalVariable

public class scheduleTestRunFromProjectSettings {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Click on link fpFirstProject -> Navigate to page 'team/*/project/*'"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/link_fpFirstProject"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/link_fpFirstProject', ['link_fpFirstProject_internalRoleLinkName': data['link_fpFirstProject_internalRoleLinkName'], 'link_fpFirstProject_team_id': data['link_fpFirstProject_team_id'], 'link_fpFirstProject_project_id': data['link_fpFirstProject_project_id']]))
        
        "Step 2: Click on link settings2 -> Navigate to page 'team/*/project/*/*'"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_settings2'))
        
        "Step 3: Click on link scriptRepositories"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_scriptRepositories"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_scriptRepositories', ['link_scriptRepositories_nthChild': data['link_scriptRepositories_nthChild'], 'link_scriptRepositories_internalRoleLinkName': data['link_scriptRepositories_internalRoleLinkName']]))
        
        "Step 4: Click on link oracleJde -> Navigate to page 'team/*/project/*/test-project/*'"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_oracleJde"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_oracleJde', ['link_oracleJde_trNthChild': data['link_oracleJde_trNthChild'], 'link_oracleJde_internalRoleLinkName': data['link_oracleJde_internalRoleLinkName'], 'link_oracleJde_test_project_id': data['link_oracleJde_test_project_id'], 'link_oracleJde_project_id': data['link_oracleJde_project_id'], 'link_oracleJde_team_id': data['link_oracleJde_team_id']]))
        
        "Step 5: Click on button scheduleTestRun"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_project/button_scheduleTestRun'))
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        data['link_fpFirstProject_internalRoleLinkName'] = testData.getValue('link_fpFirstProject_internalRoleLinkName', rowIndex)
        data['link_fpFirstProject_project_id'] = testData.getValue('link_fpFirstProject_project_id', rowIndex)
        data['link_fpFirstProject_team_id'] = testData.getValue('link_fpFirstProject_team_id', rowIndex)
        data['link_oracleJde_internalRoleLinkName'] = testData.getValue('link_oracleJde_internalRoleLinkName', rowIndex)
        data['link_oracleJde_project_id'] = testData.getValue('link_oracleJde_project_id', rowIndex)
        data['link_oracleJde_team_id'] = testData.getValue('link_oracleJde_team_id', rowIndex)
        data['link_oracleJde_test_project_id'] = testData.getValue('link_oracleJde_test_project_id', rowIndex)
        data['link_oracleJde_trNthChild'] = testData.getValue('link_oracleJde_trNthChild', rowIndex)
        data['link_scriptRepositories_internalRoleLinkName'] = testData.getValue('link_scriptRepositories_internalRoleLinkName', rowIndex)
        data['link_scriptRepositories_nthChild'] = testData.getValue('link_scriptRepositories_nthChild', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['link_fpFirstProject_internalRoleLinkName'] = 'default_data'
        data['link_fpFirstProject_project_id'] = 'default_data'
        data['link_fpFirstProject_team_id'] = 'default_data'
        data['link_oracleJde_internalRoleLinkName'] = 'default_data'
        data['link_oracleJde_project_id'] = 'default_data'
        data['link_oracleJde_team_id'] = 'default_data'
        data['link_oracleJde_test_project_id'] = 'default_data'
        data['link_oracleJde_trNthChild'] = 'default_data'
        data['link_scriptRepositories_internalRoleLinkName'] = 'default_data'
        data['link_scriptRepositories_nthChild'] = 'default_data'
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

