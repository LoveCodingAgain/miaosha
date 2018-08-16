#### 高并发秒杀系统优化
##### 一. 项目开发背景
1. 基于SpringBoot框架在传统的秒杀项目上面进行支持高并发的优化.做压测进行先后对比.在单台和集群部署下的系统的QPS值的对比. 
2. 除了基本的手机+密码登录,查看商品,商品详情页面,立即秒杀,秒杀详情订单信息.
3. 对Redis/RabbitMQ有更加深入的学习.
 ---
##### 二. 项目使用技术
1. 前台技术<br/>
  Html,JavaScript,CSS,Jquery,Bootstrap,layui.<br/>
  ---
2. 后台技术<br/>
  SpringBoot 1.5.8,MyBatis,Thymeleaf模板引擎3.0,Druid数据库连接池.
  ---
3. 数据库<br/>
   MySQL5.7
  ---
4. 缓存技术<br/>
   Redis的高可用部署方式.Redis的Session管理.未完
  ---
5. 消息队列<br/>
   RabbitMQ的基于交换机的Direct模式.
  ---
6. 项目部署<br/>
   Docker部署/基于打成jar的部署.Tomcat集群部署,做负载均衡.
  ---
7. 压测工具<br/>
   JMeter,1000个线程循环10次.10000次请求,聚合报告的方式.查看系统QPS.
##### 三. 项目技术整理
1. 项目的       
      
       
     
  
      
    
     