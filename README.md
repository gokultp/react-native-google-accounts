[![NPM Version][npm-image]][npm-url]

# react-native-google-accounts

## Getting started

`$ npm install react-native-google-accounts --save`

### Mostly automatic installation

`$ react-native link react-native-google-accounts`

### Manual installation




#### Android

1. Open up `android/app/src/main/java/[...]/MainActivity.java`
  - Add `import com.reactlibrary.RNGoogleAccountsPackage;` to the imports at the top of the file
  - Add `new RNGoogleAccountsPackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-google-accounts'
  	project(':react-native-google-accounts').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-google-accounts/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-google-accounts')
  	```




## Usage
```javascript
import RNGoogleAccounts from 'react-native-google-accounts';

// Get Connected Emailid
RNGoogleAccounts.getAccountEmail().then(email=>{
	console.log(email)
});
```
[npm-image]: https://img.shields.io/npm/v/react-native-google-accounts.svg
[npm-url]: https://www.npmjs.com/package/react-native-google-accounts

  
