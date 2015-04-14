package com.shapingcloud.otherlevels;

import org.apache.cordova.CordovaWebView;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CordovaInterface;
import android.os.Bundle;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import com.otherlevels.android.sdk.OlAndroidLibrary;
import com.otherlevels.android.sdk.Options;
import android.util.Log;


public class OtherLevelsPlugin extends CordovaPlugin {

    /**
     * Constructor.
     */
    public OtherLevelsPlugin() {
    }

    private CallbackContext callbackContext;

    @Override
    public void initialize(CordovaInterface cordova, CordovaWebView webView) {
        super.initialize(cordova, webView);
        Options options = new Options(); 
        options.appKey = "af282499597123429c3e3895de9c8689"; // mandatory
        options.trackingId = "123234";



        options.locationUpdatesEnabled = true; //optional

        // Initialise the library
        OlAndroidLibrary.init(this.cordova.getActivity().getApplication(), options);
        Log.d("OLAL-Lib", "OlAndroidLibrary: Initialising library with options...");


    }
    @Override
    public void onResume(boolean multitasking) {
        Log.d("OLAL-Lib", "OlAndroidLibrary: Initialising library with options...");
      super.onResume(multitasking);
      OlAndroidLibrary.getInstance(this.cordova.getActivity().getApplicationContext()).registerResume(this.cordova.getActivity());
      //--- Your code goes here    
    }
    @Override
    public void onPause(boolean multitasking) {
      super.onPause(multitasking);
        Log.d("OLAL-Lib", "OlAndroidLibrary: Initialising library with options...");
      OlAndroidLibrary.getInstance(this.cordova.getActivity().getApplicationContext()).registerPause(this.cordova.getActivity());
      //--- Your code goes here
    }


    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {

        //setting callback context
        this.callbackContext = callbackContext;
        Log.d("OLAL-Lib", "OlAndroidLibrary: Initialising library with options...");

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
