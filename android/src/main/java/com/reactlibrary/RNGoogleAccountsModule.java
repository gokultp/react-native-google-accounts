
package com.reactlibrary;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;
import android.accounts.Account;
import android.accounts.AccountManager;
import java.util.*;


public class RNGoogleAccountsModule extends ReactContextBaseJavaModule {

  private final ReactApplicationContext reactContext;

  public RNGoogleAccountsModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext = reactContext;
  }

  @Override
  public String getName() {
    AccountManager manager = AccountManager.get(this);
    Account[] accounts = manager.getAccountsByType("com.google");
    List<String> possibleEmails = new LinkedList<String>();

    for (Account account : accounts) {
        // TODO: Check possibleEmail against an email regex or treat
        // account.name as an email address only for certain account.type
        // values.
        possibleEmails.add(account.name);
    }

    if (!possibleEmails.isEmpty() && possibleEmails.get(0) != null) {
        String email = possibleEmails.get(0);
        String[] parts = email.split("@");
        if (parts.length > 0 && parts[0] != null)
            return parts[0];
        else
            return null;
    } else
        return null;
  }
}