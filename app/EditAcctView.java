public class EditAcctView extends AcctView
{

    public EditAcctView(Account acct){
        super(acct);
    }

    public Account getAccount(){
        return acct;
    }

    public String printAccountName() {
        return accountName;
    }


    public void inputAccountName(String accountName) {
        this.accountName = accountName;
    }


    public String printUserName() {
        return userName;
    }


    public void inputUserName(String userName) {
        this.userName = userName;
    }


    public String printPassword() {
        return password;
    }


    public void inputPassword(String password) {
        this.password = password;
    }


    public String printUrl() {
        return url;
    }


    public void inputUrl(String url) {
        this.url = url;
    }


    public String printExpires() {
        return expires;
    }


    public void inputExpires(String expires) {
        this.expires = expires;
    }


    public String printNotes() {
        return notes;
    }


    public void inputNotes(String notes) {
        this.notes = notes;
    }

}
