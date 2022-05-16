package com.game.model;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class InGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("���������� ������ �����Ͻðڽ��ϱ�? 0.NO 1.YES");
    
        //�·� �ʱⰪ
        var winScore = 0;
        var loseScore = 0;
        var drawScore = 0;
    
        //���������� ���� �ݺ���
        while (true) {
                
            //0:��������, 1:���ӽ���
            int cn = scanner.nextInt();
            if (cn == 0) {
                System.out.println("������ �����մϴ�.");
                System.out.println("���� ���ھ� - �̱� Ƚ�� : " + winScore + ", �� Ƚ�� : " + loseScore + ", ��� Ƚ�� : " + drawScore);
                break;
                
                
            } else {
                
                System.out.println("�ȳ��� ���� ����������!");
                System.out.println("�Է��ϼ��� : 1.����, 2.����, 3.��");
                
                int input = scanner.nextInt();// �Է�
                Random rd = new Random();
                int comCase = rd.nextInt(3) + 1;
                // ����, ��ǻ�� �Է°� ����
                HashMap<Integer, String> hMap = new HashMap<>();
                hMap.put(1, "����");
                hMap.put(2, "����");
                hMap.put(3, "��");
                // ���� ���
                System.out.println("������ ���� :: " + hMap.get(input));
                System.out.println("��ǻ���� ���� :: " + hMap.get(comCase));
                
                // ���� ����
                String[] rsWinner = { "WIN!!", "LOSE", "DRAW" };
                int rsInt = winner(input, comCase);
                System.out.println(rsWinner[rsInt]);
                
                // �·� ++
                if (rsInt == 0) {
                    winScore++;
                } else if(rsInt == 1) {
                    loseScore++;
                } else {
                    drawScore++;
                }
                System.out.println("�̱� Ƚ�� : " + winScore + ", �� Ƚ�� : " + loseScore + ", ��� Ƚ�� : " + drawScore);
                // ��� �Ұ���?
                System.out.println("������ ��� �Ͻðڽ��ϱ�? 0.No 1.Yes");
                
                continue;
            }
        }
    }
    
    public static int winner(int user, int com) {
        int answer = 0;
        if (user == com) 
            return 2;
        if (user == 0 && com == 1) {
            answer = 1;
        } else if (user == 1 && com == 2) {
            answer = 1;
        } else if (user == 2 && com == 0) {
            answer = 1;
        }
        return answer;
    }
}