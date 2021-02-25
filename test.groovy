@Grab(group='org.apache.httpcomponents.client5', module='httpclient5', version='5.0.3')

import org.apache.hc.client5.http.classic.methods.HttpGet
import org.apache.hc.client5.http.impl.classic.HttpClientBuilder


def httpClient = HttpClientBuilder.create().build()

httpClient.execute(new HttpGet("http://google.com"))
.withCloseable {response ->
    print(response.getCode())

}

