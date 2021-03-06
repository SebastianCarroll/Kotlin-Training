# Reactive Notes
Reactive system - set of deisgn principles and allows a systmem to scale up or
 down and recover from failures. It is possible to write some part of the
  system with reactive programming
  
  But using reactive programming doesn't make the system reactive
  
Reactive system must be:
responsive - achieved through resilience and scalable
Resilience - talkes into account all aspects/corner cases (good or bad) and
 responds accordingly
Scalable - can scale up or down to react to load
Message driven - Not the same as events? Messages have a destination? 

Reactive Programming
* event driven
* Data flow? 

Observer pattern is one reactive pattern
Producer sends events to consumer
Can overwhelm the consumer.
Consumer then needs to tell the producer to slow down - this is called back
pressure
 
Reactive programming uses these concepts:
- back-pressure
- non-blocking
- Asynchronous
- functional/declarative 

Blocking programming == syncronous execution
Traditional web server will take a new thread from the thread pool to handle
 an incoming request. These threads consume memory even if the thread is blocked or waiting on something. so can result in inefficient memory usage

Asynchronous programming based on Event loop model
Event loop
Small number of threads. Request is broken into events and go onto and event
 queue. If there is a blocking operatioin, it is handled by other threads and
 another event is generated to signal that the operation is completed and
 the result can be processed. A reactive web server can then process more
 requests and is more scalable
 
Asynchronous programming
When it doesn't block, we can't process the response/result straight away
. Need some mechanism to do this:
1. Callback - fn or expression that will be executed automatically when the
 operation is completed. Callback hell - nesting of callbacks makes it
  difficult to debug/maintain
2. In java: 
* thread pools
* fork/join framework
* parallel streams
* CompletableFuture

Problem with these is they can still block execution if not used correctly
 Don't have async/await functions like in nodejs
Publisher/Subscriber - would return a publish object and use a subscription
 object to manage the backpressure
 
 Functional and declarative
 Functional programming is based on concepts such as pure functions
 , expressions, lambdas and immutability
 Makes the code more testable, declarative and maintainable
 Java is not functional really, however we can use these concepts to help
  improve the code
Imperative code - tell the computer each and every step to execute. Both what
 to do and how to do it

Declarative code - just explain what you would like to happen, not the
 implementation details
 
Data as flow: data flows through the pipeline

java stream - values are pulled from the source
Reactive streams - don't pull the value from the source, allow it to be
 pushed through the system where backpressure can be applied if required
 
 ## Spring WebFlux
 Doesn't replace Spring MVC but works similarly
 MVC - servlet api, blocking, synchronous, one request per thread
 WebFlux - reactive streams, non-blocking, async, concurrent connections
 
 Can use the annotation style
 Functional style - divided into two parts, a router function and a handler
  function
 Also provides a kotlin DSL to make the functional style almost entirely
  declarative. 
 Must be reactive all the way down;
 * reactive spring data
 * reactive spring security
 * non-blocking server
 etc
 Can use the reactive starters
 No reactive JDBC driver for databases
 Have to use no-sql
 
## Summary
Reactive systems are different to reactive programming
 
Reactive programming - non-blocking, asynchronous, functional/declarative
Spring webflux - alternative to Spring MVC, annontation + functional models
, reactive stack built on project reactor
 
 