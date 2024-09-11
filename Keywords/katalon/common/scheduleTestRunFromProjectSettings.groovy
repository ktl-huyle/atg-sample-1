package katalon.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

public class scheduleTestRunFromProjectSettings {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Click on link fpFirstProject -> Navigate to page 'team/*/project/*'"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_home/link_fpFirstProject'))
        
        "Step 2: Click on link settings -> Navigate to page 'team/*/project/*/settings'"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_settings'))
        
        "Step 3: Click on link scriptRepositories -> Navigate to page 'team/*/project/*/test-project'"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_settings/link_scriptRepositories'))
        
        "Step 4: Click on link katalonWebsiteGit -> Navigate to page 'team/*/project/*/test-project/*'"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_project/link_katalonWebsiteGit'))
        
        "Step 5: Click on button scheduleTestRun"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_project/button_scheduleTestRun'))
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        
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

