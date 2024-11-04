package truetest.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable

public class navigateToTestManagementSettings {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Click on link projectResources (OJOracleJDE) -> Navigate to page 'team/*/project/*'"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/link_projectResources"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/link_projectResources', ['link_projectResources_internalRoleLinkName': data['link_projectResources_internalRoleLinkName'], 'link_projectResources_project_id': data['link_projectResources_project_id'], 'link_projectResources_team_id': data['link_projectResources_team_id']]))
        
        "Step 2: Click on link Settings2 -> Navigate to page 'team/*/project/*/*'"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Settings2'))
        
        "Step 3: Click on link testManagement (ScriptRepositories2)"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_testManagement"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_testManagement', ['link_testManagement_nthChild': data['link_testManagement_nthChild'], 'link_testManagement_internalRoleLinkName': data['link_testManagement_internalRoleLinkName']]))
        
        "Step 4: Click on link integrations (OracleJDE) -> Navigate to page 'team/*/project/*/test-project/*'"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_integrations"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_integrations', ['link_integrations_trNthChild': data['link_integrations_trNthChild'], 'link_integrations_internalRoleLinkName': data['link_integrations_internalRoleLinkName'], 'link_integrations_team_id': data['link_integrations_team_id'], 'link_integrations_project_id': data['link_integrations_project_id'], 'link_integrations_test_project_id': data['link_integrations_test_project_id']]))
        
        "Step 5: Click on button ScheduleTestRun"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_project/button_ScheduleTestRun'))
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        data['link_integrations_internalRoleLinkName'] = testData.getValue('link_integrations_internalRoleLinkName', rowIndex)
        data['link_integrations_project_id'] = testData.getValue('link_integrations_project_id', rowIndex)
        data['link_integrations_team_id'] = testData.getValue('link_integrations_team_id', rowIndex)
        data['link_integrations_test_project_id'] = testData.getValue('link_integrations_test_project_id', rowIndex)
        data['link_integrations_trNthChild'] = testData.getValue('link_integrations_trNthChild', rowIndex)
        data['link_projectResources_internalRoleLinkName'] = testData.getValue('link_projectResources_internalRoleLinkName', rowIndex)
        data['link_projectResources_project_id'] = testData.getValue('link_projectResources_project_id', rowIndex)
        data['link_projectResources_team_id'] = testData.getValue('link_projectResources_team_id', rowIndex)
        data['link_testManagement_internalRoleLinkName'] = testData.getValue('link_testManagement_internalRoleLinkName', rowIndex)
        data['link_testManagement_nthChild'] = testData.getValue('link_testManagement_nthChild', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['link_integrations_internalRoleLinkName'] = 'default_data'
        data['link_integrations_project_id'] = 'default_data'
        data['link_integrations_team_id'] = 'default_data'
        data['link_integrations_test_project_id'] = 'default_data'
        data['link_integrations_trNthChild'] = 'default_data'
        data['link_projectResources_internalRoleLinkName'] = 'default_data'
        data['link_projectResources_project_id'] = 'default_data'
        data['link_projectResources_team_id'] = 'default_data'
        data['link_testManagement_internalRoleLinkName'] = 'default_data'
        data['link_testManagement_nthChild'] = 'default_data'
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

