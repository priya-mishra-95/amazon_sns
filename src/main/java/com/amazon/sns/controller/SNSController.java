package com.amazon.sns.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class SNSController {

    static ObjectMapper objectMapper = new ObjectMapper();

    @RequestMapping(path = "/notification", method = {RequestMethod.GET, RequestMethod.POST})
    public void index(@RequestBody(required = false) String snsRequest, HttpServletRequest httpServletRequest,
                      HttpServletResponse httpServletResponse) {
        System.out.println("SNS Request String : " + snsRequest);
        if (snsRequest.contains("Type")) {
            JSONObject jsonObject = new JSONObject(snsRequest);
            if (!jsonObject.optString("Type").isEmpty() && jsonObject.optString("Type").equals("SubscriptionConfirmation"))
                System.out.println("Subscription Confirmation URL: " + jsonObject.optString("SubscribeURL"));
        } else
            System.out.println("Message published is ::" + snsRequest);
    }
}
