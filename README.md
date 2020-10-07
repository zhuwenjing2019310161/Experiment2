# 实验二 PC机模拟程序
## 一、阅读程序
## 二、实验目的：  
1、通过实验掌握定义类的构造方法，尝试定义属性的修饰符多样化。  
2、学会把多个类放置在不同的包中，并且体会修饰符private的用法。  
## 三、实验内容  
设计完成关于PC、内存等模拟的程序。
## 四、实验过程：  
1、用类描述计算机中CPU的速度和硬盘的容量。定义4个类，名字分别是PC、CPU、HardDisk和Test，其中Test是主类。并且使用修饰符private的用法 。 
2、CPU类：getSpeed()返回speed的值，setSpeed(int m)方法将参数m的值赋值给speed；  
   HardDisk类：getAmount()返回amount的值，setAmount(int m)方法将参数m的值赋值给amount；  
   PC类：setCPU(CPU c)将参数c的值赋值给cpu，setHardDisk(HardDisk h)方法将参数h的值赋值给HD；  
   最后show()方法显示cpu的速度和硬盘的容量。  
3、主类Test的设计:  
(1) main方法中创建一个CPU对象cpu,cpu将自己的speed设置为200。  
(2) main方法中创建一个HardDisk对象disk，disk将自己的amount设置为200。  
(3) main方法中创建一个PC对象pc。  
(4) pc调用setCPU(CPU c)方法，调用时实参是cpu。  
(5) pc调用setHardDisk(HardDisk h)方法，调用时实参是disk。  
(6) pc调用show()方法。
## 五、核心方法  
1、方法一:  
```
CPU(){}...  
HardDisk(){}...  
PC(){}...
```    
构造方法的一种为空。  
2、方法二:  
```  
int getSpeed(){
	return speed;}
String getBrand(){
	return brand;}...  
```  
构造一个getSpeed()/getBrand()等返回值。  
3、方法三:  
```
void setSpeed(int speed){
	this.speed=speed;}
```  
setSpeed(int m)方法将参数m的值赋值给speed。这里直接将m设置为speed。  
4、方法四:  
```  
String setBrand(String m){
this.brand = m;	
String intel=new String("Intel");
String amd=new String("AMD");
if (brand.equals(intel))
{return brand;}
else if(brand.equals(amd))
{return brand;}
else
{brand="这个不是CPU的品牌!";
return brand;}			
}  
```
## 六、实验结果  
实验结果截图
## 七、实验感想  
通过本次实验我学会了定义类的构造方法，并且可以用类描述  


  
