$package('javazx.content');
javazx.content = function(){
	var _box = null;
	var _this = {
		config:{
			event:{
				add:function(){
					$('#typeIds_combobox').combobox('reload');
					_box.handler.add();
				},
				edit:function(){
					$('#typeIds_combobox').combobox('reload');
					_box.handler.edit();
				}
			},
  			dataGrid:{
  				title:'内容',
	   			url:'dataList.do',
	   			columns:[[
					{field:'id',checkbox:true},
					{field:'q',title:'查询关键词',align:'center',sortable:true,
							formatter:function(value,row,index){
								return row.q;
							}
						},
					{field:'local',title:'链接地址',align:'center',sortable:true,
							formatter:function(value,row,index){
								return row.local;
							}
						},
					{field:'num',title:'访问次数',align:'center',sortable:true,
							formatter:function(value,row,index){
								return row.num;
							}
						},
					{field:'update_flag',title:'更新标识',align:'center',sortable:true,
							formatter:function(value,row,index){
								return row.update_flag;
							}
						},
					{field:'create_time',title:'',align:'center',sortable:true,
							formatter:function(value,row,index){
								return row.create_time;
							}
						},
					{field:'update_time',title:'',align:'center',sortable:true,
							formatter:function(value,row,index){
								return row.update_time;
							}
						},
					{field:'remark',title:'备注',align:'center',sortable:true,
							formatter:function(value,row,index){
								return row.remark;
							}
						},
					{field:'update_num',title:'更新次数',align:'center',sortable:true,
							formatter:function(value,row,index){
								return row.update_num;
							}
						},
					{field:'user_ip',title:'用户ip地址',align:'center',sortable:true,
							formatter:function(value,row,index){
								return row.user_ip;
							}
						},
					]]
			}
		},
		init:function(){
			_box = new YDataGrid(_this.config); 
			_box.init();
		}
	}
	return _this;
}();

$(function(){
javazx.content.init();
});