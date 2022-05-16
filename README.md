﻿# **저를 가위바위보로 이길 수 있을 것 같습니까 휴먼? 🤖**

[프로젝트 리포지토리](https://github.com/soulchicken/rock-paper-scissors-game)

## **00. 팀원 소개**

-   **[황솔희](https://github.com/solhee-hwang)** : 랭킹 집계, 전체적인 소프트웨어 진행 구현
-   **[장영광](https://github.com/glory9802)** : 가위바위보 게임 구현
-   **[박동규](https://github.com/uyggnodkrap)** : 로그인 기능 구현
-   **[김동현](https://github.com/soulchicken)** : 회원가입 기능 구현

## **01. 기술 스택**

-   **MySQL** 8.0.29
-   jdk 11.0
-   JDBC
-   Maven
-   Lombok 1.18.20

## **02. 프로젝트 주제**

### **가위바위보 게임**

-   오징어게임으로 다시하면 조명받을 추억의 놀이를 랭킹 시스템으로 구현
-   지상 최고의 밸런스게임 가위바위보 랭킹시스템 구현

## **03. 도메인 관련 용어**

-   ✌️ **가위 (scissors)** : 보를 이기고 바위에게 진다.
-   ✊ **바위 (rock)** : 가위를 이기고 보에게 진다.
-   🖐️ **보 (paper)** : 바위를 이기고 바위에게 진다.
-   🎮 **게임 (game)**
    1.  규칙을 정해 놓고 승부를 겨루는 놀이. 순화어는 `놀이`, `내기`.
    2.  특히, 운동 경기를 이르는 말. 순화어는 `경기`.
-   🔥**경쟁 (competition)**
    1.  일반적으로 '같은 목적을 달성하기 위해서 서로 겨루는 것'을 의미한다.
    2.  대개 경쟁은 '승리 혹은 우승을 위한 목표를 달성하기 위해서 여러 사람들이 치열하게 싸우는 것' 정도의 의미로 이해된다.
-   🏆 **랭킹 (ranking)** : 순위. 능력이나 지위에 따라 매겨지거나 정해진 순서

## **04. 기능 명세**

### 프로그램 진행

-   프로그램 시작
-   회원가입, 로그인 선택
-   로그인 이후 게임 시작, 랭킹 보기 선택

### 회원가입 기능

-   아이디가 중복된 경우 다시 입력
-   회원가입 생성시 user 테이블에 추가
-   승무패 0,0,0으로 초기화한 상태로 score 테이블에

### 로그인, 로그아웃 기능

-   입력한 사용자 아이디 존재 유무 및 패스워드 일치 확인
-   모두 일치하면, 해당 사용자의 로그인 상태를 초기화 한 다음 로그인 시간을 로그에 저장
-   프로그램 종료 시 사용자의 로그인 상태를 로그인 상태를 초기화 한 다음 로그아웃 시간을 로그에 저장

### 가위바위보 게임

-   가위, 바위, 보 중에서 하나를 입력받음
-   알고리즘을 통해 AI가 가위, 바위, 보를 냄
-   승무패 확인 (score 테이블에 집계)
-   게임 다시 시작 여부 확인

### 랭킹 집계 기능

-   score 태이블에서 다승왕을 5명 내림차순 출력

## **05. ERD (Entity Relationship Diagram)**

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/34b71601-e477-4a51-a0e6-1becc8387bb5/Untitled.png)

### **user** 테이블

column

data type

설명

user_id (PK)

smallint

고유 아이디

user_name

varchar(45)

로그인 아이디

password

varchar(45)

로그인 비밀번호

is_login

tinyint

로그인 상태

### **score** 테이블

column

data type

설명

user_id (PK, FK)

smallint

고유 아이디

win

smallint

승리 횟수

lose

smallint

패배 횟수

draw

smallint

무승부 횟수

-   회원가입시 승, 무, 패는 0, 0, 0 으로 시작
-   AI와 게임시 해당 결과의 값을 1 증가

### login_log 테이블

column

data type

설명

user_id (FK)

SMALLINT

고유 아이디

login_time

datetime

승리 횟수

logout_time

datetime

패배 횟수

-   로그인 시간, 로그아웃 시간이 기록된다.
-   소프트웨어 내에 영향을 주지 않지만 이후 사용자 관리 등 프로그램 확장에 용이하다.

## **06. 트러블 슈팅**

-   merge 너무 정신없음
-   logout(id, password) : 코드 합치는 과정에서 구현 실패,, 현재 로그인한 아이디와 비밀번호를 받는 과정에서 에러 발생
    -   이거 해결해버림... ㄷㄷ

## **07. 느낀 점**

-   황솔희 : 항상 남이 해주는 git관리에 익숙해진 내 머리로,, 관리를 하게되면서 개인적으로 프로젝트 구현 보다 더 어렵다고 느꼈다,,,,, 😂
-   장영광 : 배워도 써먹질 못하니 열심히 공부해야겠다..ㅜㅜ
-   박동규 : git으로 협업은 처음인데, 멋진 조원분들과 같이해서 좋았다. 많이 배운 프로젝트였다. 다음에 또 만나요!
-   김동현 : 협업은 늘 어렵네요. 발전하는 기분이 듭니다. 다들 너무 각자의 자리에서 최선을 다했습니다. 다들 또 보죠.
    -   갱장해 엄청나
