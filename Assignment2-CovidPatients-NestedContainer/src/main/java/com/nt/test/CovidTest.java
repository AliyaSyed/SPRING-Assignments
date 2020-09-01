package com.nt.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.controller.MainController;
import com.nt.vo.CovidVO;

public class CovidTest {

	public static void main(String[] args) {
		ApplicationContext parentCtx=null,childCtx=null;
		MainController controller=null;
		List<CovidVO> listVO=null;
		//create parent IOC container
		parentCtx= new ClassPathXmlApplicationContext("com/nt/cfgs/business-beans.xml");
		//create child IOC container
		childCtx=new ClassPathXmlApplicationContext(new String[] {"com/nt/cfgs/presentation-beans.xml"},parentCtx);
		
		//get controller class object
		controller=childCtx.getBean("controller",MainController.class);
		
		//invoke the business method
		System.out.println("------------------------------------------------------------");
		
		try {
			listVO=controller.gatherPatientsByAddr("goa", "chennai","mumbai");
			
			//display the result
			for(CovidVO vo :listVO) {
				System.out.println(vo);
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		((AbstractApplicationContext) parentCtx).close();
		((AbstractApplicationContext) childCtx).close();
	}

}
