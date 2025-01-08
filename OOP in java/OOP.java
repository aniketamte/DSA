public class OOP {
    public static void main(String[] args) {
      Pen p1 = new Pen(); //create pen object called p1
      p1.setColor("Blue");
      System.out.println(p1.getColor());
      p1.setTip(5);
      System.out.println(p1.getTip());

      /*BankAccount myAcc = new BankAccount();
      myAcc.username = "aniketamte";
      myAcc.setPassword("Aniket@12345");*/
    }  
}
class Pen {
    private String color;
    private int tip;
    
    //getters
    String getColor(){
        return this.color;
    }

    int getTip(){
        return this.tip;
    }

    //setters
    void setColor(String newColor){
        this.color = newColor;
    }
    void setTip(int newTip){
        this.tip= tip;
    }
}
/*class BankAccount{
    public String username;
    private String password;
    public void setPassword(String pwd){
        password = pwd;
    }
}*/