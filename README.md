# -
第三次实验实验报告
# java实验报告
###  课程名称：Java程序语言设计
### 实验名称：接口及异常处理
### 班级： 计191
### 姓名： 李胜祥 
### 学号： 2019311326
### 教师： 张世博
## 一.实验目的
1.掌握Java中抽象类和抽象方法的定义；  
2·掌握Java中接口的定义，熟练掌握接口的定义形式以及接口的实现方法；   
3· 了解异常的使用方法，并在程序中根据输入情况做异常处理；   
## 二.实验内容
    学校为了给学生提供勤工俭学的机会，也减轻授课老师的部分压力，准许博士研究生参加课程的助教工作。此时，该博士研究生有双重身份：学生和助教教师。
## 三·实验过程
  本次实验一共创造4了个文件，Studentmange.java中接口创建了双浮点型 fee() 抽象方法和无返回值feeSearch()抽象方法；接口Teachermanage.java中接口
  创建了双浮点型 salary() 抽象方法和无返回值salarySearch()抽象方法。PostGraduators.java中创建setStudentname（）方法用来返找到学生姓名；创建
  getStudentname()方法用来返回学生姓名；创建setstudentAge()方法，让用户输入年龄；创建setstudentAge()方法，让用户输入年龄；创建setStudentSex()
  方法，让学生输入性别；创建getStudentSex()方法，用来得到学生性别；重写接口Teachermanage。java中的salary()方法；重写接口Teachermanage.java中
  的salarySearch()方法;重写接口Studentmange。java中的fee()方法,用来获得学生本学年所交学费;重写接口Studentmange。java中的feeSearch()方法,输出
  学生本学年所缴学费。在Test.java文件中的主类中，调用postGradutorone的name属性，学生输入其姓名；调用postGradutorone的age属性，学生输入其年龄
  调用postGradutorone的sex属性，学生输入其性别；postGradutorone调用重写的salarySearch()函数，用来统计学生所缴税，每个月的的工资；
  postGradutorone调用重写的feeSearch()函数，用来输入统计学生的学费。
## 四·核心方法
###  在Teachermanage.java中：  
	void salary();  
    创建抽象方法salary()  
	void salarySearch()  
    创建构造方法salarySearch()  
### 在Studentmange.java中：  
	Double fee() ;  
    创建抽象方法fee()  
    void feeSearch()   
    创建抽象方法feeSearch()  
### 在PostGraduators.java中：  
    String setStudentname() {  
		String[] name = { "小明", "张飞", "刘翔", "李俊", "张华", "景驰", "泰宇", "刘志", "欧阳艄公", "李回回" };  
		System.out.println("请输入您的序号(您的序号为从0开始的数字)");  
		Scanner reader4 = new Scanner(System.in);  
		int namenum = reader4.nextInt();  
		return name[namenum];  
	};
    将用户字符串数组中，根据编号找到学生  
	String getStudentname() {  
		String name = setStudentname();  
		return name;  
	}  
    创建getStudentname()方法用来返回学生姓名  
	int setStudentAge() {  
		System.out.println("请输入您的年龄");  
		Scanner reader5 = new Scanner(System.in);  
		return reader5.nextInt();  
	};  
    创建setstudentAge()方法，让用户输入年龄  
	int getStudentAge() {  
		int age = setStudentAge();  
		return age;  
	}  
    创建getStudentAge()方法，用来得到学生年龄  
	String setStudentSex() {  
		System.out.println("请输入您的性别：(输入0为男性输入1为女性)");  
		String sex[] = { "男", "女" };  
		Scanner reader6 = new Scanner(System.in);  
		int sexnum = reader6.nextInt();  
		return sex[sexnum];  
	};  
     创建setStudentSex()方法，让学生输入性别  
	String getStudentSex() {  
		String sex = setStudentSex();  
		return sex;  
	};  
     创建getStudentSex()方法，用来得到学生性别  
     重写接口Teachermanage。java中的salary()方法：  
	public void salary() {  
		Double sum = 0.00;  
		Double taxSum = 0.00;  
		Double Tax;  
		int time=0;  
		System.out.println("请输入每一个月的工资");  
		通过异常语句，让用户输入每一个月的工资，若输入非双浮点型，则程序报错，并重新输入，直到输入正确为止  
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
			输出学生一年的薪水  
			System.out.println("您这一年的这一年的薪水为：" + sum);  
			输出学生该年度需要纳税金额  
			System.out.println("您这一年的这一年需要纳税金额为：" + taxSum);  
		} catch (Exception e) {  
			若输入非双浮点型，则开始执行，提示用户发生异常，要求重新输入  
			System.out.println("---------------------------输入异常-------------------------" + e.getMessage());  
			e.printStackTrace();  
			System.out.println("---------------<<<<<<<<<<<<<<<请重新输入!>>>>>>>>>>>>>>>----------------");  
		}}  
	}  
	public void salarySearch() {  
		salary();  
	};  
    重写接口Teachermanage。java中的salarySearch()方法  
	public Double fee() {  
		System.out.println("请输入本学年学费");  
		Scanner reader = new Scanner(System.in);  
		Double feeSum = reader.nextDouble();  
		return feeSum;  
	};  
    重写接口Studentmange。java中的fee()方法,用来获得学生本学年所交学费  
	public void feeSearch() {  
		Double feeSum1 = fee();  
		System.out.println("本学年你需要缴学费额为：" + feeSum1);  
	}  
    重写接口Studentmange。java中的feeSearch()方法,输出学生本学年所缴学费  
## 五·实验结果
程序会提示学生输入每一个月的工资，判断是否需要缴税，并计算出每一个月需要缴税金额：  
https://github.com/li2843645895/-/blob/main/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20201107210021.png  
当输入每一个月的工资不是双浮点型时，程序会出现报错，并要求学生重新输入：  
https://github.com/li2843645895/-/blob/main/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20201107210048.png  
学生输入十二个月的工资和学费后，控制台会输出学生该年需要交的税，该年的工资和该年的学费：
https://github.com/li2843645895/-/blob/main/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20201107210054.png
## 六·实验感想
通过本次实验，我掌握了java中抽象类和抽象方法的定义；掌握了java接口中的定义和接口的定义形式已经接口的实现方法；  
同了解了异常的使用方法，并可以在程序中根据输入情况做出异常处理；同时也更加巩固了Static和finally的使用；了解了  
Scanner语句的使用，在此次实验中，我深刻体会到了在Java学习中自生知识的储备不足，我一定会更加用心专注Java语言  
的学习。
