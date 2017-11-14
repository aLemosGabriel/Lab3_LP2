package agenda;

import java.util.Scanner;

/**
 * Laboratório de Programação 2 - Lab 3
 * 
 * @author Gabriel Almeida Lemos - 117110364
*/
public class Main {
    
    
    static Agenda agenda = new Agenda();
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        mainAgenda();
    }
    
    public static void showContactMenu(){
        Scanner s = new Scanner(System.in);
        System.out.print("Contato> ");
        int pos = s.nextInt();
        Contact contact = agenda.getContact(pos);
        if (!contact.getName().equals("&&&&") && !contact.getSurname().equals("&&&&") && !contact.getPhone().equals("&&&&")){
            System.out.println(contact.getName() + " " + contact.getSurname() + " - " + contact.getPhone());
        }
        else{
            System.out.println("POSIÇÃO INVÁLIDA!");
        }
        System.out.println("");
    }
    
    /**
     * Method that executes the agenda
     *
     */
    public static void mainAgenda() {
        Menu menu = new Menu();
        String op;
        do {
            op = menu.readOptions();
            switch (op) {
                case "c":
                    registerContact();
                    break;
                case "l":
                    listContacts();
                    break;
                case "e":
                    showContactMenu();
                    break;
                case "s":
                    break;
            }
        } while (!op.equals("s"));

    }
    
    public static void registerContact(){
        System.out.println("");
        Scanner s = new Scanner(System.in);
        System.out.print("Posição: ");
        int pos = s.nextInt();
        String aux = s.nextLine();
        if (pos >= 1 && pos <= 100) {
            System.out.print("Nome: ");
            String name = s.nextLine();
            System.out.print("Sobrenome: ");
            String surname = s.nextLine();
            System.out.print("Telefone: ");
            String phone = s.nextLine();
            Contact contact = new Contact(name, surname, phone);
            agenda.setContact(pos, contact);
            System.out.println("CADASTRO REALIZADO!");
            System.out.println("");
        }
        else{
            System.out.println("POSIÇÃO INVÁLIDA!");
            System.out.println("");
        }
    }
    
    public static void listContacts(){
        System.out.println("");
        Contact[] contacts = agenda.getAllContacts();
        for (int i = 0; i < 100; i++){
            if (!contacts[i].getName().equals("&&&&") && !contacts[i].getSurname().equals("&&&&") && !contacts[i].getPhone().equals("&&&&")){
                System.out.println(i + 1 + " - " + contacts[i].getName() + " " + contacts[i].getSurname());
            }
        }
        System.out.println(" ");
    }
}
