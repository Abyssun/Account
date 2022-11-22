package Account;

import java.util.Scanner;

public class TestAccount {
 public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  Account account=new Account(123456, 100);
  System.out.println("系主菜单");
  System.out.println("1：查看余额");
  System.out.println("2：取款");
  System.out.println("3：存款");
  System.out.println("4：退出");
  Boolean flag=true;
  while(flag) {
   System.out.print("请输入一个选项：");
   int i=sc.nextInt();
   switch(i) {
   case 1:
    System.out.println("账户余额："+account.getBalance());
    System.out.println();
    break;
   case 2:
    System.out.print("请输入取款金额：");
    double m=sc.nextDouble();
    account.withDraw(m);
    System.out.println();
    break;
   case 3:
    System.out.print("请输入存款金额：");
    double n=sc.nextDouble();
    System.out.println();
    account.deposit(n);
    break;
   case 4:
    flag=false;
    System.out.println("您退出了系统!");
    System.out.println();
    break;
   }
  }
  sc.close();
 }
}