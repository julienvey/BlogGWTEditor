package com.zenika.blog.gwt.editor.client.widget;

import com.google.gwt.core.client.GWT;
import com.google.gwt.editor.client.EditorDelegate;
import com.google.gwt.editor.client.HasEditorDelegate;
import com.google.gwt.editor.client.LeafValueEditor;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.TextBox;

public class TextItem extends Composite implements LeafValueEditor<String>, HasEditorDelegate<String> {

    private FlowPanel mainPanel = new FlowPanel();

    private Label label = new Label();

    private TextBox textBox = new TextBox();

    private EditorDelegate<String> editorDelegate;

    public TextItem(final String labelText) {
        initWidget(mainPanel);

        label.setText(labelText);

        mainPanel.add(label);
        mainPanel.add(textBox);
    }

    @Override
    public String getValue() {
        checkNotNull();
        return textBox.getValue();
    }

    private void checkNotNull() {
        if (textBox.getValue().isEmpty()) {
            editorDelegate.recordError("TextItem " + label.getText() + " is empty", null, null);
        }
    }

    @Override
    public void setValue(final String value) {
        GWT.log(value);
        textBox.setValue(value);
    }

    @Override
    public void setDelegate(EditorDelegate<String> delegate) {
        this.editorDelegate = delegate;
    }

}
