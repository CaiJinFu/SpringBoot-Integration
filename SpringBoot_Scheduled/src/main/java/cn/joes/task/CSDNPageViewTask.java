package cn.joes.task;

import org.apache.http.Header;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicHeader;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by myijoes on 2018/6/23.
 */

@Component
public class CSDNPageViewTask {

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    private static final List<String> urllists = new ArrayList<String>();

    private static Integer count = 0;

    {
        urllists.add("https://blog.csdn.net/m_joes_17/article/details/80852052");
        urllists.add("https://blog.csdn.net/m_joes_17/article/details/80563671");
        urllists.add("https://blog.csdn.net/m_joes_17/article/details/80540073");
        urllists.add("https://blog.csdn.net/m_joes_17/article/details/80527635");
        urllists.add("https://blog.csdn.net/m_joes_17/article/details/80492236");
        urllists.add("https://blog.csdn.net/m_joes_17/article/details/80484128");
        urllists.add("https://blog.csdn.net/m_joes_17/article/details/80453812");
        urllists.add("https://blog.csdn.net/m_joes_17/article/details/80099684");
        urllists.add("https://blog.csdn.net/m_joes_17/article/details/80899274");
        urllists.add("https://blog.csdn.net/m_joes_17/article/details/80889568");
    }

    @Scheduled(fixedRate = 30000)
    public void reportCurrentTime() throws IOException {
        System.out.println("现在时间：" + dateFormat.format(new Date()));
        urllists.forEach(c -> {
            CloseableHttpClient httpclient = HttpClients.createDefault();
            HttpGet httpGet = new HttpGet(c);
            httpGet.setHeader("cookie", "TY_SESSION_ID=a35fa877-14e8-47dd-b71a-c17d69641254; __yadk_uid=yRmi4OLa2x7YNpPORbkK7NjNYWwrrvqz; Hm_lpvt_6bcd52f51e9b3dce32bec4a3997715ac=1530497191; dc_session_id=10_1530495960837.248620; kd_user_id=bf3400be-b55b-44dd-93e3-1115524d6f99; Hm_ct_6bcd52f51e9b3dce32bec4a3997715ac=1788*1*PC_VC; uuid_tt_dd=10_19477468810-1524026222172-525258; dc_tos=pb7v6v; BT=1530497186833;smidV2=20180604161121ed6a2ac50b0d7dc4a843bdbda186ba1d001d0a521f73c9c10; UN=M_Joes_17; Hm_lvt_6bcd52f51e9b3dce32bec4a3997715ac=1530350258,1530351232,1530351270,1530495959; UserName=M_Joes_17; UserInfo=j6xUquk3T1ffRij2Wn9hWKGXE%2BlA3%2B%2Bf1oeJGIYWqbpb%2Bq9cUsG0FIfaG4MBS4DZbXDzOrVuD4icSYhPEYDVmNyRtFYQwO18qYnG1sKJ2q6anxHJa028LMEekbtinhG9; UserNick=M_Joes_18; AU=F44");

            System.out.println("访问页面: " + c);
            try {
                CloseableHttpResponse response = httpclient.execute(httpGet);
                httpclient.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

            count++;
            System.out.println("###### 统计次数 count: " + count);
            if(count == 10){

            }
        });
    }

}
