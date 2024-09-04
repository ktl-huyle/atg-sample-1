package katalon.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

public class actionSequence_4 {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Click on link testcloudTunnels2 -> Navigate to page 'team/*/project/*/testCloudTunnel'"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_settings/link_testcloudTunnels2'))
        
        "Step 2: Click on button setupTunnels2"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_testCloudTunnel/button_setupTunnels2'))
        
        "Step 3: Click on div object"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_testCloudTunnel/div_object'))
        
        "Step 4: Click on div object"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_testCloudTunnel/div_object'))
        
        "Step 5: Click on link here"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_testCloudTunnel/link_here'))
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

