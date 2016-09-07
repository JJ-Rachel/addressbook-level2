package seedu.addressbook.data.tag;

import seedu.addressbook.data.person.*;

public class Tagging {
	
	private Person person;
	private Tag tag;
	private boolean isAdded; // true if its adding a tag, false if its deleting a tag
  
	public Tagging(Person person, Tag tag, boolean isAdded){

		this.person = person;
		this.tag = tag;
		this.isAdded = isAdded;
	}
  

	public Person getPerson() {
		return person;
	}
	public Tag getTag() {
		return tag;
	}
	
	public void setPerson(Person person) {
		this.person = person;
	}
	public void setTag(Tag tag) {
		this.tag = tag;
	}
  
	public String toString(){
		if (isAdded){
			return "+ " + person.getName().toString() + " " + tag.toString();
		} else {
			return "- " + person.getName().toString() + " " + tag.toString();
		}
  }
  
}