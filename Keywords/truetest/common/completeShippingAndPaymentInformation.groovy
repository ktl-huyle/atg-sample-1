package truetest.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

public class completeShippingAndPaymentInformation {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Click on button NextStep"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/button_NextStep'))
        
        "Step 2: Enter input value in input FullName"
        
        WebUI.setText(findTestObject('AI-Generated/Page_checkout/input_FullName'), data['input_FullName'])
        
        "Step 3: Enter input value in input Email"
        
        WebUI.setText(findTestObject('AI-Generated/Page_checkout/input_Email'), data['input_Email_1'])
        
        "Step 4: Enter input value in input ShippingAddress"
        
        WebUI.setText(findTestObject('AI-Generated/Page_checkout/input_ShippingAddress'), data['input_ShippingAddress'])
        
        "Step 5: Enter input value in input PhoneNumber"
        
        WebUI.setText(findTestObject('AI-Generated/Page_checkout/input_PhoneNumber'), data['input_PhoneNumber'])
        
        "Step 6: Click on header ShippingOption"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/header_ShippingOption'))
        
        "Step 7: Click on input ShippingOption"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/input_ShippingOption'))
        
        "Step 8: Click on button NextStep2"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/button_NextStep2'))
        
        "Step 9: Click on div PaymentMethod"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/div_PaymentMethod'))
        
        "Step 10: Click on input CreditCard"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/input_CreditCard'))
        
        "Step 11: Enter input value in input NameOnCard"
        
        WebUI.setText(findTestObject('AI-Generated/Page_checkout/input_NameOnCard'), data['input_NameOnCard'])
        
        "Step 12: Enter input value in input CardNumber"
        
        WebUI.setText(findTestObject('AI-Generated/Page_checkout/input_CardNumber'), data['input_CardNumber'])
        
        "Step 13: Enter input value in input CCV"
        
        WebUI.setText(findTestObject('AI-Generated/Page_checkout/input_CCV'), data['input_CCV'])
        
        "Step 14: Click on button Confirm"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/button_Confirm'))
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        data['input_CCV'] = testData.getValue('input_CCV', rowIndex)
        data['input_CardNumber'] = testData.getValue('input_CardNumber', rowIndex)
        data['input_Email_1'] = testData.getValue('input_Email_1', rowIndex)
        data['input_FullName'] = testData.getValue('input_FullName', rowIndex)
        data['input_NameOnCard'] = testData.getValue('input_NameOnCard', rowIndex)
        data['input_PhoneNumber'] = testData.getValue('input_PhoneNumber', rowIndex)
        data['input_ShippingAddress'] = testData.getValue('input_ShippingAddress', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['input_CCV'] = 'default_data'
        data['input_CardNumber'] = 'default_data'
        data['input_Email_1'] = 'default_data'
        data['input_FullName'] = 'default_data'
        data['input_NameOnCard'] = 'default_data'
        data['input_PhoneNumber'] = 'default_data'
        data['input_ShippingAddress'] = 'default_data'
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

