package javaProject;

import java.util.ArrayList;

class Print {
	public static void printMain() {

//		System.out.println("====================================");
//		System.out.println("                  테니스 게임");
//		System.out.println("====================================");
		System.out.println(" ▄▄▄▄▄▄▄▄▄▄▄  ▄▄▄▄▄▄▄▄▄▄▄  ▄▄        ▄  ▄▄        ▄  ▄▄▄▄▄▄▄▄▄▄▄  ▄▄▄▄▄▄▄▄▄▄▄      \r\n"
				+ "▐░░░░░░░░░░░▌▐░░░░░░░░░░░▌▐░░▌      ▐░▌▐░░▌      ▐░▌▐░░░░░░░░░░░▌▐░░░░░░░░░░░▌     \r\n"
				+ " ▀▀▀▀█░█▀▀▀▀ ▐░█▀▀▀▀▀▀▀▀▀ ▐░▌░▌     ▐░▌▐░▌░▌     ▐░▌ ▀▀▀▀█░█▀▀▀▀ ▐░█▀▀▀▀▀▀▀▀▀      \r\n"
				+ "     ▐░▌     ▐░▌          ▐░▌▐░▌    ▐░▌▐░▌▐░▌    ▐░▌     ▐░▌     ▐░▌               \r\n"
				+ "     ▐░▌     ▐░█▄▄▄▄▄▄▄▄▄ ▐░▌ ▐░▌   ▐░▌▐░▌ ▐░▌   ▐░▌     ▐░▌     ▐░█▄▄▄▄▄▄▄▄▄      \r\n"
				+ "     ▐░▌     ▐░░░░░░░░░░░▌▐░▌  ▐░▌  ▐░▌▐░▌  ▐░▌  ▐░▌     ▐░▌     ▐░░░░░░░░░░░▌     \r\n"
				+ "     ▐░▌     ▐░█▀▀▀▀▀▀▀▀▀ ▐░▌   ▐░▌ ▐░▌▐░▌   ▐░▌ ▐░▌     ▐░▌      ▀▀▀▀▀▀▀▀▀█░▌     \r\n"
				+ "     ▐░▌     ▐░▌          ▐░▌    ▐░▌▐░▌▐░▌    ▐░▌▐░▌     ▐░▌               ▐░▌     \r\n"
				+ "     ▐░▌     ▐░█▄▄▄▄▄▄▄▄▄ ▐░▌     ▐░▐░▌▐░▌     ▐░▐░▌ ▄▄▄▄█░█▄▄▄▄  ▄▄▄▄▄▄▄▄▄█░▌     \r\n"
				+ "     ▐░▌     ▐░░░░░░░░░░░▌▐░▌      ▐░░▌▐░▌      ▐░░▌▐░░░░░░░░░░░▌▐░░░░░░░░░░░▌     \r\n"
				+ "      ▀       ▀▀▀▀▀▀▀▀▀▀▀  ▀        ▀▀  ▀        ▀▀  ▀▀▀▀▀▀▀▀▀▀▀  ▀▀▀▀▀▀▀▀▀▀▀      \r\n"
				+ "                                                                                   \r\n"
				+ " ▄▄▄▄▄▄▄▄▄▄▄  ▄▄▄▄▄▄▄▄▄▄▄  ▄▄▄▄▄▄▄▄▄▄▄  ▄▄▄▄▄▄▄▄▄▄▄  ▄▄▄▄▄▄▄▄▄▄▄                   \r\n"
				+ "▐░░░░░░░░░░░▌▐░░░░░░░░░░░▌▐░░░░░░░░░░░▌▐░░░░░░░░░░░▌▐░░░░░░░░░░░▌                  \r\n"
				+ "▐░█▀▀▀▀▀▀▀▀▀  ▀▀▀▀█░█▀▀▀▀ ▐░█▀▀▀▀▀▀▀█░▌▐░█▀▀▀▀▀▀▀█░▌ ▀▀▀▀█░█▀▀▀▀                   \r\n"
				+ "▐░▌               ▐░▌     ▐░▌       ▐░▌▐░▌       ▐░▌     ▐░▌                       \r\n"
				+ "▐░█▄▄▄▄▄▄▄▄▄      ▐░▌     ▐░█▄▄▄▄▄▄▄█░▌▐░█▄▄▄▄▄▄▄█░▌     ▐░▌                       \r\n"
				+ "▐░░░░░░░░░░░▌     ▐░▌     ▐░░░░░░░░░░░▌▐░░░░░░░░░░░▌     ▐░▌                       \r\n"
				+ " ▀▀▀▀▀▀▀▀▀█░▌     ▐░▌     ▐░█▀▀▀▀▀▀▀█░▌▐░█▀▀▀▀█░█▀▀      ▐░▌                       \r\n"
				+ "          ▐░▌     ▐░▌     ▐░▌       ▐░▌▐░▌     ▐░▌       ▐░▌                       \r\n"
				+ " ▄▄▄▄▄▄▄▄▄█░▌     ▐░▌     ▐░▌       ▐░▌▐░▌      ▐░▌      ▐░▌                       \r\n"
				+ "▐░░░░░░░░░░░▌     ▐░▌     ▐░▌       ▐░▌▐░▌       ▐░▌     ▐░▌                       \r\n"
				+ " ▀▀▀▀▀▀▀▀▀▀▀       ▀       ▀         ▀  ▀         ▀       ▀                        \r\n"
				+ "                                                                                   ");
		
		try {					
       		System.out.println("> 시작하시려면 엔터를 누르세요.");
       		System.in.read();
       		System.in.skip(System.in.available());       		
		}catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("\n\n\n\n\n\n\n");
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
		String[] scoresname = {"러브", "피프티", "서티", "포티","어드밴티지","GAME"};
		System.out.println("\n----------------------------------------------------------------------------");
		System.out.println("\t\t\t\tSET");
		System.out.println("----------------------------------------------------------------------------");
		if(team1.size() == 1) System.out.print("\tA팀\t");
		else System.out.print("\tA팀\t"); 
		switch (scores[t1.getScore()]) {
		case "00":		
			System.out.printf("\t\t%s\n",t1.getSet());
			break;
		case "15":
			System.out.printf("\t\t%s\n",t1.getSet());
			break;
		case "30":
			System.out.printf("\t\t%s\n",t1.getSet());
			break;			
		case "40":
			System.out.printf("\t\t%s\n",t1.getSet());
			break;
		case "AD":
			System.out.printf("\t\t%s\n",t1.getSet());
			break;
		case "G":
			System.out.printf("\t\t%s\n",t1.getSet());
			break;
		default:
			break;
		}		
		if(team2.size() == 1) System.out.print("\tB팀\t");
		else System.out.print("\tB팀\t"); 
		switch (scores[t2.getScore()]) {
		case "00":		
			System.out.printf("\t\t%s\n",t2.getSet());
			break;
		case "15":
			System.out.printf("\t\t%s\n",t2.getSet());
			break;
		case "30":			
			System.out.printf("\t\t%s\n",t2.getSet());
			break;			
		case "40":
			System.out.printf("\t\t%s\n",t2.getSet());
			break;
		case "AD":
			System.out.printf("\t\t%s\n",t2.getSet());
			break;
		case "G":
			System.out.printf("\t\t%s\n",t2.getSet());
			break;
		default:
			break;
		}		
		System.out.println();
	    System.out.println("\t\t\t\tGAME");
		System.out.println("----------------------------------------------------------------------------");
		if(team1.size() == 1) System.out.print("\tA조\t");
		else System.out.print("\tA조\t"); 
		switch (scores[t1.getScore()]) {
		case "00":		
			System.out.printf("\t\t%s\n",t1.getGame());
			break;
		case "15":
			System.out.printf("\t\t%s\n",t1.getGame());
			break;
		case "30":
			System.out.printf("\t\t%s\n",t1.getGame());
			break;			
		case "40":
			System.out.printf("\t\t%s\n",t1.getGame());
			break;
		case "AD":
			System.out.printf("\t\t%s\n",t1.getGame());
			break;
		case "G":
			System.out.printf("\t\t%s\n",t1.getGame());
			break;
		default:
			break;
		}		
		if(team2.size() == 1) System.out.print("\tB조\t");
		else System.out.print("\tB조\t"); 
		switch (scores[t2.getScore()]) {
		case "00":		
			System.out.printf("\t\t%s\n",t2.getGame());
			break;
		case "15":
			System.out.printf("\t\t%s\n",t2.getGame());
			break;
		case "30":			
			System.out.printf("\t\t%s\n",t2.getGame());
			break;			
		case "40":
			System.out.printf("\t\t%s\n",t2.getGame());
			break;
		case "AD":
			System.out.printf("\t\t%s\n",t2.getGame());
			break;
		case "G":
			System.out.printf("\t\t%s\n",t2.getGame());
			break;
		default:
			break;
		}		
		System.out.println();
		if(team1.size() == 1) System.out.println("\t\t\t\tSCORE");
//		else System.out.println("\t\t\t\tSCORE");
		System.out.println("----------------------------------------------------------------------------");
		
		if(team1.size() == 1) System.out.printf("\tA조 %s\t", team1.get(0).getName() );
		else System.out.printf("\tA조 %s,%s\t", team1.get(0).getName(), team1.get(1).getName()); 
		switch (scores[t1.getScore()]) {
		case "00":		
//			System.out.printf("\t%s(%s)\t\t%02d\t\t%02d\n",scores[t1.getScore()], scoresname[t1.getScore()], t1.getGame(), t1.getSet());
			System.out.printf("\t%s(%s)\n",scores[t1.getScore()], scoresname[t1.getScore()]);
			break;
		case "15":
//			System.out.printf("\t%s(%s)\t\t%02d\t\t%02d\n",scores[t1.getScore()], scoresname[t1.getScore()], t1.getGame(), t1.getSet());
			System.out.printf("\t%s(%s)\n",scores[t1.getScore()], scoresname[t1.getScore()]);
			break;
		case "30":
//			System.out.printf("\t%s(%s)\t\t%02d\t\t%02d\n",scores[t1.getScore()], scoresname[t1.getScore()], t1.getGame(), t1.getSet());
			System.out.printf("\t%s(%s)\n",scores[t1.getScore()], scoresname[t1.getScore()]);
			break;			
		case "40":
//			System.out.printf("\t%s(%s)\t\t%02d\t\t%02d\n",scores[t1.getScore()], scoresname[t1.getScore()], t1.getGame(), t1.getSet());
			System.out.printf("\t%s(%s)\n",scores[t1.getScore()], scoresname[t1.getScore()]);
			break;
		case "AD":
//			System.out.printf("\t%s(%s)\t\t%02d\t\t%02d\n",scores[t1.getScore()], scoresname[t1.getScore()], t1.getGame(), t1.getSet());
			System.out.printf("\t%s(%s)\n",scores[t1.getScore()], scoresname[t1.getScore()]);
			break;
		case "G":
//			System.out.printf("\t%s(%s)\t\t%02d\t\t%02d\n",scores[t1.getScore()], scoresname[t1.getScore()], t1.getGame(), t1.getSet());
			System.out.printf("\t%s(%s)\n",scores[t1.getScore()], scoresname[t1.getScore()]);
			break;
		default:
			break;
		}		
		if(team2.size() == 1) System.out.printf("\tB조 %s\t", team2.get(0).getName() );
		else System.out.printf("\tB조 %s,%s\t", team2.get(0).getName(), team2.get(1).getName()); 
		switch (scores[t2.getScore()]) {
		case "00":		
//			System.out.printf("\t%s(%s)\t\t%02d\t\t%02d\n",scores[t2.getScore()], scoresname[t2.getScore()], t2.getGame(), t2.getSet());
			System.out.printf("\t%s(%s)\n",scores[t2.getScore()], scoresname[t2.getScore()]);
			break;
		case "15":
//			System.out.printf("\t%s(%s)\t\t%02d\t\t%02d\n",scores[t2.getScore()], scoresname[t2.getScore()], t2.getGame(), t2.getSet());
			System.out.printf("\t%s(%s)\n",scores[t2.getScore()], scoresname[t2.getScore()]);
			break;
		case "30":
//			System.out.printf("\t%s(%s)\t\t%02d\t\t%02d\n",scores[t2.getScore()], scoresname[t2.getScore()], t2.getGame(), t2.getSet());
			System.out.printf("\t%s(%s)\n",scores[t2.getScore()], scoresname[t2.getScore()]);
			break;			
		case "40":
//			System.out.printf("\t%s(%s)\t\t%02d\t\t%02d\n",scores[t2.getScore()], scoresname[t2.getScore()], t2.getGame(), t2.getSet());
			System.out.printf("\t%s(%s)\n",scores[t2.getScore()], scoresname[t2.getScore()]);
			break;
		case "AD":
//			System.out.printf("\t%s(%s)\t\t%02d\t\t%02d\n",scores[t2.getScore()], scoresname[t2.getScore()], t2.getGame(), t2.getSet());
			System.out.printf("\t%s(%s)\n",scores[t2.getScore()], scoresname[t2.getScore()]);
			break;
		case "G":
//			System.out.printf("\t%s(%s)\t\t%02d\t\t%02d\n",scores[t2.getScore()], scoresname[t2.getScore()], t2.getGame(), t2.getSet());
			System.out.printf("\t%s(%s)\n",scores[t2.getScore()], scoresname[t2.getScore()]);
			break;
		default:
			break;
		}	
	}
	

	public static void printPlayerNumberCheck( int size, int i) {
		if(size < i) {
			System.out.printf("현재 선수목록에 선수가 %d명밖에 존재하지  않습니다.\n", size);
			System.out.println("프로그램 시작 메뉴에서 선수를 추가해주세요!");
			System.exit(0);
		}
	}
}