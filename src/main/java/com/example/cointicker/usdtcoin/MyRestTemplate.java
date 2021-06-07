package com.example.cointicker.usdtcoin;

import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

import java.net.InetSocketAddress;
import java.net.Proxy;

public class MyRestTemplate extends RestTemplate{
    MyRestTemplate(){
        //以下三句为设置翻墙  如果不使用代理把下面三句注掉
        SimpleClientHttpRequestFactory reqfac = new SimpleClientHttpRequestFactory();
        reqfac.setProxy(new Proxy(Proxy.Type.HTTP,new InetSocketAddress("127.0.0.1",1080)));
        super.setRequestFactory(reqfac);
    }
}
