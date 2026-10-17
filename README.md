
# emcs-tfe-crdl-reference-data-stub

This service simulates the responses of emcs-tfe-crdl-reference-data.

### Compiling the service

circe-literal seems to cause a stack overflow with the default stack size, so you should tell SBT to use a larger one:

```shell
sbt -J-Xss16m compile
```

### Running the service

```shell
sbt run
```
The service runs on port 8321 by default.

### License

This code is open source software licensed under the [Apache 2.0 License]("http://www.apache.org/licenses/LICENSE-2.0.html").
