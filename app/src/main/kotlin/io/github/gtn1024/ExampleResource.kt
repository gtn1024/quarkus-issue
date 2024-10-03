package io.github.gtn1024

import io.quarkus.runtime.annotations.RegisterForReflection
import jakarta.ws.rs.GET
import jakarta.ws.rs.POST
import jakarta.ws.rs.Path
import jakarta.ws.rs.Produces
import jakarta.ws.rs.core.MediaType

// POST http://localhost:8080/foo
// Content-Type: application/json
//
// {
//   "bar": "hi",
//   "baz": 1
// }
@Path("/")
class ExampleResource {

    @POST
    @Path("/foo")
    fun foo(request: Foo): Map<String, Foo> {
        return mapOf(
            "msg" to request
        )
    }

}

@RegisterForReflection(targets = [Foo::class])
class ReflectionConfiguration
