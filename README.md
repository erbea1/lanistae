# Lanistae
## Description
Group project for the module "Java Software Entwicklung mit Open Source 1 (BTI7515p) 20/21" at Bern University of Applied Sciences.

Lanista (plural lanistae) = [(historical) owner and trainer of gladiators](https://en.wiktionary.org/wiki/lanista#Latin)

## Lecturer's project
https://github.com/rvillars/Heroes

## Contributors
* [mth0348](https://github.com/mth0348) - Matthias Thomann
* [WTFisOssi](https://github.com/WTFisOssi) - Matthias Ossola
* [BonzerHello](https://github.com/BonzerHello) - Tim Kriemler
* [erbea1](https://github.com/erbea1) - Andreas Erb

## Setup development environment
`git clone https://github.com/erbea1/lanistae.git`

`mvn clean install`

## Startup services
Inside the root folder of each app (arena, camp, frontend, promoter, registry), run: `mvn spring-boot:run` or use the IDE.

## URLs
| Service          | URL                   |
|----------------- |-----------------------| 
|Eureka Registry   | http://localhost:1111 |
|Camp Service      | http://localhost:2222 |
|Arena Service     | http://localhost:3333 |
|Promoter Service  | http://localhost:4444 |
|Hystrix Stream    | http://localhost:4444/actuator/hystrix.stream |
|Hystrix Dashboard | http://localhost:4444/hystrix |
|Frontend Service  | http://localhost:8080 |
|Promote Fight     | http://localhost:8080/promoter/promoteFight |