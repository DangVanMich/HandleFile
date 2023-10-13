/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import repository.IPersonRepository;
import repository.PersonRepository;
import java.util.ArrayList;
import model.Person;
import view.Menu;

/**
 *
 * @author admin
 */
public class ProgramHandle extends Menu<String>{
    
    private IPersonRepository ipr= new PersonRepository();
    private ArrayList<Person> persons;
    
     static String title = "========== File Processing =========";
    static String[] s = new String[]{"Find person info", "Copy Text to new file", "Exit"};
    
    public ProgramHandle(){
        super(title, s);
        persons = new ArrayList<>();
    }
    
    @Override
    public void execute(int n) {       
        switch (n) {
            case 1:
                ipr.findPersonInfo(persons);               
                break;
            case 2:
                ipr.copyTextToNewFile(persons);
                break;
            case 3:
                System.exit(0);
            default:
                System.out.println("Your choice invalid! Pls input another choice");
        }
    }
    
}