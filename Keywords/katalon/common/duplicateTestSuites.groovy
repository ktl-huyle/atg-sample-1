package katalon.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

public class duplicateTestSuites {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Click on div object"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_suites/div_object'))
        
        "Step 2: Click on div object"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_suites/div_object_1'))
        
        "Step 3: Click on div object"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_suites/div_object_2'))
        
        "Step 4: Click on input selectTestSuite944954"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_suites/input_selectTestSuite944954'))
        
        "Step 5: Click on input selectTestSuite944953"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_suites/input_selectTestSuite944953'))
        
        "Step 6: Click on button duplicate"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_design_test_suites/button_duplicate'))
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

