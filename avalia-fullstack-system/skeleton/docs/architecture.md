The **${{ values.name }} system** is based on our standard architecture, where a single-page application interacts with a service over a REST api.

```kroki-plantuml
package "${{ values.name }}" {
  () "REST API" - [${{ values.name }}-backend]
  [${{ values.name }}-frontend] .> () "REST API" : use
}
```


## Backend

The **${{ values.name }}-backend component** is implemented in Java, on top of the [SpringBoot](https://spring.io/projects/spring-boot) framework. In most of our backend components, we use [Spring MVC](https://docs.spring.io/spring-framework/docs/current/reference/html/web.html) and [Spring Data](https://spring.io/projects/spring-data).

If you have never used SpringBoot, we recognize to start with these tutorials:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Accessing Data with JPA](https://spring.io/guides/gs/accessing-data-jpa/)

*Describe what is specific to your component...*

## Frontend

The **${{ values.name }}-frontend component** is implemented in Javascript, with the [Vue 3](https://vuejs.org/) framework. In most of our frontend components, we use [Vue Router](https://router.vuejs.org/), [Vuex](https://vuex.vuejs.org/) and [PrimeVue](https://www.primefaces.org/primevue/).

*Describe what is specific to your component...*
