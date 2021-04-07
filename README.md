# 源码阅读环境git地址
https://github.com/983470409/My-JDK-Source.git

## 本人关于源码的阅读专栏
https://0522-isniceday.top/categories/jdk%E6%BA%90%E7%A0%81

## 源码推荐阅读顺序：
lang>util>io>nio>math>time>net

# 可能会出现的问题
## 1.debug时发现无法进入代码内部

取消勾选下选项

![image.png](https://zhangyuxiangplus.oss-cn-hangzhou.aliyuncs.com/boke//image_1617714402312.png)


## 2.启动时发现报错
Error:java: OutOfMemoryError: insufficient memory

### 错误原因
内存不足

#### 解决办法
![image.png](https://zhangyuxiangplus.oss-cn-hangzhou.aliyuncs.com/boke//image_1617714594462.png)


## debug的过程中发现debug的源码不是自己工程的源码

### 错误原因
项目设置的源码路径可能仍然为你本地jdk的源码路径

### 解决办法

#### 第一步
![image.png](https://zhangyuxiangplus.oss-cn-hangzhou.aliyuncs.com/boke//image_1617714707330.png)

#### 第二步
添加项目的source目录为源码目录，并删除之前jdk的源码目录
![image.png](https://zhangyuxiangplus.oss-cn-hangzhou.aliyuncs.com/boke//image_1617714779525.png)
