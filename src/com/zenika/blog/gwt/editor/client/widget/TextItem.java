package com.zenika.blog.gwt.editor.client.widget;

import com.google.gwt.editor.client.LeafValueEditor;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.TextBox;

public class TextItem extends Composite implements LeafValueEditor<String> {

    private FlowPanel mainPanel = new FlowPanel();

    private Label label = new Label();

    private TextBox textBox = new TextBox();

    public TextItem(final String labelText) {
        initWidget(mainPanel);

        label.setText(labelText);

        mainPanel.add(label);
        mainPanel.add(textBox);
    }

    @Override
    public String getValue() {
        return textBox.getValue();
    }

    @Override
    public void setValue(final String value) {
        textBox.setValue(value);
    }

}
