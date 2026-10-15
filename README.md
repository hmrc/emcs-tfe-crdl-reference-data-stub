
# emcs-tfe-crdl-reference-data-stub

This service simulates the responses of emcs-tfe-crdl-reference-data.

### Compiling the service

circe-literal seems to cause a stack overflow unless the stack size is increased, so you should export SBT_OPTS with a suitably large value before compiling:

```shell
export SBT_OPTS="-Xss8M"
sbt compile
```

### Running the service

```shell
sbt run
```
The service runs on port 8321 by default.

### License

This code is open source software licensed under the [Apache 2.0 License]("http://www.apache.org/licenses/LICENSE-2.0.html").
