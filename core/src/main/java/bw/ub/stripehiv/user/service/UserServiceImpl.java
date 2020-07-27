// license-header java merge-point
/**
 * This is only generated once! It will never be overwritten.
 * You can (and have to!) safely modify it by hand.
 * TEMPLATE:    SpringServiceImpl.vsl in andromda-spring cartridge
 * MODEL CLASS: NewModel::bw.ub.stripehiv::user::service::UserService
 * STEREOTYPE:  Service
 * STEREOTYPE:  WebService
 */
package bw.ub.stripehiv.user.service;

import bw.ub.stripehiv.user.vo.UserSearchCriteria;
import bw.ub.stripehiv.user.vo.UserVO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @see bw.ub.stripehiv.user.service.UserService
 */
 @Transactional(propagation = Propagation.REQUIRED, readOnly=false)
@Service("userService")
public class UserServiceImpl
    extends UserServiceBase
{

    /**
     * @see bw.ub.stripehiv.user.service.UserService#saveUser(UserVO)
     */
    @Override
    protected  UserVO handleSaveUser(UserVO userVO)
        throws Exception
    {
        // TODO implement protected  UserVO handleSaveUser(UserVO userVO)
        throw new UnsupportedOperationException("bw.ub.stripehiv.user.service.UserService.handleSaveUser(UserVO userVO) Not implemented!");
    }

    /**
     * @see bw.ub.stripehiv.user.service.UserService#removeUser(Long)
     */
    @Override
    protected  Boolean handleRemoveUser(Long id)
        throws Exception
    {
        // TODO implement protected  Boolean handleRemoveUser(Long id)
        throw new UnsupportedOperationException("bw.ub.stripehiv.user.service.UserService.handleRemoveUser(Long id) Not implemented!");
    }

    /**
     * @see bw.ub.stripehiv.user.service.UserService#searchUsers(UserSearchCriteria)
     */
    @Override
    protected  UserVO handleSearchUsers(UserSearchCriteria searchCriteria)
        throws Exception
    {
        // TODO implement protected  UserVO handleSearchUsers(UserSearchCriteria searchCriteria)
        throw new UnsupportedOperationException("bw.ub.stripehiv.user.service.UserService.handleSearchUsers(UserSearchCriteria searchCriteria) Not implemented!");
    }

}