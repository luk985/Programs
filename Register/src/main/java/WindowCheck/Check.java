package WindowCheck;

public class Check {
	
	public String CheckPerson() {
		
		String username = System.getProperty("user.name");
		System.out.println("Person login: " + username);
		
		int n = 10;
		String[] TablePerson = new String[n];
		TablePerson[0] = "Łukasz.Janaczek";
		TablePerson[1] = "Łukasz.Jędras";
		TablePerson[2] = "Aleksandra.Morus";
		TablePerson[3] = "Tomasz.Lewalski";
		TablePerson[4] = "Janusz.Krefft";
		TablePerson[5] = "Tomasz.Feil";
		TablePerson[6] = "Kazimierz Piwko";
		TablePerson[7] = "luk";
		
		SampleController SampleController = new SampleController();
		
		for (int i=0; i<n; i++) {
			if(username.equals(TablePerson[i])) {
				System.out.println("The person has the authority");
				return TablePerson[i];
			}
		}
		return "false";
		
		
	}
			

}
