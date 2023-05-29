public class AirConditioner{

private boolean isOn;
private String productName;
private int temperature;


public  AirConditioner(String name) {
productName = name;
}
public void decreaseTemperature() {

}
public String getProductName() {
      return productName;
}
public int getTemperature() {	 
     return temperature;
}
public void increaseTemperature() {

}
public boolean isOn(boolean isOn) {
       return true;
}
public void setOn(boolean setOn) {
   
   }
public void setProductName(String newProductName) {
       this.productName = newProductName;
   }
public void setTemperature(int temperature) {
	this.temperature = temperature;
   }

}
