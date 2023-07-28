package com.tpquiz.tpquiz.service;

import java.util.Set;
import com.tpquiz.tpquiz.entity.Question;
import com.tpquiz.tpquiz.entity.Countrie;
import com.tpquiz.tpquiz.entity.FormResponse;
import org.springframework.stereotype.Service;
import com.tpquiz.tpquiz.repository.CountrieRepository;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class GameService {
	@Autowired
	CountrieRepository repository;

	private Integer score = 0;
	private Question question = new Question();

	public Question newQuestion() {
		question = new Question();
		Set<Countrie> countries = repository.getRandomCountries();
		int i = 0;
		int r = (int) Math.floor(Math.random() * 4);
		for (Countrie c : countries) {
			if (i++ == r) {
				question.setPays(c.name);
				question.setGoodResponse(c.capital);
				System.out.println("Good response : " + c.capital);
			}
			question.addResponse(c.capital);
		}
		return question;
	}

	public Integer get() {
		return score;
	}

	public Integer update(boolean positive) {
		if (positive) {
			score++;
		} else {
			score--;
		}
		if (score < 0) {
			score = 0;
		}
		return score;
	}

	public Boolean hasWin(FormResponse form) {
		if (form.responseIndex == null) {
			return false;
		}
		if (question.isGoodResponse(form.responseIndex)) {
			return true;
		}
		return false;
	}
}
