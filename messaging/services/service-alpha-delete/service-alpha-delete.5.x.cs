// Download the twilio-csharp library from twilio.com/docs/libraries/csharp
using System;
using Twilio;
using Twilio.Rest.Messaging.V1.Service;


class Example
{
    static void Main (string[] args)
    {
      // Find your Account SID and Auth Token at twilio.com/console
      const string accountSid = "ACXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX";
      const string authToken = "your_auth_token";
      const string pathServiceSid = "MG2172dd2db502e20dd981ef0d67850e1a";
      const string alphaSenderSid = "AIc781610ec0b3400c9e0cab8e757da937";

      TwilioClient.Init(accountSid, authToken);

      var deleted = AlphaSenderResource.Delete(pathServiceSid, alphaSenderSid);

      Console.WriteLine(deleted);
    }
}
