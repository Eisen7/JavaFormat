Format
个人代码仅供学习

整型
    byte 一个字节
    short 两个字节
    int 四个字节
    long 八个字节

字符型
    char 两个字节

String中split(" ")分割字符
string.toCharArray();将字符串转换为字符数组
String.valueOf(String);将字char转换为String
string.charAt() 获取string中第几个位置的字符


重载：函数方法名相同参数不同

JVM把内存分为 栈 堆 方法区 本地方法区 寄存器

构造函数：
    与类名相同
    无返回值
    不能被单独调用

abstract方法不能写{}！
abstract不能与final static private同用

父类就是超类 去他妈的叫父类就行了mb

wait notify必须在获得锁的时候用 sleep不用

socket网络编程
 多线程实现发送接收监听端口

TCP三次握手
    client SYN=1 random seq=j 给server
    server SYN=ACK=1 ack=j+1 random seq=k
    client ack=?j+1 ACK?=1 ack=k+1 server ack=?k+1 ACK=?1

constarint student_user_id_fk foreignkey(user_id) references user(id);

select * from table1,table2 where table1.id=table2.t1_id

优化：
    开启查询缓存
    explain 看查了几行
    limit1
    避免select*
    性别国家用枚举
    固定长度的表查询更快
    垂直分割
    拆分大sql语句

数据库四大特性：原子性 一致性 隔离性 持久性
隔离级别：都未提交 都提交 可重复的 序列化

Hibernate是一个ORM关系型映射封装了JDBC的持久层框架

Spring事务管理transcationManager标签 requird supports

SpringMVC运行原理：
    客户端请求提交到DispatcherServlet
    DispatcherServlet查HanderMapping找到需要调用的Controller
    DispatcherServlet将请求给Controller 处理完后返回ModelAndView
    DispatcherServlet查询ViewResoler视图解析器返回指定视图

model.addAttribute("key","value")

String

String
