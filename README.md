# Apache-Log4j
Apache Log4j 远程代码执行

> 攻击者可直接构造恶意请求，触发远程代码执行漏洞。漏洞利用无需特殊配置，经阿里云安全团队验证，Apache Struts2、Apache Solr、Apache Druid、Apache Flink等均受影响

![image](https://user-images.githubusercontent.com/45926593/145425339-47c71230-87d2-4519-8919-9c3520850f83.png)


### 修复方案：

（1）修改jvm参数
-Dlog4j2.formatMsgNoLookups=true

（2）修改配置
在应用classpath下添加log4j2.component.properties配置文件，log4j2.formatMsgNoLookups=true


### Run:

```
mvn install
mvn exec:java -Dexec.mainClass="log4j"
```
