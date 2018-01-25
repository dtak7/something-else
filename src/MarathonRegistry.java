
public class MarathonRegistry {
public static void main(String[] args) {
	Marathoner bob=new Marathoner("Bob",10.5);
	bob.setName("Robert");
	bob.setLocation("somewhere over the rainbow");
	System.out.println(bob.getName()+"'s bib number is "+bob.getBibNum()+" and he is running in "+bob.getLocation());
	Marathoner sue=new Marathoner("Sue",13);
	sue.setLocation("New York");
	System.out.println("She will run in "+sue.getLocation());
	System.out.println("Sue's number is "+sue.getBibNum());
}
}
