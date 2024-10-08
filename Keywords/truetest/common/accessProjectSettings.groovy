package truetest.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import internal.GlobalVariable

public class accessProjectSettings {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Click on link organizationLinks (OJOracleJDE2) -> Navigate to page 'team/*/project/*'"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/link_organizationLinks_2"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/link_organizationLinks_2', ['link_organizationLinks_internalRoleLinkName': data['link_organizationLinks_internalRoleLinkName'], 'link_organizationLinks_project_id': data['link_organizationLinks_project_id'], 'link_organizationLinks_team_id': data['link_organizationLinks_team_id']]))
        
        "Step 2: Click on link Settings6 -> Navigate to page 'team/*/project/*/*'"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Settings5'))
        
        "Step 3: Click on link projectLinks (ScriptRepositories2)"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_projectLinks"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_projectLinks', ['link_projectLinks_nthChild': data['link_projectLinks_nthChild'], 'link_projectLinks_internalRoleLinkName': data['link_projectLinks_internalRoleLinkName']]))
        
        "Step 4: Click on link externalLinks (OracleJDE) -> Navigate to page 'team/*/project/*/test-project/*'"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_externalLinks"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_externalLinks', ['link_externalLinks_trNthChild': data['link_externalLinks_trNthChild'], 'link_externalLinks_internalRoleLinkName': data['link_externalLinks_internalRoleLinkName'], 'link_externalLinks_project_id': data['link_externalLinks_project_id'], 'link_externalLinks_team_id': data['link_externalLinks_team_id'], 'link_externalLinks_test_project_id': data['link_externalLinks_test_project_id']]))
        
        "Step 5: Click on button ScheduleTestRun"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_project/button_ScheduleTestRun'))
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        data['link_externalLinks_internalRoleLinkName'] = testData.getValue('link_externalLinks_internalRoleLinkName', rowIndex)
        data['link_externalLinks_project_id'] = testData.getValue('link_externalLinks_project_id', rowIndex)
        data['link_externalLinks_team_id'] = testData.getValue('link_externalLinks_team_id', rowIndex)
        data['link_externalLinks_test_project_id'] = testData.getValue('link_externalLinks_test_project_id', rowIndex)
        data['link_externalLinks_trNthChild'] = testData.getValue('link_externalLinks_trNthChild', rowIndex)
        data['link_organizationLinks_internalRoleLinkName'] = testData.getValue('link_organizationLinks_internalRoleLinkName', rowIndex)
        data['link_organizationLinks_project_id'] = testData.getValue('link_organizationLinks_project_id', rowIndex)
        data['link_organizationLinks_team_id'] = testData.getValue('link_organizationLinks_team_id', rowIndex)
        data['link_projectLinks_internalRoleLinkName'] = testData.getValue('link_projectLinks_internalRoleLinkName', rowIndex)
        data['link_projectLinks_nthChild'] = testData.getValue('link_projectLinks_nthChild', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['link_externalLinks_internalRoleLinkName'] = 'default_data'
        data['link_externalLinks_project_id'] = 'default_data'
        data['link_externalLinks_team_id'] = 'default_data'
        data['link_externalLinks_test_project_id'] = 'default_data'
        data['link_externalLinks_trNthChild'] = 'default_data'
        data['link_organizationLinks_internalRoleLinkName'] = 'default_data'
        data['link_organizationLinks_project_id'] = 'default_data'
        data['link_organizationLinks_team_id'] = 'default_data'
        data['link_projectLinks_internalRoleLinkName'] = 'default_data'
        data['link_projectLinks_nthChild'] = 'default_data'
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

