// # ������
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
			
			// ���� 1) ������ ������ �� ���
			// ���� 1) 4400, 7100, 5400
			System.out.println("���� 1) ������ ������ �� ���");
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
				System.out.println(count+"��: "+garo[i]);
				count++;
			}
			// ���� 2) ȣ�� �Է��ϸ� ������ ���
			// ��    2) �Է� : 202	������ ��� : 2000
			System.out.println();
			System.out.println("���� 2) ȣ�� �Է��ϸ� ������ ���");
			System.out.println("ȣ�� �Է��Ͻÿ� ");
			int data = sc.nextInt();
			
			for(int i=0;i<3;i++)
			{
				for(int j=0;j<3;j++)
				{
					if(apt[i][j] == data)
					{
						System.out.println(apt[i][j]+"ȣ�� ������� "+pay[i][j]+"�Դϴ�.");
					}
				}
			}
			// ���� 3) ������ ���� ���� ���� ��, ���� ���� �� ���
			// ���� 3) ���� ���� ���� ��(201), ���� ���� ���� ��(303)
			System.out.println();
			System.out.println("���� 3) ������ ���� ���� ���� ��, ���� ���� �� ���");
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
			
			System.out.println("���� ���� ���� ����Ʈ�� "+apt[idx1][idx2]+"ȣ �Դϴ�.");
			
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
			
			System.out.println("���� ���� ���� ����Ʈ�� "+apt[idx1][idx2]+"ȣ �Դϴ�.");
			// ���� 4) ȣ 2���� �Է��ϸ� ������ ��ü
			System.out.println();
			System.out.println("���� 4) ȣ 2���� �Է��ϸ� ������ ��ü");
			System.out.println("ù��° ����Ʈ�� �Է��Ͻÿ�");
			int data1 = sc.nextInt();
			System.out.println("�ι�° ����Ʈ�� �Է��Ͻÿ�");
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
