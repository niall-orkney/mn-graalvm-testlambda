package com.test;

import io.micronaut.function.client.FunctionClient;

@FunctionClient
public interface LambdaClient {
    String test(String test);
}
