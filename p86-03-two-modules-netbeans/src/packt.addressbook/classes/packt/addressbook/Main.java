package packt.addressbook;

import java.util.List;
import packt.addressbook.model.Contact;
import packt.addressbook.util.ContactUtil;
import packt.util.SortUtil;

public class Main{
	public static void main(String args[]){
            ContactUtil contactUtil = new ContactUtil();
            List<Contact> list = contactUtil.getContacts();
            
            SortUtil sortUtil = new SortUtil();
            sortUtil.sortList(list);
            
            System.out.println(list);

	}
}
	