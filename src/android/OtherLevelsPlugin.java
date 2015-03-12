package com.shapingcloud.otherlevels;
import org.apache.cordova.CordovaWebView;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CordovaInterface;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import com.otherlevels.android.sdk.OlAndroidLibrary;



public class OtherLevelsPlugin extends CordovaPlugin {

    /**
     * Constructor.
     */
    public OtherLevelsPlugin() {
    }

    private CallbackContext callbackContext;

    public void initialize(CordovaInterface cordova, CordovaWebView webView) {
        super.initialize(cordova, webView);

    }




    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {

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
