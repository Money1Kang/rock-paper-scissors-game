package com.game.view;

public class GameView {

	public void successPage() {
		System.out.println("���� ��ϵǾ����ϴ�.");
	}

	public void errorPage(Exception errorObject) {
		System.out.println("������ �߻��Ͽ����ϴ�. "+errorObject.getMessage());
	}
	
}
