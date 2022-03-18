/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlmvc;

import java.util.regex.*;
import java.util.*;

/**
 *
 * @author remyj
 */
public class EmailVerif {

    public Boolean emailverif(String adresse)
    {
        
        ArrayList<String> email = new ArrayList<String>();
        Boolean verif = null;
        
        email.add(adresse);
        //Regular Expression   
        String regx = "^(.+)@(.+)$";
        Pattern pattern = Pattern.compile(regx);
        
        //Iterate emails array list  
        for (String email1 : email) {
            //Create instance of matcher   
            Matcher matcher = pattern.matcher(email1);
            verif=matcher.matches();
            System.out.println(email1 + " : " + verif + "\n");
        }
        return verif;
    }
}
