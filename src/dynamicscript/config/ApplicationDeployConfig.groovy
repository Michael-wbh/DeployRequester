import com.myself.deployrequester.biz.config.impl.AbstractApplicationDeployConfig
import com.myself.deployrequester.biz.config.sharedata.RoleEnum
import com.myself.deployrequester.biz.config.spi.Config
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import com.myself.deployrequester.util.Log4jUtil;

/**
 *   Created by QueRenJie on ${date}*/
class ApplicationDeployConfig extends AbstractApplicationDeployConfig {
    /** 日志 */
    private static final Logger logger = LogManager.getLogger(ApplicationDeployConfig.class);

    @Override
    void buildApplicationDeployConfig() {
        Log4jUtil.info(logger, "加载ApplicationDeployConfig.groovy...");

        /**********配置修改类型 (begin) **************************************************/
        addModifyType(1, "bug fix");
        addModifyType(2, "new feature development");
        addModifyType(3, "feature modification");
        addModifyType(4, "redoplyment");
        /**********配置修改类型 ( end ) **************************************************/

        /**********配置模块发布的URL (begin) **************************************************/
        //1:翌能
        addModuleDeployURL(1, "system", "系统管理(vr-system)", "rest", "http://172.16.36.69:8080/deploy/system/rest/habjZOqHMFg1425Z", "http://172.16.36.69:8080/produceDeploy/system/rest/DAXtC80JSV5oK2xw");
        addModuleDeployURL(1, "system", "系统管理(vr-system)", "provider", "http://172.16.36.69:8080/deploy/system/provider/habjZOqHMFg1425Z", "http://172.16.36.69:8080/produceDeploy/system/provider/DAXtC80JSV5oK2xw");
        addModuleDeployURL(1, "base", "基础资源(vr-base)", "rest", "http://172.16.36.69:8080/deploy/base/rest/habjZOqHMFg1425Z", "http://172.16.36.69:8080/produceDeploy/base/rest/DAXtC80JSV5oK2xw");
        addModuleDeployURL(1, "base", "基础资源(vr-base)", "provider", "http://172.16.36.69:8080/deploy/base/provider/habjZOqHMFg1425Z", "http://172.16.36.69:8080/produceDeploy/base/provider/DAXtC80JSV5oK2xw");
        addModuleDeployURL(1, "contract", "合同管理(vr-contract)", "rest", "http://172.16.36.69:8080/deploy/contract/rest/habjZOqHMFg1425Z", "http://172.16.36.69:8080/produceDeploy/contract/rest/DAXtC80JSV5oK2xw");
        addModuleDeployURL(1, "contract", "合同管理(vr-contract)", "provider", "http://172.16.36.69:8080/deploy/contract/provider/habjZOqHMFg1425Z", "http://172.16.36.69:8080/produceDeploy/contract/provider/DAXtC80JSV5oK2xw");
        addModuleDeployURL(1, "finance", "财务管理(vr-finance)", "rest", "http://172.16.36.69:8080/deploy/finance/rest/habjZOqHMFg1425Z", "http://172.16.36.69:8080/produceDeploy/finance/rest/DAXtC80JSV5oK2xw");
        addModuleDeployURL(1, "finance", "财务管理(vr-finance)", "provider", "http://172.16.36.69:8080/deploy/finance/provider/habjZOqHMFg1425Z", "http://172.16.36.69:8080/produceDeploy/finance/provider/DAXtC80JSV5oK2xw");
        addModuleDeployURL(1, "reportform", "报表管理(vr-reportform)", "rest", "http://172.16.36.69:8080/deploy/reportform/rest/habjZOqHMFg1425Z", "http://172.16.36.69:8080/produceDeploy/reportform/rest/DAXtC80JSV5oK2xw");
        addModuleDeployURL(1, "reportform", "报表管理(vr-reportform)", "provider", "http://172.16.36.69:8080/deploy/reportform/provider/habjZOqHMFg1425Z", "http://172.16.36.69:8080/produceDeploy/reportform/provider/DAXtC80JSV5oK2xw");
        addModuleDeployURL(1, "goods", "商品管理(vr-goods)", "rest", "http://172.16.36.69:8080/deploy/goods/rest/habjZOqHMFg1425Z", "http://172.16.36.69:8080/produceDeploy/goods/rest/DAXtC80JSV5oK2xw");
        addModuleDeployURL(1, "goods", "商品管理(vr-goods)", "provider", "http://172.16.36.69:8080/deploy/goods/provider/habjZOqHMFg1425Z", "http://172.16.36.69:8080/produceDeploy/goods/provider/DAXtC80JSV5oK2xw");
        addModuleDeployURL(1, "purchase", "采购管理(vr-purchase)", "rest", "http://172.16.36.69:8080/deploy/purchase/rest/habjZOqHMFg1425Z", "http://172.16.36.69:8080/produceDeploy/purchase/rest/DAXtC80JSV5oK2xw");
        addModuleDeployURL(1, "purchase", "采购管理(vr-purchase)", "provider", "http://172.16.36.69:8080/deploy/purchase/provider/habjZOqHMFg1425Z", "http://172.16.36.69:8080/produceDeploy/purchase/provider/DAXtC80JSV5oK2xw");
        addModuleDeployURL(1, "sale", "零售管理(vr-sale)", "rest", "http://172.16.36.69:8080/deploy/sale/rest/habjZOqHMFg1425Z", "http://172.16.36.69:8080/produceDeploy/sale/rest/DAXtC80JSV5oK2xw");
        addModuleDeployURL(1, "sale", "零售管理(vr-sale)", "provider", "http://172.16.36.69:8080/deploy/sale/provider/habjZOqHMFg1425Z", "http://172.16.36.69:8080/produceDeploy/sale/provider/DAXtC80JSV5oK2xw");
        addModuleDeployURL(1, "supplier", "供应商管理(vr-supplier)", "rest", "http://172.16.36.69:8080/deploy/supplier/rest/habjZOqHMFg1425Z", "http://172.16.36.69:8080/produceDeploy/supplier/rest/DAXtC80JSV5oK2xw");
        addModuleDeployURL(1, "supplier", "供应商管理(vr-supplier)", "provider", "http://172.16.36.69:8080/deploy/supplier/provider/habjZOqHMFg1425Z", "http://172.16.36.69:8080/produceDeploy/supplier/provider/DAXtC80JSV5oK2xw");
        addModuleDeployURL(1, "wholesale", "批发管理(vr-wholesale)", "rest", "http://172.16.36.69:8080/deploy/wholesale/rest/habjZOqHMFg1425Z", "http://172.16.36.69:8080/produceDeploy/wholesale/rest/DAXtC80JSV5oK2xw");
        addModuleDeployURL(1, "wholesale", "批发管理(vr-wholesale)", "provider", "http://172.16.36.69:8080/deploy/wholesale/provider/habjZOqHMFg1425Z", "http://172.16.36.69:8080/produceDeploy/wholesale/provider/DAXtC80JSV5oK2xw");
        addModuleDeployURL(1, "storage", "仓储管理(vr-storage)", "rest", "http://172.16.36.69:8080/deploy/storage/rest/habjZOqHMFg1425Z", "http://172.16.36.69:8080/produceDeploy/storage/rest/DAXtC80JSV5oK2xw");
        addModuleDeployURL(1, "storage", "仓储管理(vr-storage)", "provider", "http://172.16.36.69:8080/deploy/storage/provider/habjZOqHMFg1425Z", "http://172.16.36.69:8080/produceDeploy/storage/provider/DAXtC80JSV5oK2xw");
        addModuleDeployURL(1, "configcenter", "mq配置", "rest", "", "");
        addModuleDeployURL(1, "configcenter", "mq配置", "provider", "", "");
        addModuleDeployURL(1, "maintenancemgt", "维保", "rest", "", "");
        addModuleDeployURL(1, "maintenancemgt", "维保", "provider", "", "");


        //2:宁家
        addModuleDeployURL(2, "system", "系统管理(vr-wnnj-system)", "rest", "http://172.16.36.69:8081/deploy/vr-wnnj/system/rest/v1.0.0/30917/8000/test/172.16.44.16/172.16.44.16", "");
        addModuleDeployURL(2, "system", "系统管理(vr-wnnj-system)", "provider", "http://172.16.36.69:8081/deploy/vr-wnnj/system/provider/v1.0.0/20917/20917/test/172.16.44.16/host", "");
        addModuleDeployURL(2, "base", "基础资源(vr-wnnj-base)", "rest", "http://172.16.36.69:8081/deploy/vr-wnnj/base/rest/v1.0.0/40881/8103/test/172.16.44.16/172.16.44.16", "");
        addModuleDeployURL(2, "base", "基础资源(vr-wnnj-base)", "provider", "http://172.16.36.69:8081/deploy/vr-wnnj/base/provider/v1.0.0/20881/20881/test/172.16.44.16/host", "");
        addModuleDeployURL(2, "contract", "合同管理(vr-wnnj-contract)", "rest", "http://172.16.36.69:8081/deploy/vr-wnnj/contract/rest/v1.0.0/40882/8112/test/172.16.44.16/172.16.44.16", "");
        addModuleDeployURL(2, "contract", "合同管理(vr-wnnj-contract)", "provider", "http://172.16.36.69:8081/deploy/vr-wnnj/contract/provider/v1.0.0/20882/20882/test/172.16.44.16/host", "");
        addModuleDeployURL(2, "finance", "财务管理(vr-wnnj-finance)", "rest", "http://172.16.36.69:8081/deploy/vr-wnnj/finance/rest/v1.0.0/40883/8110/test/172.16.44.16/172.16.44.16", "");
        addModuleDeployURL(2, "finance", "财务管理(vr-wnnj-finance)", "provider", "http://172.16.36.69:8081/deploy/vr-wnnj/finance/provider/v1.0.0/20883/20883/test/172.16.44.16/host", "");
        addModuleDeployURL(2, "reportform", "报表管理(vr-wnnj-reportform)", "rest", "http://172.16.36.69:8081/deploy/vr-wnnj/reportform/rest/v1.0.0/40886/8129/test/172.16.44.16/172.16.44.16", "");
        addModuleDeployURL(2, "reportform", "报表管理(vr-wnnj-reportform)", "provider", "http://172.16.36.69:8081/deploy/vr-wnnj/reportform/provider/v1.0.0/20886/20886/test/172.16.44.16/host", "");
        addModuleDeployURL(2, "goods", "商品管理(vr-wnnj-goods)", "rest", "http://172.16.36.69:8081/deploy/vr-wnnj/goods/rest/v1.0.0/40884/8104/test/172.16.44.16/172.16.44.16", "");
        addModuleDeployURL(2, "goods", "商品管理(vr-wnnj-goods)", "provider", "http://172.16.36.69:8081/deploy/vr-wnnj/goods/provider/v1.0.0/20884/20884/test/172.16.44.16/host", "");
        addModuleDeployURL(2, "purchase", "采购管理(vr-wnnj-purchase)", "rest", "http://172.16.36.69:8081/deploy/vr-wnnj/purchase/rest/v1.0.0/40885/8106/test/172.16.44.16/172.16.44.16", "");
        addModuleDeployURL(2, "purchase", "采购管理(vr-wnnj-purchase)", "provider", "http://172.16.36.69:8081/deploy/vr-wnnj/purchase/provider/v1.0.0/20885/20885/test/172.16.44.16/host", "");
        addModuleDeployURL(2, "sale", "零售管理(vr-wnnj-sale)", "rest", "http://172.16.36.69:8081/deploy/vr-wnnj/sale/rest/v1.0.0/40887/8107/test/172.16.44.16/172.16.44.16", "");
        addModuleDeployURL(2, "sale", "零售管理(vr-wnnj-sale)", "provider", "http://172.16.36.69:8081/deploy/vr-wnnj/sale/provider/v1.0.0/20887/20887/test/172.16.44.16/host", "");
        addModuleDeployURL(2, "supplier", "供应商管理(vr-wnnj-supplier)", "rest", "http://172.16.36.69:8081/deploy/vr-wnnj/supplier/rest/v1.0.0/40889/8125/test/172.16.44.16/172.16.44.16", "");
        addModuleDeployURL(2, "supplier", "供应商管理(vr-wnnj-supplier)", "provider", "http://172.16.36.69:8081/deploy/vr-wnnj/supplier/provider/v1.0.0/20889/20889/test/172.16.44.16/host", "");
        addModuleDeployURL(2, "kitchen", "后厨管理(vr-wnnj-kitchen)", "rest", "http://172.16.36.69:8081/deploy/vr-wnnj/kitchen/rest/v1.0.0/40894/8116/test/172.16.44.16/172.16.44.16", "");
        addModuleDeployURL(2, "kitchen", "后厨管理(vr-wnnj-kitchen)", "provider", "http://172.16.36.69:8081/deploy/vr-wnnj/kitchen/provider/v1.0.0/20894/20894/test/172.16.44.16/host", "");
        addModuleDeployURL(2, "market", "市场营销(vr-wnnj-market)", "rest", "http://172.16.36.69:8081/deploy/njxs/market/rest/v1.0.0/40895/8120/test/172.16.36.71/172.16.44.16", "");
        addModuleDeployURL(2, "market", "市场营销(vr-wnnj-market)", "provider", "http://172.16.36.69:8081/deploy/njxs/market/provider/v1.0.0/20895/20895/test/172.16.36.68/172.16.44.16", "");
//        addModuleDeployURL(2, "wholesale", "批发管理(vr-wnnj-wholesale)", "rest", "http://172.16.36.69:8081/deploy/vr-wnnj/wholesale/rest/v1.0.0/40891/8111/test/172.16.44.16/172.16.44.16", "");
//        addModuleDeployURL(2, "wholesale", "批发管理(vr-wnnj-wholesale)", "provider", "http://172.16.36.69:8081/deploy/vr-wnnj/wholesale/provider/v1.0.0/20891/20891/test/172.16.44.16/host", "");
        addModuleDeployURL(2, "wholesale", "批发管理(vr-wnnj-wholesale)", "rest", "http://172.16.36.69:8081/deploy/vr-wnnj/wholesale/rest/v1.0.0/40890/8108/test/172.16.44.16/172.16.44.16", "");
        addModuleDeployURL(2, "wholesale", "批发管理(vr-wnnj-wholesale)", "provider", "http://172.16.36.69:8081/deploy/vr-wnnj/wholesale/provider/v1.0.0/20890/20890/test/172.16.44.16/host", "");
        addModuleDeployURL(2, "storage", "仓储管理(vr-wnnj-storage)", "rest", "http://172.16.36.69:8081/deploy/vr-wnnj/storage/rest/v1.0.0/40891/8111/test/172.16.44.16/172.16.44.16", "");
        addModuleDeployURL(2, "storage", "仓储管理(vr-wnnj-storage)", "provider", "http://172.16.36.69:8081/deploy/vr-wnnj/storage/provider/v1.0.0/20891/20891/test/172.16.44.16/host", "");
        addModuleDeployURL(2, "configcenter", "mq配置", "rest", "", "");
        addModuleDeployURL(2, "configcenter", "mq配置", "provider", "", "");


        //3:大宗交易
        addModuleDeployURL(3, "bkcontract", "大宗交易合同管理(vr-bulkstock-contract)", "rest", "http://172.16.36.69:8081/deploy/vr-bulkstock/contract/rest/v1.0.0/35001/35001/test/172.16.36.71/172.16.44.18", "");
        addModuleDeployURL(3, "bkcontract", "大宗交易合同管理(vr-bulkstock-contract)", "provider", "http://172.16.36.69:8081/deploy/vr-bulkstock/contract/provider/v1.0.0/25001/25001/test/172.16.36.68/172.16.44.18", "");
        addModuleDeployURL(3, "bkfinance", "大宗交易财务管理(vr-bulkstock-finance)", "rest", "http://172.16.36.69:8081/deploy/vr-bulkstock/finance/rest/v1.0.0/35008/35008/test/172.16.36.71/172.16.44.18", "");
        addModuleDeployURL(3, "bkfinance", "大宗交易财务管理(vr-bulkstock-finance)", "provider", "http://172.16.36.69:8081/deploy/vr-bulkstock/finance/provider/v1.0.0/25008/25008/test/172.16.36.68/172.16.44.18", "");
        addModuleDeployURL(3, "bksale", "大宗交易零售管理(vr-bulkstock-sale)", "rest", "http://172.16.36.69:8081/deploy/vr-bulkstock/sale/rest/v1.0.0/35005/35005/test/172.16.36.71/172.16.44.18", "");
        addModuleDeployURL(3, "bksale", "大宗交易零售管理(vr-bulkstock-sale)", "provider", "http://172.16.36.69:8081/deploy/vr-bulkstock/sale/provider/v1.0.0/25005/25005/test/172.16.36.68/172.16.44.18", "");
        addModuleDeployURL(3, "bksettlement", "大宗交易结算管理(vr-bulkstock-settlement)", "rest", "http://172.16.36.69:8081/deploy/vr-bulkstock/settlement/rest/v1.0.0/35009/35009/test/172.16.36.71/172.16.44.18", "");
        addModuleDeployURL(3, "bksettlement", "大宗交易结算管理(vr-bulkstock-settlement)", "provider", "http://172.16.36.69:8081/deploy/vr-bulkstock/settlement/provider/v1.0.0/25009/25009/test/172.16.36.68/172.16.44.18", "");
        addModuleDeployURL(3, "bktender", "大宗交易招投标管理(vr-bulkstock-tender)", "rest", "http://172.16.36.69:8081/deploy/vr-bulkstock/tender/rest/v1.0.0/35004/35004/test/172.16.36.71/172.16.44.18", "");
        addModuleDeployURL(3, "bktender", "大宗交易招投标管理(vr-bulkstock-tender)", "provider", "http://172.16.36.69:8081/deploy/vr-bulkstock/tender/provider/v1.0.0/25004/25004/test/172.16.36.68/172.16.44.18", "");
        addModuleDeployURL(3, "bktransportmanage", "大宗交易运输管理(vr-bulkstock-transportmanage)", "rest", "http://172.16.36.69:8081/deploy/vr-bulkstock/transportmanage/rest/v1.0.0/35011/35011/test/172.16.36.71/172.16.44.18", "");
        addModuleDeployURL(3, "bktransportmanage", "大宗交易运输管理(vr-bulkstock-transportmanage)", "provider", "http://172.16.36.69:8081/deploy/vr-bulkstock/transportmanage/provider/v1.0.0/25011/25011/test/172.16.36.68/172.16.44.18", "");
        addModuleDeployURL(3, "bkstorage", "大宗交易仓储管理(vr-bulkstock-storage)", "rest", "http://172.16.36.69:8081/deploy/vr-bulkstock/storage/rest/v1.0.0/35012/35012/test/172.16.36.71/172.16.44.18", "");
        addModuleDeployURL(3, "bkstorage", "大宗交易仓储管理(vr-bulkstock-storage)", "provider", "http://172.16.36.69:8081/deploy/vr-bulkstock/storage/provider/v1.0.0/25012/25012/test/172.16.36.68/172.16.44.18", "");
        addModuleDeployURL(3, "bkreportform", "大宗交易报表管理(vr-bulkstock-reportform)", "rest", "http://172.16.36.69:8081/deploy/vr-bulkstock/reportform/rest/v1.0.0/35013/35013/test/172.16.36.71/172.16.44.18", "");
        addModuleDeployURL(3, "bkreportform", "大宗交易报表管理(vr-bulkstock-reportform)", "provider", "http://172.16.36.69:8081/deploy/vr-bulkstock/reportform/provider/v1.0.0/25013/25013/test/172.16.36.68/172.16.44.18", "");

        addModuleDeployURL(3, "system", "系统管理(vr-bulkstock-system)", "rest", "http://172.16.36.69:8081/deploy/vr-bulkstock/system/rest/v1.0.0/30917/8000/test/172.16.53.8/172.16.44.18", "");
        addModuleDeployURL(3, "system", "系统管理(vr-bulkstock-system)", "provider", "http://172.16.36.69:8081/deploy/vr-bulkstock/system/provider/v1.0.0/20917/20917/test/172.16.53.8/host", "");
        addModuleDeployURL(3, "base", "基础资源(vr-bulkstock-base)", "rest", "http://172.16.36.69:8081/deploy/vr-bulkstock/base/rest/v1.0.0/40881/8103/test/172.16.53.8/172.16.44.18", "");
        addModuleDeployURL(3, "base", "基础资源(vr-bulkstock-base)", "provider", "http://172.16.36.69:8081/deploy/vr-bulkstock/base/provider/v1.0.0/20881/20881/test/172.16.53.8/host", "");
        addModuleDeployURL(3, "contract", "合同管理(vr-bk-common-contract)", "rest", "http://172.16.36.69:8081/deploy/vr-bk-common/contract/rest/v1.0.0/40882/8112/test/172.16.53.8/172.16.44.18", "");
        addModuleDeployURL(3, "contract", "合同管理(vr-bk-common-contract)", "provider", "http://172.16.36.69:8081/deploy/vr-bk-common/contract/provider/v1.0.0/20882/20882/test/172.16.53.8/host", "");
        addModuleDeployURL(3, "finance", "财务管理(vr-bk-common-finance)", "rest", "http://172.16.36.69:8081/deploy/vr-bk-common/finance/rest/v1.0.0/40883/8110/test/172.16.53.8/172.16.44.18", "");
        addModuleDeployURL(3, "finance", "财务管理(vr-bk-common-finance)", "provider", "http://172.16.36.69:8081/deploy/vr-bk-common/finance/provider/v1.0.0/20883/20883/test/172.16.53.8/host", "");
        addModuleDeployURL(3, "goods", "商品管理(vr-bk-common-goods)", "rest", "http://172.16.36.69:8081/deploy/vr-bk-common/goods/rest/v1.0.0/40884/8104/test/172.16.53.8/172.16.44.18", "");
        addModuleDeployURL(3, "goods", "商品管理(vr-bk-common-goods)", "provider", "http://172.16.36.69:8081/deploy/vr-bk-common/goods/provider/v1.0.0/20884/20884/test/172.16.53.8/host", "");
        addModuleDeployURL(3, "purchase", "采购管理(vr-bk-common-purchase)", "rest", "http://172.16.36.69:8081/deploy/vr-bk-common/purchase/rest/v1.0.0/40885/8106/test/172.16.53.8/172.16.44.18", "");
        addModuleDeployURL(3, "purchase", "采购管理(vr-bk-common-purchase)", "provider", "http://172.16.36.69:8081/deploy/vr-bk-common/purchase/provider/v1.0.0/20885/20885/test/172.16.53.8/host", "");
        addModuleDeployURL(3, "sale", "零售管理(vr-bk-common-sale)", "rest", "http://172.16.36.69:8081/deploy/vr-bk-common/sale/rest/v1.0.0/40887/8107/test/172.16.53.8/172.16.44.18", "");
        addModuleDeployURL(3, "sale", "零售管理(vr-bk-common-sale)", "provider", "http://172.16.36.69:8081/deploy/vr-bk-common/sale/provider/v1.0.0/20887/20887/test/172.16.53.8/host", "");
        addModuleDeployURL(3, "storage", "仓储管理(vr-bk-common-storage)", "rest", "http://172.16.36.69:8081/deploy/vr-bk-common/storage/rest/v1.0.0/40891/8111/test/172.16.53.8/172.16.44.18", "");
        addModuleDeployURL(3, "storage", "仓储管理(vr-bk-common-storage)", "provider", "http://172.16.36.69:8081/deploy/vr-bk-common/storage/provider/v1.0.0/20891/20891/test/172.16.53.8/host", "");
        addModuleDeployURL(3, "supplier", "供应商管理(vr-bk-common-supplier)", "rest", "http://172.16.36.69:8081/deploy/vr-bk-common/supplier/rest/v1.0.0/40889/8125/test/172.16.53.8/172.16.44.18", "");
        addModuleDeployURL(3, "supplier", "供应商管理(vr-bk-common-supplier)", "provider", "http://172.16.36.69:8081/deploy/vr-bk-common/supplier/provider/v1.0.0/20889/20889/test/172.16.53.8/host", "");
        addModuleDeployURL(3, "configcenter", "mq配置", "rest", "", "");
        addModuleDeployURL(3, "configcenter", "mq配置", "provider", "", "");


        //4:翌捷
        addModuleDeployURL(4, "system", "系统管理(supplychain-common-system)", "rest", "", "");
        addModuleDeployURL(4, "system", "系统管理(supplychain-common-system)", "provider", "", "");
        addModuleDeployURL(4, "base", "基础资源(supplychain-common-base)", "rest", "", "");
        addModuleDeployURL(4, "base", "基础资源(supplychain-common-base)", "provider", "", "");
        addModuleDeployURL(4, "contract", "合同管理(supplychain-common-contract)", "rest", "", "");
        addModuleDeployURL(4, "contract", "合同管理(supplychain-common-contract)", "provider", "", "");
        addModuleDeployURL(4, "finance", "财务管理(supplychain-common-finance)", "rest", "", "");
        addModuleDeployURL(4, "finance", "财务管理(supplychain-common-finance)", "provider", "", "");
        addModuleDeployURL(4, "reportform", "报表管理(supplychain-common-reportform)", "rest", "", "");
        addModuleDeployURL(4, "reportform", "报表管理(supplychain-common-reportform)", "provider", "", "");
        addModuleDeployURL(4, "goods", "商品管理(supplychain-common-goods)", "rest", "", "");
        addModuleDeployURL(4, "goods", "商品管理(supplychain-common-goods)", "provider", "", "");
        addModuleDeployURL(4, "purchase", "采购管理(supplychain-common-purchase)", "rest", "", "");
        addModuleDeployURL(4, "purchase", "采购管理(supplychain-common-purchase)", "provider", "", "");
        addModuleDeployURL(4, "sale", "零售管理(supplychain-common-sale)", "rest", "", "");
        addModuleDeployURL(4, "sale", "零售管理(supplychain-common-sale)", "provider", "", "");
        addModuleDeployURL(4, "supplier", "供应商管理(supplychain-common-supplier)", "rest", "", "");
        addModuleDeployURL(4, "supplier", "供应商管理(supplychain-common-supplier)", "provider", "", "");
        addModuleDeployURL(4, "kitchen", "后厨管理(supplychain-common-kitchen)", "rest", "", "");
        addModuleDeployURL(4, "kitchen", "后厨管理(supplychain-common-kitchen)", "provider", "", "");
        addModuleDeployURL(4, "wholesale", "批发管理(supplychain-common-wholesale)", "rest", "", "");
        addModuleDeployURL(4, "wholesale", "批发管理(supplychain-common-wholesale)", "provider", "", "");
        addModuleDeployURL(4, "storage", "仓储管理(supplychain-common-storage)", "rest", "", "");
        addModuleDeployURL(4, "storage", "仓储管理(supplychain-common-storage)", "provider", "", "");
        addModuleDeployURL(4, "configcenter", "mq配置", "rest", "", "");
        addModuleDeployURL(4, "configcenter", "mq配置", "provider", "", "");


        //5:翌超
        addModuleDeployURL(5, "system", "系统管理(yichao-common-system)", "rest", "", "");
        addModuleDeployURL(5, "system", "系统管理(yichao-common-system)", "provider", "", "");
        addModuleDeployURL(5, "base", "基础资源(yichao-common-base)", "rest", "", "");
        addModuleDeployURL(5, "base", "基础资源(yichao-common-base)", "provider", "", "");
        addModuleDeployURL(5, "contract", "合同管理(yichao-common-contract)", "rest", "", "");
        addModuleDeployURL(5, "contract", "合同管理(yichao-common-contract)", "provider", "", "");
        addModuleDeployURL(5, "finance", "财务管理(yichao-common-finance)", "rest", "", "");
        addModuleDeployURL(5, "finance", "财务管理(yichao-common-finance)", "provider", "", "");
        addModuleDeployURL(5, "reportform", "报表管理(yichao-common-reportform)", "rest", "", "");
        addModuleDeployURL(5, "reportform", "报表管理(yichao-common-reportform)", "provider", "", "");
        addModuleDeployURL(5, "goods", "商品管理(yichao-common-goods)", "rest", "", "");
        addModuleDeployURL(5, "goods", "商品管理(yichao-common-goods)", "provider", "", "");
        addModuleDeployURL(5, "purchase", "采购管理(yichao-common-purchase)", "rest", "", "");
        addModuleDeployURL(5, "purchase", "采购管理(yichao-common-purchase)", "provider", "", "");
        addModuleDeployURL(5, "sale", "零售管理(yichao-common-sale)", "rest", "", "");
        addModuleDeployURL(5, "sale", "零售管理(yichao-common-sale)", "provider", "", "");
        addModuleDeployURL(5, "supplier", "供应商管理(yichao-common-supplier)", "rest", "", "");
        addModuleDeployURL(5, "supplier", "供应商管理(yichao-common-supplier)", "provider", "", "");
        addModuleDeployURL(5, "kitchen", "后厨管理(yichao-common-kitchen)", "rest", "", "");
        addModuleDeployURL(5, "kitchen", "后厨管理(yichao-common-kitchen)", "provider", "", "");
        addModuleDeployURL(5, "wholesale", "批发管理(yichao-common-wholesale)", "rest", "", "");
        addModuleDeployURL(5, "wholesale", "批发管理(yichao-common-wholesale)", "provider", "", "");
        addModuleDeployURL(5, "storage", "仓储管理(yichao-common-storage)", "rest", "", "");
        addModuleDeployURL(5, "storage", "仓储管理(yichao-common-storage)", "provider", "", "");
        addModuleDeployURL(5, "configcenter", "mq配置", "rest", "", "");
        addModuleDeployURL(5, "configcenter", "mq配置", "provider", "", "");

        //6:翌超分销商城
        addModuleDeployURL(6, "distributionmall", "分销商城(yichao-distributionmall)", "rest", "", "");
        addModuleDeployURL(6, "distributionmall", "分销商城(yichao-distributionmall)", "provider", "", "");
        //addModuleDeployURL(6, "configcenter", "mq配置", "rest", "", "");
        //addModuleDeployURL(6, "configcenter", "mq配置", "provider", "", "");



        //7:翌湾
        addModuleDeployURL(7, "system", "系统管理(yiwan-common-system)", "rest", "", "");
        addModuleDeployURL(7, "system", "系统管理(yiwan-common-system)", "provider", "", "");
        addModuleDeployURL(7, "base", "基础资源(yiwan-common-base)", "rest", "", "");
        addModuleDeployURL(7, "base", "基础资源(yiwan-common-base)", "provider", "", "");
        addModuleDeployURL(7, "contract", "合同管理(yiwan-common-contract)", "rest", "", "");
        addModuleDeployURL(7, "contract", "合同管理(yiwan-common-contract)", "provider", "", "");
        addModuleDeployURL(7, "finance", "财务管理(yiwan-common-finance)", "rest", "", "");
        addModuleDeployURL(7, "finance", "财务管理(yiwan-common-finance)", "provider", "", "");
        addModuleDeployURL(7, "reportform", "报表管理(yiwan-common-reportform)", "rest", "", "");
        addModuleDeployURL(7, "reportform", "报表管理(yiwan-common-reportform)", "provider", "", "");
        addModuleDeployURL(7, "goods", "商品管理(yiwan-common-goods)", "rest", "", "");
        addModuleDeployURL(7, "goods", "商品管理(yiwan-common-goods)", "provider", "", "");
        addModuleDeployURL(7, "purchase", "采购管理(yiwan-common-purchase)", "rest", "", "");
        addModuleDeployURL(7, "purchase", "采购管理(yiwan-common-purchase)", "provider", "", "");
        addModuleDeployURL(7, "sale", "零售管理(yiwan-common-sale)", "rest", "", "");
        addModuleDeployURL(7, "sale", "零售管理(yiwan-common-sale)", "provider", "", "");
        addModuleDeployURL(7, "supplier", "供应商管理(yiwan-common-supplier)", "rest", "", "");
        addModuleDeployURL(7, "supplier", "供应商管理(yiwan-common-supplier)", "provider", "", "");
        addModuleDeployURL(7, "kitchen", "后厨管理(yiwan-common-kitchen)", "rest", "", "");
        addModuleDeployURL(7, "kitchen", "后厨管理(yiwan-common-kitchen)", "provider", "", "");
        addModuleDeployURL(7, "wholesale", "批发管理(yiwan-common-wholesale)", "rest", "", "");
        addModuleDeployURL(7, "wholesale", "批发管理(yiwan-common-wholesale)", "provider", "", "");
        addModuleDeployURL(7, "storage", "仓储管理(yiwan-common-storage)", "rest", "", "");
        addModuleDeployURL(7, "storage", "仓储管理(yiwan-common-storage)", "provider", "", "");
        addModuleDeployURL(7, "configcenter", "mq配置", "rest", "", "");
        addModuleDeployURL(7, "configcenter", "mq配置", "provider", "", "");
        addModuleDeployURL(7, "distributionmall", "商城(yiwan-distributionmall)", "rest", "", "");
        addModuleDeployURL(7, "distributionmall", "商城(yiwan-distributionmall)", "provider", "", "");



        /**********配置模块发布的URL (end) **************************************************/

        /**********配置测试环境的日志URL (begin) **************************************************/
        //1:翌能
        addTestLogURL(1, "system", "系统管理", "rest", "http://172.16.36.69:8080/tlogs/system/rest", "http://172.16.36.69:8080/tslogs/system/rest", "http://172.16.36.69:8080/tstatus/system/rest");
        addTestLogURL(1, "system", "系统管理", "provider", "http://172.16.36.69:8080/tlogs/system/provider", "http://172.16.36.69:8080/tslogs/system/provider", "http://172.16.36.69:8080/tstatus/system/provider");
        addTestLogURL(1, "base", "基础资源", "rest", "http://172.16.36.69:8080/tlogs/base/rest", "http://172.16.36.69:8080/tslogs/base/rest", "http://172.16.36.69:8080/tstatus/base/rest");
        addTestLogURL(1, "base", "基础资源", "provider", "http://172.16.36.69:8080/tlogs/base/provider", "http://172.16.36.69:8080/tslogs/base/provider", "http://172.16.36.69:8080/tstatus/base/provider");
        addTestLogURL(1, "contract", "合同管理", "rest", "http://172.16.36.69:8080/tlogs/contract/rest", "http://172.16.36.69:8080/tslogs/contract/rest", "http://172.16.36.69:8080/tstatus/contract/rest");
        addTestLogURL(1, "contract", "合同管理", "provider", "http://172.16.36.69:8080/tlogs/contract/provider", "http://172.16.36.69:8080/tslogs/contract/provider", "http://172.16.36.69:8080/tstatus/contract/provider");
        addTestLogURL(1, "finance", "财务管理", "rest", "http://172.16.36.69:8080/tlogs/finance/rest", "http://172.16.36.69:8080/tslogs/finance/rest", "http://172.16.36.69:8080/tstatus/finance/rest");
        addTestLogURL(1, "finance", "财务管理", "provider", "http://172.16.36.69:8080/tlogs/finance/provider", "http://172.16.36.69:8080/tslogs/finance/provider", "http://172.16.36.69:8080/tstatus/finance/provider");
        addTestLogURL(1, "reportform", "报表管理", "rest", "http://172.16.36.69:8080/tlogs/reportform/rest", "http://172.16.36.69:8080/tslogs/reportform/rest", "http://172.16.36.69:8080/tstatus/reportform/rest");
        addTestLogURL(1, "reportform", "报表管理", "provider", "http://172.16.36.69:8080/tlogs/reportform/provider", "http://172.16.36.69:8080/tslogs/reportform/provider", "http://172.16.36.69:8080/tstatus/reportform/provider");
        addTestLogURL(1, "goods", "商品管理", "rest", "http://172.16.36.69:8080/tlogs/goods/rest", "http://172.16.36.69:8080/tslogs/goods/rest", "http://172.16.36.69:8080/tstatus/goods/rest");
        addTestLogURL(1, "goods", "商品管理", "provider", "http://172.16.36.69:8080/tlogs/goods/provider", "http://172.16.36.69:8080/tslogs/goods/provider", "http://172.16.36.69:8080/tstatus/goods/provider");
        addTestLogURL(1, "purchase", "采购管理", "rest", "http://172.16.36.69:8080/tlogs/purchase/rest", "http://172.16.36.69:8080/tslogs/purchase/rest", "http://172.16.36.69:8080/tstatus/purchase/rest");
        addTestLogURL(1, "purchase", "采购管理", "provider", "http://172.16.36.69:8080/tlogs/purchase/provider", "http://172.16.36.69:8080/tslogs/purchase/provider", "http://172.16.36.69:8080/tstatus/purchase/provider");
        addTestLogURL(1, "sale", "零售管理", "rest", "http://172.16.36.69:8080/tlogs/sale/rest", "http://172.16.36.69:8080/tslogs/sale/rest", "http://172.16.36.69:8080/tstatus/sale/rest");
        addTestLogURL(1, "sale", "零售管理", "provider", "http://172.16.36.69:8080/tlogs/sale/provider", "http://172.16.36.69:8080/tslogs/sale/provider", "http://172.16.36.69:8080/tstatus/sale/provider");
        addTestLogURL(1, "supplier", "供应商管理", "rest", "http://172.16.36.69:8080/tlogs/supplier/rest", "http://172.16.36.69:8080/tslogs/supplier/rest", "http://172.16.36.69:8080/tstatus/supplier/rest");
        addTestLogURL(1, "supplier", "供应商管理", "provider", "http://172.16.36.69:8080/tlogs/supplier/provider", "http://172.16.36.69:8080/tslogs/supplier/provider", "http://172.16.36.69:8080/tstatus/supplier/provider");
        addTestLogURL(1, "wholesale", "批发管理", "rest", "http://172.16.36.69:8080/tlogs/wholesale/rest", "http://172.16.36.69:8080/tslogs/wholesale/rest", "http://172.16.36.69:8080/tstatus/wholesale/rest");
        addTestLogURL(1, "wholesale", "批发管理", "provider", "http://172.16.36.69:8080/tlogs/wholesale/provider", "http://172.16.36.69:8080/tslogs/wholesale/provider", "http://172.16.36.69:8080/tstatus/wholesale/provider");
        addTestLogURL(1, "storage", "仓储管理", "rest", "http://172.16.36.69:8080/tlogs/storage/rest", "http://172.16.36.69:8080/tslogs/storage/rest", "http://172.16.36.69:8080/tstatus/storage/rest");
        addTestLogURL(1, "storage", "仓储管理", "provider", "http://172.16.36.69:8080/tlogs/storage/provider", "http://172.16.36.69:8080/tslogs/storage/provider", "http://172.16.36.69:8080/tstatus/storage/provider");

        //2:宁家
        addTestLogURL(2, "system", "系统管理", "rest", "http://172.16.36.69:8081/logs/vr-wnnj/system/rest/v1.0.0/test/172.16.44.16", "http://172.16.36.69:8081/slogs/vr-wnnj/system/rest/v1.0.0/test/172.16.44.16", "");
        addTestLogURL(2, "system", "系统管理", "provider", "http://172.16.36.69:8081/logs/vr-wnnj/system/provider/v1.0.0/test/172.16.44.16", "http://172.16.36.69:8081/slogs/vr-wnnj/system/provider/v1.0.0/test/172.16.44.16", "");
        addTestLogURL(2, "base", "基础资源", "rest", "http://172.16.36.69:8081/logs/vr-wnnj/base/rest/v1.0.0/test/172.16.44.16", "http://172.16.36.69:8081/slogs/vr-wnnj/base/rest/v1.0.0/test/172.16.44.16", "");
        addTestLogURL(2, "base", "基础资源", "provider", "http://172.16.36.69:8081/logs/vr-wnnj/base/provider/v1.0.0/test/172.16.44.16", "http://172.16.36.69:8081/slogs/vr-wnnj/base/provider/v1.0.0/test/172.16.44.16", "");
        addTestLogURL(2, "contract", "合同管理", "rest", "http://172.16.36.69:8081/logs/vr-wnnj/contract/rest/v1.0.0/test/172.16.44.16", "http://172.16.36.69:8081/slogs/vr-wnnj/contract/rest/v1.0.0/test/172.16.44.16", "");
        addTestLogURL(2, "contract", "合同管理", "provider", "http://172.16.36.69:8081/logs/vr-wnnj/contract/provider/v1.0.0/test/172.16.44.16", "http://172.16.36.69:8081/slogs/vr-wnnj/contract/provider/v1.0.0/test/172.16.44.16", "");
        addTestLogURL(2, "finance", "财务管理", "rest", "http://172.16.36.69:8081/logs/vr-wnnj/finance/rest/v1.0.0/test/172.16.44.16", "http://172.16.36.69:8081/slogs/vr-wnnj/finance/rest/v1.0.0/test/172.16.44.16", "");
        addTestLogURL(2, "finance", "财务管理", "provider", "http://172.16.36.69:8081/logs/vr-wnnj/finance/provider/v1.0.0/test/172.16.44.16", "http://172.16.36.69:8081/slogs/vr-wnnj/finance/provider/v1.0.0/test/172.16.44.16", "");
        addTestLogURL(2, "reportform", "报表管理", "rest", "http://172.16.36.69:8081/logs/vr-wnnj/reportform/rest/v1.0.0/test/172.16.44.16", "http://172.16.36.69:8081/slogs/vr-wnnj/reportform/rest/v1.0.0/test/172.16.44.16", "");
        addTestLogURL(2, "reportform", "报表管理", "provider", "http://172.16.36.69:8081/logs/vr-wnnj/reportform/provider/v1.0.0/test/172.16.44.16", "http://172.16.36.69:8081/slogs/vr-wnnj/reportform/provider/v1.0.0/test/172.16.44.16", "");
        addTestLogURL(2, "goods", "商品管理", "rest", "http://172.16.36.69:8081/logs/vr-wnnj/goods/rest/v1.0.0/test/172.16.44.16", "http://172.16.36.69:8081/slogs/vr-wnnj/goods/rest/v1.0.0/test/172.16.44.16", "");
        addTestLogURL(2, "goods", "商品管理", "provider", "http://172.16.36.69:8081/logs/vr-wnnj/goods/provider/v1.0.0/test/172.16.44.16", "http://172.16.36.69:8081/slogs/vr-wnnj/goods/provider/v1.0.0/test/172.16.44.16", "");
        addTestLogURL(2, "purchase", "采购管理", "rest", "http://172.16.36.69:8081/logs/vr-wnnj/purchase/rest/v1.0.0/test/172.16.44.16", "http://172.16.36.69:8081/slogs/vr-wnnj/purchase/rest/v1.0.0/test/172.16.44.16", "");
        addTestLogURL(2, "purchase", "采购管理", "provider", "http://172.16.36.69:8081/logs/vr-wnnj/purchase/provider/v1.0.0/test/172.16.44.16", "http://172.16.36.69:8081/slogs/vr-wnnj/purchase/provider/v1.0.0/test/172.16.44.16", "");
        addTestLogURL(2, "sale", "零售管理", "rest", "http://172.16.36.69:8081/logs/vr-wnnj/sale/rest/v1.0.0/test/172.16.44.16", "http://172.16.36.69:8081/slogs/vr-wnnj/sale/rest/v1.0.0/test/172.16.44.16", "");
        addTestLogURL(2, "sale", "零售管理", "provider", "http://172.16.36.69:8081/logs/vr-wnnj/sale/provider/v1.0.0/test/172.16.44.16", "http://172.16.36.69:8081/slogs/vr-wnnj/sale/provider/v1.0.0/test/172.16.44.16", "");
        addTestLogURL(2, "supplier", "供应商管理", "rest", "http://172.16.36.69:8081/logs/vr-wnnj/supplier/rest/v1.0.0/test/172.16.44.16", "http://172.16.36.69:8081/slogs/vr-wnnj/supplier/rest/v1.0.0/test/172.16.44.16", "");
        addTestLogURL(2, "supplier", "供应商管理", "provider", "http://172.16.36.69:8081/logs/vr-wnnj/supplier/provider/v1.0.0/test/172.16.44.16", "http://172.16.36.69:8081/slogs/vr-wnnj/supplier/provider/v1.0.0/test/172.16.44.16", "");
        addTestLogURL(2, "kitchen", "后厨管理", "rest", "http://172.16.36.69:8081/logs/vr-wnnj/kitchen/rest/v1.0.0/test/172.16.44.16", "http://172.16.36.69:8081/slogs/vr-wnnj/kitchen/rest/v1.0.0/test/172.16.44.16", "");
        addTestLogURL(2, "kitchen", "后厨管理", "provider", "http://172.16.36.69:8081/logs/vr-wnnj/kitchen/provider/v1.0.0/test/172.16.44.16", "http://172.16.36.69:8081/slogs/vr-wnnj/kitchen/provider/v1.0.0/test/172.16.44.16", "");
        addTestLogURL(2, "market", "市场营销", "rest", "http://172.16.36.69:8081/logs/vr-wnnj/market/rest/v1.0.0/test/172.16.44.16", "http://172.16.36.69:8081/slogs/vr-wnnj/market/rest/v1.0.0/test/172.16.44.16", "");
        addTestLogURL(2, "market", "市场营销", "provider", "http://172.16.36.69:8081/logs/vr-wnnj/market/provider/v1.0.0/test/172.16.44.16", "http://172.16.36.69:8081/slogs/vr-wnnj/market/provider/v1.0.0/test/172.16.44.16", "");
        addTestLogURL(2, "wholesale", "批发管理", "rest", "http://172.16.36.69:8081/logs/vr-wnnj/wholesale/rest/v1.0.0/test/172.16.44.16", "http://172.16.36.69:8081/slogs/vr-wnnj/wholesale/rest/v1.0.0/test/172.16.44.16", "");
        addTestLogURL(2, "wholesale", "批发管理", "provider", "http://172.16.36.69:8081/logs/vr-wnnj/wholesale/provider/v1.0.0/test/172.16.44.16", "http://172.16.36.69:8081/slogs/vr-wnnj/wholesale/provider/v1.0.0/test/172.16.44.16", "");
        addTestLogURL(2, "storage", "仓储管理", "rest", "http://172.16.36.69:8081/logs/vr-wnnj/storage/rest/v1.0.0/test/172.16.44.16", "http://172.16.36.69:8081/slogs/vr-wnnj/storage/rest/v1.0.0/test/172.16.44.16", "");
        addTestLogURL(2, "storage", "仓储管理", "provider", "http://172.16.36.69:8081/logs/vr-wnnj/storage/provider/v1.0.0/test/172.16.44.16", "http://172.16.36.69:8081/slogs/vr-wnnj/storage/provider/v1.0.0/test/172.16.44.16", "");

        //大宗交易
        addTestLogURL(3, "bkcontract", "大宗交易合同管理", "rest", "http://172.16.36.69:8081/logs/vr-bulkstock/contract/rest/v1.0.0/test/172.16.36.71", "http://172.16.36.69:8081/slogs/vr-bulkstock/contract/rest/v1.0.0/test/172.16.36.71", "");
        addTestLogURL(3, "bkcontract", "大宗交易合同管理", "provider", "http://172.16.36.69:8081/logs/vr-bulkstock/contract/provider/v1.0.0/test/172.16.36.68", "http://172.16.36.69:8081/slogs/vr-bulkstock/contract/provider/v1.0.0/test/172.16.36.68", "");
        addTestLogURL(3, "bkfinance", "大宗交易财务管理", "rest", "http://172.16.36.69:8081/logs/vr-bulkstock/finance/rest/v1.0.0/test/172.16.36.71", "http://172.16.36.69:8081/slogs/vr-bulkstock/finance/rest/v1.0.0/test/172.16.36.71", "");
        addTestLogURL(3, "bkfinance", "大宗交易财务管理", "provider", "http://172.16.36.69:8081/logs/vr-bulkstock/finance/provider/v1.0.0/test/172.16.36.68", "http://172.16.36.69:8081/slogs/vr-bulkstock/finance/provider/v1.0.0/test/172.16.36.68", "");
        addTestLogURL(3, "bksale", "大宗交易零售管理", "rest", "http://172.16.36.69:8081/logs/vr-bulkstock/sale/rest/v1.0.0/test/172.16.36.71", "http://172.16.36.69:8081/slogs/vr-bulkstock/sale/rest/v1.0.0/test/172.16.36.71", "");
        addTestLogURL(3, "bksale", "大宗交易零售管理", "provider", "http://172.16.36.69:8081/logs/vr-bulkstock/sale/provider/v1.0.0/test/172.16.36.68", "http://172.16.36.69:8081/slogs/vr-bulkstock/sale/provider/v1.0.0/test/172.16.36.68", "");
        addTestLogURL(3, "bksettlement", "大宗交易结算管理", "rest", "http://172.16.36.69:8081/logs/vr-bulkstock/settlement/rest/v1.0.0/test/172.16.36.71", "http://172.16.36.69:8081/slogs/vr-bulkstock/settlement/rest/v1.0.0/test/172.16.36.71", "");
        addTestLogURL(3, "bksettlement", "大宗交易结算管理", "provider", "http://172.16.36.69:8081/logs/vr-bulkstock/settlement/provider/v1.0.0/test/172.16.36.68", "http://172.16.36.69:8081/slogs/vr-bulkstock/settlement/provider/v1.0.0/test/172.16.36.68", "");
        addTestLogURL(3, "bktender", "大宗交易招投标管理", "rest", "http://172.16.36.69:8081/logs/vr-bulkstock/tender/rest/v1.0.0/test/172.16.36.71", "http://172.16.36.69:8081/slogs/vr-bulkstock/tender/rest/v1.0.0/test/172.16.36.71", "");
        addTestLogURL(3, "bktender", "大宗交易招投标管理", "provider", "http://172.16.36.69:8081/logs/vr-bulkstock/tender/provider/v1.0.0/test/172.16.36.68", "http://172.16.36.69:8081/slogs/vr-bulkstock/tender/provider/v1.0.0/test/172.16.36.68", "");
        addTestLogURL(3, "bktransportmanage", "大宗交易运输管理", "rest", "http://172.16.36.69:8081/logs/vr-bulkstock/transportmanage/rest/v1.0.0/test/172.16.36.71", "http://172.16.36.69:8081/slogs/vr-bulkstock/transportmanage/rest/v1.0.0/test/172.16.36.71", "");
        addTestLogURL(3, "bktransportmanage", "大宗交易运输管理", "provider", "http://172.16.36.69:8081/logs/vr-bulkstock/transportmanage/provider/v1.0.0/test/172.16.36.68", "http://172.16.36.69:8081/slogs/vr-bulkstock/transportmanage/provider/v1.0.0/test/172.16.36.68", "");
        addTestLogURL(3, "bkstorage", "大宗交易仓储管理", "rest", "http://172.16.36.69:8081/logs/vr-bulkstock/storage/rest/v1.0.0/test/172.16.36.71", "http://172.16.36.69:8081/slogs/vr-bulkstock/storage/rest/v1.0.0/test/172.16.36.71", "");
        addTestLogURL(3, "bkstorage", "大宗交易仓储管理", "provider", "http://172.16.36.69:8081/logs/vr-bulkstock/storage/provider/v1.0.0/test/172.16.36.68", "http://172.16.36.69:8081/slogs/vr-bulkstock/storage/provider/v1.0.0/test/172.16.36.68", "");
        addTestLogURL(3, "bkreportform", "大宗交报表模块", "rest", "http://172.16.36.69:8081/logs/vr-bulkstock/reportform/rest/v1.0.0/test/172.16.36.71", "http://172.16.36.69:8081/slogs/vr-bulkstock/reportform/rest/v1.0.0/test/172.16.36.71", "");
        addTestLogURL(3, "bkreportform", "大宗交报表模块", "provider", "http://172.16.36.69:8081/logs/vr-bulkstock/reportform/provider/v1.0.0/test/172.16.36.68", "http://172.16.36.69:8081/slogs/vr-bulkstock/reportform/provider/v1.0.0/test/172.16.36.68", "");

        addTestLogURL(3, "system", "系统管理", "rest", "http://172.16.36.69:8081/logs/vr-bulkstock/system/rest/v1.0.0/test/172.16.53.8", "http://172.16.36.69:8081/slogs/vr-bulkstock/system/rest/v1.0.0/test/172.16.53.8", "");
        addTestLogURL(3, "system", "系统管理", "provider", "http://172.16.36.69:8081/logs/vr-bulkstock/system/provider/v1.0.0/test/172.16.53.8", "http://172.16.36.69:8081/slogs/vr-bulkstock/system/provider/v1.0.0/test/172.16.53.8", "");
        addTestLogURL(3, "base", "基础资源", "rest", "http://172.16.36.69:8081/logs/vr-bulkstock/base/rest/v1.0.0/test/172.16.53.8", "http://172.16.36.69:8081/slogs/vr-bulkstock/base/rest/v1.0.0/test/172.16.53.8", "");
        addTestLogURL(3, "base", "基础资源", "provider", "http://172.16.36.69:8081/logs/vr-bulkstock/base/provider/v1.0.0/test/172.16.53.8", "http://172.16.36.69:8081/slogs/vr-bulkstock/base/provider/v1.0.0/test/172.16.53.8", "");
        addTestLogURL(3, "contract", "合同管理", "rest", "http://172.16.36.69:8081/logs/vr-bk-common/contract/rest/v1.0.0/test/172.16.53.8", "http://172.16.36.69:8081/slogs/vr-bk-common/contract/rest/v1.0.0/test/172.16.53.8", "");
        addTestLogURL(3, "contract", "合同管理", "provider", "http://172.16.36.69:8081/logs/vr-bk-common/contract/provider/v1.0.0/test/172.16.53.8", "http://172.16.36.69:8081/slogs/vr-bk-common/contract/provider/v1.0.0/test/172.16.53.8", "");
        addTestLogURL(3, "finance", "财务管理", "rest", "http://172.16.36.69:8081/logs/vr-bk-common/finance/rest/v1.0.0/test/172.16.53.8", "http://172.16.36.69:8081/slogs/vr-bk-common/finance/rest/v1.0.0/test/172.16.53.8", "");
        addTestLogURL(3, "finance", "财务管理", "provider", "http://172.16.36.69:8081/logs/vr-bk-common/finance/provider/v1.0.0/test/172.16.53.8", "http://172.16.36.69:8081/slogs/vr-bk-common/finance/provider/v1.0.0/test/172.16.53.8", "");
        addTestLogURL(3, "goods", "商品管理", "rest", "http://172.16.36.69:8081/logs/vr-bk-common/goods/rest/v1.0.0/test/172.16.53.8", "http://172.16.36.69:8081/slogs/vr-bk-common/goods/rest/v1.0.0/test/172.16.53.8", "");
        addTestLogURL(3, "goods", "商品管理", "provider", "http://172.16.36.69:8081/logs/vr-bk-common/goods/provider/v1.0.0/test/172.16.53.8", "http://172.16.36.69:8081/slogs/vr-bk-common/goods/provider/v1.0.0/test/172.16.53.8", "");
        addTestLogURL(3, "purchase", "采购管理", "rest", "http://172.16.36.69:8081/logs/vr-bk-common/purchase/rest/v1.0.0/test/172.16.53.8", "http://172.16.36.69:8081/slogs/vr-bk-common/purchase/rest/v1.0.0/test/172.16.53.8", "");
        addTestLogURL(3, "purchase", "采购管理", "provider", "http://172.16.36.69:8081/logs/vr-bk-common/purchase/provider/v1.0.0/test/172.16.53.8", "http://172.16.36.69:8081/slogs/vr-bk-common/purchase/provider/v1.0.0/test/172.16.53.8", "");
        addTestLogURL(3, "sale", "零售管理", "rest", "http://172.16.36.69:8081/logs/vr-bk-common/sale/rest/v1.0.0/test/172.16.53.8", "http://172.16.36.69:8081/slogs/vr-bk-common/sale/rest/v1.0.0/test/172.16.53.8", "");
        addTestLogURL(3, "sale", "零售管理", "provider", "http://172.16.36.69:8081/logs/vr-bk-common/sale/provider/v1.0.0/test/172.16.53.8", "http://172.16.36.69:8081/slogs/vr-bk-common/sale/provider/v1.0.0/test/172.16.53.8", "");
        addTestLogURL(3, "supplier", "供应商管理", "rest", "http://172.16.36.69:8081/logs/vr-bk-common/supplier/rest/v1.0.0/test/172.16.53.8", "http://172.16.36.69:8081/slogs/vr-bk-common/supplier/rest/v1.0.0/test/172.16.53.8", "");
        addTestLogURL(3, "supplier", "供应商管理", "provider", "http://172.16.36.69:8081/logs/vr-bk-common/supplier/provider/v1.0.0/test/172.16.53.8", "http://172.16.36.69:8081/slogs/vr-bk-common/supplier/provider/v1.0.0/test/172.16.53.8", "");
        addTestLogURL(3, "storage", "仓储管理", "rest", "http://172.16.36.69:8081/logs/vr-bk-common/storage/rest/v1.0.0/test/172.16.53.8", "http://172.16.36.69:8081/slogs/vr-bk-common/storage/rest/v1.0.0/test/172.16.53.8", "");
        addTestLogURL(3, "storage", "仓储管理", "provider", "http://172.16.36.69:8081/logs/vr-bk-common/storage/provider/v1.0.0/test/172.16.53.8", "http://172.16.36.69:8081/slogs/vr-bk-common/storage/provider/v1.0.0/test/172.16.53.8", "");
        /**********配置测试环境的日志URL (end) **************************************************/

        /**********配置生产环境的日志URL (begin) **************************************************/
        //1:翌能
        addProductLogURL(1, "system", "系统管理", "rest", "http://172.16.36.69:8081/logs/common/system/rest/v1.0.0/produce/172.16.41.11,172.16.41.12", "http://172.16.36.69:8081/slogs/common/system/rest/v1.0.0/produce/172.16.41.11,172.16.41.12", "");
        addProductLogURL(1, "system", "系统管理", "provider", "http://172.16.36.69:8081/logs/common/system/provider/v1.0.0/produce/172.16.41.16,172.16.41.18", "http://172.16.36.69:8081/slogs/common/system/provider/v1.0.0/produce/172.16.41.16,172.16.41.18", "");
        addProductLogURL(1, "base", "基础资源", "rest", "http://172.16.36.69:8081/logs/common/base/rest/v1.0.0/produce/172.16.41.11,172.16.41.12", "http://172.16.36.69:8081/slogs/common/base/rest/v1.0.0/produce/172.16.41.11,172.16.41.12", "");
        addProductLogURL(1, "base", "基础资源", "provider", "http://172.16.36.69:8081/logs/common/base/provider/v1.0.0/produce/172.16.41.16,172.16.41.18", "http://172.16.36.69:8081/slogs/common/base/provider/v1.0.0/produce/172.16.41.16,172.16.41.18", "");
        addProductLogURL(1, "contract", "合同管理", "rest", "http://172.16.36.69:8081/logs/finance/contract/rest/v1.0.0/produce/172.16.41.11,172.16.41.12", "http://172.16.36.69:8081/slogs/finance/contract/rest/v1.0.0/produce/172.16.41.11,172.16.41.12", "");
        addProductLogURL(1, "contract", "合同管理", "provider", "http://172.16.36.69:8081/logs/finance/contract/provider/v1.0.0/produce/172.16.41.16,172.16.41.18", "http://172.16.36.69:8081/slogs/finance/contract/provider/v1.0.0/produce/172.16.41.16,172.16.41.18", "");
        addProductLogURL(1, "finance", "财务管理", "rest", "http://172.16.36.69:8081/logs/finance/finance/rest/v1.0.0/produce/172.16.41.11,172.16.41.12", "http://172.16.36.69:8081/slogs/finance/finance/rest/v1.0.0/produce/172.16.41.11,172.16.41.12", "");
        addProductLogURL(1, "finance", "财务管理", "provider", "http://172.16.36.69:8081/logs/finance/finance/provider/v1.0.0/produce/172.16.41.16,172.16.41.18", "http://172.16.36.69:8081/slogs/finance/finance/provider/v1.0.0/produce/172.16.41.16,172.16.41.18", "");
        addProductLogURL(1, "reportform", "报表管理", "rest", "http://172.16.36.69:8081/logs/finance/reportform/rest/v1.0.0/produce/172.16.41.11,172.16.41.12", "http://172.16.36.69:8081/slogs/finance/reportform/rest/v1.0.0/produce/172.16.41.11,172.16.41.12", "");
        addProductLogURL(1, "reportform", "报表管理", "provider", "http://172.16.36.69:8081/logs/finance/reportform/provider/v1.0.0/produce/172.16.41.16,172.16.41.18", "http://172.16.36.69:8081/slogs/finance/reportform/provider/v1.0.0/produce/172.16.41.16,172.16.41.18", "");
        addProductLogURL(1, "goods", "商品管理", "rest", "http://172.16.36.69:8081/logs/market/goods/rest/v1.0.0/produce/172.16.41.11,172.16.41.12", "http://172.16.36.69:8081/slogs/market/goods/rest/v1.0.0/produce/172.16.41.11,172.16.41.12", "");
        addProductLogURL(1, "goods", "商品管理", "provider", "http://172.16.36.69:8081/logs/market/goods/provider/v1.0.0/produce/172.16.41.16,172.16.41.18", "http://172.16.36.69:8081/slogs/market/goods/provider/v1.0.0/produce/172.16.41.16,172.16.41.18", "");
        addProductLogURL(1, "purchase", "采购管理", "rest", "http://172.16.36.69:8081/logs/market/purchase/rest/v1.0.0/produce/172.16.41.11,172.16.41.12", "http://172.16.36.69:8081/slogs/market/purchase/rest/v1.0.0/produce/172.16.41.11,172.16.41.12", "");
        addProductLogURL(1, "purchase", "采购管理", "provider", "http://172.16.36.69:8081/logs/market/purchase/provider/v1.0.0/produce/172.16.41.16,172.16.41.18", "http://172.16.36.69:8081/slogs/market/purchase/provider/v1.0.0/produce/172.16.41.16,172.16.41.18", "");
        addProductLogURL(1, "sale", "零售管理", "rest", "http://172.16.36.69:8081/logs/market/sale/rest/v1.0.0/produce/172.16.41.11,172.16.41.12", "http://172.16.36.69:8081/slogs/market/sale/rest/v1.0.0/produce/172.16.41.11,172.16.41.12", "");
        addProductLogURL(1, "sale", "零售管理", "provider", "http://172.16.36.69:8081/logs/market/sale/provider/v1.0.0/produce/172.16.41.16,172.16.41.18", "http://172.16.36.69:8081/slogs/market/sale/provider/v1.0.0/produce/172.16.41.16,172.16.41.18", "");
        addProductLogURL(1, "supplier", "供应商管理", "rest", "http://172.16.36.69:8081/logs/market/supplier/rest/v1.0.0/produce/172.16.41.11,172.16.41.12", "http://172.16.36.69:8081/slogs/market/supplier/rest/v1.0.0/produce/172.16.41.11,172.16.41.12", "");
        addProductLogURL(1, "supplier", "供应商管理", "provider", "http://172.16.36.69:8081/logs/market/supplier/provider/v1.0.0/produce/172.16.41.16,172.16.41.18", "http://172.16.36.69:8081/slogs/market/supplier/provider/v1.0.0/produce/172.16.41.16,172.16.41.18", "");
        addProductLogURL(1, "wholesale", "批发管理", "rest", "", "", "");
        addProductLogURL(1, "wholesale", "批发管理", "provider", "", "", "");
        addProductLogURL(1, "storage", "仓储管理", "rest", "http://172.16.36.69:8081/logs/scm/storage/rest/v1.0.0/40891/8111/produce/172.16.41.11,172.16.41.12", "http://172.16.36.69:8081/slogs/scm/storage/rest/v1.0.0/40891/8111/produce/172.16.41.11,172.16.41.12", "");
        addProductLogURL(1, "storage", "仓储管理", "provider", "http://172.16.36.69:8081/logs/scm/storage/provider/v1.0.0/produce/172.16.41.16,172.16.41.18", "http://172.16.36.69:8081/slogs/scm/storage/provider/v1.0.0/produce/172.16.41.16,172.16.41.18", "");

        //2:宁家
        addProductLogURL(2, "system", "系统管理", "rest", "http://172.16.36.69:8081/logs/vr-wnnj/system/rest/v1.0.0/produce/172.16.51.9,172.16.51.10", "http://172.16.36.69:8081/slogs/vr-wnnj/system/rest/v1.0.0/produce/172.16.51.9,172.16.51.10", "");
        addProductLogURL(2, "system", "系统管理", "provider", "http://172.16.36.69:8081/logs/vr-wnnj/system/provider/v1.0.0/produce/172.16.51.8,172.16.51.11", "http://172.16.36.69:8081/slogs/vr-wnnj/system/provider/v1.0.0/produce/172.16.51.8,172.16.51.11", "");
        addProductLogURL(2, "base", "基础资源", "rest", "http://172.16.36.69:8081/logs/vr-wnnj/base/rest/v1.0.0/produce/172.16.51.9,172.16.51.10", "http://172.16.36.69:8081/slogs/vr-wnnj/base/rest/v1.0.0/produce/172.16.51.9,172.16.51.10", "");
        addProductLogURL(2, "base", "基础资源", "provider", "http://172.16.36.69:8081/logs/vr-wnnj/base/provider/v1.0.0/produce/172.16.51.8,172.16.51.12", "http://172.16.36.69:8081/slogs/vr-wnnj/base/provider/v1.0.0/produce/172.16.51.8,172.16.51.12", "");
        addProductLogURL(2, "contract", "合同管理", "rest", "http://172.16.36.69:8081/logs/vr-wnnj/contract/rest/v1.0.0/produce/172.16.51.9,172.16.51.10", "http://172.16.36.69:8081/slogs/vr-wnnj/contract/rest/v1.0.0/produce/172.16.51.9,172.16.51.10", "");
        addProductLogURL(2, "contract", "合同管理", "provider", "http://172.16.36.69:8081/logs/vr-wnnj/contract/provider/v1.0.0/produce/172.16.51.8,172.16.51.11", "http://172.16.36.69:8081/slogs/vr-wnnj/contract/provider/v1.0.0/produce/172.16.51.8,172.16.51.11", "");
        addProductLogURL(2, "finance", "财务管理", "rest", "http://172.16.36.69:8081/logs/vr-wnnj/finance/rest/v1.0.0/produce/172.16.51.9,172.16.51.10", "http://172.16.36.69:8081/slogs/vr-wnnj/finance/rest/v1.0.0/produce/172.16.51.9,172.16.51.10", "");
        addProductLogURL(2, "finance", "财务管理", "provider", "http://172.16.36.69:8081/logs/vr-wnnj/finance/provider/v1.0.0/produce/172.16.51.8,172.16.51.12", "http://172.16.36.69:8081/slogs/vr-wnnj/finance/provider/v1.0.0/produce/172.16.51.8,172.16.51.12", "");
        addProductLogURL(2, "reportform", "报表管理", "rest", "http://172.16.36.69:8081/logs/vr-wnnj/reportform/rest/v1.0.0/produce/172.16.51.9,172.16.51.10", "http://172.16.36.69:8081/slogs/vr-wnnj/reportform/rest/v1.0.0/produce/172.16.51.9,172.16.51.10", "");
        addProductLogURL(2, "reportform", "报表管理", "provider", "http://172.16.36.69:8081/logs/vr-wnnj/reportform/provider/v1.0.0/produce/172.16.51.8,172.16.51.11", "http://172.16.36.69:8081/slogs/vr-wnnj/reportform/provider/v1.0.0/produce/172.16.51.8,172.16.51.11", "");
        addProductLogURL(2, "goods", "商品管理", "rest", "http://172.16.36.69:8081/logs/vr-wnnj/goods/rest/v1.0.0/produce/172.16.51.9,172.16.51.10", "http://172.16.36.69:8081/slogs/vr-wnnj/goods/rest/v1.0.0/produce/172.16.51.9,172.16.51.10", "");
        addProductLogURL(2, "goods", "商品管理", "provider", "http://172.16.36.69:8081/logs/vr-wnnj/goods/provider/v1.0.0/produce/172.16.51.8,172.16.51.12", "http://172.16.36.69:8081/slogs/vr-wnnj/goods/provider/v1.0.0/produce/172.16.51.8,172.16.51.12", "");
        addProductLogURL(2, "purchase", "采购管理", "rest", "http://172.16.36.69:8081/logs/vr-wnnj/purchase/rest/v1.0.0/produce/172.16.51.9,172.16.51.10", "http://172.16.36.69:8081/slogs/vr-wnnj/purchase/rest/v1.0.0/produce/172.16.51.9,172.16.51.10", "");
        addProductLogURL(2, "purchase", "采购管理", "provider", "http://172.16.36.69:8081/logs/vr-wnnj/purchase/provider/v1.0.0/produce/172.16.51.8,172.16.51.11", "http://172.16.36.69:8081/slogs/vr-wnnj/purchase/provider/v1.0.0/produce/172.16.51.8,172.16.51.11", "");
        addProductLogURL(2, "sale", "零售管理", "rest", "http://172.16.36.69:8081/logs/vr-wnnj/sale/rest/v1.0.0/produce/172.16.51.9,172.16.51.10", "http://172.16.36.69:8081/slogs/vr-wnnj/sale/rest/v1.0.0/produce/172.16.51.9,172.16.51.10", "");
        addProductLogURL(2, "sale", "零售管理", "provider", "http://172.16.36.69:8081/logs/vr-wnnj/sale/provider/v1.0.0/produce/172.16.51.8,172.16.51.12", "http://172.16.36.69:8081/slogs/vr-wnnj/sale/provider/v1.0.0/produce/172.16.51.8,172.16.51.12", "");
        addProductLogURL(2, "supplier", "供应商管理", "rest", "http://172.16.36.69:8081/logs/vr-wnnj/supplier/rest/v1.0.0/produce/172.16.51.9,172.16.51.10", "http://172.16.36.69:8081/slogs/vr-wnnj/supplier/rest/v1.0.0/produce/172.16.51.9,172.16.51.10", "");
        addProductLogURL(2, "supplier", "供应商管理", "provider", "http://172.16.36.69:8081/logs/vr-wnnj/supplier/provider/v1.0.0/produce/172.16.51.8,172.16.51.11", "http://172.16.36.69:8081/slogs/vr-wnnj/supplier/provider/v1.0.0/produce/172.16.51.8,172.16.51.11", "");
        addProductLogURL(2, "kitchen", "后厨管理", "rest", "http://172.16.36.69:8081/logs/vr-wnnj/kitchen/rest/v1.0.0/produce/172.16.51.9,172.16.51.10", "http://172.16.36.69:8081/slogs/vr-wnnj/kitchen/rest/v1.0.0/produce/172.16.51.9,172.16.51.10", "");
        addProductLogURL(2, "kitchen", "后厨管理", "provider", "http://172.16.36.69:8081/logs/vr-wnnj/kitchen/provider/v1.0.0/produce/172.16.51.8,172.16.51.11", "http://172.16.36.69:8081/slogs/vr-wnnj/kitchen/provider/v1.0.0/produce/172.16.51.8,172.16.51.11", "");
        addProductLogURL(2, "market", "市场营销", "rest", "", "", "");
        addProductLogURL(2, "market", "市场营销", "provider", "", "", "");
        addProductLogURL(2, "wholesale", "批发管理", "rest", "http://172.16.36.69:8081/logs/vr-wnnj/wholesale/rest/v1.0.0/produce/172.16.51.9,172.16.51.10", "http://172.16.36.69:8081/slogs/vr-wnnj/wholesale/rest/v1.0.0/produce/172.16.51.9,172.16.51.10", "");
        addProductLogURL(2, "wholesale", "批发管理", "provider", "http://172.16.36.69:8081/logs/vr-wnnj/wholesale/provider/v1.0.0/produce/172.16.51.8,172.16.51.12", "http://172.16.36.69:8081/slogs/vr-wnnj/wholesale/provider/v1.0.0/produce/172.16.51.8,172.16.51.12", "");
        addProductLogURL(2, "storage", "仓储管理", "rest", "http://172.16.36.69:8081/logs/vr-wnnj/storage/rest/v1.0.0/produce/172.16.51.9,172.16.51.10", "http://172.16.36.69:8081/slogs/vr-wnnj/storage/rest/v1.0.0/produce/172.16.51.9,172.16.51.10", "");
        addProductLogURL(2, "storage", "仓储管理", "provider", "http://172.16.36.69:8081/logs/vr-wnnj/storage/provider/v1.0.0/produce/172.16.51.8,172.16.51.12", "http://172.16.36.69:8081/slogs/vr-wnnj/storage/provider/v1.0.0/produce/172.16.51.8,172.16.51.12", "");

        //3:大宗交易
        addProductLogURL(3, "bkcontract", "大宗交易合同管理", "rest", "http://172.16.36.69:8081/logs/vr-bulkstock/contract/rest/v1.0.0/produce/172.16.54.72,172.16.54.73", "http://172.16.36.69:8081/slogs/vr-bulkstock/contract/rest/v1.0.0/produce/172.16.54.72,172.16.54.73", "");
        addProductLogURL(3, "bkcontract", "大宗交易合同管理", "provider", "http://172.16.36.69:8081/logs/vr-bulkstock/contract/provider/v1.0.0/produce/172.16.54.72,172.16.54.73", "http://172.16.36.69:8081/slogs/vr-bulkstock/contract/provider/v1.0.0/produce/172.16.54.72,172.16.54.73", "");
        addProductLogURL(3, "bkfinance", "大宗交易财务管理", "rest", "http://172.16.36.69:8081/logs/vr-bulkstock/finance/rest/v1.0.0/produce/172.16.54.72,172.16.54.73", "http://172.16.36.69:8081/slogs/vr-bulkstock/finance/rest/v1.0.0/produce/172.16.54.72,172.16.54.73", "");
        addProductLogURL(3, "bkfinance", "大宗交易财务管理", "provider", "http://172.16.36.69:8081/logs/vr-bulkstock/finance/provider/v1.0.0/produce/172.16.54.72,172.16.54.73", "http://172.16.36.69:8081/slogs/vr-bulkstock/finance/provider/v1.0.0/produce/172.16.54.72,172.16.54.73", "");
        addProductLogURL(3, "bksale", "大宗交易零售管理", "rest", "http://172.16.36.69:8081/logs/vr-bulkstock/sale/rest/v1.0.0/produce/172.16.54.72,172.16.54.73", "http://172.16.36.69:8081/slogs/vr-bulkstock/sale/rest/v1.0.0/produce/172.16.54.72,172.16.54.73", "");
        addProductLogURL(3, "bksale", "大宗交易零售管理", "provider", "http://172.16.36.69:8081/logs/vr-bulkstock/sale/provider/v1.0.0/produce/172.16.54.72,172.16.54.73", "http://172.16.36.69:8081/slogs/vr-bulkstock/sale/provider/v1.0.0/produce/172.16.54.72,172.16.54.73", "");
        addProductLogURL(3, "bksettlement", "大宗交易结算管理", "rest", "http://172.16.36.69:8081/logs/vr-bulkstock/settlement/rest/v1.0.0/produce/172.16.54.72,172.16.54.73", "http://172.16.36.69:8081/slogs/vr-bulkstock/settlement/rest/v1.0.0/produce/172.16.54.72,172.16.54.73", "");
        addProductLogURL(3, "bksettlement", "大宗交易结算管理", "provider", "http://172.16.36.69:8081/logs/vr-bulkstock/settlement/provider/v1.0.0/produce/172.16.54.72,172.16.54.73", "http://172.16.36.69:8081/slogs/vr-bulkstock/settlement/provider/v1.0.0/produce/172.16.54.72,172.16.54.73", "");
        addProductLogURL(3, "bktender", "大宗交易招投标管理", "rest", "http://172.16.36.69:8081/logs/vr-bulkstock/tender/rest/v1.0.0/produce/172.16.54.72,172.16.54.73", "http://172.16.36.69:8081/slogs/vr-bulkstock/tender/rest/v1.0.0/produce/172.16.54.72,172.16.54.73", "");
        addProductLogURL(3, "bktender", "大宗交易招投标管理", "provider", "http://172.16.36.69:8081/logs/vr-bulkstock/tender/provider/v1.0.0/produce/172.16.54.72,172.16.54.73", "http://172.16.36.69:8081/slogs/vr-bulkstock/tender/provider/v1.0.0/produce/172.16.54.72,172.16.54.73", "");
        addProductLogURL(3, "bktransportmanage", "大宗交易运输管理", "rest", "http://172.16.36.69:8081/logs/vr-bulkstock/transportmanage/rest/v1.0.0/produce/172.16.54.72,172.16.54.73", "http://172.16.36.69:8081/slogs/vr-bulkstock/transportmanage/rest/v1.0.0/produce/172.16.54.72,172.16.54.73", "");
        addProductLogURL(3, "bktransportmanage", "大宗交易运输管理", "provider", "http://172.16.36.69:8081/logs/vr-bulkstock/transportmanage/provider/v1.0.0/produce/172.16.54.72,172.16.54.73", "http://172.16.36.69:8081/slogs/vr-bulkstock/transportmanage/provider/v1.0.0/produce/172.16.54.72,172.16.54.73", "");
        addProductLogURL(3, "bkstorage", "大宗交易仓储管理", "rest", "http://172.16.36.69:8081/logs/vr-bulkstock/storage/rest/v1.0.0/produce/172.16.54.72,172.16.54.73", "http://172.16.36.69:8081/slogs/vr-bulkstock/storage/rest/v1.0.0/produce/172.16.54.72,172.16.54.73", "");
        addProductLogURL(3, "bkstorage", "大宗交易仓储管理", "provider", "http://172.16.36.69:8081/logs/vr-bulkstock/storage/provider/v1.0.0/produce/172.16.54.72,172.16.54.73", "http://172.16.36.69:8081/slogs/vr-bulkstock/storage/provider/v1.0.0/produce/172.16.54.72,172.16.54.73", "");
        addProductLogURL(3, "bkreportform", "大宗交易报表模块", "rest", "http://172.16.36.69:8081/logs/vr-bulkstock/reportform/rest/v1.0.0/produce/172.16.54.72,172.16.54.73", "http://172.16.36.69:8081/slogs/vr-bulkstock/reportform/rest/v1.0.0/produce/172.16.54.72,172.16.54.73", "");
        addProductLogURL(3, "bkreportform", "大宗交易报表模块", "provider", "http://172.16.36.69:8081/logs/vr-bulkstock/reportform/provider/v1.0.0/produce/172.16.54.72,172.16.54.73", "http://172.16.36.69:8081/slogs/vr-bulkstock/reportform/provider/v1.0.0/produce/172.16.54.72,172.16.54.73", "");

        addProductLogURL(3, "system", "系统管理", "rest", "http://172.16.36.69:8081/logs/vr-bulkstock/system/rest/v1.0.0/produce/172.16.53.9,172.16.53.10", "http://172.16.36.69:8081/slogs/vr-bulkstock/system/rest/v1.0.0/produce/172.16.53.9,172.16.53.10", "");
        addProductLogURL(3, "system", "系统管理", "rest", "http://172.16.36.69:8081/logs/vr-bulkstock/system/provider/v1.0.0/produce/172.16.53.9,172.16.53.10", "http://172.16.36.69:8081/slogs/vr-bulkstock/system/provider/v1.0.0/produce/172.16.53.9,172.16.53.10", "");
        addProductLogURL(3, "base", "基础资源", "rest", "http://172.16.36.69:8081/logs/vr-bulkstock/base/rest/v1.0.0/produce/172.16.53.9,172.16.53.10", "http://172.16.36.69:8081/slogs/vr-bulkstock/base/rest/v1.0.0/produce/172.16.53.9,172.16.53.10", "");
        addProductLogURL(3, "base", "基础资源", "provider", "http://172.16.36.69:8081/logs/vr-bulkstock/base/provider/v1.0.0/produce/172.16.53.9,172.16.53.10", "http://172.16.36.69:8081/slogs/vr-bulkstock/base/provider/v1.0.0/produce/172.16.53.9,172.16.53.10", "");
        addProductLogURL(3, "contract", "合同管理", "rest", "http://172.16.36.69:8081/logs/vr-bk-common/contract/rest/v1.0.0/produce/172.16.53.9,172.16.53.10", "http://172.16.36.69:8081/slogs/vr-bk-common/contract/rest/v1.0.0/produce/172.16.53.9,172.16.53.10", "");
        addProductLogURL(3, "contract", "合同管理", "provider", "http://172.16.36.69:8081/logs/vr-bk-common/contract/provider/v1.0.0/produce/172.16.53.9,172.16.53.10", "http://172.16.36.69:8081/slogs/vr-bk-common/contract/provider/v1.0.0/produce/172.16.53.9,172.16.53.10", "");
        addProductLogURL(3, "finance", "财务管理", "rest", "http://172.16.36.69:8081/logs/vr-bk-common/finance/rest/v1.0.0/produce/172.16.53.9,172.16.53.10", "http://172.16.36.69:8081/slogs/vr-bk-common/finance/rest/v1.0.0/produce/172.16.53.9,172.16.53.10", "");
        addProductLogURL(3, "finance", "财务管理", "provider", "http://172.16.36.69:8081/logs/vr-bk-common/finance/provider/v1.0.0/produce/172.16.53.9,172.16.53.10", "http://172.16.36.69:8081/slogs/vr-bk-common/finance/provider/v1.0.0/produce/172.16.53.9,172.16.53.10", "");
        addProductLogURL(3, "goods", "商品管理", "rest", "http://172.16.36.69:8081/logs/vr-bk-common/goods/rest/v1.0.0/produce/172.16.53.9,172.16.53.10", "http://172.16.36.69:8081/slogs/vr-bk-common/goods/rest/v1.0.0/produce/172.16.53.9,172.16.53.10", "");
        addProductLogURL(3, "goods", "商品管理", "provider", "http://172.16.36.69:8081/logs/vr-bk-common/goods/provider/v1.0.0/produce/172.16.53.9,172.16.53.10", "http://172.16.36.69:8081/slogs/vr-bk-common/goods/provider/v1.0.0/produce/172.16.53.9,172.16.53.10", "");
        addProductLogURL(3, "purchase", "采购管理", "rest", "http://172.16.36.69:8081/logs/vr-bk-common/purchase/rest/v1.0.0/produce/172.16.53.9,172.16.53.10", "http://172.16.36.69:8081/slogs/vr-bk-common/purchase/rest/v1.0.0/produce/172.16.53.9,172.16.53.10", "");
        addProductLogURL(3, "purchase", "采购管理", "provider", "http://172.16.36.69:8081/logs/vr-bk-common/purchase/provider/v1.0.0/produce/172.16.53.9,172.16.53.10", "http://172.16.36.69:8081/slogs/vr-bk-common/purchase/provider/v1.0.0/produce/172.16.53.9,172.16.53.10", "");
        addProductLogURL(3, "sale", "零售管理", "rest", "http://172.16.36.69:8081/logs/vr-bk-common/sale/rest/v1.0.0/produce/172.16.53.9,172.16.53.10", "http://172.16.36.69:8081/slogs/vr-bk-common/sale/rest/v1.0.0/produce/172.16.53.9,172.16.53.10", "");
        addProductLogURL(3, "sale", "零售管理", "provider", "http://172.16.36.69:8081/logs/vr-bk-common/sale/provider/v1.0.0/produce/172.16.53.9,172.16.53.10", "http://172.16.36.69:8081/slogs/vr-bk-common/sale/provider/v1.0.0/produce/172.16.53.9,172.16.53.10", "");
        addProductLogURL(3, "supplier", "供应商管理", "rest", "http://172.16.36.69:8081/logs/vr-bk-common/supplier/rest/v1.0.0/produce/172.16.53.9,172.16.53.10", "http://172.16.36.69:8081/slogs/vr-bk-common/supplier/rest/v1.0.0/produce/172.16.53.9,172.16.53.10", "");
        addProductLogURL(3, "supplier", "供应商管理", "provider", "http://172.16.36.69:8081/logs/vr-bk-common/supplier/provider/v1.0.0/produce/172.16.53.9,172.16.53.10", "http://172.16.36.69:8081/slogs/vr-bk-common/supplier/provider/v1.0.0/produce/172.16.53.9,172.16.53.10", "");
        addProductLogURL(3, "storage", "仓储管理", "rest", "http://172.16.36.69:8081/logs/vr-bk-common/storage/rest/v1.0.0/produce/172.16.53.9,172.16.53.10", "http://172.16.36.69:8081/slogs/vr-bk-common/storage/rest/v1.0.0/produce/172.16.53.9,172.16.53.10", "");
        addProductLogURL(3, "storage", "仓储管理", "provider", "http://172.16.36.69:8081/logs/vr-bk-common/storage/provider/v1.0.0/produce/172.16.53.9,172.16.53.10", "http://172.16.36.69:8081/slogs/vr-bk-common/storage/provider/v1.0.0/produce/172.16.53.9,172.16.53.10", "");
        /**********配置生产环境的日志URL (end) **************************************************/

        /**********配置预生产环境的日志URL (begin) **************************************************/
        //1:翌能
        addPreLogURL(1, "system", "系统管理", "rest", "http://172.16.36.69:8081/logs/common/system/rest/v1.0.0/pre/172.16.41.27", "http://172.16.36.69:8081/slogs/common/system/rest/v1.0.0/pre/172.16.41.27", "");
        addPreLogURL(1, "system", "系统管理", "provider", "http://172.16.36.69:8081/logs/common/system/provider/v1.0.0/pre/172.16.41.27", "http://172.16.36.69:8081/slogs/common/system/provider/v1.0.0/pre/172.16.41.27", "");
        addPreLogURL(1, "base", "基础资源", "rest", "http://172.16.36.69:8081/logs/common/base/rest/v1.0.0/pre/172.16.41.27", "http://172.16.36.69:8081/slogs/common/base/rest/v1.0.0/pre/172.16.41.27", "");
        addPreLogURL(1, "base", "基础资源", "provider", "http://172.16.36.69:8081/logs/common/base/provider/v1.0.0/pre/172.16.41.27", "http://172.16.36.69:8081/slogs/common/base/provider/v1.0.0/pre/172.16.41.27", "");
        addPreLogURL(1, "contract", "合同管理", "rest", "http://172.16.36.69:8081/logs/finance/contract/rest/v1.0.0/pre/172.16.41.27", "http://172.16.36.69:8081/slogs/finance/contract/rest/v1.0.0/pre/172.16.41.27", "");
        addPreLogURL(1, "contract", "合同管理", "provider", "http://172.16.36.69:8081/logs/finance/contract/provider/v1.0.0/pre/172.16.41.27", "http://172.16.36.69:8081/slogs/finance/contract/provider/v1.0.0/pre/172.16.41.27", "");
        addPreLogURL(1, "finance", "财务管理", "rest", "http://172.16.36.69:8081/logs/finance/finance/rest/v1.0.0/pre/172.16.41.27", "http://172.16.36.69:8081/slogs/finance/finance/rest/v1.0.0/pre/172.16.41.27", "");
        addPreLogURL(1, "finance", "财务管理", "provider", "http://172.16.36.69:8081/logs/finance/finance/provider/v1.0.0/pre/172.16.41.27", "http://172.16.36.69:8081/slogs/finance/finance/provider/v1.0.0/pre/172.16.41.27", "");
        addPreLogURL(1, "reportform", "报表管理", "rest", "http://172.16.36.69:8081/logs/finance/reportform/rest/v1.0.0/pre/172.16.41.27", "http://172.16.36.69:8081/slogs/finance/reportform/rest/v1.0.0/pre/172.16.41.27", "");
        addPreLogURL(1, "reportform", "报表管理", "provider", "http://172.16.36.69:8081/logs/finance/reportform/provider/v1.0.0/pre/172.16.41.27", "http://172.16.36.69:8081/slogs/finance/reportform/provider/v1.0.0/pre/172.16.41.27", "");
        addPreLogURL(1, "goods", "商品管理", "rest", "http://172.16.36.69:8081/logs/market/goods/rest/v1.0.0/pre/172.16.41.27", "http://172.16.36.69:8081/slogs/market/goods/rest/v1.0.0/pre/172.16.41.27", "");
        addPreLogURL(1, "goods", "商品管理", "provider", "http://172.16.36.69:8081/logs/market/goods/provider/v1.0.0/pre/172.16.41.27", "http://172.16.36.69:8081/slogs/market/goods/provider/v1.0.0/pre/172.16.41.27", "");
        addPreLogURL(1, "purchase", "采购管理", "rest", "http://172.16.36.69:8081/logs/market/purchase/rest/v1.0.0/pre/172.16.41.27", "http://172.16.36.69:8081/slogs/market/purchase/rest/v1.0.0/pre/172.16.41.27", "");
        addPreLogURL(1, "purchase", "采购管理", "provider", "http://172.16.36.69:8081/logs/market/purchase/provider/v1.0.0/pre/172.16.41.27", "http://172.16.36.69:8081/slogs/market/purchase/provider/v1.0.0/pre/172.16.41.27", "");
        addPreLogURL(1, "sale", "零售管理", "rest", "http://172.16.36.69:8081/logs/market/sale/rest/v1.0.0/pre/172.16.41.27", "http://172.16.36.69:8081/slogs/market/sale/rest/v1.0.0/pre/172.16.41.27", "");
        addPreLogURL(1, "sale", "零售管理", "provider", "http://172.16.36.69:8081/logs/market/sale/provider/v1.0.0/pre/172.16.41.27", "http://172.16.36.69:8081/slogs/market/sale/provider/v1.0.0/pre/172.16.41.27", "");
        addPreLogURL(1, "supplier", "供应商管理", "rest", "http://172.16.36.69:8081/logs/market/supplier/rest/v1.0.0/pre/172.16.41.27", "http://172.16.36.69:8081/slogs/market/supplier/rest/v1.0.0/pre/172.16.41.27", "");
        addPreLogURL(1, "supplier", "供应商管理", "provider", "http://172.16.36.69:8081/logs/market/supplier/provider/v1.0.0/pre/172.16.41.27", "http://172.16.36.69:8081/slogs/market/supplier/provider/v1.0.0/pre/172.16.41.27", "");
        addPreLogURL(1, "storage", "仓储管理", "rest", "http://172.16.36.69:8081/logs/scm/storage/rest/v1.0.0/pre/172.16.41.27", "http://172.16.36.69:8081/slogs/scm/storage/rest/v1.0.0/pre/172.16.41.27", "");
        addPreLogURL(1, "storage", "仓储管理", "provider", "http://172.16.36.69:8081/logs/scm/storage/provider/v1.0.0/pre/172.16.41.27", "http://172.16.36.69:8081/slogs/scm/storage/provider/v1.0.0/pre/172.16.41.27", "");
        /**********配置预生产环境的日志URL ( end ) **************************************************/

        /**********配置发布的结果 (begin) **************************************************/
        addOutcomeConfig("startup", true, "web 模块已启动");
        addOutcomeConfig("other", false, "有人在发布这个模块");
        addOutcomeConfig("mvn package_failure", false, "打包发生错误");
        addOutcomeConfig("is error", false, "未知错误");
        addOutcomeConfig("rest started success", true, "rest服务启动正常");
        addOutcomeConfig("docker image", false, "发布过程不稳定，可以再重新试一下");
        addOutcomeConfig("provider started success", true, "provider服务启动正常");
        addOutcomeConfig("ERROR does not started", false, "发布失败了");
        addOutcomeConfig("the python server has error", false, "发布失败了。南宁的发布服务出现问题。");
        /**********配置发布的结果 (end) **************************************************/

        /*********************添加客户端ip地址和对应的开发人员的映射关系 (begin) **********************/
        addIpAndCrewNameMapping("172.19.14.134", "至真", RoleEnum.DEVELOPER);
        addIpAndCrewNameMapping("172.19.14.169", "任亚鹏", RoleEnum.DEVELOPER);
        addIpAndCrewNameMapping("172.19.14.160", "王贤", RoleEnum.DEVELOPER);
        addIpAndCrewNameMapping("172.19.14.154", "刘孝坡", RoleEnum.DEVELOPER);
        addIpAndCrewNameMapping("172.19.14.177", "刘杰", RoleEnum.DEVELOPER);
        addIpAndCrewNameMapping("172.19.14.162", "明庆林", RoleEnum.DEVELOPER);
        addIpAndCrewNameMapping("172.19.14.178", "明初", RoleEnum.DEVELOPER);
        addIpAndCrewNameMapping("172.19.14.218", "子牧", RoleEnum.DEVELOPER);
        addIpAndCrewNameMapping("172.19.14.131", "子善", RoleEnum.DEVELOPER);
        addIpAndCrewNameMapping("172.19.14.181", "彭超伟", RoleEnum.DEVELOPER);
        addIpAndCrewNameMapping("172.19.14.247", "恒砺", RoleEnum.DEVELOPER);
        addIpAndCrewNameMapping("172.19.14.212", "承宇", RoleEnum.DEVELOPER);
        addIpAndCrewNameMapping("172.19.14.164", "元吉", RoleEnum.DEVELOPER);
        addIpAndCrewNameMapping("172.19.14.213", "长风", RoleEnum.DEVELOPER);
        addIpAndCrewNameMapping("172.19.14.248", "谷风", RoleEnum.DEVELOPER);
        addIpAndCrewNameMapping("172.19.14.176", "显文", RoleEnum.DEVELOPER);
        addIpAndCrewNameMapping("172.19.14.186", "酉黍", RoleEnum.DEVELOPER);
        addIpAndCrewNameMapping("172.19.14.149", "本道", RoleEnum.DEVELOPER);
        addIpAndCrewNameMapping("172.19.14.151", "乐道", RoleEnum.DEVELOPER);
        addIpAndCrewNameMapping("172.19.14.173", "怀德", RoleEnum.DEVELOPER);
        addIpAndCrewNameMapping("172.19.14.143", "唯仁", RoleEnum.DEVELOPER);
        addIpAndCrewNameMapping("172.19.14.159", "泊志", RoleEnum.DEVELOPER);
        addIpAndCrewNameMapping("172.19.14.184", "龚海", RoleEnum.DEVELOPER);
        addIpAndCrewNameMapping("172.19.14.163", "无道", RoleEnum.DEVELOPER);
        addIpAndCrewNameMapping("172.19.14.182", "思行", RoleEnum.DEVELOPER);


        addIpAndCrewNameMapping("172.19.14.211", "王志超", RoleEnum.TESTER);
        addIpAndCrewNameMapping("172.19.14.239", "刘海涛", RoleEnum.TESTER);
        addIpAndCrewNameMapping("172.19.14.170", "齐薇薇", RoleEnum.TESTER);
        addIpAndCrewNameMapping("172.19.14.226", "沐风", RoleEnum.TESTER);
        addIpAndCrewNameMapping("172.19.14.130", "学贤", RoleEnum.TESTER);
        addIpAndCrewNameMapping("172.19.14.254", "博君", RoleEnum.TESTER);
        addIpAndCrewNameMapping("172.19.14.211", "王丽华", RoleEnum.TESTER);
        addIpAndCrewNameMapping("172.19.14.157", "郭繁", RoleEnum.TESTER);

        /*********************添加客户端ip地址和对应的开发人员的映射关系 ( end ) **********************/

        /**********配置允许访问此发布申请系统的ip地址 (begin) **************************************************/
        //发布权限配置(应用的发布和数据库脚本的发布)
        addAllowedIpConfig("172.19.14.173", Config.USE_DEPLOY_URL);     //怀德
        addAllowedIpConfig("172.19.14.134", Config.USE_DEPLOY_URL);     //至真
        addAllowedIpConfig("172.19.14.169", Config.USE_DEPLOY_URL);     //任亚鹏
        addAllowedIpConfig("172.19.14.160", Config.USE_DEPLOY_URL);     //王贤
        addAllowedIpConfig("172.19.14.154", Config.USE_DEPLOY_URL);     //刘孝坡
        addAllowedIpConfig("172.19.14.177", Config.USE_DEPLOY_URL);     //刘杰
        addAllowedIpConfig("172.19.14.162", Config.USE_DEPLOY_URL);     //明庆林
        addAllowedIpConfig("172.19.14.178", Config.USE_DEPLOY_URL);     //明初
        addAllowedIpConfig("172.19.14.218", Config.USE_DEPLOY_URL);     //子牧
        addAllowedIpConfig("172.19.14.131", Config.USE_DEPLOY_URL);     //子善
        addAllowedIpConfig("172.19.14.181", Config.USE_DEPLOY_URL);     //彭超伟
        addAllowedIpConfig("172.19.14.247", Config.USE_DEPLOY_URL);     //恒砺
        addAllowedIpConfig("172.19.14.212", Config.USE_DEPLOY_URL);     //承宇
        addAllowedIpConfig("172.19.14.164", Config.USE_DEPLOY_URL);     //元吉
        addAllowedIpConfig("172.19.14.213", Config.USE_DEPLOY_URL);     //长风

        addAllowedIpConfig("172.19.14.248", Config.USE_DEPLOY_URL);     //谷风
        addAllowedIpConfig("172.19.14.176", Config.USE_DEPLOY_URL);     //显文
        addAllowedIpConfig("172.19.14.186", Config.USE_DEPLOY_URL);     //酉黍
        addAllowedIpConfig("172.19.14.149", Config.USE_DEPLOY_URL);     //本道
        addAllowedIpConfig("172.19.14.159", Config.USE_DEPLOY_URL);     //泊志
        addAllowedIpConfig("172.19.14.184", Config.USE_DEPLOY_URL);     //龚海
        addAllowedIpConfig("172.19.14.163", Config.USE_DEPLOY_URL);     //无道
        addAllowedIpConfig("172.19.14.143", Config.USE_DEPLOY_URL);     //唯仁
        addAllowedIpConfig("172.19.14.182", Config.USE_DEPLOY_URL);     //思行

        //显示发布路径的权限配置
        addAllowedIpConfig("172.19.14.173", Config.VIEW_DEPLOY_URL);    //怀德
        addAllowedIpConfig("172.19.14.134", Config.VIEW_DEPLOY_URL);    //至真
        addAllowedIpConfig("172.19.14.157", Config.VIEW_DEPLOY_URL);    //郭繁
        addAllowedIpConfig("172.19.14.169", Config.VIEW_DEPLOY_URL);   //任亚鹏
        addAllowedIpConfig("172.19.14.143", Config.VIEW_DEPLOY_URL);   //唯仁
        addAllowedIpConfig("172.19.14.160", Config.VIEW_DEPLOY_URL);   //王贤
        addAllowedIpConfig("172.19.14.154", Config.VIEW_DEPLOY_URL);   //刘孝坡
        addAllowedIpConfig("172.19.14.177", Config.VIEW_DEPLOY_URL);   //刘杰
        addAllowedIpConfig("172.19.14.162", Config.VIEW_DEPLOY_URL);   //明庆林
        addAllowedIpConfig("172.19.14.178", Config.VIEW_DEPLOY_URL);   //明初
        addAllowedIpConfig("172.19.14.218", Config.VIEW_DEPLOY_URL);   //子牧
        addAllowedIpConfig("172.19.14.131", Config.VIEW_DEPLOY_URL);   //子善
        addAllowedIpConfig("172.19.14.174", Config.VIEW_DEPLOY_URL);   //唐意
        addAllowedIpConfig("172.19.14.212", Config.VIEW_DEPLOY_URL);   //承宇
        addAllowedIpConfig("172.19.14.164", Config.VIEW_DEPLOY_URL);   //元吉
        addAllowedIpConfig("172.19.14.213", Config.VIEW_DEPLOY_URL);   //长风
        addAllowedIpConfig("172.19.14.247", Config.VIEW_DEPLOY_URL);     //恒砺
        addAllowedIpConfig("172.19.14.248", Config.VIEW_DEPLOY_URL);     //谷风
        addAllowedIpConfig("172.19.14.176", Config.VIEW_DEPLOY_URL);     //显文
        addAllowedIpConfig("172.19.14.186", Config.VIEW_DEPLOY_URL);     //酉黍
        addAllowedIpConfig("172.19.14.149", Config.VIEW_DEPLOY_URL);     //本道
        addAllowedIpConfig("172.19.14.159", Config.VIEW_DEPLOY_URL);     //泊志
        addAllowedIpConfig("172.19.14.184", Config.VIEW_DEPLOY_URL);     //龚海
        addAllowedIpConfig("172.19.14.163", Config.VIEW_DEPLOY_URL);     //无道
        addAllowedIpConfig("172.19.14.143", Config.VIEW_DEPLOY_URL);     //唯仁

        //标识已经发布过生产的权限配置
        addAllowedIpConfig("172.19.14.247", Config.MARK_PRODUCT_DEPLOY);    //恒砺
        addAllowedIpConfig("172.19.14.182", Config.MARK_PRODUCT_DEPLOY);    //思行
        addAllowedIpConfig("172.19.14.164", Config.MARK_PRODUCT_DEPLOY);    //元吉
        addAllowedIpConfig("172.19.14.212", Config.MARK_PRODUCT_DEPLOY);    //承宇
        addAllowedIpConfig("172.19.14.218", Config.MARK_PRODUCT_DEPLOY);    //子牧

        //锁定发布申请的权限配置
        addAllowedIpConfig("172.19.14.247", Config.LOCK_DEPLOY_REQUEST);    //恒砺
        addAllowedIpConfig("172.19.14.182", Config.LOCK_DEPLOY_REQUEST);    //思行
        addAllowedIpConfig("172.19.14.164", Config.LOCK_DEPLOY_REQUEST);    //元吉
        addAllowedIpConfig("172.19.14.212", Config.LOCK_DEPLOY_REQUEST);    //承宇
        addAllowedIpConfig("172.19.14.218", Config.LOCK_DEPLOY_REQUEST);    //子牧


        //审核执行应用发布到测试环境的权限配置
        addAllowedIpConfig("172.19.14.151", Config.AUDIT_DEPLOY_REQUEST);           //乐道
        addAllowedIpConfig("172.19.14.239", Config.AUDIT_DEPLOY_REQUEST);           //刘海涛
        addAllowedIpConfig("172.19.14.170", Config.AUDIT_DEPLOY_REQUEST);           //齐薇薇
        addAllowedIpConfig("172.19.14.226", Config.AUDIT_DEPLOY_REQUEST);           //沐风
        addAllowedIpConfig("172.19.14.130", Config.AUDIT_DEPLOY_REQUEST);           //学贤
        addAllowedIpConfig("172.19.14.254", Config.AUDIT_DEPLOY_REQUEST);           //博君
        addAllowedIpConfig("172.19.14.211", Config.AUDIT_DEPLOY_REQUEST);           //王丽华
        addAllowedIpConfig("172.19.14.157", Config.AUDIT_DEPLOY_REQUEST);           //郭繁
        addAllowedIpConfig("172.19.14.182", Config.AUDIT_DEPLOY_REQUEST);       //思行
        /**********配置允许访问此发布申请系统的ip地址 (end) **************************************************/

    }

}