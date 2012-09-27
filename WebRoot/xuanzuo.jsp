<%@ page language="java"  pageEncoding="gb2312"%>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
  
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>   
 <head>    
<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
<!-- InstanceBeginEditable name="doctitle" -->
<title>无标题文档</title> 
<!-- InstanceEndEditable -->
<!-- InstanceBeginEditable name="head" -->
<script language="javascript">
	function  zw(yskz){
		var zwid = document.getElementById("zwid");
		var pradio=document.getElementById("pradio");
		var c=document.getElementById("c");	
		var ddda=document.getElementById("ddda");
		var userinfo=document.getElementById("userinfo");
		var b=document.getElementById("id").value;
		var ztsize =document.getElementById("ztsize").value;
		var zongsize =document.getElementById("zongsize").value;
		var length;
		var size1 =zongsize-ztsize;
		length=b.split(",").length;
		var a=yskz.innerText;		
		var zwid = document.getElementById("zwid").value;
		var zwid1 = yskz.id;
		if(yskz.className=="0"){
			b=a+","+b;	
			zwid=zwid1+","+zwid;
			document.getElementById("zwid").value=zwid;
			document.getElementById("id").value=b;		
			yskz.className="2";
			
			if(pradio.value==2){
			
				if(size1<6){
				
					if(length>=size1){
						userinfo.innerText="操作正确";
						c.innerHTML="<a href='#' onclick=‘tijiao()’ class='STYLE1'>确认订票</a>";
						ddda.innerHTML="<a href='#' onclick='tijiao()' class='STYLE2'>》》</a>确认订票";							
					}
				}else if(size1>=6){
					if(length>=6){
						var userinfo = document.getElementById("userinfo");
						userinfo.innerText="操作正确";
							c.innerHTML="<a href='#' onclick=‘tijiao()’ class='STYLE1'>确认订票</a>";
							ddda.innerHTML="<a href='#' onclick='tijiao()' class='STYLE2'>》》</a>确认订票";
					}
				}
			}else {
				if(b.length>0){
					c.innerHTML="<a href='#' onclick=‘tijiao()’ class='STYLE1'>确认订票</a>";
					ddda.innerHTML="<a href='#' onclick='tijiao()' class='STYLE2'>》》</a>确认订票";
				}
			}
		}else if(yskz.className=="2"){
		
			b=b.replace(a+",","");
			zwid = zwid.replace(zwid1+",","");
			document.getElementById("zwid").value=zwid;
			document.getElementById("id").value=b;
			yskz.className="0";
			
			if(pradio.value==2){
				yanzheng()
			}			
		}else if(yskz.className=="1"){
			
			yskz.innerText="已经订出";
		}	
	}
	function dianji(mode){
		var b=document.getElementById("id").value;
		var c=document.getElementById("c");	
		var ddda=document.getElementById("ddda");
		var pradio=document.getElementById("pradio");
		if(mode=="1"){
			pradio.value="1";
			if(b.length>0){
				c.innerHTML="<a href='#' onclick=‘tijiao()’ class='STYLE1'>确认订票</a>";
				ddda.innerHTML="<a href='#' onclick='tijiao()' class='STYLE2'>》》</a>确认订票";
			}
		}else if(mode=="3"){
			pradio.value="3";
			if(b.length>0){
				c.innerHTML="<a href='#' onclick=‘tijiao()’ class='STYLE1'>确认订票</a>";
				ddda.innerHTML="<a href='#' onclick='tijiao()' class='STYLE2'>》》</a>确认订票";
			}
		}
		
	}
	function yanzheng(){	
		
		var pradio=document.getElementById("pradio");
		var c=document.getElementById("c");	
		var ddda=document.getElementById("ddda");
		var userinfo=document.getElementById("userinfo");
		var b=document.getElementById("id").value;
		var ztsize =document.getElementById("ztsize").value;
		var zongsize =document.getElementById("zongsize").value;
		var length;
		var size1 =zongsize-ztsize;
		
		pradio.value="2";		
		length=b.split(",").length-1;
		
		if(size1<6){
			if(size1>length){
				userinfo.innerText="必须选完剩下的所有座位";	
				ddda.innerText="《《确认订票";
				c.innerText	="确认订票";				
			}else{
				userinfo.innerText="操作正确";
				
			}
		}else if(length<6){
			var userinfo = document.getElementById("userinfo");
			userinfo.innerText="至少要选中6个座位";
			ddda.innerText="《《确认订票";
			c.innerText	="确认订票";	
		}
	}
	
	function tijiao(){
		window.document.temForm.submit();
	}
	
</script>

<style type="text/css">
<!--
.STYLE2 {color: #CCFF00}
.STYLE4 {color: #FF0000}
.STYLE5 {color: #FFFF00}
.STYLE6 {color: #99FF00}
-->
.0{background-color: #FFFF00}
.1{background-color: #FF0000}
.2{background-color: #99FF00}
</style>
<!-- InstanceEndEditable -->
<style type="text/css">
<!--
#Layer1 {
	position:absolute;
	width:804px;
	height:520px;
	z-index:1;
	left: 227px;
	top: 141px;
}
.STYLE1 {color: #000000}
.STYLE9 {
	font-size: 36px;
	color: #00FF00;
}
.STYLE12 {
	font-size: 24;
	color: #FFFF00;
}
-->
</style>
</head>

<body>

<div align="center">
  <table width="789" border="0" align="center">
    <tr>
      <td width="744" height="81" bgcolor="#333333"><div >
        <div align="center">
          <p><img src="img/b081125.gif" width="600" height="76" /></p>
          </div>
      </div></td>
    </tr>
    <tr>
      <td height="38" background="img/index_14.gif" bgcolor="#00FF00"><div align="center" class="STYLE9"><span class="STYLE12"><strong>月下影院</strong>欢迎您</span></div></td>
    </tr>
  </table>  
  </div>


<div align="center">
  <table width="965" height="377" border="0" bgcolor="#333333">
    <tr>
      <td width="169" height="167">
	  <!-- InstanceBeginEditable name="caidan" -->
	  <table width="169" height="161" border="0" bgcolor="#333333">
          <tr>
            <td width="9" height="39"><form id="form1" name="form1" method="post" action="">
            </form></td>
            <td width="123" background="img/register-sm2.jpg"><div align="center"><a href="tem.do?qw=show" class="STYLE1">上映影片</a></div></td>
            <td width="23">&nbsp;</td>
          </tr>
          <tr>
            <td height="38">&nbsp;</td>
            <td background="img/register-sm2.jpg"><div align="center"><a  class="STYLE1">选择座位</a></div></td>
            <td>&nbsp;</td>
          </tr>
          <tr>
            <td height="36">&nbsp;</td>
            <td  background="img/register-sm2.jpg"><div align="center" id="c"><a>确认订票</a></div></td>
            <td>&nbsp;</td>
          </tr>
          <tr>
            <td height="38">&nbsp;</td>
            <td background="img/register-sm2.jpg"><div align="center"><a href="tem.do?qw=yulan" onclick="" class="STYLE1">已订影票</a></div></td>
            <td>&nbsp;</td>
          </tr>
      </table>
	  <!-- InstanceEndEditable --></td>
      <td width="786" rowspan="2" bgcolor="#666666"><!-- InstanceBeginEditable name="div32" -->
        <div>
	<html:form action="/tem?qw=qrShow">
	<html:hidden name="temForm" property="id"/>
	<html:hidden name="temForm" property="ztsize"/>
	<html:hidden name="temForm" property="zongsize"/>
	<html:hidden name="temForm" property="ypName"/>
	<html:hidden name="temForm" property="ytName"/>
	<html:hidden name="temForm" property="date"/>
	<html:hidden name="temForm" property="time"/>
	<html:hidden name="temForm" property="ytid"/>
	<html:hidden name="temForm" property="fyid"/>
	<html:hidden name="temForm" property="zwid"/>
          <table width="" height="" border="1">
            <tr>
              <td width="142">&nbsp;</td>
              <td width="147">
              
                <html:radio name="temForm" property="pradio" value="1" onclick=" dianji('1')"/>
              普通购票(65元) 
                         </td>
              <td width="151">
              
                 <html:radio name="temForm" property="pradio" value="2" onclick="yanzheng()" />
                团体购票(35元) 
              </td>
              <td width="147">
            
                 <html:radio name="temForm" property="pradio" value="3" onclick=" dianji('3')"/>
                学生购票(30元)<br> 
              </td>
              <td width="152">&nbsp;</td>
            </tr>
            </table>
            <table width="761" height="232" border="1">
            <tr>
	            <td>
	            </td>
            </tr>
            <logic:iterate id="ZWDomin" name="temForm" property="zw" type="com.dpxt.domin.ZWDomin" indexId="index">
            	<logic:equal value="0" name="ZWDomin" property="count">
            		<tr>
            	</logic:equal>          		
           			<td id="<bean:write name="ZWDomin" property="id"/>" align="center" class="<bean:write name="ZWDomin" property="zht"/>" onclick="zw(this)">
           				 <bean:write name="ZWDomin" property="hang"/>-
           				 <bean:write name="ZWDomin" property="lie"/>
           			</td>   	          		
           		<logic:equal value="1"  name="ZWDomin" property="num">
            		</tr>  
            	</logic:equal>    
          </logic:iterate>
          </table>
          <div align="center">
          <table width="" height="" border="0">
            <tr>
              <td> <div id="userinfo" style="color:#99FF00">请选择一个座位</div></td>
              
              <td>选择影片<a href="tem.do?qw=show" class="STYLE2">《《</a></td>
              <td>&nbsp;</td>
              <td><div id="ddda"><a>》》</a>确认订票</div></td>
              <td>&nbsp;</td>
            </tr>
          </table>
          </html:form>
		</div>
          <p>&nbsp;</p>
          <div>
            <div align="center">
              <p><span class="STYLE5">提示：</span><span class="STYLE6">01-03是第一排座号为3的座位，<span class="STYLE4">红色座号</span>是已经被选中的，<span class="STYLE5">黄色</span>是还没被选的，</span></p>
              <p class="STYLE6">被您选中的会变为绿色取消选中只需再点以下要取消的座号，影票种类有三种：普通票、团体票、学生票，票价各不同。如果选择团体票则必须同时选定6个以上的座位，如果剩下的票不足以6张必须订下剩下的所有票才可以选择团体票。</p>
            </div>
          </div>
          <p class="STYLE6">&nbsp;</p>
        </div>
        <!-- InstanceEndEditable -->
          <p>&nbsp;</p>
      <p>&nbsp;</p></td>
    </tr>
    <tr>
      <td height="204" bgcolor="#333333">&nbsp;</td>
    </tr>
  </table>
  <p>&nbsp;</p>
</div>
<div>
  <table cellspacing="0" cellpadding="0" width="100%" border="0">
    <tbody>
      <tr>
        <td valign="bottom"><img src="img/bottom_01.gif" width="37" height="140" /></td>
        <td valign="baseline" width="100%"><table cellspacing="0" cellpadding="0" width="100%" border="0">
            <tbody>
              <tr>
                <td colspan="3"></td>
              </tr>
              <tr bgcolor="#083c63">
                <td align="middle" colspan="4" height="24"><a href="http://www.tickets.com.cn/SHANGHAI/Service/aboutus.asp">About us</a>　|　<a href="http://www.tickets.com.cn/SHANGHAI/Service/aboutus.asp#chinese">关于我们</a>　|　<a href="http://www.tickets.com.cn/SHANGHAI/Service/termsandconditions.asp">服务条款</a>　|　<a href="http://www.tickets.com.cn/SHANGHAI/Service/jobs.asp">招聘信息</a>　|　<a href="http://www.tickets.com.cn/SHANGHAI/Service/sitemap.asp">网站地图</a>　|　<a href="http://www.tickets.com.cn/SHANGHAI/Service/cooperation.asp">合作伙伴</a>　|　<a href="http://www.tickets.com.cn/SHANGHAI/Service/link.asp">友情链接</a></td>
              </tr>
              <tr>
                <td width="200"></td>
                <td align="middle">免费订票热线：800-820-1585 传真：021-64270964 <a href="mailto:tickets@zsi.com.cn">mailto:tickets@zsi.com.cn</a><br />
                  建议使用：1024×768屏幕分辨率和IE5.0以上版本浏览器浏览本站
                  <table cellspacing="0" cellpadding="0" width="136" align="right" border="0">
                      <tbody>
                        <tr>
                          <td><img src="img/zhizhao.gif" width="120" height="30" /></td>
                        </tr>
                      </tbody>
                  </table>
                  <br />
                  上海掌尚信息服务咨询有限公司 版权所有<br />
                  Copyright?   2000-2008 Tickets.com.cn, All Rights Reserved. </td>
                <td align="middle" width="91" height="70"><p><img src="img/shca_tickets.gif" width="38" height="43" /><br />
                  沪ICP证<br />
                  沪B2-20050105 </p></td>
                <td width="130" height="70"></td>
              </tr>
              <tr bgcolor="#6d92ad">
                <td colspan="4" height="25"></td>
              </tr>
            </tbody>
        </table></td>
        <td valign="bottom"><img src="img/bottom_02.gif" width="40" height="140" /></td>
      </tr>
    </tbody>
  </table>
</div>
<p>&nbsp;</p>
</body>
</html>
