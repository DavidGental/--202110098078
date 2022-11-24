package work;

import java.util.ArrayList;
import java.util.Scanner;

public interface ISignUp {
	 public void print();
	 public boolean addStudent (int stuType);
	 public static IParams parse() throws Exception{
		 Scanner reader = new Scanner(System.in);
		 System.out.print("大班名额：");
		 SchoolSystem.big=reader.nextInt();
		 System.out.print("中班名额：");
		 SchoolSystem.middle=reader.nextInt();
		 System.out.print("小班名额：");
		 SchoolSystem.small=reader.nextInt();
		 IParams ip = new IParams() {
			public int getBig() {
				return SchoolSystem.big;
			}

			@Override
			public int getMedium() {
				return SchoolSystem.middle;
			}

			@Override
			public int getSmall() {
				return SchoolSystem.small;
			}

			@Override
			public ArrayList<Integer> getPlanSignUp() {
				ArrayList<Integer> input = new ArrayList<Integer>();
				System.out.print("进入班级：");
				Integer a = reader.nextInt();
				input.add(a);
				System.out.print("进入班级：");
				Integer b = reader.nextInt();
				input.add(b);
				System.out.print("进入班级：");
				Integer c = reader.nextInt();
				input.add(c);
				System.out.print("进入班级：");
				Integer d = reader.nextInt();
				input.add(d);
				return input;
			}
			 
		 };
		return ip;
		 
	 };


}
