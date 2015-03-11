package com.nudge.judopay;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;
import org.json.JSONArray;
import org.json.JSONException;
import com.otherlevels.android.sdk.OlAndroidLibrary;


/**
 * This class echoes a string called from JavaScript.
 */
public class OtherLevelsPlugin extends CordovaPlugin {
   

    private CallbackContext callbackContext;

    @Override
    public void initialize(CordovaInterface cordova, CordovaWebView webView) {

    }



    @Override
    public boolean execute(String action, JSONArray args,
            CallbackContext callbackContext) throws JSONException {

        //setting callback context
        this.callbackContext = callbackContext;

        if (action.equals("makeSimpleTransaction")){
                /*this.makePayment(this.cordova.getActivity().getApplicationContext(), args.getString(0), MY_JUDO_ID,
                    MY_API_TOKEN, MY_API_SECRET, "ref68798", "cref43434",
                    null, null, false,
                    SERVER);*/

            // this.makeOauthPayment(this.cordova.getActivity().getApplicationContext(),
            //                     args.getString(0), // paymentAmount
            //                     args.getString(1), // currency
            //                     args.getString(2), // paymentRef
            //                     args.getString(3), // consumerRef
            //                     args.getString(4) // userReceipt
            //                     );
            return true;
        }

        return false;
    }

    
}
