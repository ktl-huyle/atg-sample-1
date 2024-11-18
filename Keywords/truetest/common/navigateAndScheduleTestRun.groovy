package truetest.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable

public class navigateAndScheduleTestRun {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Click on link testCases (ojOracleJdeThereIsNoDataToDisplay) -> Navigate to page 'team/*/project/*'"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/link_testCases"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/link_testCases', ['link_testCases_internalRoleLinkName': data['link_testCases_internalRoleLinkName'], 'link_testCases_team_id': data['link_testCases_team_id'], 'link_testCases_project_id': data['link_testCases_project_id']]))
        
        "Step 2: Click on link settings -> Navigate to page 'team/*/project/*/settings'"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_settings'))
        
        "Step 3: Click on link scriptRepositories5 -> Navigate to page 'team/*/project/*/test-project'"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_settings/link_scriptRepositories5'))
        
        "Step 4: Click on link teamProjectTestProject (teamProjectTestProject2) -> Navigate to page 'team/*/project/*/test-project/*'"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_project/link_teamProjectTestProject"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_project/link_teamProjectTestProject', ['link_teamProjectTestProject_trNthChild': data['link_teamProjectTestProject_trNthChild'], 'link_teamProjectTestProject_internalRoleLinkName': data['link_teamProjectTestProject_internalRoleLinkName'], 'link_teamProjectTestProject_project_id': data['link_teamProjectTestProject_project_id'], 'link_teamProjectTestProject_test_project_id': data['link_teamProjectTestProject_test_project_id'], 'link_teamProjectTestProject_team_id': data['link_teamProjectTestProject_team_id']]))
        
        "Step 5: Click on button scheduleTestRun2"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_project/button_scheduleTestRun2'))
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        data['link_teamProjectTestProject_internalRoleLinkName'] = testData.getValue('link_teamProjectTestProject_internalRoleLinkName', rowIndex)
        data['link_teamProjectTestProject_project_id'] = testData.getValue('link_teamProjectTestProject_project_id', rowIndex)
        data['link_teamProjectTestProject_team_id'] = testData.getValue('link_teamProjectTestProject_team_id', rowIndex)
        data['link_teamProjectTestProject_test_project_id'] = testData.getValue('link_teamProjectTestProject_test_project_id', rowIndex)
        data['link_teamProjectTestProject_trNthChild'] = testData.getValue('link_teamProjectTestProject_trNthChild', rowIndex)
        data['link_testCases_internalRoleLinkName'] = testData.getValue('link_testCases_internalRoleLinkName', rowIndex)
        data['link_testCases_project_id'] = testData.getValue('link_testCases_project_id', rowIndex)
        data['link_testCases_team_id'] = testData.getValue('link_testCases_team_id', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['link_teamProjectTestProject_internalRoleLinkName'] = 'default_data'
        data['link_teamProjectTestProject_project_id'] = 'default_data'
        data['link_teamProjectTestProject_team_id'] = 'default_data'
        data['link_teamProjectTestProject_test_project_id'] = 'default_data'
        data['link_teamProjectTestProject_trNthChild'] = 'default_data'
        data['link_testCases_internalRoleLinkName'] = 'default_data'
        data['link_testCases_project_id'] = 'default_data'
        data['link_testCases_team_id'] = 'default_data'
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

