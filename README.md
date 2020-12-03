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

### Acces Denied
![imagen1](https://user-images.githubusercontent.com/17706660/101078870-bbe8b280-3574-11eb-8a2a-92c514512fbc.png)

### Postman
### PostgreSQL Heroku Clientes
![imagen2](https://user-images.githubusercontent.com/17706660/101078883-c2772a00-3574-11eb-8d98-c3938ec3ac00.png)

### PostgreSQL Heroku Clientes
![imagen3](https://user-images.githubusercontent.com/17706660/101078888-c440ed80-3574-11eb-9cbe-5a6ed3aa327b.png)

### PostgreSQL Heroku User
![imagen4](https://user-images.githubusercontent.com/17706660/101078897-c5721a80-3574-11eb-9ccd-daf3415e35cc.png)


