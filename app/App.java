public class App
{
    private BluetoothIO io;
    private EncryptedFile ef;
    private String pass;

    public App(){
        UI ui = new UI();
    }

    /**
     * Called in main class when App is first instantiated
     */
    public void newApp(){
        BluetoothIO io = new BluetoothIO();
        EncryptedFile ef = new EncryptedFile();
    }

    public void storeEncryptedFilePass(String pass){
        this.pass = pass;
    }

    public Database getDatabase(){ //should we pass the entire database or only specific interfaces?
        return ef.decryptDatabase(pass);
    }

    /**
     * Returns a list of DongleAddress objects to be chosen
     */

    public BluetoothIO getDongle(){
        return io;
    }

}
