package scott.entity.demo;import com.base.entity.BaseEntity;import java.math.BigDecimal;/** *  * <br> * <b>功能：</b>JeecgPersonEntity<br> * <b>作者：</b>www.jeecg.org<br> * <b>日期：</b> Feb 2, 2013 <br> * <b>版权所有：<b>版权所有(C) 2013，www.jeecg.org<br> */public class JeecgPerson extends BaseEntity {			private String id;//	private Integer age;//   年龄	private String name;//   名字	private BigDecimal salary;//   工资	private java.util.Date createdt;//   出生日期	public String getId() {	    return this.id;	}	public void setId(String id) {	    this.id=id;	}	public Integer getAge() {	    return this.age;	}	public void setAge(Integer age) {	    this.age=age;	}	public String getName() {	    return this.name;	}	public void setName(String name) {	    this.name=name;	}	public BigDecimal getSalary() {	    return this.salary;	}	public void setSalary(BigDecimal salary) {	    this.salary=salary;	}	public java.util.Date getCreatedt() {	    return this.createdt;	}	public void setCreatedt(java.util.Date createdt) {	    this.createdt=createdt;	}}