package com.kainos.example.services;

import com.kainos.example.api.RequestObject;
import com.kainos.example.api.ResponseObject;

import java.util.ArrayList;

public class ValueCheckerService implements IValueCheckerService {
    public ResponseObject checkValue(RequestObject requestObject) {
        ArrayList<String> messages = new ArrayList<String>();
        if (requestObject.getValue() < 100) {
            messages.add("Great - less than 100");
            return new ResponseObject(messages);
        } else {
            messages.add("Cool beans - 100 or more");
            return new ResponseObject(messages);
        }
    }
}
