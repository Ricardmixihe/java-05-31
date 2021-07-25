package com.jizhong.test;

import com.jizhong.pojo.MyObject;

public class TestEquals {
	public static void main(String[] args) throws Exception{
//		MyObject o = new MyObject();//15db9742
//		o.setAddress("张家口");
//		o.setAge(18);
//		o.setName("张三");
//		
//		MyObject o2 = new MyObject();//6d06d69c
//		o2.setAddress("张家口");
//		o2.setAge(18);
//		o2.setName("张三");
//		
//		System.out.println(o);
//		System.out.println(o2);
//		System.out.println(o.equals(o2));
//		//==号做判断会判断两个对象的内存地址值
//		System.out.println(o == o2);
//		//内存地址值
		
		//String.equals()：只判断字符串是否一样
//		String s1 = "Hello";
//		String s2 = new String("Hello");//new 内存地址值
//		String s3 = s2;//将s2整个对象包括内存地址值都交给了s3
//		System.out.println(s1 == s2);//判断内存地址值
//		//String类重写了equals方法，不再做内存地址值的判断，只做每个字符的判断
//		System.out.println(s1.equals(s2));//只判断字符
//		System.out.println(s2 == s3);
		
		MyObject mo1 = new MyObject();
		mo1.setAddress("张家口");
		mo1.setAge(18);
		mo1.setName("张三");
		//使用clone方法克隆一个新的对象
		//复制一个相同属性的对象
		MyObject m3 = mo1.clone();
//		MyObject m3 = (MyObject)o;
//		System.out.println("m3对象名称：" + m3.getName());
//		System.out.println("m3对象名称：" + m3.getAge());
//		System.out.println("m3对象名称：" + m3.getAddress());
//		System.out.println(mo1 == m3);
		
		//打印对象是调用的就是toString
//		System.out.println(mo1);//内存地址值
//		System.out.println(m3);//属性：参数
		
		//构造方法不传参数，创建对象就是一个""空字符串
//		String s = new String();//""
//		System.out.println(s);
//		
//		//构造方法中传字符串类型参数，创建对象就是一个字符数组
//		String s2 = new String("abcd");//char[]
//		System.out.println(s2);
//		
//		//构造方法中传字节类型，就可以创建一个将字节数组转成字符串的字符数组
//		byte[] bytes = new byte[]{};//utf-8
//		String s3 = new String(bytes,"utf-8");//将字节类型转成字符串
		
		
		String s1 = new String("abcdefg");
		String s2 = new String("fg");
		//boolean equalsIgnoreCase (String value)
		//比较两个字符串，不区分大小写
//		System.out.println(s1.equalsIgnoreCase(s2));//true
		
		//int compareTo(String value)
		//按字母顺序进行比较
		//比较两个字符串大小
		//如果s1在s2前，就会返回负数
		//如果s1在s2后，就会返回正数
		//如果s1与s2值相等，返回0
//		System.out.println(s1.compareTo(s2));
		
		//boolean startsWith(String value)
		//判断s1是否是以s2开头的
		//s1:张三  s2:张
		//判断张三是否姓张
//		System.out.println(s1.startsWith(s2));//true
		
		//boolean endsWith(String value)
		//判断s1是否是以s2结尾的
		//判断以什么字符串结尾
//		System.out.println(s1.endsWith("abc"));
		
		//String substring(int index) 
		//String substring(int beginindex, int endindex) 
		// 提取字符串
		//一个参数时：表示从指定索引位置开始，一直到字符串尾部
		//两个参数时：表示从指定beginindex位置开始，到endindex位置结束（含头不含尾）
		String s3 =  s1.substring(3,5);//3 4
//		System.out.println(s3);
		
		
		//String replace(String old, String new) 
		// 替换字符串：将old字符串替换为new字符串
		//String s1 = new String("abcdefg");
		String s4 = s1.replace("abc", "cba");
//		System.out.println(s4);
		
		//int indexOf(int ch)：返回字符在字符串中第一次出现的位置        
		String s5 = "abcd";
		System.out.println(s5.indexOf('a'));
		//将字符串字母转换为大写
		System.out.println("大写：" + s5.toUpperCase());
		//将字符串字母转换为小写
		System.out.println("小写：" + s5.toLowerCase());
	}
}
