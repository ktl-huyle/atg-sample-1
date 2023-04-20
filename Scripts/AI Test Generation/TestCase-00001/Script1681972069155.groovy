import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'--> Navigate to test case start point'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/%C4%90%C3%A0n-Kalimba-17-ph%C3%ADm-gi%C3%A1-si%C3%AAu-r%E1%BA%BB-QUYNHLEMO-%C3%A2m-hay-%C4%91%E1%BA%A7y-%C4%91%E1%BB%A7-ph%E1%BB%A5-ki%E1%BB%87n-i.267187767.8937090130')

'step 1: Add visual checkpoint at Page_%C4%90%C3%A0n-Kalimba-17-ph%C3%ADm-gi%C3%A1-si%C3%AAu-r%E1%BA%BB-QUYNHLEMO-%C3%A2m-hay-%C4%91%E1%BA%A7y-%C4%91%E1%BB%A7-ph%E1%BB%A5-ki%E1%BB%87n-8937090130'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00001_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
