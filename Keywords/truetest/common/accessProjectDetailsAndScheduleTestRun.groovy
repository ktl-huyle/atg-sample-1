package truetest.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import internal.GlobalVariable

public class accessProjectDetailsAndScheduleTestRun {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Click on link projectDetails (OJOracleJDE) -> Navigate to page 'team/*/project/*'"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/link_projectDetails"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/link_projectDetails', ['link_projectDetails_internalRoleLinkName': data['link_projectDetails_internalRoleLinkName'], 'team_id': data['team_id'], 'project_id': data['project_id']]))
        
        "Step 2: Click on link Settings2 -> Navigate to page 'team/*/project/*/*'"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Settings2_1'))
        
        "Step 3: Click on link dynamicObject (ScriptRepositories4)"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_dynamicObject_1"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_dynamicObject_1', ['link_dynamicObject_nthChild': data['link_dynamicObject_nthChild'], 'link_dynamicObject_internalRoleLinkName': data['link_dynamicObject_internalRoleLinkName']]))
        
        "Step 4: Click on link dynamicObject (OracleJDE) -> Navigate to page 'team/*/project/*/test-project/*'"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_dynamicObject"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_dynamicObject', ['link_dynamicObject_trNthChild': data['link_dynamicObject_trNthChild'], 'link_dynamicObject_internalRoleLinkName': data['link_dynamicObject_internalRoleLinkName_1'], 'team_id': data['team_id_1'], 'project_id': data['project_id_1'], 'test_project_id': data['test_project_id']]))
        
        "Step 5: Click on button ScheduleTestRun"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_project/button_ScheduleTestRun'))
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        data['link_dynamicObject_internalRoleLinkName'] = testData.getValue('link_dynamicObject_internalRoleLinkName', rowIndex)
        data['link_dynamicObject_internalRoleLinkName_1'] = testData.getValue('link_dynamicObject_internalRoleLinkName_1', rowIndex)
        data['link_dynamicObject_nthChild'] = testData.getValue('link_dynamicObject_nthChild', rowIndex)
        data['link_dynamicObject_trNthChild'] = testData.getValue('link_dynamicObject_trNthChild', rowIndex)
        data['link_projectDetails_internalRoleLinkName'] = testData.getValue('link_projectDetails_internalRoleLinkName', rowIndex)
        data['project_id'] = testData.getValue('project_id', rowIndex)
        data['project_id_1'] = testData.getValue('project_id_1', rowIndex)
        data['team_id'] = testData.getValue('team_id', rowIndex)
        data['team_id_1'] = testData.getValue('team_id_1', rowIndex)
        data['test_project_id'] = testData.getValue('test_project_id', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['link_dynamicObject_internalRoleLinkName'] = 'default_data'
        data['link_dynamicObject_internalRoleLinkName_1'] = 'default_data'
        data['link_dynamicObject_nthChild'] = 'default_data'
        data['link_dynamicObject_trNthChild'] = 'default_data'
        data['link_projectDetails_internalRoleLinkName'] = 'default_data'
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

