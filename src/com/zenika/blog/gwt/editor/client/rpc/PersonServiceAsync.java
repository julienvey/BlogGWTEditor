package com.zenika.blog.gwt.editor.client.rpc;

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.zenika.blog.gwt.editor.shared.Person;

public interface PersonServiceAsync {

    void getPerson(AsyncCallback<Person> callback);

    void setPerson(Person person, AsyncCallback<Void> callback);

}
