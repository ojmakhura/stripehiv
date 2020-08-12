
import { Injectable, Injector } from '@angular/core';
import { HttpClient} from '@angular/common/http';
import { Observable } from 'rxjs';
import { RoleService } from 'src/app/gen/service/bw/ub/stripehiv/role/service/role-service';
import { RoleVO } from 'src/app/gen/model/bw/ub/stripehiv/role/vo/role-vo';

@Injectable()
export class RoleServiceImpl extends RoleService {

    constructor(private injector: Injector) {
        super(injector);
    }

    public saveRole(roleVO: RoleVO): Observable<RoleVO> {
        return this.http.post<RoleVO>(this.path + '/save', roleVO);
    }

    public removeRole(id: number): Observable<boolean> {
        return this.http.delete<boolean>(this.path + '/delete/' + id);
    }

    public findByCode(code: string): Observable<RoleVO> {
        return this.http.get<RoleVO>(this.path + '/find' + code);
    }

    public findById(id: number): Observable<RoleVO> {
        return this.http.get<RoleVO>(this.path + '/find/id/' + id);
    }

}