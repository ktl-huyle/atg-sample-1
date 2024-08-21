package katalon.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

public class duplicateTestSuitesAndNavigate {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Click on input testSuite937612Checkbox"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_teamprojecttest_design_test_suites/input_testSuite937612Checkbox'))
        
        "Step 2: Click on input testSuite937611Checkbox"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_teamprojecttest_design_test_suites/input_testSuite937611Checkbox'))
        
        "Step 3: Click on button duplicate"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_teamprojecttest_design_test_suites/button_duplicate'))
        
        "Step 4: Click on link teamProjectTestDesignTestSuites"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_teamprojecttest_design_test_suites/link_teamProjectTestDesignTestSuites'))
        
        "Step 5: Click on div object"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_teamprojecttest_design_test_suites/div_object'))
        
        "Step 6: Click on div object"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_teamprojecttest_design_test_suites/div_object_1'))
        
        "Step 7: Click on div object"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_teamprojecttest_design_test_suites/div_object_2'))
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

