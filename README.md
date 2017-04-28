# PetClinic client application

The sample of using Feigh client to use microservices.

## To run
* Run necessary applications
    * Run Eureka server application (see repository: https://github.com/Andrei-Khadziukou/petclinic-eureka)
    * Run Config server application (see repository: https://github.com/Andrei-Khadziukou/petclinic-config)
    * Run Order service application (see repository: https://github.com/Andrei-Khadziukou/petclinic-order) 
* Use command `gradlew bootRun` in the project root folder
* Make a REST call 'http://\<host>:\<port:8090>/test-client/orders/' (8090 - default port for that application)
