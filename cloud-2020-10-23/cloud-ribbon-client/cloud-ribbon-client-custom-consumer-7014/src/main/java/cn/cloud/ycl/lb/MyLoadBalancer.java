package cn.cloud.ycl.lb;

import org.springframework.cloud.client.ServiceInstance;
import java.util.List;

/**
 * @author 叶成浪
 * @date 2020.11.9
 */
public interface MyLoadBalancer {

    /**
     *
     * @param serviceInstances
     * @return
     */
    ServiceInstance instances(List<ServiceInstance> serviceInstances);



}
