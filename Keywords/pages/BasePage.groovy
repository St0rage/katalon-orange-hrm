package pages

import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.SelectorMethod
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import helpers.Tars
import helpers.TarsStatus
import internal.GlobalVariable

public abstract class BasePage {

	protected Tars tars = Tars.getInstance()

	protected TestObject findByXpath(String xpath) {
		return new TestObject().addProperty("xpath", ConditionType.EQUALS, xpath)
	}
	
	protected TestObject findByCSS(String css) {
		return new TestObject().addProperty("css", ConditionType.EQUALS, css)
	}

	protected errorHandling(Exception error) {
		this.tars.screenshot("Failed", error.message, TarsStatus.FAILED)
		this.tars.saveReportFailed()
		WebUI.closeBrowser()
		KeywordUtil.markErrorAndStop(error.message)
	}
}
