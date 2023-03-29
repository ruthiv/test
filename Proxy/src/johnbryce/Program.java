package johnbryce;

public class Program {

	public static void main(String[] args) {

		ChromeProxy chrome = new ChromeProxy();
		chrome.surf("http://johnbryce.co.il");
		chrome.surf("http://facebook.com");

	}

}
