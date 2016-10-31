package demo.entity.demo;

import com.base.entity.BaseEntity;
import java.math.BigDecimal;
/**
 * 
 * <br>
 * <b>功能：</b>JeecgUserEntity<br>
 * <b>作者：</b>www.javazx.com<br>
 * <b>日期：</b> Feb 2, 2016 <br>
 * <b>版权所有：<b>版权所有(C) 2016，www.javazx.org<br>
 */
public class JeecgUser extends BaseEntity {
	
		private java.lang.String id;//   	private java.lang.Integer age;//   年龄	private java.lang.String name;//   名字	private java.lang.String adress;//   住址	private BigDecimal salary;//   工资	private java.util.Date createdt;//   出生日期	public java.lang.String getId() {	    return this.id;	}	public void setId(java.lang.String id) {	    this.id=id;	}	public java.lang.Integer getAge() {	    return this.age;	}	public void setAge(java.lang.Integer age) {	    this.age=age;	}	public java.lang.String getName() {	    return this.name;	}	public void setName(java.lang.String name) {	    this.name=name;	}	public java.lang.String getAdress() {	    return this.adress;	}	public void setAdress(java.lang.String adress) {	    this.adress=adress;	}	public BigDecimal getSalary() {	    return this.salary;	}	public void setSalary(BigDecimal salary) {	    this.salary=salary;	}	public java.util.Date getCreatedt() {	    return this.createdt;	}	public void setCreatedt(java.util.Date createdt) {	    this.createdt=createdt;	}
}

