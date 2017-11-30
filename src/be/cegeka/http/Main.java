package be.cegeka.http;

import jdk.incubator.http.HttpClient;
import jdk.incubator.http.HttpRequest;
import jdk.incubator.http.HttpResponse;

import java.net.URI;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public class Main {

    public static void main(String[] args) throws Exception{
        HttpClient client = HttpClient.newHttpClient();
        URI uri = new URI("");
//        Map<HttpRequest, CompletableFuture<HttpResponse<String>>> responses =
//                client.sendAsync(
//                        HttpRequest.newBuilder(uri)
//                                .POST(HttpRequest.BodyProcessor.fromString(TEST_MESSAGE))
//                                .build(),
//                        HttpResponse.MultiProcessor.asMap(request - > Optional.of(HttpResponse.BodyHandler.asString()))
//                ).join();
    }
}