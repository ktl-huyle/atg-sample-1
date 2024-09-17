package katalon.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import internal.GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

public class interactWithUIElementsAndCloseDialogs {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Click on button close4"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_close4'))
        
        "Step 2: Click on pre object"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/pre_object'))
        
        "Step 3: Click on div object9"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_object9'))
        
        "Step 4: Click on image object"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/image_object'))
        
        "Step 5: Click on button close3"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_close3'))
        
        "Step 6: Click on link object"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_object'))
        
        "Step 7: Click on link jrHmparallelSuite"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/link_jrHmparallelSuite'))
        
        "Step 8: Click on div dynamicObject (object7)"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_team_project_executions/div_dynamicObject"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_project_executions/div_dynamicObject', ['div_dynamicObject_class': data['div_dynamicObject_class'], 'div_dynamicObject_internalRoleButtonName': data['div_dynamicObject_internalRoleButtonName']]))
        
        "Step 9: Click on div object9"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_object9'))
        
        "Step 10: Click on button close"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_close'))
        
        "Step 11: Click on div sidebarLayoutRightSidebar"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_sidebarLayoutRightSidebar'))
        
        "Step 12: Click on div object9"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_object9'))
        
        "Step 13: Click on image object2"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/image_object2'))
        
        "Step 14: Click on button close"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_close'))
        
        "Step 15: Click on pre object"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/pre_object'))
        
        "Step 16: Click on pre object"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/pre_object'))
        
        "Step 17: Click on div object9"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_object9'))
        
        "Step 18: Click on button close"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_close'))
        
        "Step 19: Click on div object9"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/div_object9'))
        
        "Step 20: Click on button close"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/button_close'))
        
        "Step 21: Click on td object3"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_team_project_executions/td_object3'))
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        data['div_dynamicObject_class'] = testData.getValue('div_dynamicObject_class', rowIndex)
        data['div_dynamicObject_internalRoleButtonName'] = testData.getValue('div_dynamicObject_internalRoleButtonName', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['div_dynamicObject_class'] = 'default_data'
        data['div_dynamicObject_internalRoleButtonName'] = 'default_data'
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

