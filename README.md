# pgnc-admin
# 飞鸽校园后台管理服务
​		采用Spring cloud 微服务架构，以nacos为注册和配置中心，Spring cloud Oauth2 为认证与授权中心，
zuul 为网关模块，融入swaggerAPI文档和druid数据源监控，monitor组件负责各个微服务的整体监控。

+ http://localhost:8008/admin    微服务监控中心
+ http://localhost:8008/doc    API文档
+ http://localhost:8008/module-name/druid    druid监控中心
+ http://localhost:8008/    微服务网关
+ http://localhost:8008/user    用户管理模块
+ http://localhost:8008/school    学校管理模块
+ http://localhost:8008/product    商品管理模块
+ http://localhost:8008/carousel    轮播图管理模块
+ http://localhost:8008/category    菜单管理模块
+ http://localhost:8008/message    消息管理模块
+ http://localhost:8008/comment    评论管理模块
+ http://localhost:8008/auth    认证与授权中心