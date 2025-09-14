package tech_gadget_question;

public enum Category {
	LAPTOP(""),
	SMARTPHONE(""),
	TABLET("")
	;
	private String desc;
	private Category(String desc) {
		this.desc = desc;
	}
}
