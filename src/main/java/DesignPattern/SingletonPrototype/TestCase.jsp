<HTML>
<!--
	@author jianghc  
-->
<HEAD>
 <meta charset=GB2312" />
	<TITLE> 
	单例模式
	</TITLE>
</HEAD>

<BODY BGCOLOR="white">

<%@ page pageEncoding="GB2312" language="java" import="model.singleton.*" %>
 
<br />
<br />
<h4>
<% 
//运用饿汉式单例模式，来调用类的实例    
  out.println("1.饿汉式单例模式调用类的实例:");
  out.println("*****************************************");
  for(int x=0;x<5;x++)
  { 
    int y=x+1;
   out.println("第 "+y+" 次"+"得到的对象值为"+JackSingleton.getInstance());
  }
 %><br>
 <%
//运用懒汉式单例模式，来调用类的实例    
  out.println("2.懒汉单例模式调用类的实例:");
  out.println("*****************************************");
  for(int x=0;x<5;x++)
  { 
    int y=x+1;
   out.println("第 "+y+" 次"+"得到的对象值为"+JackSingletonOne.getInstance());
  } 
  %><br>
  <%
//不使用单例模式，来调用类的实例   
  out.println("3.非单例模式调用类的实例：");
  out.println("*****************************************");  
  for(int x=0;x<5;x++)
  {
       int z=x+1;
       NoName noName=new NoName();
       out.println("第 "+z+" 次"+"得到的对象值为"+noName);
  }
 //}
 %><br>
</h4>

<br />
<br />
<br />

<h4>

</BODY>
</HTML>




