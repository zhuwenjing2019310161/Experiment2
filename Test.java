package Exp1;
public class Test {
	public static void main(String args[]){
		CPU cpu=new CPU();
		HardDisk disk=new HardDisk();
		PC pc=new PC();
		cpu.setSpeed(2200);
		cpu.setBrand("Intel");
		disk.setAmount(200);
		disk.setPrice(400);
		pc.setCPU(cpu);
		pc.setHardDisk(disk);
		pc.show();
	}
}
