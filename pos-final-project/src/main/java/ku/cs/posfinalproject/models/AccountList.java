package ku.cs.posfinalproject.models;

import java.util.ArrayList;
import java.util.List;

public class AccountList {
    private List<Account> accountList;

    public AccountList() {
        this.accountList = new ArrayList<>();
    }

    public void addAccount(Account account) {
        accountList.add(account);

    }

    public void addAccount(String name, String username, String password, String role ){
        accountList.add(new Account(name,username,password,role));
    }

    public Account getAccountById(String username) {
        for (Account account : accountList)
            if (account.getUsername().equals(username))
                return account;

        return null;
    }

    public boolean login(String username, String password) {
        Account account = getAccountById(username);

        if (account == null)
            return false;

        return account.verify(password);
    }

    public List<Account> getAccountList() {
        return accountList;
    }
}
