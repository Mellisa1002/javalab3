package system;
import java.util.Scanner; 
public class Test {
	//���ֶ�toString()����д
	public static String toString(Student stu) {
		return "��ǰ��¼ϵͳѧ��Ϊ:"+" \n����: "+stu.name+" ���: "+stu.number+" �꼶: "+stu.grade+" רҵ: "+stu.major+" У��: "+stu.campus+" ��ǰѡ��γ�: "+stu.coursed;
				
	}
	static boolean flag1 = true;
	static void loopMethod(Student stu) {    //�˿�ϵͳ�е�ѭ������
		System.out.println(toString(stu));
		System.out.println("�˿�������1,�˳�ѡ��ϵͳ����0");		
		Scanner choose2 = new Scanner(System.in);
		if (choose2.hasNext()) {
			String str2 = choose2.next(); 
			switch(str2) {
			case "0" :
				{flag1 = false ;
				System.out.println("���˳�ѡ��ϵͳ.");}
				break;
			case "1":
			{
					stu.dropCoursed();
					System.out.println("�˿γɹ�.");
					System.out.println("ѧ����Ϣ: \n����: "+stu.name+" ���: "+stu.number+" �꼶: "+stu.grade+" רҵ: "+stu.major+" У��: "+stu.campus+" ��ǰѡ��γ�: "+stu.coursed);					
					flag1=false;
			}
			break;
			default :
			{System.out.println("��������!");}
			break;
			}
		}
		choose2.close();
		
	}
	 public static void main(String[] args) {
	//��ǰ¼��γ��Լ���ʦѧ����Ϣ
	//��ʦ
	Teacher teacher1 = new Teacher(001,"��ʦ1","��ԴУ��",'A');
	Teacher teacher2 = new Teacher(003,"���","��ԴУ��",'A');
	Teacher teacher3 = new Teacher(051,"��ʦ5","��ׯУ��",'B');
	Teacher teacher4 = new Teacher(022,"��ʦ0","��ɽУ��",'A'); 
	//�γ� 
	teacher1.setCourse("���Դ���");    
	teacher2.setCourse("��ѧӢ��");    
	teacher3.setCourse("�й���ѧʷ");   
	teacher4.setCourse("ʵϰ�γ�");
	Courses course1 = new Courses(000,"���Դ���","��ԴУ��","��һ 9:40","��101");
	Courses course2 = new Courses(001,"��ѧӢ��","��ԴУ��","���� 7:50","ͼ501");
	Courses course3 = new Courses(002,"�й���ѧʷ","��ׯУ��","���� 19:50","��207");
	Courses course4 = new Courses(003,"ʵϰ�γ�","��ɽУ��","ʱ�����","�ص����");
	//����Ļ������α���Ϣ,����ʾ��ǰ������(�����������������),�Լ�ʣ���ѡ����
	System.out.println("�γ��б�:");
	System.out.println("�γ̱��:"+course1.number+" ������:"+course1.reduce/*+" �Ƿ��ѡ��:"+course1.choice*/+" �γ�����:"+course1.name+" ��ʦ����:"+teacher1.name+" �ص�:"+course1.campus+course1.location+" �γ�ʱ��:"+course1.time);
	System.out.println("�γ̱��:"+course2.number+" ������:"+course2.reduce/*+" �Ƿ��ѡ��:"+course2.choice*/+" �γ�����:"+course2.name+" ��ʦ����:"+teacher2.name+" �ص�:"+course2.campus+course2.location+" �γ�ʱ��:"+course2.time);
	System.out.println("�γ̱��:"+course3.number+" ������:"+course3.reduce/*+" �Ƿ��ѡ��:"+course3.choice*/+" �γ�����:"+course3.name+" ��ʦ����:"+teacher3.name+" �ص�:"+course3.campus+course3.location+" �γ�ʱ��:"+course3.time);
	System.out.println("�γ̱��:"+course4.number+" ������:"+course4.reduce/*+" �Ƿ��ѡ��:"+course4.choice*/+" �γ�����:"+course4.name+" ��ʦ����:"+teacher4.name+" �ص�:"+course4.campus+course4.location+" �γ�ʱ��:"+course4.time);
	//ѧ������,��ѡ��Ϊ�˿λ���ѡ��
	Student stu = new Student(3112000,"ѧ��1","��ԴУ��",2,"�������ѧ���似��");     //ѧ������
	//��ʼ��ѡ�β���
	while (flag1) {
	
	System.out.println(toString(stu));
	System.out.println("ѡ��������1,�˳�ѡ��ϵͳ����0:");        // next��ʽ�����ַ���,���ж��Ƿ�������	
	Scanner choose1 = new Scanner(System.in);      // �Ӽ��̽�������choose
    if (choose1.hasNext()) {                       //choose1Ϊ��һ�ν��ܵļ�������
    	String str1 = choose1.next();              //�ѵ�һ�μ������봫�ݸ�str1
    	 switch(str1) {
    	 case "0" :
    	 {
    		 System.out.println("���˳�ѡ��ϵͳ.");
    		 flag1 = false;
    	 }
    	 break;
    	 case "1" :
    	 {
    		 System.out.println("��������Ҫѡ��Ŀγ̵����:");
    		 Scanner scan = new Scanner(System.in);  //�ڶ��μ�������Ϊscan
    		 if (scan.hasNext())
    		 {
    			 String cbs = scan.next();               //�ڶ��μ������봫�ݸ�cbs
    			 switch(cbs)                             //cbsΪ�ڶ��������ѡ�����
    			 {
    			 	case "0" :
    			 		{if(course1.choice) {System.out.println("��ϲ,ѡ�γɹ�.");stu.setCoursed("���Դ���");
    			 		loopMethod(stu);flag1=false;
    			 		}
    			 		else
    			 			{System.out.println("��ʣ�������,ѡ��ʧ��!");flag1 = false;}}
    			 	break; 
    			 	case "1" :
    			 	{
    			 		if(course2.choice) {System.out.println("��ϲ,ѡ�γɹ�.");stu.setCoursed("��ѧӢ��");
    			 		loopMethod(stu);flag1 = false;
    			 	}
    			 		else
    			 			{System.out.println("��ʣ�������,ѡ��ʧ��!");flag1 = false;}}
    			 	break; 
    			 	case "2" :
    			 	{
    			 		if(course3.choice) {System.out.println("��ϲ,ѡ�γɹ�.");stu.setCoursed("�й���ѧʷ");
    			 		loopMethod(stu);flag1 = false;
    			 	}
    			 		else
    			 			{System.out.println("��ʣ�������,ѡ��ʧ��!");flag1 = false;}}
    			 	break;
    			 	case "3" :
    			 	{
    			 		if(course4.choice) {System.out.println("��ϲ,ѡ�γɹ�.");stu.setCoursed("ʵϰ�γ�");
    			 		loopMethod(stu);flag1 = false;
    			 	}
    			 		else
    			 			{System.out.println("��ʣ�������,ѡ��ʧ��!");flag1 = false;}}
    			 	break;
    			 	default : 
    			 	{System.out.println("��������һ������ȷ��ѡ�����!");flag1 = false;}
    			 	break;
    			 }
    		 }
    		 scan.close();} 
    	break;
    	default :
    	{System.out.println("��������һ������ȷ��ѡ�����!");flag1 = false;}   //�������ı�����˳�ѡ��ϵͳ
    	break;       
    }}
    choose1.close();
 
	 }
	 }
	
}