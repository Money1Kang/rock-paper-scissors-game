package com.game;

import com.game.controller.GameController;

public class App {

	public static void main(String[] args) {
		GameController gameController = new GameController();

//		todoController.save(todo);
//		System.out.println("\n\n---------���̺� Ȯ��");
		gameController.joinUser();
		gameController.save(2,"����","1234",0);
	}

}
