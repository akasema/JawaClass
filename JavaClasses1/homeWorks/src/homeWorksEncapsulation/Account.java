package homeWorksEncapsulation;

public class Account {

private long acc_no;  
private String name, email;  
private double amount;  

public long getAccount_no(){
  return acc_no;
}
public void setAccount_no(long acc_no){
  this.acc_no=acc_no;
}

public String getName(){
  return name;
}
public void setName(String name){
  this.name=name;
}
public String getEmail(){
  return email;
}
public void setEmail(String email){
  this.email=email;
}
public double getAmount(){
  return amount;
}
public void setAmount(double amount){
  this.amount=amount;
}

}
