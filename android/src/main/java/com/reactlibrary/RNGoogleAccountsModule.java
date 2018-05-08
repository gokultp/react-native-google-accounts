
package com.reactlibrary;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Promise;
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
        return "RNGoogleAccounts";
    }

    @ReactMethod
    public void getAccountEmail(final Promise promise) {
        try {
            AccountManager manager = AccountManager.get(reactContext);
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
                promise.resolve(email);
                
            } else
                 promise.resolve(null);        
        } catch (Exception ex) {
            promise.reject("ERR_UNEXPECTED_EXCEPTION", ex);
        }
    }

}