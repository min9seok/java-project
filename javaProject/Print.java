package javaProject;

import java.util.ArrayList;

class Print {
	public static void printMain() {

		System.out.println("====================================");
		System.out.println("                  테니스 게임");
		System.out.println("====================================");
		System.out.println();
		System.out.println("\t1. 게임 시작");
		System.out.println("\t2. 새로운 플레이어 리스트 작성");
		System.out.println("\t3. 종료");
		System.out.print("\n\t입력 : ");
	}

	public static void printRuleSelect() {
		System.out.println();
		System.out.println("===========================");
		System.out.println("             경기 규칙을 선택해주세요!");
		System.out.println("===========================");
	}

	public static void dispScoreBoard(ArrayList<Player> team1, ArrayList<Player> team2, 
			MatchPoint t1, MatchPoint t2) {

		String[] scores = {"00", "15", "30", "40","AD","G"};
		System.out.println("\n----------------------------------------------------------------------------");
		if(team1.size() == 1) System.out.println("\t\t\t\tSCORE\t\tGAME\t\tSET");
		else System.out.println("\t\t\t\t\tSCORE\tGAME \tSET");
		System.out.println("----------------------------------------------------------------------------");

		if(team1.size() == 1) System.out.printf("\tA조 %s\t", team1.get(0).getName() );
		else System.out.printf("\tA조 %s,%s\t", team1.get(0).getName(), team1.get(1).getName()); 

		System.out.printf("\t%s\t\t%02d\t\t%02d\n", scores[t1.getScore()], t1.getGame(), t1.getSet()); 

		if(team2.size() == 1) System.out.printf("\tB조 %s\t", team2.get(0).getName() );
		else System.out.printf("\tB조 %s,%s\t", team2.get(0).getName(), team2.get(1).getName()); 

		System.out.printf("\t%s\t\t%02d\t\t%02d\n", scores[t2.getScore()], t2.getGame(), t2.getSet()); 
	}
	

	public static void printPlayerNumberCheck( int size, int i) {
		if(size < i) {
			System.out.printf("현재 선수목록에 선수가 %d명밖에 존재하지  않습니다.\n", size);
			System.out.println("프로그램 시작 메뉴에서 선수를 추가해주세요!");
			System.exit(0);
		}
	}
}