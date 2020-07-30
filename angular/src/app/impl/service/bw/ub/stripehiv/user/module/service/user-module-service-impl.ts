
import { Injectable, Injector } from '@angular/core';
import { HttpClient} from '@angular/common/http';
import { Observable } from 'rxjs';
import { UserModuleService } from 'src/app/gen/service/bw/ub/stripehiv/user/module/service/user-module-service';
import { UserModuleVO } from 'src/app/gen/model/bw/ub/stripehiv/user/module/vo/user-module-vo';

@Injectable()
export class UserModuleServiceImpl extends UserModuleService {

    constructor(private injector: Injector) {
        super(injector);
    }

    public saveUserModule(userModuleVO: UserModuleVO): Observable<UserModuleVO> {
        return this.http.post<UserModuleVO>(this.path + '/saveusermodule/userModuleVO/', userModuleVO);
    }

    public removeUserModule(id: number): Observable<boolean> {
        return this.http.delete<boolean>(this.path + '/removeusermodule/id/' + id);
    }

}