package com.jizhong.pojo;

public class MyObject implements Cloneable{
	String name;
	int age;
	String address;
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	/**
	 * 重写equals方法目的：
	 * 		equals方法用来做对象之间判断，
	 * 		Object对象中的equals方法做的是==判断（==判断内存地址），
	 * 		但是对象中判断一般不会调用equals方法去判断内存地址值，
	 * 		因为==号就可以判断，而且内存地址值不是一个重要的判断值，
	 * 		所以我们一般会重写equals方法，
	 * 		让该方法只判断对象的属性，属性相等两个对象就相等即可。
	 */
	@Override
	public boolean equals(Object obj) {
		MyObject mo = (MyObject)obj;
		//重写equals方法后 不做对象判断，只做属性值的判断
		/**
		 * this：哪个对象调用方法，this就是哪个对象
		 */
		if (this.name == mo.getName() && this.age == mo.getAge() && this.address == mo.getAddress()) {
			return true;
		}else{
			return false;
		}
	}
	
	/**
	 * clone方法：
	 * 		用来克隆相同类型对象中的属性值，并且返回一个新的对象
	 */
	@Override
	public MyObject clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return (MyObject)super.clone();
	}



	@Override
	public String toString() {
		return "MyObject [名称=" + name + ", 年龄=" + age + ", address=" + address + "]";
	}
	
//	@Override
//	public String toString() {
//		// TODO Auto-generated method stub
//		return "MyObject :{name:" + this.name +" "
//				+ ",age:"+ this.age +",address:"+ this.address +"}";
//	}
	
}
