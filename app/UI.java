/**
 *
 * @author Chidie17
 */
public class UI {

    public String drawPassGenView(){
        PassGenView passView = new PassGenView();
        return passView.getPass();
    }

    public Account drawListAcctView(Database db){
        ListAcctView listAcctView = new ListAcctView();
        listAcctView.setDatabase(db);
        return listAcctView.enterEntry();
    }

    public Account drawEditAcctView(Account acct){
        EditAcctView editAcctView = new EditAcctView(acct);
        return editAcctView.getAccount();
    }

    public void drawReadAcctView(Account acct){
        ReadAcctView readAcctView = new ReadAcctView(acct);
    }


    public String drawDBLoginView(){
        DBLoginView dblogin = new DBLoginView();
        return dblogin.inputPass();
    }
}
