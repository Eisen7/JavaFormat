package com.alipay.config;

/* *
 *类名：AlipayConfig
 *功能：基础配置类
 *详细：设置帐户有关信息及返回路径
 *版本：3.4
 *修改日期：2016-03-08
 *说明：
 *以下代码只是为了方便商户测试而提供的样例代码，商户可以根据自己网站的需要，按照技术文档编写,并非一定要使用该代码。
 *该代码仅供学习和研究支付宝接口使用，只是提供一个参考。
 */

public class AlipayConfig {
	
//↓↓↓↓↓↓↓↓↓↓请在这里配置您的基本信息↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

	// 合作身份者ID，签约账号，以2088开头由16位纯数字组成的字符串，查看地址：https://b.alipay.com/order/pidAndKey.htm
	public static String partner = "2088102169427086";
	
	// 收款支付宝账号，以2088开头由16位纯数字组成的字符串，一般情况下收款账号就是签约账号
	public static String seller_id = partner;

	//商户的私钥,需要PKCS8格式，RSA公私钥生成：https://doc.open.alipay.com/doc2/detail.htm?spm=a219a.7629140.0.0.nBDxfy&treeId=58&articleId=103242&docType=1
	public static String private_key = "MIICdwIBADANBgkqhkiG9w0BAQEFAASCAmEwggJdAgEAAoGBAIPVxkAICd4x3iui" +
			"RZg+oyvCZo0KsTKL9o8ph4pYGyO9Rsv6lEgvfXSEMrXL68xZmU59iaBIAKFADmUU" +
			"X/jzjFDky6HSyL4pGSOjGZZdXc/kMUPnwK/Eng85gf+evhGMIlWTXI+ojl/f+US+" +
			"/7hMn3A5TVihyS9FG8n/v/jC0AsXAgMBAAECgYBc54FWDlQl6S6PwUMaDsoeRFjQ" +
			"fABzhn6yVKnXrE8z2GbTyDpGxHC8c4zo4FPDJkELNxyNfzAyclmykbEwVzFBpGLI" +
			"7l0vejcKLbRYPG6G/BsCMqBagDB9CD213sMt0HpeXgLepxNgD5c9TIHCJSd5H3yR" +
			"7GSh6YlxeAv6Fv0QAQJBAO+G03sWeaPFhwkQJNu+XJmYs8qwqAd8bGswUZqEUnHU" +
			"ln4QuOdDVJtaO+iTlH0FKzqPCJk77M+dsxPrOVmkDwECQQCM5uZIOwmig29YGuHT" +
			"iKNvTVHpV8ua1i1gxfYNIgqOfCMT3tCJOwpdXofdCPLzEbLMKMaPf+vdVBQp4goG" +
			"pLIXAkAib5HL6mlGgElvpiCGbxHFC00d4NPnb53usx2oR0nLD7MrIKBUrztksk5W" +
			"m5EHgEy8uH+V+CWNm7B5NqIiHxIBAkEAgW+rpDb3xt7O7jTjtxsSaDCzSpRoabjO" +
			"vtOcELxwziujXaGWGDqwbs1kKd0KsdhUU9Axd6mf1xZh34fShf/NyQJBAMihYbVc" +
			"wjyo6ZeF9JjZPZog/Cu/1PnwnLYuSSs0azKJ+x9lpTZcjYpiGZrsv3lw2AHrLX4p" +
			"9VV1ndUTCqDfNqM=";
	
	// 支付宝的公钥,查看地址：https://b.alipay.com/order/pidAndKey.htm
	public static String alipay_public_key  = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAvTlIiNQcUEZy2da80q1mxJ7xRHPDYniRQTldaXcQkV3gg70NRlyp3sd5uUGib3e7Q4FSJpj5mychl75viZAsLsmpCEq7HvnA5xxlfohUaf3cBF7gDRr4xThcDUNMLg5fP4F+/SqYXXQ+yYIXxAH+Pn26vDK7uWXkfYZh8IhS+xIiuADWabSPNa0FOd9UGo4gpIPmrYz8P5m9OknuF6xrzXk8ul3n2jXeWvTo26aIyNssa9vgVz/giYp/aaVf3U4ZfI7Kpp37dzQaX7mq9PiblrQkhtrD3sjFgIzJKS5JTy2wWSf+XKeCH6CY3uVE+WO8Dh6RPTbhvrrHUP2pp2MtYQIDAQAB";

	// 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String notify_url = "http://localhost:8080/notify_url.jsp";

	// 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String return_url = "http://localhost:8080/return_url.jsp";

	// 签名方式
	public static String sign_type = "RSA";
	
	// 调试用，创建TXT日志文件夹路径，见AlipayCore.java类中的logResult(String sWord)打印方法。
	public static String log_path = "D:\\Project\\untitled\\create_direct_pay_by_user-JAVA-UTF-8\\WebRoot";
		
	// 字符编码格式 目前支持 gbk 或 utf-8
	public static String input_charset = "utf-8";
		
	// 支付类型 ，无需修改
	public static String payment_type = "1";
		
	// 调用的接口名，无需修改
	public static String service = "create_direct_pay_by_user";


//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑
	
//↓↓↓↓↓↓↓↓↓↓ 请在这里配置防钓鱼信息，如果没开通防钓鱼功能，为空即可 ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓
	
	// 防钓鱼时间戳  若要使用请调用类文件submit中的query_timestamp函数
	public static String anti_phishing_key = "";
	
	// 客户端的IP地址 非局域网的外网IP地址，如：221.0.0.1
	public static String exter_invoke_ip = "";
		
//↑↑↑↑↑↑↑↑↑↑请在这里配置防钓鱼信息，如果没开通防钓鱼功能，为空即可 ↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑
	
}

