package com.zenika.blog.gwt.editor.client.view;

import com.google.gwt.editor.client.Editor;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.zenika.blog.gwt.editor.client.widget.TextItem;
import com.zenika.blog.gwt.editor.shared.Person;

public class PersonView extends Composite implements Editor<Person> {

    private VerticalPanel form = new VerticalPanel();

    private TextItem firstName = new TextItem("First name");

    private TextItem lastName = new TextItem("Last name");

    private TextItem phoneNumber = new TextItem("Phone number");

    private TextItem company = new TextItem("Company");

    private AddressView address = new AddressView();

    public PersonView() {
        initWidget(form);
        form.add(firstName);
        form.add(lastName);
        form.add(phoneNumber);
        form.add(company);
        form.add(address);
    }

}
