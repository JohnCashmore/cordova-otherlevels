//
//  OtherLevelsPlugin.m
//

#import "OtherLevelsPlugin.h"
#import "AppDelegate.h"

@interface OtherLevelsPlugin ()

//@property (nonatomic, strong) NSDictionary *cardInfo;
//@property (nonatomic, strong) NSString *consumerRef;

@end

@implementation OtherLevelsPlugin

#pragma mark - Make Simple Transaction

- (void)makeSimpleTransaction:(CDVInvokedUrlCommand *)command {
    NSLog(@"Amount: %f", [[command.arguments objectAtIndex:0] floatValue]);
    [self paymentAction:nil withCommand:command];
}

- (void)paymentAction:(id)sender withCommand:(CDVInvokedUrlCommand*)command {

    NSDictionary *infoDict = [[NSBundle mainBundle] infoDictionary];

    NSString *env = [infoDict objectForKey:@"JudoENV"];
    NSString *paymentId = [infoDict objectForKey:@"JudoID"];
    NSString *token = [infoDict objectForKey:@"JudoAPIToken"];
    NSString *secret = [infoDict objectForKey:@"JudoAPISecret"];
   
    
}

@end
