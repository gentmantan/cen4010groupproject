public class App
{
    private BluetoothIO io;
    private Database db;
    private String pass;
    private UI ui;

    public App(){
        UI ui = new UI();
        this.ui = ui;
    }

    /**
     * Called in main class when App is first instantiated
     */
    public void newApp(){
        BluetoothIO io = new BluetoothIO();
        Database db = new Database();
        this.io = io;
        this.db = db;
    }

    public void storeEncryptedFilePass(String pass){
        //store a hashed version of the input password
    }

    public BluetoothIO getDongle(){
        return io;
    }

    public String getPass(){
        return ui.drawDBLoginView();
    }

    public String generatePass(){
        return ui.drawPassGenView();
    }

    public Account selectAccount(){
        return ui.drawListAcctView(db);
    }

    public void viewAccount(Account acct){
        ui.drawReadAcctView(acct);
    }

    public Database editAccount(Account acct){
        ui.drawEditAccountView(acct);
    }

}
