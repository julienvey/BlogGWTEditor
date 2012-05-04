package com.zenika.blog.gwt.editor.client.widget;

import com.google.gwt.editor.client.LeafValueEditor;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.ListBox;

public class ListItem extends Composite implements LeafValueEditor<String> {

    private FlowPanel mainPanel = new FlowPanel();

    private Label label = new Label();

    private ListBox listBox = new ListBox();

    public ListItem(final String labelText, final String... listValues) {
        initWidget(mainPanel);

        label.setText(labelText);
        for (String value : listValues) {
            listBox.addItem(value);
        }

        mainPanel.add(label);
        mainPanel.add(listBox);
    }

    @Override
    public String getValue() {
        return listBox.getItemText(listBox.getSelectedIndex());
    }

    @Override
    public void setValue(final String value) {
        for (int i = 0; i < listBox.getItemCount(); i++) {
            if (listBox.getItemText(i).equals(value)) {
                listBox.setSelectedIndex(i);
                break;
            }
        }
    }

}
