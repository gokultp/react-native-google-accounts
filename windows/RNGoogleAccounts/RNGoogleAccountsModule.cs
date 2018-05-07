using ReactNative.Bridge;
using System;
using System.Collections.Generic;
using Windows.ApplicationModel.Core;
using Windows.UI.Core;

namespace Google.Accounts.RNGoogleAccounts
{
    /// <summary>
    /// A module that allows JS to share data.
    /// </summary>
    class RNGoogleAccountsModule : NativeModuleBase
    {
        /// <summary>
        /// Instantiates the <see cref="RNGoogleAccountsModule"/>.
        /// </summary>
        internal RNGoogleAccountsModule()
        {

        }

        /// <summary>
        /// The name of the native module.
        /// </summary>
        public override string Name
        {
            get
            {
                return "RNGoogleAccounts";
            }
        }
    }
}
