jdk15.0.2   java版本11
币安所有现货交易对数据,精简后有213个  更新于2021年4月27日  作者:颜金宽


 ETHUSDT|TRXUSDT|DOGEUSDT|CTSIUSDT|BUSDUSDT|THETAUSDT|OCEANUSDT|LINKUSDT|BNBUSDT|SXPUSDT|LSKUSDT|RUNEUSDT|CAKEUSDT|BLZUSDT|CFXUSDT|COMPUSDT|BATUSDT|SCUSDT|FTMUSDT|AVAUSDT|AUDIOUSDT|ATOMUSDT|SOLUSDT|MTLUSDT|AAVEUSDT|BTTUSDT|XTZUSDT|RVNUSDT|DATAUSDT|NEOUSDT|BTGUSDT|SRMUSDT|MATICUSDT|ENJUSDT|VETUSDT|XRPUSDT|TOMOUSDT|NEARUSDT|ONGUSDT|TRBUSDT|AIONUSDT|EPSUSDT|FLMUSDT|BTCUSDT|CTKUSDT|KMDUSDT|WNXMUSDT|ALPHAUSDT|GBPUSDT|CHZUSDT|HOTUSDT|RLCUSDT|ZENUSDT|ICXUSDT|DNTUSDT|CVCUSDT|CELRUSDT|ASRUSDT|ADAUSDT|FILUSDT|IOSTUSDT|STRAXUSDT|DENTUSDT|MITHUSDT|YFIUSDT|ROSEUSDT|BTSUSDT|FIROUSDT|EURUSDT|BELUSDT|INJUSDT|XMRUSDT|LRCUSDT|WRXUSDT|DIAUSDT|ZRXUSDT|MIRUSDT|USDCUSDT|LITUSDT|EGLDUSDT|LTCUSDT|DOTUSDT|PSGUSDT|XLMUSDT|ZECUSDT|RSRUSDT|UMAUSDT|TLMUSDT|ONTUSDT|NKNUSDT|JUVUSDT|LUNAUSDT|DASHUSDT|ONEUSDT|HNTUSDT|SKLUSDT|XEMUSDT|WINUSDT|AKROUSDT|FISUSDT|KAVAUSDT|SUSHIUSDT|TKOUSDT|XVSUSDT|TWTUSDT|TFUELUSDT|RIFUSDT|OMUSDT|OGNUSDT|MBLUSDT|HIVEUSDT|DUSKUSDT|DOCKUSDT|BEAMUSDT|ARPAUSDT|ALICEUSDT|KEYUSDT|VITEUSDT|IOTAUSDT|MFTUSDT|COTIUSDT|UNIUSDT|COCOSUSDT|CELOUSDT|DEGOUSDT|WINGUSDT|WANUSDT|WAVESUSDT|PNTUSDT|PONDUSDT|ORNUSDT|LINAUSDT|IOTXUSDT|FETUSDT|ETCUSDT|BZRXUSDT|BTCSTUSDT|ANKRUSDT|RENUSDT|NBSUSDT|OMGUSDT|SNXUSDT|MANAUSDT|CHRUSDT|ARDRUSDT|BCHUSDT|EOSUSDT|DGBUSDT|1INCHUSDT|REEFUSDT|DODOUSDT|PERLUSDT|SUPERUSDT|WTCUSDT|MKRUSDT|AVAXUSDT|ALGOUSDT|SUNUSDT|UNFIUSDT|STXUSDT|IRISUSDT|AXSUSDT|DCRUSDT|SANDUSDT|GRTUSDT|KNCUSDT|HBARUSDT|JSTUSDT|BANDUSDT|FUNUSDT|STMXUSDT|CRVUSDT|NMRUSDT|CTXCUSDT|COSUSDT|BNTUSDT|ZILUSDT|GTOUSDT|FIOUSDT|STORJUSDT|OXTUSDT|ANTUSDT|MDTUSDT|DREPUSDT|UTKUSDT|QTUMUSDT|GXSUSDT|VTHOUSDT|RAMPUSDT|OGUSDT|FTTUSDT|STPTUSDT|YFIIUSDT|TCTUSDT|LTOUSDT|CKBUSDT|FORTHUSDT|AUTOUSDT|BALUSDT|TUSDUSDT|BARUSDT|REPUSDT|NANOUSDT|TROYUSDT|SFPUSDT|NULSUSDT|KSMUSDT|HARDUSDT|ATMUSDT|ACMUSDT|TRUUSDT|AUDUSDT|PAXUSDT

```
  <!--使用到的依赖-->
        <dependency>
            <groupId>org.projectlombok</groupId>
            <artifactId>lombok</artifactId>
            <version>1.18.12</version>
            <scope>provided</scope>
        </dependency>
```


```
//得到交易对List对象
CoinList coinList = new CoinList();
System.out.println(coinList);
```


```
//重新检索币安当前的交易对  会在输出栏打印交易对
BinanceCoinList binanceCoinList = new BinanceCoinList();
binanceCoinList.getAllCoinMap();
```

```
MyRestTemplate类里设置翻墙信息和端口号
```