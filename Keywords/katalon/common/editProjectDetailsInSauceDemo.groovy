package katalon.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

public class editProjectDetailsInSauceDemo {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Click on button object -> Navigate to page 'team/*/project/*/test-project/*'"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_git_test_project_setup/button_object'))
        
        "Step 2: Click on link scriptRepositories -> Navigate to page 'team/*/project/*/test-project'"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_project/link_scriptRepositories'))
        
        "Step 3: Click on link katalonDemoProject -> Navigate to page 'team/*/project/*/test-project/*'"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_project/link_katalonDemoProject'))
        
        "Step 4: Click on button edit -> Navigate to page 'team/*/project/*/test-project/*/git/edit'"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_project/button_edit'))
        
        "Step 5: Enter input value in textarea description"
        
        WebUI.setText(findTestObject('AI-Generated/Page_team_project_test_project_git_edit/textarea_description'), data['textarea_description'])
        
        "Step 6: Click on button save"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_project_git_edit/button_save'))
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        data['textarea_description'] = testData.getValue('textarea_description', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['textarea_description'] = 'default_data'
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

