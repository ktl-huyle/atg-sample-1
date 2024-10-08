package truetest.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

public class downloadAgentAndCopyLinks {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Click on button DownloadAgent"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_test_environment_installation/button_DownloadAgent'))
        
        "Step 2: Click on link Copy"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_test_environment_installation/link_Copy'))
        
        "Step 3: Click on link Copy2"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_test_environment_installation/link_Copy2'))
        
        "Step 4: Click on link Copy3"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_test_environment_installation/link_Copy3'))
        
        "Step 5: Click on span StepConnector"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_test_environment_installation/span_StepConnector'))
        
        "Step 6: Click on link Copy3"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_test_environment_installation/link_Copy3'))
        
        "Step 7: Click on link Copy4"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_test_environment_installation/link_Copy4'))
        
        "Step 8: Click on link TestEnvironments2"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_test_environment_installation/link_TestEnvironments2'))
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

