/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelmvc.DAO;

/**
 *
 * @author remyj
 */
public interface InviteDAO {

    public void AddInvite(Invite invite);

    public Invite GetInvite(int idinvite);

    public void UpdateInvite(Invite invite);

    public void DeleteInvite(int idinvite);
}
