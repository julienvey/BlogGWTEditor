package com.zenika.blog.gwt.editor.client.view;

import com.google.gwt.editor.client.Editor;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.zenika.blog.gwt.editor.client.widget.ListItem;
import com.zenika.blog.gwt.editor.client.widget.TextItem;
import com.zenika.blog.gwt.editor.shared.Address;

public class AddressView extends Composite implements Editor<Address> {

    private VerticalPanel mainPanel = new VerticalPanel();

    private TextItem street = new TextItem("Street");

    private TextItem zipCode = new TextItem("ZipCode");

    private TextItem city = new TextItem("City");

    private ListItem country = new ListItem("Country", "France", "Spain", "England", "Germany");

    public AddressView() {
        initWidget(mainPanel);
        mainPanel.add(street);
        mainPanel.add(zipCode);
        mainPanel.add(city);
        mainPanel.add(country);

    }

}
