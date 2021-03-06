// Download the Node helper library from twilio.com/docs/node/install
var twilio = require('twilio');
var twiml = new twilio.TwimlResponse();

twiml.say('You will now be connected to the first caller in the queue.')
    .dial({}, function() {
        this.queue('Queue Demo');
    })
    .redirect();

console.log(twiml.toString());