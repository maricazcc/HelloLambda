package com.examp;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class HelloHandler implements RequestHandler<String, String>{

        @Override
        public String handleRequest(String input, Context context) {
            context.getLogger().log("Evento ricevuto: " + input);
            return "Risposta da AWS Lambda: Ciao " + input + "!";
        }
}
