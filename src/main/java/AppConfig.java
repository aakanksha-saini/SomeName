import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.pluralsight.repository.CustomerRepository;
import com.pluralsight.repository.HibernateCustomerRepositoryImpl;
import com.pluralsight.service.CustomerService;

//This is pluralsight work!!!!!!
@Configuration
@ComponentScan({"com.pluralsight"})
public class AppConfig {
	
//	@Bean(name = "customerService")
//	public CustomerService getCutomerRepository() {
//		CustomerServiceImpl service = new CustomerServiceImpl();
//		//service.setCustomerRepository(getCustomerRepository());
//		
//		return service;
//	}
	
//	@Bean(name = "customerRepository")
//	public CustomerRepository getCustomerRepository() {
//		return new HibernateCustomerRepositoryImpl();
//	}

}
