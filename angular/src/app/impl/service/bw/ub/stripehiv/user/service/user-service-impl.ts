
import { Injectable, Injector } from '@angular/core';
import { HttpClient} from '@angular/common/http';
import { Observable } from 'rxjs';
import { UserService } from 'src/app/gen/service/bw/ub/stripehiv/user/service/user-service';
import { UserVO } from 'src/app/gen/model/bw/ub/stripehiv/user/vo/user-vo';
import { UserSearchCriteria } from 'src/app/gen/model/bw/ub/stripehiv/user/vo/user-search-criteria';

@Injectable()
export class UserServiceImpl extends UserService {

    constructor(private injector: Injector) {
        super(injector);
    }

    public saveUser(userVO: UserVO): Observable<UserVO> {
        return this.http.post<UserVO>(this.path + '/saveuser/userVO/', userVO);
    }

    public removeUser(id: number): Observable<boolean> {
        return this.http.delete<boolean>(this.path + '/removeuser/id/' + id);
    }

    public searchUsers(searchCriteria: UserSearchCriteria): Observable<UserVO> {
        return this.http.post<UserVO>(this.path + '/search', searchCriteria);
    }

}