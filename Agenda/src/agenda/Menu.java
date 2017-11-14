package agenda;

import java.util.Scanner;

/**
 * Laboratório de Programação 2 - Lab 1
 * 
 * @author Gabriel Almeida Lemos - 117110364
*/
public class Menu {
    
    
    public Menu(){
        
    }
    
    /**
     * Method that displays the menu
     * 
     */
    public void showMenu(){
        System.out.println("(C)adastrar Contato");
        System.out.println("(L)istar Contatos");
        System.out.println("(E)xibir Contato");
        System.out.println("(S)air");
        System.out.println("");
        System.out.print("Opção> ");
    }
    
    /**
     * Method that read the selected option
     * @return The selected option as a String
     */
    public String readOptions(){
        Scanner s = new Scanner(System.in);
        String aux = "x";
        while(!aux.equals("c") && !aux.equals("l") && !aux.equals("e") && !aux.equals("s")){
            this.showMenu();
            aux = s.nextLine().toLowerCase();
            if (!aux.equals("c") && !aux.equals("l") && !aux.equals("e") && !aux.equals("s")){
                System.out.println("OPÇÃO INVÁLIDA!");
            }
        }
        return aux;
    }
}
