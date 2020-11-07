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
## 三·核心方法
###  在student类中：
