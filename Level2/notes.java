import java.util.Scanner;
class Notes
{
public static void main(String args[])
{
int notes;
Scanner sc=new Scanner(System.in);
System.out.println("enter the amount");
int amount=sc.nextInt();
int r2000=amount/2000;
int reminder=amount%2000;
int r500=reminder/500;
reminder=reminder%500;
int r200=reminder/200;
reminder=reminder%200;
int r100=reminder/100;
reminder=reminder%100;
int r50=reminder/50;
reminder=reminder%50;
int r20=reminder/20;
reminder=reminder%20;
int r10=reminder/10;
reminder=reminder%10;
int r5=reminder/5;
reminder=reminder%5;
int r2=reminder/2;
reminder=reminder%2;
int r1=reminder/1;
reminder=reminder%1;
notes=r2000+r500+r200+r100+r50+r20+r10+r5+r2+r1;
System.out.println("number of notes for amount "+amount+" is "+notes);
}
}