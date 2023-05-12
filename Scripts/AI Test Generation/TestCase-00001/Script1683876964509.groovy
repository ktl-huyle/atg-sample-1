import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_BH-24-TH-C3-81NG-M-C3-A1y-r-E1-BB-ADa-xe-mini-I-M-C3-A1y-r-E1-BB-ADa-xe-cao-C3-A1p-YAMAHA-2800W-HA889A-C-C3-B3-n-C3-BAt-ch-E1-BB-89nh-C3-A1p-su-E1-BA-A5t-van-x-E1-BA-A3-kh-C3-AD-3477893312'

WebUI.navigateToUrl(GlobalVariable.application_domain + '')

'step 2: Add visual checkpoint at Page_BH-24-TH-C3-81NG-M-C3-A1y-r-E1-BB-ADa-xe-mini-I-M-C3-A1y-r-E1-BB-ADa-xe-cao-C3-A1p-YAMAHA-2800W-HA889A-C-C3-B3-n-C3-BAt-ch-E1-BB-89nh-C3-A1p-su-E1-BA-A5t-van-x-E1-BA-A3-kh-C3-AD-3477893312'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00001_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
