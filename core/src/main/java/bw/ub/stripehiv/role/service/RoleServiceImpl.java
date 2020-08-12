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

import bw.ub.stripehiv.role.vo.RoleVO;
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
        // TODO implement protected  RoleVO handleSaveRole(RoleVO roleVO)
        throw new UnsupportedOperationException("bw.ub.stripehiv.role.service.RoleService.handleSaveRole(RoleVO roleVO) Not implemented!");
    }

    /**
     * @see bw.ub.stripehiv.role.service.RoleService#removeRole(Long)
     */
    @Override
    protected  Boolean handleRemoveRole(Long id)
        throws Exception
    {
        // TODO implement protected  Boolean handleRemoveRole(Long id)
        throw new UnsupportedOperationException("bw.ub.stripehiv.role.service.RoleService.handleRemoveRole(Long id) Not implemented!");
    }

    /**
     * @see bw.ub.stripehiv.role.service.RoleService#findByCode(String)
     */
    @Override
    protected  RoleVO handleFindByCode(String code)
        throws Exception
    {
        // TODO implement protected  RoleVO handleFindByCode(String code)
        throw new UnsupportedOperationException("bw.ub.stripehiv.role.service.RoleService.handleFindByCode(String code) Not implemented!");
    }

    /**
     * @see bw.ub.stripehiv.role.service.RoleService#findById(Long)
     */
    @Override
    protected  RoleVO handleFindById(Long id)
        throws Exception
    {
        // TODO implement protected  RoleVO handleFindById(Long id)
        throw new UnsupportedOperationException("bw.ub.stripehiv.role.service.RoleService.handleFindById(Long id) Not implemented!");
    }

}