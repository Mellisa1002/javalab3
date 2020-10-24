  package system;

class People {
	public int number;         //���
	public String name;        //����
	public String gender = null;      //�Ա�
	public String campus;      //����У��
	public int age;            //����
	People(){}
	int getNumber() {
		return this.number;    //��ȡ���
	}	
	void setGender(String gender) {
		this.gender=gender;    //�趨�Ա�
	}
	void setAge(int age) {
		this.age=age;          //�趨����
	}
}
class Student extends People{
	public int grade;          //�꼶
	public String major;       //רҵ
	public String coursed = "��";     //�Ѿ�ѡ��Ŀγ�
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
		this.coursed=coursed;             //��������ѡ��
	}
	void dropCoursed() {
		this.coursed="��";               //�˿η�����Ϊ�������¸�ֵΪ��
	}
	
}
class Teacher extends People{
	public String course;      //�γ�
	public char rank;          //��ʦ�ȼ�  A B C
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
	int number;                 //�γ̱��
	String name;                //�γ�����
	String campus;              //�γ�����У��
	public String time;         //�Ͽ�ʱ��
	public String teacher;      //�ڿν�ʦ
	public String location;     //�Ͽεص�
	public int capacity = (int)(Math.random()*100+1);   //�������һ���Ѿ�ѡ�ε�����
	public int reduce = 100 - capacity; //��������Ϊ100,������Ϊ��ֵ
	public boolean choice=true;//�Ƿ��ѡ��
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