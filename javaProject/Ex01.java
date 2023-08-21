package javaProject;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;

public class Ex01 {
   public static void main(String[] args) throws InterruptedException, IOException {
      String[] playerList = {"박민석", "유희진", "고경림", "임경재", "이지현" , "김정주", "김호영"};

      // 단식 복식 선택
      // 단식 : true / 복식 : false
      boolean isSingle = false;

      // 선수 입력
      Team teamA, teamB;
      ArrayList<String> teamAPlayer = new ArrayList<>();
      ArrayList<String> teamBPlayer = new ArrayList<>();

      if (isSingle) {
         teamAPlayer.add( playerList[0] );
         teamBPlayer.add( playerList[1] );
      } else {
         teamAPlayer.add( playerList[0] );
         teamAPlayer.add( playerList[1] );
         teamBPlayer.add( playerList[2] );
         teamBPlayer.add( playerList[3] );
      }

      teamA = new Team(teamAPlayer);
      teamB = new Team(teamBPlayer);

      // 어드벤티지 유무 입력
      // 듀스 O : true / X : false
      boolean advantage = true;

      // 세트설정
      // 3set : true / 5set : false
      boolean set = true;

      // 게임 인스턴스 생성
      ScoreBoard scoreBoard = new ScoreBoard(teamA, teamB, advantage, set, isSingle);

      // 게임 진행
      scoreBoard.game();

      // 게임 결과 출력
      scoreBoard.resultFileWrite();

   } //main
} //class


class Team{
   private ArrayList<String> player;

   public Team(ArrayList<String> player) {
      this.player = player;
   }

   public ArrayList<String> getPlayer() {
      return player;
   }

   public void setPlayer(ArrayList<String> player) {
      this.player = player;
   }

   @Override
   public String toString() {
      return "Player : " +player ;
   }

} //class Team



class ScoreBoard {
   private Team teamA;
   private Team teamB;
   private boolean advantage;
   private boolean is3set;
   private boolean isSingle;
   final String[] points = {"0", "15", "30", "40", "40A", "G"};
   private String[] pointScore = {"0","0"};
   private int[] pointScoreDuce = new int[2];
   private ArrayList<String> gameWinner = new ArrayList<>();
   private ArrayList<String> setWinner = new ArrayList<>();

   public ScoreBoard(Team teamA, Team teamB, boolean advantage, boolean is3set, boolean isSingle) {
      this.teamA = teamA;
      this.teamB = teamB;
      this.advantage = advantage;
      this.is3set = is3set;
      this.isSingle = isSingle;
   }


   public void game() throws InterruptedException, IOException {
      int setCount = is3set? 2 : 3;

      while ( Collections.frequency(setWinner, "teamA")<setCount && Collections.frequency(setWinner, "teamB")<setCount ) {

         while (  Collections.frequency(gameWinner, "teamA")<4 && Collections.frequency(gameWinner, "teamB")<4  ) {

            int winnerIndex;
            String winnerScore;
            do {
               winnerIndex = (int)(Math.random()*2);
               //System.out.println( winnerIndex );
               winnerScore = pointWinner(winnerIndex);      
               //System.out.println( winnerScore );
               this.dispScoreBoard(null);
//               Thread.sleep(1000);
       		// 일시정지 + 엔터 계속
       		System.out.println("> 엔터치면 진행한다.");
       		System.in.read();
       		System.in.skip(System.in.available());
            } while ( !winnerScore.equals("60") );

            this.gameWinner.add( winnerIndex==0? "teamA" : "teamB" );

            // 점수 리셋
            this.pointScore[0] = "0";
            this.pointScore[1] = "0";
            this.pointScoreDuce[0] = 0;
            this.pointScoreDuce[1] = 0;

         } //while

         this.setWinner.add( Collections.frequency(gameWinner, "teamA")>Collections.frequency(gameWinner, "teamB")? "teamA" : "teamB" );
         this.dispScoreBoard(null);

         gameWinner = new ArrayList<>();

      } //while

      System.out.printf("WINNER : %s\n", Collections.frequency(setWinner, "teamA")>Collections.frequency(setWinner, "teamA")? "teamA" : "teamB");

   } //game()


   // 해당 인덱스의 팀 점수 카운팅
   public String pointWinner(int p) {
      switch (this.pointScore[p]) {
      case "0":
         this.pointScore[p] = "15";
         break;
      case "15":
         this.pointScore[p] = "30";
         break;
      case "30":
         this.pointScore[p] = "40";
         break;
      case "40":
         if (advantage) {
            if (this.pointScore[ p==0? 1 : 0 ].equals("40") || this.pointScore[ p==0? 1 : 0 ].equals("40A")) {
               this.pointScore[p] = "40A";
               this.pointScoreDuce[p]++;
            } else {
               this.pointScore[p] = "60";
            }
         } else {
            this.pointScore[p] = "60";
         }
         break;
      case "40A":
         if (this.pointScore[ p==0? 1 : 0 ].equals("40")) {
            this.pointScore[p] = "60";
         } else {
            this.pointScoreDuce[p]++;
            if ( this.pointScoreDuce[p] == (this.pointScoreDuce[ p==0? 1 : 0 ])+2 ) {
               this.pointScore[p] = "60";
            } //if
         }
         break;
      } //switch

      return this.pointScore[p];
   } //pointWinner()


   public void dispScoreBoard(PrintStream sysout) {
      if (sysout !=null) {
         System.setOut(sysout);
      } //if
      
      System.out.println("=".repeat(40));
      System.out.printf("  [A Team] %s\n", this.teamA.toString());
      System.out.printf("  [B Team] %s\n", this.teamB.toString());
      System.out.println("=".repeat(40));

      System.out.println("  [Score Board]\n");

      System.out.println("  --Set Winner--");
      for (int i = 0; i < (is3set? 3:5); i++) {
         System.out.printf("\t%dset\t", i+1);
      } // for
      System.out.println();
      for (int i = 0; i < setWinner.size(); i++) {
         System.out.printf("\t%s", setWinner.get(i));
      } // for
      System.out.println("\n");

      System.out.println("  --Game Winner--");
      int gameSize = gameWinner.size();
      for (int i = 0; i < gameSize; i++) {
         System.out.printf("\t%dgame", i+1);
      } // for
      System.out.println();
      for (int i = 0; i < gameSize; i++) {
         System.out.printf("\t%s", gameWinner.get(i));
      } // for
      System.out.println("\n");

      System.out.println("\tteamA\tteamB");
      System.out.printf("\t%s\t\t%s\n", pointScore[0], pointScore[1]);

      System.out.println("=".repeat(40));
      System.out.println();
   } //dispScoreBoard()


   public void resultFileWrite() {
      String fileName = ".\\src\\days27\\TennisGameResult.txt";
      //초기화 하는 파일의 확장자 : ini
      try ( PrintStream printStream = new PrintStream(new FileOutputStream(fileName))) {
         dispScoreBoard(printStream);
      } catch (Exception e) {
         e.printStackTrace();
      } //try-catch
   } //resultFileWrite()

}