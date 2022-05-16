package com.game.controller;

import java.util.Scanner;

import com.game.service.GameService;
import com.game.view.GameView;

public class GameController {

	private final GameService gameService;
	private final GameView gameView;
	private Exception errorObject;
	Scanner sc = new Scanner(System.in);

	public GameController() {
		this.gameService = new GameService();
		this.gameView = new GameView();
	}
	
	public void save(int userId, String userName, String password, int isLogin) {
		
		int result = gameService.save(userId, userName, password, isLogin);
		// �������� ���� �������δ� gameView�� ����Ѵ�.
		if (result > 0) {
			gameView.successPage();
		} else {
			errorObject = new Exception("Database ��� ����");
			gameView.errorPage(errorObject);
		}
	}

	public void joinUser() {
		gameView.joinUserInputName();
		String name;
		gameView.joinUserInputPassword();
		String password;
	}

}
