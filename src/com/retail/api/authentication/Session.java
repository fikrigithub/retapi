package com.retail.api.authentication;

import java.io.Serializable;

public class Session implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String id;
	private String sessionId;
	private String activeOn;
	private String status;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSessionId() {
		return sessionId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	public String getActiveOn() {
		return activeOn;
	}

	public void setActiveOn(String activeOn) {
		this.activeOn = activeOn;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
