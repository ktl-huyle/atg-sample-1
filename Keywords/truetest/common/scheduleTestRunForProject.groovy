package truetest.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

public class scheduleTestRunForProject {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Click on link projectLinks (OJOracleJDE) -> Navigate to page 'team/*/project/*'"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/link_projectLinks"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/link_projectLinks', ['link_projectLinks_internalRoleLinkName': data['link_projectLinks_internalRoleLinkName'], 'project_id': data['project_id'], 'team_id': data['team_id']]))
        
        "Step 2: Click on link Settings3 -> Navigate to page 'team/*/project/*/*'"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Settings3'))
        
        "Step 3: Click on link testResources (ScriptRepositories3)"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_testResources"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_testResources', ['link_testResources_nthChild': data['link_testResources_nthChild'], 'link_testResources_internalRoleLinkName': data['link_testResources_internalRoleLinkName']]))
        
        "Step 4: Click on link projectLinks (OracleJDE) -> Navigate to page 'team/*/project/*/test-project/*'"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_projectLinks"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_projectLinks', ['link_projectLinks_trNthChild': data['link_projectLinks_trNthChild'], 'link_projectLinks_internalRoleLinkName': data['link_projectLinks_internalRoleLinkName_1'], 'test_project_id': data['test_project_id'], 'project_id': data['project_id_1'], 'team_id': data['team_id_1']]))
        
        "Step 5: Click on button ScheduleTestRun2"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_project/button_ScheduleTestRun2'))
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        data['link_projectLinks_internalRoleLinkName'] = testData.getValue('link_projectLinks_internalRoleLinkName', rowIndex)
        data['link_projectLinks_internalRoleLinkName_1'] = testData.getValue('link_projectLinks_internalRoleLinkName_1', rowIndex)
        data['link_projectLinks_trNthChild'] = testData.getValue('link_projectLinks_trNthChild', rowIndex)
        data['link_testResources_internalRoleLinkName'] = testData.getValue('link_testResources_internalRoleLinkName', rowIndex)
        data['link_testResources_nthChild'] = testData.getValue('link_testResources_nthChild', rowIndex)
        data['project_id'] = testData.getValue('project_id', rowIndex)
        data['project_id_1'] = testData.getValue('project_id_1', rowIndex)
        data['team_id'] = testData.getValue('team_id', rowIndex)
        data['team_id_1'] = testData.getValue('team_id_1', rowIndex)
        data['test_project_id'] = testData.getValue('test_project_id', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['link_projectLinks_internalRoleLinkName'] = 'default_data'
        data['link_projectLinks_internalRoleLinkName_1'] = 'default_data'
        data['link_projectLinks_trNthChild'] = 'default_data'
        data['link_testResources_internalRoleLinkName'] = 'default_data'
        data['link_testResources_nthChild'] = 'default_data'
        data['project_id'] = 'default_data'
        data['project_id_1'] = 'default_data'
        data['team_id'] = 'default_data'
        data['team_id_1'] = 'default_data'
        data['test_project_id'] = 'default_data'
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

