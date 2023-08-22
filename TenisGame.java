package javaProject;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

@SuppressWarnings("unused")
public class TenisGame {

	public static void main(String[] args) {

		ArrayList<Player> players = new ArrayList<>();
		ArrayList<Player> team1 = new ArrayList<>();
		ArrayList<Player> team2 = new ArrayList<>();

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int startMenu = 0;
		while(true) {
			Print.printMain();			
			startMenu = scanner.nextInt();

			if(startMenu == 1) break; //게임시작
			else if(startMenu == 2) TeamCreate.newFile(); //리스트생성
			else if(startMenu == 3) System.exit(0); //게임종료

		}
		boolean flag2 = false;
		String input2 = "";
		do {
			if(flag2 == true) System.out.println("잘못 선택하셨습니다.");
			Print.printRuleSelect();
			System.out.print("\t\t   1. 3세트 / 2. 5세트\n선택 : ");
			input2 = scanner.next();
		} while (flag2 = !(input2.matches("[1-2]")));
		boolean flag = false;
		String input = "";
		do {
			if(flag == true) System.out.println("잘못 선택하셨습니다.");
			Print.printRuleSelect();
			System.out.print("\t\t   1. 단식 / 2. 복식\n선택 : ");
			input = scanner.next();
		} while (flag = !(input.matches("[1-2]")));
		int rule = Integer.valueOf(input);
		int set  = Integer.valueOf(input2);
		int SetValue = TeamSelection.teamDataInput(set,rule, players, team1, team2);
		int winSet =	(SetValue / 2) + 1;

		MatchPoint t1 = new MatchPoint();
		MatchPoint t2 = new MatchPoint();

		Random rnd = new Random();
		
		while (t1.getSet()<winSet && t2.getSet()<winSet) {
			t1.setScore(0); t2.setScore(0);
			t1.setGame(0); t2.setGame(0);

			while (t1.getGame()<6 && t2.getGame()<6) {
				t1.setScore(0); t2.setScore(0);

				while (t1.getScore()<4 &&t2.getScore()<4) {
					if (t1.getSet()==winSet) {
						System.out.println("\n\n\n\n\n\n");
						System.out.println("｜――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――｜\r\n"
								+ "  ▄▄▄▄▄▄▄▄▄▄▄       ▄▄▄▄▄▄▄▄▄▄▄       ▄▄▄▄▄▄▄▄▄▄▄       ▄▄▄▄▄▄▄▄▄▄▄       ▄▄       ▄▄   \r\n"
								+ "｜▐░░░░░░░░░░░▌     ▐░░░░░░░░░░░▌     ▐░░░░░░░░░░░▌     ▐░░░░░░░░░░░▌     ▐░░▌     ▐░░▌｜\r\n"
								+ "｜▐░█▀▀▀▀▀▀▀█░▌      ▀▀▀▀█░█▀▀▀▀      ▐░█▀▀▀▀▀▀▀▀▀      ▐░█▀▀▀▀▀▀▀█░▌     ▐░▌░▌   ▐░▐░▌｜\r\n"
								+ "｜▐░▌       ▐░▌          ▐░▌          ▐░▌               ▐░▌       ▐░▌     ▐░▌▐░▌ ▐░▌▐░▌｜\r\n"
								+ "｜▐░█▄▄▄▄▄▄▄█░▌          ▐░▌          ▐░█▄▄▄▄▄▄▄▄▄      ▐░█▄▄▄▄▄▄▄█░▌     ▐░▌ ▐░▐░▌ ▐░▌｜\r\n"
								+ "｜▐░░░░░░░░░░░▌          ▐░▌          ▐░░░░░░░░░░░▌     ▐░░░░░░░░░░░▌     ▐░▌  ▐░▌  ▐░▌｜\r\n"
								+ "｜▐░█▀▀▀▀▀▀▀█░▌          ▐░▌          ▐░█▀▀▀▀▀▀▀▀▀      ▐░█▀▀▀▀█░█▀▀      ▐░▌   ▀   ▐░▌｜\r\n"
								+ "｜▐░▌       ▐░▌          ▐░▌          ▐░▌               ▐░▌     ▐░▌       ▐░▌       ▐░▌｜\r\n"
								+ "｜▐░▌       ▐░▌          ▐░▌          ▐░█▄▄▄▄▄▄▄▄▄      ▐░▌      ▐░▌      ▐░▌       ▐░▌｜\r\n"
								+ "｜▐░▌       ▐░▌          ▐░▌          ▐░░░░░░░░░░░▌     ▐░▌       ▐░▌     ▐░▌       ▐░▌｜\r\n"
								+ "｜ ▀         ▀            ▀            ▀▀▀▀▀▀▀▀▀▀▀       ▀         ▀       ▀         ▀ ｜\r\n"
								+ "｜                                                                                     ｜\r\n"
								+ "｜                ▄         ▄            ▄▄▄▄▄▄▄▄▄▄▄            ▄▄        ▄            ｜\r\n"
								+ "｜               ▐░▌       ▐░▌          ▐░░░░░░░░░░░▌          ▐░░▌      ▐░▌           ｜\r\n"
								+ "｜               ▐░▌       ▐░▌           ▀▀▀▀█░█▀▀▀▀           ▐░▌░▌     ▐░▌           ｜\r\n"
								+ "｜               ▐░▌       ▐░▌               ▐░▌               ▐░▌▐░▌    ▐░▌           ｜\r\n"
								+ "｜               ▐░▌   ▄   ▐░▌               ▐░▌               ▐░▌ ▐░▌   ▐░▌           ｜\r\n"
								+ "｜               ▐░▌  ▐░▌  ▐░▌               ▐░▌               ▐░▌  ▐░▌  ▐░▌           ｜\r\n"
								+ "｜               ▐░▌ ▐░▌░▌ ▐░▌               ▐░▌               ▐░▌   ▐░▌ ▐░▌           ｜\r\n"
								+ "｜               ▐░▌▐░▌ ▐░▌▐░▌               ▐░▌               ▐░▌    ▐░▌▐░▌           ｜\r\n"
								+ "｜               ▐░▌░▌   ▐░▐░▌           ▄▄▄▄█░█▄▄▄▄           ▐░▌     ▐░▐░▌           ｜\r\n"
								+ "｜               ▐░░▌     ▐░░▌          ▐░░░░░░░░░░░▌          ▐░▌      ▐░░▌           ｜\r\n"
								+ "｜                ▀▀       ▀▀            ▀▀▀▀▀▀▀▀▀▀▀            ▀        ▀▀            ｜\r\n"
								+ "｜                                                                                     ");
						try {					
				       		System.out.println("> 종료는 엔터를 누르세요.");
				       		System.in.read();
				       		System.in.skip(System.in.available());			       		
						}catch (Exception e) {
							e.printStackTrace();
						}
						return;
					}else if (t2.getSet()==winSet) {
						System.out.println("\n\n\n\n\n\n");
						System.out.println("｜――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――｜\r\n"
								+ "  ▄▄▄▄▄▄▄▄▄▄        ▄▄▄▄▄▄▄▄▄▄▄       ▄▄▄▄▄▄▄▄▄▄▄       ▄▄▄▄▄▄▄▄▄▄▄       ▄▄       ▄▄   \r\n"
								+ "｜▐░░░░░░░░░░▌      ▐░░░░░░░░░░░▌     ▐░░░░░░░░░░░▌     ▐░░░░░░░░░░░▌     ▐░░▌     ▐░░▌｜\r\n"
								+ "｜▐░█▀▀▀▀▀▀▀█░▌      ▀▀▀▀█░█▀▀▀▀      ▐░█▀▀▀▀▀▀▀▀▀      ▐░█▀▀▀▀▀▀▀█░▌     ▐░▌░▌   ▐░▐░▌｜\r\n"
								+ "｜▐░▌       ▐░▌          ▐░▌          ▐░▌               ▐░▌       ▐░▌     ▐░▌▐░▌ ▐░▌▐░▌｜\r\n"
								+ "｜▐░█▄▄▄▄▄▄▄█░▌          ▐░▌          ▐░█▄▄▄▄▄▄▄▄▄      ▐░█▄▄▄▄▄▄▄█░▌     ▐░▌ ▐░▐░▌ ▐░▌｜\r\n"
								+ "｜▐░░░░░░░░░░▌           ▐░▌          ▐░░░░░░░░░░░▌     ▐░░░░░░░░░░░▌     ▐░▌  ▐░▌  ▐░▌｜\r\n"
								+ "｜▐░█▀▀▀▀▀▀▀█░▌          ▐░▌          ▐░█▀▀▀▀▀▀▀▀▀      ▐░█▀▀▀▀█░█▀▀      ▐░▌   ▀   ▐░▌｜\r\n"
								+ "｜▐░▌       ▐░▌          ▐░▌          ▐░▌               ▐░▌     ▐░▌       ▐░▌       ▐░▌｜\r\n"
								+ "｜▐░█▄▄▄▄▄▄▄█░▌          ▐░▌          ▐░█▄▄▄▄▄▄▄▄▄      ▐░▌      ▐░▌      ▐░▌       ▐░▌｜\r\n"
								+ "｜▐░░░░░░░░░░▌           ▐░▌          ▐░░░░░░░░░░░▌     ▐░▌       ▐░▌     ▐░▌       ▐░▌｜\r\n"
								+ "｜ ▀▀▀▀▀▀▀▀▀▀             ▀            ▀▀▀▀▀▀▀▀▀▀▀       ▀         ▀       ▀         ▀ ｜\r\n"
								+ "｜                                                                                     ｜\r\n"
								+ "｜                ▄         ▄            ▄▄▄▄▄▄▄▄▄▄▄            ▄▄        ▄            ｜\r\n"
								+ "｜               ▐░▌       ▐░▌          ▐░░░░░░░░░░░▌          ▐░░▌      ▐░▌           ｜\r\n"
								+ "｜               ▐░▌       ▐░▌           ▀▀▀▀█░█▀▀▀▀           ▐░▌░▌     ▐░▌           ｜\r\n"
								+ "｜               ▐░▌       ▐░▌               ▐░▌               ▐░▌▐░▌    ▐░▌           ｜\r\n"
								+ "｜               ▐░▌   ▄   ▐░▌               ▐░▌               ▐░▌ ▐░▌   ▐░▌           ｜\r\n"
								+ "｜               ▐░▌  ▐░▌  ▐░▌               ▐░▌               ▐░▌  ▐░▌  ▐░▌           ｜\r\n"
								+ "｜               ▐░▌ ▐░▌░▌ ▐░▌               ▐░▌               ▐░▌   ▐░▌ ▐░▌           ｜\r\n"
								+ "｜               ▐░▌▐░▌ ▐░▌▐░▌               ▐░▌               ▐░▌    ▐░▌▐░▌           ｜\r\n"
								+ "｜               ▐░▌░▌   ▐░▐░▌           ▄▄▄▄█░█▄▄▄▄           ▐░▌     ▐░▐░▌           ｜\r\n"
								+ "｜               ▐░░▌     ▐░░▌          ▐░░░░░░░░░░░▌          ▐░▌      ▐░░▌           ｜\r\n"
								+ "｜                ▀▀       ▀▀            ▀▀▀▀▀▀▀▀▀▀▀            ▀        ▀▀            ｜\r\n"
								+ "｜―――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――｜");
						try {					
				       		System.out.println(">종료는 엔터를 누르세요.");
				       		System.in.read();
				       		System.in.skip(System.in.available());			       		
						}catch (Exception e) {
							e.printStackTrace();
						}
						return;
					}
					try {					
			       		System.out.println("> 엔터를 누르세요.");
			       		System.in.read();
			       		System.in.skip(System.in.available());			       		
					}catch (Exception e) {
						e.printStackTrace();
					}
					
					int n = rnd.nextInt(2)+1;
					pointWinner(n,team1,team2,t1, t2); // 스코어 
					pointgameWinner(n, team1, team2, t1, t2); // 스코어 듀스
					pointsetWinner(n, team1, team2, t1, t2); // 게임 듀스 
					if (t1.getScore()==5) {
						t1.plusGame();
						t1.setScore(0);
						t2.setScore(0);
						Print.dispScoreBoard(team1, team2, t1, t2); 
						if (t1.getGame()==6) {
							t1.plusSet();
							t1.setGame(0);
							t2.setGame(0);
							Print.dispScoreBoard(team1, team2, t1, t2); 
						}
						
					}else if (t2.getScore()==5) {
						t2.plusGame();
						t1.setScore(0);
						t2.setScore(0);
						Print.dispScoreBoard(team1, team2, t1, t2); 
						if (t2.getGame()==6) {
							t2.plusSet();
							t1.setGame(0);
							t2.setGame(0);
							Print.dispScoreBoard(team1, team2, t1, t2); 
						} 
					}
				}//score
			}//game
		}//set

	}//main
	public static void pointWinner(int p,ArrayList<Player> team1,ArrayList<Player> team2,MatchPoint t1,MatchPoint t2){		
		if (p==1) {
		if(t1.getScore()==3 && t2.getScore()<3) {
			t1.plusScore();
			t1.plusScore();
		}else {
			t1.plusScore();
		}
		}
		else if(p==2) {
			if(t1.getScore()<3&& t2.getScore()==3) {
				t2.plusScore();
				t2.plusScore();
			}else {
				t2.plusScore();
			}	
		}		
		Print.dispScoreBoard(team1, team2, t1, t2); 
	}
	public static void pointgameWinner(int p,ArrayList<Player> team1,ArrayList<Player> team2,MatchPoint t1,MatchPoint t2){		
		if(t1.getScore()==3 && t2.getScore()==3) {
			
			while (Math.abs(t1.getScore() - t2.getScore())<2) {
				try {
		       		System.out.println("> 엔터를 누르세요.");
		       		System.in.read();
		       		System.in.skip(System.in.available());
				}catch (Exception e) {
					e.printStackTrace();
				}
				if (p==1) {
					if(t2.getScore() > t1.getScore()) {
						t2.minusScore();	
					}else if(t1.getScore() > t2.getScore()) {
						t1.plusScore();
					}else if(t1.getScore()==t2.getScore()) {
						t1.plusScore();
					}
				} else if(p==2) {
					if(t1.getScore() > t2.getScore()) {
						t1.minusScore();
					}else if(t2.getScore() > t1.getScore()) {
						t2.plusScore();
					}else if(t2.getScore()==t1.getScore()) {
						t2.plusScore();
					}
				}
				Print.dispScoreBoard(team1, team2, t1, t2); 
			}
		}
	}
	public static void pointsetWinner(int p,ArrayList<Player> team1,ArrayList<Player> team2,MatchPoint t1,MatchPoint t2){		
		if (t1.getGame()==5 && t2.getGame()==5) {
			while (Math.abs(t1.getGame()-t2.getGame())<2) {
				try {
		       		System.out.println("> 엔터를 누르세요.");
		       		System.in.read();
		       		System.in.skip(System.in.available());
				}catch (Exception e) {
					e.printStackTrace();
				}
				if(t1.getScore()==0&&t2.getScore()==0) {
				t1.setScore(0); t2.setScore(0);
				}				
				if (p==1) {
					if(t1.getScore()==3 && t2.getScore()<3) {
						t1.plusScore();
						t1.plusScore();
					}else {
						t1.plusScore();
					}
					}
					else if(p==2) {
						if(t1.getScore()<3&& t2.getScore()==3) {
							t2.plusScore();
							t2.plusScore();
						}else {
							t2.plusScore();
						}	
					}
				
				Print.dispScoreBoard(team1, team2, t1, t2); 

				if (t1.getScore()==5) {
					t1.plusGame();
					t1.setScore(0); t2.setScore(0);
					Print.dispScoreBoard(team1, team2, t1, t2); 
				}else if (t2.getScore()==5) {
					t2.plusGame();
					t1.setScore(0); t2.setScore(0);
					Print.dispScoreBoard(team1, team2, t1, t2); 
				}

				if (t1.getGame() - t2.getGame() ==2) {
					t1.plusSet();
					t1.setScore(0); t2.setScore(0);
					t1.setGame(0); t2.setGame(0);
					Print.dispScoreBoard(team1, team2, t1, t2); 
					break;
				}else if ( t2.getGame() - t1.getGame() ==2) {
					t2.plusSet();
					t1.setScore(0); t2.setScore(0);
					t1.setGame(0); t2.setGame(0);
					Print.dispScoreBoard(team1, team2, t1, t2); 
					break;
				}
			}

		}
	}
}//class
