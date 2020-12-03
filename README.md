# TARJETA CLIENTE

 

Proyecto para extraer la informacion de la tarjeta de los clientes


## Resources


- [STAGING API] 


- Health
http://localhost:8080/
- Login:
http://localhost:8080/authenticate
- Clientes:
http://localhost:8080/api/clientes
- Cliente ID: 
http://localhost:8080/api/cliente/1


 
## Requisitos

 

- Java 8
- Spring Boot 
- Heroku
- PostgreSQL
 

## Levantar servicio

 

### Ambiente Local

 

Se debe ejecutar los siguientes comandos en una terminal

 - mvn clean install (esto cosntruye el artefacto)
  
El servicio será levantado en http://localhost:8080.

 



## Herramientas

 

### Logs

 

Para ver los logs que genera el servicio, ingresar al sitio de Kibana y filtrar por los siguientes datos:


- appname: tarjetaCredito
- version: version que desee revisar
- environment: staging 

 
### Health

 

El endpoint expuesto para saber el estado de la API es GET / `/health`.

 

##

##

### Endpoint

**POST** 
``{url}/api/clientes``

**HEADER:**

| Parameter    | Required     | Descripction | Example      |
| ------------ | ------------ | ------------ | ------------ |
|  Authorization|   |Token Authorization |  Bearer xxxxxxxxxxxxxx|


**BODY:**

```json
[
    {
        "nombresCliente": "John",
        "apellidosCliente": "Ochoa",
        "telefono": "4601179",
        "lineaDireccion1": "CRA..",
        "lineaDireccion2": "TRANSV.",
        "ciudad": "Bogota",
        "barrio": "La Estancia",
        "pais": "Colombia"
    },
    {
        "nombresCliente": "Jairo",
        "apellidosCliente": "Mesa",
        "telefono": "4601180",
        "lineaDireccion1": "CALLE...",
        "lineaDireccion2": "AV..",
        "ciudad": "Medellin",
        "barrio": "Poblado",
        "pais": "Colombia"
    }
]
```
