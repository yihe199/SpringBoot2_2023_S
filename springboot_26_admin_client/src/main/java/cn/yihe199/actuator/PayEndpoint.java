package cn.yihe199.actuator;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
@Endpoint(id="pay",enableByDefault = true)
public class PayEndpoint {

    @ReadOperation
    public Object getPay(){
        Map<String,Object> payMap = new HashMap<>(16);
        payMap.put("level 1","300");
        payMap.put("level 2","291");
        payMap.put("level 3","666");
        return payMap;
    }

}
