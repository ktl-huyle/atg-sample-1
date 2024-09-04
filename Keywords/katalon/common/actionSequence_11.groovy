package katalon.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

public class actionSequence_11 {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Click on link createRelease -> Navigate to page 'team/*/project/*/releases/*'"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_releases/link_createRelease'))
        
        "Step 2: Click on input name"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_releases/input_name'))
        
        "Step 3: Enter input value in input name"
        
        WebUI.setText(findTestObject('AI-Generated/Page_team_project_releases/input_name'), data['input_name'])
        
        "Step 4: Click on input starttime"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_releases/input_starttime'))
        
        "Step 5: Click on button object"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_releases/button_object'))
        
        "Step 6: Click on button object2"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_releases/button_object2'))
        
        "Step 7: Click on input endtime"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_releases/input_endtime'))
        
        "Step 8: Click on button object3"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_releases/button_object3'))
        
        "Step 9: Click on button object2"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_releases/button_object2'))
        
        "Step 10: Click on button create"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_releases/button_create'))
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        data['input_name'] = testData.getValue('input_name', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['input_name'] = 'default_data'
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

