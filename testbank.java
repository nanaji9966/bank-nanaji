class Bank{
int getinterest(){
return 0;}
}

class SBI extends Bank{
int getinterest(){
return 16;}
}

class HDFC extends Bank{
int getinterest(){
return 119;}
}

class ICICI extends Bank{
int getinterest(){
return 6;}
}

class AXIS extends Bank{
int getinterest(){
return 42;}
}
class NANAJI extends Bank{
int getinterest(){
	
return 22;}
}
class TestBank{
public static void main (String[]args){
SBI s=new SBI();
System.out.println("SBI rate of interest:"+s.getinterest());
AXIS a=new AXIS();
System.out.println("AXIS rate of interest:"+a.getinterest());
ICICI i=new ICICI();
System.out.println("ICICI rate of interest:"+i.getinterest());
HDFC h=new HDFC();
System.out.println("HDFC rate of interest:"+h.getinterest());
NANAJI n=new NANAJI();
System.out.println("NANAJI rate of interest:"+n.getinterest());
}
}