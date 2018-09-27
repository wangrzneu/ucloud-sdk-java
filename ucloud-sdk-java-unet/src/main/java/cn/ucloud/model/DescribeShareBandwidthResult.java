package cn.ucloud.model;

import cn.ucloud.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @description: 获取共享带宽信息 结果类
 * @author: codezhang
 * @date: 2018-09-27 16:52
 **/

public class DescribeShareBandwidthResult extends BaseResponseResult {

    public static class ShareBandwidth{

        /**
         * 共享带宽值(预付费)/共享带宽峰值(后付费), 单位Mbps
         */
        @SerializedName("ShareBandwidth")
        private Integer shareBandwidth;

        /**
         * 共享带宽的资源ID
         */
        @SerializedName("ShareBandwidthId")
        private String shareBandwidthId;

        /**
         * 付费方式, 预付费:Year 按年,Month 按月,Dynamic 按需;后付费:PostPay(按月)
         */
        @SerializedName("ChargeType")
        private String chargeType;

        /**
         * 创建时间, 格式为Unix Timestamp
         */
        @SerializedName("CreateTime")
        private Integer createTime;

        /**
         * 过期时间, 格式为Unix Timestamp
         */
        @SerializedName("ExpireTime")
        private Integer expireTime;

        /**
         * EIP信息,详情见 EIPAddrSet
         */
        @SerializedName("EIPSet")
        private List<EIPAddr> eipAddrs;

        /**
         * 共享带宽保底值(后付费)
         */
        @SerializedName("BandwidthGuarantee")
        private Integer bandwidthGuarantee;

        /**
         * 共享带宽后付费开始计费时间(后付费)
         */
        private Integer postPayStartTime;


        public Integer getShareBandwidth() {
            return shareBandwidth;
        }

        public void setShareBandwidth(Integer shareBandwidth) {
            this.shareBandwidth = shareBandwidth;
        }

        public String getShareBandwidthId() {
            return shareBandwidthId;
        }

        public void setShareBandwidthId(String shareBandwidthId) {
            this.shareBandwidthId = shareBandwidthId;
        }

        public String getChargeType() {
            return chargeType;
        }

        public void setChargeType(String chargeType) {
            this.chargeType = chargeType;
        }

        public Integer getCreateTime() {
            return createTime;
        }

        public void setCreateTime(Integer createTime) {
            this.createTime = createTime;
        }

        public Integer getExpireTime() {
            return expireTime;
        }

        public void setExpireTime(Integer expireTime) {
            this.expireTime = expireTime;
        }

        public List<EIPAddr> getEipAddrs() {
            return eipAddrs;
        }

        public void setEipAddrs(List<EIPAddr> eipAddrs) {
            this.eipAddrs = eipAddrs;
        }

        public Integer getBandwidthGuarantee() {
            return bandwidthGuarantee;
        }

        public void setBandwidthGuarantee(Integer bandwidthGuarantee) {
            this.bandwidthGuarantee = bandwidthGuarantee;
        }

        public Integer getPostPayStartTime() {
            return postPayStartTime;
        }

        public void setPostPayStartTime(Integer postPayStartTime) {
            this.postPayStartTime = postPayStartTime;
        }

        @Override
        public String toString() {
            return "ShareBandwidth{" +
                    "shareBandwidth=" + shareBandwidth +
                    ", shareBandwidthId='" + shareBandwidthId + '\'' +
                    ", chargeType='" + chargeType + '\'' +
                    ", createTime=" + createTime +
                    ", expireTime=" + expireTime +
                    ", eipAddrs=" + eipAddrs +
                    ", bandwidthGuarantee=" + bandwidthGuarantee +
                    ", postPayStartTime=" + postPayStartTime +
                    '}';
        }
    }


    public static class EIPAddr{

        /**
         * 运营商信息, 枚举值为: Bgp: BGP; International: 国际.
         */
        @SerializedName("OperatorName")
        private String operatorName;

        /**
         * 弹性ip地址
         */
        @SerializedName("IP")
        private String ip;

        public String getOperatorName() {
            return operatorName;
        }

        public void setOperatorName(String operatorName) {
            this.operatorName = operatorName;
        }

        public String getIp() {
            return ip;
        }

        public void setIp(String ip) {
            this.ip = ip;
        }

        @Override
        public String toString() {
            return "BandwidthPackage{" +
                    "operatorName='" + operatorName + '\'' +
                    ", ip='" + ip + '\'' +
                    '}';
        }
    }

    /**
     * 共享带宽信息组 参见 UnetShareBandwidthSet
     */
    @SerializedName("DataSet")
    private List<ShareBandwidth> shareBandwidths;

    public List<ShareBandwidth> getShareBandwidths() {
        return shareBandwidths;
    }

    public void setShareBandwidths(List<ShareBandwidth> shareBandwidths) {
        this.shareBandwidths = shareBandwidths;
    }

    @Override
    public String toString() {
        return "DescribeShareBandwidthResult{" +
                "shareBandwidths=" + shareBandwidths +
                ", retCode=" + retCode +
                ", action='" + action + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
