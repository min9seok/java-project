package javaProject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

class TeamCreate {

	private static final String path = System.getProperty("user.dir")+"\\javaProject\\tenisMember.txt";

	//반환형 void 변환, 매개변수값 없애고 메서드 내에 경로값 저장해둠
	public static void writeTennisMember() {

		File f=new File(TeamCreate.path);
		char con='y';
		ArrayList<Player>plist=new ArrayList<Player>();

		do {		
			@SuppressWarnings({ "resource" })
			Scanner scanner=new Scanner(System.in);
			System.out.print("이름 입력 : ");
			String name=scanner.next();

			plist.add(new Player(name));

			System.out.println("계속할래?");

			try {
				con=(char) System.in.read();
				System.in.skip(System.in.available());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}while(con !='n' );

		//파일생성

		try(FileOutputStream fos=new FileOutputStream(f);
				ObjectOutputStream oos=new ObjectOutputStream(fos);
				) {
			oos.writeObject(plist);	
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void writeTennisMember2() {

		File f=new File(TeamCreate.path);
		char con='y';
		ArrayList<Player>plist=new ArrayList<Player>();

		do {		
			@SuppressWarnings("resource")
			Scanner scanner=new Scanner(System.in);
			System.out.print("이름 입력 : ");
			String name=scanner.next();

			plist.add(new Player(name));

			System.out.println("계속할래?");

			try {
				con=(char) System.in.read();
				System.in.skip(System.in.available());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}while(con !='n' );

		//파일생성

		try(FileOutputStream fos=new FileOutputStream(f,true);
				ObjectOutputStream oos=new ObjectOutputStream(fos);
				) {
			oos.writeObject(plist);	
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@SuppressWarnings("unchecked")
	public static void readTennisMember(ArrayList<Player> players)  {
		ArrayList<Player>plist=null;
		players.clear();
		File f = new File(TeamCreate.path);
		try(FileInputStream fis=new FileInputStream(f);
				ObjectInputStream ois=new ObjectInputStream(fis);
				) {
			plist=(ArrayList<Player>)ois.readObject();
			for (int i = 0; i < plist.size(); i++) {
					players.add(plist.get(i));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}		
	}

	public static void newFile() {

		System.out.println("새로운 플레이어 리스트를 작성하시겠습니까? (y/n)");
		System.out.println("(기존의 리스트는 삭제됩니다)");
		try {
			char con = (char)System.in.read();
			System.in.skip(System.in.available());

			if(Character.toUpperCase(con) == 'Y') {
				TeamCreate.writeTennisMember();
			}else {
				TeamCreate.writeTennisMember2();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}