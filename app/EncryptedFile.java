public class EncryptedFile
{
    private Database db;

    public EncryptedFile(){
        Database db = new Database();
        this.db = db;
    }

    public Database decryptDatabase(String pass){
        //some decryption logic
        return db;
    }
}
