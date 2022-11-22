package Account;

import java.util.Date;
 public class Account{
  private int id;                    // int类型的私有属性id，表示账号。
  private double balance;      //int类型的私有属性id，表示账号余额。
  private Date dateCreated;   //Date类型的私有属性dateCreated，表示开户日期。
  public Account() {
  }
  //账户设置
  public Account(int id, double balance) {
   this.id = id;
   this.balance = balance;
   dateCreated = new Date();
  }
  public int getId() {
   return id;
  }
  public void setId(int id) {
   this.id = id;
  }
  //余额
  public double getBalance() {
   return balance;
  }
  public void setBalance(double balance) {
   this.balance = balance;
  }
  //日期
  public Date getDateCreated() {
   return dateCreated;
  }
  public void setDateCreated(Date dateCreated) {
   this.dateCreated = dateCreated;
  }
     //取款
     public  double withDraw(double money){
      if(money > this.balance)
    System.out.println("账户余额不足");
   else
    this.balance -= money;
         return this.balance;
     }
     //存款
     public double deposit(double money){
         this.balance = balance + money;
         return this.balance;
     }
 }