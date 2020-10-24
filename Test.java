package system;
import java.util.Scanner; 
public class Test {
	//体现对toString()的重写
	public static String toString(Student stu) {
		return "当前登录系统学生为:"+" \n姓名: "+stu.name+" 编号: "+stu.number+" 年级: "+stu.grade+" 专业: "+stu.major+" 校区: "+stu.campus+" 当前选择课程: "+stu.coursed;
				
	}
	static boolean flag1 = true;
	static void loopMethod(Student stu) {    //退课系统中的循环方法
		System.out.println(toString(stu));
		System.out.println("退课请输入1,退出选课系统输入0");		
		Scanner choose2 = new Scanner(System.in);
		if (choose2.hasNext()) {
			String str2 = choose2.next(); 
			switch(str2) {
			case "0" :
				{flag1 = false ;
				System.out.println("已退出选课系统.");}
				break;
			case "1":
			{
					stu.dropCoursed();
					System.out.println("退课成功.");
					System.out.println("学生信息: \n姓名: "+stu.name+" 编号: "+stu.number+" 年级: "+stu.grade+" 专业: "+stu.major+" 校区: "+stu.campus+" 当前选择课程: "+stu.coursed);					
					flag1=false;
			}
			break;
			default :
			{System.out.println("输入有误!");}
			break;
			}
		}
		choose2.close();
		
	}
	 public static void main(String[] args) {
	//提前录入课程以及教师学生信息
	//教师
	Teacher teacher1 = new Teacher(001,"教师1","清源校区",'A');
	Teacher teacher2 = new Teacher(003,"外教","清源校区",'A');
	Teacher teacher3 = new Teacher(051,"教师5","康庄校区",'B');
	Teacher teacher4 = new Teacher(022,"教师0","燕山校区",'A'); 
	//课程 
	teacher1.setCourse("线性代数");    
	teacher2.setCourse("大学英语");    
	teacher3.setCourse("中国哲学史");   
	teacher4.setCourse("实习课程");
	Courses course1 = new Courses(000,"线性代数","清源校区","周一 9:40","教101");
	Courses course2 = new Courses(001,"大学英语","清源校区","周四 7:50","图501");
	Courses course3 = new Courses(002,"中国哲学史","康庄校区","周六 19:50","教207");
	Courses course4 = new Courses(003,"实习课程","燕山校区","时间待定","地点待定");
	//在屏幕上输出课表及信息,并提示当前课余量(课余量由随机数产生),以及剩余可选人数
	System.out.println("课程列表:");
	System.out.println("课程编号:"+course1.number+" 课余量:"+course1.reduce/*+" 是否可选课:"+course1.choice*/+" 课程名称:"+course1.name+" 教师名称:"+teacher1.name+" 地点:"+course1.campus+course1.location+" 课程时间:"+course1.time);
	System.out.println("课程编号:"+course2.number+" 课余量:"+course2.reduce/*+" 是否可选课:"+course2.choice*/+" 课程名称:"+course2.name+" 教师名称:"+teacher2.name+" 地点:"+course2.campus+course2.location+" 课程时间:"+course2.time);
	System.out.println("课程编号:"+course3.number+" 课余量:"+course3.reduce/*+" 是否可选课:"+course3.choice*/+" 课程名称:"+course3.name+" 教师名称:"+teacher3.name+" 地点:"+course3.campus+course3.location+" 课程时间:"+course3.time);
	System.out.println("课程编号:"+course4.number+" 课余量:"+course4.reduce/*+" 是否可选课:"+course4.choice*/+" 课程名称:"+course4.name+" 教师名称:"+teacher4.name+" 地点:"+course4.campus+course4.location+" 课程时间:"+course4.time);
	//学生登入,并选择为退课或者选课
	Student stu = new Student(3112000,"学生1","清源校区",2,"计算机科学及其技术");     //学生登入
	//开始退选课部分
	while (flag1) {
	
	System.out.println(toString(stu));
	System.out.println("选课请输入1,退出选课系统输入0:");        // next方式接收字符串,并判断是否还有输入	
	Scanner choose1 = new Scanner(System.in);      // 从键盘接收数据choose
    if (choose1.hasNext()) {                       //choose1为第一次接受的键盘输入
    	String str1 = choose1.next();              //把第一次键盘输入传递给str1
    	 switch(str1) {
    	 case "0" :
    	 {
    		 System.out.println("已退出选课系统.");
    		 flag1 = false;
    	 }
    	 break;
    	 case "1" :
    	 {
    		 System.out.println("请输入想要选择的课程的序号:");
    		 Scanner scan = new Scanner(System.in);  //第二次键盘输入为scan
    		 if (scan.hasNext())
    		 {
    			 String cbs = scan.next();               //第二次键盘输入传递给cbs
    			 switch(cbs)                             //cbs为第二次输入的选课序号
    			 {
    			 	case "0" :
    			 		{if(course1.choice) {System.out.println("恭喜,选课成功.");stu.setCoursed("线性代数");
    			 		loopMethod(stu);flag1=false;
    			 		}
    			 		else
    			 			{System.out.println("无剩余课余量,选课失败!");flag1 = false;}}
    			 	break; 
    			 	case "1" :
    			 	{
    			 		if(course2.choice) {System.out.println("恭喜,选课成功.");stu.setCoursed("大学英语");
    			 		loopMethod(stu);flag1 = false;
    			 	}
    			 		else
    			 			{System.out.println("无剩余课余量,选课失败!");flag1 = false;}}
    			 	break; 
    			 	case "2" :
    			 	{
    			 		if(course3.choice) {System.out.println("恭喜,选课成功.");stu.setCoursed("中国哲学史");
    			 		loopMethod(stu);flag1 = false;
    			 	}
    			 		else
    			 			{System.out.println("无剩余课余量,选课失败!");flag1 = false;}}
    			 	break;
    			 	case "3" :
    			 	{
    			 		if(course4.choice) {System.out.println("恭喜,选课成功.");stu.setCoursed("实习课程");
    			 		loopMethod(stu);flag1 = false;
    			 	}
    			 		else
    			 			{System.out.println("无剩余课余量,选课失败!");flag1 = false;}}
    			 	break;
    			 	default : 
    			 	{System.out.println("你输入了一个不正确的选课序号!");flag1 = false;}
    			 	break;
    			 }
    		 }
    		 scan.close();} 
    	break;
    	default :
    	{System.out.println("你输入了一个不正确的选择序号!");flag1 = false;}   //输入错误的编号则退出选课系统
    	break;       
    }}
    choose1.close();
 
	 }
	 }
	
}