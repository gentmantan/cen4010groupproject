public class EncryptedFile
{
    private Database db;

    public EncryptedFile(){
        Database db = new Database();
        this.db = db;
    }

    public void decryptDatabase(String pass){

    }

    public Database getDatabase(){
        return db;
    }
}
