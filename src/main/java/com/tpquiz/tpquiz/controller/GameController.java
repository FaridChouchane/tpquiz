package com.tpquiz.tpquiz.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.tpquiz.tpquiz.entity.FormResponse;
import com.tpquiz.tpquiz.entity.Question;
import com.tpquiz.tpquiz.service.GameService;

@Controller
public class GameController {
	@Autowired
	private GameService service;

	@GetMapping
	public String index() {
		return "index.html";
	}

	@GetMapping("play")
	public String play(Model model) {
		Question question = service.newQuestion();
		model.addAttribute("question", question);
		return "play.html";
	}

	@PostMapping("play")
	public String participation(FormResponse form, Model model) {
		Boolean hasWin = service.hasWin(form);
		model.addAttribute("hasWin", hasWin);
		model.addAttribute("score", service.update(hasWin));
		return "result.html";
	}
}