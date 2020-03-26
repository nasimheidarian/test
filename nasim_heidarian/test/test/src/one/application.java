package one;

public class application {
	
	public static void main(String args[]) {
		
		/*person p = new person();
		p.name = "nasim";
		p.age= 33;
		System.out.println(p.name);
		System.out.println(p.age);*/
		
		PrivatePerson pp = new PrivatePerson();
		
		 pp.setName("nasim");
		 pp.seAge(33);
		System.out.println(pp.getName()+pp.getAge());
		
		TalkablePerson tp= new TalkablePerson();
		tp.Talk(pp.getName(),pp.getAge());
		
		ConstractorPerson cp = new ConstractorPerson();
	    System.out.println(cp.name+" "+cp.age);
		
		
	}

	
	

}
