public class Database
{
    private Directory root = new Directory();
    private String dbpass;

    public Database(String dbpass) {
        this.dbpass = dbpass;
    }

    public Directory getRoot(){
        return root;
    }

}
