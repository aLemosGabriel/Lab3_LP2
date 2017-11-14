package agenda;

import java.util.Scanner;

/**
 * Laboratório de Programação 2 - Lab 1
 *
 * @author Gabriel Almeida Lemos - 117110364
 */
public class Agenda {

    private Contact[] contacts;

    public Agenda() {
        this.contacts = new Contact[100];
        clearArray();
    }
    
    public void clearArray(){
        for (int i = 0; i < 100; i++){
            this.contacts[i] = new Contact("&&&&", "&&&&", "&&&&");
        }
    }
    
    public void setContact(int pos, Contact contact) {
        this.contacts[pos - 1] = contact;
    }

    public Contact[] getAllContacts(){
        return contacts;
    }
    
    public Contact getContact(int pos){
        return contacts[pos];
    }

}
