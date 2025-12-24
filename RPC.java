package day02;
import java.util.Scanner;
import java.util.Random;


public class RPC {

	public static void main(String[] args) {
		
		int com,user;
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		
		while(true) {
			com = rand.nextInt(3);
		
		com = rand.nextInt(3);//
		
		System.out.println("가위(0):바위(1):보(2) 중 하나를 입력하세요");
		user = scan.nextInt();
		if(user == 3) {
			System.out.println("가위(0): 바위:(1): 보(2) 중 하나를 입력하세요")
			break;
		}
		if((user==0 && com==1 ) || (user == 1 && com == 0) ||(user ==2 && com == 1)) {
			System.out.println("유저 승리!");			
			System.out.println(com);
		}		
		else if((user==0 && com==0 ) || (user == 1 && com == 1) ||(user ==2 && com == 2)) {
			System.out.println("둘다 비김");
		}
		else
			System.out.println("컴퓨터 승리!");
		}
		// TODO Auto-generated method stub
        //조건 판단.........
		//1.user가 승리 할 경우:가위:0,보:2,바위:가위, 보:바위
		//2.비기는 경우 가위:바위, 바위:바위, 보:보
		//3.use패
	}
}//무한반복

