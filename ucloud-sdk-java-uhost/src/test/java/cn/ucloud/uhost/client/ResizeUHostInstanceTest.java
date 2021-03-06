package cn.ucloud.uhost.client;

import cn.ucloud.uhost.client.DefaultUhostClient;
import cn.ucloud.uhost.client.UhostClient;
import cn.ucloud.uhost.model.ResizeUHostInstanceParam;
import cn.ucloud.uhost.model.ResizeUHostInstanceResult;
import cn.ucloud.common.pojo.Account;
import cn.ucloud.uhost.pojo.UhostConfig;
import org.junit.Before;
import org.junit.Test;

/**
 * @description:
 * @author: codezhang
 * @date: 2018-09-18 12:06
 **/
public class ResizeUHostInstanceTest {

    private UhostClient client;

    private ResizeUHostInstanceParam param;

    @Before
    public void initData() {
        client = new DefaultUhostClient(new UhostConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        // uimage-cjswb5 ubuntu 16.04
        //param = new ResizeUHostInstanceParam("cn-bj2","uhost-zzsffd");
        param = new ResizeUHostInstanceParam("cn-bj2","uhost-euyi2b");
        param.setProjectId("org-4nfe1i");
        param.setCpu(2);
    }

    @Test
    public void resizeUHostInstance() {
        try {
            ResizeUHostInstanceResult resizeUHostInstanceResult = client.resizeUHostInstance(param);
            System.out.println(resizeUHostInstanceResult);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}