package com.zenika.blog.gwt.editor.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.Scheduler;
import com.google.gwt.core.client.Scheduler.ScheduledCommand;
import com.google.gwt.editor.client.SimpleBeanEditorDriver;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.RootPanel;
import com.zenika.blog.gwt.editor.client.rpc.PersonService;
import com.zenika.blog.gwt.editor.client.rpc.PersonServiceAsync;
import com.zenika.blog.gwt.editor.client.view.PersonView;
import com.zenika.blog.gwt.editor.shared.Person;

public class EditorFramework implements EntryPoint {

    private PersonView personView = new PersonView();

    private PersonServiceAsync personService = GWT.create(PersonService.class);

    interface EditorDriver extends SimpleBeanEditorDriver<Person, PersonView> {
    }

    EditorDriver editorDriver = GWT.create(EditorDriver.class);

    @Override
    public void onModuleLoad() {

        RootPanel.get().add(personView);
        Button saveButton = new Button("Save");
        saveButton.addClickHandler(new ClickHandler() {

            @Override
            public void onClick(final ClickEvent event) {
                saveData();
            }
        });
        RootPanel.get().add(saveButton);

        Scheduler.get().scheduleDeferred(new ScheduledCommand() {

            @Override
            public void execute() {
                personService.getPerson(new AsyncCallback<Person>() {

                    @Override
                    public void onSuccess(final Person result) {
                        editorDriver.initialize(personView);
                        editorDriver.edit(result);
                    }

                    @Override
                    public void onFailure(final Throwable caught) {
                        Window.alert("Call failed");
                    }
                });
            }
        });
    }

    protected void saveData() {
        personService.setPerson(editorDriver.flush(), new AsyncCallback<Void>() {

            @Override
            public void onFailure(final Throwable caught) {
                Window.alert("Call failed");
            }

            @Override
            public void onSuccess(final Void result) {
                Window.alert("Data saved");
            }
        });

    }

}
