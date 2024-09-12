package notepad

import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows



public class select {

	@Keyword
	def selectShowSymbol (List<String> opts) {
		for (each in opts) {
			println each

			Windows.click(findWindowsObject('Object Repository/common/ele_by_name', [('name') : ('View')]))

			Windows.click(findWindowsObject('Object Repository/common/ele_by_name', [('name') : ('Show Symbol')]))

			Windows.click(findWindowsObject('Object Repository/common/ele_by_name', [('name') : (each)]))
		}
	}
	
	@Keyword
	List<String> getDropdownOptions() {
		"Switch to Desktop"
		Windows.switchToDesktop()
		
		List<String> result = []
		
		def list = Windows.findElements(findWindowsObject('Object Repository/Unikey/listitem'))
		
		for (each in list) {
			println(each)
			if (each.getText()) {
				result.add(each.getText())
			}
		}
		
		Windows.switchToApplication()
		
		return result
	}
}
