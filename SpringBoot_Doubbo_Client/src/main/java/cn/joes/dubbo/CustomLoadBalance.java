package cn.joes.dubbo;

import com.alibaba.dubbo.common.URL;
import com.alibaba.dubbo.rpc.Invocation;
import com.alibaba.dubbo.rpc.Invoker;
import com.alibaba.dubbo.rpc.RpcException;
import com.alibaba.dubbo.rpc.cluster.LoadBalance;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by myijoes on 2019/8/9.
 *
 * @author wanqiao
 */
public class CustomLoadBalance implements LoadBalance {
    
    Map<String, String> occupyProvider = new HashMap<String, String>();

    //获取所有的提供者

    Map<String, String> allProvider = new HashMap<String, String>();

    @Override
    public <T> Invoker<T> select(List<Invoker<T>> invokers, URL url, Invocation invocation) throws RpcException {
        
        for (Invoker<T> invoker : invokers){
            System.out.println("######" + invoker.getUrl().getAddress()+invoker.getUrl().getHost()+invoker.getUrl().getPort());
            Class<T> anInterface = invoker.getInterface();
            if(invoker.getUrl().getHost().equals(invocation.getArguments()[2].toString())){
                return invoker;
            }
        }
        return null;
    }
}
