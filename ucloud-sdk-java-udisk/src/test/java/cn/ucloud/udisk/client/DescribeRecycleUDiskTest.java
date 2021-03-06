package cn.ucloud.udisk.client;

import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.common.pojo.Account;
import cn.ucloud.udisk.model.DescribeRecycleUDiskParam;
import cn.ucloud.udisk.model.DescribeRecycleUDiskResult;
import cn.ucloud.udisk.pojo.UdiskConfig;
import org.junit.Before;
import org.junit.Test;

/**
 * @description:
 * @author: joshua
 * @E-mail: joshua.yin@ucloud.cn
 * @date: 2018/9/26 16:52
 */
public class DescribeRecycleUDiskTest {
    private UdiskClient client;

    private DescribeRecycleUDiskParam param;

    @Before
    public void initData() {
        client = new DefaultUdiskClient(new UdiskConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        param = new DescribeRecycleUDiskParam("cn-sh2", "cn-sh2-01");
        param.setProjectId("org-4nfe1i");
    }

    @Test
    public void describeRecycleUDisk() {
        try {
            DescribeRecycleUDiskResult result = client.describeRecycleUDisk(param);
            System.out.println("同步：" + result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void describeRecycleUDiskCallback() {
        client.describeRecycleUDisk(param, new UcloudHandler<DescribeRecycleUDiskResult>() {
            @Override
            public Object success(DescribeRecycleUDiskResult result) {
                System.out.println("异步 success：" + result);
                return null;
            }

            @Override
            public Object failed(DescribeRecycleUDiskResult result) {
                System.out.println("异步 failed：" + result);
                return null;
            }

            @Override
            public Object error(Exception e) {
                System.out.println("异步 error：" + e);
                return null;
            }
        }, false);
    }
}
