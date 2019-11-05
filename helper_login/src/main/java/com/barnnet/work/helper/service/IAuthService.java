package com.barnnet.work.helper.service;

import com.barnnet.work.helper.bean.reponse.ResponseVo;
import com.barnnet.work.helper.bean.request.LoginInfo;

/**
 * @author barnnet
 * @date 2019/9/28
 */
public interface IAuthService {

    public ResponseVo selectByPhone(LoginInfo loginInfo);


}
