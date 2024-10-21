package truetest.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import internal.GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

public class setupAndDownloadTunnel {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Click on link TestCloudTunnels2 -> Navigate to page '/team/*/project/*/testCloudTunnel'"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_settings/link_TestCloudTunnels2'))
        
        "Step 2: Click on button tunnelSetup (Setup)"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_testCloudTunnel/button_tunnelSetup"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_testCloudTunnel/button_tunnelSetup', ['button_tunnelSetup_internalRoleTabName': data['button_tunnelSetup_internalRoleTabName']]))
        
        "Step 3: Click on button Download"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_testCloudTunnel/button_Download'))
        
        "Step 4: Click on div ApiKeyIcon"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_testCloudTunnel/div_ApiKeyIcon'))
        
        "Step 5: Click on div ApiKeyIcon"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_testCloudTunnel/div_ApiKeyIcon'))
        
        "Step 6: Click on link Settings"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_testCloudTunnel/link_Settings'))
        
        "Step 7: Click on span KtConfig"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_testCloudTunnel/span_KtConfig'))
        
        "Step 8: Click on pre KtStartCommand"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_testCloudTunnel/pre_KtStartCommand'))
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        data['button_tunnelSetup_internalRoleTabName'] = testData.getValue('button_tunnelSetup_internalRoleTabName', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['button_tunnelSetup_internalRoleTabName'] = 'default_data'
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

