### 关于条件注解

#### 是Spring4提供的注解，它的作用是按照一定的条件进行判断，满足条件给容器注册Bean

****

- @ConditionalOnBean : 仅仅在当前上下文中存在某个对象时，才会实例化一个Bean
- @ConditionalOnClass: 某个class位于类路径上，才会实例化一个Bean
- @ConditionalOnExpression: 当表达式为true时候，才会实力话一个Bean。基于SpEL表达式的条件判断。
- @ConditionalOnMissingBean：仅仅在当前上下中不存在某个对象时，才会实例化一个Bean。
- @ConditionalOnMissingClass: 某个class类路径上不存在的时候，才会实力话一个Bean
- @ConditionalOnNotWebApplication:不是web应用，才会实例化一个Bean
- @ConditionalOnWebApplication：当项目是web应用是，才会实例化一个Bean
- @ConditionalOnProperty： 当指定的属性有指定的值时进行实例化
- @ConditionalOnJava： 当JVM版本为指定版本范围时触发实例化
- @ConditionalOnResource： 当类路径下游指定的资源时触发实例化
- @ConditionalOnJndi： 在JNDI存在的条件下触发实例化
- @ConditionalOnSingleCandidate：当指定Bean在容器中只有一个，或者有多个但是制定了首选的Bean时触发实例化。

#### @ComponentScan 注解

**** 

主要是从定义的扫描路径中，找出标识了需要装配的类自动装配到spring的bean容器中

常用的属性如下：

- basePackage, value :指定扫描路径，如果为空则以@ComponentScan注解的类所在包为基本的扫描路径
- basePackageClass ：指定具体扫描类
- includeFilters：指定满足条件的类
- excludeFilters： 指定排除Filter条件的类

#### 加载顺序

ConfigFileApplicationListener
```
* <ul>
* <li>file:./config/</li>
* <li>file:./</li>
* <li>classpath:config/</li>
* <li>classpath:</li>
* </ul
```
![img.png](img.png)

spring启动过程中，会将类解析成spring内部的BeanDefinition结构，存到容器中（注入到
ConCurrentHashMap）

#### SpringBoot starter机制

SpringBoot中的starter是一种非常重要的机制，能够抛弃以前繁杂的配置，将其统一继承进starter，应用者只要在
maven中引入starter依赖，SpringBoot就会自动扫描到要加载的信息并启动相应的的默认配置。starter让我们拜托了各种依赖库
的处理，需要配置各种信息的困扰。SpringBoot会自动通过classpath路径下的类发现需要的bean
并注册到IoC容器中。SpringBoot提供了针对日常企业应用研发各种场景的spring-boot-starter依赖模块。所有这些依赖模块
都遵循着约定成俗的默认配置，并允许我们调整这些配置，即遵循"约定大于配置"的理念。

#### 自定义starter的命名规则

官方定义的：spring-boot-starter-xxx 

自定义的：xxx-spring-boot-starter


