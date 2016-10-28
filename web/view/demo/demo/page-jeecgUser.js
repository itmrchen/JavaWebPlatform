$package('javazx.jeecgUser');
javazx.jeecgUser = function(){
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
  				title:'用户',
	   			url:'dataList.do',
	   			columns:[[
					{field:'id',checkbox:true},
					{field:'age',title:'年龄',align:'center',sortable:true,
							formatter:function(value,row,index){
								return row.age;
							}
						},
					{field:'name',title:'名字',align:'center',sortable:true,
							formatter:function(value,row,index){
								return row.name;
							}
						},
					{field:'adress',title:'住址',align:'center',sortable:true,
							formatter:function(value,row,index){
								return row.adress;
							}
						},
					{field:'salary',title:'工资',align:'center',sortable:true,
							formatter:function(value,row,index){
								return row.salary;
							}
						},
					{field:'createdt',title:'出生日期',align:'center',sortable:true,
							formatter:function(value,row,index){
								return row.createdt;
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
	javazx.jeecgUser.init();
});