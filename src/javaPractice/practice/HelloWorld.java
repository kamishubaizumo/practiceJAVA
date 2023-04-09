package practice;

public class HelloWorld {

	public static void main(String[] args) {
		
		String name = "山田太郎";
		short age = 32767;
		String info = "よろしくお願いします";

		
		System.out.println("名前は" + name + "です");
		System.out.println("shortは"+ age +"が限界です");
		System.out.println("一言:"+ info);
		
		
//		if文　60点以上合格　以内は不合格
		int test = 40;
		
		if (test >= 60) {
			System.out.println("合格");
		} else {
			System.out.println("不合格");
		}
		
		
//		swith文　1位優勝 2位準優勝　3位以降参加賞
		
		int rank = 5;
		
		switch(rank) {
			case 1:
				System.out.println("優勝");
				break;
			case 2:
				System.out.println("準優勝");
				break;
			default :
				System.out.println("参加賞");
				break;
		}
		
//		for文　文字列3ループ
		
		String loop = "ループ";
		
		for (int i = 1;i <= 3; i++) {
			System.out.println(loop);
		}
		
//		whoile文　文字列3回ループ
		String loop2 = "ループ";
		int i = 1;
		
		while(i <= 3){
			System.out.println(loop2 + i);
			i = i + 1;
		}
		
//		for文で家族をループ表示
		
		String[] family = new String[4];
		
		family[0] = "父";
		family[1] = "母";
		family[2] = "姉";
		family[3] = "弟";
		
		for (int s = 0; s< 4; s++) {
			System.out.println(family[s] + " ");
		}
		
//		else if 2つのテストが60点以上いいね　どちらかが60点以上 まぁまぁ　それ以外 残念
		
		int testA = 0;
		int testB = 0;
		
		if(testA >= 60 && testB >= 60) {
			System.out.println("いいね");
		} else if (testA >= 60 || testB >= 60 ) {
			System.out.println("惜しい");
		}else {
			System.out.println("残念");
		}
		
		
//		if文で、奇数、偶数かを判定
		
		int num = 3;
		
		if(num > 2) {
			if(num % 2 == 0) {
				System.out.println("偶数です");
			}else {
				System.out.println("奇数です");
			}
		}else {
			System.out.println(num + ":0より大きい数字を入れてください");
		}
		
		
//		for文で☆を使って三角形を表示
		for(int t = 0; t < 5; t++) {
			for(int j = 0; j <= t; j++) {
				System.out.print("☆");
			}
			System.out.println();
		}
		
//		for文で九九の表を作成
		int answer = 0;
		for(int a = 1; a< 10; a++) {
			for(int b = 1; b < 10; b++ ) {
			answer = a * b;
				if(answer < 10) {
					System.out.print(" ");
				}
				System.out.print(" " + a * b);
			}
				System.out.println();
		}

		
//		配列の要素と要素数を表示
		
		String[] customer = new String[4];
		
		customer[0] = "田中";
		customer[1] = "山田";
		customer[2] = "野沢";
		customer[3] = "厚木";
		for(int c = 0; c < 4; c++) {
			System.out.println(customer[c]);
		}
		System.out.println("合計"+ customer.length + "人です");
	}
}

