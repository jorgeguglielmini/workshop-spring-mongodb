package com.guglielminijorge.workshopmongo.resources.exception;

import java.io.Serializable;

public class StandardError implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long timestramp;
	private Integer status;
	private String error;
	private String messae;
	private String path;
	

	private StandardError() {}

	public StandardError(Long timestramp, Integer status, String error, String messae, String path) {
		super();
		this.timestramp = timestramp;
		this.status = status;
		this.error = error;
		this.messae = messae;
		this.path = path;
	}

	public Long getTimestramp() {
		return timestramp;
	}


	public void setTimestramp(Long timestramp) {
		this.timestramp = timestramp;
	}


	public Integer getStatus() {
		return status;
	}


	public void setStatus(Integer status) {
		this.status = status;
	}


	public String getError() {
		return error;
	}


	public void setError(String error) {
		this.error = error;
	}


	public String getMessae() {
		return messae;
	}


	public void setMessae(String messae) {
		this.messae = messae;
	}


	public String getPath() {
		return path;
	}


	public void setPath(String path) {
		this.path = path;
	}


	
	
}
