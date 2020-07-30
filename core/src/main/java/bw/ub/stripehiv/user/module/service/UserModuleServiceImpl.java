// license-header java merge-point
/**
 * This is only generated once! It will never be overwritten.
 * You can (and have to!) safely modify it by hand.
 * TEMPLATE:    SpringServiceImpl.vsl in andromda-spring cartridge
 * MODEL CLASS: NewModel::bw.ub.stripehiv::user::module::service::UserModuleService
 * STEREOTYPE:  WebService
 * STEREOTYPE:  Service
 */
package bw.ub.stripehiv.user.module.service;

import bw.ub.stripehiv.user.module.UserModule;
import bw.ub.stripehiv.user.module.vo.UserModuleVO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @see bw.ub.stripehiv.user.module.service.UserModuleService
 */
 @Transactional(propagation = Propagation.REQUIRED, readOnly=false)
@Service("userModuleService")
public class UserModuleServiceImpl
    extends UserModuleServiceBase
{

    /**
     * @see bw.ub.stripehiv.user.module.service.UserModuleService#saveUserModule(UserModuleVO)
     */
    @Override
    protected  UserModuleVO handleSaveUserModule(UserModuleVO userModuleVO)
        throws Exception
    {
    	UserModule module = getUserModuleDao().userModuleVOToEntity(userModuleVO);
    	
    	if(userModuleVO.getId() == null) {
    		module = getUserModuleDao().create(module);
    	} else {
    		getUserModuleDao().update(module);
    	}
    	
    	return getUserModuleDao().toUserModuleVO(module);
    }

    /**
     * @see bw.ub.stripehiv.user.module.service.UserModuleService#removeUserModule(Long)
     */
    @Override
    protected  Boolean handleRemoveUserModule(Long id)
        throws Exception
    {
    	if(id == null || id == 0) {
    		return false;
    	}
    	
    	getUserModuleDao().remove(id);
    	
    	return true;
    }

}