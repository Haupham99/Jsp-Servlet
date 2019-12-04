<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp" %>
<div id="navbar" class="navbar navbar-default          ace-save-state">
	<div class="navbar-container ace-save-state" id="navbar-container">
		<div class="navbar-header pull-left">
			Trang quản trị
		</div>
		<div class="navbar-buttons navbar-header pull-right collapse navbar-collapse" role="navigation">
			<ul class="nav ace-nav">
				<li class="light-blue dropdown-modal">
					<a data-toggle="dropdown" href="#" class="dropdown-toggle">
						Xin chào, [tên quản trị]
					</a>
					<li class="light-blue dropdown-modal">
						<a href="<c:url value="/thoat" />">
							<i class="ace-icon fa fa-power-off"></i>
							Thoát
						</a>
					</li>
				</li>
			</ul>
		</div>
	</div>
</div>