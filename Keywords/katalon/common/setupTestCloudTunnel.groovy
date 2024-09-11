package katalon.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

public class setupTestCloudTunnel {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Click on link testCloudTunnels2 -> Navigate to page 'team/*/project/*/testCloudTunnel'"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_settings/link_testCloudTunnels2'))
        
        "Step 2: Click on button setup2"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_testCloudTunnel/button_setup2'))
        
        "Step 3: Click on button download"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_testCloudTunnel/button_download'))
        
        "Step 4: Click on div apiKeySvgNth1"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_testCloudTunnel/div_apiKeySvgNth1'))
        
        "Step 5: Click on div apiKeySvgNth1"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_testCloudTunnel/div_apiKeySvgNth1'))
        
        "Step 6: Click on link testCloudTunnel"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_testCloudTunnel/link_testCloudTunnel'))
        
        "Step 7: Click on span object"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_testCloudTunnel/span_object'))
        
        "Step 8: Click on pre ktStart"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_testCloudTunnel/pre_ktStart'))
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

