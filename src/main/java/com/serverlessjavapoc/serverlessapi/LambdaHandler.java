package com.serverlessjavapoc.serverlessapi;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

public class LambdaHandler implements RequestHandler<Map<String, Object>, ApiGatewayResponse> {

    public static final Logger logger = LoggerFactory.getLogger(LambdaHandler.class);

    @Override
    public ApiGatewayResponse handleRequest(Map<String, Object> stringObjectMap, Context context) {
        logger.info("Handler called");
        Map<String, String> headers = new HashMap<>();
        headers.put("X-Powered-By", "AWS Lambda & Serverless");
        headers.put("Content-Type", "application/json");
        return new ApiGatewayResponse(200, "Success", headers, true);
    }
}
