package katalon.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

public class createGitConnectionWithCredentials {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Click on input repositoryUrl"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_test_environment_installation/input_repositoryUrl'))
        
        "Step 2: Click on input username"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_test_environment_installation/input_username'))
        
        "Step 3: Click on input username"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_test_environment_installation/input_username'))
        
        "Step 4: Click on input object"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_settings_test_environment_installation/input_object'))
        
        "Step 5: Click on input object"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_organization_settings_test_environment_installation/input_object'))
        
        "Step 6: Click on button createNewGitConnect"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_test_environment_installation/button_createNewGitConnect'))
        
        "Step 7: Click on button createNewGitConnect"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_test_environment_installation/button_createNewGitConnect'))
        
        "Step 8: Click on input enterName"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_organization_settings_test_environment_installation/input_enterName'))
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

