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
	
	public void joinUser() {
		String name;
		while (true) {
			gameView.joinUserInputName();
			name = sc.next();
			if (gameService.joinUserInputName(name)) {
				break;
			} else {
				gameView.reInput();
			}
		}
		gameView.joinUserInputPassword();
		String password = sc.next();
		save(0, name,password,0);
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
