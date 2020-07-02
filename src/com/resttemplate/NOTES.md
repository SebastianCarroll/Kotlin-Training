# RestTemplate from Spring

https://www.baeldung.com/rest-template

What is the exchange method? 
Exchange is the most generic and flexible of the methods. The other methods such as getForEntity appear to be
abstraction layers over exchange
https://stackoverflow.com/questions/20186497/what-is-the-resttemplate-exchange-method-for

Why use it?
Sometimes the others don't do what you need. e.g. the below  
"...the only way to send Headers such as accept and Authorization is by using the exchange method..." from
https://stackoverflow.com/questions/21101250/sending-get-request-with-authentication-headers-using-resttemplate