import java.awt.Robot

import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

Windows.startApplicationWithTitle('C:\\Windows\\explorer.exe', 'explorer')

Robot rb = new Robot()

"Move to the application screen"
rb.mouseMove(900, 500)

Windows.delay(2)

"Stimulate wheel down"
rb.mouseWheel(100)

Windows.delay(2)

Windows.closeApplication()