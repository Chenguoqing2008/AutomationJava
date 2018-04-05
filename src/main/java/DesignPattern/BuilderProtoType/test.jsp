<HTML>

<HEAD>
 <meta charset=GB2312" />
	<TITLE> 
	建造者模式
	</TITLE>
</HEAD>

<BODY BGCOLOR="white">

<%@ page pageEncoding="GB2312" language="java" import="model.builder.*" %>
 
<br />
<br />
<h4>
<% 
//		创建一个建造者对象
		SiemensWasherBuilder builder = new SiemensWasherBuilder();
//		创建一个导演者，并为它配置一个建造者
		SiemensDirector directorOne = new SiemensDirector(builder);	
//		导演者将通知建造者去创建产品
//		在这个过程中，建造者将会根据导演者的请求，去创建组织并创建产品对象
		directorOne.contruct();		
//		从具体建造者中检索产品（返回的是冰箱的轮子）。
		SiemensWasher siemensWasher = builder.retrieveWasher();			
		%>
</h4>
<% out.println(siemensWasher);	 %><br />
</BODY>
</HTML>




