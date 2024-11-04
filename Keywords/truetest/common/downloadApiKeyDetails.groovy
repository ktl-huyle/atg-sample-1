package truetest.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

public class downloadApiKeyDetails {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Click on button Download"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/button_Download'))
        
        "Step 2: Click on div ApiKey"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_ApiKey'))
        
        "Step 3: Click on div ApiKey"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/div_ApiKey'))
        
        "Step 4: Click on link Settings9"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/link_Settings9'))
        
        "Step 5: Click on span ConfigCommand"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/span_ConfigCommand'))
        
        "Step 6: Click on pre KtStart"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project/pre_KtStart'))
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

