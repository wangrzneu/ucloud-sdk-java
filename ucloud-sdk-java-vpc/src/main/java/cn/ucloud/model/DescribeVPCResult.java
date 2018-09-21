package cn.ucloud.model;

import cn.ucloud.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @description: 获取VPC信息 结果类
 * @author: codezhang
 * @date: 2018-09-21 14:41
 **/

public class DescribeVPCResult extends BaseResponseResult {

    public static class  VPC{

        /**
         * 创建时间 Unix时间戳
         */
        @SerializedName("CreateTime")
        private Integer createTime;

        /**
         * vpc名称
         */
        @SerializedName("Name")
        private String name;

        /**
         * IP信息 10.44.0.0/16
         */
        @SerializedName("Network")
        private List<String> networks;

        /**
         * IP详细信息
         */
        @SerializedName("NetworkInfo")
        private List<NetworkInfo> networkInfos;

        /**
         * subnet数目
         */
        @SerializedName("SubnetCount")
        private Integer subnetCount;

        /**
         * 业务名称
         */
        @SerializedName("Tag")
        private String tag;

        /**
         * 更新时间 unix时间戳
         */
        @SerializedName("UpdateTime")
        private Integer updateTime;

        /**
         * vpcId
         */
        @SerializedName("VPCId")
        private String vpcId;

        public Integer getCreateTime() {
            return createTime;
        }

        public void setCreateTime(Integer createTime) {
            this.createTime = createTime;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public List<String> getNetworks() {
            return networks;
        }

        public void setNetworks(List<String> networks) {
            this.networks = networks;
        }

        public List<NetworkInfo> getNetworkInfos() {
            return networkInfos;
        }

        public void setNetworkInfos(List<NetworkInfo> networkInfos) {
            this.networkInfos = networkInfos;
        }

        public Integer getSubnetCount() {
            return subnetCount;
        }

        public void setSubnetCount(Integer subnetCount) {
            this.subnetCount = subnetCount;
        }

        public String getTag() {
            return tag;
        }

        public void setTag(String tag) {
            this.tag = tag;
        }

        public Integer getUpdateTime() {
            return updateTime;
        }

        public void setUpdateTime(Integer updateTime) {
            this.updateTime = updateTime;
        }

        public String getVpcId() {
            return vpcId;
        }

        public void setVpcId(String vpcId) {
            this.vpcId = vpcId;
        }

        @Override
        public String toString() {
            return "VPC{" +
                    "createTime=" + createTime +
                    ", name='" + name + '\'' +
                    ", networks=" + networks +
                    ", networkInfos=" + networkInfos +
                    ", subnetCount=" + subnetCount +
                    ", tag='" + tag + '\'' +
                    ", updateTime=" + updateTime +
                    ", vpcId='" + vpcId + '\'' +
                    '}';
        }
    }


    public  static class NetworkInfo {

        @SerializedName("Network")
        private String network;

        @SerializedName("SubnetCount")
        private Integer subnetCount;

        public String getNetwork() {
            return network;
        }

        public void setNetwork(String network) {
            this.network = network;
        }

        public Integer getSubnetCount() {
            return subnetCount;
        }

        public void setSubnetCount(Integer subnetCount) {
            this.subnetCount = subnetCount;
        }

        @Override
        public String toString() {
            return "NetworkInfo{" +
                    "network='" + network + '\'' +
                    ", subnetCount=" + subnetCount +
                    '}';
        }
    }


    @SerializedName("DataSet")
    private List<VPC> vpcs;

    public List<VPC> getVpcs() {
        return vpcs;
    }

    public void setVpcs(List<VPC> vpcs) {
        this.vpcs = vpcs;
    }

    @Override
    public String toString() {
        return "DescribeVPCResult{" +
                "vpcs=" + vpcs +
                ", retCode=" + retCode +
                ", action='" + action + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
