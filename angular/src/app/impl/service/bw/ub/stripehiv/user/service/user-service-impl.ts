
import { Injectable, Injector } from '@angular/core';
import { HttpClient} from '@angular/common/http';
import { Observable } from 'rxjs';
import { UserService } from 'src/app/gen/service/bw/ub/stripehiv/user/service/user-service';
import { UserSearchCriteria } from 'src/app/gen/model/bw/ub/stripehiv/user/vo/user-search-criteria';
import { UserVO } from 'src/app/gen/model/bw/ub/stripehiv/user/vo/user-vo';

@Injectable()
export class UserServiceImpl extends UserService {

    constructor(private injector: Injector) {
        super(injector);
    }

    public saveUser(userVO: UserVO): Observable<UserVO> {
        return this.http.post<UserVO>(this.path + '/saveuser/', userVO);
    }

    public removeUser(id: number): Observable<boolean> {
        return this.http.delete<boolean>(this.path + '/removeuser/id/' + id);
    }

    public searchUsers(searchCriteria: UserSearchCriteria): Observable<UserVO[]> {
        return this.http.post<UserVO[]>(this.path + '/search', searchCriteria);
    }

    public findByUsername(username: string): Observable<UserVO> {
        return this.http.post<UserVO>(this.path + '/search', username);
    }

    public findById(id: number): Observable<UserVO> {
        return this.http.get<UserVO>(this.path + '/findbyid/id/' + id);
    }

}