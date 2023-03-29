package johnbryce;

import java.util.ArrayList;

public class ChromeProxy extends Browser {

	private Chrome chrome = new Chrome();
	private ArrayList<String> blacklistSites = new ArrayList<>();

	public ChromeProxy() {
		blacklistSites.add("facebook.com");
		blacklistSites.add("instegram.com");
		blacklistSites.add("twitter.com");
	}

	@Override
	public void surf(String url) {
		for (String site : blacklistSites) {
			if (url.contains(site)) {
				System.err.println("Can't surf to " + url);
				return;
			}
		}
		chrome.surf(url);
	}

}
