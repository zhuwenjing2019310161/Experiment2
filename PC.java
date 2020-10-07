package Exp1;
public class PC {
private HardDisk HD;
private CPU cpu;
PC(){}
void setCPU(CPU c){
cpu=c;}
void setHardDisk(HardDisk HD){
	this.HD=HD;}
void show(){
	System.out.println("CPU的速度是"+cpu.getSpeed());
	System.out.println("CPU的品牌是"+cpu.getBrand());
	System.out.println("硬盘的容量是"+HD.getAmount());
	System.out.println("硬盘的价格是"+HD.getPrice());
}
}
