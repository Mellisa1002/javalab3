# 陈立男 2019311232 计192 

## java第三次上机实验:学生选课模拟系统
<br>

### 实验目的  

<br>

1.初步了解分析系统需求，从学生选课角度了解系统中的实体及其关系，学会定义类中的属性以及方法

<br>

2.掌握面向对象的类设计方法（属性、方法）

<br>

3.掌握类的继承用法，通过构造方法实例化对象

<br>

4.学会使用super()，用于实例化子类

<br>

5.掌握使用Object根类的toString（）方法,应用在相关对象的信息输出中

<br>

6.利用随机数模拟课余量,判断能否选课

<br>

7.第一次学习使用scanner及其接受键盘输入

<br>


### 实验要求

<br>

学校有“人员”，分为“教师”和“学生”，教师教授“课程”，学生选择“课程”。从简化系统考虑，每名教师仅教授一门课程，每门课程的授课教师也仅有一位，每名学生选仅选一门课程。<br>
对象示例:人员（编号、姓名、性别、所在校区、年龄）<br>
教师（编号、姓名、性别、所授课程、老师等级、年龄）<br>
学生（学号、姓名、性别、所选课程、年级、专业、所在校区、年龄）<br>
课程（编号、课程名称、上课地点、时间、授课教师、课余量、能否选课、所在校区）<br>


    
    
<br>


### 实验结果
----
![](https://github.com/Mellisa1002/javalab3/blob/main/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20201024200700.png)

<br>

### 实验过程

<br>

1.自己先是大约画了一下流程图，明确大致怎么写这个程序以及需要实现哪些功能<br>
2.根据不同的功能确定需要有的基本类和方法<br>
3.重写toString（）方法，来实现对学生信息的简单调用<br>

### 流程图
----
![](https://github.com/Mellisa1002/javalab3/blob/main/9566eac7b5cb52137c6a8e5a02a078a.png)


### 核心代码

<br>

```
while (flag1) {                     //while循环使选课系统持续在线
	
	System.out.println(toString(stu));
	System.out.println("选课请输入1,退出选课系统输入0:");        // next方式接收字符串,并判断是否还有输入	
	Scanner choose1 = new Scanner(System.in);      // 从键盘接收数据choose
    if (choose1.hasNext()) {                       //choose1为第一次接受的键盘输入
    	String str1 = choose1.next();              //把第一次键盘输入传递给str1
    	 switch(str1) {
    	 case "0" :
    	 {
    		 System.out.println("已退出选课系统.");
    		 flag1 = false;                       //flag1为false后直接结束最外层while循环
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
```

### 编程感想

<br>

这次的编程题感觉就像一个比较完整的题（？）了，因为是要自己从头到尾有始有终各方面都要考虑到。主要更像是在脑子里边过一遍“如果我要用这个系统，这个系统该有什么功能”，在想明白有什么功能之后，下一步想的是“我应该如何实现这些功能呢？”这就是我自己完整的编程思路了。<br>
如果我想要用一个好用的选课系统，那肯定是不能老登不上，动不动崩溃（这些当然和我写的没关系了），所以我要做的就是实现最基本的功能了。学生能选课，就是要有课，有老师来选。<br>
那再仔细一想，肯定是在选课之前，有负责的老师把课程排好，把课程和授课老师的信息提前录入进入系统了，然后再允许学生登入来退课选课。<br>
这就是最基本的思路了。在动手写的时候，就会再遇到新的问题了。<br>
按照实验要求给的提示，利用父类子类能简化一下程序，是真的。最原来写了一个People类，作为总的父类，然后把Student、Teacher、Course类作为People的子类，能够继承People类的子类，当时为了少写几个属性，就把Course也放到了People的子类来继承几个属性。（后来老师让改掉我就换掉了）<br>
再就是，在Course里边用了一个产生随机数的属性，Math.random()来模拟以及选了这门课的人数，100减去这个人数就是剩下的课容量，从而判断能否继续选课。<br>
最后在Test类中，重写了toString()方法，将他作为能够反复调用显示打印学生信息的方法。<br>
在程序接口里边，我最原来想实现能够反复选课退课，最后还是因为太难了（没查到资料）放弃了而简化了功能。<br>
最原来想的是在登入选课系统后来一个while(true)的循环，只有选择退出系统时才会退出系统。可以通过scanner*反复*接收新的键盘输入，同时希望有能类似于c语言中的 goto 语句来便利的实现代码运行时的跳转，或者是多层循环实现代码跳转运行，这样就能达到了登入系统持续在线的一个实现。<br>
想的很好但是实际上，实现起来相当费劲。<br>
首先卡死在了scanner的接受键盘输入上：在刚写出选课系统的时候尝试了一下能不能正常运行，选课部分的功能没问题，但是出现了第一个死循环————scanner在接收键盘信息后，不会清空缓存区内已经接收的数据，也就是说，在新一遍的循环中，压根还没输入新的选项，就按照着原来保存在缓存区的数据直接运行，让程序进入了死循环。（这就离谱，因为没找到那种像python或者c语言里边那种写一行代码直接清空缓冲区的）<br>
为了跳过这个不能接收新字符，特地写了多层循环，就是在每一个的选课成功的后面带上一个loopMethod方法，进入退课循环。然后可以在退课循环里边选择退课后选课或者退课后直接退出程序。果然我发现，我想多了。<br>
不管这个循环怎么样，最后都要经过一次scanner重新接受键盘输入，关键就是，我做不到怎么清空缓冲区！！！！！！！！我把几个能看懂的都试了！！！都不行！气死了！<br>
最后屈服了，把loopMethod（）里边的变成了退课后直接退出选课系统，直接避免所有的死循环。哎，遗憾！


