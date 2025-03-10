package truetest.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

public class initiateOrderAndProceedToCheckout {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Click on button Buy"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/button_Buy'))
        
        "Step 2: Click on link PlaceAnOrder -> Navigate to page 'cart#cart'"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/link_PlaceAnOrder'))
        
        "Step 3: Click on button ProceedToCheckout -> Navigate to page 'info checkout#checkout/info'"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/button_ProceedToCheckout'))
        
        "Step 4: Click on input Email"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_info_checkout/input_Email'))
        
        "Step 5: Enter input value in input Email"
        
        WebUI.setText(findTestObject('AI-Generated/Page_info_checkout/input_Email'), data['input_Email'])
        
        "Step 6: Click on button ContinueToShipping"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_info_checkout/button_ContinueToShipping'))
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        data['input_Email'] = testData.getValue('input_Email', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['input_Email'] = 'default_data'
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

