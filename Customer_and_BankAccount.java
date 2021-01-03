import java.util.Scanner;
class Customer
{
  int i;
  String n;
  char g;
  public Customer(int ID,String name, char gender)
  {
    i=ID;
    n=name;
    g=gender;
  }
  public int getID()
  {
    return i;
  }
  public String getName()
  {
    return n;
  }
  public char getGender()
  {
    return g;
  }
  public String toString()
  {
    return n+ "("+i+")";
  }
}

class BankAccount
{
  int i;
  public Customer c;
  double b;
  public BankAccount(int ID,Customer customer,double balance)
  {
    i=ID;
    c=customer;
    b=balance;
  }
  public int getID()
  {
    return i;
  }
  public Customer getCustomer()
  {
    return c;
  }
  public void setBalance(double bal)
  {
    b=bal;
  }
  public double getBalance()
  {
    return b;
  }
  public void deposit(double amt)
  {
    b+=amt;
  }
  public void withdraw(double amt)
  {
    if(b>amt)
    b=b-amt;
    else
    System.out.println("Insufficient balance");
  }
public String toString()
  {
    b=Math.round(b*100)/100.00;
    return c + " " + "balance=INR "+b+"0";
  }  
  
}
class Customer_and_BankAccount
{
  public static void main(String[] args)
  {
    String a1,a2;
    double d1;
    int n1,n2;
    Scanner s1=new Scanner(System.in);
    n1=Integer.parseInt(s1.nextLine());
    a1=s1.nextLine();
    a2=s1.nextLine();
    Customer c1 = new Customer(n1, a1, a2.charAt(0));
    System.out.println(c1.getID());
    System.out.println(c1.getName());
    System.out.println(c1.getGender());
    System.out.println(c1);  // Customer's toString()

    n1=Integer.parseInt(s1.nextLine());
    d1=Double.valueOf(s1.nextLine());
    BankAccount b1 = new BankAccount(n1, c1, d1);  // BankAccount's Constructor
    System.out.println(b1.getID());
    System.out.println(b1.getBalance());
    System.out.println(b1);
    d1=Double.valueOf(s1.nextLine());
    b1.setBalance(d1);
    System.out.println(b1.getBalance());
    d1=Double.valueOf(s1.nextLine());
    b1.deposit(d1);
    System.out.println(b1.getBalance());
    d1=Double.valueOf(s1.nextLine());
    b1.withdraw(d1);
    System.out.println(b1.getBalance());
    d1=Double.valueOf(s1.nextLine());
    b1.withdraw(d1);
    System.out.println(b1.getBalance());
  }
}
