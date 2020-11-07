import java.util.*;
import java.io.IOException;

public class PostGradutors implements Teachermanage, Studentmange {
	//设置国家基础税收3500元
	public static final Double basicTax = 3500.0;
	//创建setStudentname（）方法用来返找到学生姓名
	String setStudentname() {
		//将用户字符串数组中，根据编号找到学生
		String[] name = { "小明", "张飞", "刘翔", "李俊", "张华", "景驰", "泰宇", "刘志", "欧阳艄公", "李回回" };
		System.out.println("请输入您的序号(您的序号为从0开始的数字)");
		Scanner reader4 = new Scanner(System.in);
		int namenum = reader4.nextInt();
		return name[namenum];
	};
//创建getStudentname()方法用来返回学生姓名
	String getStudentname() {
		String name = setStudentname();
		return name;
	}
//将学生姓名赋值给字符串变量name
	String name = getStudentname();
//创建setstudentAge()方法，让用户输入年龄
	int setStudentAge() {
		System.out.println("请输入您的年龄");
		Scanner reader5 = new Scanner(System.in);
		return reader5.nextInt();
	};
//创建getStudentAge()方法，用来得到学生年龄
	int getStudentAge() {
		int age = setStudentAge();
		return age;
	}
//将学生年龄赋值给整型变量age
	int age = getStudentAge();
//创建setStudentSex()方法，让学生输入性别
	String setStudentSex() {
		System.out.println("请输入您的性别：(输入0为男性输入1为女性)");
		String sex[] = { "男", "女" };
		Scanner reader6 = new Scanner(System.in);
		int sexnum = reader6.nextInt();
		return sex[sexnum];
	};
//创建getStudentSex()方法，用来得到学生性别
	String getStudentSex() {
		String sex = setStudentSex();
		return sex;
	};
//将学生性别赋值给字符串变量sex
	String sex = getStudentSex();
//重写接口Teachermanage。java中的salary()方法
	public void salary() {
		Double sum = 0.00;
		Double taxSum = 0.00;
		Double Tax;
		int time=0;
		System.out.println("请输入每一个月的工资");
		//通过异常语句，让用户输入每一个月的工资，若输入非双浮点型，则程序报错，并重新输入，直到输入正确为止
		while(time==0) {
		try {
			for (int i = 0; i < 12; i++) {
				System.out.println("请输入你第" + (i + 1) + "个月的工资");
				Scanner readerthree = new Scanner(System.in);
				Double monthIncome = readerthree.nextDouble();
				sum = sum + monthIncome;
				if (monthIncome <= basicTax) {
					System.out.println("所得工资少于3500元，不需要纳税");
				} else if (monthIncome > basicTax) {
					if ((monthIncome - 3500) < 1500) {
						Tax = (monthIncome - 3500) * 0.03;
						taxSum = taxSum + Tax;
						System.out.println("本月你需要纳税" + Tax + "元");
					} else if (1500 < monthIncome && monthIncome <= 4500) {
						Tax = (monthIncome - 3500) * 0.1 - 105;
						taxSum = taxSum + Tax;
						System.out.println("本月你需要纳税" + Tax + "元");
					} else if (4500 < monthIncome && monthIncome <= 9000) {
						Tax = (monthIncome - 3500) * 0.2 - 555;
						taxSum = taxSum + Tax;
						System.out.println("本月你需要纳税" + Tax + "元");
					} else if (9000 < monthIncome && monthIncome <= 35000) {
						Tax = (monthIncome - 3500) * 0.25 - 1005;
						taxSum = taxSum + Tax;
						System.out.println("本月你需要纳税" + Tax + "元");
					} else if (35000 < monthIncome && monthIncome <= 80000) {
						Tax = (monthIncome - 3500) * 0.5 - 5505;
						taxSum = taxSum + Tax;
						System.out.println("本月你需要纳税" + Tax + "元");
					} else if (80000 < monthIncome) {
						Tax = (monthIncome - 3500) * 0.45 - 13505;
						taxSum = taxSum + Tax;
						System.out.println("本月你需要纳税" + Tax + "元");
					}
				}
			}
			time=1;
			//输出学生一年的薪水
			System.out.println("您这一年的这一年的薪水为：" + sum);
			//输出学生该年度需要纳税金额
			System.out.println("您这一年的这一年需要纳税金额为：" + taxSum);
		} catch (Exception e) {
			//若输入非双浮点型，则开始执行，提示用户发生异常，要求重新输入
			System.out.println("---------------------------输入异常-------------------------" + e.getMessage());
			e.printStackTrace();
			System.out.println("---------------<<<<<<<<<<<<<<<请重新输入!>>>>>>>>>>>>>>>----------------");
		}}
		
	}
//重写接口Teachermanage。java中的salarySearch()方法
	public void salarySearch() {
		salary();
	};
//重写接口Studentmange。java中的fee()方法,用来获得学生本学年所交学费
	public Double fee() {
		System.out.println("请输入本学年学费");
		Scanner reader = new Scanner(System.in);
		Double feeSum = reader.nextDouble();
		return feeSum;
	};
//重写接口Studentmange。java中的feeSearch()方法,输出学生本学年所缴学费
	public void feeSearch() {
		Double feeSum1 = fee();
		System.out.println("本学年你需要缴学费额为：" + feeSum1);
	};

}
