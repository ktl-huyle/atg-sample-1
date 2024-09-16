package katalon.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

public class downloadTestExecutionData {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Click on button download"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_download'))
        
        "Step 2: Click on div object63"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_object63'))
        
        "Step 3: Click on div object63"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_object63'))
        
        "Step 4: Click on link settings2"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_settings2'))
        
        "Step 5: Click on span object"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/span_object'))
        
        "Step 6: Click on pre object2"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/pre_object2'))
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

