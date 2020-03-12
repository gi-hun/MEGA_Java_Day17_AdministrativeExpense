// # 관리비
package day_18;

import java.util.Scanner;

public class ArrayEx42 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[][] apt = {
				{101, 102, 103},	
				{201, 202, 203},	
				{301, 302, 303}	
			};
			
			int[][] pay = {
				{1000, 2100, 1300},	
				{4100, 2000, 1000},	
				{3000, 1600,  800}
			};
			
			// 문제 1) 각층별 관리비 합 출력
			// 정답 1) 4400, 7100, 5400
			System.out.println("문제 1) 각층별 관리비 합 출력");
			int[] garo = new int[3];
			for(int i=0;i<3;i++)
			{
				for(int j=0;j<3;j++)
				{
					garo[i] = garo[i] + pay[i][j];
				}
			}
			int count = 1;
			for(int i=0;i<3;i++)
			{
				System.out.println(count+"층: "+garo[i]);
				count++;
			}
			// 문제 2) 호를 입력하면 관리비 출력
			// 예    2) 입력 : 202	관리비 출력 : 2000
			System.out.println();
			System.out.println("문제 2) 호를 입력하면 관리비 출력");
			System.out.println("호를 입력하시요 ");
			int data = sc.nextInt();
			
			for(int i=0;i<3;i++)
			{
				for(int j=0;j<3;j++)
				{
					if(apt[i][j] == data)
					{
						System.out.println(apt[i][j]+"호의 관리비는 "+pay[i][j]+"입니다.");
					}
				}
			}
			// 문제 3) 관리비가 가장 많이 나온 집, 적게 나온 집 출력
			// 정답 3) 가장 많이 나온 집(201), 가장 적게 나온 집(303)
			System.out.println();
			System.out.println("문제 3) 관리비가 가장 많이 나온 집, 적게 나온 집 출력");
			int[][] max = new int[3][3];
			int[][] min = new int[3][3];
			
			int idx1 = 0;
			int idx2 = 0;
			
			int max_tax = pay[0][0];
			
			for(int i=0;i<3;i++)
			{
				for(int j=0;j<3;j++)
				{
					if(max_tax < pay[i][j])
					{
						max_tax=pay[i][j];
						idx1 = i;
						idx2 = j;
					}
				}
			}
			
			System.out.println("가장 많이 나온 아파트는 "+apt[idx1][idx2]+"호 입니다.");
			
			int min_tax = pay[0][0];
			
			for(int i=0;i<3;i++)
			{
				for(int j=0;j<3;j++)
				{
					if(max_tax > pay[i][j])
					{
						max_tax=pay[i][j];
						idx1 = i;
						idx2 = j;
					}
				}
			}
			
			System.out.println("가장 적게 나온 아파트는 "+apt[idx1][idx2]+"호 입니다.");
			// 문제 4) 호 2개를 입력하면 관리비 교체
			System.out.println();
			System.out.println("문제 4) 호 2개를 입력하면 관리비 교체");
			System.out.println("첫번째 아파트를 입력하시오");
			int data1 = sc.nextInt();
			System.out.println("두번째 아파트를 입력하시오");
			int data2 = sc.nextInt();
			
			idx1 = 0;	idx2 = 0;
			int idx3 =0;	int idx4 = 0;
			
			for(int i=0;i<3;i++)
			{
				for(int j=0;j<3;j++)
				{
					if(data1 == apt[i][j])
					{
						idx1 = i;
						idx2 = j;
					}
					if(data2 == apt[i][j])
					{
						idx3 = i;
						idx4 = j;
					}
				}
			}
			
			int temp = pay[idx1][idx2];
			pay[idx1][idx2] = pay[idx3][idx4];
			pay[idx3][idx4] = temp;
			
			for(int i=0; i<3; i++) {
				for(int j=0; j<3; j++) {
					System.out.print(pay[i][j] + " ");
				}
				System.out.println();
			}


	}
}
