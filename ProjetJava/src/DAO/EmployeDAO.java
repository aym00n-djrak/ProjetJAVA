/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

/**
 *
 * @author remyj
 */
public interface EmployeDAO {
    
    public void AddEmploye(Employe employe);
    
    public Employe GetEmploye(int idemploye);
    
    public void UpdateEmploye(Employe employe);
    
    public void DeleteEmploye(int idemploye);
    
}
