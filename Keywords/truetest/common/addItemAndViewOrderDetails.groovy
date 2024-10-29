package truetest.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

public class addItemAndViewOrderDetails {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Click on link AddToCart57"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_AddToCart57'))
        
        "Step 2: Click on link GoToCart -> Navigate to page '/AjaxOrderItemDisplayView'"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_GoToCart'))
        
        "Step 3: Click on input quantity"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_AjaxOrderItemDisplayView/input_quantity'))
        
        "Step 4: Enter input value in input quantity"
        
        WebUI.setText(findTestObject('AI-Generated/Page_AjaxOrderItemDisplayView/input_quantity'), data['input_quantity'])
        
        "Step 5: Click on div orderItemDetails"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_AjaxOrderItemDisplayView/div_orderItemDetails'))
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        data['input_quantity'] = testData.getValue('input_quantity', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['input_quantity'] = 'default_data'
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

