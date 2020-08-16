package test;

import com.cmb.Order;

import org.junit.Test;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

/**
 * @ProjectName: drool-stest
 * @Package: test
 * @ClassName: TestDrools
 * @Author: 梁浩
 * @Description: 测试
 * @Date: 2020/8/16 10:17
 * @Version: 1.0
 */
public class TestDrools {

    @Test
    public void test1(){

        //获取kieServices
        KieServices kieServices = KieServices.Factory.get();

        //获取kieservces的容器对象
        KieContainer kieContainer = kieServices.newKieClasspathContainer();

        //获取会话对象
        KieSession kieSession = kieContainer.newKieSession();


        //Fact对象也叫事实对象
        Order order = new Order();
        order.setOriginlPrice(500d);

        System.out.println("优惠前价格："+order.getOriginlPrice());

        //将order对象插入工作内存
        kieSession.insert(order);


        //触发规则，drools 框架自动匹配，匹配成功执行当前规则
        kieSession.fireAllRules();

        System.out.println("优惠后价格："+order.getRealPrice());
        //关闭会话
        kieSession.dispose();
        System.out.println("关闭会话");
    }
}
