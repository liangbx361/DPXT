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
<script type="text/javascript">
function tijiao(){
		window.document.temForm.submit();
	}
function yanzheng(){
	var hyka = document.getElementById("hyka").value;
	var mima = document.getElementById("mima").value;
	var kahao = document.getElementById("kahao").value;
	var password = document.getElementById("password").value;
	
}
</script>
<style type="text/css">
<!--
.STYLE2 {
	font-size: 36px;
	font-weight: bold;
}
.STYLE9 {font-size: larger}
.STYLE11 {color: #99FF00}
.STYLE12 {color: #00FF00}
.STYLE13 {color: #CCFF00}
.STYLE15 {color: #CCCC00}
.STYLE16 {font-size: 24px}
.STYLE18 {font-size: 18px}
.STYLE24 {color: #0066FF; font-size: 18px; }
.STYLE25 {color: #0066CC}
-->
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
            <td background="img/register-sm2.jpg"><div align="center"><a class="STYLE1" onclick="tijiao()">选择座位</a></div></td>
            <td>&nbsp;</td>
          </tr>
          <tr>
            <td height="36">&nbsp;</td>
            <td background="img/register-sm2.jpg"><div align="center"><a  class="STYLE1">确认订票</a></div></td>
            <td>&nbsp;</td>
          </tr>
          <tr>
            <td height="38">&nbsp;</td>
            <td background="img/register-sm2.jpg"><div align="center"><a href="tem.do?qw=yulan"  class="STYLE1">已订影票</a></div></td>
            <td>&nbsp;</td>
          </tr>
      </table>
	  <!-- InstanceEndEditable --></td>
      <td width="786" rowspan="2" bgcolor="#666666"><!-- InstanceBeginEditable name="div32" -->
        <div align="center">
        <html:form action="tem?qw=ydShow">
         <html:hidden name="temForm" property="hyka"/>
          <html:hidden name="temForm" property="mima"/>
        <logic:iterate id="FYDomin" name="temForm" property="fy" indexId="index" type="com.dpxt.domin.FYDomin">
          <table width="436" height="171" border="0" bgcolor="#339966">
            <tr>
              <td height="55" colspan="5"><div align="center"><img src="img/shca_tickets.gif" width="38" height="43" /><span class="STYLE2">月下影厅</span></div></td>
            </tr>
            <tr>
              <td height="17" colspan="5"><div align="right">温馨提示：XXXXXXXXXXXXXXXXXXXX</div></td>
            </tr>
            <tr>
              <td width="54" height="24">&nbsp;</td>
              <td bgcolor="#99FF66"><span class="STYLE16"><span class="STYLE24"><bean:write name="FYDomin" property="ytName"/> <html:hidden name="FYDomin" property="ytName"/></span></span></td>
              <td width="61" bgcolor="#99FF66"><span class="STYLE16"><span class="STYLE24"><bean:write name="FYDomin" property="ythao"/><html:hidden name="FYDomin" property="ytName"/></span></span></td>
              <td width="73" bgcolor="#99FF66"><span class="STYLE16"><span class="STYLE24">对号入座</span></span></td>
              <td width="46">&nbsp;</td>
            </tr>
            <tr>
              <td height="21">&nbsp;</td>
              <td bgcolor="#99FF66"><span class="STYLE16"><span class="STYLE24"><bean:write name="FYDomin" property="ypName"/><html:hidden name="FYDomin" property="ytName"/></span></span></td>
              <td><span class="STYLE9"></span></td>
              <td><span class="STYLE9"></span></td>
              <td>&nbsp;</td>
            </tr>
            <tr>
              <td height="17">&nbsp;</td>
              <td bgcolor="#99FF66"><span class="STYLE16"><span class="STYLE24"><bean:write name="FYDomin" property="date"/><html:hidden name="FYDomin" property="ytName"/></span></span></td>
              <td bgcolor="#99FF66"><span class="STYLE16"><span class="STYLE24"><bean:write name="FYDomin" property="time"/><html:hidden name="FYDomin" property="ytName"/></span></span></td>
              <td bgcolor="#99FF66"><span class="STYLE16"><span class="STYLE24"><bean:write name="FYDomin" property="money"/><html:hidden name="FYDomin" property="ytName"/></span></span></td>
              <td>&nbsp;</td>
            </tr>
            <tr>
              <td height="17">&nbsp;</td>
              <td bgcolor="#339966">&nbsp;</td>
              <td bgcolor="#339966">&nbsp;</td>
              <td bgcolor="#339966">&nbsp;</td>
              <td>&nbsp;</td>
            </tr>
           
          </table>
          <table>
         <p>&nbsp;</p>
          </logic:iterate>
          
          
          <p>&nbsp;</p>
          
            <label></label>
            <p>&nbsp;</p>
          </html:form>
          <div>
            <p>&nbsp;</p>
            <p><span class="STYLE12"><br></span><span class="STYLE11"></span></p>
            <p>&nbsp;</p>
          </div>
       
        <!-- InstanceEndEditable -->
          <p>&nbsp;</p>
      <p>&nbsp;</p>
  
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
