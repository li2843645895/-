import java.util.*;
import java.io.IOException;

public class PostGradutors implements Teachermanage, Studentmange {
	//���ù��һ���˰��3500Ԫ
	public static final Double basicTax = 3500.0;
	//����setStudentname���������������ҵ�ѧ������
	String setStudentname() {
		//���û��ַ��������У����ݱ���ҵ�ѧ��
		String[] name = { "С��", "�ŷ�", "����", "�", "�Ż�", "����", "̩��", "��־", "ŷ������", "��ػ�" };
		System.out.println("�������������(�������Ϊ��0��ʼ������)");
		Scanner reader4 = new Scanner(System.in);
		int namenum = reader4.nextInt();
		return name[namenum];
	};
//����getStudentname()������������ѧ������
	String getStudentname() {
		String name = setStudentname();
		return name;
	}
//��ѧ��������ֵ���ַ�������name
	String name = getStudentname();
//����setstudentAge()���������û���������
	int setStudentAge() {
		System.out.println("��������������");
		Scanner reader5 = new Scanner(System.in);
		return reader5.nextInt();
	};
//����getStudentAge()�����������õ�ѧ������
	int getStudentAge() {
		int age = setStudentAge();
		return age;
	}
//��ѧ�����丳ֵ�����ͱ���age
	int age = getStudentAge();
//����setStudentSex()��������ѧ�������Ա�
	String setStudentSex() {
		System.out.println("�����������Ա�(����0Ϊ��������1ΪŮ��)");
		String sex[] = { "��", "Ů" };
		Scanner reader6 = new Scanner(System.in);
		int sexnum = reader6.nextInt();
		return sex[sexnum];
	};
//����getStudentSex()�����������õ�ѧ���Ա�
	String getStudentSex() {
		String sex = setStudentSex();
		return sex;
	};
//��ѧ���Ա�ֵ���ַ�������sex
	String sex = getStudentSex();
//��д�ӿ�Teachermanage��java�е�salary()����
	public void salary() {
		Double sum = 0.00;
		Double taxSum = 0.00;
		Double Tax;
		int time=0;
		System.out.println("������ÿһ���µĹ���");
		//ͨ���쳣��䣬���û�����ÿһ���µĹ��ʣ��������˫�����ͣ�����򱨴����������룬ֱ��������ȷΪֹ
		while(time==0) {
		try {
			for (int i = 0; i < 12; i++) {
				System.out.println("���������" + (i + 1) + "���µĹ���");
				Scanner readerthree = new Scanner(System.in);
				Double monthIncome = readerthree.nextDouble();
				sum = sum + monthIncome;
				if (monthIncome <= basicTax) {
					System.out.println("���ù�������3500Ԫ������Ҫ��˰");
				} else if (monthIncome > basicTax) {
					if ((monthIncome - 3500) < 1500) {
						Tax = (monthIncome - 3500) * 0.03;
						taxSum = taxSum + Tax;
						System.out.println("��������Ҫ��˰" + Tax + "Ԫ");
					} else if (1500 < monthIncome && monthIncome <= 4500) {
						Tax = (monthIncome - 3500) * 0.1 - 105;
						taxSum = taxSum + Tax;
						System.out.println("��������Ҫ��˰" + Tax + "Ԫ");
					} else if (4500 < monthIncome && monthIncome <= 9000) {
						Tax = (monthIncome - 3500) * 0.2 - 555;
						taxSum = taxSum + Tax;
						System.out.println("��������Ҫ��˰" + Tax + "Ԫ");
					} else if (9000 < monthIncome && monthIncome <= 35000) {
						Tax = (monthIncome - 3500) * 0.25 - 1005;
						taxSum = taxSum + Tax;
						System.out.println("��������Ҫ��˰" + Tax + "Ԫ");
					} else if (35000 < monthIncome && monthIncome <= 80000) {
						Tax = (monthIncome - 3500) * 0.5 - 5505;
						taxSum = taxSum + Tax;
						System.out.println("��������Ҫ��˰" + Tax + "Ԫ");
					} else if (80000 < monthIncome) {
						Tax = (monthIncome - 3500) * 0.45 - 13505;
						taxSum = taxSum + Tax;
						System.out.println("��������Ҫ��˰" + Tax + "Ԫ");
					}
				}
			}
			time=1;
			//���ѧ��һ���нˮ
			System.out.println("����һ�����һ���нˮΪ��" + sum);
			//���ѧ���������Ҫ��˰���
			System.out.println("����һ�����һ����Ҫ��˰���Ϊ��" + taxSum);
		} catch (Exception e) {
			//�������˫�����ͣ���ʼִ�У���ʾ�û������쳣��Ҫ����������
			System.out.println("---------------------------�����쳣-------------------------" + e.getMessage());
			e.printStackTrace();
			System.out.println("---------------<<<<<<<<<<<<<<<����������!>>>>>>>>>>>>>>>----------------");
		}}
		
	}
//��д�ӿ�Teachermanage��java�е�salarySearch()����
	public void salarySearch() {
		salary();
	};
//��д�ӿ�Studentmange��java�е�fee()����,�������ѧ����ѧ������ѧ��
	public Double fee() {
		System.out.println("�����뱾ѧ��ѧ��");
		Scanner reader = new Scanner(System.in);
		Double feeSum = reader.nextDouble();
		return feeSum;
	};
//��д�ӿ�Studentmange��java�е�feeSearch()����,���ѧ����ѧ������ѧ��
	public void feeSearch() {
		Double feeSum1 = fee();
		System.out.println("��ѧ������Ҫ��ѧ�Ѷ�Ϊ��" + feeSum1);
	};

}
