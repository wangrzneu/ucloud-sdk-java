package cn.ucloud.client;

import cn.ucloud.model.DescribeVPCParam;
import cn.ucloud.model.DescribeVPCResult;
import cn.ucloud.pojo.Account;
import cn.ucloud.pojo.VPCConfig;
import org.junit.Before;
import org.junit.Test;

/**
 * @description:
 * @author: codezhang
 * @date: 2018-09-21 14:50
 **/
public class DescribeVPCTest {


    private VPCClient client;

    private DescribeVPCParam param;


    @Before
    public void initData() {
        client = new DefaultVPCClient(new VPCConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"),
                        System.getenv("UcloudPassword"))));
        param = new DescribeVPCParam("cn-bj2");
        param.setProjectId("org-4nfe1i");
    }
    @Test
    public void describeVPC() {
        try {
            DescribeVPCResult describeVPCResult = client.describeVPC(param);
            System.out.println(describeVPCResult);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}