import com.showtime.jdbc.businessbill.domain.BusinessBill;
import com.showtime.jdbc.businessbill.service.BusinessBillService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.Date;

/**
 * Created with IntelliJ IDEA
 *
 * @description: 测试类
 * @author: yaoweihao
 * @date: 2018/8/2
 * @time: 15:50
 * @modified by:
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:sharding/shardingDatabasesTables.xml"})
public class BussinessBillTest {

    @Autowired
    private BusinessBillService businessBillSer;

    @Test
    public void test(){
        BusinessBill businessBill = new BusinessBill();
        businessBill.setId(new Long(53548544));
        businessBill.setSystemSource("ECLP");
        businessBill.setOrderType("ECLP_PO");
        businessBill.setSellerNo("EBU4418046515467");
        businessBill.setTransactionType("ECLP_PO_TENCENT");
        businessBill.setBusinessNo("EPL4418048672078");
        businessBill.setStatus(0);
        businessBill.setContext("ECLP");
        businessBill.setCreateTime(new Date());
        businessBill.setCreateUser("SYSTEM");
        businessBill.setUpdateTime(new Date());
        businessBill.setUpdateUser("SYSTEM");

        businessBillSer.insert(businessBill);
    }

}
