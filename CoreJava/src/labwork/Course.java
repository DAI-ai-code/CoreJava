package labwork;

public enum Course {
	
//	DAI, DBDA, DAC, DITISS, DESD, DVLSI, DHPCSA, DUASP
	DAI("Diploma in Artificial Intelligence"),
	DBDA("Diploma in Big Data Analytics"),
	DAC("Diploma in Advanced Computing");
	
	private String desc;
	
	private Course(String desc) {
		this.desc = desc;
	}

}
