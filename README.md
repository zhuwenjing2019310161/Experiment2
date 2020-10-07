# 实验二 PC机模拟程序
## 一、阅读程序
## 二、实验目的：  
1、通过实验掌握定义类的构造方法，尝试定义属性的修饰符多样化。
2、学会把多个类放置在不同的包中，并且体会修饰符private的用法。  
## 三、实验内容  
设计完成关于PC、内存等模拟的程序。
## 四、实验要求：
### 1.基本要求：  
用类描述计算机中CPU的速度和硬盘的容量。要求Java应用程序有4个类，名字分别是PC、CPU、HardDisk和Test，其中Test是主类。  
其中，CPU类要求getSpeed()返回speed的值，要求setSpeed(int m)方法将参数m的值赋值给speed；HardDisk类要求getAmount()返回amount的值，要求setAmount(int m)方法将参数m的值赋值给amount；PC类要求setCPU(CPU c)将参数c的值赋值给cpu，要求setHardDisk(HardDisk h)方法将参数h的值赋值给HD，要求show()方法能显示cpu的速度和硬盘的容量。  
主类Test的要求:  
(1) main方法中创建一个CPU对象cpu,cpu将自己的speed设置为200。  
(2) main方法中创建一个HardDisk对象disk，disk将自己的amount设置为200。  
(3) main方法中创建一个PC对象pc。  
(4) pc调用setCPU(CPU c)方法，调用时实参是cpu。  
(5) pc调用心setHardDisk(HardDisk h)方法，调用时实参是disk。  
(6) pc调用show()方法。
### 2.附加要求：  
a)类中定义不少于两个构造方法；  
b)每个类定义不少于2个属性，且属性的类型应该多样化；  
c)根据课堂中关于访问权限的内容，尝试定义属性的修饰符多样化，类中定义方法操作属性，避免直接通过“类对象.属性”的形式访问属性值；且定义的方法应该有符合的逻辑判断；  
d)尝试把本次实验的多个类放在不同的包中，体会修饰符private的用法。 
## 五、核心方法  
1、方法一：  
'''
int getSpeed(){
		return speed;}
	float getTemperature(){
		return temperature;}
	void setSpeed(int speed){
		this.speed=speed;
	}
	void setTemperature(float temperature){
		this.temperature=temperature;
	}  
'''
2、方法二  
3、方法三
## 六、实验结果  
实验结果截图
## 七、实验感想  
通过本次实验我学会了定义类的构造方法，并且可以用类描述  


  
