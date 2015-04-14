// JudoPaymentPlugin
function OtherLevelsPlugin() {
}

// Make one off payment
OtherLevelsPlugin.prototype.logEvent = function(
        onSuccess,
        onFail) {

    cordova.exec(onSuccess, onFail, 'OtherLevelsPlugin', 'logEvent',
            [
                null
            ]
            );
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



