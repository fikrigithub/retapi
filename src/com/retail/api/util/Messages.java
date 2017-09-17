package com.retail.api.util;

import java.io.Serializable;

public class Messages implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String data;
	private String notification;

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getNotification() {
		return notification;
	}

	public void setNotification(String notification) {
		this.notification = notification;
	}
}
