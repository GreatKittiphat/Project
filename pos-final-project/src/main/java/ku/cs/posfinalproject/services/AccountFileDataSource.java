package ku.cs.posfinalproject.services;

import ku.cs.posfinalproject.models.AccountList;

import java.util.ArrayList;

public class AccountFileDataSource implements Datasource<AccountList> {

    private DataFileManager dataFileManager;

    public AccountFileDataSource() {
        this.dataFileManager = new DataFileManager("account.csv","data" );
    }

    @Override
    public AccountList readData() {
        ArrayList<String[]> data = dataFileManager.extractDataToArray();

        AccountList accountList = new AccountList();

        for (String[] accountData : data) {
            String name = accountData[0];
            String username = accountData[1];
            String password = accountData[2];
            String role = accountData[3];

            accountList.addAccount(name,username,password,role);

        }
        return accountList;
    }

    @Override
    public void writeData(AccountList data) {
        dataFileManager.writeData(data.getAccountList());

    }
}
