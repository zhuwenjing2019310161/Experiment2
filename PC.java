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
	System.out.println("CPU���ٶ���"+cpu.getSpeed());
	System.out.println("CPU��Ʒ����"+cpu.getBrand());
	System.out.println("Ӳ�̵�������"+HD.getAmount());
	System.out.println("Ӳ�̵ļ۸���"+HD.getPrice());
}
}
