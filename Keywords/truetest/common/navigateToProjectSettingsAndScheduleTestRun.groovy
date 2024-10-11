package truetest.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import internal.GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

public class navigateToProjectSettingsAndScheduleTestRun {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Click on link projectNavigation (OJOracleJDE2) -> Navigate to page 'team/*/project/*'"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/link_projectNavigation"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/link_projectNavigation', ['link_projectNavigation_internalRoleLinkName': data['link_projectNavigation_internalRoleLinkName'], 'link_projectNavigation_project_id': data['link_projectNavigation_project_id'], 'link_projectNavigation_team_id': data['link_projectNavigation_team_id']]))
        
        "Step 2: Click on link Settings6 -> Navigate to page 'team/*/project/*/*'"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Settings6'))
        
        "Step 3: Click on link projectNavigation (ScriptRepositories2)"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_projectNavigation"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_projectNavigation', ['link_projectNavigation_nthChild': data['link_projectNavigation_nthChild'], 'link_projectNavigation_internalRoleLinkName': data['link_projectNavigation_internalRoleLinkName_1']]))
        
        "Step 4: Click on link dynamicObject (OracleJDE) -> Navigate to page 'team/*/project/*/test-project/*'"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_dynamicObject"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_dynamicObject', ['link_dynamicObject_trNthChild': data['link_dynamicObject_trNthChild'], 'link_dynamicObject_internalRoleLinkName': data['link_dynamicObject_internalRoleLinkName'], 'link_dynamicObject_test_project_id': data['link_dynamicObject_test_project_id'], 'link_dynamicObject_project_id': data['link_dynamicObject_project_id'], 'link_dynamicObject_team_id': data['link_dynamicObject_team_id']]))
        
        "Step 5: Click on button ScheduleTestRun"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_project/button_ScheduleTestRun'))
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        data['link_dynamicObject_internalRoleLinkName'] = testData.getValue('link_dynamicObject_internalRoleLinkName', rowIndex)
        data['link_dynamicObject_project_id'] = testData.getValue('link_dynamicObject_project_id', rowIndex)
        data['link_dynamicObject_team_id'] = testData.getValue('link_dynamicObject_team_id', rowIndex)
        data['link_dynamicObject_test_project_id'] = testData.getValue('link_dynamicObject_test_project_id', rowIndex)
        data['link_dynamicObject_trNthChild'] = testData.getValue('link_dynamicObject_trNthChild', rowIndex)
        data['link_projectNavigation_internalRoleLinkName'] = testData.getValue('link_projectNavigation_internalRoleLinkName', rowIndex)
        data['link_projectNavigation_internalRoleLinkName_1'] = testData.getValue('link_projectNavigation_internalRoleLinkName_1', rowIndex)
        data['link_projectNavigation_nthChild'] = testData.getValue('link_projectNavigation_nthChild', rowIndex)
        data['link_projectNavigation_project_id'] = testData.getValue('link_projectNavigation_project_id', rowIndex)
        data['link_projectNavigation_team_id'] = testData.getValue('link_projectNavigation_team_id', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['link_dynamicObject_internalRoleLinkName'] = 'default_data'
        data['link_dynamicObject_project_id'] = 'default_data'
        data['link_dynamicObject_team_id'] = 'default_data'
        data['link_dynamicObject_test_project_id'] = 'default_data'
        data['link_dynamicObject_trNthChild'] = 'default_data'
        data['link_projectNavigation_internalRoleLinkName'] = 'default_data'
        data['link_projectNavigation_internalRoleLinkName_1'] = 'default_data'
        data['link_projectNavigation_nthChild'] = 'default_data'
        data['link_projectNavigation_project_id'] = 'default_data'
        data['link_projectNavigation_team_id'] = 'default_data'
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

