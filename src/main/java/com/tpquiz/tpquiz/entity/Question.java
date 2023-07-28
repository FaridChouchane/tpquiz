package com.tpquiz.tpquiz.entity;

import java.util.ArrayList;
import java.util.List;

public class Question {
	private String pays;
	private String goodResponse;
	private List<String> responses = new ArrayList<>();

	public String getPays() {
		return pays;
	}

	public void setPays(String pays) {
		this.pays = pays;
	}

	public List<String> getResponses() {
		return responses;
	}

	public String getResponse(Integer index) {
		return responses.get(index);
	}

	public void setResponses(List<String> responses) {
		this.responses = responses;
	}

	public void addResponse(String response) {
		this.responses.add(response);
	}

	public String getGoodResponse() {
		return goodResponse;
	}

	public void setGoodResponse(String goodResponse) {
		this.goodResponse = goodResponse;
	}

	public Boolean isGoodResponse(Integer index) {
		try {
			if (responses.get(index) == goodResponse) {
				return true;
			}
		} catch (IndexOutOfBoundsException e) {
		}
		return false;
	}
}