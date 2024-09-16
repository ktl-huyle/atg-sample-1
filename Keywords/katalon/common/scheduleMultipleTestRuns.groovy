package katalon.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

public class scheduleMultipleTestRuns {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Click on button scheduleTestRun"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_scheduleTestRun'))
        
        "Step 2: Click on link clickHereToRefresh"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/link_clickHereToRefresh'))
        
        "Step 3: Click on div object5"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_object5'))
        
        "Step 4: Enter input value in input serverUrl"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/input_serverUrl"
        WebUI.setText(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/input_serverUrl', ['input_serverUrl_reactSelect': data['input_serverUrl_reactSelect']]), data['input_serverUrl'])
        
        "Step 5: Click on div object6"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_object6"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_object6', ['div_object6_option': data['div_object6_option'], 'div_object6_reactSelect': data['div_object6_reactSelect'], 'div_object6_internalText': data['div_object6_internalText']]))
        
        "Step 6: Click on input name"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/input_name'))
        
        "Step 7: Enter input value in input name"
        
        WebUI.setText(findTestObject('AI-Generated/Page_team_project_test_runs/input_name'), data['input_name'])
        
        "Step 8: Click on div object7"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_object7'))
        
        "Step 9: Click on div object8"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_object8'))
        
        "Step 10: Click on item moreOptions"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/item_moreOptions'))
        
        "Step 11: Click on span object"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/span_object"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/span_object', ['span_object_nthChild': data['span_object_nthChild'], 'span_object_class': data['span_object_class'], 'span_object_internalHasText': data['span_object_internalHasText']]))
        
        "Step 12: Click on div desktopBrowsers"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_desktopBrowsers'))
        
        "Step 13: Click on div object9"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_object9'))
        
        "Step 14: Click on button save"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_save'))
        
        "Step 15: Click on div object10"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_object10'))
        
        "Step 16: Click on div object11"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_object11"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_object11', ['div_object11_reactSelect': data['div_object11_reactSelect'], 'div_object11_option': data['div_object11_option'], 'div_object11_internalText': data['div_object11_internalText']]))
        
        "Step 17: Click on button runS"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_runS'))
        
        "Step 18: Click on button scheduleTestRun"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_scheduleTestRun'))
        
        "Step 19: Click on div object5"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_object5'))
        
        "Step 20: Enter input value in input serverUrl"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/input_serverUrl"
        WebUI.setText(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/input_serverUrl', ['input_serverUrl_reactSelect': data['input_serverUrl_reactSelect_1']]), data['input_serverUrl'])
        
        "Step 21: Click on div object12"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_object12"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_object12', ['div_object12_option': data['div_object12_option'], 'div_object12_reactSelect': data['div_object12_reactSelect']]))
        
        "Step 22: Click on div selectEnvironmentNth1"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_selectEnvironmentNth1'))
        
        "Step 23: Click on item moreOptions"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/item_moreOptions'))
        
        "Step 24: Click on span object"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/span_object"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/span_object', ['span_object_nthChild': data['span_object_nthChild_1'], 'span_object_class': data['span_object_class_1'], 'span_object_internalHasText': data['span_object_internalHasText_1']]))
        
        "Step 25: Click on label desktopBrowsers"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/label_desktopBrowsers'))
        
        "Step 26: Click on div object9"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_object9'))
        
        "Step 27: Click on input includeApicalls"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/input_includeApicalls'))
        
        "Step 28: Click on div object13"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_object13'))
        
        "Step 29: Click on div object14"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_object13'))
        
        "Step 30: Click on button save"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_save'))
        
        "Step 31: Click on div object15"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_object15"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_object15', ['div_object15_class': data['div_object15_class']]))
        
        "Step 32: Click on div object16"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_object16"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_object16', ['div_object16_option': data['div_object16_option'], 'div_object16_reactSelect': data['div_object16_reactSelect']]))
        
        "Step 33: Click on input name"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/input_name'))
        
        "Step 34: Enter input value in input name"
        
        WebUI.setText(findTestObject('AI-Generated/Page_team_project_test_runs/input_name'), data['input_name'])
        
        "Step 35: Click on button runS"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_runS'))
        
        "Step 36: Click on button scheduleTestRun"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_scheduleTestRun'))
        
        "Step 37: Click on div object5"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_object5'))
        
        "Step 38: Enter input value in input serverUrl"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/input_serverUrl"
        WebUI.setText(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/input_serverUrl', ['input_serverUrl_reactSelect': data['input_serverUrl_reactSelect_2']]), data['input_serverUrl'])
        
        "Step 39: Click on div object17"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_object17"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_object17', ['div_object17_option': data['div_object17_option'], 'div_object17_reactSelect': data['div_object17_reactSelect'], 'div_object17_internalText': data['div_object17_internalText']]))
        
        "Step 40: Click on div object8"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_object8'))
        
        "Step 41: Click on item moreOptions"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/item_moreOptions'))
        
        "Step 42: Click on div object18"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_object18"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_object18', ['div_object18_class': data['div_object18_class'], 'div_object18_nthChild': data['div_object18_nthChild']]))
        
        "Step 43: Click on div object9"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/div_object9'))
        
        "Step 44: Click on button save"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_save'))
        
        "Step 45: Click on div object10"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_object10'))
        
        "Step 46: Click on div object19"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_object19"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_test_runs/div_object19', ['div_object19_option': data['div_object19_option'], 'div_object19_reactSelect': data['div_object19_reactSelect'], 'div_object19_internalText': data['div_object19_internalText']]))
        
        "Step 47: Click on input name"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/input_name'))
        
        "Step 48: Enter input value in input name"
        
        WebUI.setText(findTestObject('AI-Generated/Page_team_project_test_runs/input_name'), data['input_name'])
        
        "Step 49: Click on button runS"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_test_runs/button_runS'))
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        data['div_object11_internalText'] = testData.getValue('div_object11_internalText', rowIndex)
        data['div_object11_option'] = testData.getValue('div_object11_option', rowIndex)
        data['div_object11_reactSelect'] = testData.getValue('div_object11_reactSelect', rowIndex)
        data['div_object12_option'] = testData.getValue('div_object12_option', rowIndex)
        data['div_object12_reactSelect'] = testData.getValue('div_object12_reactSelect', rowIndex)
        data['div_object15_class'] = testData.getValue('div_object15_class', rowIndex)
        data['div_object16_option'] = testData.getValue('div_object16_option', rowIndex)
        data['div_object16_reactSelect'] = testData.getValue('div_object16_reactSelect', rowIndex)
        data['div_object17_internalText'] = testData.getValue('div_object17_internalText', rowIndex)
        data['div_object17_option'] = testData.getValue('div_object17_option', rowIndex)
        data['div_object17_reactSelect'] = testData.getValue('div_object17_reactSelect', rowIndex)
        data['div_object18_class'] = testData.getValue('div_object18_class', rowIndex)
        data['div_object18_nthChild'] = testData.getValue('div_object18_nthChild', rowIndex)
        data['div_object19_internalText'] = testData.getValue('div_object19_internalText', rowIndex)
        data['div_object19_option'] = testData.getValue('div_object19_option', rowIndex)
        data['div_object19_reactSelect'] = testData.getValue('div_object19_reactSelect', rowIndex)
        data['div_object6_internalText'] = testData.getValue('div_object6_internalText', rowIndex)
        data['div_object6_option'] = testData.getValue('div_object6_option', rowIndex)
        data['div_object6_reactSelect'] = testData.getValue('div_object6_reactSelect', rowIndex)
        data['input_name'] = testData.getValue('input_name', rowIndex)
        data['input_name_1'] = testData.getValue('input_name_1', rowIndex)
        data['input_name_2'] = testData.getValue('input_name_2', rowIndex)
        data['input_serverUrl'] = testData.getValue('input_serverUrl', rowIndex)
        data['input_serverUrl_1'] = testData.getValue('input_serverUrl_1', rowIndex)
        data['input_serverUrl_2'] = testData.getValue('input_serverUrl_2', rowIndex)
        data['input_serverUrl_reactSelect'] = testData.getValue('input_serverUrl_reactSelect', rowIndex)
        data['input_serverUrl_reactSelect_1'] = testData.getValue('input_serverUrl_reactSelect_1', rowIndex)
        data['input_serverUrl_reactSelect_2'] = testData.getValue('input_serverUrl_reactSelect_2', rowIndex)
        data['span_object_class'] = testData.getValue('span_object_class', rowIndex)
        data['span_object_class_1'] = testData.getValue('span_object_class_1', rowIndex)
        data['span_object_internalHasText'] = testData.getValue('span_object_internalHasText', rowIndex)
        data['span_object_internalHasText_1'] = testData.getValue('span_object_internalHasText_1', rowIndex)
        data['span_object_nthChild'] = testData.getValue('span_object_nthChild', rowIndex)
        data['span_object_nthChild_1'] = testData.getValue('span_object_nthChild_1', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['div_object11_internalText'] = 'default_data'
        data['div_object11_option'] = 'default_data'
        data['div_object11_reactSelect'] = 'default_data'
        data['div_object12_option'] = 'default_data'
        data['div_object12_reactSelect'] = 'default_data'
        data['div_object15_class'] = 'default_data'
        data['div_object16_option'] = 'default_data'
        data['div_object16_reactSelect'] = 'default_data'
        data['div_object17_internalText'] = 'default_data'
        data['div_object17_option'] = 'default_data'
        data['div_object17_reactSelect'] = 'default_data'
        data['div_object18_class'] = 'default_data'
        data['div_object18_nthChild'] = 'default_data'
        data['div_object19_internalText'] = 'default_data'
        data['div_object19_option'] = 'default_data'
        data['div_object19_reactSelect'] = 'default_data'
        data['div_object6_internalText'] = 'default_data'
        data['div_object6_option'] = 'default_data'
        data['div_object6_reactSelect'] = 'default_data'
        data['input_name'] = 'default_data'
        data['input_name_1'] = 'default_data'
        data['input_name_2'] = 'default_data'
        data['input_serverUrl'] = 'default_data'
        data['input_serverUrl_1'] = 'default_data'
        data['input_serverUrl_2'] = 'default_data'
        data['input_serverUrl_reactSelect'] = 'default_data'
        data['input_serverUrl_reactSelect_1'] = 'default_data'
        data['input_serverUrl_reactSelect_2'] = 'default_data'
        data['span_object_class'] = 'default_data'
        data['span_object_class_1'] = 'default_data'
        data['span_object_internalHasText'] = 'default_data'
        data['span_object_internalHasText_1'] = 'default_data'
        data['span_object_nthChild'] = 'default_data'
        data['span_object_nthChild_1'] = 'default_data'
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

