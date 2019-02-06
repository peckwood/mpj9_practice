package packt.addressbook;

import java.util.List;
import java.util.Date;
import java.util.ArrayList;
import java.util.ServiceLoader;
import java.util.logging.Logger;


import packt.util.SortUtil;
import packt.contact.model.Contact;
import packt.contact.util.ContactLoader;
import packt.contact.util.ContactLoadException;


public class Main {

    private static final Logger logger =
        Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {

        logger.info("Address book viewer application: Started");
        List<Contact> contacts = new ArrayList<>();
        ContactLoader contactLoader = new ContactLoader();

        try {
            contacts = contactLoader.parseXml("input.xml");
        } catch (ContactLoadException e) {
			logger.severe(e.getMessage());
            System.exit(0);
		}

        Iterable<SortUtil> sortUtils = ServiceLoader.load(SortUtil.class);
        for (SortUtil sortUtil : sortUtils){
            System.out.println("Found an instance of SortUtil");
            contacts = sortUtil.sortList(contacts);
        }
 /*       ServiceLoader<SortUtil> loader = ServiceLoader.load(SortUtil.class);
        for (final SortUtil service : loader) {
            System.out.println("The service " + service.getClass().getSimpleName() );
            contacts = service.sortList(contacts);
        }*/

        System.out.println(contacts);
        logger.info("Address book viewer application: Completed");
    }
}