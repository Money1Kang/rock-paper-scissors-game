package com.game.controller;

import com.game.service.GameService;
import com.game.view.GameView;

public class GameController {

	private final GameService gameService;
	private final GameView gameView;
	private Exception errorObject;

	
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

}
