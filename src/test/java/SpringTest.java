import com.ace.hotel.model.Hotel;
import com.ace.hotel.service.HotelService;
import com.ace.hotel.service.OrderService;
import com.ace.hotel.service.impl.HotelServiceImpl;
import com.ace.hotel.service.impl.OrderServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.LinkedList;

/**
 * @author Ace.ch
 * @version V1.0
 * @Package PACKAGE_NAME
 * @date 2019/12/20 19:07
 */
public class SpringTest {
    @Test
    public void testDatabase() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config/*.xml");
        HotelService hotelService = (HotelServiceImpl)applicationContext.getBean("hotelService");
        System.out.println(hotelService.getHotelsByAddress("合肥"));
        OrderService orderService = (OrderServiceImpl)applicationContext.getBean("orderService");
        System.out.println(orderService.getOrdersByPhone("13812345678"));
    }
}
