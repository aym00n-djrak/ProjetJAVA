/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelmvc;

import java.util.ArrayList;

/**
 *
 * @author remyj
 */
public class ConvertAlistToList {
    
    public String[] convert(ArrayList<String> name)
    {
        String[] liste= new String[name.size()];
        
        for(int i=0; i<name.size();i++)
        {
            liste[i]=name.get(i);   
        }
        return liste;
    }
    
}
