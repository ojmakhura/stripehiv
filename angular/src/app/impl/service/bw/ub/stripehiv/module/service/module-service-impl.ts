
import { Injectable, Injector } from '@angular/core';
import { HttpClient} from '@angular/common/http';
import { Observable } from 'rxjs';
import { ModuleService } from 'src/app/gen/service/bw/ub/stripehiv/module/service/module-service';
import { ModuleSearchCriteria } from 'src/app/gen/model/bw/ub/stripehiv/module/vo/module-search-criteria';
import { ModuleVO } from 'src/app/gen/model/bw/ub/stripehiv/module/vo/module-vo';

@Injectable()
export class ModuleServiceImpl extends ModuleService {

    constructor(private injector: Injector) {
        super(injector);
    }

    public saveModule(moduleVO: ModuleVO): Observable<ModuleVO> {
        return this.http.post<ModuleVO>(this.path + '/save', moduleVO);
    }

    public removeModule(id: number): Observable<boolean> {
        return this.http.delete<boolean>(this.path + '/delete' + id);
    }

    public searchModules(searchCriteria: ModuleSearchCriteria): Observable<ModuleVO[]> {
        return this.http.post<ModuleVO[]>(this.path + '/search', searchCriteria);
    }

    public findById(id: number): Observable<ModuleVO> {
        return this.http.get<ModuleVO>(this.path + '/find' + id);
    }

    public getAllModules(): Observable<ModuleVO[]> {
        return this.http.get<ModuleVO[]>(this.path + '/all');
    }

}