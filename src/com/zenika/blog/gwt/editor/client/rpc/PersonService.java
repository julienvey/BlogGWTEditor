package com.zenika.blog.gwt.editor.client.rpc;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;
import com.zenika.blog.gwt.editor.shared.Person;

@RemoteServiceRelativePath("person")
public interface PersonService extends RemoteService {

    Person getPerson();

    void setPerson(Person person);

}
