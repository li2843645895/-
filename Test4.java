
public class Test4 {

	public static void main(String[] args) {
		System.out.println("--------------------------------欢迎！！-----------------------------------------------");
		//实例化一个研究生对象
		PostGradutors postGradutorone = new PostGradutors();
		//调用postGradutorone的name属性，学生输入其姓名
		System.out.println("你好"+postGradutorone.name+"同学");
		//调用postGradutorone的age属性，学生输入其年龄
		System.out.println("您的年龄为："+postGradutorone.age);
		//调用postGradutorone的sex属性，学生输入其性别
		System.out.println("您的性别是："+postGradutorone.sex);
		//postGradutorone调用重写的salarySearch()函数，用来统计学生所缴税，每个月的的工资
		postGradutorone.salarySearch();
		//postGradutorone调用重写的feeSearch()函数，用来输入统计学生的学费
		postGradutorone.feeSearch();
	}

}
