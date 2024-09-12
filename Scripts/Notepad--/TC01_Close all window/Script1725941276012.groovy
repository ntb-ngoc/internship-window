import org.openqa.selenium.TimeoutException

import com.kms.katalon.core.exception.StepFailedException
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows


String appFile = "C:\\Windows\\System32\\notepad.exe"
String appTitle = "Notepad"

Windows.startApplication(appFile)
Windows.startApplication(appFile)

while (true) {
	try {
		Windows.switchToWindowTitle(appTitle)
		Windows.closeApplication()
	}
	catch (StepFailedException e) {
		break
	}
	catch (TimeoutException e) {
		break
	}
	catch (NoSuchElementException e){
		break
	}
}