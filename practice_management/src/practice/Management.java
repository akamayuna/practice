package practice;

import java.util.Scanner;

public class Management {
	public static void main(String[] args) {

		String staffName = "staff";
		String staffId = "00000";
		String staffPw = "12345";

		String[] professor = new String[6];
		String[] student = new String[7];

		while(true){
			System.out.println("==========アカデミー管理システム==========");
			System.out.println("1.ログイン");
			System.out.println("======================================");

			Scanner sc = new Scanner(System.in);
			String line1 = sc.nextLine();

			//　1.ログイン選択
			if(line1.equals("1")) {
				System.out.println("会員でログインします。");
				System.out.println("会員番号：");
				String line2 = sc.nextLine();
				System.out.println("パスワード：");
				String line3 = sc.nextLine();

				while(true){
					if(line2.equals(professor[5]) && line3.equals(professor[2])) {
						System.out.println("------------------------------");
						System.out.println("ようこそ！" + professor[0] + "さん！");
						System.out.println("1.担当講義閲覧　　2.講義入力　　3.情報修正　　4.ログアウト");
						System.out.println("------------------------------");
						return;

					} else if (line2.equals(student[6]) && line3.equals(student[2])) {
						System.out.println("------------------------------");
						System.out.println("ようこそ！" + student[0] + "さん！");
						System.out.println("1.全体講義一覧及び申請　　2.自分の講義一覧及びキャンセル　　3.ログアウト");
						System.out.println("------------------------------");
						return;

						// スタッフログイン
					} else if(line2.equals(staffId) && line3.equals(staffPw)) {
						System.out.println("------------------------------");
						System.out.println("ようこそ！" + staffName + "さん！");
						System.out.println("1.ユーザー登録　　2.講義承認　　3.全体講義一覧　　4.ログアウト");
						System.out.println("------------------------------");
						//選択記入
						String line4 = sc.nextLine();
						// ユーザー登録
						if(line4.equals("1")) {
							System.out.println("1.教授登録　　2.生徒登録");
							String line5 = sc.nextLine();

							// 教授登録
							if(line5.equals("1")) {
								System.out.println("情報を入力してください。");

								System.out.println("名前：");
								professor[0]  = sc.nextLine();
								System.out.println("年齢：");
								professor[1] = sc.nextLine();
								System.out.println("パスワード：");
								professor[2] = sc.nextLine();
								System.out.println("電話番号：");
								professor[3] = sc.nextLine();
								System.out.println("所属学部：");
								professor[4] = sc.nextLine();
								professor[5] = "0000";


								System.out.println("======================================================================");
								System.out.println("名前："+ professor[0]+"  年齢："+professor[1]+"  電話番号："+professor[3]+"  所属学部："+professor[4]);
								System.out.println("======================================================================");

								// 生徒登録
							} else if(line5.equals("2")) {
								System.out.println("情報を入力してください。");

								System.out.println("名前：");
								student[0]  = sc.nextLine();
								System.out.println("パスワード：");
								student[1] = sc.nextLine();
								System.out.println("年齢：");
								student[2] = sc.nextLine();
								System.out.println("電話番号：");
								student[3] = sc.nextLine();
								System.out.println("専攻：");
								student[4] = sc.nextLine();
								System.out.println("学番：");
								student[5] = sc.nextLine();
								student[6] ="0001";

								System.out.println("======================================================================");
								System.out.println("名前："+ student[0]+"  年齢："+student[2]+"  電話："+student[3]+"  専攻："+student[4]+"  学番："+student[5]);
								System.out.println("======================================================================");

							}
							System.out.println("このまま会員登録を進めますか。（Y/N）");
							String line6 = sc.nextLine();
							if (line6.equals("Y")) {
								System.out.println("登録が完了しました。");
								if (line5.equals("1")) {
									System.out.println("会員番号は"+professor[5]+"です");
								} else if (line5.equals("2")) {
									System.out.println("会員番号は"+student[6]+"です");
								}
							}

						} else if(line4.equals("4")) {
							break;

						}

					}

				}

			}

		}

	}
}

