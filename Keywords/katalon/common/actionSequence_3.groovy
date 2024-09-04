package katalon.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

public class actionSequence_3 {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Click on input name"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_planning/input_name'))
        
        "Step 2: Click on input name"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_planning/input_name'))
        
        "Step 3: Enter input value in input name"
        
        WebUI.setText(findTestObject('AI-Generated/Page_team_project_test_planning/input_name'), data['input_name'])
        
        "Step 4: Click on div object13"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_planning/div_object13'))
        
        "Step 5: Click on div object14"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_planning/div_object14'))
        
        "Step 6: Click on div object15"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_planning/div_object15'))
        
        "Step 7: Click on li object2"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_planning/li_object2'))
        
        "Step 8: Click on label object"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_planning/label_object'))
        
        "Step 9: Click on div object16"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_planning/div_object16'))
        
        "Step 10: Click on div object17"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_planning/div_object17'))
        
        "Step 11: Click on input object2"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_planning/input_object2'))
        
        "Step 12: Click on input radioButtons"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_planning/input_radioButtons'))
        
        "Step 13: Click on div object18"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_planning/div_object18'))
        
        "Step 14: Click on div object19"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_planning/div_object19'))
        
        "Step 15: Click on button saveConfigureTs"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_planning/button_saveConfigureTs'))
        
        "Step 16: Click on button goToAdvanceTab"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_planning/button_goToAdvanceTab'))
        
        "Step 17: Click on div object20"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_planning/div_object20'))
        
        "Step 18: Click on div reactSelect16Option1"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_planning/div_reactSelect16Option1'))
        
        "Step 19: Click on div object21"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_planning/div_object21'))
        
        "Step 20: Enter input value in input reactSelect15Input"
        
        WebUI.setText(findTestObject('AI-Generated/Page_team_project_test_planning/input_reactSelect15Input'), data['input_reactSelect15Input'])
        
        "Step 21: Click on div object22"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_planning/div_object22'))
        
        "Step 22: Click on div object23"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_planning/div_object23'))
        
        "Step 23: Click on div object24"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_planning/div_object24'))
        
        "Step 24: Click on div object21"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_planning/div_object21'))
        
        "Step 25: Click on div object21"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_planning/div_object21'))
        
        "Step 26: Enter input value in input reactSelect15Input"
        
        WebUI.setText(findTestObject('AI-Generated/Page_team_project_test_planning/input_reactSelect15Input'), data['input_reactSelect15Input'])
        
        "Step 27: Click on div object24"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_planning/div_object24'))
        
        "Step 28: Click on div object24"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_planning/div_object24'))
        
        "Step 29: Click on button object7"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_planning/button_object7'))
        
        "Step 30: Click on button customizedButton"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_planning/button_customizedButton'))
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        data['input_name'] = testData.getValue('input_name', rowIndex)
        data['input_reactSelect15Input'] = testData.getValue('input_reactSelect15Input', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['input_name'] = 'default_data'
        data['input_reactSelect15Input'] = 'default_data'
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

