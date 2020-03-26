package main;

import model.AwesomePerson;
import model.ReallyAwesomePerson;


public class Application {
	
	public static void main(String [] args) {
		
		AwesomePerson r = new ReallyAwesomePerson();
		AwesomePerson ap = new AwesomePerson();
		ap.talk("youna", 9);
		
		ReallyAwesomePerson rap = new ReallyAwesomePerson();
		rap.talk();
		r.talk("rouya", 50);
		
		
	}
	
	

}
