public class ReadAcctView extends AcctView
{
   
    public ReadAcctView(Account acct){
        super(acct);
    }


    public String printAccountName() {
        return accountName;
    }


    public String printUserName() {
        return userName;
    }


    public String printPassword() {
        return password;
    }


    public String printUrl() {
        return url;
    }


    public String printExpires() {
        return expires;
    }


    public String printNotes() {
        return notes;
    }


}
