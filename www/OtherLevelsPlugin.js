// JudoPaymentPlugin
function OtherLevelsPlugin() {
}

// Make one off payment
OtherLevelsPlugin.prototype.logEvent = function(
        paymentAmount,
        currency,
        paymentRef,
        consumerRef,
        userReceipt,
        onSuccess,
        onFail) {

    // cordova.exec(onSuccess, onFail, 'OtherLevelsPlugin', 'logEvent',
    //         [
    //             parseFloat(paymentAmount),
    //             currency,
    //             paymentRef,
    //             consumerRef,
    //             userReceipt
    //         ]
    //         );
}

cordova.addConstructor(function() {
    if (!window.plugins) {
        window.plugins = {};
    }

    if (!window.Cordova) {
        window.Cordova = cordova;
    }

    window.plugins.OtherLevelsPlugin = new OtherLevelsPlugin();
});



