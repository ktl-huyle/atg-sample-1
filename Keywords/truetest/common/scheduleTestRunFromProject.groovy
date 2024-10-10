package truetest.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable

public class scheduleTestRunFromProject {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Click on link projectItems (OJOracleJDE) -> Navigate to page 'team/*/project/*'"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_organization_home/link_projectItems"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_home/link_projectItems', ['link_projectItems_internalRoleLinkName': data['link_projectItems_internalRoleLinkName'], 'link_projectItems_team_id': data['link_projectItems_team_id'], 'link_projectItems_project_id': data['link_projectItems_project_id']]))
        
        "Step 2: Click on link Settings2 -> Navigate to page 'team/*/project/*/*'"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Settings2'))
        
        "Step 3: Click on link projectNavigation (ScriptRepositories2)"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_projectNavigation"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_projectNavigation', ['link_projectNavigation_nthChild': data['link_projectNavigation_nthChild'], 'link_projectNavigation_internalRoleLinkName': data['link_projectNavigation_internalRoleLinkName']]))
        
        "Step 4: Click on link additionalLinks (OracleJDE) -> Navigate to page 'team/*/project/*/test-project/*'"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project/link_additionalLinks"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project/link_additionalLinks', ['link_additionalLinks_trNthChild': data['link_additionalLinks_trNthChild'], 'link_additionalLinks_internalRoleLinkName': data['link_additionalLinks_internalRoleLinkName'], 'link_additionalLinks_project_id': data['link_additionalLinks_project_id'], 'link_additionalLinks_team_id': data['link_additionalLinks_team_id'], 'link_additionalLinks_test_project_id': data['link_additionalLinks_test_project_id']]))
        
        "Step 5: Click on button ScheduleTestRun"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_project/button_ScheduleTestRun'))
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        data['link_additionalLinks_internalRoleLinkName'] = testData.getValue('link_additionalLinks_internalRoleLinkName', rowIndex)
        data['link_additionalLinks_project_id'] = testData.getValue('link_additionalLinks_project_id', rowIndex)
        data['link_additionalLinks_team_id'] = testData.getValue('link_additionalLinks_team_id', rowIndex)
        data['link_additionalLinks_test_project_id'] = testData.getValue('link_additionalLinks_test_project_id', rowIndex)
        data['link_additionalLinks_trNthChild'] = testData.getValue('link_additionalLinks_trNthChild', rowIndex)
        data['link_projectItems_internalRoleLinkName'] = testData.getValue('link_projectItems_internalRoleLinkName', rowIndex)
        data['link_projectItems_project_id'] = testData.getValue('link_projectItems_project_id', rowIndex)
        data['link_projectItems_team_id'] = testData.getValue('link_projectItems_team_id', rowIndex)
        data['link_projectNavigation_internalRoleLinkName'] = testData.getValue('link_projectNavigation_internalRoleLinkName', rowIndex)
        data['link_projectNavigation_nthChild'] = testData.getValue('link_projectNavigation_nthChild', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['link_additionalLinks_internalRoleLinkName'] = 'default_data'
        data['link_additionalLinks_project_id'] = 'default_data'
        data['link_additionalLinks_team_id'] = 'default_data'
        data['link_additionalLinks_test_project_id'] = 'default_data'
        data['link_additionalLinks_trNthChild'] = 'default_data'
        data['link_projectItems_internalRoleLinkName'] = 'default_data'
        data['link_projectItems_project_id'] = 'default_data'
        data['link_projectItems_team_id'] = 'default_data'
        data['link_projectNavigation_internalRoleLinkName'] = 'default_data'
        data['link_projectNavigation_nthChild'] = 'default_data'
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

