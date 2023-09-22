package WebDriverExamples;

import org.sikuli.script.Screen;

public class Sikuli {
public static void main(String args[]) throws Exception {
	Screen sc = new Screen();
	sc.click("‪D:\\Sikuli\\Minimize.PNG");
	Thread.sleep(3000);
	sc.doubleClick("D:\\Sikuli\\Chrome.PNG");
	Thread.sleep(3000);
	sc.click("D:\\Sikuli\\New Tab.PNG");
	Thread.sleep(3000);
	sc.click("D:\\Sikuli\\Gmail.PNG");
	Thread.sleep(3000);
	sc.click("D:\\Sikuli\\Close.PNG");
	Thread.sleep(3000);
}
}
