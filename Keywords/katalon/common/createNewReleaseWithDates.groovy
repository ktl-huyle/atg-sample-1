package katalon.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

public class createNewReleaseWithDates {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Click on link createRelease -> Navigate to page 'team/*/project/*/releases/create'"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_releases/link_createRelease'))
        
        "Step 2: Click on input name"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_releases_create/input_name'))
        
        "Step 3: Enter input value in input name"
        
        WebUI.setText(findTestObject('AI-Generated/Page_team_project_releases_create/input_name'), data['input_name'])
        
        "Step 4: Click on input startTime"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_releases_create/input_startTime'))
        
        "Step 5: Click on button chooseDate"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_releases_create/button_chooseDate'))
        
        "Step 6: Click on button aug22"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_releases_create/button_aug22'))
        
        "Step 7: Click on input endTime"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_releases_create/input_endTime'))
        
        "Step 8: Click on button chooseDate2"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_releases_create/button_chooseDate2'))
        
        "Step 9: Click on button aug22"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_releases_create/button_aug22'))
        
        "Step 10: Click on button create"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_releases_create/button_create'))
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

