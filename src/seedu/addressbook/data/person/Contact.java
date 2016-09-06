package seedu.addressbook.data.person;

public class Contact {

	public String value;
    protected boolean isPrivate;
    
    public void setIsPrivate(boolean isPrivate) {
    	this.isPrivate = isPrivate;
    }
    
    @Override
    public String toString() {
        return value;
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }


    public boolean isPrivate() {
        return isPrivate;
    }
}
