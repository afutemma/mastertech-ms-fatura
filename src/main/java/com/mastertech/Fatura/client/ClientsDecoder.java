package com.mastertech.Fatura.client;

import feign.Response;
import feign.codec.ErrorDecoder;

public class ClientsDecoder implements ErrorDecoder {

    private ErrorDecoder errorDecoder = new ErrorDecoder.Default();

    @Override
    public Exception decode(String s, Response response){
        if(response.status() == 400){
            throw new RuntimeException();
        }else {
            return errorDecoder.decode(s, response);
        }
    }
}
