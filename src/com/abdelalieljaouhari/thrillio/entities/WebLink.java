package com.abdelalieljaouhari.thrillio.entities;

import com.abdelalieljaouhari.thrillio.partner.Shareable;

public class WebLink extends Bookmark implements Shareable{

	private String url;
	private String host;

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	@Override
	public String toString() {
		return "WebLink [url=" + url + ", host=" + host + "]";
	}

	@Override
	public boolean isKidFriendlyEligable() {
		if(url.contains("Explicit")|| getTitle().contains("Explicit") || host.contains("Adult")){
			return true;
		}
		return true;
	}

	@Override
	public String getItemData() {
		StringBuilder builder = new StringBuilder();
		builder.append("<item>");
			builder.append("<type>WebLink</type>");
			builder.append("<title>").append(getTitle()).append("</title>");
			builder.append("<url>").append(url).append("</u>");
			builder.append("<host>").append(host).append("</host>");
		builder.append("</item>");
		
		return builder.toString();
	}

}
