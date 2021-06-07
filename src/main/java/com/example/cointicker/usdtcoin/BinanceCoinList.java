package com.example.cointicker.usdtcoin;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;

import java.util.*;
@Slf4j
public class BinanceCoinList {
    public void getAllCoinMap(){
        MyRestTemplate myRestTemplate = new MyRestTemplate();
        long time = new Date().getTime();
        long time2 = time-1000*60*60*24*2;

        ArrayList<String> symbolList = new ArrayList<>();
        for (int page=1;page<155;page++){//取每一页的symbol
            try {
                String url = "https://www.binance.com/bapi/earn/v1/public/indicator/abnormal-trading-notice/pageList?";
                url=url+"pageIndex="+page+"&pageSize=100&startTime="+time2+"&endTime="+time;
                ResponseEntity<HashMap> forEntity = myRestTemplate.getForEntity(url, HashMap.class);
                HashMap body = forEntity.getBody();
                List data = (List)body.get("data");

                for (int i=0;i<100;i++){//取每一条的 symbol
                    try {
                        HashMap coinMap = (HashMap)data.get(i);//一共100条数据 可遍历
                        String symbol = (String)coinMap.get("symbol");//拿到交易对
                        String symbolSub = symbol.substring(symbol.length() - 4);//取字符串后4位
                        String symbolSubRemoveUp = symbol.substring(symbol.length() - 6);//取字符串后6位
                        if (symbolSub.equals("USDT")&&symbol.length()<=9&&!symbolList.contains(symbol)&&!symbolSubRemoveUp.equals("UPUSDT")
                                &&!symbol.equals("TUSDUSDT")&&!symbol.equals("BUSDUSDT")&&!symbol.equals("SUSDUSDT")&&!symbol.equals("USDCUSDT")){
                            symbolList.add(symbol);
                        }
                    }catch (Exception e){
                        System.out.println(e);
                    }

                }

            }catch (Exception e){
                System.out.println(e);
            }
        }
        String symbolStr="|";
        for (String value:symbolList){
            symbolStr=symbolStr+value+"|";
        }
        log.debug("交易对的数量{}",symbolList.size());
        log.debug(symbolStr);
        log.debug("打印交易对集合对象{}",symbolList);
    }
}
