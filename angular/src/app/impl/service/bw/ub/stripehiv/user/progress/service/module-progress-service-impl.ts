
import { Injectable, Injector } from '@angular/core';
import { HttpClient} from '@angular/common/http';
import { Observable } from 'rxjs';
import { ModuleProgressService } from 'src/app/gen/service/bw/ub/stripehiv/user/progress/service/module-progress-service';
import { ModuleProgressVO } from 'src/app/gen/model/bw/ub/stripehiv/user/progress/vo/module-progress-vo';

@Injectable()
export class ModuleProgressServiceImpl extends ModuleProgressService {

    constructor(private injector: Injector) {
        super(injector);
    }

    public saveModuleProgress(moduleProgressVO: ModuleProgressVO): Observable<ModuleProgressVO> {
        return this.http.post<ModuleProgressVO>(this.path + '/savemoduleprogress/moduleProgressVO/', moduleProgressVO);
    }

    public removeModuleProgress(id: number): Observable<boolean> {
        return this.http.delete<boolean>(this.path + '/removemoduleprogress/id/' + id);
    }

}