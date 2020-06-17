
# Wiremock

Wiremock is a java based simulator for http apis
allows us to reliably simulate http dependecies
helps us to test specific scenarios, edge-caes and faults that may be difficult to
test with a real/test http endpoint
Allows us to dev against an real api that does not exist

Form the http client perspective, its real http. Nothing is different as far as the client is concerned between
wiremock and the real thing. Its just that we control the behaviour

# Why Wiremock?
* test flakiness - avoid these as much as possible
* fault injection 

```puml
A -> B
```

```puml
A -> B
```

