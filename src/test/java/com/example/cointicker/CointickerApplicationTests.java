package com.example.cointicker;

import com.example.cointicker.usdtcoin.BinanceCoinList;
import com.example.cointicker.usdtcoin.CoinList;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
@SpringBootTest
class CointickerApplicationTests {

    @Test
    void contextLoads() {
        CoinList coinList = new CoinList();
        System.out.println(coinList);
        System.out.println(coinList.size());


    }
    @Test
    void getCoinList(){
        //获取币安现货最新的 所有USDT交易对
        BinanceCoinList binanceCoinList = new BinanceCoinList();
        binanceCoinList.getAllCoinMap();
    }

}
