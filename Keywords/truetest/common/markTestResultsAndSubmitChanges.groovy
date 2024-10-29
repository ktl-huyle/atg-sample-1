package truetest.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

public class markTestResultsAndSubmitChanges {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Click on button ExternalLink11"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_display_single_item_fixed_part_item_id_or_slug_fixed_part_item/button_ExternalLink11'))
        
        "Step 2: Click on button ExternalLink12"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_display_single_item_fixed_part_item_id_or_slug_fixed_part_item/button_ExternalLink12'))
        
        "Step 3: Click on button ExternalLink13 -> Navigate to page 'display single item:/{fixed part}/{item id or slug}/{fixed part}/{item id or slug}/{fixed part}/{item id or slug}/{fixed part}/{item id or slug}'"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_display_single_item_fixed_part_item_id_or_slug_fixed_part_item/button_ExternalLink13'))
        
        "Step 4: Click on button MarkAsPassed"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_display_single_item_fixed_part_item_id_or_slug_fixed_part_item/button_MarkAsPassed'))
        
        "Step 5: Click on label ChangeTestResultStatus"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_display_single_item_fixed_part_item_id_or_slug_fixed_part_item/label_ChangeTestResultStatus'))
        
        "Step 6: Click on button Submit"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_display_single_item_fixed_part_item_id_or_slug_fixed_part_item/button_Submit'))
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

