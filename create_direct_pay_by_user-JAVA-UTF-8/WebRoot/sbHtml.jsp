<%--
  Created by IntelliJ IDEA.
  User: Eisen7
  Date: 17/2/24 024
  Time: 下午 5:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form id="alipaysubmit" name="alipaysubmit" action="https://openapi.alipay.com/gateway.do?_input_charset=utf-8"
      method="get">
    <input type="hidden" name="sign"
           value="dAnsOnuo5pg03uNqXfu+6nRUOuB941gRvF1ojpvklQ5EWJFHTdugciDHfvbG1K6JYTNnvJGQPb+H5YqQ7ZEBG2MTF6sgsb8gM6jJIv8f2PbVChKmZ78jA4bM5/PhmrxlpB7N+a6hlj7irOTXA0J0yPnpOZV3b/pJ8O83IO0rM5A="/>
    <input
            type="hidden" name="body" value="即时到账测试"/>
    <input type="hidden" name="_input_charset" value="utf-8"/>
    <input
            type="hidden" name="subject" value="test商品123"/>
    <input type="hidden" name="total_fee" value="0.01"/>
    <input
            type="hidden" name="sign_type" value="RSA"/>
    <input type="hidden" name="service"
           value="create_direct_pay_by_user"/>
    <input type="hidden"
           name="notify_url"
           value="http://localhost:8080/notify_url.jsp"/>
    <input
            type="hidden" name="partner" value="2088102169427086"/>
    <input type="hidden" name="seller_id"
           value="2088102169427086"/>
    <input type="hidden"
           name="out_trade_no"
           value="test20170224170450"/>
    <input
            type="hidden" name="payment_type" value="1"/>
    <input type="hidden" name="return_url"
           value="http://localhost:8080/return_url.jsp"/>
    <input
            type="submit" value="确认" style="display:none;">
</form>
<script>document.forms['alipaysubmit'].submit();</script>

</body>
</html>
