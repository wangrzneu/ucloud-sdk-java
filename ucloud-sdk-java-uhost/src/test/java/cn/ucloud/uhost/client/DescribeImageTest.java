package cn.ucloud.uhost.client;

import cn.ucloud.uhost.client.DefaultUhostClient;
import cn.ucloud.uhost.client.UhostClient;
import cn.ucloud.uhost.model.DescribeImageParam;
import cn.ucloud.uhost.model.DescribeImageResult;
import cn.ucloud.common.pojo.Account;
import cn.ucloud.uhost.pojo.UhostConfig;
import org.junit.Before;
import org.junit.Test;

/**
 * @description:
 * @author: codezhang
 * @date: 2018-09-18 16:44
 **/
public class DescribeImageTest {

    private UhostClient client;

    private DescribeImageParam param;

    @Before
    public void initData() {
        client = new DefaultUhostClient(new UhostConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        param = new DescribeImageParam("cn-bj2");
    }

    @Test
    public void describeImage() {
        try {
            DescribeImageResult describeImageResult = client.describeImage(param);
            System.out.println(describeImageResult);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}