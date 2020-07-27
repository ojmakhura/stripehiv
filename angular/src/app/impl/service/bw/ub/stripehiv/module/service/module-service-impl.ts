
import { Injectable, Injector } from '@angular/core';
import { HttpClient} from '@angular/common/http';
import { Observable } from 'rxjs';
import { ModuleService } from 'src/app/gen/service/bw/ub/stripehiv/module/service/module-service';
import { ModuleVO } from 'src/app/gen/model/bw/ub/stripehiv/module/vo/module-vo';
import { ModuleSearchCriteria } from 'src/app/gen/model/bw/ub/stripehiv/module/vo/module-search-criteria';

@Injectable()
export class ModuleServiceImpl extends ModuleService {

    constructor(private injector: Injector) {
        super(injector);
    }

    public saveModule(moduleVO: ModuleVO): Observable<ModuleVO> {
        return this.http.post<ModuleVO>(this.path + '/savemodule/moduleVO/', moduleVO);
    }

    public removeModule(id: number): Observable<boolean> {
        return this.http.delete<boolean>(this.path + '/removemodule/id/' + id);
    }

    public searchModules(searchCriteria: ModuleSearchCriteria): Observable<ModuleVO[]> {
        return this.http.post<ModuleVO[]>(this.path + '/search', searchCriteria);
    }

}