package javaProject;

import java.util.ArrayList;
import java.util.Scanner;

class TeamSelection{

	public static int teamDataInput(int set, int rule,
			ArrayList<Player> players, 
			ArrayList<Player> team1, ArrayList<Player> team2) {
		@SuppressWarnings({ "unused", "resource" })
		Scanner scanner = new Scanner(System.in);

		@SuppressWarnings("unused")
		String input = "";

		if(rule == 1) {	//단식 선택
			
			TeamCreate.readTennisMember(players);
			Print.printPlayerNumberCheck(players.size(), 2);

			System.out.println("\n\n\n\n1 팀원 선택");
			teamSelect(players, team1);
			System.out.println("\n\n\n\n2 팀원 선택" );
			teamSelect(players, team2);

		}else if(rule == 2){

			if(rule == 1 || rule == 2) {

				TeamCreate.readTennisMember(players);
				Print.printPlayerNumberCheck(players.size(), 4);
				System.out.println("\n\n\n\n1 팀원 선택");
				teamSelect(players, team1);
				teamSelect(players, team1);

				System.out.println("\n\n\n\n\n2 팀원 선택");
				teamSelect(players, team2);
				teamSelect(players, team2);
			}
		}

		System.out.println("1팀 : " + team1);
		System.out.println("2팀 : " + team2);

		if(set == 1) {
		return 3;	
		}else {
		return 5;	
		}
	}



	private static Player selectList(ArrayList<Player> players, int select) {
		return players.remove(select-1);
	}

	private static void teamSelect(ArrayList<Player> players, ArrayList<Player> team) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		String input = "";
		boolean flag = false;
		int playersSize = players.size();
		String regex = String.format("[1-%d]", playersSize);
		do {
			if(flag == true) System.out.println("잘못 선택하셨습니다.");
			int idx = 1;
			System.out.println("============");
			for (int i = 0; i < players.size(); i++) {
					System.out.printf("%d : %s\n", idx++, players.get(i));
			}
			System.out.println("============");
			System.out.print("팀원 선택 : ");
			input = scanner.next();
		} while (flag = !((input+"").matches(regex)));

		int select = Integer.valueOf(input);
		team.add(selectList(players, select));
	}
}