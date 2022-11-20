import com.jt.mapper.CustomerMapper;
import com.jt.pojo.Customers;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest(classes=MybatisDemo1ApplicationTests.class)
class MybatisDemo1ApplicationTests {
	@Autowired
	private CustomerMapper customerMapper;

	@Test
	public void test() {
		List<Customers> customersList = customerMapper.findAll();
		System.out.println(customersList);

	}

}
