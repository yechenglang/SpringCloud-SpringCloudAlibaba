SpringCloud Gateway 特点:
用到了基于Netty的Spring WebFlux异步非阻塞通讯
基于Spring Framework5,Project Reactor和Spring Boot 2x进行构建的。
动态路由
可以指定路由 Predicate(断言)和Filter(过滤)
集成Hystrix 的断路器功能;
集成SpringCloud服务发现功能;
易于编写的Predicate和Filter;
请求限流功能;
支持路径重写。
集成spring稳定性更高。

三大核心概念：
Route 路由
Predicate 断言
Filter 过滤