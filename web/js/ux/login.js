$package('javazx.login');
javazx.login = function(){
	return {
		toLogin:function(){
			try{
				var form = $("#loginForm");
				if(form.form('validate')){
					javazx.progress('Please waiting','Loading...');
					javazx.submitForm(form,function(data){
						javazx.closeProgress();
						if(data.success){
					 		window.location= "main.shtml";
				        }else{
				       	   javazx.alert('提示',data.msg,'error');  
				        }
				        javazx.login.loadVrifyCode();//刷新验证码
					});
				}
			}catch(e){
				
			}
			return false;
		},
		loadVrifyCode:function(){//刷新验证码
			var _url = "ImageServlet?time="+new Date().getTime();
			$(".vc-pic").attr('src',_url);
		},
		init:function(){
			if(window.top != window.self){
				window.top.location =  window.self.location;
			}
			//验证码图片绑定点击事件
			$(".vc-pic").click(javazx.login.loadVrifyCode);
			
			var form = $("#loginForm");
			form.submit(javazx.login.toLogin);
		}
	}
}();

$(function(){
	javazx.login.init();
});		