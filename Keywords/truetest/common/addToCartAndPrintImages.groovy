package truetest.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

public class addToCartAndPrintImages {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Click on link AddToCart510"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_AddToCart510'))
        
        "Step 2: Click on link GoToCart -> Navigate to page '/AjaxOrderItemDisplayView'"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_GoToCart'))
        
        "Step 3: Click on link Print137"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_AjaxOrderItemDisplayView/link_Print137'))
        
        "Step 4: Click on input PrintWithImages"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_AjaxOrderItemDisplayView/input_PrintWithImages'))
        
        "Step 5: Click on link Print2"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_AjaxOrderItemDisplayView/link_Print2'))
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

