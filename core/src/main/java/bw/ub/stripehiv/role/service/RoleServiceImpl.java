// license-header java merge-point
/**
 * This is only generated once! It will never be overwritten.
 * You can (and have to!) safely modify it by hand.
 * TEMPLATE:    SpringServiceImpl.vsl in andromda-spring cartridge
 * MODEL CLASS: StripeHIV::bw.ub.stripehiv::role::service::RoleService
 * STEREOTYPE:  WebService
 * STEREOTYPE:  Service
 */
package bw.ub.stripehiv.role.service;

import bw.ub.stripehiv.role.Role;
import bw.ub.stripehiv.role.RoleType;
import bw.ub.stripehiv.role.vo.RoleVO;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @see bw.ub.stripehiv.role.service.RoleService
 */
 @Transactional(propagation = Propagation.REQUIRED, readOnly=false)
@Service("roleService")
public class RoleServiceImpl
    extends RoleServiceBase
{

    /**
     * @see bw.ub.stripehiv.role.service.RoleService#saveRole(RoleVO)
     */
    @Override
    protected  RoleVO handleSaveRole(RoleVO roleVO)
        throws Exception
    {
        Role role = getRoleDao().roleVOToEntity(roleVO);
        
        role = getRoleDao().createOrUpdate(role);
        
        return getRoleDao().toRoleVO(role);
    }

    /**
     * @see bw.ub.stripehiv.role.service.RoleService#removeRole(Long)
     */
    @Override
    protected  Boolean handleRemoveRole(Long id)
        throws Exception
    {
        if(id == null) {
        	return false;
        }
        
        getRoleDao().remove(id);
        
        return true;
    }

    /**
     * @see bw.ub.stripehiv.role.service.RoleService#findByCode(String)
     */
    @Override
    protected  RoleVO handleFindByCode(String code)
        throws Exception
    {
        if(StringUtils.isBlank(code)) {
        	return new RoleVO();
        }
        
        
        Role role = getRoleDao().searchUniqueCode(RoleType.fromValue(code));
        return getRoleDao().toRoleVO(role);
    }

    /**
     * @see bw.ub.stripehiv.role.service.RoleService#findById(Long)
     */
    @Override
    protected  RoleVO handleFindById(Long id)
        throws Exception
    {
    	if(id == null) {
    		return new RoleVO();
    	}
    	
    	return getRoleDao().toRoleVO(getRoleDao().load(id));
    	
    }

}