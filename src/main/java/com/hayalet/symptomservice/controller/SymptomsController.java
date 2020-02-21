package com.hayalet.symptomservice.controller;


import com.google.gson.Gson;
import com.hayalet.symptomservice.domain.Symptom;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.ObjectMapper;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import sun.net.www.http.HttpClient;

import java.io.*;
import java.lang.reflect.Type;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class SymptomsController {

    @GetMapping()
    public String SymptomsController() throws UnirestException {
        HttpResponse<String> response = Unirest.get("https://priaid-symptom-checker-v1.p.rapidapi.com/symptoms?format=json&language=tr-tr")
                .header("x-rapidapi-host", "priaid-symptom-checker-v1.p.rapidapi.com")
                .header("x-rapidapi-key", "f66958012emsh10b8e1c5fa03dabp1250e8jsnd5250a9f300d")
                .asString();

        ;
        //ObjectMapper mapper = new ObjectMapper();
        String jsonString = "{\"name\":\"Mahesh\", \"age\":21}";

        return null;
    }





}
