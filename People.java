  package system;

class People {
	public int number;         //编号
	public String name;        //名字
	public String gender = null;      //性别
	public String campus;      //所在校区
	public int age;            //年龄
	People(){}
	int getNumber() {
		return this.number;    //获取编号
	}	
	void setGender(String gender) {
		this.gender=gender;    //设定性别
	}
	void setAge(int age) {
		this.age=age;          //设定年龄
	}
}
class Student extends People{
	public int grade;          //年级
	public String major;       //专业
	public String coursed = "无";     //已经选择的课程
	Student(){}
	Student(int number,String name,String campus,int grade,String major){
		super();
		this.number=number;
		this.name=name;
		this.campus=campus;
		this.grade=grade;
		this.major=major;
	}
	void setCoursed(String coursed) {
		this.coursed=coursed;             //单独设置选课
	}
	void dropCoursed() {
		this.coursed="无";               //退课方法即为将其重新赋值为无
	}
	
}
class Teacher extends People{
	public String course;      //课程
	public char rank;          //老师等级  A B C
	Teacher(){}
	Teacher(int number,String name,String campus,char rank){
		super();
		this.number=number;
		this.name=name;
		this.campus=campus;
		this.rank=rank;
	}
	void setCourse(String course) {
		this.course=course;
	}
	
}
class Courses {
	int number;                 //课程编号
	String name;                //课程名称
	String campus;              //课程所在校区
	public String time;         //上课时间
	public String teacher;      //授课教师
	public String location;     //上课地点
	public int capacity = (int)(Math.random()*100+1);   //随机产生一个已经选课的人数
	public int reduce = 100 - capacity; //课容量均为100,课余量为差值
	public boolean choice=true;//是否可选课
	{
	if (reduce<=0) {choice=false;}
	}

	Courses(){}
	Courses(int number,String name,String campus,String time,String location){
		super();
		this.number=number;
		this.name=name;
		this.campus=campus;
		this.location=location;
		this.time=time;
	}
	void setTeacher(String teacher) {
		this.teacher=teacher;
	}
	
}