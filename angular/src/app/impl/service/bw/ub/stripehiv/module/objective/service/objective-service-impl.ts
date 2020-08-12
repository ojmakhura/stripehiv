
import { Injectable, Injector } from '@angular/core';
import { HttpClient} from '@angular/common/http';
import { Observable } from 'rxjs';
import { ObjectiveService } from 'src/app/gen/service/bw/ub/stripehiv/module/objective/service/objective-service';
import { ObjectiveVO } from 'src/app/gen/model/bw/ub/stripehiv/module/objective/vo/objective-vo';

@Injectable()
export class ObjectiveServiceImpl extends ObjectiveService {

    constructor(private injector: Injector) {
        super(injector);
    }

    public saveObjective(objectiveVO: ObjectiveVO): Observable<ObjectiveVO> {
        return this.http.post<ObjectiveVO>(this.path + '/saveobjective/objectiveVO/', objectiveVO);
    }

    public removeObjective(id: number): Observable<boolean> {
        return this.http.delete<boolean>(this.path + '/removeobjective/id/' + id);
    }

    public findById(id: number): Observable<ObjectiveVO> {
        return this.http.get<ObjectiveVO>(this.path + '/findbyid/id/' + id);
    }

}