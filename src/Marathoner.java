
public class Marathoner {
private double speed; 
private String name;
private int bibNum;

static int lastNumberIssued=1;
 private static String date;
 private static String time;
 private static String location;


public Marathoner(String name, double speed) {
	this.speed=speed;
	this.name=name;
	
	lastNumberIssued++;
	bibNum=lastNumberIssued;
	
}
 String getDate(){
	 return date;
}
 void setDate(String date) {
	 this.date=date;
 }
 
 
 String getTime() {
return time;	 
 }
 void setTime(String time) {
 this.time=time;
 }
 
 
 String getLocation() {
	 return location;
 }
 void setLocation(String location) {
	this.location=location;
 }
 
 
 void setName(String name) {
	 this.name=name;
 }
 String getName() {
	 return name;
 }
 
 
 int getBibNum() {
	 return bibNum;
 }
 }
 



