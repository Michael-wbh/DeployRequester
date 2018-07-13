package com.myself.deployrequester.controller;

import com.myself.deployrequester.biz.config.sharedata.SessionData;
import com.myself.deployrequester.bo.*;
import com.myself.deployrequester.dto.DeployRequesterDTO;
import com.myself.deployrequester.model.DeployRequesterDO;
import com.myself.deployrequester.service.CommonDataService;
import com.myself.deployrequester.service.DeployRequesterService;
import com.myself.deployrequester.util.json.JsonResult;
import com.myself.deployrequester.util.reflect.BeanUtils;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

/**
 * Created by QueRenJie on ${date}
 */
@Controller
@RequestMapping("depreq")
public class DeployRequesterController {
    @Autowired
    private DeployRequesterService deployRequesterService;
    @Autowired
    private CommonDataService commonDataService;

    @RequestMapping("/deploy_request")
    public String gotoRequestForm() {
        return "deploy_request";
    }

    @RequestMapping("/deploy_request_lock")
    public String gotoRequestLockForm() {
        return "deploy_request_lock";
    }

    @ResponseBody
    @RequestMapping(value="/addDeployRequest", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
    public JsonResult addDeployRequest(@RequestBody DeployRequesterDTO deployRequesterDTO, HttpSession session) {
        JsonResult result = null;
        DeployRequesterDO deployRequesterDO = new DeployRequesterDO();
        BeanUtils.copyProperties(deployRequesterDTO, deployRequesterDO, true);
        try {
            int successCount = deployRequesterService.insertDeployRequester(deployRequesterDO);
            if (successCount == 1) {
                String projectCode = String.valueOf(deployRequesterDO.getProjectcode());
                Short moduleId = deployRequesterDO.getModulecode();
                Short moduleTypeId = deployRequesterDO.getModuletypecode();
                String moduleCode = commonDataService.getModuleCodeById(moduleId);
                String moduleType = commonDataService.getModuleTypeNameById(moduleTypeId);
                UrlSummary urlSummary = commonDataService.getUrlSummary(projectCode, moduleCode, moduleType);
                session.setAttribute(SessionData.KEY_DEPLOY_REQUEST_ID, deployRequesterDO.getDeployrequestid());
                session.setAttribute(SessionData.KEY_MODULE_CODE, moduleCode);
                session.setAttribute(SessionData.KEY_MODULE_TYPE, moduleType);
                session.setAttribute(SessionData.KEY_TEST_DEPLOY_URL, urlSummary.getTestDeployUrl());
                session.setAttribute(SessionData.KEY_PRODUCT_DEPLOY_URL, urlSummary.getProductDeployUrl());
                session.setAttribute(SessionData.KEY_DEPLOY_REQUEST, deployRequesterDO);

                result = JsonResult.createSuccess("insert data successfully");
                result.addData(deployRequesterDO.getDeployrequestid());     //记录的id返回给前端
            }
        } catch (Exception e) {
            result = JsonResult.createFailed("提交发布申请异常:" + e.getStackTrace().toString());
        }
        return  result;
    }

    @ResponseBody
    @RequestMapping(value="/lockDeployRequest", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
    public JsonResult lockDeployRequest(@RequestBody DeployRequesterDTO deployRequesterDTO) {
        JsonResult result = null;
        DeployRequesterDO deployRequesterDO = new DeployRequesterDO();
        BeanUtils.copyProperties(deployRequesterDTO, deployRequesterDO, true);
        Short projectId = deployRequesterDO.getProjectcode();
        Short moduleId = deployRequesterDO.getModulecode();
        Short moduleTypeId = deployRequesterDO.getModuletypecode();
        deployRequesterService.lockDeployRequest(projectId, moduleId, moduleTypeId);

        result = JsonResult.createSuccess("ok");
        return result;
    }

    /**
     * 一键解锁
     * @param unlockedDeployRequestStr
     * @return
     */
    @ResponseBody
    @RequestMapping(value="/OneKeyunlockDeployRequest", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
    public JsonResult OneKeyunlockDeployRequest(@RequestBody String unlockedDeployRequestStr) {
        JsonResult result = null;
        if (StringUtils.isBlank(unlockedDeployRequestStr)) {
            result = JsonResult.createFailed("failed");
            result.addData("未选择记录，进程终止。");
            return result;
        }
        String[] unlockedDeployRequestArr = unlockedDeployRequestStr.split(",");
        if (unlockedDeployRequestArr !=null && unlockedDeployRequestArr.length >0){
            for (String unlockedDeploy :unlockedDeployRequestArr ){
                String [] unlockedDeployProject =unlockedDeploy.split("-");
                if (unlockedDeployProject !=null && unlockedDeployProject.length >0){
                    Short projectId =Short.valueOf(unlockedDeployProject[0]);
                    Short moduleId =Short.valueOf(unlockedDeployProject[1]);
                    Short moduleTypeId =Short.valueOf(unlockedDeployProject[2]);
                    deployRequesterService.unlockDeployRequest(projectId, moduleId, moduleTypeId);
                }
            }
        }
        result = JsonResult.createSuccess("ok");
        return result;
    }

    @ResponseBody
    @RequestMapping(value="/unlockDeployRequest", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
    public JsonResult unlockDeployRequest(@RequestBody DeployRequesterDTO deployRequesterDTO) {
        JsonResult result = null;
        DeployRequesterDO deployRequesterDO = new DeployRequesterDO();
        BeanUtils.copyProperties(deployRequesterDTO, deployRequesterDO, true);
        Short projectId = deployRequesterDO.getProjectcode();
        Short moduleId = deployRequesterDO.getModulecode();
        Short moduleTypeId = deployRequesterDO.getModuletypecode();
        deployRequesterService.unlockDeployRequest(projectId, moduleId, moduleTypeId);

        result = JsonResult.createSuccess("ok");
        return result;
    }

}
