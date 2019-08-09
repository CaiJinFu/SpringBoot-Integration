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
        urllists.add("ttps://blog.csdn.net/m_joes_17/article/details/81094715");
        /*urllists.add("ttps://blog.csdn.net/m_joes_17/article/details/81076998");
        urllists.add("ttps://blog.csdn.net/m_joes_17/article/details/81067672");
        urllists.add("ttps://blog.csdn.net/m_joes_17/article/details/81001700");
        urllists.add("ttps://blog.csdn.net/m_joes_17/article/details/80981483");
        urllists.add("ttps://blog.csdn.net/m_joes_17/article/details/80899274");
        urllists.add("ttps://blog.csdn.net/m_joes_17/article/details/80889627");
        urllists.add("ttps://blog.csdn.net/m_joes_17/article/details/80889568");
        urllists.add("ttps://blog.csdn.net/m_joes_17/article/details/80852052");
        urllists.add("ttps://blog.csdn.net/m_joes_17/article/details/80563671");
        urllists.add("ttps://blog.csdn.net/m_joes_17/article/details/80540073");
        urllists.add("ttps://blog.csdn.net/m_joes_17/article/details/80527635");
        urllists.add("ttps://blog.csdn.net/m_joes_17/article/details/80492236");
        urllists.add("ttps://blog.csdn.net/m_joes_17/article/details/80484128");
        urllists.add("ttps://blog.csdn.net/m_joes_17/article/details/80479782");
        urllists.add("ttps://blog.csdn.net/m_joes_17/article/details/80477267");
        urllists.add("ttps://blog.csdn.net/m_joes_17/article/details/80454246");
        urllists.add("ttps://blog.csdn.net/m_joes_17/article/details/80453812");
        urllists.add("ttps://blog.csdn.net/m_joes_17/article/details/80452410");
        urllists.add("ttps://blog.csdn.net/m_joes_17/article/details/80430864");*/
    }

    @Scheduled(fixedRate = 30000)
    public void reportCurrentTime() throws IOException {
        System.out.println("现在时间：" + dateFormat.format(new Date()));
        urllists.forEach(c -> {
            CloseableHttpClient httpclient = HttpClients.createDefault();
            HttpGet httpGet = new HttpGet(c);
            httpGet.setHeader("cookie", "uuid_tt_dd=10_10326673180-1524467245344-276070; kd_user_id=4116614e-242e-41f8-8260-3827f58b307d; __utma=17226283.6981119.1528681803.1528681803.1528681803.1; __utmz=17226283.1528681803.1.1.utmcsr=(direct)|utmccn=(direct)|utmcmd=(none); ADHOC_MEMBERSHIP_CLIENT_ID1.0=9bc57eaf-6651-c1eb-a41d-d04370597063; Hm_ct_6bcd52f51e9b3dce32bec4a3997715ac=1788*1*PC_VC; UserName=M_Joes_17; UserInfo=j6xUquk3T1ffRij2Wn9hWKGXE%2BlA3%2B%2Bf1oeJGIYWqbpb%2Bq9cUsG0FIfaG4MBS4DZbXDzOrVuD4icSYhPEYDVmNyRtFYQwO18qYnG1sKJ2q6anxHJa028LMEekbtinhG9; UserNick=M_Joes_18; UN=M_Joes_17; AU=F44; BT=1531795458557; UserToken=j6xUquk3T1ffRij2Wn9hWKGXE%2BlA3%2B%2Bf1oeJGIYWqbpb%2Bq9cUsG0FIfaG4MBS4DZbXDzOrVuD4icSYhPEYDVmNyRtFYQwO18qYnG1sKJ2q5U91I1b%2BsBNHuC9uCfEhoHi%2B4pmp0%2FQV4Qg%2FGfimrA37AxbWtDljxg5aT3lG39O5P0f%2Bji%2F267W6I%2FFGwHYCR7; smidV2=20180611093245db50df8789697fe6b5323ad3fc57e3ef0073bf57ecf2ecd70; dc_session_id=10_1532069859884.559413; TY_SESSION_ID=33febc4f-d8b4-4bcf-8a5a-e4ecc0be5d0b; dc_tos=pc5l7s; Hm_lvt_6bcd52f51e9b3dce32bec4a3997715ac=1531998131,1531998143,1531998290,1532069860; Hm_lpvt_6bcd52f51e9b3dce32bec4a3997715ac=1532070569");

            System.out.println("访问页面: " + c);
            try {
                CloseableHttpResponse response = httpclient.execute(httpGet);
                httpclient.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

            count++;
            System.out.println("###### 统计次数 count: " + count);

        });
    }

}
