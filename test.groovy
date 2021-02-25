import groovy.json.JsonSlurper
@Grab(group='org.apache.httpcomponents.client5', module='httpclient5', version='5.0.3')

import org.apache.hc.client5.http.classic.methods.HttpGet
import org.apache.hc.client5.http.impl.classic.HttpClientBuilder


def httpClient = HttpClientBuilder.create().build()

def jsonSlurper = new JsonSlurper()
def data = jsonSlurper.parse(new File("demo.json"))

println(data.name)

println("Invoking http call")

httpClient.execute(new HttpGet("http://google.com"))
.withCloseable {response ->
    println(response.getCode())

}