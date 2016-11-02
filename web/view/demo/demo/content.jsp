<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
   <%@include file="/view/resource.jsp" %>
  </head>
  <body class="easyui-layout">
 	 <!-- Search panel start -->
 	 <div class="ui-search-panel" region="north" style="height: 80px;" title="过滤条件" data-options="striped: true,collapsible:false,iconCls:'icon-search',border:false" >  
 	 <form id="searchForm">
        <p class="ui-fields">
			<label class="ui-label">查询关键词:</label><input name="q" class="easyui-box ui-text" style="width:100px;">
			<label class="ui-label">链接地址:</label><input name="local" class="easyui-box ui-text" style="width:100px;">
	    </p>
	    <a href="#" id="btn-search" class="easyui-linkbutton" iconCls="icon-search">查询</a>
      </form>  
     </div> 
     <!--  Search panel end -->

     <!-- Data List -->
     <div region="center" border="false" >
     <table id="data-list"></table>
	 </div>
	 
     <!-- Edit Win&Form -->
     <div id="edit-win" class="easyui-dialog" title="Basic window" data-options="closed:true,iconCls:'icon-save',modal:true" style="width:400px;height:380px;">  
     	<form id="editForm" class="ui-form" method="post">  
     		 <input class="hidden" name="id">
     		 <div class="ui-edit">
		     	   <div class="ftitle">内容</div>
					<div class="fitem">
						<label>查询关键词</label>
						<input name="q" type="text" maxlength="64" class="easyui-validatebox" data-options="" missingMessage="请填写查询关键词">
					</div>
					<div class="fitem">
						<label>链接地址</label>
						<input name="local" type="text" maxlength="256" class="easyui-validatebox" data-options="" missingMessage="请填写链接地址">
					</div>
					<div class="fitem">
						<label>访问次数</label>
						<input name="num" type="text" maxlength="" class="easyui-numberbox" data-options="" missingMessage="请填写访问次数">
					</div>
					<div class="fitem">
						<label>更新标识</label>
						<input name="update_flag" type="text" maxlength="" class="easyui-numberbox" data-options="" missingMessage="请填写更新标识">
					</div>
					<div class="fitem">
						<label></label>
						<input name="create_time" type="text" maxlength="" class="easyui-datetimebox" data-options="" missingMessage="请填写">
					</div>
					<div class="fitem">
						<label></label>
						<input name="update_time" type="text" maxlength="" class="easyui-datetimebox" data-options="" missingMessage="请填写">
					</div>
					<div class="fitem">
						<label>备注</label>
						<input name="remark" type="text" maxlength="64" class="easyui-validatebox" data-options="" missingMessage="请填写备注">
					</div>
					<div class="fitem">
						<label>更新次数</label>
						<input name="update_num" type="text" maxlength="" class="easyui-numberbox" data-options="" missingMessage="请填写更新次数">
					</div>
					<div class="fitem">
						<label>用户ip地址</label>
						<input name="user_ip" type="text" maxlength="64" class="easyui-validatebox" data-options="" missingMessage="请填写用户ip地址">
					</div>
  			</div>
     	</form>
  	 </div>
  	 <script type="text/javascript" src="<%=basePath%>/view/demo/demo/page-content.js"></script>
  </body>
</html>
