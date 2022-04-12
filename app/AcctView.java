/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Chidie17
 */
public abstract class AcctView {
    protected Account acct;
    protected String accountName;
    protected String userName;
    protected String password;
    protected String url;
    protected String expires;
    protected String notes;

    public AcctView(Account acct){
        this.acct = acct;
    }


}
