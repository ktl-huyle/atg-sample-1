package katalon.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

public class addSauceLabsProductsAndProceedToCheckout {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Click on button addToCartSauceLabsBikeLight"
        
        WebUI.enhancedClick(findTestObject('Page_inventory_html/button_object_2'))
        
        "Step 2: Click on button addToCartSauceLabsBackpack"
        
        WebUI.enhancedClick(findTestObject('Page_inventory_html/button_add_to_cart_sauce_labs_backpack_1'))
        
        "Step 3: Click on link object -> Navigate to page '/cart.html'"
        
        WebUI.enhancedClick(findTestObject('Page_inventory_html/hyperlink_object_1'))
        
        "Step 4: Click on button checkout -> Navigate to page '/checkout-step-one.html'"
        
        WebUI.enhancedClick(findTestObject('Page_cart_html/button_object'))
        
        "Step 5: Click on input firstName"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_step_one_html/input_firstName'))
        
        "Step 6: Enter input value in input firstName"
        
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_step_one_html/input_firstName'), data['var_1_input_firstName'])
        
        "Step 7: Click on input lastName"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_step_one_html/input_lastName'))
        
        "Step 8: Enter input value in input lastName"
        
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_step_one_html/input_lastName'), data['var_2_input_lastName'])
        
        "Step 9: Click on input postalCode"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_step_one_html/input_postalCode'))
        
        "Step 10: Enter input value in input postalCode"
        
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_step_one_html/input_postalCode'), data['var_3_input_postalCode'])
        
        "Step 11: Click on input continue"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_step_one_html/input_continue'))
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        data['var_3_input_postalCode'] = testData.getValue('var_3_input_postalCode', rowIndex)
        data['var_1_input_firstName'] = testData.getValue('var_1_input_firstName', rowIndex)
        data['var_2_input_lastName'] = testData.getValue('var_2_input_lastName', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['var_3_input_postalCode'] = 'default_data'
        data['var_1_input_firstName'] = 'default_data'
        data['var_2_input_lastName'] = 'default_data'
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

