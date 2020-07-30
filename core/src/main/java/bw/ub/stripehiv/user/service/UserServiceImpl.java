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

import bw.ub.stripehiv.user.User;
import bw.ub.stripehiv.user.vo.UserSearchCriteria;
import bw.ub.stripehiv.user.vo.UserVO;

import java.util.Collection;

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
    	User user = getUserDao().userVOToEntity(userVO);
    	
    	if(user.getId() == null ) {
    		user = getUserDao().create(user);
    	} else {
    		getUserDao().update(user);
    	}
    	
    	return getUserDao().toUserVO(user);
    	
    }

    /**
     * @see bw.ub.stripehiv.user.service.UserService#removeUser(Long)
     */
    @Override
    protected  Boolean handleRemoveUser(Long id)
        throws Exception
    {
    	if(id == null || id == 0) {
    		return false;
    	}
    	
    	getUserDao().remove(id);
    	
    	return true;
    }

    /**
     * @see bw.ub.stripehiv.user.service.UserService#searchUsers(UserSearchCriteria)
     */
    @Override
    protected Collection<UserVO> handleSearchUsers(UserSearchCriteria searchCriteria)
        throws Exception
    {
    	Collection<User> entities = getUserDao().findByCriteria(searchCriteria);
    	
    	return getUserDao().toUserVOCollection(entities);
    	
    }

	@Override
	protected UserVO handleFindByUsername(String username) throws Exception {
		return getUserDao().toUserVO(getUserDao().searchUniqueUsername(username));
	}

}