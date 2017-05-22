package com.kainos.example.services;

import com.kainos.example.api.RequestObject;
import com.kainos.example.api.ResponseObject;

public interface IValueCheckerService {
    ResponseObject checkValue(RequestObject requestObject);
}
