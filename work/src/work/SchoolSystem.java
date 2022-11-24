package work;

import java.util.ArrayList;
import java.util.Scanner;

public class SchoolSystem implements ISignUp {
	public static  int big = 0;
	public static  int middle = 0;
	public static  int small = 0;
	public String operation;
	//public int count;
	public int tempcou=0;
	public static boolean[] result;
	
	public SchoolSystem() {
		this.operation=null;
		//this.count=0;
	}
	public SchoolSystem(int b,int m,int s) {
		big=b;
		middle=m;
		small=s;
		this.result=new boolean[4];
	}
	public static void main(String[] args) throws Exception {
        IParams params = ISignUp.parse();//SchoolSystem.parse();
        SchoolSystem sc = new SchoolSystem (params.getBig(), params.getMedium(),params.getSmall());
        ArrayList<Integer> plan = params. getPlanSignUp ();
        for (int i = 0; i < plan.size(); i++) {
            result[i]=sc. addStudent (plan.get(i));
        }
        sc.print();
}

	@Override
	public void print() {
		System.out.print("[");
		System.out.print("null,");
		for(int i=0;i<this.result.length;i++) {
			System.out.print(this.result[i]+",");
		}
		System.out.print("]");
		
	}

	@Override
	public boolean addStudent(int stuType) {
		if(stuType==1&&this.big>0) {
			big-=1;
			return true;
		}
		if(stuType==2&&this.middle>0) {
			middle-=1;
			return true;
		}
		if(stuType==3&&this.small>0) {
			small-=1;
			return true;
		}
		return false;
	}



}
