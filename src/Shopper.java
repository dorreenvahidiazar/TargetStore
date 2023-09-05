public class Shopper {
    private String name;
    private String creditCardName;
    private String creditCardNum;
    public Shopper (String name, String creditCardName, String creditCardNum) {
        this.name = name;
        this.creditCardName = creditCardName;
        this.creditCardNum = creditCardNum;

    }
    public String getName(){
        return name;
    }
    public String getCreditCardName(){
        return creditCardName;
    }
    public String getCreditCardNum(){
        return creditCardNum;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setCreditCardName(String creditCardName){
        this.creditCardName = creditCardName;
    }
    public void setCreditCardNum(String creditCardNum){
        this.creditCardNum = creditCardNum;
    }
    public String toString(){
        return "Shopper " + "name= " +name + " " +
                ", creditCardName= " + creditCardName + " " +
                ", creditCaredNum= " + creditCardNum + " ";
    }

}
