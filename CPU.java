package Exp1;
public class CPU{
private	int speed;
public String brand;
CPU(){}
int getSpeed(){
	return speed;}
String getBrand(){
	return brand;}
void setSpeed(int speed){
	this.speed=speed;}
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
	}


