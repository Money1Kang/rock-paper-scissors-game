package com.game.view;

public class GameView {

	public void successPage() {
		System.out.println("���� ��ϵǾ����ϴ�.");
	}

	public void errorPage(Exception errorObject) {
		System.out.println("������ �߻��Ͽ����ϴ�. "+ errorObject.getMessage());
	}

	public void joinUserInputName() {
		System.out.println("���� �̸��� �Է����ּ���.");
	}

	public void joinUserInputPassword() {
		System.out.println("��й�ȣ�� �Է����ּ���.");
	}

	public void reInput() {
		System.out.println("�ߺ��� ���Դϴ�. �ٽ� �Է����ּ���.");
	}

	
}
