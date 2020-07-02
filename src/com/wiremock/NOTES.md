
# Wiremock

Wiremock is a java based simulator for http apis
allows us to reliably simulate http dependecies
helps us to test specific scenarios, edge-caes and faults that may be difficult to
test with a real/test http endpoint
Allows us to dev against an real api that does not exist

Form the http client perspective, its real http. Nothing is different as far as the client is concerned between
wiremock and the real thing. Its just that we control the behaviour

# Why Wiremock?
Issues without wiremock
* test flakiness - avoid these as much as possible
* fault injection - timeouts, circuit breakers, error handling, etc 
* non-determinism - every day the dependent data may change
* load testing - dev might not be able to cope with same load as prod


## Wiremock vs mockito-like

Wiremock
is a webserver, just like th real thing
real http
is external to application code
can simulate network faults
is language agnostic
More production like test

Mockito-like
not a webserver
No http takes place
replaces the applicaiton code
cann sim faults

coupled to language
not prod like - bleed into application

## Stubbing


```puml
A -> B
```

```puml
A -> B
```

## Request Matching
Can verify not only the endpoint which was to be hit but also lots of other things such as the host header

URL: 
```
urlEqualTo("/your/url?and=query") // exact match
urlMatching("/your/([a-z]*)\\?and=query") // regex match
urlPathEqualTo("/your/url") // path only match
```

Header has content-type
```
.withHeader("Content-Type", equalTo("application/json"))
```

Same matchers exist here: 
```
equalToIgnoreCase
binaryEqualTo
containing // matches a portion
matching //regex match
```