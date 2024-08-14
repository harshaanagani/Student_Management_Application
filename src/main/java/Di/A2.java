package Di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class A2 {

public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
	A1 bean = context.getBean("abc",A1.class);
	A1 bean2 = context.getBean("Z",A1.class);
	System.out.println(bean);
	System.out.println(bean2);
}
}
