# -RepositoryRestResource
@RepositoryRestResource with MongoDB

When you put @RepositoryRestResource in DB repository class, it is possible play with full REST API for current domain.

1. Start MongoDB in your localost.
2. Start project as Spring Boot application, use NetBeans 8.2
3. Do POST Request to 

http://localhost:2018/api/v2/users
JSON 

{
  "firstname": "Spring",
  "lastname": "Boot",
  "email": "spring.boot@gmail.com",
  "password": "spboot2018"  
}

For REST requests you can use 

https://httpie.org/#installation
https://github.com/clue/docker-httpie

http POST http://localhost:2018/api/v2/users firstname=John lastname=Boot email=spring.boot@gmail.com password=spboot2018

#Example Request and Response

http POST http://192.168.99.1:2018/api/v2/users firstname=John lastname=Boot email=spring.boot@gmail.com password=spboot2018
HTTP/1.1 201
Content-Type: application/json;charset=UTF-8
Date: Thu, 14 Jun 2018 20:41:23 GMT
Location: http://192.168.99.1:2018/api/v2/users/5b22d2f32bf5e7274079c604
Transfer-Encoding: chunked

{
    "_links": {
        "self": {
            "href": "http://192.168.99.1:2018/api/v2/users/5b22d2f32bf5e7274079c604"
        },
        "user": {
            "href": "http://192.168.99.1:2018/api/v2/users/5b22d2f32bf5e7274079c604"
        }
    },
    "email": "spring.boot@gmail.com",
    "firstname": "John",
    "lastname": "Boot",
    "password": "spboot2018"
}

#GET Request will return list of records:

http GET http://192.168.99.1:2018/api/v2/users

Available API for One Repository:

2018-06-15 00:24:27.119  INFO [xserver,,,] 10048 --- [           main] o.s.d.r.w.RepositoryRestHandlerMapping   : Mapped "{[/api/v2/{repository}/{id}/{property}/{propertyId}],methods=[GET],produces=[application/hal+json || application/json]}" onto public org.springframework.http.ResponseEntity<org.springframework.hateoas.ResourceSupport> org.springframework.data.rest.webmvc.RepositoryPropertyReferenceController.followPropertyReference(org.springframework.data.rest.webmvc.RootResourceInformation,java.io.Serializable,java.lang.String,java.lang.String,org.springframework.data.rest.webmvc.PersistentEntityResourceAssembler) throws java.lang.Exception

2018-06-15 00:24:27.120  INFO [xserver,,,] 10048 --- [           main] o.s.d.r.w.RepositoryRestHandlerMapping   : Mapped "{[/api/v2/{repository}/{id}/{property}],methods=[GET],produces=[application/hal+json || application/json]}" onto public org.springframework.http.ResponseEntity<org.springframework.hateoas.ResourceSupport> org.springframework.data.rest.webmvc.RepositoryPropertyReferenceController.followPropertyReference(org.springframework.data.rest.webmvc.RootResourceInformation,java.io.Serializable,java.lang.String,org.springframework.data.rest.webmvc.PersistentEntityResourceAssembler) throws java.lang.Exception

2018-06-15 00:24:27.120  INFO [xserver,,,] 10048 --- [           main] o.s.d.r.w.RepositoryRestHandlerMapping   : Mapped "{[/api/v2/{repository}/{id}/{property}],methods=[DELETE],produces=[application/hal+json || application/json]}" onto public org.springframework.http.ResponseEntity<? extends org.springframework.hateoas.ResourceSupport> org.springframework.data.rest.webmvc.RepositoryPropertyReferenceController.deletePropertyReference(org.springframework.data.rest.webmvc.RootResourceInformation,java.io.Serializable,java.lang.String) throws java.lang.Exception

2018-06-15 00:24:27.120  INFO [xserver,,,] 10048 --- [           main] o.s.d.r.w.RepositoryRestHandlerMapping   : Mapped "{[/api/v2/{repository}/{id}/{property}],methods=[GET],produces=[application/x-spring-data-compact+json || text/uri-list]}" onto public org.springframework.http.ResponseEntity<org.springframework.hateoas.ResourceSupport> org.springframework.data.rest.webmvc.RepositoryPropertyReferenceController.followPropertyReferenceCompact(org.springframework.data.rest.webmvc.RootResourceInformation,java.io.Serializable,java.lang.String,org.springframework.data.rest.webmvc.PersistentEntityResourceAssembler) throws java.lang.Exception

2018-06-15 00:24:27.120  INFO [xserver,,,] 10048 --- [           main] o.s.d.r.w.RepositoryRestHandlerMapping   : Mapped "{[/api/v2/{repository}/{id}/{property}],methods=[PATCH || PUT || POST],consumes=[application/json || application/x-spring-data-compact+json || text/uri-list],produces=[application/hal+json || application/json]}" onto public org.springframework.http.ResponseEntity<? extends org.springframework.hateoas.ResourceSupport> org.springframework.data.rest.webmvc.RepositoryPropertyReferenceController.createPropertyReference(org.springframework.data.rest.webmvc.RootResourceInformation,org.springframework.http.HttpMethod,org.springframework.hateoas.Resources<java.lang.Object>,java.io.Serializable,java.lang.String) throws java.lang.Exception

2018-06-15 00:24:27.121  INFO [xserver,,,] 10048 --- [           main] o.s.d.r.w.RepositoryRestHandlerMapping   : Mapped "{[/api/v2/{repository}/{id}/{property}/{propertyId}],methods=[DELETE],produces=[application/hal+json || application/json]}" onto public org.springframework.http.ResponseEntity<org.springframework.hateoas.ResourceSupport> org.springframework.data.rest.webmvc.RepositoryPropertyReferenceController.deletePropertyReferenceId(org.springframework.data.rest.webmvc.RootResourceInformation,java.io.Serializable,java.lang.String,java.lang.String) throws java.lang.Exception

2018-06-15 00:24:27.121  INFO [xserver,,,] 10048 --- [           main] o.s.d.r.w.RepositoryRestHandlerMapping   : Mapped "{[/api/v2/{repository}/{id}],methods=[PATCH],produces=[application/hal+json || application/json]}" onto public org.springframework.http.ResponseEntity<org.springframework.hateoas.ResourceSupport> org.springframework.data.rest.webmvc.RepositoryEntityController.patchItemResource(org.springframework.data.rest.webmvc.RootResourceInformation,org.springframework.data.rest.webmvc.PersistentEntityResource,java.io.Serializable,org.springframework.data.rest.webmvc.PersistentEntityResourceAssembler,org.springframework.data.rest.webmvc.support.ETag,java.lang.String) throws org.springframework.web.HttpRequestMethodNotSupportedException,org.springframework.data.rest.webmvc.ResourceNotFoundException

2018-06-15 00:24:27.122  INFO [xserver,,,] 10048 --- [           main] o.s.d.r.w.RepositoryRestHandlerMapping   : Mapped "{[/api/v2/{repository}],methods=[HEAD],produces=[application/hal+json || application/json]}" onto public org.springframework.http.ResponseEntity<?> org.springframework.data.rest.webmvc.RepositoryEntityController.headCollectionResource(org.springframework.data.rest.webmvc.RootResourceInformation,org.springframework.data.rest.webmvc.support.DefaultedPageable) throws org.springframework.web.HttpRequestMethodNotSupportedException

2018-06-15 00:24:27.122  INFO [xserver,,,] 10048 --- [           main] o.s.d.r.w.RepositoryRestHandlerMapping   : Mapped "{[/api/v2/{repository}/{id}],methods=[HEAD],produces=[application/hal+json || application/json]}" onto public org.springframework.http.ResponseEntity<?> org.springframework.data.rest.webmvc.RepositoryEntityController.headForItemResource(org.springframework.data.rest.webmvc.RootResourceInformation,java.io.Serializable,org.springframework.data.rest.webmvc.PersistentEntityResourceAssembler) throws org.springframework.web.HttpRequestMethodNotSupportedException

2018-06-15 00:24:27.122  INFO [xserver,,,] 10048 --- [           main] o.s.d.r.w.RepositoryRestHandlerMapping   : Mapped "{[/api/v2/{repository}/{id}],methods=[DELETE],produces=[application/hal+json || application/json]}" onto public org.springframework.http.ResponseEntity<?> org.springframework.data.rest.webmvc.RepositoryEntityController.deleteItemResource(org.springframework.data.rest.webmvc.RootResourceInformation,java.io.Serializable,org.springframework.data.rest.webmvc.support.ETag) throws org.springframework.data.rest.webmvc.ResourceNotFoundException,org.springframework.web.HttpRequestMethodNotSupportedException

2018-06-15 00:24:27.123  INFO [xserver,,,] 10048 --- [           main] o.s.d.r.w.RepositoryRestHandlerMapping   : Mapped "{[/api/v2/{repository}],methods=[GET],produces=[application/hal+json || application/json]}" onto public org.springframework.hateoas.Resources<?> org.springframework.data.rest.webmvc.RepositoryEntityController.getCollectionResource(org.springframework.data.rest.webmvc.RootResourceInformation,org.springframework.data.rest.webmvc.support.DefaultedPageable,org.springframework.data.domain.Sort,org.springframework.data.rest.webmvc.PersistentEntityResourceAssembler) throws org.springframework.data.rest.webmvc.ResourceNotFoundException,org.springframework.web.HttpRequestMethodNotSupportedException

2018-06-15 00:24:27.123  INFO [xserver,,,] 10048 --- [           main] o.s.d.r.w.RepositoryRestHandlerMapping   : Mapped "{[/api/v2/{repository}],methods=[OPTIONS],produces=[application/hal+json || application/json]}" onto public org.springframework.http.ResponseEntity<?> org.springframework.data.rest.webmvc.RepositoryEntityController.optionsForCollectionResource(org.springframework.data.rest.webmvc.RootResourceInformation)

2018-06-15 00:24:27.123  INFO [xserver,,,] 10048 --- [           main] o.s.d.r.w.RepositoryRestHandlerMapping   : Mapped "{[/api/v2/{repository}],methods=[GET],produces=[application/x-spring-data-compact+json || text/uri-list]}" onto public org.springframework.hateoas.Resources<?> org.springframework.data.rest.webmvc.RepositoryEntityController.getCollectionResourceCompact(org.springframework.data.rest.webmvc.RootResourceInformation,org.springframework.data.rest.webmvc.support.DefaultedPageable,org.springframework.data.domain.Sort,org.springframework.data.rest.webmvc.PersistentEntityResourceAssembler) throws org.springframework.data.rest.webmvc.ResourceNotFoundException,org.springframework.web.HttpRequestMethodNotSupportedException

2018-06-15 00:24:27.124  INFO [xserver,,,] 10048 --- [           main] o.s.d.r.w.RepositoryRestHandlerMapping   : Mapped "{[/api/v2/{repository}],methods=[POST],produces=[application/hal+json || application/json]}" onto public org.springframework.http.ResponseEntity<org.springframework.hateoas.ResourceSupport> org.springframework.data.rest.webmvc.RepositoryEntityController.postCollectionResource(org.springframework.data.rest.webmvc.RootResourceInformation,org.springframework.data.rest.webmvc.PersistentEntityResource,org.springframework.data.rest.webmvc.PersistentEntityResourceAssembler,java.lang.String) throws org.springframework.web.HttpRequestMethodNotSupportedException

2018-06-15 00:24:27.124  INFO [xserver,,,] 10048 --- [           main] o.s.d.r.w.RepositoryRestHandlerMapping   : Mapped "{[/api/v2/{repository}/{id}],methods=[OPTIONS],produces=[application/hal+json || application/json]}" onto public org.springframework.http.ResponseEntity<?> org.springframework.data.rest.webmvc.RepositoryEntityController.optionsForItemResource(org.springframework.data.rest.webmvc.RootResourceInformation)

2018-06-15 00:24:27.124  INFO [xserver,,,] 10048 --- [           main] o.s.d.r.w.RepositoryRestHandlerMapping   : Mapped "{[/api/v2/{repository}/{id}],methods=[PUT],produces=[application/hal+json || application/json]}" onto public org.springframework.http.ResponseEntity<? extends org.springframework.hateoas.ResourceSupport> org.springframework.data.rest.webmvc.RepositoryEntityController.putItemResource(org.springframework.data.rest.webmvc.RootResourceInformation,org.springframework.data.rest.webmvc.PersistentEntityResource,java.io.Serializable,org.springframework.data.rest.webmvc.PersistentEntityResourceAssembler,org.springframework.data.rest.webmvc.support.ETag,java.lang.String) throws org.springframework.web.HttpRequestMethodNotSupportedException

2018-06-15 00:24:27.125  INFO [xserver,,,] 10048 --- [           main] o.s.d.r.w.RepositoryRestHandlerMapping   : Mapped "{[/api/v2/{repository}/{id}],methods=[GET],produces=[application/hal+json || application/json]}" onto public org.springframework.http.ResponseEntity<org.springframework.hateoas.Resource<?>> org.springframework.data.rest.webmvc.RepositoryEntityController.getItemResource(org.springframework.data.rest.webmvc.RootResourceInformation,java.io.Serializable,org.springframework.data.rest.webmvc.PersistentEntityResourceAssembler,org.springframework.http.HttpHeaders) throws org.springframework.web.HttpRequestMethodNotSupportedException

2018-06-15 00:24:27.131  INFO [xserver,,,] 10048 --- [           main] o.s.d.r.w.BasePathAwareHandlerMapping    : Mapped "{[/api/v2/profile/{repository}],methods=[GET],produces=[application/alps+json || */*]}" onto org.springframework.http.HttpEntity<org.springframework.data.rest.webmvc.RootResourceInformation> org.springframework.data.rest.webmvc.alps.AlpsController.descriptor(org.springframework.data.rest.webmvc.RootResourceInformation)

2018-06-15 00:24:27.131  INFO [xserver,,,] 10048 --- [           main] o.s.d.r.w.BasePathAwareHandlerMapping    : Mapped "{[/api/v2/profile/{repository}],methods=[OPTIONS],produces=[application/alps+json]}" onto org.springframework.http.HttpEntity<?> org.springframework.data.rest.webmvc.alps.AlpsController.alpsOptions()

2018-06-15 00:24:27.131  INFO [xserver,,,] 10048 --- [           main] o.s.d.r.w.BasePathAwareHandlerMapping    : Mapped "{[/api/v2/profile],methods=[GET]}" onto org.springframework.http.HttpEntity<org.springframework.hateoas.ResourceSupport> org.springframework.data.rest.webmvc.ProfileController.listAllFormsOfMetadata()

2018-06-15 00:24:27.131  INFO [xserver,,,] 10048 --- [           main] o.s.d.r.w.BasePathAwareHandlerMapping    : Mapped "{[/api/v2/profile],methods=[OPTIONS]}" onto public org.springframework.http.HttpEntity<?> org.springframework.data.rest.webmvc.ProfileController.profileOptions()

2018-06-15 00:24:27.132  INFO [xserver,,,] 10048 --- [           main] o.s.d.r.w.BasePathAwareHandlerMapping    : Mapped "{[/api/v2/profile/{repository}],methods=[GET],produces=[application/schema+json]}" onto public org.springframework.http.HttpEntity<org.springframework.data.rest.webmvc.json.JsonSchema> org.springframework.data.rest.webmvc.RepositorySchemaController.schema(org.springframework.data.rest.webmvc.RootResourceInformation)
