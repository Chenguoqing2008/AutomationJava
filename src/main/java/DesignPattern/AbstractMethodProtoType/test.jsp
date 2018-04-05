<HTML>
<!--
客户端调用类
	@author jianghc  
-->

<HEAD>
 <meta charset=GB2312" />
	<TITLE> 
	抽象工厂模式
	</TITLE>
</HEAD>

<BODY BGCOLOR="white">

<%@ page pageEncoding="GB2312" language="java" import="model.abstractfactory.*" %>

 
<br />
<br />
<h4>
<% 
IHumanFactory manStudyFactory = new ManFactory();
IHumanFactory girlStudyFactory = new GirlFactory();
IHumanFactory manMakeMoneyFactory = new ManFactory();
IHumanFactory girlMakeMoneyFactory = new GirlFactory();
%>
</h4>
<% out.println("manStudyFactory: " + manStudyFactory.getStudy().doStudy()); %><br />
<% out.println("girlStudyFactory: " +girlStudyFactory.getStudy().doStudy());%><br />
<% out.println("manMakeMoneyFactory: " +manMakeMoneyFactory.getMakeMoney().doMakeMoney());%><br />
<% out.println("girlMakeMoneyFactory:"+girlMakeMoneyFactory.getMakeMoney().doMakeMoney());%>

<br />
<br />
<br />

</BODY>
</HTML>




