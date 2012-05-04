package com.zenika.blog.gwt.editor.server;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.zenika.blog.gwt.editor.client.rpc.PersonService;
import com.zenika.blog.gwt.editor.shared.Address;
import com.zenika.blog.gwt.editor.shared.Person;

@SuppressWarnings("serial")
public class PersonServiceImpl extends RemoteServiceServlet implements PersonService {

    private static Person person;

    static {
        Address address = new Address();
        address.setCity("Paris");
        address.setCountry("France");
        address.setStreet("51 rue le Peletier");
        address.setZipCode("75009");

        person = new Person();
        person.setFirstName("Julien");
        person.setLastName("Vey");
        person.setPhoneNumber("0102030405");
        person.setAddress(address);
        person.setCompany("Zenika");
    }

    @Override
    public Person getPerson() {
        return person;
    }

    @Override
    public void setPerson(final Person person) {
        PersonServiceImpl.person = person;

    }
}
