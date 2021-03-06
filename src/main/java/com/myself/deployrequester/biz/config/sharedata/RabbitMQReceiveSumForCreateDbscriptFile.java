package com.myself.deployrequester.biz.config.sharedata;

import com.myself.deployrequester.biz.design.dynamiccomponent.ComponentManager;
import com.myself.deployrequester.util.Log4jUtil;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by QueRenJie on ${date}
 * 接收到的来自各客户端的RibbitMQ消息，在Map中归类汇总。
 * 这是专门用于汇总脚本文件生成这个主题下的回馈消息
 */
public class RabbitMQReceiveSumForCreateDbscriptFile {
    /** 日志 */
    private static final Logger logger = LogManager.getLogger(RabbitMQReceiveSumForCreateDbscriptFile.class);

    /**
     * key:         clientIp
     * value:       消息列表
     * 本工程中监听到来自客户端的rabbitmq消息之后会把消息汇总到这个变量中。
     * 当客户端浏览器轮询到其中有属于发给自己的消息，取出并使用完这些消息之后这个变量中的那些消息必须要删除掉。
     */
    public static Map<String, List<String>> CLIENTIP_MSGLIST_MAPPING = new HashMap<String, List<String>>();

    synchronized public static void add(String clientIp, List<String> messageList) {
        Log4jUtil.info(logger, "向服务器全局变量中写接收到的消息。。。");
        synchronized (CLIENTIP_MSGLIST_MAPPING) {
            List<String> originalMessageList = CLIENTIP_MSGLIST_MAPPING.get(clientIp);
            if (originalMessageList == null || originalMessageList.size() == 0) {
                CLIENTIP_MSGLIST_MAPPING.put(clientIp, messageList);
            } else {
                if (messageList != null) {
                    List<String> newMessageList = originalMessageList;
                    for (String message : messageList) {
                        newMessageList.add(message);
                    }
                    CLIENTIP_MSGLIST_MAPPING.put(clientIp, newMessageList);
                }
            }
            List<String> nowMsgList = CLIENTIP_MSGLIST_MAPPING.get(clientIp);
            int size = 0;
            if (nowMsgList != null) {
                size = nowMsgList.size();
            }
            Log4jUtil.info(logger, "接收了来自" + clientIp + "的消息，目前该IP下的消息有 " + size + " 条");
        }
    }

    /**
     * 读取消息列表也要保证在没有其他线程操作CLIENTIP_MSGLIST_MAPPING时再读取，否则读取可能会不准确。
     * @param clientIp
     * @return
     */
    public static List<String> read(String clientIp) {
        return CLIENTIP_MSGLIST_MAPPING.get(clientIp);
    }

    /**
     * 删除CLIENTIP_MSGLIST_MAPPING中的和clientIp有关的消息列表中的前deleteCount条消息。
     * @param clientIp
     * @param deleteCount
     */
    synchronized public static void delete(String clientIp, int deleteCount) {
        synchronized (CLIENTIP_MSGLIST_MAPPING) {
            List<String> originalMessageList = CLIENTIP_MSGLIST_MAPPING.get(clientIp);
            if (originalMessageList != null && originalMessageList.size() > 0) {
                if (originalMessageList.size() <= deleteCount) {
                    CLIENTIP_MSGLIST_MAPPING.put(clientIp, null);
                } else {
                    List<String> newMessageList = new ArrayList<String>();
                    for (int i = deleteCount; i < originalMessageList.size(); i++) {
                        newMessageList.add(originalMessageList.get(i));
                    }
                    CLIENTIP_MSGLIST_MAPPING.put(clientIp, newMessageList);
                }
            }
        }
    }
}
