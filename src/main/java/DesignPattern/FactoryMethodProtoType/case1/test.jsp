<HTML>
<!--
	工厂方法模式实现时，客户端需要决定实例化那个工厂来实现运算类。因此，存在需要选择判断的问题。
     然而，工厂方法把简单工厂的内部逻辑判断移到了客户端代码来进行。  
     开发人员想要添加的功能，本来是修改工厂类，而现在是修改客户端。
	@author jianghc  
-->

<HEAD>
 <meta charset=GB2312" />
	<TITLE> 
	工厂方法模式
	</TITLE>
</HEAD>

<BODY BGCOLOR="white">

<%@ page pageEncoding="GB2312" language="java" import="model.factorymethod.*" %>
<jsp:useBean id="IF" scope="session" class="model.factorymethod.IndustryFactory"/>
<jsp:useBean id="BF" scope="session" class="model.factorymethod.BecilityFactory"/>
 
<br />
<br />
<h4>
<% 
	XiaoMing becility=BF.CreateXiaoMing();   
	out.println("Becility");   
%>
</h4>
<% out.println("SkillOne: " + becility.SkillOne()); %><br />
<% out.println("SkillTwo: " + becility.SkillTwo()); %><br />
<% out.println("Industry: " + becility.Industry()); %>
<br />
<br />
<br />

<h4>
<% 
	XiaoMing Industry=IF.CreateXiaoMing();   
	out.println("Industry");   
%>
</h4>
<% out.println("SkillOne: " + Industry.SkillOne()); %><br />
<% out.println("SkillTwo: " + Industry.SkillTwo()); %><br />
<% out.println("Industry: " + Industry.Industry()); %>
</BODY>
</HTML>




